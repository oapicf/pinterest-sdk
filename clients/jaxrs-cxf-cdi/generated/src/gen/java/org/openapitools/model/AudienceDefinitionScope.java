package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Generated audience scope to request.
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "Generated audience scope to request.")
public class AudienceDefinitionScope   {
  

public enum ScopeEnum {

    @JsonProperty("PARTNER") PARTNER(String.valueOf("PARTNER")), @JsonProperty("PINTEREST") PINTEREST(String.valueOf("PINTEREST"));


    private String value;

    ScopeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ScopeEnum fromValue(String value) {
        for (ScopeEnum b : ScopeEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  private ScopeEnum scope;

  /**
   **/
  public AudienceDefinitionScope scope(ScopeEnum scope) {
    this.scope = scope;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("scope")
  public ScopeEnum getScope() {
    return scope;
  }
  public void setScope(ScopeEnum scope) {
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
    AudienceDefinitionScope audienceDefinitionScope = (AudienceDefinitionScope) o;
    return Objects.equals(this.scope, audienceDefinitionScope.scope);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scope);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AudienceDefinitionScope {\n");
    
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

