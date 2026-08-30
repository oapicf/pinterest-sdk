package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Resource create operation model.
 */

@Schema(name = "AppsflyerAudienceSyncCreate", description = "Resource create operation model.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class AppsflyerAudienceSyncCreate {

  private String containerId;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String urlAdidSha256;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String urlEmailSha256;

  public AppsflyerAudienceSyncCreate() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public AppsflyerAudienceSyncCreate(String containerId) {
    this.containerId = containerId;
  }

  public AppsflyerAudienceSyncCreate containerId(String containerId) {
    this.containerId = containerId;
    return this;
  }

  /**
   * The container ID of the audience
   * @return containerId
   */
  @NotNull 
  @Schema(name = "container_id", description = "The container ID of the audience", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("container_id")
  public String getContainerId() {
    return containerId;
  }

  @JsonProperty("container_id")
  public void setContainerId(String containerId) {
    this.containerId = containerId;
  }

  public AppsflyerAudienceSyncCreate urlAdidSha256(@Nullable String urlAdidSha256) {
    this.urlAdidSha256 = urlAdidSha256;
    return this;
  }

  /**
   * The pre-signed URL for SHA256 hashed GAID/IDFA file
   * @return urlAdidSha256
   */
  
  @Schema(name = "url_adid_sha256", description = "The pre-signed URL for SHA256 hashed GAID/IDFA file", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("url_adid_sha256")
  public @Nullable String getUrlAdidSha256() {
    return urlAdidSha256;
  }

  @JsonProperty("url_adid_sha256")
  public void setUrlAdidSha256(@Nullable String urlAdidSha256) {
    this.urlAdidSha256 = urlAdidSha256;
  }

  public AppsflyerAudienceSyncCreate urlEmailSha256(@Nullable String urlEmailSha256) {
    this.urlEmailSha256 = urlEmailSha256;
    return this;
  }

  /**
   * The pre-signed URL for SHA256 hashed email file
   * @return urlEmailSha256
   */
  
  @Schema(name = "url_email_sha256", description = "The pre-signed URL for SHA256 hashed email file", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("url_email_sha256")
  public @Nullable String getUrlEmailSha256() {
    return urlEmailSha256;
  }

  @JsonProperty("url_email_sha256")
  public void setUrlEmailSha256(@Nullable String urlEmailSha256) {
    this.urlEmailSha256 = urlEmailSha256;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppsflyerAudienceSyncCreate appsflyerAudienceSyncCreate = (AppsflyerAudienceSyncCreate) o;
    return Objects.equals(this.containerId, appsflyerAudienceSyncCreate.containerId) &&
        Objects.equals(this.urlAdidSha256, appsflyerAudienceSyncCreate.urlAdidSha256) &&
        Objects.equals(this.urlEmailSha256, appsflyerAudienceSyncCreate.urlEmailSha256);
  }

  @Override
  public int hashCode() {
    return Objects.hash(containerId, urlAdidSha256, urlEmailSha256);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppsflyerAudienceSyncCreate {\n");
    sb.append("    containerId: ").append(toIndentedString(containerId)).append("\n");
    sb.append("    urlAdidSha256: ").append(toIndentedString(urlAdidSha256)).append("\n");
    sb.append("    urlEmailSha256: ").append(toIndentedString(urlEmailSha256)).append("\n");
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

