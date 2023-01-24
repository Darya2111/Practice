package demo.qa.Pages;

import static com.codeborne.selenide.Selenide.$;

public class DateComponent {
    public void setDate(String year, String month, String day){
        $(".react-datepicker__year-select").selectOption(year);
        $(".react-datepicker__month-select").selectOption(month);
        $(".react-datepicker__day--0"+ day).click();
    }
}
