package com.bridgelabz.statecensusanalyser;

class StateCensusData {
    private String stateCode;
    private String districtCode;
    private String subDistrictCode;
    private String isuds;
    private String name;
    private String totalRuralUrban;
    private String Inhabited;
    private String Uninhabited;
    private String Numberoftowns;
    private String Numberofhouseholds;
    private String Persons;
    private String Males;
    private String Females;
    private String Area;
    private String Population;

    public StateCensusData(String state) {
        this.state = state;
    }

    // getter and setter methods

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}