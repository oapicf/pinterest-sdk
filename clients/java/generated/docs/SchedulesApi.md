# SchedulesApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**schedulesCreate**](SchedulesApi.md#schedulesCreate) | **POST** /ad_accounts/{ad_account_id}/schedules | Create schedules |
| [**schedulesList**](SchedulesApi.md#schedulesList) | **GET** /ad_accounts/{ad_account_id}/schedules | Get Schedules |
| [**schedulesUpdate**](SchedulesApi.md#schedulesUpdate) | **PATCH** /ad_accounts/{ad_account_id}/schedules | Update schedules |


<a id="schedulesCreate"></a>
# **schedulesCreate**
> List&lt;SchedulesCreate200ResponseInner&gt; schedulesCreate(adAccountId, scheduleCreate)

Create schedules

Batch create schedules

### Example
```java
// Import classes:
import com.github.oapicf.pinterestsdk.ApiClient;
import com.github.oapicf.pinterestsdk.ApiException;
import com.github.oapicf.pinterestsdk.Configuration;
import com.github.oapicf.pinterestsdk.auth.*;
import com.github.oapicf.pinterestsdk.models.*;
import com.github.oapicf.pinterestsdk.api.SchedulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.pinterest.com/v5");
    
    // Configure OAuth2 access token for authorization: pinterest_oauth2
    OAuth pinterest_oauth2 = (OAuth) defaultClient.getAuthentication("pinterest_oauth2");
    pinterest_oauth2.setAccessToken("YOUR ACCESS TOKEN");

    SchedulesApi apiInstance = new SchedulesApi(defaultClient);
    String adAccountId = "adAccountId_example"; // String | 
    List<ScheduleCreate> scheduleCreate = Arrays.asList(); // List<ScheduleCreate> | 
    try {
      List<SchedulesCreate200ResponseInner> result = apiInstance.schedulesCreate(adAccountId, scheduleCreate);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SchedulesApi#schedulesCreate");
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
| **adAccountId** | **String**|  | |
| **scheduleCreate** | [**List&lt;ScheduleCreate&gt;**](ScheduleCreate.md)|  | |

### Return type

[**List&lt;SchedulesCreate200ResponseInner&gt;**](SchedulesCreate200ResponseInner.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **201** | Resource create operation completed successfully. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **0** | An unexpected error response. |  -  |

<a id="schedulesList"></a>
# **schedulesList**
> SchedulesList200Response schedulesList(adAccountId, entityIds, bookmark, pageSize, order, scheduleStatuses, scheduleType)

Get Schedules

Get schedules for a specific advertiser

### Example
```java
// Import classes:
import com.github.oapicf.pinterestsdk.ApiClient;
import com.github.oapicf.pinterestsdk.ApiException;
import com.github.oapicf.pinterestsdk.Configuration;
import com.github.oapicf.pinterestsdk.auth.*;
import com.github.oapicf.pinterestsdk.models.*;
import com.github.oapicf.pinterestsdk.api.SchedulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.pinterest.com/v5");
    
    // Configure OAuth2 access token for authorization: pinterest_oauth2
    OAuth pinterest_oauth2 = (OAuth) defaultClient.getAuthentication("pinterest_oauth2");
    pinterest_oauth2.setAccessToken("YOUR ACCESS TOKEN");

    SchedulesApi apiInstance = new SchedulesApi(defaultClient);
    String adAccountId = "adAccountId_example"; // String | 
    List<String> entityIds = Arrays.asList(); // List<String> | List of Entity IDs, must be associated with the Ad Accound ID provided in the path.
    String bookmark = "bookmark_example"; // String | Cursor used to fetch the next page of items
    Integer pageSize = 25; // Integer | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
    PinterestLibPaginationOrder order = PinterestLibPaginationOrder.fromValue("ASCENDING"); // PinterestLibPaginationOrder | The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.
    List<ScheduleStatus> scheduleStatuses = Arrays.asList(); // List<ScheduleStatus> | Filter schedules by status (one or more)
    ScheduleType scheduleType = ScheduleType.fromValue("CAMPAIGN_BUDGET_CHANGE"); // ScheduleType | Filter schedules by a type
    try {
      SchedulesList200Response result = apiInstance.schedulesList(adAccountId, entityIds, bookmark, pageSize, order, scheduleStatuses, scheduleType);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SchedulesApi#schedulesList");
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
| **adAccountId** | **String**|  | |
| **entityIds** | [**List&lt;String&gt;**](String.md)| List of Entity IDs, must be associated with the Ad Accound ID provided in the path. | |
| **bookmark** | **String**| Cursor used to fetch the next page of items | [optional] |
| **pageSize** | **Integer**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25] |
| **order** | [**PinterestLibPaginationOrder**](.md)| The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] [enum: ASCENDING, DESCENDING] |
| **scheduleStatuses** | [**List&lt;ScheduleStatus&gt;**](ScheduleStatus.md)| Filter schedules by status (one or more) | [optional] |
| **scheduleType** | [**ScheduleType**](.md)| Filter schedules by a type | [optional] [enum: CAMPAIGN_BUDGET_CHANGE, CAMPAIGN_BID_MULTIPLIERS] |

### Return type

[**SchedulesList200Response**](SchedulesList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

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

<a id="schedulesUpdate"></a>
# **schedulesUpdate**
> List&lt;SchedulesCreate200ResponseInner&gt; schedulesUpdate(adAccountId, scheduleBatchUpdate)

Update schedules

Update one or more schedules

### Example
```java
// Import classes:
import com.github.oapicf.pinterestsdk.ApiClient;
import com.github.oapicf.pinterestsdk.ApiException;
import com.github.oapicf.pinterestsdk.Configuration;
import com.github.oapicf.pinterestsdk.auth.*;
import com.github.oapicf.pinterestsdk.models.*;
import com.github.oapicf.pinterestsdk.api.SchedulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.pinterest.com/v5");
    
    // Configure OAuth2 access token for authorization: pinterest_oauth2
    OAuth pinterest_oauth2 = (OAuth) defaultClient.getAuthentication("pinterest_oauth2");
    pinterest_oauth2.setAccessToken("YOUR ACCESS TOKEN");

    SchedulesApi apiInstance = new SchedulesApi(defaultClient);
    String adAccountId = "adAccountId_example"; // String | 
    List<ScheduleBatchUpdate> scheduleBatchUpdate = Arrays.asList(); // List<ScheduleBatchUpdate> | 
    try {
      List<SchedulesCreate200ResponseInner> result = apiInstance.schedulesUpdate(adAccountId, scheduleBatchUpdate);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SchedulesApi#schedulesUpdate");
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
| **adAccountId** | **String**|  | |
| **scheduleBatchUpdate** | [**List&lt;ScheduleBatchUpdate&gt;**](ScheduleBatchUpdate.md)|  | |

### Return type

[**List&lt;SchedulesCreate200ResponseInner&gt;**](SchedulesCreate200ResponseInner.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

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

