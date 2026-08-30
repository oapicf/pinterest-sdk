package org.openapitools.model;

import org.openapitools.model.AppsflyerPlatform;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * Request model for creating an AppsFlyer audience
 */
public class AppsflyerAudience implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * The ID of the audience container
   */
  @JsonProperty("container_id")
  private String containerId;

  /**
   * The name of the audience
   */
  @JsonProperty("name")
  private String name;

  /**
   * The platform of the audience
   */
  @JsonProperty("platform")
  private AppsflyerPlatform platform;

  /**
   * The ID of the audience container
   * @return containerId
   */
  public String getContainerId() {
    return containerId;
  }

  public void setContainerId(String containerId) {
    this.containerId = containerId;
  }

  /**
   * The name of the audience
   * @return name
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * The platform of the audience
   * @return platform
   */
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
    return Objects.equals(this.containerId, appsflyerAudience.containerId) &&
        Objects.equals(this.name, appsflyerAudience.name) &&
        Objects.equals(this.platform, appsflyerAudience.platform);
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
