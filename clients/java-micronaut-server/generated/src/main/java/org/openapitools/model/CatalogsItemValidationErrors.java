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
import org.openapitools.model.CatalogsItemValidationDetails;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * CatalogsItemValidationErrors
 */
@JsonPropertyOrder({
  CatalogsItemValidationErrors.JSON_PROPERTY_A_D_U_L_T_I_N_V_A_L_I_D,
  CatalogsItemValidationErrors.JSON_PROPERTY_A_D_W_O_R_D_S_F_O_R_M_A_T_I_N_V_A_L_I_D,
  CatalogsItemValidationErrors.JSON_PROPERTY_A_V_A_I_L_A_B_I_L_I_T_Y_I_N_V_A_L_I_D,
  CatalogsItemValidationErrors.JSON_PROPERTY_B_L_O_C_K_L_I_S_T_E_D_I_M_A_G_E_S_I_G_N_A_T_U_R_E,
  CatalogsItemValidationErrors.JSON_PROPERTY_D_E_S_C_R_I_P_T_I_O_N_M_I_S_S_I_N_G,
  CatalogsItemValidationErrors.JSON_PROPERTY_D_U_P_L_I_C_A_T_E_P_R_O_D_U_C_T_S,
  CatalogsItemValidationErrors.JSON_PROPERTY_I_M_A_G_E_L_I_N_K_I_N_V_A_L_I_D,
  CatalogsItemValidationErrors.JSON_PROPERTY_I_M_A_G_E_L_I_N_K_L_E_N_G_T_H_T_O_O_L_O_N_G,
  CatalogsItemValidationErrors.JSON_PROPERTY_I_M_A_G_E_L_I_N_K_M_I_S_S_I_N_G,
  CatalogsItemValidationErrors.JSON_PROPERTY_I_N_V_A_L_I_D_D_O_M_A_I_N,
  CatalogsItemValidationErrors.JSON_PROPERTY_I_T_E_M_I_D_M_I_S_S_I_N_G,
  CatalogsItemValidationErrors.JSON_PROPERTY_I_T_E_M_M_A_I_N_I_M_A_G_E_D_O_W_N_L_O_A_D_F_A_I_L_U_R_E,
  CatalogsItemValidationErrors.JSON_PROPERTY_L_I_N_K_F_O_R_M_A_T_I_N_V_A_L_I_D,
  CatalogsItemValidationErrors.JSON_PROPERTY_L_I_N_K_L_E_N_G_T_H_T_O_O_L_O_N_G,
  CatalogsItemValidationErrors.JSON_PROPERTY_L_I_S_T_P_R_I_C_E_I_N_V_A_L_I_D,
  CatalogsItemValidationErrors.JSON_PROPERTY_M_A_X_I_T_E_M_S_P_E_R_I_T_E_M_G_R_O_U_P_E_X_C_E_E_D_E_D,
  CatalogsItemValidationErrors.JSON_PROPERTY_P_A_R_S_E_L_I_N_E_E_R_R_O_R,
  CatalogsItemValidationErrors.JSON_PROPERTY_P_I_N_J_O_I_N_C_O_N_T_E_N_T_U_N_S_A_F_E,
  CatalogsItemValidationErrors.JSON_PROPERTY_P_R_I_C_E_C_A_N_N_O_T_B_E_D_E_T_E_R_M_I_N_E_D,
  CatalogsItemValidationErrors.JSON_PROPERTY_P_R_I_C_E_M_I_S_S_I_N_G,
  CatalogsItemValidationErrors.JSON_PROPERTY_P_R_O_D_U_C_T_L_I_N_K_M_I_S_S_I_N_G,
  CatalogsItemValidationErrors.JSON_PROPERTY_P_R_O_D_U_C_T_P_R_I_C_E_I_N_V_A_L_I_D,
  CatalogsItemValidationErrors.JSON_PROPERTY_T_I_T_L_E_M_I_S_S_I_N_G
})
@JsonTypeName("CatalogsItemValidationErrors")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautServerCodegen", date="2024-11-05T02:03:37.829873561Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@Introspected
public class CatalogsItemValidationErrors {
    public static final String JSON_PROPERTY_A_D_U_L_T_I_N_V_A_L_I_D = "ADULT_INVALID";
    private CatalogsItemValidationDetails ADULT_INVALID;

    public static final String JSON_PROPERTY_A_D_W_O_R_D_S_F_O_R_M_A_T_I_N_V_A_L_I_D = "ADWORDS_FORMAT_INVALID";
    private CatalogsItemValidationDetails ADWORDS_FORMAT_INVALID;

    public static final String JSON_PROPERTY_A_V_A_I_L_A_B_I_L_I_T_Y_I_N_V_A_L_I_D = "AVAILABILITY_INVALID";
    private CatalogsItemValidationDetails AVAILABILITY_INVALID;

    public static final String JSON_PROPERTY_B_L_O_C_K_L_I_S_T_E_D_I_M_A_G_E_S_I_G_N_A_T_U_R_E = "BLOCKLISTED_IMAGE_SIGNATURE";
    private CatalogsItemValidationDetails BLOCKLISTED_IMAGE_SIGNATURE;

