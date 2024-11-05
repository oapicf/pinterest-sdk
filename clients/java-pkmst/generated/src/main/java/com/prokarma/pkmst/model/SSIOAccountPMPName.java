package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * SSIOAccountPMPName
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-11-05T02:04:39.133647094Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class SSIOAccountPMPName   {
  @JsonProperty("name")
  private String name;

  @JsonProperty("id")
  private String id;

  public SSIOAccountPMPName name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Display name
   * @return name
   */
  @ApiModelProperty(example = "Bidalgo", value = "Display name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SSIOAccountPMPName id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Salesforce id for PMP
   * @return id
   */
  @ApiModelProperty(example = "0011N00001LW2aSQAT", value = "Salesforce id for PMP")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

