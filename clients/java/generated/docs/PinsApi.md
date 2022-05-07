# PinsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**pinsAnalytics**](PinsApi.md#pinsAnalytics) | **GET** /pins/{pin_id}/analytics | Get Pin analytics
[**pinsCreate**](PinsApi.md#pinsCreate) | **POST** /pins | Create Pin
[**pinsDelete**](PinsApi.md#pinsDelete) | **DELETE** /pins/{pin_id} | Delete Pin
[**pinsGet**](PinsApi.md#pinsGet) | **GET** /pins/{pin_id} | Get Pin


<a name="pinsAnalytics"></a>
# **pinsAnalytics**
> Map&lt;String, AnalyticsMetricsResponse&gt; pinsAnalytics(pinId, startDate, endDate, metricTypes, appTypes, splitField, adAccountId)

Get Pin analytics

Get analytics for a Pin owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;\&quot;https://developers.pinterest.com/docs/api/v5/#operation/ad_accounts/list\&quot;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account:  - For Pins on public or protected boards: Admin, Analyst. - For Pins on secret boards: Admin.

### Example
```java
// Import classes:
import com.cliffano.pinterestsdk.ApiClient;
import com.cliffano.pinterestsdk.ApiException;
import com.cliffano.pinterestsdk.Configuration;
import com.cliffano.pinterestsdk.auth.*;
import com.cliffano.pinterestsdk.models.*;
import com.cliffano.pinterestsdk.api.PinsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.pinterest.com/v5");
    
    // Configure OAuth2 access token for authorization: pinterest_oauth2
    OAuth pinterest_oauth2 = (OAuth) defaultClient.getAuthentication("pinterest_oauth2");
    pinterest_oauth2.setAccessToken("YOUR ACCESS TOKEN");

    PinsApi apiInstance = new PinsApi(defaultClient);
    String pinId = "pinId_example"; // String | Unique identifier of a Pin.
    LocalDate startDate = LocalDate.now(); // LocalDate | Metric report start date (UTC). Format: YYYY-MM-DD
    LocalDate endDate = LocalDate.now(); // LocalDate | Metric report end date (UTC). Format: YYYY-MM-DD
    List<String> metricTypes = Arrays.asList(); // List<String> | Pin metric types to get data for, default is all.
    String appTypes = "ALL"; // String | Apps or devices to get data for, default is all.
    String splitField = "NO_SPLIT"; // String | How to split the data into groups. Not including this param means data won't be split.
    String adAccountId = "adAccountId_example"; // String | Unique identifier of an ad account.
    try {
      Map<String, AnalyticsMetricsResponse> result = apiInstance.pinsAnalytics(pinId, startDate, endDate, metricTypes, appTypes, splitField, adAccountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PinsApi#pinsAnalytics");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pinId** | **String**| Unique identifier of a Pin. |
 **startDate** | **LocalDate**| Metric report start date (UTC). Format: YYYY-MM-DD |
 **endDate** | **LocalDate**| Metric report end date (UTC). Format: YYYY-MM-DD |
 **metricTypes** | [**List&lt;String&gt;**](String.md)| Pin metric types to get data for, default is all. | [enum: IMPRESSION, SAVE, PIN_CLICK, OUTBOUND_CLICK, VIDEO_MRC_VIEW, VIDEO_AVG_WATCH_TIME, VIDEO_V50_WATCH_TIME, QUARTILE_95_PERCENT_VIEW]
 **appTypes** | **String**| Apps or devices to get data for, default is all. | [optional] [default to ALL] [enum: ALL, MOBILE, TABLET, WEB]
 **splitField** | **String**| How to split the data into groups. Not including this param means data won&#39;t be split. | [optional] [default to NO_SPLIT] [enum: NO_SPLIT, APP_TYPE]
 **adAccountId** | **String**| Unique identifier of an ad account. | [optional]

### Return type

[**Map&lt;String, AnalyticsMetricsResponse&gt;**](AnalyticsMetricsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | response |  -  |
**403** | Not authorized to access board or Pin. |  -  |
**404** | Pin not found. |  -  |
**0** | Unexpected error |  -  |

<a name="pinsCreate"></a>
# **pinsCreate**
> Pin pinsCreate(pin)

Create Pin

Create a Pin on a board or board section owned by the \&quot;operation user_account\&quot;.  Note: If the current \&quot;operation user_account\&quot; (defined by the access token) has access to another user&#39;s Ad Accounts via Pinterest Business Access, you can modify your request to make use of the current operation_user_account&#39;s permissions to those Ad Accounts by including the ad_account_id in the path parameters for the request (e.g. .../?ad_account_id&#x3D;12345&amp;...).  - This function is intended solely for publishing new content created by the user. If you are interested in saving content created by others to your Pinterest boards, sometimes called &#39;curated content&#39;, please use our &lt;a href&#x3D;&#39;/docs/add-ons/save-button&#39;&gt;Save button&lt;/a&gt; instead. For more tips on creating fresh content for Pinterest, review our &lt;a href&#x3D;&#39;/docs/solutions/content-apps&#39;&gt;Content App Solutions Guide&lt;/a&gt;.  &lt;strong&gt;&lt;a href&#x3D;&#39;/docs/solutions/content-apps/#creatingvideopins&#39;&gt;Learn more&lt;/a&gt;&lt;/strong&gt; about video Pin creation.

### Example
```java
// Import classes:
import com.cliffano.pinterestsdk.ApiClient;
import com.cliffano.pinterestsdk.ApiException;
import com.cliffano.pinterestsdk.Configuration;
import com.cliffano.pinterestsdk.auth.*;
import com.cliffano.pinterestsdk.models.*;
import com.cliffano.pinterestsdk.api.PinsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.pinterest.com/v5");
    
    // Configure OAuth2 access token for authorization: pinterest_oauth2
    OAuth pinterest_oauth2 = (OAuth) defaultClient.getAuthentication("pinterest_oauth2");
    pinterest_oauth2.setAccessToken("YOUR ACCESS TOKEN");

    PinsApi apiInstance = new PinsApi(defaultClient);
    Pin pin = new Pin(); // Pin | Create a new Pin.
    try {
      Pin result = apiInstance.pinsCreate(pin);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PinsApi#pinsCreate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pin** | [**Pin**](Pin.md)| Create a new Pin. |

### Return type

[**Pin**](Pin.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Successful pin creation. |  -  |
**400** | Invalid Pin parameters response |  -  |
**403** | The Pin&#39;s image is too small, too large or is broken |  -  |
**404** | Board or section not found |  -  |
**429** | This request exceeded a rate limit. This can happen if the client exceeds one of the published rate limits or if multiple write operations are applied to an object within a short time window. |  -  |
**0** | Unexpected error |  -  |

<a name="pinsDelete"></a>
# **pinsDelete**
> pinsDelete(pinId)

Delete Pin

Delete a Pins owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. - By default, the \&quot;operation user_account\&quot; is the token user_account.

### Example
```java
// Import classes:
import com.cliffano.pinterestsdk.ApiClient;
import com.cliffano.pinterestsdk.ApiException;
import com.cliffano.pinterestsdk.Configuration;
import com.cliffano.pinterestsdk.auth.*;
import com.cliffano.pinterestsdk.models.*;
import com.cliffano.pinterestsdk.api.PinsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.pinterest.com/v5");
    
    // Configure OAuth2 access token for authorization: pinterest_oauth2
    OAuth pinterest_oauth2 = (OAuth) defaultClient.getAuthentication("pinterest_oauth2");
    pinterest_oauth2.setAccessToken("YOUR ACCESS TOKEN");

    PinsApi apiInstance = new PinsApi(defaultClient);
    String pinId = "pinId_example"; // String | Unique identifier of a Pin.
    try {
      apiInstance.pinsDelete(pinId);
    } catch (ApiException e) {
      System.err.println("Exception when calling PinsApi#pinsDelete");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pinId** | **String**| Unique identifier of a Pin. |

### Return type

null (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Successfully deleted Pin |  -  |
**403** | Not authorized to access board or Pin. |  -  |
**404** | Pin not found. |  -  |
**0** | Unexpected error |  -  |

<a name="pinsGet"></a>
# **pinsGet**
> Pin pinsGet(pinId, adAccountId)

Get Pin

Get a Pin owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.

### Example
```java
// Import classes:
import com.cliffano.pinterestsdk.ApiClient;
import com.cliffano.pinterestsdk.ApiException;
import com.cliffano.pinterestsdk.Configuration;
import com.cliffano.pinterestsdk.auth.*;
import com.cliffano.pinterestsdk.models.*;
import com.cliffano.pinterestsdk.api.PinsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.pinterest.com/v5");
    
    // Configure OAuth2 access token for authorization: pinterest_oauth2
    OAuth pinterest_oauth2 = (OAuth) defaultClient.getAuthentication("pinterest_oauth2");
    pinterest_oauth2.setAccessToken("YOUR ACCESS TOKEN");

    PinsApi apiInstance = new PinsApi(defaultClient);
    String pinId = "pinId_example"; // String | Unique identifier of a Pin.
    String adAccountId = "adAccountId_example"; // String | Unique identifier of an ad account.
    try {
      Pin result = apiInstance.pinsGet(pinId, adAccountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PinsApi#pinsGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pinId** | **String**| Unique identifier of a Pin. |
 **adAccountId** | **String**| Unique identifier of an ad account. | [optional]

### Return type

[**Pin**](Pin.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | response |  -  |
**403** | Not authorized to access board or Pin. |  -  |
**404** | Pin not found. |  -  |
**0** | Unexpected error |  -  |

