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

/**
 * The counts can be null early in the process.
 */
@JsonPropertyOrder({
  CatalogsFeedProductCounts.JSON_PROPERTY_ORIGINAL,
  CatalogsFeedProductCounts.JSON_PROPERTY_INGESTED
})
@JsonTypeName("CatalogsFeedProductCounts")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen", date="2024-11-05T02:02:57.601423453Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@Introspected
public class CatalogsFeedProductCounts {
    public static final String JSON_PROPERTY_ORIGINAL = "original";
    private Integer original;

    public static final String JSON_PROPERTY_INGESTED = "ingested";
    private Integer ingested;

    public CatalogsFeedProductCounts() {
    }

    public CatalogsFeedProductCounts original(Integer original) {
        this.original = original;
        return this;
    }

    /**
     * The number of products in the feed file.
     * @return original
     */
    @Nullable
    @JsonProperty(JSON_PROPERTY_ORIGINAL)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Integer getOriginal() {
        return original;
    }

    @JsonProperty(JSON_PROPERTY_ORIGINAL)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setOriginal(Integer original) {
        this.original = original;
    }

    public CatalogsFeedProductCounts ingested(Integer ingested) {
        this.ingested = ingested;
        return this;
    }

    /**
     * The number of products successfully ingested from the feed file.
     * @return ingested
     */
    @Nullable
    @JsonProperty(JSON_PROPERTY_INGESTED)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Integer getIngested() {
        return ingested;
    }

    @JsonProperty(JSON_PROPERTY_INGESTED)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setIngested(Integer ingested) {
        this.ingested = ingested;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CatalogsFeedProductCounts catalogsFeedProductCounts = (CatalogsFeedProductCounts) o;
        return Objects.equals(this.original, catalogsFeedProductCounts.original) &&
            Objects.equals(this.ingested, catalogsFeedProductCounts.ingested);
    }

    @Override
    public int hashCode() {
        return Objects.hash(original, ingested);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CatalogsFeedProductCounts {\n");
        sb.append("    original: ").append(toIndentedString(original)).append("\n");
        sb.append("    ingested: ").append(toIndentedString(ingested)).append("\n");
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

