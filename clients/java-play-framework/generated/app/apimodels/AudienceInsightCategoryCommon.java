package apimodels;

import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * AudienceInsightCategoryCommon
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-03-14T23:02:53.026613321Z[Etc/UTC]", comments = "Generator version: 7.4.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class AudienceInsightCategoryCommon   {
  @JsonProperty("key")
  
  private String key;

  @JsonProperty("name")
  
  private String name;

  @JsonProperty("ratio")
  @Valid

  private BigDecimal ratio;

  @JsonProperty("index")
  @Valid

  private BigDecimal index;

  @JsonProperty("id")
  
  private String id;

  public AudienceInsightCategoryCommon key(String key) {
    this.key = key;
    return this;
  }

   /**
   * Get key
   * @return key
  **/
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public AudienceInsightCategoryCommon name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AudienceInsightCategoryCommon ratio(BigDecimal ratio) {
    this.ratio = ratio;
    return this;
  }

   /**
   * Get ratio
   * @return ratio
  **/
  public BigDecimal getRatio() {
    return ratio;
  }

  public void setRatio(BigDecimal ratio) {
    this.ratio = ratio;
  }

  public AudienceInsightCategoryCommon index(BigDecimal index) {
    this.index = index;
    return this;
  }

   /**
   * Get index
   * @return index
  **/
  public BigDecimal getIndex() {
    return index;
  }

  public void setIndex(BigDecimal index) {
    this.index = index;
  }

  public AudienceInsightCategoryCommon id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  public String getId() {
    return id;
  }

  public void setId(String id) {
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
    AudienceInsightCategoryCommon audienceInsightCategoryCommon = (AudienceInsightCategoryCommon) o;
    return Objects.equals(key, audienceInsightCategoryCommon.key) &&
        Objects.equals(name, audienceInsightCategoryCommon.name) &&
        Objects.equals(ratio, audienceInsightCategoryCommon.ratio) &&
        Objects.equals(index, audienceInsightCategoryCommon.index) &&
        Objects.equals(id, audienceInsightCategoryCommon.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, name, ratio, index, id);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AudienceInsightCategoryCommon {\n");
    
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