    public static final String JSON_PROPERTY_D_E_S_C_R_I_P_T_I_O_N_M_I_S_S_I_N_G = "DESCRIPTION_MISSING";
    private CatalogsItemValidationDetails DESCRIPTION_MISSING;

    public static final String JSON_PROPERTY_D_U_P_L_I_C_A_T_E_P_R_O_D_U_C_T_S = "DUPLICATE_PRODUCTS";
    private CatalogsItemValidationDetails DUPLICATE_PRODUCTS;

    public static final String JSON_PROPERTY_I_M_A_G_E_L_I_N_K_I_N_V_A_L_I_D = "IMAGE_LINK_INVALID";
    private CatalogsItemValidationDetails IMAGE_LINK_INVALID;

    public static final String JSON_PROPERTY_I_M_A_G_E_L_I_N_K_L_E_N_G_T_H_T_O_O_L_O_N_G = "IMAGE_LINK_LENGTH_TOO_LONG";
    private CatalogsItemValidationDetails IMAGE_LINK_LENGTH_TOO_LONG;

    public static final String JSON_PROPERTY_I_M_A_G_E_L_I_N_K_M_I_S_S_I_N_G = "IMAGE_LINK_MISSING";
    private CatalogsItemValidationDetails IMAGE_LINK_MISSING;

    public static final String JSON_PROPERTY_I_N_V_A_L_I_D_D_O_M_A_I_N = "INVALID_DOMAIN";
    private CatalogsItemValidationDetails INVALID_DOMAIN;

    public static final String JSON_PROPERTY_I_T_E_M_I_D_M_I_S_S_I_N_G = "ITEMID_MISSING";
    private CatalogsItemValidationDetails ITEMID_MISSING;

    public static final String JSON_PROPERTY_I_T_E_M_M_A_I_N_I_M_A_G_E_D_O_W_N_L_O_A_D_F_A_I_L_U_R_E = "ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE";
    private CatalogsItemValidationDetails ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE;

    public static final String JSON_PROPERTY_L_I_N_K_F_O_R_M_A_T_I_N_V_A_L_I_D = "LINK_FORMAT_INVALID";
    private CatalogsItemValidationDetails LINK_FORMAT_INVALID;

    public static final String JSON_PROPERTY_L_I_N_K_L_E_N_G_T_H_T_O_O_L_O_N_G = "LINK_LENGTH_TOO_LONG";
    private CatalogsItemValidationDetails LINK_LENGTH_TOO_LONG;

    public static final String JSON_PROPERTY_L_I_S_T_P_R_I_C_E_I_N_V_A_L_I_D = "LIST_PRICE_INVALID";
    private CatalogsItemValidationDetails LIST_PRICE_INVALID;

    public static final String JSON_PROPERTY_M_A_X_I_T_E_M_S_P_E_R_I_T_E_M_G_R_O_U_P_E_X_C_E_E_D_E_D = "MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED";
    private CatalogsItemValidationDetails MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED;

    public static final String JSON_PROPERTY_P_A_R_S_E_L_I_N_E_E_R_R_O_R = "PARSE_LINE_ERROR";
    private CatalogsItemValidationDetails PARSE_LINE_ERROR;

    public static final String JSON_PROPERTY_P_I_N_J_O_I_N_C_O_N_T_E_N_T_U_N_S_A_F_E = "PINJOIN_CONTENT_UNSAFE";
    private CatalogsItemValidationDetails PINJOIN_CONTENT_UNSAFE;

    public static final String JSON_PROPERTY_P_R_I_C_E_C_A_N_N_O_T_B_E_D_E_T_E_R_M_I_N_E_D = "PRICE_CANNOT_BE_DETERMINED";
    private CatalogsItemValidationDetails PRICE_CANNOT_BE_DETERMINED;

    public static final String JSON_PROPERTY_P_R_I_C_E_M_I_S_S_I_N_G = "PRICE_MISSING";
    private CatalogsItemValidationDetails PRICE_MISSING;

    public static final String JSON_PROPERTY_P_R_O_D_U_C_T_L_I_N_K_M_I_S_S_I_N_G = "PRODUCT_LINK_MISSING";
    private CatalogsItemValidationDetails PRODUCT_LINK_MISSING;

    public static final String JSON_PROPERTY_P_R_O_D_U_C_T_P_R_I_C_E_I_N_V_A_L_I_D = "PRODUCT_PRICE_INVALID";
    private CatalogsItemValidationDetails PRODUCT_PRICE_INVALID;

    public static final String JSON_PROPERTY_T_I_T_L_E_M_I_S_S_I_N_G = "TITLE_MISSING";
    private CatalogsItemValidationDetails TITLE_MISSING;

    public CatalogsItemValidationErrors() {
    }

    public CatalogsItemValidationErrors ADULT_INVALID(CatalogsItemValidationDetails ADULT_INVALID) {
        this.ADULT_INVALID = ADULT_INVALID;
        return this;
    }

