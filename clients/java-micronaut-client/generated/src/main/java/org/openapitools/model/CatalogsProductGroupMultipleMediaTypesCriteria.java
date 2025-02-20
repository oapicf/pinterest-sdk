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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.MediaType;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;

/**
 * CatalogsProductGroupMultipleMediaTypesCriteria
 */
@JsonPropertyOrder({
  CatalogsProductGroupMultipleMediaTypesCriteria.JSON_PROPERTY_VALUES,
  CatalogsProductGroupMultipleMediaTypesCriteria.JSON_PROPERTY_NEGATED
})
@JsonTypeName("CatalogsProductGroupMultipleMediaTypesCriteria")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen", date="2024-11-05T02:02:57.601423453Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@Introspected
public class CatalogsProductGroupMultipleMediaTypesCriteria {
    public static final String JSON_PROPERTY_VALUES = "values";
    private List<MediaType> values = new ArrayList<>();

    public static final String JSON_PROPERTY_NEGATED = "negated";
    private Boolean negated = false;

    public CatalogsProductGroupMultipleMediaTypesCriteria(List<MediaType> values) {
        this.values = values;
    }

    public CatalogsProductGroupMultipleMediaTypesCriteria values(List<MediaType> values) {
        this.values = values;
        return this;
    }

    public CatalogsProductGroupMultipleMediaTypesCriteria addValuesItem(MediaType valuesItem) {
        this.values.add(valuesItem);
        return this;
    }

    /**
     * Get values
     * @return values
     */
    @NotNull
    @JsonProperty(JSON_PROPERTY_VALUES)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public List<MediaType> getValues() {
        return values;
    }

    @JsonProperty(JSON_PROPERTY_VALUES)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setValues(List<MediaType> values) {
        this.values = values;
    }

    public CatalogsProductGroupMultipleMediaTypesCriteria negated(Boolean negated) {
        this.negated = negated;
        return this;
    }

    /**
     * Get negated
     * @return negated
     */
    @Nullable
    @JsonProperty(JSON_PROPERTY_NEGATED)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Boolean getNegated() {
        return negated;
    }

    @JsonProperty(JSON_PROPERTY_NEGATED)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
        CatalogsProductGroupMultipleMediaTypesCriteria catalogsProductGroupMultipleMediaTypesCriteria = (CatalogsProductGroupMultipleMediaTypesCriteria) o;
        return Objects.equals(this.values, catalogsProductGroupMultipleMediaTypesCriteria.values) &&
            Objects.equals(this.negated, catalogsProductGroupMultipleMediaTypesCriteria.negated);
    }

    @Override
    public int hashCode() {
        return Objects.hash(values, negated);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CatalogsProductGroupMultipleMediaTypesCriteria {\n");
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

