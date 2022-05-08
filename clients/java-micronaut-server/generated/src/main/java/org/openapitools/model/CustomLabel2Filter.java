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
 * CustomLabel2Filter
 */
@JsonPropertyOrder({
  CustomLabel2Filter.JSON_PROPERTY_C_U_S_T_O_M_L_A_B_E_L2
})
@JsonTypeName("CustomLabel2Filter")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautServerCodegen", date="2022-05-07T06:38:54.481854Z[Etc/UTC]")
@Introspected
public class CustomLabel2Filter {
    public static final String JSON_PROPERTY_C_U_S_T_O_M_L_A_B_E_L2 = "CUSTOM_LABEL_2";
    private CatalogsProductGroupMultipleStringCriteria CUSTOM_LABEL_2;

    public CustomLabel2Filter(CatalogsProductGroupMultipleStringCriteria CUSTOM_LABEL_2) {
        this.CUSTOM_LABEL_2 = CUSTOM_LABEL_2;
    }

    public CustomLabel2Filter CUSTOM_LABEL_2(CatalogsProductGroupMultipleStringCriteria CUSTOM_LABEL_2) {
        this.CUSTOM_LABEL_2 = CUSTOM_LABEL_2;
        return this;
    }

    /**
     * Get CUSTOM_LABEL_2
     * @return CUSTOM_LABEL_2
     **/
    @NotNull
    @ApiModelProperty(required = true, value = "")
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CustomLabel2Filter customLabel2Filter = (CustomLabel2Filter) o;
        return Objects.equals(this.CUSTOM_LABEL_2, customLabel2Filter.CUSTOM_LABEL_2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(CUSTOM_LABEL_2);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CustomLabel2Filter {\n");
        sb.append("    CUSTOM_LABEL_2: ").append(toIndentedString(CUSTOM_LABEL_2)).append("\n");
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