    /**
     * Get ADULT_INVALID
     * @return ADULT_INVALID
     */
    @Valid
    @Nullable
    @Schema(name = "ADULT_INVALID", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_A_D_U_L_T_I_N_V_A_L_I_D)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public CatalogsItemValidationDetails getADULTINVALID() {
        return ADULT_INVALID;
    }

    @JsonProperty(JSON_PROPERTY_A_D_U_L_T_I_N_V_A_L_I_D)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setADULTINVALID(CatalogsItemValidationDetails ADULT_INVALID) {
        this.ADULT_INVALID = ADULT_INVALID;
    }

    public CatalogsItemValidationErrors ADWORDS_FORMAT_INVALID(CatalogsItemValidationDetails ADWORDS_FORMAT_INVALID) {
        this.ADWORDS_FORMAT_INVALID = ADWORDS_FORMAT_INVALID;
        return this;
    }

    /**
     * Get ADWORDS_FORMAT_INVALID
     * @return ADWORDS_FORMAT_INVALID
     */
    @Valid
    @Nullable
    @Schema(name = "ADWORDS_FORMAT_INVALID", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_A_D_W_O_R_D_S_F_O_R_M_A_T_I_N_V_A_L_I_D)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public CatalogsItemValidationDetails getADWORDSFORMATINVALID() {
        return ADWORDS_FORMAT_INVALID;
    }

    @JsonProperty(JSON_PROPERTY_A_D_W_O_R_D_S_F_O_R_M_A_T_I_N_V_A_L_I_D)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setADWORDSFORMATINVALID(CatalogsItemValidationDetails ADWORDS_FORMAT_INVALID) {
        this.ADWORDS_FORMAT_INVALID = ADWORDS_FORMAT_INVALID;
    }

    public CatalogsItemValidationErrors AVAILABILITY_INVALID(CatalogsItemValidationDetails AVAILABILITY_INVALID) {
        this.AVAILABILITY_INVALID = AVAILABILITY_INVALID;
        return this;
    }

    /**
     * Get AVAILABILITY_INVALID
     * @return AVAILABILITY_INVALID
     */
    @Valid
    @Nullable
    @Schema(name = "AVAILABILITY_INVALID", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_A_V_A_I_L_A_B_I_L_I_T_Y_I_N_V_A_L_I_D)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public CatalogsItemValidationDetails getAVAILABILITYINVALID() {
        return AVAILABILITY_INVALID;
    }

    @JsonProperty(JSON_PROPERTY_A_V_A_I_L_A_B_I_L_I_T_Y_I_N_V_A_L_I_D)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setAVAILABILITYINVALID(CatalogsItemValidationDetails AVAILABILITY_INVALID) {
        this.AVAILABILITY_INVALID = AVAILABILITY_INVALID;
    }

    public CatalogsItemValidationErrors BLOCKLISTED_IMAGE_SIGNATURE(CatalogsItemValidationDetails BLOCKLISTED_IMAGE_SIGNATURE) {
        this.BLOCKLISTED_IMAGE_SIGNATURE = BLOCKLISTED_IMAGE_SIGNATURE;
        return this;
    }

    /**
     * Get BLOCKLISTED_IMAGE_SIGNATURE
     * @return BLOCKLISTED_IMAGE_SIGNATURE
     */
    @Valid
    @Nullable
    @Schema(name = "BLOCKLISTED_IMAGE_SIGNATURE", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_B_L_O_C_K_L_I_S_T_E_D_I_M_A_G_E_S_I_G_N_A_T_U_R_E)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public CatalogsItemValidationDetails getBLOCKLISTEDIMAGESIGNATURE() {
        return BLOCKLISTED_IMAGE_SIGNATURE;
    }

    @JsonProperty(JSON_PROPERTY_B_L_O_C_K_L_I_S_T_E_D_I_M_A_G_E_S_I_G_N_A_T_U_R_E)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setBLOCKLISTEDIMAGESIGNATURE(CatalogsItemValidationDetails BLOCKLISTED_IMAGE_SIGNATURE) {
        this.BLOCKLISTED_IMAGE_SIGNATURE = BLOCKLISTED_IMAGE_SIGNATURE;
    }

    public CatalogsItemValidationErrors DESCRIPTION_MISSING(CatalogsItemValidationDetails DESCRIPTION_MISSING) {
        this.DESCRIPTION_MISSING = DESCRIPTION_MISSING;
        return this;
    }

    /**
     * Get DESCRIPTION_MISSING
     * @return DESCRIPTION_MISSING
     */
    @Valid
    @Nullable
    @Schema(name = "DESCRIPTION_MISSING", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_D_E_S_C_R_I_P_T_I_O_N_M_I_S_S_I_N_G)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public CatalogsItemValidationDetails getDESCRIPTIONMISSING() {
        return DESCRIPTION_MISSING;
    }

    @JsonProperty(JSON_PROPERTY_D_E_S_C_R_I_P_T_I_O_N_M_I_S_S_I_N_G)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setDESCRIPTIONMISSING(CatalogsItemValidationDetails DESCRIPTION_MISSING) {
        this.DESCRIPTION_MISSING = DESCRIPTION_MISSING;
    }

