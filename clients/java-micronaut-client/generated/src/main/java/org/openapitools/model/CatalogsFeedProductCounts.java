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
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;

/**
 * The counts can be null early in the process.
 */
@ApiModel(description = "The counts can be null early in the process.")
@JsonPropertyOrder({
  CatalogsFeedProductCounts.JSON_PROPERTY_ORIGINAL
})
@JsonTypeName("CatalogsFeedProductCounts")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen", date="2022-05-07T06:38:30.955411Z[Etc/UTC]")
@Introspected
public class CatalogsFeedProductCounts {
    public static final String JSON_PROPERTY_ORIGINAL = "original";
    private Integer original;

    public CatalogsFeedProductCounts() {
    }

    public CatalogsFeedProductCounts original(Integer original) {
        this.original = original;
        return this;
    }

    /**
     * The number of products in the feed file
     * @return original
     **/
    @Nullable
    @ApiModelProperty(value = "The number of products in the feed file")
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CatalogsFeedProductCounts catalogsFeedProductCounts = (CatalogsFeedProductCounts) o;
        return Objects.equals(this.original, catalogsFeedProductCounts.original);
    }

    @Override
    public int hashCode() {
        return Objects.hash(original);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CatalogsFeedProductCounts {\n");
        sb.append("    original: ").append(toIndentedString(original)).append("\n");
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