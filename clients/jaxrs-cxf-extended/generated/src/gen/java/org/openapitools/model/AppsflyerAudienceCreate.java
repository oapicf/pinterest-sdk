package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.AppsflyerPlatform;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Resource create operation model.
 */
@ApiModel(description="Resource create operation model.")

public class AppsflyerAudienceCreate  {
  
 /**
  * The name of the audience
  */
  @ApiModelProperty(required = true, value = "The name of the audience")
  private String name;

 /**
  * The platform of the audience
  */
  @ApiModelProperty(required = true, value = "The platform of the audience")
  @Valid
  private AppsflyerPlatform platform;
 /**
  * The name of the audience
  * @return name
  */
  @JsonProperty("name")
  @NotNull
  public String getName() {
    return name;
  }

  /**
   * Sets the <code>name</code> property.
   */
 public void setName(String name) {
    this.name = name;
  }

  /**
   * Sets the <code>name</code> property.
   */
  public AppsflyerAudienceCreate name(String name) {
    this.name = name;
    return this;
  }

 /**
  * The platform of the audience
  * @return platform
  */
  @JsonProperty("platform")
  @NotNull
  public AppsflyerPlatform getPlatform() {
    return platform;
  }

  /**
   * Sets the <code>platform</code> property.
   */
 public void setPlatform(AppsflyerPlatform platform) {
    this.platform = platform;
  }

  /**
   * Sets the <code>platform</code> property.
   */
  public AppsflyerAudienceCreate platform(AppsflyerPlatform platform) {
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

