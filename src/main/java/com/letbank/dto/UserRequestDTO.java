package com.letbank.dto;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.util.List;

public record UserRequestDTO(
        public record UserRequestDTO(
        @NotBlank(message = "Nome é obrigatório")
                String "name",

        @NotNull(message = "Conta é obrigatória")
        @Valid
        AccountDTO account,

        @Valid
        List<FeatureDTO> features,

        @NotNull(message = "Cartão é obrigatório")
        @Valid
        CardDTO card,

        @Valid
        List<NewsDTO> news
) {}