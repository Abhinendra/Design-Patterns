package com.abhinendra.facetedBuilder;

public class PersonJobBuilder extends PersonBuilder {
        public PersonJobBuilder(Person person){
            this.person=person;
        }

        public PersonJobBuilder worksAt(String companyName){
            person.setCompanyName(companyName);
            return this;
        }

        public PersonJobBuilder position(String position){
            person.setPosition(position);
            return this;
        }

        public PersonJobBuilder annualIncome(int income){
            person.setAnnualIncome(income);
            return this;
        }
}
