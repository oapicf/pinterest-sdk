package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.AppsflyerPlatform;
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
 * Request model for creating an AppsFlyer audience
 **/
@ApiModel(description = "Request model for creating an AppsFlyer audience")
@JsonTypeName("AppsflyerAudience")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class AppsflyerAudience   {
  private String containerId;
  private String name;
  private AppsflyerPlatform platform;

  public AppsflyerAudience() {
  }

  @JsonCreator
  public AppsflyerAudience(
    @JsonProperty(required = true, value = "container_id") String containerId,
    @JsonProperty(required = true, value = "name") String name,
    @JsonProperty(required = true, value = "platform") AppsflyerPlatform platform
  ) {
    this.containerId = containerId;
    this.name = name;
    this.platform = platform;
  }

  /**
   * The ID of the audience container
   **/
  public AppsflyerAudience containerId(String containerId) {
    this.containerId = containerId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The ID of the audience container")
  @JsonProperty(required = true, value = "container_id")
  public String getContainerId() {
    return containerId;
  }

  @JsonProperty(required = true, value = "container_id")
  public void setContainerId(String containerId) {
    this.containerId = containerId;
  }

  /**
   * The name of the audience
   **/
  public AppsflyerAudience name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The name of the audience")
  @JsonProperty(required = true, value = "name")
  @NotNull public String getName() {
    return name;
  }

  @JsonProperty(required = true, value = "name")
  public void setName(String name) {
    this.name = name;
  }

  /**
   * The platform of the audience
   **/
  public AppsflyerAudience platform(AppsflyerPlatform platform) {
    this.platform = platform;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The platform of the audience")
  @JsonProperty(required = true, value = "platform")
  @NotNull public AppsflyerPlatform getPlatform() {
    return platform;
  }

  @JsonProperty(required = true, value = "platform")
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
