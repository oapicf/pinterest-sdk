package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Interest   {
  
  private String canonicalUrl;
  private String id;
  private String key;
  private String name;

  public Interest () {

  }

  public Interest (String canonicalUrl, String id, String key, String name) {
    this.canonicalUrl = canonicalUrl;
    this.id = id;
    this.key = key;
    this.name = name;
  }

    
  @JsonProperty("canonical_url")
  public String getCanonicalUrl() {
    return canonicalUrl;
  }
  public void setCanonicalUrl(String canonicalUrl) {
    this.canonicalUrl = canonicalUrl;
  }

    
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

    
  @JsonProperty("key")
  public String getKey() {
    return key;
  }
  public void setKey(String key) {
    this.key = key;
  }

    
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
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
    return Objects.equals(canonicalUrl, interest.canonicalUrl) &&
        Objects.equals(id, interest.id) &&
        Objects.equals(key, interest.key) &&
        Objects.equals(name, interest.name);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
