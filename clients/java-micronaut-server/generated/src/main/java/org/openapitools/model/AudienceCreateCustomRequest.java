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
import org.openapitools.model.AudienceDataParty;
import org.openapitools.model.AudienceRule;
import org.openapitools.model.AudienceSharingType;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * AudienceCreateCustomRequest
 */
@JsonPropertyOrder({
  AudienceCreateCustomRequest.JSON_PROPERTY_AD_ACCOUNT_ID,
  AudienceCreateCustomRequest.JSON_PROPERTY_NAME,
  AudienceCreateCustomRequest.JSON_PROPERTY_RULE,
  AudienceCreateCustomRequest.JSON_PROPERTY_SHARING_TYPE,
  AudienceCreateCustomRequest.JSON_PROPERTY_DATA_PARTY,
  AudienceCreateCustomRequest.JSON_PROPERTY_CATEGORY
})
@JsonTypeName("AudienceCreateCustomRequest")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautServerCodegen", date="2024-03-14T23:02:10.408800522Z[Etc/UTC]", comments = "Generator version: 7.4.0")
@Introspected
public class AudienceCreateCustomRequest {
    public static final String JSON_PROPERTY_AD_ACCOUNT_ID = "ad_account_id";
    private String adAccountId;

    public static final String JSON_PROPERTY_NAME = "name";
    private String name;

    public static final String JSON_PROPERTY_RULE = "rule";
    private AudienceRule rule;

    public static final String JSON_PROPERTY_SHARING_TYPE = "sharing_type";
    private AudienceSharingType sharingType;

    public static final String JSON_PROPERTY_DATA_PARTY = "data_party";
    private AudienceDataParty dataParty;

    public static final String JSON_PROPERTY_CATEGORY = "category";
    private String category;

    public AudienceCreateCustomRequest(String name, AudienceRule rule, AudienceSharingType sharingType, AudienceDataParty dataParty) {
        this.name = name;
        this.rule = rule;
        this.sharingType = sharingType;
        this.dataParty = dataParty;
    }

    public AudienceCreateCustomRequest adAccountId(String adAccountId) {
        this.adAccountId = adAccountId;
        return this;
    }

    /**
     * Ad account ID.
     * @return adAccountId
     **/
    @Nullable
    @Pattern(regexp="^\\d+$")
    @Schema(name = "ad_account_id", example = "549755885175", description = "Ad account ID.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_AD_ACCOUNT_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getAdAccountId() {
        return adAccountId;
    }

    @JsonProperty(JSON_PROPERTY_AD_ACCOUNT_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setAdAccountId(String adAccountId) {
        this.adAccountId = adAccountId;
    }

    public AudienceCreateCustomRequest name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Audience name.
     * @return name
     **/
    @NotNull
    @Schema(name = "name", example = "string", description = "Audience name.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty(JSON_PROPERTY_NAME)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getName() {
        return name;
    }

    @JsonProperty(JSON_PROPERTY_NAME)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setName(String name) {
        this.name = name;
    }

    public AudienceCreateCustomRequest rule(AudienceRule rule) {
        this.rule = rule;
        return this;
    }

    /**
     * Get rule
     * @return rule
     **/
    @Valid
    @NotNull
    @Schema(name = "rule", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty(JSON_PROPERTY_RULE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public AudienceRule getRule() {
        return rule;
    }

    @JsonProperty(JSON_PROPERTY_RULE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setRule(AudienceRule rule) {
        this.rule = rule;
    }

    public AudienceCreateCustomRequest sharingType(AudienceSharingType sharingType) {
        this.sharingType = sharingType;
        return this;
    }

    /**
     * Get sharingType
     * @return sharingType
     **/
    @NotNull
    @Schema(name = "sharing_type", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty(JSON_PROPERTY_SHARING_TYPE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public AudienceSharingType getSharingType() {
        return sharingType;
    }

    @JsonProperty(JSON_PROPERTY_SHARING_TYPE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setSharingType(AudienceSharingType sharingType) {
        this.sharingType = sharingType;
    }

    public AudienceCreateCustomRequest dataParty(AudienceDataParty dataParty) {
        this.dataParty = dataParty;
        return this;
    }

    /**
     * Get dataParty
     * @return dataParty
     **/
    @NotNull
    @Schema(name = "data_party", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty(JSON_PROPERTY_DATA_PARTY)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public AudienceDataParty getDataParty() {
        return dataParty;
    }

    @JsonProperty(JSON_PROPERTY_DATA_PARTY)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setDataParty(AudienceDataParty dataParty) {
        this.dataParty = dataParty;
    }

    public AudienceCreateCustomRequest category(String category) {
        this.category = category;
        return this;
    }

    /**
     * Get category
     * @return category
     **/
    @Nullable
    @Schema(name = "category", example = "DLX Demographics", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_CATEGORY)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getCategory() {
        return category;
    }

    @JsonProperty(JSON_PROPERTY_CATEGORY)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AudienceCreateCustomRequest audienceCreateCustomRequest = (AudienceCreateCustomRequest) o;
        return Objects.equals(this.adAccountId, audienceCreateCustomRequest.adAccountId) &&
            Objects.equals(this.name, audienceCreateCustomRequest.name) &&
            Objects.equals(this.rule, audienceCreateCustomRequest.rule) &&
            Objects.equals(this.sharingType, audienceCreateCustomRequest.sharingType) &&
            Objects.equals(this.dataParty, audienceCreateCustomRequest.dataParty) &&
            Objects.equals(this.category, audienceCreateCustomRequest.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(adAccountId, name, rule, sharingType, dataParty, category);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AudienceCreateCustomRequest {\n");
        sb.append("    adAccountId: ").append(toIndentedString(adAccountId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    rule: ").append(toIndentedString(rule)).append("\n");
        sb.append("    sharingType: ").append(toIndentedString(sharingType)).append("\n");
        sb.append("    dataParty: ").append(toIndentedString(dataParty)).append("\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
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
