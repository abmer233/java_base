package com.lxyedu.encap.enum_;

public enum Week {
    MONDAY("星期一"),TUESDAY("星期二"),WEDNESDAY("星期三"),THURDAY("星期四"),FRIDAY("星期五"),SATURDAY("星期六"),SUNDAY("星期日");
    private String weekday;

    Week(String weekday) {
        this.weekday = weekday;
    }

    @Override
    public String toString() {
        return weekday;

    }
}
