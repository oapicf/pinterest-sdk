package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.prokarma.pkmst.model.AppsflyerPlatform;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Request model for creating an AppsFlyer audience
 */
@ApiModel(description = "Request model for creating an AppsFlyer audience")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-08-30T09:52:55.641133752Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class AppsflyerAudience   {
  @JsonProperty("container_id")
  private String containerId;

  @JsonProperty("name")
  private String name;

  @JsonProperty("platform")
  private AppsflyerPlatform platform;

  public AppsflyerAudience containerId(String containerId) {
    this.containerId = containerId;
    return this;
  }

  /**
   * The ID of the audience container
   * @return containerId
   */
  @ApiModelProperty(required = true, readOnly = true, value = "The ID of the audience container")
  public String getContainerId() {
    return containerId;
  }

  public void setContainerId(String containerId) {
    this.containerId = containerId;
  }

  public AppsflyerAudience name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the audience
   * @return name
   */
  @ApiModelProperty(required = true, value = "The name of the audience")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AppsflyerAudience platform(AppsflyerPlatform platform) {
    this.platform = platform;
    return this;
  }

  /**
   * The platform of the audience
   * @return platform
   */
  @ApiModelProperty(required = true, value = "The platform of the audience")
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

