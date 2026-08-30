package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.AppsflyerPlatform;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Resource create operation model.
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "Resource create operation model.")
public class AppsflyerAudienceCreate   {
  
  private String name;

  private AppsflyerPlatform platform;

  /**
   * The name of the audience
   **/
  public AppsflyerAudienceCreate name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The name of the audience")
  @JsonProperty("name")
  @NotNull
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * The platform of the audience
   **/
  public AppsflyerAudienceCreate platform(AppsflyerPlatform platform) {
    this.platform = platform;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The platform of the audience")
  @JsonProperty("platform")
  @NotNull
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
    AppsflyerAudienceCreate appsflyerAudienceCreate = (AppsflyerAudienceCreate) o;
    return Objects.equals(this.name, appsflyerAudienceCreate.name) &&
        Objects.equals(this.platform, appsflyerAudienceCreate.platform);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, platform);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppsflyerAudienceCreate {\n");
    
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

