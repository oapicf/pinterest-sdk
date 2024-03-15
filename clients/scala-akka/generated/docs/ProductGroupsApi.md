# ProductGroupsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**adAccountsCatalogsProductGroupsList**](ProductGroupsApi.md#adAccountsCatalogsProductGroupsList) | **GET** /ad_accounts/{ad_account_id}/product_groups/catalogs | Get catalog product groups
[**adAccountsCatalogsProductGroupsListWithHttpInfo**](ProductGroupsApi.md#adAccountsCatalogsProductGroupsListWithHttpInfo) | **GET** /ad_accounts/{ad_account_id}/product_groups/catalogs | Get catalog product groups



## adAccountsCatalogsProductGroupsList

> adAccountsCatalogsProductGroupsList(adAccountsCatalogsProductGroupsListRequest): ApiRequest[AdAccountsCatalogsProductGroupsList200Response]

Get catalog product groups

This endpoint is completely deprecated. Please use &lt;a href&#x3D;&#39;/docs/api/v5/#operation/catalogs_product_groups/list&#39;&gt;List product groups&lt;/a&gt; from Catalogs API instead.

### Example

```scala
// Import classes:
import 
import 
import org.openapitools.client.core._
import org.openapitools.client.core.CollectionFormats._
import org.openapitools.client.core.ApiKeyLocations._

import akka.actor.ActorSystem
import scala.concurrent.Future
import scala.util.{Failure, Success}

object Example extends App {
    
    implicit val system: ActorSystem = ActorSystem()
    import system.dispatcher
    
    val apiInvoker = ApiInvoker()
    val apiInstance = ProductGroupsApi("https://api.pinterest.com/v5")
    val adAccountId: String = adAccountId_example // String | Unique identifier of an ad account.

    val feedProfileId: String = feedProfileId_example // String | The feed profile id whose catalog product groups we want to return.
    
    val request = apiInstance.adAccountsCatalogsProductGroupsList(adAccountId, feedProfileId)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling ProductGroupsApi#adAccountsCatalogsProductGroupsList")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling ProductGroupsApi#adAccountsCatalogsProductGroupsList")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String**| Unique identifier of an ad account. |
 **feedProfileId** | **String**| The feed profile id whose catalog product groups we want to return. | [optional]

### Return type

ApiRequest[[**AdAccountsCatalogsProductGroupsList200Response**](AdAccountsCatalogsProductGroupsList200Response.md)]


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Invalid ad account ads parameters. |  -  |
| **401** | Access Denied. This can happen if account is not yet approved to operate as Merchant on Pinterest. |  -  |
| **404** | Merchant data not found. |  -  |
| **0** | Unexpected error |  -  |

