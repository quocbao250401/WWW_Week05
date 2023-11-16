const SKILL_LEVEL = [
    "MASTER",
    "BEGINNER",
    "ADVANCED",
    "PROFESSIONAL",
    "INTERMEDIATE"
]

async function fetchData(url){
    try {
        const response = await fetch(url);
        const data = await response.json();
        return data;
    }
    catch (error){
        console.error(error)
    }
}


async function addSkill(){
    const allDivSkill = document.querySelectorAll("[id^='divSkill']")
    const divSkillCount = allDivSkill.length
    const skills = await fetchData("http://localhost:8080/api/v1/skills")
    const htmlSkill = `
                <div class="form-inline pb-2 border-bottom border-4" id="divSkill${divSkillCount}">
                    <input type="hidden" name="skillId" value="0"/>
                    <div class="row">
                        <div class="col-md-6">
                            <label>Skill level:</label>
                            <select class="form-select" name="skills">
                               ${skills.map(item => {
                                    return `<option value="${item.id}">${item.skillName}</option>`
                                }).join("")}
                            </select>
                        </div>
                        <div class="col-md-6">
                            <label>Skill level:</label>
                            <select class="form-select" name="skillLevel">
                               ${SKILL_LEVEL.map(item => {
                                    return `<option value="${item}">${item.toLowerCase()}</option>`
                                }).join("")}
                            </select>
                        </div>
                    </div>
                </div>
    `

    document.querySelector('#skillContainer').insertAdjacentHTML("beforeend", htmlSkill);
}