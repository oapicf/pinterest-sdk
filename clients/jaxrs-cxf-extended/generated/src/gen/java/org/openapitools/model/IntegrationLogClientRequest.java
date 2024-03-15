package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import java.util.HashMap;
import java.util.Map;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * HTTP request details included in the log sent by the client.
 */
@ApiModel(description="HTTP request details included in the log sent by the client.")

public class IntegrationLogClientRequest  {
  
public enum MethodEnum {

    @JsonProperty("GET") GET(String.valueOf("GET")),
    @JsonProperty("HEAD") HEAD(String.valueOf("HEAD")),
    @JsonProperty("POST") POST(String.valueOf("POST")),
    @JsonProperty("PUT") PUT(String.valueOf("PUT")),
    @JsonProperty("DELETE") DELETE(String.valueOf("DELETE")),
    @JsonProperty("CONNECT") CONNECT(String.valueOf("CONNECT")),
    @JsonProperty("OPTIONS") OPTIONS(String.valueOf("OPTIONS")),
    @JsonProperty("TRACE") TRACE(String.valueOf("TRACE")),
    @JsonProperty("PATCH") PATCH(String.valueOf("PATCH"));

    private String value;

    MethodEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static MethodEnum fromValue(String value) {
        for (MethodEnum b : MethodEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(required = true, value = "")
  private MethodEnum method;

 /**
  * HTTP request host from host header.
  */
  @ApiModelProperty(required = true, value = "HTTP request host from host header.")
  private String host;

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
  * Get method
  * @return method
  */
  @JsonProperty("method")
  @NotNull
  public String getMethod() {
    return method == null ? null : method.value();
  }

  /**
   * Sets the <code>method</code> property.
   */
 public void setMethod(MethodEnum method) {
    this.method = method;
  }

  /**
   * Sets the <code>method</code> property.
   */
  public IntegrationLogClientRequest method(MethodEnum method) {
    this.method = method;
    return this;
  }

 /**
  * HTTP request host from host header.
  * @return host
  */
  @JsonProperty("host")
  @NotNull
  public String getHost() {
    return host;
  }

  /**
   * Sets the <code>host</code> property.
   */
 public void setHost(String host) {
    this.host = host;
  }

  /**
   * Sets the <code>host</code> property.
   */
  public IntegrationLogClientRequest host(String host) {
    this.host = host;
    return this;
  }

 /**
  * HTTP request path.
  * @return path
  */
  @JsonProperty("path")
  @NotNull
  public String getPath() {
    return path;
  }

  /**
   * Sets the <code>path</code> property.
   */
 public void setPath(String path) {
    this.path = path;
  }

  /**
   * Sets the <code>path</code> property.
   */
  public IntegrationLogClientRequest path(String path) {
    this.path = path;
    return this;
  }

 /**
  * HTTP request headers as key-value pairs.
  * @return requestHeaders
  */
  @JsonProperty("request_headers")
  public Map<String, String> getRequestHeaders() {
    return requestHeaders;
  }

  /**
   * Sets the <code>requestHeaders</code> property.
   */
 public void setRequestHeaders(Map<String, String> requestHeaders) {
    this.requestHeaders = requestHeaders;
  }

  /**
   * Sets the <code>requestHeaders</code> property.
   */
  public IntegrationLogClientRequest requestHeaders(Map<String, String> requestHeaders) {
    this.requestHeaders = requestHeaders;
    return this;
  }

  /**
   * Puts a new item into the <code>requestHeaders</code> map.
   */
  public IntegrationLogClientRequest putRequestHeadersItem(String key, String requestHeadersItem) {
    this.requestHeaders.put(key, requestHeadersItem);
    return this;
  }

 /**
  * HTTP response headers as key-value pairs.
  * @return responseHeaders
  */
  @JsonProperty("response_headers")
  public Map<String, String> getResponseHeaders() {
    return responseHeaders;
  }

  /**
   * Sets the <code>responseHeaders</code> property.
   */
 public void setResponseHeaders(Map<String, String> responseHeaders) {
    this.responseHeaders = responseHeaders;
  }

  /**
   * Sets the <code>responseHeaders</code> property.
   */
  public IntegrationLogClientRequest responseHeaders(Map<String, String> responseHeaders) {
    this.responseHeaders = responseHeaders;
    return this;
  }

  /**
   * Puts a new item into the <code>responseHeaders</code> map.
   */
  public IntegrationLogClientRequest putResponseHeadersItem(String key, String responseHeadersItem) {
    this.responseHeaders.put(key, responseHeadersItem);
    return this;
  }

 /**
  * Get responseStatusCode
  * @return responseStatusCode
  */
  @JsonProperty("response_status_code")
  public Integer getResponseStatusCode() {
    return responseStatusCode;
  }

  /**
   * Sets the <code>responseStatusCode</code> property.
   */
 public void setResponseStatusCode(Integer responseStatusCode) {
    this.responseStatusCode = responseStatusCode;
  }

  /**
   * Sets the <code>responseStatusCode</code> property.
   */
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
    return Objects.equals(this.method, integrationLogClientRequest.method) &&
        Objects.equals(this.host, integrationLogClientRequest.host) &&
        Objects.equals(this.path, integrationLogClientRequest.path) &&
        Objects.equals(this.requestHeaders, integrationLogClientRequest.requestHeaders) &&
        Objects.equals(this.responseHeaders, integrationLogClientRequest.responseHeaders) &&
        Objects.equals(this.responseStatusCode, integrationLogClientRequest.responseStatusCode);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

