# ConversionsApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**advertiserDefinedEventsCreate**](ConversionsApi.md#advertiserDefinedEventsCreate) | **POST** /ad_accounts/{ad_account_id}/advertiser_defined_events | Create advertiser defined events |
| [**advertiserDefinedEventsDelete**](ConversionsApi.md#advertiserDefinedEventsDelete) | **DELETE** /ad_accounts/{ad_account_id}/advertiser_defined_events | Delete advertiser defined events |
| [**advertiserDefinedEventsGet**](ConversionsApi.md#advertiserDefinedEventsGet) | **GET** /ad_accounts/{ad_account_id}/advertiser_defined_events | Get advertiser defined events |
| [**advertiserDefinedEventsUpdate**](ConversionsApi.md#advertiserDefinedEventsUpdate) | **PATCH** /ad_accounts/{ad_account_id}/advertiser_defined_events | Update advertiser defined events |


<a id="advertiserDefinedEventsCreate"></a>
# **advertiserDefinedEventsCreate**
> AdvertiserDefinedEventsCreate200Response advertiserDefinedEventsCreate(adAccountId, advertiserDefinedEventsCreateRequest)

Create advertiser defined events

Map advertiser defined events to standard events for the given ad account.

### Example
```java
// Import classes:
import com.github.oapicf.pinterestsdk.ApiClient;
import com.github.oapicf.pinterestsdk.ApiException;
import com.github.oapicf.pinterestsdk.Configuration;
import com.github.oapicf.pinterestsdk.auth.*;
import com.github.oapicf.pinterestsdk.models.*;
import com.github.oapicf.pinterestsdk.api.ConversionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.pinterest.com/v5");
    
    // Configure OAuth2 access token for authorization: pinterest_oauth2
    OAuth pinterest_oauth2 = (OAuth) defaultClient.getAuthentication("pinterest_oauth2");
    pinterest_oauth2.setAccessToken("YOUR ACCESS TOKEN");

    // Configure OAuth2 access token for authorization: client_credentials
    OAuth client_credentials = (OAuth) defaultClient.getAuthentication("client_credentials");
    client_credentials.setAccessToken("YOUR ACCESS TOKEN");

    ConversionsApi apiInstance = new ConversionsApi(defaultClient);
    String adAccountId = "adAccountId_example"; // String | Unique identifier of an ad account.
    AdvertiserDefinedEventsCreateRequest advertiserDefinedEventsCreateRequest = new AdvertiserDefinedEventsCreateRequest(); // AdvertiserDefinedEventsCreateRequest | 
    try {
      AdvertiserDefinedEventsCreate200Response result = apiInstance.advertiserDefinedEventsCreate(adAccountId, advertiserDefinedEventsCreateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConversionsApi#advertiserDefinedEventsCreate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **adAccountId** | **String**| Unique identifier of an ad account. | |
| **advertiserDefinedEventsCreateRequest** | [**AdvertiserDefinedEventsCreateRequest**](AdvertiserDefinedEventsCreateRequest.md)|  | |

### Return type

[**AdvertiserDefinedEventsCreate200Response**](AdvertiserDefinedEventsCreate200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **0** | An unexpected error response. |  -  |

<a id="advertiserDefinedEventsDelete"></a>
# **advertiserDefinedEventsDelete**
> AdvertiserDefinedEventsCreate200Response advertiserDefinedEventsDelete(adAccountId, eventNames)

Delete advertiser defined events

Untrack advertiser defined events for the given ad account.

### Example
```java
// Import classes:
import com.github.oapicf.pinterestsdk.ApiClient;
import com.github.oapicf.pinterestsdk.ApiException;
import com.github.oapicf.pinterestsdk.Configuration;
import com.github.oapicf.pinterestsdk.auth.*;
import com.github.oapicf.pinterestsdk.models.*;
import com.github.oapicf.pinterestsdk.api.ConversionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.pinterest.com/v5");
    
    // Configure OAuth2 access token for authorization: pinterest_oauth2
    OAuth pinterest_oauth2 = (OAuth) defaultClient.getAuthentication("pinterest_oauth2");
    pinterest_oauth2.setAccessToken("YOUR ACCESS TOKEN");

    // Configure OAuth2 access token for authorization: client_credentials
    OAuth client_credentials = (OAuth) defaultClient.getAuthentication("client_credentials");
    client_credentials.setAccessToken("YOUR ACCESS TOKEN");

    ConversionsApi apiInstance = new ConversionsApi(defaultClient);
    String adAccountId = "adAccountId_example"; // String | Unique identifier of an ad account.
    List<String> eventNames = Arrays.asList(); // List<String> | List of event names to delete
    try {
      AdvertiserDefinedEventsCreate200Response result = apiInstance.advertiserDefinedEventsDelete(adAccountId, eventNames);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConversionsApi#advertiserDefinedEventsDelete");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **adAccountId** | **String**| Unique identifier of an ad account. | |
| **eventNames** | [**List&lt;String&gt;**](String.md)| List of event names to delete | |

### Return type

[**AdvertiserDefinedEventsCreate200Response**](AdvertiserDefinedEventsCreate200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **0** | An unexpected error response. |  -  |

<a id="advertiserDefinedEventsGet"></a>
# **advertiserDefinedEventsGet**
> AdvertiserDefinedEventsGet200Response advertiserDefinedEventsGet(adAccountId)

Get advertiser defined events

Get advertiser defined events for the given ad account.

### Example
```java
// Import classes:
import com.github.oapicf.pinterestsdk.ApiClient;
import com.github.oapicf.pinterestsdk.ApiException;
import com.github.oapicf.pinterestsdk.Configuration;
import com.github.oapicf.pinterestsdk.auth.*;
import com.github.oapicf.pinterestsdk.models.*;
import com.github.oapicf.pinterestsdk.api.ConversionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.pinterest.com/v5");
    
    // Configure OAuth2 access token for authorization: pinterest_oauth2
    OAuth pinterest_oauth2 = (OAuth) defaultClient.getAuthentication("pinterest_oauth2");
    pinterest_oauth2.setAccessToken("YOUR ACCESS TOKEN");

    // Configure OAuth2 access token for authorization: client_credentials
    OAuth client_credentials = (OAuth) defaultClient.getAuthentication("client_credentials");
    client_credentials.setAccessToken("YOUR ACCESS TOKEN");

    ConversionsApi apiInstance = new ConversionsApi(defaultClient);
    String adAccountId = "adAccountId_example"; // String | Unique identifier of an ad account.
    try {
      AdvertiserDefinedEventsGet200Response result = apiInstance.advertiserDefinedEventsGet(adAccountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConversionsApi#advertiserDefinedEventsGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **adAccountId** | **String**| Unique identifier of an ad account. | |

### Return type

[**AdvertiserDefinedEventsGet200Response**](AdvertiserDefinedEventsGet200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **0** | An unexpected error response. |  -  |

<a id="advertiserDefinedEventsUpdate"></a>
# **advertiserDefinedEventsUpdate**
> AdvertiserDefinedEventsCreate200Response advertiserDefinedEventsUpdate(adAccountId, advertiserDefinedEventsCreateRequest)

Update advertiser defined events

Update advertiser defined event names or mappings for the given ad account.

### Example
```java
// Import classes:
import com.github.oapicf.pinterestsdk.ApiClient;
import com.github.oapicf.pinterestsdk.ApiException;
import com.github.oapicf.pinterestsdk.Configuration;
import com.github.oapicf.pinterestsdk.auth.*;
import com.github.oapicf.pinterestsdk.models.*;
import com.github.oapicf.pinterestsdk.api.ConversionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.pinterest.com/v5");
    
    // Configure OAuth2 access token for authorization: pinterest_oauth2
    OAuth pinterest_oauth2 = (OAuth) defaultClient.getAuthentication("pinterest_oauth2");
    pinterest_oauth2.setAccessToken("YOUR ACCESS TOKEN");

    // Configure OAuth2 access token for authorization: client_credentials
    OAuth client_credentials = (OAuth) defaultClient.getAuthentication("client_credentials");
    client_credentials.setAccessToken("YOUR ACCESS TOKEN");

    ConversionsApi apiInstance = new ConversionsApi(defaultClient);
    String adAccountId = "adAccountId_example"; // String | Unique identifier of an ad account.
    AdvertiserDefinedEventsCreateRequest advertiserDefinedEventsCreateRequest = new AdvertiserDefinedEventsCreateRequest(); // AdvertiserDefinedEventsCreateRequest | 
    try {
      AdvertiserDefinedEventsCreate200Response result = apiInstance.advertiserDefinedEventsUpdate(adAccountId, advertiserDefinedEventsCreateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConversionsApi#advertiserDefinedEventsUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **adAccountId** | **String**| Unique identifier of an ad account. | |
| **advertiserDefinedEventsCreateRequest** | [**AdvertiserDefinedEventsCreateRequest**](AdvertiserDefinedEventsCreateRequest.md)|  | |

### Return type

[**AdvertiserDefinedEventsCreate200Response**](AdvertiserDefinedEventsCreate200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **0** | An unexpected error response. |  -  |

