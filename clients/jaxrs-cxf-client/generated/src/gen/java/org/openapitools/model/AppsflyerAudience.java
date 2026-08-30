package org.openapitools.model;

import org.openapitools.model.AppsflyerPlatform;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Request model for creating an AppsFlyer audience
 */
@ApiModel(description="Request model for creating an AppsFlyer audience")

public class AppsflyerAudience  {
  
 /**
  * The ID of the audience container
  */
  @ApiModelProperty(required = true, value = "The ID of the audience container")

  private String containerId;

 /**
  * The name of the audience
  */
  @ApiModelProperty(required = true, value = "The name of the audience")

  private String name;

 /**
  * The platform of the audience
  */
  @ApiModelProperty(required = true, value = "The platform of the audience")

  private AppsflyerPlatform platform;
 /**
   * The ID of the audience container
   * @return containerId
  **/
  @JsonProperty("container_id")
  public String getContainerId() {
    return containerId;
  }


 /**
   * The name of the audience
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AppsflyerAudience name(String name) {
    this.name = name;
    return this;
  }

 /**
   * The platform of the audience
   * @return platform
  **/
  @JsonProperty("platform")
  public AppsflyerPlatform getPlatform() {
    return platform;
  }

  public void setPlatform(AppsflyerPlatform platform) {
    this.platform = platform;
  }

  public AppsflyerAudience platform(AppsflyerPlatform platform) {
    this.platform = platform;
    return this;
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

