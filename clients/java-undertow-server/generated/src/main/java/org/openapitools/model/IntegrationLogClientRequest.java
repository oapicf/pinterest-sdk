/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * OpenAPI document version: 5.12.0
 * Maintained by: blah+oapicf@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.Map;



/**
 * HTTP request details included in the log sent by the client.
 */

@ApiModel(description = "HTTP request details included in the log sent by the client.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2024-03-14T23:03:06.281391477Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class IntegrationLogClientRequest   {
  


  public enum MethodEnum {
    GET("GET"),
    HEAD("HEAD"),
    POST("POST"),
    PUT("PUT"),
    DELETE("DELETE"),
    CONNECT("CONNECT"),
    OPTIONS("OPTIONS"),
    TRACE("TRACE"),
    PATCH("PATCH");

    private String value;

    MethodEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private MethodEnum method;
  private String host;
  private String path;
  private Map<String, String> requestHeaders = new HashMap<>();
  private Map<String, String> responseHeaders = new HashMap<>();
  private Integer responseStatusCode;

  /**
   */
  public IntegrationLogClientRequest method(MethodEnum method) {
    this.method = method;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("method")
  public MethodEnum getMethod() {
    return method;
  }
  public void setMethod(MethodEnum method) {
    this.method = method;
  }

  /**
   * HTTP request host from host header.
   */
  public IntegrationLogClientRequest host(String host) {
    this.host = host;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "HTTP request host from host header.")
  @JsonProperty("host")
  public String getHost() {
    return host;
  }
  public void setHost(String host) {
    this.host = host;
  }

  /**
   * HTTP request path.
   */
  public IntegrationLogClientRequest path(String path) {
    this.path = path;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "HTTP request path.")
  @JsonProperty("path")
  public String getPath() {
    return path;
  }
  public void setPath(String path) {
    this.path = path;
  }

  /**
   * HTTP request headers as key-value pairs.
   */
  public IntegrationLogClientRequest requestHeaders(Map<String, String> requestHeaders) {
    this.requestHeaders = requestHeaders;
    return this;
  }

  
  @ApiModelProperty(value = "HTTP request headers as key-value pairs.")
  @JsonProperty("request_headers")
  public Map<String, String> getRequestHeaders() {
    return requestHeaders;
  }
  public void setRequestHeaders(Map<String, String> requestHeaders) {
    this.requestHeaders = requestHeaders;
  }

  /**
   * HTTP response headers as key-value pairs.
   */
  public IntegrationLogClientRequest responseHeaders(Map<String, String> responseHeaders) {
    this.responseHeaders = responseHeaders;
    return this;
  }

  
  @ApiModelProperty(value = "HTTP response headers as key-value pairs.")
  @JsonProperty("response_headers")
  public Map<String, String> getResponseHeaders() {
    return responseHeaders;
  }
  public void setResponseHeaders(Map<String, String> responseHeaders) {
    this.responseHeaders = responseHeaders;
  }

  /**
   */
  public IntegrationLogClientRequest responseStatusCode(Integer responseStatusCode) {
    this.responseStatusCode = responseStatusCode;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("response_status_code")
  public Integer getResponseStatusCode() {
    return responseStatusCode;
  }
  public void setResponseStatusCode(Integer responseStatusCode) {
    this.responseStatusCode = responseStatusCode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IntegrationLogClientRequest integrationLogClientRequest = (IntegrationLogClientRequest) o;
    return Objects.equals(method, integrationLogClientRequest.method) &&
        Objects.equals(host, integrationLogClientRequest.host) &&
        Objects.equals(path, integrationLogClientRequest.path) &&
        Objects.equals(requestHeaders, integrationLogClientRequest.requestHeaders) &&
        Objects.equals(responseHeaders, integrationLogClientRequest.responseHeaders) &&
        Objects.equals(responseStatusCode, integrationLogClientRequest.responseStatusCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(method, host, path, requestHeaders, responseHeaders, responseStatusCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntegrationLogClientRequest {\n");
    
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    requestHeaders: ").append(toIndentedString(requestHeaders)).append("\n");
    sb.append("    responseHeaders: ").append(toIndentedString(responseHeaders)).append("\n");
    sb.append("    responseStatusCode: ").append(toIndentedString(responseStatusCode)).append("\n");
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

