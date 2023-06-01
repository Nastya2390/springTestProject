package org.example.web.dto;

import javax.validation.constraints.NotEmpty;

public class RegexToRemoveBook {

    @NotEmpty
    private String queryRegex;

    public String getQueryRegex() {
        return queryRegex;
    }

    public void setQueryRegex(String queryRegex) {
        this.queryRegex = queryRegex;
    }
}
