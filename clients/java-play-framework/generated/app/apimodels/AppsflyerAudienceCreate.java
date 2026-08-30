package apimodels;

import apimodels.AppsflyerPlatform;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Resource create operation model.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class AppsflyerAudienceCreate   {
  @JsonProperty("name")
  @NotNull

  private String name;

  @JsonProperty("platform")
  @NotNull
@Valid

  private AppsflyerPlatform platform;

  public AppsflyerAudienceCreate name(String name) {
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

  public AppsflyerAudienceCreate platform(AppsflyerPlatform platform) {
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
    AppsflyerAudienceCreate appsflyerAudienceCreate = (AppsflyerAudienceCreate) o;
    return Objects.equals(name, appsflyerAudienceCreate.name) &&
        Objects.equals(platform, appsflyerAudienceCreate.platform);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, platform);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

