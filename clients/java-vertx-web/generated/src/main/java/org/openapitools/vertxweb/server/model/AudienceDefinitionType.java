package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Generated audience type to request.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AudienceDefinitionType   {
  


  public enum ScopeEnum {
    IMPRESSION_PLUS_ENGAGEMENT("IMPRESSION_PLUS_ENGAGEMENT"),
    ENGAGEMENT("ENGAGEMENT");

    private String value;

    ScopeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private ScopeEnum scope;

  public AudienceDefinitionType () {

  }

  public AudienceDefinitionType (ScopeEnum scope) {
    this.scope = scope;
  }

    
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
    AudienceDefinitionType audienceDefinitionType = (AudienceDefinitionType) o;
    return Objects.equals(scope, audienceDefinitionType.scope);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scope);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AudienceDefinitionType {\n");
    
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
