package com.example.week05.services;

import com.example.week05.repositories.AddressRepository;
import com.example.week05.repositories.CompanyRepository;
import com.neovisionaries.i18n.CountryCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.week05.dtos.CompanyDto;
import com.example.week05.models.Address;
import com.example.week05.models.Company;

import java.util.List;
import java.util.Optional;

@Service
public class CompanyService {
    @Autowired
    private CompanyRepository companyRepository;
    @Autowired
    private AddressRepository addressRepository;

    public Company createCompany(CompanyDto companyDto){
        Address address = new Address(companyDto.getCompanyZipcode(), companyDto.getCompanyStreet(), companyDto.getCompanyAddressNumber(), companyDto.getCompanyCity(), CountryCode.getByCode(companyDto.getCompanyCountry()));
        addressRepository.save(address);
        Company company = new Company(companyDto.getCompanyName(), companyDto.getCompanyAbout(), address, companyDto.getCompanyPhone(), companyDto.getCompanyWebUrl(), companyDto.getCompanyEmail());
        return companyRepository.save(company);
    }

    public List<Company>findAll(){
        return companyRepository.findAll();
    }

    public Optional<Company> findById(long id){
        return companyRepository.findById(id);
    }

    public Company updateCompany(Company company){
        return companyRepository.save(company);
    }
}