    public CatalogsItemValidationErrors DUPLICATE_PRODUCTS(CatalogsItemValidationDetails DUPLICATE_PRODUCTS) {
        this.DUPLICATE_PRODUCTS = DUPLICATE_PRODUCTS;
        return this;
    }

    /**
     * Get DUPLICATE_PRODUCTS
     * @return DUPLICATE_PRODUCTS
     */
    @Valid
    @Nullable
    @Schema(name = "DUPLICATE_PRODUCTS", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_D_U_P_L_I_C_A_T_E_P_R_O_D_U_C_T_S)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public CatalogsItemValidationDetails getDUPLICATEPRODUCTS() {
        return DUPLICATE_PRODUCTS;
    }

    @JsonProperty(JSON_PROPERTY_D_U_P_L_I_C_A_T_E_P_R_O_D_U_C_T_S)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setDUPLICATEPRODUCTS(CatalogsItemValidationDetails DUPLICATE_PRODUCTS) {
        this.DUPLICATE_PRODUCTS = DUPLICATE_PRODUCTS;
    }

    public CatalogsItemValidationErrors IMAGE_LINK_INVALID(CatalogsItemValidationDetails IMAGE_LINK_INVALID) {
        this.IMAGE_LINK_INVALID = IMAGE_LINK_INVALID;
        return this;
    }

    /**
     * Get IMAGE_LINK_INVALID
     * @return IMAGE_LINK_INVALID
     */
    @Valid
    @Nullable
    @Schema(name = "IMAGE_LINK_INVALID", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_I_M_A_G_E_L_I_N_K_I_N_V_A_L_I_D)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public CatalogsItemValidationDetails getIMAGELINKINVALID() {
        return IMAGE_LINK_INVALID;
    }

    @JsonProperty(JSON_PROPERTY_I_M_A_G_E_L_I_N_K_I_N_V_A_L_I_D)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setIMAGELINKINVALID(CatalogsItemValidationDetails IMAGE_LINK_INVALID) {
        this.IMAGE_LINK_INVALID = IMAGE_LINK_INVALID;
    }

    public CatalogsItemValidationErrors IMAGE_LINK_LENGTH_TOO_LONG(CatalogsItemValidationDetails IMAGE_LINK_LENGTH_TOO_LONG) {
        this.IMAGE_LINK_LENGTH_TOO_LONG = IMAGE_LINK_LENGTH_TOO_LONG;
        return this;
    }

    /**
     * Get IMAGE_LINK_LENGTH_TOO_LONG
     * @return IMAGE_LINK_LENGTH_TOO_LONG
     */
    @Valid
    @Nullable
    @Schema(name = "IMAGE_LINK_LENGTH_TOO_LONG", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_I_M_A_G_E_L_I_N_K_L_E_N_G_T_H_T_O_O_L_O_N_G)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public CatalogsItemValidationDetails getIMAGELINKLENGTHTOOLONG() {
        return IMAGE_LINK_LENGTH_TOO_LONG;
    }

    @JsonProperty(JSON_PROPERTY_I_M_A_G_E_L_I_N_K_L_E_N_G_T_H_T_O_O_L_O_N_G)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setIMAGELINKLENGTHTOOLONG(CatalogsItemValidationDetails IMAGE_LINK_LENGTH_TOO_LONG) {
        this.IMAGE_LINK_LENGTH_TOO_LONG = IMAGE_LINK_LENGTH_TOO_LONG;
    }

    public CatalogsItemValidationErrors IMAGE_LINK_MISSING(CatalogsItemValidationDetails IMAGE_LINK_MISSING) {
        this.IMAGE_LINK_MISSING = IMAGE_LINK_MISSING;
        return this;
    }

    /**
     * Get IMAGE_LINK_MISSING
     * @return IMAGE_LINK_MISSING
     */
    @Valid
    @Nullable
    @Schema(name = "IMAGE_LINK_MISSING", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_I_M_A_G_E_L_I_N_K_M_I_S_S_I_N_G)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public CatalogsItemValidationDetails getIMAGELINKMISSING() {
        return IMAGE_LINK_MISSING;
    }

    @JsonProperty(JSON_PROPERTY_I_M_A_G_E_L_I_N_K_M_I_S_S_I_N_G)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setIMAGELINKMISSING(CatalogsItemValidationDetails IMAGE_LINK_MISSING) {
        this.IMAGE_LINK_MISSING = IMAGE_LINK_MISSING;
    }

    public CatalogsItemValidationErrors INVALID_DOMAIN(CatalogsItemValidationDetails INVALID_DOMAIN) {
        this.INVALID_DOMAIN = INVALID_DOMAIN;
        return this;
    }

    /**
     * Get INVALID_DOMAIN
     * @return INVALID_DOMAIN
     */
    @Valid
    @Nullable
    @Schema(name = "INVALID_DOMAIN", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_I_N_V_A_L_I_D_D_O_M_A_I_N)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public CatalogsItemValidationDetails getINVALIDDOMAIN() {
        return INVALID_DOMAIN;
    }

