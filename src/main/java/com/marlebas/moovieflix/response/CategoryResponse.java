package com.marlebas.moovieflix.response;

import lombok.Builder;

@Builder
public record CategoryResponse(Long id, String name) {
}
