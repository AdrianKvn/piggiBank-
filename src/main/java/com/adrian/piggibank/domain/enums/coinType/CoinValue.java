package com.adrian.piggibank.domain.enums.coinType;

import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Getter;

import java.util.Collection;
import java.util.HashMap;

@Getter
public enum CoinValue {
    CICNUENTA(CoinValue.COIN_VALUE_50, "CICNUENTA"),
    CIEN(CoinValue.COIN_VALUE_100, "CIEN"),
    DOCIENTOS(CoinValue.COIN_VALUE_200, "DOCIENTOS"),
    QUINIENTOS(CoinValue.COIN_VALUE_500, "QUINIENTOS"),
    MIL(CoinValue.COIN_VALUE_1000, "MIL");

    private static final String COIN_VALUE_50 = "50";
    private static final String COIN_VALUE_100 = "100";
    private static final String COIN_VALUE_200 = "200";
    private static final String COIN_VALUE_500 = "500";
    private static final String COIN_VALUE_1000 = "1000";

    private static final HashMap<String, CoinValue> ENUM_MAP_BY_CODE = new HashMap<>();

    @JsonValue
    private final String id;
    private final String description;

    static {
        ENUM_MAP_BY_CODE.put(COIN_VALUE_50, CICNUENTA);
        ENUM_MAP_BY_CODE.put(COIN_VALUE_100, CIEN);
        ENUM_MAP_BY_CODE.put(COIN_VALUE_200, DOCIENTOS);
        ENUM_MAP_BY_CODE.put(COIN_VALUE_500, QUINIENTOS);
        ENUM_MAP_BY_CODE.put(COIN_VALUE_1000, MIL);
    }

    CoinValue(String id, String description) {
        this.id = id;
        this.description = description;
    }

    public static Object findByPrimaryKey(String id) {
        if (id != null && ENUM_MAP_BY_CODE.containsKey(id)) {
            return ENUM_MAP_BY_CODE.get(id);
        }
        return null;
    }

    public static Collection<CoinValue> getList() {
        return ENUM_MAP_BY_CODE.values();
    }

}
