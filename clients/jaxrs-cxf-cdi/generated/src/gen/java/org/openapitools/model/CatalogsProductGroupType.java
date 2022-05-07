package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;

/**
 * Catalog product group type
 **/

public enum CatalogsProductGroupType {

    MERCHANT_CREATED(String.valueOf("MERCHANT_CREATED")), ALL_PRODUCTS(String.valueOf("ALL_PRODUCTS")), BEST_DEALS(String.valueOf("BEST_DEALS")), PINNER_FAVORITES(String.valueOf("PINNER_FAVORITES")), TOP_SELLERS(String.valueOf("TOP_SELLERS")), BACK_IN_STOCK(String.valueOf("BACK_IN_STOCK")), NEW_ARRIVALS(String.valueOf("NEW_ARRIVALS"));


    private String value;

    CatalogsProductGroupType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static CatalogsProductGroupType fromValue(String value) {
        for (CatalogsProductGroupType b : CatalogsProductGroupType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



