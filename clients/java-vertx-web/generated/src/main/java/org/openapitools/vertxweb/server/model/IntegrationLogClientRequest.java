package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.Map;

/**
 * HTTP request details included in the log sent by the client.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
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

  public IntegrationLogClientRequest () {

  }

  public IntegrationLogClientRequest (MethodEnum method, String host, String path, Map<String, String> requestHeaders, Map<String, String> responseHeaders, Integer responseStatusCode) {
    this.method = method;
    this.host = host;
    this.path = path;
    this.requestHeaders = requestHeaders;
    this.responseHeaders = responseHeaders;
    this.responseStatusCode = responseStatusCode;
  }

    
  @JsonProperty("method")
  public MethodEnum getMethod() {
    return method;
  }
  public void setMethod(MethodEnum method) {
    this.method = method;
  }

    
  @JsonProperty("host")
  public String getHost() {
    return host;
  }
  public void setHost(String host) {
    this.host = host;
  }

    
  @JsonProperty("path")
  public String getPath() {
    return path;
  }
  public void setPath(String path) {
    this.path = path;
  }

    
  @JsonProperty("request_headers")
  public Map<String, String> getRequestHeaders() {
    return requestHeaders;
  }
  public void setRequestHeaders(Map<String, String> requestHeaders) {
    this.requestHeaders = requestHeaders;
  }

    
  @JsonProperty("response_headers")
  public Map<String, String> getResponseHeaders() {
    return responseHeaders;
  }
  public void setResponseHeaders(Map<String, String> responseHeaders) {
    this.responseHeaders = responseHeaders;
  }

    
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
