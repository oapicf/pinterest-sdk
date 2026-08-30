package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.TargetingTemplateStatus;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * CustomerSegment
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-08-30T09:53:34.136978074Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CustomerSegment {

  private String adAccountId;

  @Valid
  private List<String> audienceIds = new ArrayList<>();

  private Integer createdTime;

  private String id;

  private String name;

  private TargetingTemplateStatus status;

  private Integer updatedTime;

  public CustomerSegment() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CustomerSegment(List<String> audienceIds, String name) {
    this.audienceIds = audienceIds;
    this.name = name;
  }

  public CustomerSegment adAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
    return this;
  }

  /**
   * The ID of the ad account that this customer segment belongs to.
   * @return adAccountId
   */
  @Pattern(regexp = "^\\d+$") 
  @Schema(name = "ad_account_id", accessMode = Schema.AccessMode.READ_ONLY, description = "The ID of the ad account that this customer segment belongs to.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ad_account_id")
  public String getAdAccountId() {
    return adAccountId;
  }

  public void setAdAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
  }

  public CustomerSegment audienceIds(List<String> audienceIds) {
    this.audienceIds = audienceIds;
    return this;
  }

  public CustomerSegment addAudienceIdsItem(String audienceIdsItem) {
    if (this.audienceIds == null) {
      this.audienceIds = new ArrayList<>();
    }
    this.audienceIds.add(audienceIdsItem);
    return this;
  }

  /**
   * Audience IDs included in the customer segment.
   * @return audienceIds
   */
  @NotNull 
  @Schema(name = "audience_ids", description = "Audience IDs included in the customer segment.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("audience_ids")
  public List<String> getAudienceIds() {
    return audienceIds;
  }

  public void setAudienceIds(List<String> audienceIds) {
    this.audienceIds = audienceIds;
  }

  public CustomerSegment createdTime(Integer createdTime) {
    this.createdTime = createdTime;
    return this;
  }

  /**
   * Customer segment created time. Unix timestamp in seconds.
   * @return createdTime
   */
  
  @Schema(name = "created_time", accessMode = Schema.AccessMode.READ_ONLY, description = "Customer segment created time. Unix timestamp in seconds.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("created_time")
  public Integer getCreatedTime() {
    return createdTime;
  }

  public void setCreatedTime(Integer createdTime) {
    this.createdTime = createdTime;
  }

  public CustomerSegment id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Customer segment ID.
   * @return id
   */
  @Pattern(regexp = "^\\d+$") 
  @Schema(name = "id", accessMode = Schema.AccessMode.READ_ONLY, description = "Customer segment ID.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CustomerSegment name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Customer segment name.
   * @return name
   */
  @NotNull 
  @Schema(name = "name", description = "Customer segment name.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CustomerSegment status(TargetingTemplateStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Indicates whether the customer segment is active or deleted.
   * @return status
   */
  @Valid 
  @Schema(name = "status", accessMode = Schema.AccessMode.READ_ONLY, description = "Indicates whether the customer segment is active or deleted.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("status")
  public TargetingTemplateStatus getStatus() {
    return status;
  }

  public void setStatus(TargetingTemplateStatus status) {
    this.status = status;
  }

  public CustomerSegment updatedTime(Integer updatedTime) {
    this.updatedTime = updatedTime;
    return this;
  }

  /**
   * Customer segment updated time. Unix timestamp in seconds.
   * @return updatedTime
   */
  
  @Schema(name = "updated_time", accessMode = Schema.AccessMode.READ_ONLY, description = "Customer segment updated time. Unix timestamp in seconds.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("updated_time")
  public Integer getUpdatedTime() {
    return updatedTime;
  }

  public void setUpdatedTime(Integer updatedTime) {
    this.updatedTime = updatedTime;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerSegment customerSegment = (CustomerSegment) o;
    return Objects.equals(this.adAccountId, customerSegment.adAccountId) &&
        Objects.equals(this.audienceIds, customerSegment.audienceIds) &&
        Objects.equals(this.createdTime, customerSegment.createdTime) &&
        Objects.equals(this.id, customerSegment.id) &&
        Objects.equals(this.name, customerSegment.name) &&
        Objects.equals(this.status, customerSegment.status) &&
        Objects.equals(this.updatedTime, customerSegment.updatedTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adAccountId, audienceIds, createdTime, id, name, status, updatedTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerSegment {\n");
    sb.append("    adAccountId: ").append(toIndentedString(adAccountId)).append("\n");
    sb.append("    audienceIds: ").append(toIndentedString(audienceIds)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    updatedTime: ").append(toIndentedString(updatedTime)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

