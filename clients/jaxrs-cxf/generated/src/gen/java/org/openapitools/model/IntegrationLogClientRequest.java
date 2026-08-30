package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.Map;
import org.openapitools.model.HttpMethod;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * HTTP request details included in the log sent by the client.
 */
@ApiModel(description="HTTP request details included in the log sent by the client.")

public class IntegrationLogClientRequest  {
  
 /**
  * HTTP request host from host header.
  */
  @ApiModelProperty(required = true, value = "HTTP request host from host header.")

  private String host;

  @ApiModelProperty(required = true, value = "")

  @Valid

  private HttpMethod method;

 /**
  * HTTP request path.
  */
  @ApiModelProperty(required = true, value = "HTTP request path.")

  private String path;

 /**
  * HTTP request headers as key-value pairs.
  */
  @ApiModelProperty(value = "HTTP request headers as key-value pairs.")

  private Map<String, String> requestHeaders = new HashMap<>();

 /**
  * HTTP response headers as key-value pairs.
  */
  @ApiModelProperty(value = "HTTP response headers as key-value pairs.")

  private Map<String, String> responseHeaders = new HashMap<>();

  @ApiModelProperty(value = "")

  private Integer responseStatusCode;
 /**
   * HTTP request host from host header.
   * @return host
  **/
  @JsonProperty("host")
  @NotNull
  public String getHost() {
    return host;
  }

  public void setHost(String host) {
    this.host = host;
  }

  public IntegrationLogClientRequest host(String host) {
    this.host = host;
    return this;
  }

 /**
   * Get method
   * @return method
  **/
  @JsonProperty("method")
  @NotNull
  public HttpMethod getMethod() {
    return method;
  }

  public void setMethod(HttpMethod method) {
    this.method = method;
  }

  public IntegrationLogClientRequest method(HttpMethod method) {
    this.method = method;
    return this;
  }

 /**
   * HTTP request path.
   * @return path
  **/
  @JsonProperty("path")
  @NotNull
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public IntegrationLogClientRequest path(String path) {
    this.path = path;
    return this;
  }

 /**
   * HTTP request headers as key-value pairs.
   * @return requestHeaders
  **/
  @JsonProperty("request_headers")
  public Map<String, String> getRequestHeaders() {
    return requestHeaders;
  }

  public void setRequestHeaders(Map<String, String> requestHeaders) {
    this.requestHeaders = requestHeaders;
  }

  public IntegrationLogClientRequest requestHeaders(Map<String, String> requestHeaders) {
    this.requestHeaders = requestHeaders;
    return this;
  }

  public IntegrationLogClientRequest putRequestHeadersItem(String key, String requestHeadersItem) {
    this.requestHeaders.put(key, requestHeadersItem);
    return this;
  }

 /**
   * HTTP response headers as key-value pairs.
   * @return responseHeaders
  **/
  @JsonProperty("response_headers")
  public Map<String, String> getResponseHeaders() {
    return responseHeaders;
  }

  public void setResponseHeaders(Map<String, String> responseHeaders) {
    this.responseHeaders = responseHeaders;
  }

  public IntegrationLogClientRequest responseHeaders(Map<String, String> responseHeaders) {
    this.responseHeaders = responseHeaders;
    return this;
  }

  public IntegrationLogClientRequest putResponseHeadersItem(String key, String responseHeadersItem) {
    this.responseHeaders.put(key, responseHeadersItem);
    return this;
  }

 /**
   * Get responseStatusCode
   * @return responseStatusCode
  **/
  @JsonProperty("response_status_code")
  public Integer getResponseStatusCode() {
    return responseStatusCode;
  }

  public void setResponseStatusCode(Integer responseStatusCode) {
    this.responseStatusCode = responseStatusCode;
  }

  public IntegrationLogClientRequest responseStatusCode(Integer responseStatusCode) {
    this.responseStatusCode = responseStatusCode;
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
    IntegrationLogClientRequest integrationLogClientRequest = (IntegrationLogClientRequest) o;
    return Objects.equals(this.host, integrationLogClientRequest.host) &&
        Objects.equals(this.method, integrationLogClientRequest.method) &&
        Objects.equals(this.path, integrationLogClientRequest.path) &&
        Objects.equals(this.requestHeaders, integrationLogClientRequest.requestHeaders) &&
        Objects.equals(this.responseHeaders, integrationLogClientRequest.responseHeaders) &&
        Objects.equals(this.responseStatusCode, integrationLogClientRequest.responseStatusCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(host, method, path, requestHeaders, responseHeaders, responseStatusCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntegrationLogClientRequest {\n");
    
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

