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
import org.openapitools.model.CatalogsProductGroupMultipleStringListCriteria;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * GoogleProductCategory5Filter
 */
@JsonPropertyOrder({
  GoogleProductCategory5Filter.JSON_PROPERTY_G_O_O_G_L_E_P_R_O_D_U_C_T_C_A_T_E_G_O_R_Y5
})
@JsonTypeName("GoogleProductCategory5Filter")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautServerCodegen", date="2024-11-05T02:03:37.829873561Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@Introspected
public class GoogleProductCategory5Filter {
    public static final String JSON_PROPERTY_G_O_O_G_L_E_P_R_O_D_U_C_T_C_A_T_E_G_O_R_Y5 = "GOOGLE_PRODUCT_CATEGORY_5";
    private CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_5;

    public GoogleProductCategory5Filter(CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_5) {
        this.GOOGLE_PRODUCT_CATEGORY_5 = GOOGLE_PRODUCT_CATEGORY_5;
    }

    public GoogleProductCategory5Filter GOOGLE_PRODUCT_CATEGORY_5(CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_5) {
        this.GOOGLE_PRODUCT_CATEGORY_5 = GOOGLE_PRODUCT_CATEGORY_5;
        return this;
    }

    /**
     * Get GOOGLE_PRODUCT_CATEGORY_5
     * @return GOOGLE_PRODUCT_CATEGORY_5
     */
    @NotNull
    @Schema(name = "GOOGLE_PRODUCT_CATEGORY_5", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty(JSON_PROPERTY_G_O_O_G_L_E_P_R_O_D_U_C_T_C_A_T_E_G_O_R_Y5)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public CatalogsProductGroupMultipleStringListCriteria getGOOGLEPRODUCTCATEGORY5() {
        return GOOGLE_PRODUCT_CATEGORY_5;
    }

    @JsonProperty(JSON_PROPERTY_G_O_O_G_L_E_P_R_O_D_U_C_T_C_A_T_E_G_O_R_Y5)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setGOOGLEPRODUCTCATEGORY5(CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_5) {
        this.GOOGLE_PRODUCT_CATEGORY_5 = GOOGLE_PRODUCT_CATEGORY_5;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GoogleProductCategory5Filter googleProductCategory5Filter = (GoogleProductCategory5Filter) o;
        return Objects.equals(this.GOOGLE_PRODUCT_CATEGORY_5, googleProductCategory5Filter.GOOGLE_PRODUCT_CATEGORY_5);
    }

    @Override
    public int hashCode() {
        return Objects.hash(GOOGLE_PRODUCT_CATEGORY_5);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GoogleProductCategory5Filter {\n");
        sb.append("    GOOGLE_PRODUCT_CATEGORY_5: ").append(toIndentedString(GOOGLE_PRODUCT_CATEGORY_5)).append("\n");
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

