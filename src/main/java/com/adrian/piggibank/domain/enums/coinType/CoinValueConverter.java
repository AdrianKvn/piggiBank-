package com.adrian.piggibank.domain.enums.coinType;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter
public class CoinValueConverter implements AttributeConverter <CoinValue, String> {
   @Override
    public String convertToDatabaseColumn(CoinValue coinValue){
        if(coinValue != null){
            return coinValue.getId();
        }
        return null;
        }
    @Override
    public CoinValue convertToEntityAttribute(String dbData){
        return(CoinValue) CoinValue.findByPrimaryKey(dbData);
        }
}
