package org.openapitools.model;

import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * Resource create operation model.
 */
public class AppsflyerAudienceSyncCreate implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * The container ID of the audience
   */
  @JsonProperty("container_id")
  private String containerId;

  /**
   * The pre-signed URL for SHA256 hashed GAID/IDFA file
   */
  @JsonProperty("url_adid_sha256")
  private String urlAdidSha256;

  /**
   * The pre-signed URL for SHA256 hashed email file
   */
  @JsonProperty("url_email_sha256")
  private String urlEmailSha256;

  /**
   * The container ID of the audience
   * @return containerId
   */
  public String getContainerId() {
    return containerId;
  }

  public void setContainerId(String containerId) {
    this.containerId = containerId;
  }

  /**
   * The pre-signed URL for SHA256 hashed GAID/IDFA file
   * @return urlAdidSha256
   */
  public String getUrlAdidSha256() {
    return urlAdidSha256;
  }

  public void setUrlAdidSha256(String urlAdidSha256) {
    this.urlAdidSha256 = urlAdidSha256;
  }

  /**
   * The pre-signed URL for SHA256 hashed email file
   * @return urlEmailSha256
   */
  public String getUrlEmailSha256() {
    return urlEmailSha256;
  }

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