    @JsonProperty(JSON_PROPERTY_I_N_V_A_L_I_D_D_O_M_A_I_N)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setINVALIDDOMAIN(CatalogsItemValidationDetails INVALID_DOMAIN) {
        this.INVALID_DOMAIN = INVALID_DOMAIN;
    }

    public CatalogsItemValidationErrors ITEMID_MISSING(CatalogsItemValidationDetails ITEMID_MISSING) {
        this.ITEMID_MISSING = ITEMID_MISSING;
        return this;
    }

    /**
     * Get ITEMID_MISSING
     * @return ITEMID_MISSING
     */
    @Valid
    @Nullable
    @Schema(name = "ITEMID_MISSING", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_I_T_E_M_I_D_M_I_S_S_I_N_G)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public CatalogsItemValidationDetails getITEMIDMISSING() {
        return ITEMID_MISSING;
    }

    @JsonProperty(JSON_PROPERTY_I_T_E_M_I_D_M_I_S_S_I_N_G)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setITEMIDMISSING(CatalogsItemValidationDetails ITEMID_MISSING) {
        this.ITEMID_MISSING = ITEMID_MISSING;
    }

    public CatalogsItemValidationErrors ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE(CatalogsItemValidationDetails ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE) {
        this.ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE = ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE;
        return this;
    }

    /**
     * Get ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE
     * @return ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE
     */
    @Valid
    @Nullable
    @Schema(name = "ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_I_T_E_M_M_A_I_N_I_M_A_G_E_D_O_W_N_L_O_A_D_F_A_I_L_U_R_E)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public CatalogsItemValidationDetails getITEMMAINIMAGEDOWNLOADFAILURE() {
        return ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE;
    }

    @JsonProperty(JSON_PROPERTY_I_T_E_M_M_A_I_N_I_M_A_G_E_D_O_W_N_L_O_A_D_F_A_I_L_U_R_E)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setITEMMAINIMAGEDOWNLOADFAILURE(CatalogsItemValidationDetails ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE) {
        this.ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE = ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE;
    }

    public CatalogsItemValidationErrors LINK_FORMAT_INVALID(CatalogsItemValidationDetails LINK_FORMAT_INVALID) {
        this.LINK_FORMAT_INVALID = LINK_FORMAT_INVALID;
        return this;
    }

    /**
     * Get LINK_FORMAT_INVALID
     * @return LINK_FORMAT_INVALID
     */
    @Valid
    @Nullable
    @Schema(name = "LINK_FORMAT_INVALID", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_L_I_N_K_F_O_R_M_A_T_I_N_V_A_L_I_D)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public CatalogsItemValidationDetails getLINKFORMATINVALID() {
        return LINK_FORMAT_INVALID;
    }

    @JsonProperty(JSON_PROPERTY_L_I_N_K_F_O_R_M_A_T_I_N_V_A_L_I_D)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setLINKFORMATINVALID(CatalogsItemValidationDetails LINK_FORMAT_INVALID) {
        this.LINK_FORMAT_INVALID = LINK_FORMAT_INVALID;
    }

    public CatalogsItemValidationErrors LINK_LENGTH_TOO_LONG(CatalogsItemValidationDetails LINK_LENGTH_TOO_LONG) {
        this.LINK_LENGTH_TOO_LONG = LINK_LENGTH_TOO_LONG;
        return this;
    }

    /**
     * Get LINK_LENGTH_TOO_LONG
     * @return LINK_LENGTH_TOO_LONG
     */
    @Valid
    @Nullable
    @Schema(name = "LINK_LENGTH_TOO_LONG", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_L_I_N_K_L_E_N_G_T_H_T_O_O_L_O_N_G)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public CatalogsItemValidationDetails getLINKLENGTHTOOLONG() {
        return LINK_LENGTH_TOO_LONG;
    }

    @JsonProperty(JSON_PROPERTY_L_I_N_K_L_E_N_G_T_H_T_O_O_L_O_N_G)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setLINKLENGTHTOOLONG(CatalogsItemValidationDetails LINK_LENGTH_TOO_LONG) {
        this.LINK_LENGTH_TOO_LONG = LINK_LENGTH_TOO_LONG;
    }

    public CatalogsItemValidationErrors LIST_PRICE_INVALID(CatalogsItemValidationDetails LIST_PRICE_INVALID) {
        this.LIST_PRICE_INVALID = LIST_PRICE_INVALID;
        return this;
    }

    /**
     * Get LIST_PRICE_INVALID
     * @return LIST_PRICE_INVALID
     */
    @Valid
    @Nullable
    @Schema(name = "LIST_PRICE_INVALID", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_L_I_S_T_P_R_I_C_E_I_N_V_A_L_I_D)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public CatalogsItemValidationDetails getLISTPRICEINVALID() {
        return LIST_PRICE_INVALID;
    }

    @JsonProperty(JSON_PROPERTY_L_I_S_T_P_R_I_C_E_I_N_V_A_L_I_D)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setLISTPRICEINVALID(CatalogsItemValidationDetails LIST_PRICE_INVALID) {
        this.LIST_PRICE_INVALID = LIST_PRICE_INVALID;
    }

    public CatalogsItemValidationErrors MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED(CatalogsItemValidationDetails MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED) {
        this.MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED = MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED;
        return this;
    }

