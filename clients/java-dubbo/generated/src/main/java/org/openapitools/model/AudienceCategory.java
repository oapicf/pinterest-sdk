package org.openapitools.model;

import java.math.BigDecimal;
import org.openapitools.model.AudienceSubcategory;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class AudienceCategory implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Interest ID.
   */
  @JsonProperty("id")
  private String id;

  /**
   * Interest affinity index.
   */
  @JsonProperty("index")
  private BigDecimal index;

  /**
   * Interest unique key (same as ID).
   */
  @JsonProperty("key")
  private String key;

  /**
   * Interest name.
   */
  @JsonProperty("name")
  private String name;

  /**
   * Interest&#39;s percent of category&#39;s total audience.
   */
  @JsonProperty("ratio")
  private BigDecimal ratio;

  /**
   * Subcategory interest distribution
   */
  @JsonProperty("subcategories")
  private List<AudienceSubcategory> subcategories = new ArrayList<>();

  /**
   * Interest ID.
   * @return id
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * Interest affinity index.
   * @return index
   */
  public BigDecimal getIndex() {
    return index;
  }

  public void setIndex(BigDecimal index) {
    this.index = index;
  }

  /**
   * Interest unique key (same as ID).
   * @return key
   */
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  /**
   * Interest name.
   * @return name
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * Interest&#39;s percent of category&#39;s total audience.
   * @return ratio
   */
  public BigDecimal getRatio() {
    return ratio;
  }

  public void setRatio(BigDecimal ratio) {
    this.ratio = ratio;
  }

  /**
   * Subcategory interest distribution
   * @return subcategories
   */
  public List<AudienceSubcategory> getSubcategories() {
    return subcategories;
  }

  public void setSubcategories(List<AudienceSubcategory> subcategories) {
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
    return Objects.equals(this.id, audienceCategory.id) &&
        Objects.equals(this.index, audienceCategory.index) &&
        Objects.equals(this.key, audienceCategory.key) &&
        Objects.equals(this.name, audienceCategory.name) &&
        Objects.equals(this.ratio, audienceCategory.ratio) &&
        Objects.equals(this.subcategories, audienceCategory.subcategories);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, index, key, name, ratio, subcategories);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AudienceCategory {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    ratio: ").append(toIndentedString(ratio)).append("\n");
    sb.append("    subcategories: ").append(toIndentedString(subcategories)).append("\n");
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
