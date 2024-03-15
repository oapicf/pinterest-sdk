package org.openapitools.model;


import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Interest  {
  
  @ApiModelProperty(value = "")
  private String canonicalUrl;

  @ApiModelProperty(example = "903972677830", value = "")
  private String id;

  @ApiModelProperty(example = "man cave", value = "")
  private String key;

  @ApiModelProperty(example = "Man cave", value = "")
  private String name;
 /**
   * Get canonicalUrl
   * @return canonicalUrl
  **/
  @JsonProperty("canonical_url")
  public String getCanonicalUrl() {
    return canonicalUrl;
  }

  public void setCanonicalUrl(String canonicalUrl) {
    this.canonicalUrl = canonicalUrl;
  }

  public Interest canonicalUrl(String canonicalUrl) {
    this.canonicalUrl = canonicalUrl;
    return this;
  }

 /**
   * Get id
   * @return id
  **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Interest id(String id) {
    this.id = id;
    return this;
  }

 /**
   * Get key
   * @return key
  **/
  @JsonProperty("key")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public Interest key(String key) {
    this.key = key;
    return this;
  }

 /**
   * Get name
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Interest name(String name) {
    this.name = name;
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
    Interest interest = (Interest) o;
    return Objects.equals(this.canonicalUrl, interest.canonicalUrl) &&
        Objects.equals(this.id, interest.id) &&
        Objects.equals(this.key, interest.key) &&
        Objects.equals(this.name, interest.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(canonicalUrl, id, key, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Interest {\n");
    
    sb.append("    canonicalUrl: ").append(toIndentedString(canonicalUrl)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

