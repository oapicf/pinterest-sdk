# PromotionsApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**promotionsCreate**](PromotionsApi.md#promotionsCreate) | **POST** /ad_accounts/{ad_account_id}/promotions | Create promotions |
| [**promotionsDelete**](PromotionsApi.md#promotionsDelete) | **DELETE** /ad_accounts/{ad_account_id}/promotions/{promotion_id} | Delete promotion by id |
| [**promotionsGet**](PromotionsApi.md#promotionsGet) | **GET** /ad_accounts/{ad_account_id}/promotions/{promotion_id} | Get promotion by id |
| [**promotionsList**](PromotionsApi.md#promotionsList) | **GET** /ad_accounts/{ad_account_id}/promotions | Get promotions |
| [**promotionsUpdate**](PromotionsApi.md#promotionsUpdate) | **PATCH** /ad_accounts/{ad_account_id}/promotions | Update promotions |



## promotionsCreate

> PromotionsResponse promotionsCreate(adAccountId, promotionCreate)

Create promotions

Create multiple new promotions.

### Example

```java
// Import classes:
import org.openapitools.server.ApiClient;
import org.openapitools.server.ApiException;
import org.openapitools.server.Configuration;
import org.openapitools.server.auth.*;
import org.openapitools.server.models.*;
import org.openapitools.server.api.PromotionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.pinterest.com/v5");
        
        // Configure OAuth2 access token for authorization: pinterest_oauth2
        OAuth pinterest_oauth2 = (OAuth) defaultClient.getAuthentication("pinterest_oauth2");
        pinterest_oauth2.setAccessToken("YOUR ACCESS TOKEN");

        PromotionsApi apiInstance = new PromotionsApi(defaultClient);
        String adAccountId = "adAccountId_example"; // String | Unique identifier of an ad account.
        List<PromotionCreate> promotionCreate = Arrays.asList(); // List<PromotionCreate> | 
        try {
            PromotionsResponse result = apiInstance.promotionsCreate(adAccountId, promotionCreate);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PromotionsApi#promotionsCreate");
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
| **promotionCreate** | [**List&lt;PromotionCreate&gt;**](PromotionCreate.md)|  | |

### Return type

[**PromotionsResponse**](PromotionsResponse.md)

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
| **200** | An unexpected error response. |  -  |


## promotionsDelete

> Promotion promotionsDelete(promotionId, adAccountId)

Delete promotion by id

Delete a promotion within Pinterest.

### Example

```java
// Import classes:
import org.openapitools.server.ApiClient;
import org.openapitools.server.ApiException;
import org.openapitools.server.Configuration;
import org.openapitools.server.auth.*;
import org.openapitools.server.models.*;
import org.openapitools.server.api.PromotionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.pinterest.com/v5");
        
        // Configure OAuth2 access token for authorization: pinterest_oauth2
        OAuth pinterest_oauth2 = (OAuth) defaultClient.getAuthentication("pinterest_oauth2");
        pinterest_oauth2.setAccessToken("YOUR ACCESS TOKEN");

        PromotionsApi apiInstance = new PromotionsApi(defaultClient);
        String promotionId = "promotionId_example"; // String | Promotion ID
        String adAccountId = "adAccountId_example"; // String | Unique identifier of an ad account.
        try {
            Promotion result = apiInstance.promotionsDelete(promotionId, adAccountId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PromotionsApi#promotionsDelete");
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
| **promotionId** | **String**| Promotion ID | |
| **adAccountId** | **String**| Unique identifier of an ad account. | |

### Return type

[**Promotion**](Promotion.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **204** | Resource deleted successfully. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **200** | An unexpected error response. |  -  |


## promotionsGet

> Promotion promotionsGet(promotionId, adAccountId)

Get promotion by id

Get a promotion by its Pinterest-specific id. It must be associated with the provided ad account id.

### Example

```java
// Import classes:
import org.openapitools.server.ApiClient;
import org.openapitools.server.ApiException;
import org.openapitools.server.Configuration;
import org.openapitools.server.auth.*;
import org.openapitools.server.models.*;
import org.openapitools.server.api.PromotionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.pinterest.com/v5");
        
        // Configure OAuth2 access token for authorization: pinterest_oauth2
        OAuth pinterest_oauth2 = (OAuth) defaultClient.getAuthentication("pinterest_oauth2");
        pinterest_oauth2.setAccessToken("YOUR ACCESS TOKEN");

        PromotionsApi apiInstance = new PromotionsApi(defaultClient);
        String promotionId = "promotionId_example"; // String | Promotion ID
        String adAccountId = "adAccountId_example"; // String | Unique identifier of an ad account.
        try {
            Promotion result = apiInstance.promotionsGet(promotionId, adAccountId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PromotionsApi#promotionsGet");
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
| **promotionId** | **String**| Promotion ID | |
| **adAccountId** | **String**| Unique identifier of an ad account. | |

### Return type

[**Promotion**](Promotion.md)

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
| **200** | An unexpected error response. |  -  |


## promotionsList

> PromotionsList200Response promotionsList(adAccountId, bookmark, pageSize, order)

Get promotions

Gets all promotions associated with an ad account ID that can be applied to an ad group. Can be either internally-saved promotions or external promotions imported from a commerce integration.

### Example

```java
// Import classes:
import org.openapitools.server.ApiClient;
import org.openapitools.server.ApiException;
import org.openapitools.server.Configuration;
import org.openapitools.server.auth.*;
import org.openapitools.server.models.*;
import org.openapitools.server.api.PromotionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.pinterest.com/v5");
        
        // Configure OAuth2 access token for authorization: pinterest_oauth2
        OAuth pinterest_oauth2 = (OAuth) defaultClient.getAuthentication("pinterest_oauth2");
        pinterest_oauth2.setAccessToken("YOUR ACCESS TOKEN");

        PromotionsApi apiInstance = new PromotionsApi(defaultClient);
        String adAccountId = "adAccountId_example"; // String | Unique identifier of an ad account.
        String bookmark = "bookmark_example"; // String | Cursor used to fetch the next page of items
        Integer pageSize = 25; // Integer | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
        PinterestLibPaginationOrder order = PinterestLibPaginationOrder.fromValue("ASCENDING"); // PinterestLibPaginationOrder | The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.
        try {
            PromotionsList200Response result = apiInstance.promotionsList(adAccountId, bookmark, pageSize, order);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PromotionsApi#promotionsList");
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
| **bookmark** | **String**| Cursor used to fetch the next page of items | [optional] |
| **pageSize** | **Integer**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25] |
| **order** | [**PinterestLibPaginationOrder**](.md)| The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] [enum: ASCENDING, DESCENDING] |

### Return type

[**PromotionsList200Response**](PromotionsList200Response.md)

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
| **200** | An unexpected error response. |  -  |


## promotionsUpdate

> PromotionsResponse promotionsUpdate(adAccountId, promotionBatchUpdate)

Update promotions

Update multiple promotions.

### Example

```java
// Import classes:
import org.openapitools.server.ApiClient;
import org.openapitools.server.ApiException;
import org.openapitools.server.Configuration;
import org.openapitools.server.auth.*;
import org.openapitools.server.models.*;
import org.openapitools.server.api.PromotionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.pinterest.com/v5");
        
        // Configure OAuth2 access token for authorization: pinterest_oauth2
        OAuth pinterest_oauth2 = (OAuth) defaultClient.getAuthentication("pinterest_oauth2");
        pinterest_oauth2.setAccessToken("YOUR ACCESS TOKEN");

        PromotionsApi apiInstance = new PromotionsApi(defaultClient);
        String adAccountId = "adAccountId_example"; // String | Unique identifier of an ad account.
        List<PromotionBatchUpdate> promotionBatchUpdate = Arrays.asList(); // List<PromotionBatchUpdate> | 
        try {
            PromotionsResponse result = apiInstance.promotionsUpdate(adAccountId, promotionBatchUpdate);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PromotionsApi#promotionsUpdate");
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
| **promotionBatchUpdate** | [**List&lt;PromotionBatchUpdate&gt;**](PromotionBatchUpdate.md)|  | |

### Return type

[**PromotionsResponse**](PromotionsResponse.md)

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
| **200** | An unexpected error response. |  -  |

