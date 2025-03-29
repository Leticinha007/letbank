package com.letbank.dto;

package com.santander.devweek.dto.response;

import java.util.List;

public record UserResponseDTO(
        Long id,
        String name,
        AccountDTO account,
        List<FeatureDTO> features,
        CardDTO card,
        List<NewsDTO> news
) {}
