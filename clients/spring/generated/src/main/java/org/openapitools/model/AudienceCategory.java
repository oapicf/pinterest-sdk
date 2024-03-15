package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AudienceSubcategory;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * AudienceCategory
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T23:15:39.458648915Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class AudienceCategory {

  private String key;

  private String name;

  private BigDecimal ratio;

  private BigDecimal index;

  private String id;

  @Valid
  private List<@Valid AudienceSubcategory> subcategories;

  public AudienceCategory key(String key) {
    this.key = key;
    return this;
  }

  /**
   * Interest unique key (same as ID).
   * @return key
  */
  
  @Schema(name = "key", example = "1234567", description = "Interest unique key (same as ID).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("key")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public AudienceCategory name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Interest name.
   * @return name
  */
  
  @Schema(name = "name", example = "travel", description = "Interest name.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AudienceCategory ratio(BigDecimal ratio) {
    this.ratio = ratio;
    return this;
  }

  /**
   * Interest's percent of category's total audience.
   * @return ratio
  */
  @Valid 
  @Schema(name = "ratio", example = "0.551", description = "Interest's percent of category's total audience.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ratio")
  public BigDecimal getRatio() {
    return ratio;
  }

  public void setRatio(BigDecimal ratio) {
    this.ratio = ratio;
  }

  public AudienceCategory index(BigDecimal index) {
    this.index = index;
    return this;
  }

  /**
   * Interest affinity index.
   * @return index
  */
  @Valid 
  @Schema(name = "index", example = "1.2", description = "Interest affinity index.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("index")
  public BigDecimal getIndex() {
    return index;
  }

  public void setIndex(BigDecimal index) {
    this.index = index;
  }

  public AudienceCategory id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Interest ID.
   * @return id
  */
  
  @Schema(name = "id", example = "1234567", description = "Interest ID.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public AudienceCategory subcategories(List<@Valid AudienceSubcategory> subcategories) {
    this.subcategories = subcategories;
    return this;
  }

  public AudienceCategory addSubcategoriesItem(AudienceSubcategory subcategoriesItem) {
    if (this.subcategories == null) {
      this.subcategories = new ArrayList<>();
    }
    this.subcategories.add(subcategoriesItem);
    return this;
  }

  /**
   * Subcategory interest distribution
   * @return subcategories
  */
  @Valid 
  @Schema(name = "subcategories", description = "Subcategory interest distribution", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("subcategories")
  public List<@Valid AudienceSubcategory> getSubcategories() {
    return subcategories;
  }

  public void setSubcategories(List<@Valid AudienceSubcategory> subcategories) {
    this.subcategories = subcategories;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AudienceCategory audienceCategory = (AudienceCategory) o;
    return Objects.equals(this.key, audienceCategory.key) &&
        Objects.equals(this.name, audienceCategory.name) &&
        Objects.equals(this.ratio, audienceCategory.ratio) &&
        Objects.equals(this.index, audienceCategory.index) &&
        Objects.equals(this.id, audienceCategory.id) &&
        Objects.equals(this.subcategories, audienceCategory.subcategories);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, name, ratio, index, id, subcategories);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AudienceCategory {\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    ratio: ").append(toIndentedString(ratio)).append("\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    subcategories: ").append(toIndentedString(subcategories)).append("\n");
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

