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
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.AudienceRule;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;

/**
 * Audience
 */
@JsonPropertyOrder({
  Audience.JSON_PROPERTY_AD_ACCOUNT_ID,
  Audience.JSON_PROPERTY_ID,
  Audience.JSON_PROPERTY_NAME,
  Audience.JSON_PROPERTY_AUDIENCE_TYPE,
  Audience.JSON_PROPERTY_DESCRIPTION,
  Audience.JSON_PROPERTY_RULE,
  Audience.JSON_PROPERTY_SIZE,
  Audience.JSON_PROPERTY_STATUS,
  Audience.JSON_PROPERTY_TYPE,
  Audience.JSON_PROPERTY_CREATED_TIMESTAMP,
  Audience.JSON_PROPERTY_UPDATED_TIMESTAMP
})
@JsonTypeName("Audience")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen", date="2024-03-14T23:01:49.950286870Z[Etc/UTC]", comments = "Generator version: 7.4.0")
@Introspected
public class Audience {
    public static final String JSON_PROPERTY_AD_ACCOUNT_ID = "ad_account_id";
    private String adAccountId;

    public static final String JSON_PROPERTY_ID = "id";
    private String id;

    public static final String JSON_PROPERTY_NAME = "name";
    private String name;

    public static final String JSON_PROPERTY_AUDIENCE_TYPE = "audience_type";
    private String audienceType;

    public static final String JSON_PROPERTY_DESCRIPTION = "description";
    private String description;

    public static final String JSON_PROPERTY_RULE = "rule";
    private AudienceRule rule;

    public static final String JSON_PROPERTY_SIZE = "size";
    private Integer size;

    public static final String JSON_PROPERTY_STATUS = "status";
    private String status;

    public static final String JSON_PROPERTY_TYPE = "type";
    private String type;

    public static final String JSON_PROPERTY_CREATED_TIMESTAMP = "created_timestamp";
    private Integer createdTimestamp;

    public static final String JSON_PROPERTY_UPDATED_TIMESTAMP = "updated_timestamp";
    private Integer updatedTimestamp;

    public Audience() {
    }

    public Audience adAccountId(String adAccountId) {
        this.adAccountId = adAccountId;
        return this;
    }

    /**
     * Ad account ID.
     * @return adAccountId
     **/
    @Nullable
    @Pattern(regexp="^\\d+$")
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

    public Audience id(String id) {
        this.id = id;
        return this;
    }

    /**
     * Audience ID.
     * @return id
     **/
    @Nullable
    @Pattern(regexp="^\\d+$")
    @JsonProperty(JSON_PROPERTY_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getId() {
        return id;
    }

    @JsonProperty(JSON_PROPERTY_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setId(String id) {
        this.id = id;
    }

    public Audience name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Audience name.
     * @return name
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_NAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getName() {
        return name;
    }

    @JsonProperty(JSON_PROPERTY_NAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setName(String name) {
        this.name = name;
    }

    public Audience audienceType(String audienceType) {
        this.audienceType = audienceType;
        return this;
    }

    /**
     * &lt;a href&#x3D;\&quot;/docs/reference/glossary/#Audience Types\&quot;&gt;Audience types&lt;/a&gt;: ACTALIKE, ENGAGEMENT, CUSTOMER_LIST and VISITOR
     * @return audienceType
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_AUDIENCE_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getAudienceType() {
        return audienceType;
    }

    @JsonProperty(JSON_PROPERTY_AUDIENCE_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setAudienceType(String audienceType) {
        this.audienceType = audienceType;
    }

    public Audience description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Audience description.
     * @return description
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_DESCRIPTION)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getDescription() {
        return description;
    }

    @JsonProperty(JSON_PROPERTY_DESCRIPTION)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setDescription(String description) {
        this.description = description;
    }

    public Audience rule(AudienceRule rule) {
        this.rule = rule;
        return this;
    }

    /**
     * Get rule
     * @return rule
     **/
    @Valid
    @Nullable
    @JsonProperty(JSON_PROPERTY_RULE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public AudienceRule getRule() {
        return rule;
    }

    @JsonProperty(JSON_PROPERTY_RULE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setRule(AudienceRule rule) {
        this.rule = rule;
    }

    public Audience size(Integer size) {
        this.size = size;
        return this;
    }

    /**
     * Audience size.
     * @return size
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_SIZE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Integer getSize() {
        return size;
    }

    @JsonProperty(JSON_PROPERTY_SIZE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setSize(Integer size) {
        this.size = size;
    }

    public Audience status(String status) {
        this.status = status;
        return this;
    }

    /**
     * Audience status. READY, INITIALIZING, TOO_SMALL - Each audience list needs to have at least 100 people with Pinterest accounts before you can start using it.
     * @return status
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_STATUS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getStatus() {
        return status;
    }

    @JsonProperty(JSON_PROPERTY_STATUS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setStatus(String status) {
        this.status = status;
    }

    public Audience type(String type) {
        this.type = type;
        return this;
    }

    /**
     * Always \&quot;audience\&quot;.
     * @return type
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getType() {
        return type;
    }

    @JsonProperty(JSON_PROPERTY_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setType(String type) {
        this.type = type;
    }

    public Audience createdTimestamp(Integer createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
        return this;
    }

    /**
     * Creation time. Unix timestamp in seconds.
     * @return createdTimestamp
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_CREATED_TIMESTAMP)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Integer getCreatedTimestamp() {
        return createdTimestamp;
    }

    @JsonProperty(JSON_PROPERTY_CREATED_TIMESTAMP)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setCreatedTimestamp(Integer createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
    }

    public Audience updatedTimestamp(Integer updatedTimestamp) {
        this.updatedTimestamp = updatedTimestamp;
        return this;
    }

    /**
     * Last update time. Unix timestamp in seconds.
     * @return updatedTimestamp
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_UPDATED_TIMESTAMP)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Integer getUpdatedTimestamp() {
        return updatedTimestamp;
    }

    @JsonProperty(JSON_PROPERTY_UPDATED_TIMESTAMP)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setUpdatedTimestamp(Integer updatedTimestamp) {
        this.updatedTimestamp = updatedTimestamp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Audience audience = (Audience) o;
        return Objects.equals(this.adAccountId, audience.adAccountId) &&
            Objects.equals(this.id, audience.id) &&
            Objects.equals(this.name, audience.name) &&
            Objects.equals(this.audienceType, audience.audienceType) &&
            Objects.equals(this.description, audience.description) &&
            Objects.equals(this.rule, audience.rule) &&
            Objects.equals(this.size, audience.size) &&
            Objects.equals(this.status, audience.status) &&
            Objects.equals(this.type, audience.type) &&
            Objects.equals(this.createdTimestamp, audience.createdTimestamp) &&
            Objects.equals(this.updatedTimestamp, audience.updatedTimestamp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(adAccountId, id, name, audienceType, description, rule, size, status, type, createdTimestamp, updatedTimestamp);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Audience {\n");
        sb.append("    adAccountId: ").append(toIndentedString(adAccountId)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    audienceType: ").append(toIndentedString(audienceType)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    rule: ").append(toIndentedString(rule)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    createdTimestamp: ").append(toIndentedString(createdTimestamp)).append("\n");
        sb.append("    updatedTimestamp: ").append(toIndentedString(updatedTimestamp)).append("\n");
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
