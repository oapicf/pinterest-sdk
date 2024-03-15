package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Queryable audience representation.
 */
@ApiModel(description="Queryable audience representation.")

public class AudienceDefinition  {
  
 /**
  * Generation date
  */
  @ApiModelProperty(example = "2022-10-09", value = "Generation date")
  private String date;

 /**
  * Generated audience type to request.
  */
  @ApiModelProperty(value = "Generated audience type to request.")
  private String type;

 /**
  * Generated audience scope to request.
  */
  @ApiModelProperty(value = "Generated audience scope to request.")
  private String scope;
 /**
  * Generation date
  * @return date
  */
  @JsonProperty("date")
  public String getDate() {
    return date;
  }

  /**
   * Sets the <code>date</code> property.
   */
 public void setDate(String date) {
    this.date = date;
  }

  /**
   * Sets the <code>date</code> property.
   */
  public AudienceDefinition date(String date) {
    this.date = date;
    return this;
  }

 /**
  * Generated audience type to request.
  * @return type
  */
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  /**
   * Sets the <code>type</code> property.
   */
 public void setType(String type) {
    this.type = type;
  }

  /**
   * Sets the <code>type</code> property.
   */
  public AudienceDefinition type(String type) {
    this.type = type;
    return this;
  }

 /**
  * Generated audience scope to request.
  * @return scope
  */
  @JsonProperty("scope")
  public String getScope() {
    return scope;
  }

  /**
   * Sets the <code>scope</code> property.
   */
 public void setScope(String scope) {
    this.scope = scope;
  }

  /**
   * Sets the <code>scope</code> property.
   */
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

