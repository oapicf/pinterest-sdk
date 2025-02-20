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
import org.openapitools.model.CatalogsProductGroupFilterKeys;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;

/**
 * CatalogsProductGroupFiltersAnyOf
 */
@JsonPropertyOrder({
  CatalogsProductGroupFiltersAnyOf.JSON_PROPERTY_ANY_OF
})
@JsonTypeName("CatalogsProductGroupFiltersAnyOf")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen", date="2024-11-05T02:02:57.601423453Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@Introspected
public class CatalogsProductGroupFiltersAnyOf {
    public static final String JSON_PROPERTY_ANY_OF = "any_of";
    private List<CatalogsProductGroupFilterKeys> anyOf = new ArrayList<>();

    public CatalogsProductGroupFiltersAnyOf(List<CatalogsProductGroupFilterKeys> anyOf) {
        this.anyOf = anyOf;
    }

    public CatalogsProductGroupFiltersAnyOf anyOf(List<CatalogsProductGroupFilterKeys> anyOf) {
        this.anyOf = anyOf;
        return this;
    }

    public CatalogsProductGroupFiltersAnyOf addAnyOfItem(CatalogsProductGroupFilterKeys anyOfItem) {
        this.anyOf.add(anyOfItem);
        return this;
    }

    /**
     * Get anyOf
     * @return anyOf
     */
    @NotNull
    @JsonProperty(JSON_PROPERTY_ANY_OF)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public List<CatalogsProductGroupFilterKeys> getAnyOf() {
        return anyOf;
    }

    @JsonProperty(JSON_PROPERTY_ANY_OF)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setAnyOf(List<CatalogsProductGroupFilterKeys> anyOf) {
        this.anyOf = anyOf;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CatalogsProductGroupFiltersAnyOf catalogsProductGroupFiltersAnyOf = (CatalogsProductGroupFiltersAnyOf) o;
        return Objects.equals(this.anyOf, catalogsProductGroupFiltersAnyOf.anyOf);
    }

    @Override
    public int hashCode() {
        return Objects.hash(anyOf);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CatalogsProductGroupFiltersAnyOf {\n");
        sb.append("    anyOf: ").append(toIndentedString(anyOf)).append("\n");
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

