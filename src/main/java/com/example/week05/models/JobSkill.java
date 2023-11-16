package com.example.week05.models;

import jakarta.persistence.*;
import lombok.*;
import com.example.week05.enums.SkillLevel;
import com.example.week05.ids.JobSkillId;

@Entity
@Table(name = "job_skill")
@NoArgsConstructor
@AllArgsConstructor
@IdClass(JobSkillId.class)
@Getter
@Setter
@EqualsAndHashCode(exclude = {"job", "skill"})
@ToString
public class JobSkill {
    @Id
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "job_id")
    private Job job;
    @Id
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "skill_id")
    private Skill skill;
    @Column(name = "more_info", length = 1000, nullable = false)
    private String moreInfo;
    @Column(name = "skill_level")
    private SkillLevel skillLevel;

    @Override
    public String toString() {
        return "JobSkill{" +
                "job=" + job.getId() +
                ", skill=" + skill.getId() +
                ", moreInfo='" + moreInfo + '\'' +
                ", skillLevel=" + skillLevel +
                '}';
    }
}
