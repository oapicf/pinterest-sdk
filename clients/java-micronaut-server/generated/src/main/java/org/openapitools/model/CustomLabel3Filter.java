/*
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.3.0
 * Contact: pinterest-api@pinterest.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.model;

import java.util.Objects;
import java.util.Arrays;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CatalogsProductGroupMultipleStringCriteria;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;

/**
 * CustomLabel3Filter
 */
@JsonPropertyOrder({
  CustomLabel3Filter.JSON_PROPERTY_C_U_S_T_O_M_L_A_B_E_L3
})
@JsonTypeName("CustomLabel3Filter")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautServerCodegen", date="2022-05-07T06:38:54.481854Z[Etc/UTC]")
@Introspected
public class CustomLabel3Filter {
    public static final String JSON_PROPERTY_C_U_S_T_O_M_L_A_B_E_L3 = "CUSTOM_LABEL_3";
    private CatalogsProductGroupMultipleStringCriteria CUSTOM_LABEL_3;

    public CustomLabel3Filter(CatalogsProductGroupMultipleStringCriteria CUSTOM_LABEL_3) {
        this.CUSTOM_LABEL_3 = CUSTOM_LABEL_3;
    }

    public CustomLabel3Filter CUSTOM_LABEL_3(CatalogsProductGroupMultipleStringCriteria CUSTOM_LABEL_3) {
        this.CUSTOM_LABEL_3 = CUSTOM_LABEL_3;
        return this;
    }

    /**
     * Get CUSTOM_LABEL_3
     * @return CUSTOM_LABEL_3
     **/
    @NotNull
    @ApiModelProperty(required = true, value = "")
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CustomLabel3Filter customLabel3Filter = (CustomLabel3Filter) o;
        return Objects.equals(this.CUSTOM_LABEL_3, customLabel3Filter.CUSTOM_LABEL_3);
    }

    @Override
    public int hashCode() {
        return Objects.hash(CUSTOM_LABEL_3);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CustomLabel3Filter {\n");
        sb.append("    CUSTOM_LABEL_3: ").append(toIndentedString(CUSTOM_LABEL_3)).append("\n");
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