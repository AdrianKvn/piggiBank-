package com.adrian.piggibank.domain.dto;

import com.adrian.piggibank.domain.enums.coinType.CoinValueConverter;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.Convert;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CoinDto {

    @Convert(converter = CoinValueConverter.class)
    private Integer value;
}
