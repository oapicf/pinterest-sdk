package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Queryable audience representation.
 */
@ApiModel(description = "Queryable audience representation.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2024-03-14T23:02:29.393275857Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class AudienceDefinition   {
  @JsonProperty("date")
  private String date;

  @JsonProperty("type")
  private String type;

  @JsonProperty("scope")
  private String scope;

  public AudienceDefinition date(String date) {
    this.date = date;
    return this;
  }

   /**
   * Generation date
   * @return date
  **/
  @ApiModelProperty(example = "2022-10-09", value = "Generation date")
  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public AudienceDefinition type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Generated audience type to request.
   * @return type
  **/
  @ApiModelProperty(value = "Generated audience type to request.")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public AudienceDefinition scope(String scope) {
    this.scope = scope;
    return this;
  }

   /**
   * Generated audience scope to request.
   * @return scope
  **/
  @ApiModelProperty(value = "Generated audience scope to request.")
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

