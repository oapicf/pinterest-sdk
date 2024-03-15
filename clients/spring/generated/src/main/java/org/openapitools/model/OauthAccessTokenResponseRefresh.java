package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.OauthAccessTokenResponse;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * A successful OAuth access token response for the refresh token flow.
 */

@Schema(name = "OauthAccessTokenResponseRefresh", description = "A successful OAuth access token response for the refresh token flow.")

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T23:15:39.458648915Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class OauthAccessTokenResponseRefresh extends OauthAccessTokenResponse {

  public OauthAccessTokenResponseRefresh() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public OauthAccessTokenResponseRefresh(String accessToken, String tokenType, Integer expiresIn, String scope) {
    super(accessToken, tokenType, expiresIn, scope);
  }


  public OauthAccessTokenResponseRefresh responseType(ResponseTypeEnum responseType) {
    super.responseType(responseType);
    return this;
  }

  public OauthAccessTokenResponseRefresh accessToken(String accessToken) {
    super.accessToken(accessToken);
    return this;
  }

  public OauthAccessTokenResponseRefresh tokenType(String tokenType) {
    super.tokenType(tokenType);
    return this;
  }

  public OauthAccessTokenResponseRefresh expiresIn(Integer expiresIn) {
    super.expiresIn(expiresIn);
    return this;
  }

  public OauthAccessTokenResponseRefresh scope(String scope) {
    super.scope(scope);
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
    return super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OauthAccessTokenResponseRefresh {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
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

