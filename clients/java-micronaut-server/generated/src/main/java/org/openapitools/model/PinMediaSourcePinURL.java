/*
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.12.0
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
 * Pin URL-based media source for product pin creation. Currently the field is only available to a list of beta users.
 */
@Schema(name = "PinMediaSourcePinURL", description = "Pin URL-based media source for product pin creation. Currently the field is only available to a list of beta users.")
@JsonPropertyOrder({
  PinMediaSourcePinURL.JSON_PROPERTY_SOURCE_TYPE,
  PinMediaSourcePinURL.JSON_PROPERTY_IS_AFFILIATE_LINK
})
@JsonTypeName("PinMediaSourcePinURL")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautServerCodegen", date="2024-03-14T23:02:10.408800522Z[Etc/UTC]", comments = "Generator version: 7.4.0")
@Introspected
public class PinMediaSourcePinURL {
    /**
     * Gets or Sets sourceType
     */
    public enum SourceTypeEnum {
        PIN_URL("pin_url");

        private String value;

        SourceTypeEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static SourceTypeEnum fromValue(String value) {
            for (SourceTypeEnum b : SourceTypeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }
    public static final String JSON_PROPERTY_SOURCE_TYPE = "source_type";
    private SourceTypeEnum sourceType;

    public static final String JSON_PROPERTY_IS_AFFILIATE_LINK = "is_affiliate_link";
    private Boolean isAffiliateLink = false;

    public PinMediaSourcePinURL(SourceTypeEnum sourceType) {
        this.sourceType = sourceType;
    }

    public PinMediaSourcePinURL sourceType(SourceTypeEnum sourceType) {
        this.sourceType = sourceType;
        return this;
    }

    /**
     * Get sourceType
     * @return sourceType
     **/
    @NotNull
    @Schema(name = "source_type", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty(JSON_PROPERTY_SOURCE_TYPE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public SourceTypeEnum getSourceType() {
        return sourceType;
    }

    @JsonProperty(JSON_PROPERTY_SOURCE_TYPE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setSourceType(SourceTypeEnum sourceType) {
        this.sourceType = sourceType;
    }

    public PinMediaSourcePinURL isAffiliateLink(Boolean isAffiliateLink) {
        this.isAffiliateLink = isAffiliateLink;
        return this;
    }

    /**
     * This is an affiliate link or sponsored product. The FTC requires disclosure for paid partnerships and affiliate products.
     * @return isAffiliateLink
     **/
    @Nullable
    @Schema(name = "is_affiliate_link", description = "This is an affiliate link or sponsored product. The FTC requires disclosure for paid partnerships and affiliate products.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_IS_AFFILIATE_LINK)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Boolean getIsAffiliateLink() {
        return isAffiliateLink;
    }

    @JsonProperty(JSON_PROPERTY_IS_AFFILIATE_LINK)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setIsAffiliateLink(Boolean isAffiliateLink) {
        this.isAffiliateLink = isAffiliateLink;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PinMediaSourcePinURL pinMediaSourcePinURL = (PinMediaSourcePinURL) o;
        return Objects.equals(this.sourceType, pinMediaSourcePinURL.sourceType) &&
            Objects.equals(this.isAffiliateLink, pinMediaSourcePinURL.isAffiliateLink);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sourceType, isAffiliateLink);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PinMediaSourcePinURL {\n");
        sb.append("    sourceType: ").append(toIndentedString(sourceType)).append("\n");
        sb.append("    isAffiliateLink: ").append(toIndentedString(isAffiliateLink)).append("\n");
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
