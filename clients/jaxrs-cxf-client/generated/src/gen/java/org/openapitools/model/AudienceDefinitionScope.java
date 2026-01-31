package org.openapitools.model;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Generated audience scope to request.
 */
@ApiModel(description="Generated audience scope to request.")

public class AudienceDefinitionScope  {
  
public enum ScopeEnum {

PARTNER(String.valueOf("PARTNER")), PINTEREST(String.valueOf("PINTEREST"));


    private String value;

    ScopeEnum (String v) {
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

  @ApiModelProperty(value = "")

  private ScopeEnum scope;
 /**
   * Get scope
   * @return scope
  **/
  @JsonProperty("scope")
  public String getScope() {
    if (scope == null) {
      return null;
    }
    return scope.value();
  }

  public void setScope(ScopeEnum scope) {
    this.scope = scope;
  }

  public AudienceDefinitionScope scope(ScopeEnum scope) {
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

