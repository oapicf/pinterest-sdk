/*
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.model;

import java.util.Objects;
import java.util.Arrays;
import org.openapitools.model.BrandFilter;
import org.openapitools.model.CatalogsProductGroupMultipleCountriesCriteria;
import org.openapitools.model.CatalogsProductGroupMultipleStringCriteria;
import org.openapitools.model.CatalogsProductGroupPricingCurrencyCriteria;
import org.openapitools.model.CountryFilter;
import org.openapitools.model.CustomLabel0Filter;
import org.openapitools.model.CustomLabel1Filter;
import org.openapitools.model.CustomLabel2Filter;
import org.openapitools.model.CustomLabel3Filter;
import org.openapitools.model.CustomLabel4Filter;
import org.openapitools.model.HotelIdFilter;
import org.openapitools.model.PriceFilter;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * CatalogsHotelProductGroupFilterKeys
 */
@JsonPropertyOrder({
  CatalogsHotelProductGroupFilterKeys.JSON_PROPERTY_P_R_I_C_E,
  CatalogsHotelProductGroupFilterKeys.JSON_PROPERTY_H_O_T_E_L_I_D,
  CatalogsHotelProductGroupFilterKeys.JSON_PROPERTY_B_R_A_N_D,
  CatalogsHotelProductGroupFilterKeys.JSON_PROPERTY_C_U_S_T_O_M_L_A_B_E_L0,
  CatalogsHotelProductGroupFilterKeys.JSON_PROPERTY_C_U_S_T_O_M_L_A_B_E_L1,
  CatalogsHotelProductGroupFilterKeys.JSON_PROPERTY_C_U_S_T_O_M_L_A_B_E_L2,
  CatalogsHotelProductGroupFilterKeys.JSON_PROPERTY_C_U_S_T_O_M_L_A_B_E_L3,
  CatalogsHotelProductGroupFilterKeys.JSON_PROPERTY_C_U_S_T_O_M_L_A_B_E_L4,
  CatalogsHotelProductGroupFilterKeys.JSON_PROPERTY_C_O_U_N_T_R_Y
})
@JsonTypeName("CatalogsHotelProductGroupFilterKeys")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautServerCodegen", date="2024-11-05T02:03:37.829873561Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@Introspected
public class CatalogsHotelProductGroupFilterKeys {
    public static final String JSON_PROPERTY_P_R_I_C_E = "PRICE";
    private CatalogsProductGroupPricingCurrencyCriteria PRICE;

    public static final String JSON_PROPERTY_H_O_T_E_L_I_D = "HOTEL_ID";
    private CatalogsProductGroupMultipleStringCriteria HOTEL_ID;

    public static final String JSON_PROPERTY_B_R_A_N_D = "BRAND";
    private CatalogsProductGroupMultipleStringCriteria BRAND;

    public static final String JSON_PROPERTY_C_U_S_T_O_M_L_A_B_E_L0 = "CUSTOM_LABEL_0";
    private CatalogsProductGroupMultipleStringCriteria CUSTOM_LABEL_0;

    public static final String JSON_PROPERTY_C_U_S_T_O_M_L_A_B_E_L1 = "CUSTOM_LABEL_1";
    private CatalogsProductGroupMultipleStringCriteria CUSTOM_LABEL_1;

    public static final String JSON_PROPERTY_C_U_S_T_O_M_L_A_B_E_L2 = "CUSTOM_LABEL_2";
    private CatalogsProductGroupMultipleStringCriteria CUSTOM_LABEL_2;

    public static final String JSON_PROPERTY_C_U_S_T_O_M_L_A_B_E_L3 = "CUSTOM_LABEL_3";
    private CatalogsProductGroupMultipleStringCriteria CUSTOM_LABEL_3;

    public static final String JSON_PROPERTY_C_U_S_T_O_M_L_A_B_E_L4 = "CUSTOM_LABEL_4";
    private CatalogsProductGroupMultipleStringCriteria CUSTOM_LABEL_4;

    public static final String JSON_PROPERTY_C_O_U_N_T_R_Y = "COUNTRY";
    private CatalogsProductGroupMultipleCountriesCriteria COUNTRY;

