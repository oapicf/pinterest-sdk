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
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * CatalogsFeedIngestionErrors
 */
@JsonPropertyOrder({
  CatalogsFeedIngestionErrors.JSON_PROPERTY_L_I_N_E_L_E_V_E_L_I_N_T_E_R_N_A_L_E_R_R_O_R,
  CatalogsFeedIngestionErrors.JSON_PROPERTY_L_A_R_G_E_P_R_O_D_U_C_T_C_O_U_N_T_D_E_C_R_E_A_S_E,
  CatalogsFeedIngestionErrors.JSON_PROPERTY_A_C_C_O_U_N_T_F_L_A_G_G_E_D,
  CatalogsFeedIngestionErrors.JSON_PROPERTY_I_M_A_G_E_L_E_V_E_L_I_N_T_E_R_N_A_L_E_R_R_O_R,
  CatalogsFeedIngestionErrors.JSON_PROPERTY_I_M_A_G_E_F_I_L_E_N_O_T_A_C_C_E_S_S_I_B_L_E,
  CatalogsFeedIngestionErrors.JSON_PROPERTY_I_M_A_G_E_M_A_L_F_O_R_M_E_D_U_R_L,
  CatalogsFeedIngestionErrors.JSON_PROPERTY_I_M_A_G_E_F_I_L_E_N_O_T_F_O_U_N_D,
  CatalogsFeedIngestionErrors.JSON_PROPERTY_I_M_A_G_E_I_N_V_A_L_I_D_F_I_L_E
})
@JsonTypeName("CatalogsFeedIngestionErrors")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautServerCodegen", date="2024-11-05T02:03:37.829873561Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@Introspected
public class CatalogsFeedIngestionErrors {
    public static final String JSON_PROPERTY_L_I_N_E_L_E_V_E_L_I_N_T_E_R_N_A_L_E_R_R_O_R = "LINE_LEVEL_INTERNAL_ERROR";
    private Integer LINE_LEVEL_INTERNAL_ERROR;

    /**
     * The product count has decreased by more than 99% compared to the last successful ingestion.
     */
    public enum LARGEPRODUCTCOUNTDECREASEEnum {
        NUMBER_1(1);

        private Integer value;

        LARGEPRODUCTCOUNTDECREASEEnum(Integer value) {
            this.value = value;
        }

