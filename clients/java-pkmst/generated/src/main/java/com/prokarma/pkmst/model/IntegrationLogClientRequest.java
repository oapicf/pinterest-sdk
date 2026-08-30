package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.prokarma.pkmst.model.HttpMethod;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.Map;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * HTTP request details included in the log sent by the client.
 */
@ApiModel(description = "HTTP request details included in the log sent by the client.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-08-30T09:52:55.641133752Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class IntegrationLogClientRequest   {
  @JsonProperty("host")
  private String host;

  @JsonProperty("method")
  private HttpMethod method;

  @JsonProperty("path")
  private String path;

  @JsonProperty("request_headers")
  
  private Map<String, String> requestHeaders = null;

  @JsonProperty("response_headers")
  
  private Map<String, String> responseHeaders = null;

  @JsonProperty("response_status_code")
  private Integer responseStatusCode;

  public IntegrationLogClientRequest host(String host) {
    this.host = host;
    return this;
  }

  /**
   * HTTP request host from host header.
   * @return host
   */
  @ApiModelProperty(required = true, value = "HTTP request host from host header.")
  public String getHost() {
    return host;
  }

  public void setHost(String host) {
    this.host = host;
  }

  public IntegrationLogClientRequest method(HttpMethod method) {
    this.method = method;
    return this;
  }

  /**
   * Get method
   * @return method
   */
  @ApiModelProperty(required = true, value = "")
  public HttpMethod getMethod() {
    return method;
  }

  public void setMethod(HttpMethod method) {
    this.method = method;
  }

  public IntegrationLogClientRequest path(String path) {
    this.path = path;
    return this;
  }

  /**
   * HTTP request path.
   * @return path
   */
  @ApiModelProperty(required = true, value = "HTTP request path.")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public IntegrationLogClientRequest requestHeaders(Map<String, String> requestHeaders) {
    this.requestHeaders = requestHeaders;
    return this;
  }

  public IntegrationLogClientRequest putRequestHeadersItem(String key, String requestHeadersItem) {
    if (this.requestHeaders == null) {
      this.requestHeaders = new HashMap<>());
    }
    this.requestHeaders.put(key, requestHeadersItem);
    return this;
  }

  /**
   * HTTP request headers as key-value pairs.
   * @return requestHeaders
   */
  @ApiModelProperty(value = "HTTP request headers as key-value pairs.")
  public Map<String, String> getRequestHeaders() {
    return requestHeaders;
  }

  public void setRequestHeaders(Map<String, String> requestHeaders) {
    this.requestHeaders = requestHeaders;
  }

  public IntegrationLogClientRequest responseHeaders(Map<String, String> responseHeaders) {
    this.responseHeaders = responseHeaders;
    return this;
  }

  public IntegrationLogClientRequest putResponseHeadersItem(String key, String responseHeadersItem) {
    if (this.responseHeaders == null) {
      this.responseHeaders = new HashMap<>());
    }
    this.responseHeaders.put(key, responseHeadersItem);
    return this;
  }

  /**
   * HTTP response headers as key-value pairs.
   * @return responseHeaders
   */
  @ApiModelProperty(value = "HTTP response headers as key-value pairs.")
  public Map<String, String> getResponseHeaders() {
    return responseHeaders;
  }

  public void setResponseHeaders(Map<String, String> responseHeaders) {
    this.responseHeaders = responseHeaders;
  }

  public IntegrationLogClientRequest responseStatusCode(Integer responseStatusCode) {
    this.responseStatusCode = responseStatusCode;
    return this;
  }

  /**
   * Get responseStatusCode
   * @return responseStatusCode
   */
  @ApiModelProperty(value = "")
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

