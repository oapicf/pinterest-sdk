package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.vertxweb.server.model.AppsflyerPlatform;

/**
 * Request model for creating an AppsFlyer audience
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AppsflyerAudience   {
  
  private String containerId;
  private String name;
  private AppsflyerPlatform platform;

  public AppsflyerAudience () {

  }

  public AppsflyerAudience (String containerId, String name, AppsflyerPlatform platform) {
    this.containerId = containerId;
    this.name = name;
    this.platform = platform;
  }

    
  @JsonProperty("container_id")
  public String getContainerId() {
    return containerId;
  }
  public void setContainerId(String containerId) {
    this.containerId = containerId;
  }

    
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

    
  @JsonProperty("platform")
  public AppsflyerPlatform getPlatform() {
    return platform;
  }
  public void setPlatform(AppsflyerPlatform platform) {
    this.platform = platform;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppsflyerAudience appsflyerAudience = (AppsflyerAudience) o;
    return Objects.equals(containerId, appsflyerAudience.containerId) &&
        Objects.equals(name, appsflyerAudience.name) &&
        Objects.equals(platform, appsflyerAudience.platform);
  }

  @Override
  public int hashCode() {
    return Objects.hash(containerId, name, platform);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppsflyerAudience {\n");
    
    sb.append("    containerId: ").append(toIndentedString(containerId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
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
