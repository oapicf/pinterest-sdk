package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.Map;
import org.openapitools.server.model.HttpMethod;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * HTTP request details included in the log sent by the client.
 */
public class IntegrationLogClientRequest   {

    private String host;
    private HttpMethod method;
    private String path;
    private Map<String, String> requestHeaders = new HashMap<>();
    private Map<String, String> responseHeaders = new HashMap<>();
    private Integer responseStatusCode;

    /**
     * Default constructor.
     */
    public IntegrationLogClientRequest() {
    // JSON-B / Jackson
    }

    /**
     * Create IntegrationLogClientRequest.
     *
     * @param host HTTP request host from host header.
     * @param method method
     * @param path HTTP request path.
     * @param requestHeaders HTTP request headers as key-value pairs.
     * @param responseHeaders HTTP response headers as key-value pairs.
     * @param responseStatusCode responseStatusCode
     */
    public IntegrationLogClientRequest(
        String host, 
        HttpMethod method, 
        String path, 
        Map<String, String> requestHeaders, 
        Map<String, String> responseHeaders, 
        Integer responseStatusCode
    ) {
        this.host = host;
        this.method = method;
        this.path = path;
        this.requestHeaders = requestHeaders;
        this.responseHeaders = responseHeaders;
        this.responseStatusCode = responseStatusCode;
    }



    /**
     * HTTP request host from host header.
     * @return host
     */
    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    /**
     * Get method
     * @return method
     */
    public HttpMethod getMethod() {
        return method;
    }

    public void setMethod(HttpMethod method) {
        this.method = method;
    }

    /**
     * HTTP request path.
     * @return path
     */
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    /**
     * HTTP request headers as key-value pairs.
     * @return requestHeaders
     */
    public Map<String, String> getRequestHeaders() {
        return requestHeaders;
    }

    public void setRequestHeaders(Map<String, String> requestHeaders) {
        this.requestHeaders = requestHeaders;
    }

    /**
     * HTTP response headers as key-value pairs.
     * @return responseHeaders
     */
    public Map<String, String> getResponseHeaders() {
        return responseHeaders;
    }

    public void setResponseHeaders(Map<String, String> responseHeaders) {
        this.responseHeaders = responseHeaders;
    }

    /**
     * Get responseStatusCode
     * @return responseStatusCode
     */
    public Integer getResponseStatusCode() {
        return responseStatusCode;
    }

    public void setResponseStatusCode(Integer responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
    }

    /**
      * Create a string representation of this pojo.
    **/
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

