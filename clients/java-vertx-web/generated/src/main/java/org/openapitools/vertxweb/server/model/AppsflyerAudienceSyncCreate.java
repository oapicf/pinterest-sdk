package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Resource create operation model.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AppsflyerAudienceSyncCreate   {
  
  private String containerId;
  private String urlAdidSha256;
  private String urlEmailSha256;

  public AppsflyerAudienceSyncCreate () {

  }

  public AppsflyerAudienceSyncCreate (String containerId, String urlAdidSha256, String urlEmailSha256) {
    this.containerId = containerId;
    this.urlAdidSha256 = urlAdidSha256;
    this.urlEmailSha256 = urlEmailSha256;
  }

    
  @JsonProperty("container_id")
  public String getContainerId() {
    return containerId;
  }
  public void setContainerId(String containerId) {
    this.containerId = containerId;
  }

    
  @JsonProperty("url_adid_sha256")
  public String getUrlAdidSha256() {
    return urlAdidSha256;
  }
  public void setUrlAdidSha256(String urlAdidSha256) {
    this.urlAdidSha256 = urlAdidSha256;
  }

    
  @JsonProperty("url_email_sha256")
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
    return Objects.equals(containerId, appsflyerAudienceSyncCreate.containerId) &&
        Objects.equals(urlAdidSha256, appsflyerAudienceSyncCreate.urlAdidSha256) &&
        Objects.equals(urlEmailSha256, appsflyerAudienceSyncCreate.urlEmailSha256);
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
