package com.example.demo.DTO;

import lombok.Builder;
import java.util.*;
import java.time.LocalDate;

@Builder
public record UserDto (
    String username,
    List<RoleDto> roles,
    String firstName,
    String lastName,
    String emailAddress) {}
