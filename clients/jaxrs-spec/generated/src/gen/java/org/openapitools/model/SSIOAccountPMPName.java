package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Pinterest marketing partner name.
 **/
@ApiModel(description = "Pinterest marketing partner name.")
@JsonTypeName("SSIOAccountPMPName")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class SSIOAccountPMPName   {
  private String id;
  private String name;

  public SSIOAccountPMPName() {
  }

  /**
   * Salesforce id for PMP
   **/
  public SSIOAccountPMPName id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(example = "0011N00001LW2aSQAT", value = "Salesforce id for PMP")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  @JsonProperty("id")
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Display name
   **/
  public SSIOAccountPMPName name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(example = "Bidalgo", value = "Display name")
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  @JsonProperty("name")
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
    SSIOAccountPMPName ssIOAccountPMPName = (SSIOAccountPMPName) o;
    return Objects.equals(this.id, ssIOAccountPMPName.id) &&
        Objects.equals(this.name, ssIOAccountPMPName.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SSIOAccountPMPName {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
