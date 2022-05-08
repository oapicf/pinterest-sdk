package apimodels;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * Describes the valid schema for possible OAuth access token requests.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2022-05-08T00:31:58.024547Z[Etc/UTC]")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class OauthAccessTokenRequest   {
  /**
   * Gets or Sets grantType
   */
  public enum GrantTypeEnum {
    AUTHORIZATION_CODE("authorization_code"),
    
    REFRESH_TOKEN("refresh_token");

    private final String value;

    GrantTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static GrantTypeEnum fromValue(String value) {
      for (GrantTypeEnum b : GrantTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("grant_type")
  @NotNull

  private GrantTypeEnum grantType;

  public OauthAccessTokenRequest grantType(GrantTypeEnum grantType) {
    this.grantType = grantType;
    return this;
  }

   /**
   * Get grantType
   * @return grantType
  **/
  public GrantTypeEnum getGrantType() {
    return grantType;
  }

  public void setGrantType(GrantTypeEnum grantType) {
    this.grantType = grantType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OauthAccessTokenRequest oauthAccessTokenRequest = (OauthAccessTokenRequest) o;
    return Objects.equals(grantType, oauthAccessTokenRequest.grantType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(grantType);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OauthAccessTokenRequest {\n");
    
    sb.append("    grantType: ").append(toIndentedString(grantType)).append("\n");
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

