package apimodels;

import apimodels.AppsflyerPlatform;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Request model for creating an AppsFlyer audience
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class AppsflyerAudience   {
  @JsonProperty("container_id")
  @NotNull

  private String containerId;

  @JsonProperty("name")
  @NotNull

  private String name;

  @JsonProperty("platform")
  @NotNull
@Valid

  private AppsflyerPlatform platform;

  public AppsflyerAudience containerId(String containerId) {
    this.containerId = containerId;
    return this;
  }

   /**
   * The ID of the audience container
   * @return containerId
  **/
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
  **/
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
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