    public CatalogsHotelProductGroupFilterKeys(CatalogsProductGroupPricingCurrencyCriteria PRICE, CatalogsProductGroupMultipleStringCriteria HOTEL_ID, CatalogsProductGroupMultipleStringCriteria BRAND, CatalogsProductGroupMultipleStringCriteria CUSTOM_LABEL_0, CatalogsProductGroupMultipleStringCriteria CUSTOM_LABEL_1, CatalogsProductGroupMultipleStringCriteria CUSTOM_LABEL_2, CatalogsProductGroupMultipleStringCriteria CUSTOM_LABEL_3, CatalogsProductGroupMultipleStringCriteria CUSTOM_LABEL_4, CatalogsProductGroupMultipleCountriesCriteria COUNTRY) {
        this.PRICE = PRICE;
        this.HOTEL_ID = HOTEL_ID;
        this.BRAND = BRAND;
        this.CUSTOM_LABEL_0 = CUSTOM_LABEL_0;
        this.CUSTOM_LABEL_1 = CUSTOM_LABEL_1;
        this.CUSTOM_LABEL_2 = CUSTOM_LABEL_2;
        this.CUSTOM_LABEL_3 = CUSTOM_LABEL_3;
        this.CUSTOM_LABEL_4 = CUSTOM_LABEL_4;
        this.COUNTRY = COUNTRY;
    }

    public CatalogsHotelProductGroupFilterKeys PRICE(CatalogsProductGroupPricingCurrencyCriteria PRICE) {
        this.PRICE = PRICE;
        return this;
    }

