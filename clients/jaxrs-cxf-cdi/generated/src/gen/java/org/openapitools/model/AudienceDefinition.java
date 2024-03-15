package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Queryable audience representation.
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "Queryable audience representation.")
public class AudienceDefinition   {
  
  private String date;

  private String type;

  private String scope;

  /**
   * Generation date
   **/
  public AudienceDefinition date(String date) {
    this.date = date;
    return this;
  }

  
  @ApiModelProperty(example = "2022-10-09", value = "Generation date")
  @JsonProperty("date")
  public String getDate() {
    return date;
  }
  public void setDate(String date) {
    this.date = date;
  }


  /**
   * Generated audience type to request.
   **/
  public AudienceDefinition type(String type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(value = "Generated audience type to request.")
  @JsonProperty("type")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }


  /**
   * Generated audience scope to request.
   **/
  public AudienceDefinition scope(String scope) {
    this.scope = scope;
    return this;
  }

  
  @ApiModelProperty(value = "Generated audience scope to request.")
  @JsonProperty("scope")
  public String getScope() {
    return scope;
  }
  public void setScope(String scope) {
    this.scope = scope;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AudienceDefinition audienceDefinition = (AudienceDefinition) o;
    return Objects.equals(this.date, audienceDefinition.date) &&
        Objects.equals(this.type, audienceDefinition.type) &&
        Objects.equals(this.scope, audienceDefinition.scope);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, type, scope);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AudienceDefinition {\n");
    
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
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

