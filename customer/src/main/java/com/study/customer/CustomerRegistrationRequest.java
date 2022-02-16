package com.study.customer;

public record CustomerRegistrationRequest(
                                            String firstName,
                                            String lastName,
                                            String email
                                        ) {
}
