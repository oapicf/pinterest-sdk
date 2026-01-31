package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.math.BigDecimal;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * AudienceSubcategory
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-26T05:48:22.520185154Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class AudienceSubcategory {

  private @Nullable String key;

  private @Nullable String name;

  private @Nullable BigDecimal ratio;

  private @Nullable BigDecimal index;

  private @Nullable String id;

  public AudienceSubcategory key(@Nullable String key) {
    this.key = key;
    return this;
  }

  /**
   * Interest unique key (same as ID).
   * @return key
   */
  
  @Schema(name = "key", example = "958862518888", description = "Interest unique key (same as ID).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("key")
  public @Nullable String getKey() {
    return key;
  }

  public void setKey(@Nullable String key) {
    this.key = key;
  }

  public AudienceSubcategory name(@Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * Subinterest name.
   * @return name
   */
  
  @Schema(name = "name", example = "travel destinations", description = "Subinterest name.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public @Nullable String getName() {
    return name;
  }

  public void setName(@Nullable String name) {
    this.name = name;
  }

  public AudienceSubcategory ratio(@Nullable BigDecimal ratio) {
    this.ratio = ratio;
    return this;
  }

  /**
   * Subinterest's percent of category's total audience.
   * @return ratio
   */
  @Valid 
  @Schema(name = "ratio", example = "0.482", description = "Subinterest's percent of category's total audience.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ratio")
  public @Nullable BigDecimal getRatio() {
    return ratio;
  }

  public void setRatio(@Nullable BigDecimal ratio) {
    this.ratio = ratio;
  }

  public AudienceSubcategory index(@Nullable BigDecimal index) {
    this.index = index;
    return this;
  }

  /**
   * Subinterest affinity index.
   * @return index
   */
  @Valid 
  @Schema(name = "index", example = "1.2", description = "Subinterest affinity index.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("index")
  public @Nullable BigDecimal getIndex() {
    return index;
  }

  public void setIndex(@Nullable BigDecimal index) {
    this.index = index;
  }

  public AudienceSubcategory id(@Nullable String id) {
    this.id = id;
    return this;
  }

  /**
   * Subinterest ID.
   * @return id
   */
  
  @Schema(name = "id", example = "958862518888", description = "Subinterest ID.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public @Nullable String getId() {
    return id;
  }

  public void setId(@Nullable String id) {
    this.id = id;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AudienceSubcategory audienceSubcategory = (AudienceSubcategory) o;
    return Objects.equals(this.key, audienceSubcategory.key) &&
        Objects.equals(this.name, audienceSubcategory.name) &&
        Objects.equals(this.ratio, audienceSubcategory.ratio) &&
        Objects.equals(this.index, audienceSubcategory.index) &&
        Objects.equals(this.id, audienceSubcategory.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, name, ratio, index, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AudienceSubcategory {\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    ratio: ").append(toIndentedString(ratio)).append("\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

