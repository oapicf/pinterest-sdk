package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.PinterestLibError;
import org.springframework.lang.Nullable;
import com.fasterxml.jackson.annotation.JsonInclude;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * CampaignAdPreviewCreate200ResponseInnerDataOneOf
 */

@JsonTypeName("campaign_ad_preview_create_200_response_inner_data_oneOf")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CampaignAdPreviewCreate200ResponseInnerDataOneOf implements CampaignAdPreviewCreate200ResponseInnerData {

  private PinterestLibError exceptions;

  public CampaignAdPreviewCreate200ResponseInnerDataOneOf() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CampaignAdPreviewCreate200ResponseInnerDataOneOf(PinterestLibError exceptions) {
    this.exceptions = exceptions;
  }

  public CampaignAdPreviewCreate200ResponseInnerDataOneOf exceptions(PinterestLibError exceptions) {
    this.exceptions = exceptions;
    return this;
  }

  /**
   * Get exceptions
   * @return exceptions
   */
  @NotNull @Valid 
  @Schema(name = "exceptions", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("exceptions")
  public PinterestLibError getExceptions() {
    return exceptions;
  }

  @JsonProperty("exceptions")
  public void setExceptions(PinterestLibError exceptions) {
    this.exceptions = exceptions;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignAdPreviewCreate200ResponseInnerDataOneOf campaignAdPreviewCreate200ResponseInnerDataOneOf = (CampaignAdPreviewCreate200ResponseInnerDataOneOf) o;
    return Objects.equals(this.exceptions, campaignAdPreviewCreate200ResponseInnerDataOneOf.exceptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exceptions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignAdPreviewCreate200ResponseInnerDataOneOf {\n");
    sb.append("    exceptions: ").append(toIndentedString(exceptions)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