    /**
     * Get MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED
     * @return MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED
     */
    @Valid
    @Nullable
    @Schema(name = "MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_M_A_X_I_T_E_M_S_P_E_R_I_T_E_M_G_R_O_U_P_E_X_C_E_E_D_E_D)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public CatalogsItemValidationDetails getMAXITEMSPERITEMGROUPEXCEEDED() {
        return MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED;
    }

    @JsonProperty(JSON_PROPERTY_M_A_X_I_T_E_M_S_P_E_R_I_T_E_M_G_R_O_U_P_E_X_C_E_E_D_E_D)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setMAXITEMSPERITEMGROUPEXCEEDED(CatalogsItemValidationDetails MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED) {
        this.MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED = MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED;
    }

    public CatalogsItemValidationErrors PARSE_LINE_ERROR(CatalogsItemValidationDetails PARSE_LINE_ERROR) {
        this.PARSE_LINE_ERROR = PARSE_LINE_ERROR;
        return this;
    }

    /**
     * Get PARSE_LINE_ERROR
     * @return PARSE_LINE_ERROR
     */
    @Valid
    @Nullable
    @Schema(name = "PARSE_LINE_ERROR", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_P_A_R_S_E_L_I_N_E_E_R_R_O_R)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public CatalogsItemValidationDetails getPARSELINEERROR() {
        return PARSE_LINE_ERROR;
    }

    @JsonProperty(JSON_PROPERTY_P_A_R_S_E_L_I_N_E_E_R_R_O_R)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setPARSELINEERROR(CatalogsItemValidationDetails PARSE_LINE_ERROR) {
        this.PARSE_LINE_ERROR = PARSE_LINE_ERROR;
    }

    public CatalogsItemValidationErrors PINJOIN_CONTENT_UNSAFE(CatalogsItemValidationDetails PINJOIN_CONTENT_UNSAFE) {
        this.PINJOIN_CONTENT_UNSAFE = PINJOIN_CONTENT_UNSAFE;
        return this;
    }

    /**
     * Get PINJOIN_CONTENT_UNSAFE
     * @return PINJOIN_CONTENT_UNSAFE
     */
    @Valid
    @Nullable
    @Schema(name = "PINJOIN_CONTENT_UNSAFE", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_P_I_N_J_O_I_N_C_O_N_T_E_N_T_U_N_S_A_F_E)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public CatalogsItemValidationDetails getPINJOINCONTENTUNSAFE() {
        return PINJOIN_CONTENT_UNSAFE;
    }

    @JsonProperty(JSON_PROPERTY_P_I_N_J_O_I_N_C_O_N_T_E_N_T_U_N_S_A_F_E)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setPINJOINCONTENTUNSAFE(CatalogsItemValidationDetails PINJOIN_CONTENT_UNSAFE) {
        this.PINJOIN_CONTENT_UNSAFE = PINJOIN_CONTENT_UNSAFE;
    }

    public CatalogsItemValidationErrors PRICE_CANNOT_BE_DETERMINED(CatalogsItemValidationDetails PRICE_CANNOT_BE_DETERMINED) {
        this.PRICE_CANNOT_BE_DETERMINED = PRICE_CANNOT_BE_DETERMINED;
        return this;
    }

    /**
     * Get PRICE_CANNOT_BE_DETERMINED
     * @return PRICE_CANNOT_BE_DETERMINED
     */
    @Valid
    @Nullable
    @Schema(name = "PRICE_CANNOT_BE_DETERMINED", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_P_R_I_C_E_C_A_N_N_O_T_B_E_D_E_T_E_R_M_I_N_E_D)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public CatalogsItemValidationDetails getPRICECANNOTBEDETERMINED() {
        return PRICE_CANNOT_BE_DETERMINED;
    }

    @JsonProperty(JSON_PROPERTY_P_R_I_C_E_C_A_N_N_O_T_B_E_D_E_T_E_R_M_I_N_E_D)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setPRICECANNOTBEDETERMINED(CatalogsItemValidationDetails PRICE_CANNOT_BE_DETERMINED) {
        this.PRICE_CANNOT_BE_DETERMINED = PRICE_CANNOT_BE_DETERMINED;
    }

    public CatalogsItemValidationErrors PRICE_MISSING(CatalogsItemValidationDetails PRICE_MISSING) {
        this.PRICE_MISSING = PRICE_MISSING;
        return this;
    }

    /**
     * Get PRICE_MISSING
     * @return PRICE_MISSING
     */
    @Valid
    @Nullable
    @Schema(name = "PRICE_MISSING", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_P_R_I_C_E_M_I_S_S_I_N_G)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public CatalogsItemValidationDetails getPRICEMISSING() {
        return PRICE_MISSING;
    }

    @JsonProperty(JSON_PROPERTY_P_R_I_C_E_M_I_S_S_I_N_G)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setPRICEMISSING(CatalogsItemValidationDetails PRICE_MISSING) {
        this.PRICE_MISSING = PRICE_MISSING;
    }

