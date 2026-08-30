package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Resource create operation model.
 **/
@ApiModel(description = "Resource create operation model.")
@JsonTypeName("AppsflyerAudienceSyncCreate")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class AppsflyerAudienceSyncCreate   {
  private String containerId;
  private String urlAdidSha256;
  private String urlEmailSha256;

  public AppsflyerAudienceSyncCreate() {
  }

  @JsonCreator
  public AppsflyerAudienceSyncCreate(
    @JsonProperty(required = true, value = "container_id") String containerId
  ) {
    this.containerId = containerId;
  }

  /**
   * The container ID of the audience
   **/
  public AppsflyerAudienceSyncCreate containerId(String containerId) {
    this.containerId = containerId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The container ID of the audience")
  @JsonProperty(required = true, value = "container_id")
  @NotNull public String getContainerId() {
    return containerId;
  }

  @JsonProperty(required = true, value = "container_id")
  public void setContainerId(String containerId) {
    this.containerId = containerId;
  }

  /**
   * The pre-signed URL for SHA256 hashed GAID/IDFA file
   **/
  public AppsflyerAudienceSyncCreate urlAdidSha256(String urlAdidSha256) {
    this.urlAdidSha256 = urlAdidSha256;
    return this;
  }

  
  @ApiModelProperty(value = "The pre-signed URL for SHA256 hashed GAID/IDFA file")
  @JsonProperty("url_adid_sha256")
  public String getUrlAdidSha256() {
    return urlAdidSha256;
  }

  @JsonProperty("url_adid_sha256")
  public void setUrlAdidSha256(String urlAdidSha256) {
    this.urlAdidSha256 = urlAdidSha256;
  }

  /**
   * The pre-signed URL for SHA256 hashed email file
   **/
  public AppsflyerAudienceSyncCreate urlEmailSha256(String urlEmailSha256) {
    this.urlEmailSha256 = urlEmailSha256;
    return this;
  }

  
  @ApiModelProperty(value = "The pre-signed URL for SHA256 hashed email file")
  @JsonProperty("url_email_sha256")
  public String getUrlEmailSha256() {
    return urlEmailSha256;
  }

  @JsonProperty("url_email_sha256")
  public void setUrlEmailSha256(String urlEmailSha256) {
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }


}
