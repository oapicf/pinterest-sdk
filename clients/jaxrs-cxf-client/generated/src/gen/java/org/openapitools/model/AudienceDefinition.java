package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import org.openapitools.jackson.nullable.JsonNullable;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Queryable audience representation.
 **/
@ApiModel(description="Queryable audience representation.")

public class AudienceDefinition  {
  
  @ApiModelProperty(example = "2022-10-09", value = "Generation date")
 /**
   * Generation date
  **/
  private String date;

  @ApiModelProperty(value = "Generated audience type to request.")
 /**
   * Generated audience type to request.
  **/
  private String type;

  @ApiModelProperty(value = "Generated audience scope to request.")
 /**
   * Generated audience scope to request.
  **/
  private String scope;
 /**
   * Generation date
   * @return date
  **/
  @JsonProperty("date")
  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public AudienceDefinition date(String date) {
    this.date = date;
    return this;
  }

 /**
   * Generated audience type to request.
   * @return type
  **/
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public AudienceDefinition type(String type) {
    this.type = type;
    return this;
  }

 /**
   * Generated audience scope to request.
   * @return scope
  **/
  @JsonProperty("scope")
  public String getScope() {
    return scope;
  }

  public void setScope(String scope) {
    this.scope = scope;
  }

  public AudienceDefinition scope(String scope) {
    this.scope = scope;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

