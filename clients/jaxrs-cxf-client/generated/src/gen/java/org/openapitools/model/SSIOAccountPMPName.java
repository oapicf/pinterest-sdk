package org.openapitools.model;


import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class SSIOAccountPMPName  {
  
  @ApiModelProperty(example = "Bidalgo", value = "Display name")
 /**
   * Display name
  **/
  private String name;

  @ApiModelProperty(example = "0011N00001LW2aSQAT", value = "Salesforce id for PMP")
 /**
   * Salesforce id for PMP
  **/
  private String id;
 /**
   * Display name
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SSIOAccountPMPName name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Salesforce id for PMP
   * @return id
  **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public SSIOAccountPMPName id(String id) {
    this.id = id;
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
    SSIOAccountPMPName ssIOAccountPMPName = (SSIOAccountPMPName) o;
    return Objects.equals(this.name, ssIOAccountPMPName.name) &&
        Objects.equals(this.id, ssIOAccountPMPName.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SSIOAccountPMPName {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

