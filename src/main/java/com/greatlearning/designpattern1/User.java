package com.greatlearning.designpattern1;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
@Builder
class User {
    private int userId;
    private String firstName;
    private String lastName;
    private String email;
}
