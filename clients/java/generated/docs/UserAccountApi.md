# UserAccountApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**userAccountAnalytics**](UserAccountApi.md#userAccountAnalytics) | **GET** /user_account/analytics | Get user account analytics
[**userAccountGet**](UserAccountApi.md#userAccountGet) | **GET** /user_account | Get user account


<a name="userAccountAnalytics"></a>
# **userAccountAnalytics**
> Map&lt;String, AnalyticsMetricsResponse&gt; userAccountAnalytics(startDate, endDate, fromClaimedContent, pinFormat, appTypes, metricTypes, splitField, adAccountId)

Get user account analytics

Get analytics for the \&quot;operation user_account\&quot; - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;.

### Example
```java
// Import classes:
import com.cliffano.pinterestsdk.ApiClient;
import com.cliffano.pinterestsdk.ApiException;
import com.cliffano.pinterestsdk.Configuration;
import com.cliffano.pinterestsdk.auth.*;
import com.cliffano.pinterestsdk.models.*;
import com.cliffano.pinterestsdk.api.UserAccountApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.pinterest.com/v5");
    
    // Configure OAuth2 access token for authorization: pinterest_oauth2
    OAuth pinterest_oauth2 = (OAuth) defaultClient.getAuthentication("pinterest_oauth2");
    pinterest_oauth2.setAccessToken("YOUR ACCESS TOKEN");

    UserAccountApi apiInstance = new UserAccountApi(defaultClient);
    LocalDate startDate = LocalDate.now(); // LocalDate | Metric report start date (UTC). Format: YYYY-MM-DD
    LocalDate endDate = LocalDate.now(); // LocalDate | Metric report end date (UTC). Format: YYYY-MM-DD
    String fromClaimedContent = "OTHER"; // String | Filter on Pins that match your claimed domain.
    String pinFormat = "ALL"; // String | Pin formats to get data for, default is all.
    String appTypes = "ALL"; // String | Apps or devices to get data for, default is all.
    List<String> metricTypes = Arrays.asList(); // List<String> | Metric types to get data for, default is all. 
    String splitField = "NO_SPLIT"; // String | How to split the data into groups. Not including this param means data won't be split.
    String adAccountId = "adAccountId_example"; // String | Unique identifier of an ad account.
    try {
      Map<String, AnalyticsMetricsResponse> result = apiInstance.userAccountAnalytics(startDate, endDate, fromClaimedContent, pinFormat, appTypes, metricTypes, splitField, adAccountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserAccountApi#userAccountAnalytics");
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
 **startDate** | **LocalDate**| Metric report start date (UTC). Format: YYYY-MM-DD |
 **endDate** | **LocalDate**| Metric report end date (UTC). Format: YYYY-MM-DD |
 **fromClaimedContent** | **String**| Filter on Pins that match your claimed domain. | [optional] [default to BOTH] [enum: OTHER, CLAIMED, BOTH]
 **pinFormat** | **String**| Pin formats to get data for, default is all. | [optional] [default to ALL] [enum: ALL, PRODUCT, REGULAR, VIDEO]
 **appTypes** | **String**| Apps or devices to get data for, default is all. | [optional] [default to ALL] [enum: ALL, MOBILE, TABLET, WEB]
 **metricTypes** | [**List&lt;String&gt;**](String.md)| Metric types to get data for, default is all.  | [optional] [enum: ENGAGEMENT, ENGAGEMENT_RATE, IMPRESSION, OUTBOUND_CLICK, OUTBOUND_CLICK_RATE, PIN_CLICK, PIN_CLICK_RATE, SAVE, SAVE_RATE]
 **splitField** | **String**| How to split the data into groups. Not including this param means data won&#39;t be split. | [optional] [default to NO_SPLIT] [enum: NO_SPLIT, APP_TYPE, OWNED_CONTENT, PIN_FORMAT]
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
**200** | Success |  -  |
**403** | Not authorized to access the user account analytics. |  -  |
**0** | Unexpected error |  -  |

<a name="userAccountGet"></a>
# **userAccountGet**
> Account userAccountGet(adAccountId)

Get user account

Get account information for the \&quot;operation user_account\&quot; - By default, the \&quot;operation user_account\&quot; is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. See &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Understanding-business-access&#39;&gt;Understanding Business Access&lt;/a&gt; for more information.

### Example
```java
// Import classes:
import com.cliffano.pinterestsdk.ApiClient;
import com.cliffano.pinterestsdk.ApiException;
import com.cliffano.pinterestsdk.Configuration;
import com.cliffano.pinterestsdk.auth.*;
import com.cliffano.pinterestsdk.models.*;
import com.cliffano.pinterestsdk.api.UserAccountApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.pinterest.com/v5");
    
    // Configure OAuth2 access token for authorization: pinterest_oauth2
    OAuth pinterest_oauth2 = (OAuth) defaultClient.getAuthentication("pinterest_oauth2");
    pinterest_oauth2.setAccessToken("YOUR ACCESS TOKEN");

    UserAccountApi apiInstance = new UserAccountApi(defaultClient);
    String adAccountId = "adAccountId_example"; // String | Unique identifier of an ad account.
    try {
      Account result = apiInstance.userAccountGet(adAccountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserAccountApi#userAccountGet");
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
 **adAccountId** | **String**| Unique identifier of an ad account. | [optional]

### Return type

[**Account**](Account.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | response |  -  |
**403** | Not authorized to access the user account. |  -  |
**0** | Unexpected error |  -  |

