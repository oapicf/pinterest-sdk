package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.Map;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * HTTP request details included in the log sent by the client.
 **/
@ApiModel(description = "HTTP request details included in the log sent by the client.")
@JsonTypeName("IntegrationLogClientRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-03-14T23:05:05.545684373Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class IntegrationLogClientRequest   {
  public enum MethodEnum {

    GET(String.valueOf("GET")), HEAD(String.valueOf("HEAD")), POST(String.valueOf("POST")), PUT(String.valueOf("PUT")), DELETE(String.valueOf("DELETE")), CONNECT(String.valueOf("CONNECT")), OPTIONS(String.valueOf("OPTIONS")), TRACE(String.valueOf("TRACE")), PATCH(String.valueOf("PATCH"));


    private String value;

    MethodEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    /**
     * Convert a String into String, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
    public static MethodEnum fromString(String s) {
        for (MethodEnum b : MethodEnum.values()) {
            // using Objects.toString() to be safe if value type non-object type
            // because types like 'int' etc. will be auto-boxed
            if (java.util.Objects.toString(b.value).equals(s)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected string value '" + s + "'");
    }

    @JsonCreator
    public static MethodEnum fromValue(String value) {
        for (MethodEnum b : MethodEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  private @Valid MethodEnum method;
  private @Valid String host;
  private @Valid String path;
  private @Valid Map<String, String> requestHeaders = new HashMap<>();
  private @Valid Map<String, String> responseHeaders = new HashMap<>();
  private @Valid Integer responseStatusCode;

  /**
   **/
  public IntegrationLogClientRequest method(MethodEnum method) {
    this.method = method;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("method")
  @NotNull
  public MethodEnum getMethod() {
    return method;
  }

  @JsonProperty("method")
  public void setMethod(MethodEnum method) {
    this.method = method;
  }

  /**
   * HTTP request host from host header.
   **/
  public IntegrationLogClientRequest host(String host) {
    this.host = host;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "HTTP request host from host header.")
  @JsonProperty("host")
  @NotNull
  public String getHost() {
    return host;
  }

  @JsonProperty("host")
  public void setHost(String host) {
    this.host = host;
  }

  /**
   * HTTP request path.
   **/
  public IntegrationLogClientRequest path(String path) {
    this.path = path;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "HTTP request path.")
  @JsonProperty("path")
  @NotNull
  public String getPath() {
    return path;
  }

  @JsonProperty("path")
  public void setPath(String path) {
    this.path = path;
  }

  /**
   * HTTP request headers as key-value pairs.
   **/
  public IntegrationLogClientRequest requestHeaders(Map<String, String> requestHeaders) {
    this.requestHeaders = requestHeaders;
    return this;
  }

  
  @ApiModelProperty(value = "HTTP request headers as key-value pairs.")
  @JsonProperty("request_headers")
  public Map<String, String> getRequestHeaders() {
    return requestHeaders;
  }

  @JsonProperty("request_headers")
  public void setRequestHeaders(Map<String, String> requestHeaders) {
    this.requestHeaders = requestHeaders;
  }

  public IntegrationLogClientRequest putRequestHeadersItem(String key, String requestHeadersItem) {
    if (this.requestHeaders == null) {
      this.requestHeaders = new HashMap<>();
    }

    this.requestHeaders.put(key, requestHeadersItem);
    return this;
  }

  public IntegrationLogClientRequest removeRequestHeadersItem(String requestHeadersItem) {
    if (requestHeadersItem != null && this.requestHeaders != null) {
      this.requestHeaders.remove(requestHeadersItem);
    }

    return this;
  }
  /**
   * HTTP response headers as key-value pairs.
   **/
  public IntegrationLogClientRequest responseHeaders(Map<String, String> responseHeaders) {
    this.responseHeaders = responseHeaders;
    return this;
  }

  
  @ApiModelProperty(value = "HTTP response headers as key-value pairs.")
  @JsonProperty("response_headers")
  public Map<String, String> getResponseHeaders() {
    return responseHeaders;
  }

  @JsonProperty("response_headers")
  public void setResponseHeaders(Map<String, String> responseHeaders) {
    this.responseHeaders = responseHeaders;
  }

  public IntegrationLogClientRequest putResponseHeadersItem(String key, String responseHeadersItem) {
    if (this.responseHeaders == null) {
      this.responseHeaders = new HashMap<>();
    }

    this.responseHeaders.put(key, responseHeadersItem);
    return this;
  }

  public IntegrationLogClientRequest removeResponseHeadersItem(String responseHeadersItem) {
    if (responseHeadersItem != null && this.responseHeaders != null) {
      this.responseHeaders.remove(responseHeadersItem);
    }

    return this;
  }
  /**
   **/
  public IntegrationLogClientRequest responseStatusCode(Integer responseStatusCode) {
    this.responseStatusCode = responseStatusCode;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("response_status_code")
  public Integer getResponseStatusCode() {
    return responseStatusCode;
  }

  @JsonProperty("response_status_code")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}