    public CatalogsItemValidationErrors PRODUCT_LINK_MISSING(CatalogsItemValidationDetails PRODUCT_LINK_MISSING) {
        this.PRODUCT_LINK_MISSING = PRODUCT_LINK_MISSING;
        return this;
    }

    /**
     * Get PRODUCT_LINK_MISSING
     * @return PRODUCT_LINK_MISSING
     */
    @Valid
    @Nullable
    @Schema(name = "PRODUCT_LINK_MISSING", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_P_R_O_D_U_C_T_L_I_N_K_M_I_S_S_I_N_G)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public CatalogsItemValidationDetails getPRODUCTLINKMISSING() {
        return PRODUCT_LINK_MISSING;
    }

    @JsonProperty(JSON_PROPERTY_P_R_O_D_U_C_T_L_I_N_K_M_I_S_S_I_N_G)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setPRODUCTLINKMISSING(CatalogsItemValidationDetails PRODUCT_LINK_MISSING) {
        this.PRODUCT_LINK_MISSING = PRODUCT_LINK_MISSING;
    }

    public CatalogsItemValidationErrors PRODUCT_PRICE_INVALID(CatalogsItemValidationDetails PRODUCT_PRICE_INVALID) {
        this.PRODUCT_PRICE_INVALID = PRODUCT_PRICE_INVALID;
        return this;
    }

    /**
     * Get PRODUCT_PRICE_INVALID
     * @return PRODUCT_PRICE_INVALID
     */
    @Valid
    @Nullable
    @Schema(name = "PRODUCT_PRICE_INVALID", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_P_R_O_D_U_C_T_P_R_I_C_E_I_N_V_A_L_I_D)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public CatalogsItemValidationDetails getPRODUCTPRICEINVALID() {
        return PRODUCT_PRICE_INVALID;
    }

    @JsonProperty(JSON_PROPERTY_P_R_O_D_U_C_T_P_R_I_C_E_I_N_V_A_L_I_D)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setPRODUCTPRICEINVALID(CatalogsItemValidationDetails PRODUCT_PRICE_INVALID) {
        this.PRODUCT_PRICE_INVALID = PRODUCT_PRICE_INVALID;
    }

    public CatalogsItemValidationErrors TITLE_MISSING(CatalogsItemValidationDetails TITLE_MISSING) {
        this.TITLE_MISSING = TITLE_MISSING;
        return this;
    }

    /**
     * Get TITLE_MISSING
     * @return TITLE_MISSING
     */
    @Valid
    @Nullable
    @Schema(name = "TITLE_MISSING", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_T_I_T_L_E_M_I_S_S_I_N_G)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public CatalogsItemValidationDetails getTITLEMISSING() {
        return TITLE_MISSING;
    }

