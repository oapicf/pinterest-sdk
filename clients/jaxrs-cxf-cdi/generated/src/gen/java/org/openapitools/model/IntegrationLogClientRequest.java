package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.Map;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * HTTP request details included in the log sent by the client.
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "HTTP request details included in the log sent by the client.")
public class IntegrationLogClientRequest   {
  

public enum MethodEnum {

    @JsonProperty("GET") GET(String.valueOf("GET")), @JsonProperty("HEAD") HEAD(String.valueOf("HEAD")), @JsonProperty("POST") POST(String.valueOf("POST")), @JsonProperty("PUT") PUT(String.valueOf("PUT")), @JsonProperty("DELETE") DELETE(String.valueOf("DELETE")), @JsonProperty("CONNECT") CONNECT(String.valueOf("CONNECT")), @JsonProperty("OPTIONS") OPTIONS(String.valueOf("OPTIONS")), @JsonProperty("TRACE") TRACE(String.valueOf("TRACE")), @JsonProperty("PATCH") PATCH(String.valueOf("PATCH"));


    private String value;

    MethodEnum(String v) {
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

  private MethodEnum method;

  private String host;

  private String path;

  private Map<String, String> requestHeaders = new HashMap<>();

  private Map<String, String> responseHeaders = new HashMap<>();

  private Integer responseStatusCode;

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

