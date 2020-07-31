package com.example.android.miwok;

public class ReportCard {
    private char englishGrade;
    private char mathGrade;
    private String name;

    public ReportCard(String name, char mathGrade, char englishGrade){
        mathGrade = mathGrade;
        englishGrade = englishGrade;
        name = name;
    }

    public char getEnglishGrade(){
        return englishGrade;
    }

    public void setEnglishGrade(char grade){
        englishGrade = grade;
    }

    public char getMathGrade() {
        return mathGrade;
    }

    public void setMathGrade(char grade) {
        this.mathGrade = grade;
    }

    @Override
    public String toString(){
        return "Name: "+ name+" English Grade: "+englishGrade+" Math Grade: "+mathGrade;
    }
}
