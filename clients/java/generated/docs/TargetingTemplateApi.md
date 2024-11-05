# TargetingTemplateApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**targetingTemplateCreate**](TargetingTemplateApi.md#targetingTemplateCreate) | **POST** /ad_accounts/{ad_account_id}/targeting_templates | Create targeting templates |
| [**targetingTemplateList**](TargetingTemplateApi.md#targetingTemplateList) | **GET** /ad_accounts/{ad_account_id}/targeting_templates | List targeting templates |
| [**targetingTemplateUpdate**](TargetingTemplateApi.md#targetingTemplateUpdate) | **PATCH** /ad_accounts/{ad_account_id}/targeting_templates | Update targeting templates |


<a id="targetingTemplateCreate"></a>
# **targetingTemplateCreate**
> TargetingTemplateGetResponseData targetingTemplateCreate(adAccountId, targetingTemplateCreate)

Create targeting templates

&lt;p&gt;Targeting templates allow advertisers to save a set of targeting details including audience lists,  keywords &amp; interest, demographics, and placements to use more than once during the campaign creation process.&lt;/p&gt;  &lt;p&gt;Templates can be used to build out basic targeting criteria that you plan to use across campaigns and to reuse   performance targeting from prior campaigns for new campaigns.&lt;/p&gt;

### Example
```java
// Import classes:
import com.github.oapicf.pinterestsdk.ApiClient;
import com.github.oapicf.pinterestsdk.ApiException;
import com.github.oapicf.pinterestsdk.Configuration;
import com.github.oapicf.pinterestsdk.auth.*;
import com.github.oapicf.pinterestsdk.models.*;
import com.github.oapicf.pinterestsdk.api.TargetingTemplateApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.pinterest.com/v5");
    
    // Configure OAuth2 access token for authorization: pinterest_oauth2
    OAuth pinterest_oauth2 = (OAuth) defaultClient.getAuthentication("pinterest_oauth2");
    pinterest_oauth2.setAccessToken("YOUR ACCESS TOKEN");

    TargetingTemplateApi apiInstance = new TargetingTemplateApi(defaultClient);
    String adAccountId = "adAccountId_example"; // String | Unique identifier of an ad account.
    TargetingTemplateCreate targetingTemplateCreate = new TargetingTemplateCreate(); // TargetingTemplateCreate | targeting template creation entity
    try {
      TargetingTemplateGetResponseData result = apiInstance.targetingTemplateCreate(adAccountId, targetingTemplateCreate);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TargetingTemplateApi#targetingTemplateCreate");
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
| **targetingTemplateCreate** | [**TargetingTemplateCreate**](TargetingTemplateCreate.md)| targeting template creation entity | |

### Return type

[**TargetingTemplateGetResponseData**](TargetingTemplateGetResponseData.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Invalid ad account id. |  -  |
| **0** | Unexpected error |  -  |

<a id="targetingTemplateList"></a>
# **targetingTemplateList**
> TargetingTemplateList200Response targetingTemplateList(adAccountId, order, includeSizing, searchQuery, pageSize, bookmark)

List targeting templates

Get a list of the targeting templates in the specified &lt;code&gt;ad_account_id&lt;/code&gt;

### Example
```java
// Import classes:
import com.github.oapicf.pinterestsdk.ApiClient;
import com.github.oapicf.pinterestsdk.ApiException;
import com.github.oapicf.pinterestsdk.Configuration;
import com.github.oapicf.pinterestsdk.auth.*;
import com.github.oapicf.pinterestsdk.models.*;
import com.github.oapicf.pinterestsdk.api.TargetingTemplateApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.pinterest.com/v5");
    
    // Configure OAuth2 access token for authorization: pinterest_oauth2
    OAuth pinterest_oauth2 = (OAuth) defaultClient.getAuthentication("pinterest_oauth2");
    pinterest_oauth2.setAccessToken("YOUR ACCESS TOKEN");

    TargetingTemplateApi apiInstance = new TargetingTemplateApi(defaultClient);
    String adAccountId = "adAccountId_example"; // String | Unique identifier of an ad account.
    String order = "ASCENDING"; // String | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.
    Boolean includeSizing = false; // Boolean | Include audience sizing in result or not
    String searchQuery = "gaming"; // String | Search keyword for targeting templates
    Integer pageSize = 25; // Integer | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
    String bookmark = "bookmark_example"; // String | Cursor used to fetch the next page of items
    try {
      TargetingTemplateList200Response result = apiInstance.targetingTemplateList(adAccountId, order, includeSizing, searchQuery, pageSize, bookmark);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TargetingTemplateApi#targetingTemplateList");
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
| **order** | **String**| The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] [enum: ASCENDING, DESCENDING] |
| **includeSizing** | **Boolean**| Include audience sizing in result or not | [optional] [default to false] |
| **searchQuery** | **String**| Search keyword for targeting templates | [optional] |
| **pageSize** | **Integer**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25] |
| **bookmark** | **String**| Cursor used to fetch the next page of items | [optional] |

### Return type

[**TargetingTemplateList200Response**](TargetingTemplateList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Invalid ad account id. |  -  |
| **0** | Unexpected error |  -  |

<a id="targetingTemplateUpdate"></a>
# **targetingTemplateUpdate**
> targetingTemplateUpdate(adAccountId, targetingTemplateUpdateRequest)

Update targeting templates

&lt;p&gt;Update the targeting template given advertiser ID and targeting template ID&lt;/p&gt;

### Example
```java
// Import classes:
import com.github.oapicf.pinterestsdk.ApiClient;
import com.github.oapicf.pinterestsdk.ApiException;
import com.github.oapicf.pinterestsdk.Configuration;
import com.github.oapicf.pinterestsdk.auth.*;
import com.github.oapicf.pinterestsdk.models.*;
import com.github.oapicf.pinterestsdk.api.TargetingTemplateApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.pinterest.com/v5");
    
    // Configure OAuth2 access token for authorization: pinterest_oauth2
    OAuth pinterest_oauth2 = (OAuth) defaultClient.getAuthentication("pinterest_oauth2");
    pinterest_oauth2.setAccessToken("YOUR ACCESS TOKEN");

    TargetingTemplateApi apiInstance = new TargetingTemplateApi(defaultClient);
    String adAccountId = "adAccountId_example"; // String | Unique identifier of an ad account.
    TargetingTemplateUpdateRequest targetingTemplateUpdateRequest = new TargetingTemplateUpdateRequest(); // TargetingTemplateUpdateRequest | Operation type and targeting template ID
    try {
      apiInstance.targetingTemplateUpdate(adAccountId, targetingTemplateUpdateRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling TargetingTemplateApi#targetingTemplateUpdate");
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
| **targetingTemplateUpdateRequest** | [**TargetingTemplateUpdateRequest**](TargetingTemplateUpdateRequest.md)| Operation type and targeting template ID | |

### Return type

null (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Invalid ad account id. |  -  |
| **0** | Unexpected error |  -  |