    /**
     * Get PRICE
     * @return PRICE
     */
    @Valid
    @NotNull
    @Schema(name = "PRICE", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty(JSON_PROPERTY_P_R_I_C_E)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public CatalogsProductGroupPricingCurrencyCriteria getPRICE() {
        return PRICE;
    }

    @JsonProperty(JSON_PROPERTY_P_R_I_C_E)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setPRICE(CatalogsProductGroupPricingCurrencyCriteria PRICE) {
        this.PRICE = PRICE;
    }

    public CatalogsHotelProductGroupFilterKeys HOTEL_ID(CatalogsProductGroupMultipleStringCriteria HOTEL_ID) {
        this.HOTEL_ID = HOTEL_ID;
        return this;
    }

    /**
     * Get HOTEL_ID
     * @return HOTEL_ID
     */
    @NotNull
    @Schema(name = "HOTEL_ID", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty(JSON_PROPERTY_H_O_T_E_L_I_D)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public CatalogsProductGroupMultipleStringCriteria getHOTELID() {
        return HOTEL_ID;
    }

    @JsonProperty(JSON_PROPERTY_H_O_T_E_L_I_D)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setHOTELID(CatalogsProductGroupMultipleStringCriteria HOTEL_ID) {
        this.HOTEL_ID = HOTEL_ID;
    }

    public CatalogsHotelProductGroupFilterKeys BRAND(CatalogsProductGroupMultipleStringCriteria BRAND) {
        this.BRAND = BRAND;
        return this;
    }

    /**
     * Get BRAND
     * @return BRAND
     */
    @NotNull
    @Schema(name = "BRAND", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty(JSON_PROPERTY_B_R_A_N_D)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public CatalogsProductGroupMultipleStringCriteria getBRAND() {
        return BRAND;
    }

    @JsonProperty(JSON_PROPERTY_B_R_A_N_D)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setBRAND(CatalogsProductGroupMultipleStringCriteria BRAND) {
        this.BRAND = BRAND;
    }

    public CatalogsHotelProductGroupFilterKeys CUSTOM_LABEL_0(CatalogsProductGroupMultipleStringCriteria CUSTOM_LABEL_0) {
        this.CUSTOM_LABEL_0 = CUSTOM_LABEL_0;
        return this;
    }

    /**
     * Get CUSTOM_LABEL_0
     * @return CUSTOM_LABEL_0
     */
    @NotNull
    @Schema(name = "CUSTOM_LABEL_0", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty(JSON_PROPERTY_C_U_S_T_O_M_L_A_B_E_L0)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public CatalogsProductGroupMultipleStringCriteria getCUSTOMLABEL0() {
        return CUSTOM_LABEL_0;
    }

    @JsonProperty(JSON_PROPERTY_C_U_S_T_O_M_L_A_B_E_L0)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setCUSTOMLABEL0(CatalogsProductGroupMultipleStringCriteria CUSTOM_LABEL_0) {
        this.CUSTOM_LABEL_0 = CUSTOM_LABEL_0;
    }

    public CatalogsHotelProductGroupFilterKeys CUSTOM_LABEL_1(CatalogsProductGroupMultipleStringCriteria CUSTOM_LABEL_1) {
        this.CUSTOM_LABEL_1 = CUSTOM_LABEL_1;
        return this;
    }

    /**
     * Get CUSTOM_LABEL_1
     * @return CUSTOM_LABEL_1
     */
    @NotNull
    @Schema(name = "CUSTOM_LABEL_1", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty(JSON_PROPERTY_C_U_S_T_O_M_L_A_B_E_L1)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public CatalogsProductGroupMultipleStringCriteria getCUSTOMLABEL1() {
        return CUSTOM_LABEL_1;
    }

    @JsonProperty(JSON_PROPERTY_C_U_S_T_O_M_L_A_B_E_L1)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setCUSTOMLABEL1(CatalogsProductGroupMultipleStringCriteria CUSTOM_LABEL_1) {
        this.CUSTOM_LABEL_1 = CUSTOM_LABEL_1;
    }

    public CatalogsHotelProductGroupFilterKeys CUSTOM_LABEL_2(CatalogsProductGroupMultipleStringCriteria CUSTOM_LABEL_2) {
        this.CUSTOM_LABEL_2 = CUSTOM_LABEL_2;
        return this;
    }

    /**
     * Get CUSTOM_LABEL_2
     * @return CUSTOM_LABEL_2
     */
    @NotNull
    @Schema(name = "CUSTOM_LABEL_2", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty(JSON_PROPERTY_C_U_S_T_O_M_L_A_B_E_L2)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public CatalogsProductGroupMultipleStringCriteria getCUSTOMLABEL2() {
        return CUSTOM_LABEL_2;
    }

    @JsonProperty(JSON_PROPERTY_C_U_S_T_O_M_L_A_B_E_L2)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setCUSTOMLABEL2(CatalogsProductGroupMultipleStringCriteria CUSTOM_LABEL_2) {
        this.CUSTOM_LABEL_2 = CUSTOM_LABEL_2;
    }

    public CatalogsHotelProductGroupFilterKeys CUSTOM_LABEL_3(CatalogsProductGroupMultipleStringCriteria CUSTOM_LABEL_3) {
        this.CUSTOM_LABEL_3 = CUSTOM_LABEL_3;
        return this;
    }

    /**
     * Get CUSTOM_LABEL_3
     * @return CUSTOM_LABEL_3
     */
    @NotNull
    @Schema(name = "CUSTOM_LABEL_3", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty(JSON_PROPERTY_C_U_S_T_O_M_L_A_B_E_L3)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public CatalogsProductGroupMultipleStringCriteria getCUSTOMLABEL3() {
        return CUSTOM_LABEL_3;
    }

    @JsonProperty(JSON_PROPERTY_C_U_S_T_O_M_L_A_B_E_L3)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setCUSTOMLABEL3(CatalogsProductGroupMultipleStringCriteria CUSTOM_LABEL_3) {
        this.CUSTOM_LABEL_3 = CUSTOM_LABEL_3;
    }

    public CatalogsHotelProductGroupFilterKeys CUSTOM_LABEL_4(CatalogsProductGroupMultipleStringCriteria CUSTOM_LABEL_4) {
        this.CUSTOM_LABEL_4 = CUSTOM_LABEL_4;
        return this;
    }

    /**
     * Get CUSTOM_LABEL_4
     * @return CUSTOM_LABEL_4
     */
    @NotNull
    @Schema(name = "CUSTOM_LABEL_4", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty(JSON_PROPERTY_C_U_S_T_O_M_L_A_B_E_L4)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public CatalogsProductGroupMultipleStringCriteria getCUSTOMLABEL4() {
        return CUSTOM_LABEL_4;
    }

    @JsonProperty(JSON_PROPERTY_C_U_S_T_O_M_L_A_B_E_L4)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setCUSTOMLABEL4(CatalogsProductGroupMultipleStringCriteria CUSTOM_LABEL_4) {
        this.CUSTOM_LABEL_4 = CUSTOM_LABEL_4;
    }

    public CatalogsHotelProductGroupFilterKeys COUNTRY(CatalogsProductGroupMultipleCountriesCriteria COUNTRY) {
        this.COUNTRY = COUNTRY;
        return this;
    }

    /**
     * Get COUNTRY
     * @return COUNTRY
     */
    @NotNull
    @Schema(name = "COUNTRY", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty(JSON_PROPERTY_C_O_U_N_T_R_Y)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public CatalogsProductGroupMultipleCountriesCriteria getCOUNTRY() {
        return COUNTRY;
    }

    @JsonProperty(JSON_PROPERTY_C_O_U_N_T_R_Y)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setCOUNTRY(CatalogsProductGroupMultipleCountriesCriteria COUNTRY) {
        this.COUNTRY = COUNTRY;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CatalogsHotelProductGroupFilterKeys catalogsHotelProductGroupFilterKeys = (CatalogsHotelProductGroupFilterKeys) o;
        return Objects.equals(this.PRICE, catalogsHotelProductGroupFilterKeys.PRICE) &&
            Objects.equals(this.HOTEL_ID, catalogsHotelProductGroupFilterKeys.HOTEL_ID) &&
            Objects.equals(this.BRAND, catalogsHotelProductGroupFilterKeys.BRAND) &&
            Objects.equals(this.CUSTOM_LABEL_0, catalogsHotelProductGroupFilterKeys.CUSTOM_LABEL_0) &&
            Objects.equals(this.CUSTOM_LABEL_1, catalogsHotelProductGroupFilterKeys.CUSTOM_LABEL_1) &&
            Objects.equals(this.CUSTOM_LABEL_2, catalogsHotelProductGroupFilterKeys.CUSTOM_LABEL_2) &&
            Objects.equals(this.CUSTOM_LABEL_3, catalogsHotelProductGroupFilterKeys.CUSTOM_LABEL_3) &&
            Objects.equals(this.CUSTOM_LABEL_4, catalogsHotelProductGroupFilterKeys.CUSTOM_LABEL_4) &&
            Objects.equals(this.COUNTRY, catalogsHotelProductGroupFilterKeys.COUNTRY);
    }

    @Override
    public int hashCode() {
        return Objects.hash(PRICE, HOTEL_ID, BRAND, CUSTOM_LABEL_0, CUSTOM_LABEL_1, CUSTOM_LABEL_2, CUSTOM_LABEL_3, CUSTOM_LABEL_4, COUNTRY);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CatalogsHotelProductGroupFilterKeys {\n");
        sb.append("    PRICE: ").append(toIndentedString(PRICE)).append("\n");
        sb.append("    HOTEL_ID: ").append(toIndentedString(HOTEL_ID)).append("\n");
        sb.append("    BRAND: ").append(toIndentedString(BRAND)).append("\n");
        sb.append("    CUSTOM_LABEL_0: ").append(toIndentedString(CUSTOM_LABEL_0)).append("\n");
        sb.append("    CUSTOM_LABEL_1: ").append(toIndentedString(CUSTOM_LABEL_1)).append("\n");
        sb.append("    CUSTOM_LABEL_2: ").append(toIndentedString(CUSTOM_LABEL_2)).append("\n");
        sb.append("    CUSTOM_LABEL_3: ").append(toIndentedString(CUSTOM_LABEL_3)).append("\n");
        sb.append("    CUSTOM_LABEL_4: ").append(toIndentedString(CUSTOM_LABEL_4)).append("\n");
        sb.append("    COUNTRY: ").append(toIndentedString(COUNTRY)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}