        @JsonValue
        public Integer getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static LARGEPRODUCTCOUNTDECREASEEnum fromValue(Integer value) {
            for (LARGEPRODUCTCOUNTDECREASEEnum b : LARGEPRODUCTCOUNTDECREASEEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }
    public static final String JSON_PROPERTY_L_A_R_G_E_P_R_O_D_U_C_T_C_O_U_N_T_D_E_C_R_E_A_S_E = "LARGE_PRODUCT_COUNT_DECREASE";
    private LARGEPRODUCTCOUNTDECREASEEnum LARGE_PRODUCT_COUNT_DECREASE;

    public static final String JSON_PROPERTY_A_C_C_O_U_N_T_F_L_A_G_G_E_D = "ACCOUNT_FLAGGED";
    private Integer ACCOUNT_FLAGGED;

    public static final String JSON_PROPERTY_I_M_A_G_E_L_E_V_E_L_I_N_T_E_R_N_A_L_E_R_R_O_R = "IMAGE_LEVEL_INTERNAL_ERROR";
    private Integer IMAGE_LEVEL_INTERNAL_ERROR;

    public static final String JSON_PROPERTY_I_M_A_G_E_F_I_L_E_N_O_T_A_C_C_E_S_S_I_B_L_E = "IMAGE_FILE_NOT_ACCESSIBLE";
    private Integer IMAGE_FILE_NOT_ACCESSIBLE;

    public static final String JSON_PROPERTY_I_M_A_G_E_M_A_L_F_O_R_M_E_D_U_R_L = "IMAGE_MALFORMED_URL";
    private Integer IMAGE_MALFORMED_URL;

    public static final String JSON_PROPERTY_I_M_A_G_E_F_I_L_E_N_O_T_F_O_U_N_D = "IMAGE_FILE_NOT_FOUND";
    private Integer IMAGE_FILE_NOT_FOUND;

    public static final String JSON_PROPERTY_I_M_A_G_E_I_N_V_A_L_I_D_F_I_L_E = "IMAGE_INVALID_FILE";
    private Integer IMAGE_INVALID_FILE;

    public CatalogsFeedIngestionErrors() {
    }

    public CatalogsFeedIngestionErrors LINE_LEVEL_INTERNAL_ERROR(Integer LINE_LEVEL_INTERNAL_ERROR) {
        this.LINE_LEVEL_INTERNAL_ERROR = LINE_LEVEL_INTERNAL_ERROR;
        return this;
    }

    /**
     * We experienced a technical difficulty and were unable to ingest this some items. The next ingestion will happen in 24 hours.
     * @return LINE_LEVEL_INTERNAL_ERROR
     */
    @Nullable
    @Schema(name = "LINE_LEVEL_INTERNAL_ERROR", description = "We experienced a technical difficulty and were unable to ingest this some items. The next ingestion will happen in 24 hours.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_L_I_N_E_L_E_V_E_L_I_N_T_E_R_N_A_L_E_R_R_O_R)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Integer getLINELEVELINTERNALERROR() {
        return LINE_LEVEL_INTERNAL_ERROR;
    }

    @JsonProperty(JSON_PROPERTY_L_I_N_E_L_E_V_E_L_I_N_T_E_R_N_A_L_E_R_R_O_R)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setLINELEVELINTERNALERROR(Integer LINE_LEVEL_INTERNAL_ERROR) {
        this.LINE_LEVEL_INTERNAL_ERROR = LINE_LEVEL_INTERNAL_ERROR;
    }

    public CatalogsFeedIngestionErrors LARGE_PRODUCT_COUNT_DECREASE(LARGEPRODUCTCOUNTDECREASEEnum LARGE_PRODUCT_COUNT_DECREASE) {
        this.LARGE_PRODUCT_COUNT_DECREASE = LARGE_PRODUCT_COUNT_DECREASE;
        return this;
    }

    /**
     * The product count has decreased by more than 99% compared to the last successful ingestion.
     * @return LARGE_PRODUCT_COUNT_DECREASE
     */
    @Nullable
    @Schema(name = "LARGE_PRODUCT_COUNT_DECREASE", description = "The product count has decreased by more than 99% compared to the last successful ingestion.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_L_A_R_G_E_P_R_O_D_U_C_T_C_O_U_N_T_D_E_C_R_E_A_S_E)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public LARGEPRODUCTCOUNTDECREASEEnum getLARGEPRODUCTCOUNTDECREASE() {
        return LARGE_PRODUCT_COUNT_DECREASE;
    }

    @JsonProperty(JSON_PROPERTY_L_A_R_G_E_P_R_O_D_U_C_T_C_O_U_N_T_D_E_C_R_E_A_S_E)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setLARGEPRODUCTCOUNTDECREASE(LARGEPRODUCTCOUNTDECREASEEnum LARGE_PRODUCT_COUNT_DECREASE) {
        this.LARGE_PRODUCT_COUNT_DECREASE = LARGE_PRODUCT_COUNT_DECREASE;
    }

    public CatalogsFeedIngestionErrors ACCOUNT_FLAGGED(Integer ACCOUNT_FLAGGED) {
        this.ACCOUNT_FLAGGED = ACCOUNT_FLAGGED;
        return this;
    }

    /**
     * We detected an issue with your account and are not currently ingesting your items. Please review our policies at policy.pinterest.com/community-guidelines#section-spam or contact us at help.pinterest.com/contact for more information.
     * @return ACCOUNT_FLAGGED
     */
    @Nullable
    @Schema(name = "ACCOUNT_FLAGGED", description = "We detected an issue with your account and are not currently ingesting your items. Please review our policies at policy.pinterest.com/community-guidelines#section-spam or contact us at help.pinterest.com/contact for more information.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_A_C_C_O_U_N_T_F_L_A_G_G_E_D)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Integer getACCOUNTFLAGGED() {
        return ACCOUNT_FLAGGED;
    }

    @JsonProperty(JSON_PROPERTY_A_C_C_O_U_N_T_F_L_A_G_G_E_D)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setACCOUNTFLAGGED(Integer ACCOUNT_FLAGGED) {
        this.ACCOUNT_FLAGGED = ACCOUNT_FLAGGED;
    }

    public CatalogsFeedIngestionErrors IMAGE_LEVEL_INTERNAL_ERROR(Integer IMAGE_LEVEL_INTERNAL_ERROR) {
        this.IMAGE_LEVEL_INTERNAL_ERROR = IMAGE_LEVEL_INTERNAL_ERROR;
        return this;
    }

    /**
     * We experienced a technical difficulty and were unable to download some images. The next download attempt will happen in 24 hours.
     * @return IMAGE_LEVEL_INTERNAL_ERROR
     */
    @Nullable
    @Schema(name = "IMAGE_LEVEL_INTERNAL_ERROR", description = "We experienced a technical difficulty and were unable to download some images. The next download attempt will happen in 24 hours.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_I_M_A_G_E_L_E_V_E_L_I_N_T_E_R_N_A_L_E_R_R_O_R)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Integer getIMAGELEVELINTERNALERROR() {
        return IMAGE_LEVEL_INTERNAL_ERROR;
    }

    @JsonProperty(JSON_PROPERTY_I_M_A_G_E_L_E_V_E_L_I_N_T_E_R_N_A_L_E_R_R_O_R)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setIMAGELEVELINTERNALERROR(Integer IMAGE_LEVEL_INTERNAL_ERROR) {
        this.IMAGE_LEVEL_INTERNAL_ERROR = IMAGE_LEVEL_INTERNAL_ERROR;
    }

    public CatalogsFeedIngestionErrors IMAGE_FILE_NOT_ACCESSIBLE(Integer IMAGE_FILE_NOT_ACCESSIBLE) {
        this.IMAGE_FILE_NOT_ACCESSIBLE = IMAGE_FILE_NOT_ACCESSIBLE;
        return this;
    }

    /**
     * Image files are unreadable. Please upload new files to continue.
     * @return IMAGE_FILE_NOT_ACCESSIBLE
     */
    @Nullable
    @Schema(name = "IMAGE_FILE_NOT_ACCESSIBLE", description = "Image files are unreadable. Please upload new files to continue.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_I_M_A_G_E_F_I_L_E_N_O_T_A_C_C_E_S_S_I_B_L_E)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Integer getIMAGEFILENOTACCESSIBLE() {
        return IMAGE_FILE_NOT_ACCESSIBLE;
    }

    @JsonProperty(JSON_PROPERTY_I_M_A_G_E_F_I_L_E_N_O_T_A_C_C_E_S_S_I_B_L_E)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setIMAGEFILENOTACCESSIBLE(Integer IMAGE_FILE_NOT_ACCESSIBLE) {
        this.IMAGE_FILE_NOT_ACCESSIBLE = IMAGE_FILE_NOT_ACCESSIBLE;
    }

    public CatalogsFeedIngestionErrors IMAGE_MALFORMED_URL(Integer IMAGE_MALFORMED_URL) {
        this.IMAGE_MALFORMED_URL = IMAGE_MALFORMED_URL;
        return this;
    }

    /**
     * Image files are unreadable. Please check your link and upload new files to continue.
     * @return IMAGE_MALFORMED_URL
     */
    @Nullable
    @Schema(name = "IMAGE_MALFORMED_URL", description = "Image files are unreadable. Please check your link and upload new files to continue.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_I_M_A_G_E_M_A_L_F_O_R_M_E_D_U_R_L)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Integer getIMAGEMALFORMEDURL() {
        return IMAGE_MALFORMED_URL;
    }

    @JsonProperty(JSON_PROPERTY_I_M_A_G_E_M_A_L_F_O_R_M_E_D_U_R_L)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setIMAGEMALFORMEDURL(Integer IMAGE_MALFORMED_URL) {
        this.IMAGE_MALFORMED_URL = IMAGE_MALFORMED_URL;
    }

    public CatalogsFeedIngestionErrors IMAGE_FILE_NOT_FOUND(Integer IMAGE_FILE_NOT_FOUND) {
        this.IMAGE_FILE_NOT_FOUND = IMAGE_FILE_NOT_FOUND;
        return this;
    }

    /**
     * Image files are unreadable. Please upload new files to continue.
     * @return IMAGE_FILE_NOT_FOUND
     */
    @Nullable
    @Schema(name = "IMAGE_FILE_NOT_FOUND", description = "Image files are unreadable. Please upload new files to continue.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_I_M_A_G_E_F_I_L_E_N_O_T_F_O_U_N_D)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Integer getIMAGEFILENOTFOUND() {
        return IMAGE_FILE_NOT_FOUND;
    }

    @JsonProperty(JSON_PROPERTY_I_M_A_G_E_F_I_L_E_N_O_T_F_O_U_N_D)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setIMAGEFILENOTFOUND(Integer IMAGE_FILE_NOT_FOUND) {
        this.IMAGE_FILE_NOT_FOUND = IMAGE_FILE_NOT_FOUND;
    }

    public CatalogsFeedIngestionErrors IMAGE_INVALID_FILE(Integer IMAGE_INVALID_FILE) {
        this.IMAGE_INVALID_FILE = IMAGE_INVALID_FILE;
        return this;
    }

    /**
     * Image files are unreadable. Please upload new files to continue.
     * @return IMAGE_INVALID_FILE
     */
    @Nullable
    @Schema(name = "IMAGE_INVALID_FILE", description = "Image files are unreadable. Please upload new files to continue.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_I_M_A_G_E_I_N_V_A_L_I_D_F_I_L_E)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Integer getIMAGEINVALIDFILE() {
        return IMAGE_INVALID_FILE;
    }

    @JsonProperty(JSON_PROPERTY_I_M_A_G_E_I_N_V_A_L_I_D_F_I_L_E)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setIMAGEINVALIDFILE(Integer IMAGE_INVALID_FILE) {
        this.IMAGE_INVALID_FILE = IMAGE_INVALID_FILE;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CatalogsFeedIngestionErrors catalogsFeedIngestionErrors = (CatalogsFeedIngestionErrors) o;
        return Objects.equals(this.LINE_LEVEL_INTERNAL_ERROR, catalogsFeedIngestionErrors.LINE_LEVEL_INTERNAL_ERROR) &&
            Objects.equals(this.LARGE_PRODUCT_COUNT_DECREASE, catalogsFeedIngestionErrors.LARGE_PRODUCT_COUNT_DECREASE) &&
            Objects.equals(this.ACCOUNT_FLAGGED, catalogsFeedIngestionErrors.ACCOUNT_FLAGGED) &&
            Objects.equals(this.IMAGE_LEVEL_INTERNAL_ERROR, catalogsFeedIngestionErrors.IMAGE_LEVEL_INTERNAL_ERROR) &&
            Objects.equals(this.IMAGE_FILE_NOT_ACCESSIBLE, catalogsFeedIngestionErrors.IMAGE_FILE_NOT_ACCESSIBLE) &&
            Objects.equals(this.IMAGE_MALFORMED_URL, catalogsFeedIngestionErrors.IMAGE_MALFORMED_URL) &&
            Objects.equals(this.IMAGE_FILE_NOT_FOUND, catalogsFeedIngestionErrors.IMAGE_FILE_NOT_FOUND) &&
            Objects.equals(this.IMAGE_INVALID_FILE, catalogsFeedIngestionErrors.IMAGE_INVALID_FILE);
    }

    @Override
    public int hashCode() {
        return Objects.hash(LINE_LEVEL_INTERNAL_ERROR, LARGE_PRODUCT_COUNT_DECREASE, ACCOUNT_FLAGGED, IMAGE_LEVEL_INTERNAL_ERROR, IMAGE_FILE_NOT_ACCESSIBLE, IMAGE_MALFORMED_URL, IMAGE_FILE_NOT_FOUND, IMAGE_INVALID_FILE);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CatalogsFeedIngestionErrors {\n");
        sb.append("    LINE_LEVEL_INTERNAL_ERROR: ").append(toIndentedString(LINE_LEVEL_INTERNAL_ERROR)).append("\n");
        sb.append("    LARGE_PRODUCT_COUNT_DECREASE: ").append(toIndentedString(LARGE_PRODUCT_COUNT_DECREASE)).append("\n");
        sb.append("    ACCOUNT_FLAGGED: ").append(toIndentedString(ACCOUNT_FLAGGED)).append("\n");
        sb.append("    IMAGE_LEVEL_INTERNAL_ERROR: ").append(toIndentedString(IMAGE_LEVEL_INTERNAL_ERROR)).append("\n");
        sb.append("    IMAGE_FILE_NOT_ACCESSIBLE: ").append(toIndentedString(IMAGE_FILE_NOT_ACCESSIBLE)).append("\n");
        sb.append("    IMAGE_MALFORMED_URL: ").append(toIndentedString(IMAGE_MALFORMED_URL)).append("\n");
        sb.append("    IMAGE_FILE_NOT_FOUND: ").append(toIndentedString(IMAGE_FILE_NOT_FOUND)).append("\n");
        sb.append("    IMAGE_INVALID_FILE: ").append(toIndentedString(IMAGE_INVALID_FILE)).append("\n");
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