    @JsonProperty(JSON_PROPERTY_T_I_T_L_E_M_I_S_S_I_N_G)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setTITLEMISSING(CatalogsItemValidationDetails TITLE_MISSING) {
        this.TITLE_MISSING = TITLE_MISSING;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CatalogsItemValidationErrors catalogsItemValidationErrors = (CatalogsItemValidationErrors) o;
        return Objects.equals(this.ADULT_INVALID, catalogsItemValidationErrors.ADULT_INVALID) &&
            Objects.equals(this.ADWORDS_FORMAT_INVALID, catalogsItemValidationErrors.ADWORDS_FORMAT_INVALID) &&
            Objects.equals(this.AVAILABILITY_INVALID, catalogsItemValidationErrors.AVAILABILITY_INVALID) &&
            Objects.equals(this.BLOCKLISTED_IMAGE_SIGNATURE, catalogsItemValidationErrors.BLOCKLISTED_IMAGE_SIGNATURE) &&
            Objects.equals(this.DESCRIPTION_MISSING, catalogsItemValidationErrors.DESCRIPTION_MISSING) &&
            Objects.equals(this.DUPLICATE_PRODUCTS, catalogsItemValidationErrors.DUPLICATE_PRODUCTS) &&
            Objects.equals(this.IMAGE_LINK_INVALID, catalogsItemValidationErrors.IMAGE_LINK_INVALID) &&
            Objects.equals(this.IMAGE_LINK_LENGTH_TOO_LONG, catalogsItemValidationErrors.IMAGE_LINK_LENGTH_TOO_LONG) &&
            Objects.equals(this.IMAGE_LINK_MISSING, catalogsItemValidationErrors.IMAGE_LINK_MISSING) &&
            Objects.equals(this.INVALID_DOMAIN, catalogsItemValidationErrors.INVALID_DOMAIN) &&
            Objects.equals(this.ITEMID_MISSING, catalogsItemValidationErrors.ITEMID_MISSING) &&
            Objects.equals(this.ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE, catalogsItemValidationErrors.ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE) &&
            Objects.equals(this.LINK_FORMAT_INVALID, catalogsItemValidationErrors.LINK_FORMAT_INVALID) &&
            Objects.equals(this.LINK_LENGTH_TOO_LONG, catalogsItemValidationErrors.LINK_LENGTH_TOO_LONG) &&
            Objects.equals(this.LIST_PRICE_INVALID, catalogsItemValidationErrors.LIST_PRICE_INVALID) &&
            Objects.equals(this.MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED, catalogsItemValidationErrors.MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED) &&
            Objects.equals(this.PARSE_LINE_ERROR, catalogsItemValidationErrors.PARSE_LINE_ERROR) &&
            Objects.equals(this.PINJOIN_CONTENT_UNSAFE, catalogsItemValidationErrors.PINJOIN_CONTENT_UNSAFE) &&
            Objects.equals(this.PRICE_CANNOT_BE_DETERMINED, catalogsItemValidationErrors.PRICE_CANNOT_BE_DETERMINED) &&
            Objects.equals(this.PRICE_MISSING, catalogsItemValidationErrors.PRICE_MISSING) &&
            Objects.equals(this.PRODUCT_LINK_MISSING, catalogsItemValidationErrors.PRODUCT_LINK_MISSING) &&
            Objects.equals(this.PRODUCT_PRICE_INVALID, catalogsItemValidationErrors.PRODUCT_PRICE_INVALID) &&
            Objects.equals(this.TITLE_MISSING, catalogsItemValidationErrors.TITLE_MISSING);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ADULT_INVALID, ADWORDS_FORMAT_INVALID, AVAILABILITY_INVALID, BLOCKLISTED_IMAGE_SIGNATURE, DESCRIPTION_MISSING, DUPLICATE_PRODUCTS, IMAGE_LINK_INVALID, IMAGE_LINK_LENGTH_TOO_LONG, IMAGE_LINK_MISSING, INVALID_DOMAIN, ITEMID_MISSING, ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE, LINK_FORMAT_INVALID, LINK_LENGTH_TOO_LONG, LIST_PRICE_INVALID, MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED, PARSE_LINE_ERROR, PINJOIN_CONTENT_UNSAFE, PRICE_CANNOT_BE_DETERMINED, PRICE_MISSING, PRODUCT_LINK_MISSING, PRODUCT_PRICE_INVALID, TITLE_MISSING);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CatalogsItemValidationErrors {\n");
        sb.append("    ADULT_INVALID: ").append(toIndentedString(ADULT_INVALID)).append("\n");
        sb.append("    ADWORDS_FORMAT_INVALID: ").append(toIndentedString(ADWORDS_FORMAT_INVALID)).append("\n");
        sb.append("    AVAILABILITY_INVALID: ").append(toIndentedString(AVAILABILITY_INVALID)).append("\n");
        sb.append("    BLOCKLISTED_IMAGE_SIGNATURE: ").append(toIndentedString(BLOCKLISTED_IMAGE_SIGNATURE)).append("\n");
        sb.append("    DESCRIPTION_MISSING: ").append(toIndentedString(DESCRIPTION_MISSING)).append("\n");
        sb.append("    DUPLICATE_PRODUCTS: ").append(toIndentedString(DUPLICATE_PRODUCTS)).append("\n");
        sb.append("    IMAGE_LINK_INVALID: ").append(toIndentedString(IMAGE_LINK_INVALID)).append("\n");
        sb.append("    IMAGE_LINK_LENGTH_TOO_LONG: ").append(toIndentedString(IMAGE_LINK_LENGTH_TOO_LONG)).append("\n");
        sb.append("    IMAGE_LINK_MISSING: ").append(toIndentedString(IMAGE_LINK_MISSING)).append("\n");
        sb.append("    INVALID_DOMAIN: ").append(toIndentedString(INVALID_DOMAIN)).append("\n");
        sb.append("    ITEMID_MISSING: ").append(toIndentedString(ITEMID_MISSING)).append("\n");
        sb.append("    ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE: ").append(toIndentedString(ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE)).append("\n");
        sb.append("    LINK_FORMAT_INVALID: ").append(toIndentedString(LINK_FORMAT_INVALID)).append("\n");
        sb.append("    LINK_LENGTH_TOO_LONG: ").append(toIndentedString(LINK_LENGTH_TOO_LONG)).append("\n");
        sb.append("    LIST_PRICE_INVALID: ").append(toIndentedString(LIST_PRICE_INVALID)).append("\n");
        sb.append("    MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED: ").append(toIndentedString(MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED)).append("\n");
        sb.append("    PARSE_LINE_ERROR: ").append(toIndentedString(PARSE_LINE_ERROR)).append("\n");
        sb.append("    PINJOIN_CONTENT_UNSAFE: ").append(toIndentedString(PINJOIN_CONTENT_UNSAFE)).append("\n");
        sb.append("    PRICE_CANNOT_BE_DETERMINED: ").append(toIndentedString(PRICE_CANNOT_BE_DETERMINED)).append("\n");
        sb.append("    PRICE_MISSING: ").append(toIndentedString(PRICE_MISSING)).append("\n");
        sb.append("    PRODUCT_LINK_MISSING: ").append(toIndentedString(PRODUCT_LINK_MISSING)).append("\n");
        sb.append("    PRODUCT_PRICE_INVALID: ").append(toIndentedString(PRODUCT_PRICE_INVALID)).append("\n");
        sb.append("    TITLE_MISSING: ").append(toIndentedString(TITLE_MISSING)).append("\n");
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

