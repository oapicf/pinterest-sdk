# AudienceSharingApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**adAccountsAudiencesSharedAccountsList**](AudienceSharingApi.md#adAccountsAudiencesSharedAccountsList) | **GET** /ad_accounts/{ad_account_id}/audiences/shared/accounts | List accounts with access to an audience owned by an ad account |
| [**businessAccountAudiencesSharedAccountsList**](AudienceSharingApi.md#businessAccountAudiencesSharedAccountsList) | **GET** /businesses/{business_id}/audiences/shared/accounts | List accounts with access to an audience owned by a business |
| [**sharedAudiencesForBusinessList**](AudienceSharingApi.md#sharedAudiencesForBusinessList) | **GET** /businesses/{business_id}/audiences | List received audiences for a business |
| [**updateAdAccountToAdAccountSharedAudience**](AudienceSharingApi.md#updateAdAccountToAdAccountSharedAudience) | **PATCH** /ad_accounts/{ad_account_id}/audiences/ad_accounts/shared | Update audience sharing between ad accounts |
| [**updateAdAccountToBusinessSharedAudience**](AudienceSharingApi.md#updateAdAccountToBusinessSharedAudience) | **PATCH** /ad_accounts/{ad_account_id}/audiences/businesses/shared | Update audience sharing from an ad account to businesses |
| [**updateBusinessToAdAccountSharedAudience**](AudienceSharingApi.md#updateBusinessToAdAccountSharedAudience) | **PATCH** /businesses/{business_id}/audiences/ad_accounts/shared | Update audience sharing from a business to ad accounts |
| [**updateBusinessToBusinessSharedAudience**](AudienceSharingApi.md#updateBusinessToBusinessSharedAudience) | **PATCH** /businesses/{business_id}/audiences/businesses/shared | Update audience sharing between businesses |


<a id="adAccountsAudiencesSharedAccountsList"></a>
# **adAccountsAudiencesSharedAccountsList**
> AdAccountsAudiencesSharedAccountsList200Response adAccountsAudiencesSharedAccountsList(adAccountId, audienceId, accountType, pageSize, bookmark)

List accounts with access to an audience owned by an ad account

List all ad accounts and/or businesses that have access to a specific audience. The audience must be owned by the requesting ad account.

### Example
```java
// Import classes:
import com.github.oapicf.pinterestsdk.ApiClient;
import com.github.oapicf.pinterestsdk.ApiException;
import com.github.oapicf.pinterestsdk.Configuration;
import com.github.oapicf.pinterestsdk.auth.*;
import com.github.oapicf.pinterestsdk.models.*;
import com.github.oapicf.pinterestsdk.api.AudienceSharingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.pinterest.com/v5");
    
    // Configure OAuth2 access token for authorization: pinterest_oauth2
    OAuth pinterest_oauth2 = (OAuth) defaultClient.getAuthentication("pinterest_oauth2");
    pinterest_oauth2.setAccessToken("YOUR ACCESS TOKEN");

    AudienceSharingApi apiInstance = new AudienceSharingApi(defaultClient);
    String adAccountId = "adAccountId_example"; // String | Unique identifier of an ad account.
    String audienceId = "audienceId_example"; // String | Unique identifier of the audience to use to filter the results.
    AudienceAccountType accountType = AudienceAccountType.fromValue("AD_ACCOUNT"); // AudienceAccountType | Filter accounts by account type.
    Integer pageSize = 25; // Integer | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
    String bookmark = "bookmark_example"; // String | Cursor used to fetch the next page of items
    try {
      AdAccountsAudiencesSharedAccountsList200Response result = apiInstance.adAccountsAudiencesSharedAccountsList(adAccountId, audienceId, accountType, pageSize, bookmark);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AudienceSharingApi#adAccountsAudiencesSharedAccountsList");
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
| **audienceId** | **String**| Unique identifier of the audience to use to filter the results. | |
| **accountType** | [**AudienceAccountType**](.md)| Filter accounts by account type. | [default to AD_ACCOUNT] [enum: AD_ACCOUNT, BUSINESS_ACCOUNT] |
| **pageSize** | **Integer**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25] |
| **bookmark** | **String**| Cursor used to fetch the next page of items | [optional] |

### Return type

[**AdAccountsAudiencesSharedAccountsList200Response**](AdAccountsAudiencesSharedAccountsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Invalid ad account audiences shared accounts parameters. |  -  |
| **404** | Shared accounts not found. |  -  |
| **0** | Unexpected error. |  -  |

<a id="businessAccountAudiencesSharedAccountsList"></a>
# **businessAccountAudiencesSharedAccountsList**
> AdAccountsAudiencesSharedAccountsList200Response businessAccountAudiencesSharedAccountsList(businessId, audienceId, accountType, pageSize, bookmark)

List accounts with access to an audience owned by a business

List all ad accounts and/or businesses that have access to a specific audience. The audience must either be owned by an ad account in the requesting business, or it must have been shared with the requesting business. If the requesting business is not the owner of the audience, only ad accounts owned by the requesting business will be returned.

### Example
```java
// Import classes:
import com.github.oapicf.pinterestsdk.ApiClient;
import com.github.oapicf.pinterestsdk.ApiException;
import com.github.oapicf.pinterestsdk.Configuration;
import com.github.oapicf.pinterestsdk.auth.*;
import com.github.oapicf.pinterestsdk.models.*;
import com.github.oapicf.pinterestsdk.api.AudienceSharingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.pinterest.com/v5");
    
    // Configure OAuth2 access token for authorization: pinterest_oauth2
    OAuth pinterest_oauth2 = (OAuth) defaultClient.getAuthentication("pinterest_oauth2");
    pinterest_oauth2.setAccessToken("YOUR ACCESS TOKEN");

    AudienceSharingApi apiInstance = new AudienceSharingApi(defaultClient);
    String businessId = "729090764583391194"; // String | Unique identifier of the requesting business.
    String audienceId = "audienceId_example"; // String | Unique identifier of the audience to use to filter the results.
    AudienceAccountType accountType = AudienceAccountType.fromValue("AD_ACCOUNT"); // AudienceAccountType | Filter accounts by account type.
    Integer pageSize = 25; // Integer | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
    String bookmark = "bookmark_example"; // String | Cursor used to fetch the next page of items
    try {
      AdAccountsAudiencesSharedAccountsList200Response result = apiInstance.businessAccountAudiencesSharedAccountsList(businessId, audienceId, accountType, pageSize, bookmark);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AudienceSharingApi#businessAccountAudiencesSharedAccountsList");
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
| **businessId** | **String**| Unique identifier of the requesting business. | |
| **audienceId** | **String**| Unique identifier of the audience to use to filter the results. | |
| **accountType** | [**AudienceAccountType**](.md)| Filter accounts by account type. | [default to AD_ACCOUNT] [enum: AD_ACCOUNT, BUSINESS_ACCOUNT] |
| **pageSize** | **Integer**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25] |
| **bookmark** | **String**| Cursor used to fetch the next page of items | [optional] |

### Return type

[**AdAccountsAudiencesSharedAccountsList200Response**](AdAccountsAudiencesSharedAccountsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Invalid business audiences shared accounts parameters. |  -  |
| **404** | Shared accounts not found. |  -  |
| **0** | Unexpected error. |  -  |

<a id="sharedAudiencesForBusinessList"></a>
# **sharedAudiencesForBusinessList**
> AudiencesList200Response sharedAudiencesForBusinessList(businessId, bookmark, order, pageSize)

List received audiences for a business

Get a list of received audiences for the given business.

### Example
```java
// Import classes:
import com.github.oapicf.pinterestsdk.ApiClient;
import com.github.oapicf.pinterestsdk.ApiException;
import com.github.oapicf.pinterestsdk.Configuration;
import com.github.oapicf.pinterestsdk.auth.*;
import com.github.oapicf.pinterestsdk.models.*;
import com.github.oapicf.pinterestsdk.api.AudienceSharingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.pinterest.com/v5");
    
    // Configure OAuth2 access token for authorization: pinterest_oauth2
    OAuth pinterest_oauth2 = (OAuth) defaultClient.getAuthentication("pinterest_oauth2");
    pinterest_oauth2.setAccessToken("YOUR ACCESS TOKEN");

    AudienceSharingApi apiInstance = new AudienceSharingApi(defaultClient);
    String businessId = "729090764583391194"; // String | Unique identifier of the requesting business.
    String bookmark = "bookmark_example"; // String | Cursor used to fetch the next page of items
    String order = "ASCENDING"; // String | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.
    Integer pageSize = 25; // Integer | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
    try {
      AudiencesList200Response result = apiInstance.sharedAudiencesForBusinessList(businessId, bookmark, order, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AudienceSharingApi#sharedAudiencesForBusinessList");
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
| **businessId** | **String**| Unique identifier of the requesting business. | |
| **bookmark** | **String**| Cursor used to fetch the next page of items | [optional] |
| **order** | **String**| The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] [enum: ASCENDING, DESCENDING] |
| **pageSize** | **Integer**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25] |

### Return type

[**AudiencesList200Response**](AudiencesList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Invalid parameters. |  -  |
| **0** | Unexpected error |  -  |

<a id="updateAdAccountToAdAccountSharedAudience"></a>
# **updateAdAccountToAdAccountSharedAudience**
> SharedAudienceResponse updateAdAccountToAdAccountSharedAudience(adAccountId, sharedAudience)

Update audience sharing between ad accounts

From an ad account, share a specific audience with another ad account, or revoke access to a previously shared audience. Only the audience owner account can share the audience. The recipient ad account(s) must be in the same &lt;a href&#x3D;&#39;https://help.pinterest.com/en/business/article/create-and-manage-accounts&#39;&gt;Pinterest Business Hierarchy&lt;/a&gt; as the business owner of the ad account.&lt;br&gt; This endpoint is not available to all apps.&lt;a href&#x3D;&#39;/docs/getting-started/beta-and-advanced-access/&#39;&gt;Learn more&lt;/a&gt;.

### Example
```java
// Import classes:
import com.github.oapicf.pinterestsdk.ApiClient;
import com.github.oapicf.pinterestsdk.ApiException;
import com.github.oapicf.pinterestsdk.Configuration;
import com.github.oapicf.pinterestsdk.auth.*;
import com.github.oapicf.pinterestsdk.models.*;
import com.github.oapicf.pinterestsdk.api.AudienceSharingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.pinterest.com/v5");
    
    // Configure OAuth2 access token for authorization: pinterest_oauth2
    OAuth pinterest_oauth2 = (OAuth) defaultClient.getAuthentication("pinterest_oauth2");
    pinterest_oauth2.setAccessToken("YOUR ACCESS TOKEN");

    AudienceSharingApi apiInstance = new AudienceSharingApi(defaultClient);
    String adAccountId = "adAccountId_example"; // String | Unique identifier of an ad account.
    SharedAudience sharedAudience = new SharedAudience(); // SharedAudience | 
    try {
      SharedAudienceResponse result = apiInstance.updateAdAccountToAdAccountSharedAudience(adAccountId, sharedAudience);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AudienceSharingApi#updateAdAccountToAdAccountSharedAudience");
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
| **sharedAudience** | [**SharedAudience**](SharedAudience.md)|  | |

### Return type

[**SharedAudienceResponse**](SharedAudienceResponse.md)

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

<a id="updateAdAccountToBusinessSharedAudience"></a>
# **updateAdAccountToBusinessSharedAudience**
> BusinessSharedAudienceResponse updateAdAccountToBusinessSharedAudience(adAccountId, businessSharedAudience)

Update audience sharing from an ad account to businesses

From an ad account, share a specific audience with a business account, or revoke access to a previously shared audience. Only the audience owner account can share the audience. The recipient business account must be in the same business hierarchy as the business owner of the ad account.&lt;br&gt; This endpoint is not available to all apps.&lt;a href&#x3D;&#39;/docs/getting-started/beta-and-advanced-access/&#39;&gt;Learn more&lt;/a&gt;.

### Example
```java
// Import classes:
import com.github.oapicf.pinterestsdk.ApiClient;
import com.github.oapicf.pinterestsdk.ApiException;
import com.github.oapicf.pinterestsdk.Configuration;
import com.github.oapicf.pinterestsdk.auth.*;
import com.github.oapicf.pinterestsdk.models.*;
import com.github.oapicf.pinterestsdk.api.AudienceSharingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.pinterest.com/v5");
    
    // Configure OAuth2 access token for authorization: pinterest_oauth2
    OAuth pinterest_oauth2 = (OAuth) defaultClient.getAuthentication("pinterest_oauth2");
    pinterest_oauth2.setAccessToken("YOUR ACCESS TOKEN");

    AudienceSharingApi apiInstance = new AudienceSharingApi(defaultClient);
    String adAccountId = "adAccountId_example"; // String | Unique identifier of an ad account.
    BusinessSharedAudience businessSharedAudience = new BusinessSharedAudience(); // BusinessSharedAudience | 
    try {
      BusinessSharedAudienceResponse result = apiInstance.updateAdAccountToBusinessSharedAudience(adAccountId, businessSharedAudience);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AudienceSharingApi#updateAdAccountToBusinessSharedAudience");
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
| **businessSharedAudience** | [**BusinessSharedAudience**](BusinessSharedAudience.md)|  | |

### Return type

[**BusinessSharedAudienceResponse**](BusinessSharedAudienceResponse.md)

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

<a id="updateBusinessToAdAccountSharedAudience"></a>
# **updateBusinessToAdAccountSharedAudience**
> SharedAudienceResponse updateBusinessToAdAccountSharedAudience(businessId, sharedAudience)

Update audience sharing from a business to ad accounts

From a business, share a specific audience with other ad account(s), or revoke access to a previously shared audience. &lt;ul&gt; &lt;li&gt;If the business is the owner of the audience, it can share with any ad account within the same business hierarchy.&lt;/li&gt; &lt;li&gt;If the business is the recipient of the audience, it can share with any of its owned ad accounts.&lt;/li&gt; &lt;/ul&gt; This endpoint is not available to all apps.&lt;a href&#x3D;&#39;/docs/getting-started/beta-and-advanced-access/&#39;&gt;Learn more&lt;/a&gt;.

### Example
```java
// Import classes:
import com.github.oapicf.pinterestsdk.ApiClient;
import com.github.oapicf.pinterestsdk.ApiException;
import com.github.oapicf.pinterestsdk.Configuration;
import com.github.oapicf.pinterestsdk.auth.*;
import com.github.oapicf.pinterestsdk.models.*;
import com.github.oapicf.pinterestsdk.api.AudienceSharingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.pinterest.com/v5");
    
    // Configure OAuth2 access token for authorization: pinterest_oauth2
    OAuth pinterest_oauth2 = (OAuth) defaultClient.getAuthentication("pinterest_oauth2");
    pinterest_oauth2.setAccessToken("YOUR ACCESS TOKEN");

    AudienceSharingApi apiInstance = new AudienceSharingApi(defaultClient);
    String businessId = "729090764583391194"; // String | Unique identifier of the requesting business.
    SharedAudience sharedAudience = new SharedAudience(); // SharedAudience | 
    try {
      SharedAudienceResponse result = apiInstance.updateBusinessToAdAccountSharedAudience(businessId, sharedAudience);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AudienceSharingApi#updateBusinessToAdAccountSharedAudience");
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
| **businessId** | **String**| Unique identifier of the requesting business. | |
| **sharedAudience** | [**SharedAudience**](SharedAudience.md)|  | |

### Return type

[**SharedAudienceResponse**](SharedAudienceResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Invalid parameters. |  -  |
| **0** | Unexpected error |  -  |

<a id="updateBusinessToBusinessSharedAudience"></a>
# **updateBusinessToBusinessSharedAudience**
> BusinessSharedAudienceResponse updateBusinessToBusinessSharedAudience(businessId, businessSharedAudience)

Update audience sharing between businesses

From a business, share a specific audience with another business account, or revoke access to a previously shared audience. Only the audience owner can share the audience with other businesses, and the recipient business must be within the same business hierarchy.&lt;br&gt; This endpoint is not available to all apps.&lt;a href&#x3D;&#39;/docs/getting-started/beta-and-advanced-access/&#39;&gt;Learn more&lt;/a&gt;.

### Example
```java
// Import classes:
import com.github.oapicf.pinterestsdk.ApiClient;
import com.github.oapicf.pinterestsdk.ApiException;
import com.github.oapicf.pinterestsdk.Configuration;
import com.github.oapicf.pinterestsdk.auth.*;
import com.github.oapicf.pinterestsdk.models.*;
import com.github.oapicf.pinterestsdk.api.AudienceSharingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.pinterest.com/v5");
    
    // Configure OAuth2 access token for authorization: pinterest_oauth2
    OAuth pinterest_oauth2 = (OAuth) defaultClient.getAuthentication("pinterest_oauth2");
    pinterest_oauth2.setAccessToken("YOUR ACCESS TOKEN");

    AudienceSharingApi apiInstance = new AudienceSharingApi(defaultClient);
    String businessId = "729090764583391194"; // String | Unique identifier of the requesting business.
    BusinessSharedAudience businessSharedAudience = new BusinessSharedAudience(); // BusinessSharedAudience | 
    try {
      BusinessSharedAudienceResponse result = apiInstance.updateBusinessToBusinessSharedAudience(businessId, businessSharedAudience);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AudienceSharingApi#updateBusinessToBusinessSharedAudience");
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
| **businessId** | **String**| Unique identifier of the requesting business. | |
| **businessSharedAudience** | [**BusinessSharedAudience**](BusinessSharedAudience.md)|  | |

### Return type

[**BusinessSharedAudienceResponse**](BusinessSharedAudienceResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Invalid parameters. |  -  |
| **0** | Unexpected error |  -  |

