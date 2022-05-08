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
 * ConditionFilter
 */
@JsonPropertyOrder({
  ConditionFilter.JSON_PROPERTY_C_O_N_D_I_T_I_O_N
})
@JsonTypeName("ConditionFilter")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautServerCodegen", date="2022-05-07T06:38:54.481854Z[Etc/UTC]")
@Introspected
public class ConditionFilter {
    public static final String JSON_PROPERTY_C_O_N_D_I_T_I_O_N = "CONDITION";
    private CatalogsProductGroupMultipleStringCriteria CONDITION;

    public ConditionFilter(CatalogsProductGroupMultipleStringCriteria CONDITION) {
        this.CONDITION = CONDITION;
    }

    public ConditionFilter CONDITION(CatalogsProductGroupMultipleStringCriteria CONDITION) {
        this.CONDITION = CONDITION;
        return this;
    }

    /**
     * Get CONDITION
     * @return CONDITION
     **/
    @NotNull
    @ApiModelProperty(required = true, value = "")
    @JsonProperty(JSON_PROPERTY_C_O_N_D_I_T_I_O_N)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
       public CatalogsProductGroupMultipleStringCriteria getCONDITION() {
        return CONDITION;
    }

    @JsonProperty(JSON_PROPERTY_C_O_N_D_I_T_I_O_N)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
       public void setCONDITION(CatalogsProductGroupMultipleStringCriteria CONDITION) {
        this.CONDITION = CONDITION;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ConditionFilter conditionFilter = (ConditionFilter) o;
        return Objects.equals(this.CONDITION, conditionFilter.CONDITION);
    }

    @Override
    public int hashCode() {
        return Objects.hash(CONDITION);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConditionFilter {\n");
        sb.append("    CONDITION: ").append(toIndentedString(CONDITION)).append("\n");
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