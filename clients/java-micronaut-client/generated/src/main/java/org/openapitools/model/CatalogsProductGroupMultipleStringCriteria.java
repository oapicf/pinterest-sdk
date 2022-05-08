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
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;

/**
 * CatalogsProductGroupMultipleStringCriteria
 */
@JsonPropertyOrder({
  CatalogsProductGroupMultipleStringCriteria.JSON_PROPERTY_VALUES,
  CatalogsProductGroupMultipleStringCriteria.JSON_PROPERTY_NEGATED
})
@JsonTypeName("CatalogsProductGroupMultipleStringCriteria")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen", date="2022-05-07T06:38:30.955411Z[Etc/UTC]")
@Introspected
public class CatalogsProductGroupMultipleStringCriteria {
    public static final String JSON_PROPERTY_VALUES = "values";
    private List<String> values = new ArrayList<String>();

    public static final String JSON_PROPERTY_NEGATED = "negated";
    private Boolean negated;

    public CatalogsProductGroupMultipleStringCriteria(List<String> values, Boolean negated) {
        this.values = values;
        this.negated = negated;
    }

    public CatalogsProductGroupMultipleStringCriteria values(List<String> values) {
        this.values = values;
        return this;
    }

    public CatalogsProductGroupMultipleStringCriteria addValuesItem(String valuesItem) {
        this.values.add(valuesItem);
        return this;
    }

    /**
     * Get values
     * @return values
     **/
    @NotNull
    @ApiModelProperty(required = true, value = "")
    @JsonProperty(JSON_PROPERTY_VALUES)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
       public List<String> getValues() {
        return values;
    }

    @JsonProperty(JSON_PROPERTY_VALUES)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
       public void setValues(List<String> values) {
        this.values = values;
    }

    public CatalogsProductGroupMultipleStringCriteria negated(Boolean negated) {
        this.negated = negated;
        return this;
    }

    /**
     * Get negated
     * @return negated
     **/
    @NotNull
    @ApiModelProperty(required = true, value = "")
    @JsonProperty(JSON_PROPERTY_NEGATED)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
       public Boolean getNegated() {
        return negated;
    }

    @JsonProperty(JSON_PROPERTY_NEGATED)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
       public void setNegated(Boolean negated) {
        this.negated = negated;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CatalogsProductGroupMultipleStringCriteria catalogsProductGroupMultipleStringCriteria = (CatalogsProductGroupMultipleStringCriteria) o;
        return Objects.equals(this.values, catalogsProductGroupMultipleStringCriteria.values) &&
            Objects.equals(this.negated, catalogsProductGroupMultipleStringCriteria.negated);
    }

    @Override
    public int hashCode() {
        return Objects.hash(values, negated);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CatalogsProductGroupMultipleStringCriteria {\n");
        sb.append("    values: ").append(toIndentedString(values)).append("\n");
        sb.append("    negated: ").append(toIndentedString(negated)).append("\n");
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