package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.AppsflyerPlatform;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Resource create operation model.
 */

@Schema(name = "AppsflyerAudienceCreate", description = "Resource create operation model.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class AppsflyerAudienceCreate {

  private String name;

  private AppsflyerPlatform platform;

  public AppsflyerAudienceCreate() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public AppsflyerAudienceCreate(String name, AppsflyerPlatform platform) {
    this.name = name;
    this.platform = platform;
  }

  public AppsflyerAudienceCreate name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the audience
   * @return name
   */
  @NotNull 
  @Schema(name = "name", description = "The name of the audience", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  @JsonProperty("name")
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
   */
  @NotNull @Valid 
  @Schema(name = "platform", description = "The platform of the audience", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("platform")
  public AppsflyerPlatform getPlatform() {
    return platform;
  }

  @JsonProperty("platform")
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

