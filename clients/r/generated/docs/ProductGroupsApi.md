# ProductGroupsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**AdAccountsCatalogsProductGroupsList**](ProductGroupsApi.md#AdAccountsCatalogsProductGroupsList) | **GET** /ad_accounts/{ad_account_id}/product_groups/catalogs | Get catalog product groups


# **AdAccountsCatalogsProductGroupsList**
> AdAccountsCatalogsProductGroupsList200Response AdAccountsCatalogsProductGroupsList(ad_account_id, feed_profile_id = var.feed_profile_id)

Get catalog product groups

This endpoint is completely deprecated. Please use <a href='/docs/api/v5/#operation/catalogs_product_groups/list'>List product groups</a> from Catalogs API instead.

### Example
```R
library(openapi)

# Get catalog product groups
#
# prepare function argument(s)
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account.
var_feed_profile_id <- "feed_profile_id_example" # character | The feed profile id whose catalog product groups we want to return. (Optional)

api_instance <- ProductGroupsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$AdAccountsCatalogsProductGroupsList(var_ad_account_id, feed_profile_id = var_feed_profile_iddata_file = "result.txt")
result <- api_instance$AdAccountsCatalogsProductGroupsList(var_ad_account_id, feed_profile_id = var_feed_profile_id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **character**| Unique identifier of an ad account. | 
 **feed_profile_id** | **character**| The feed profile id whose catalog product groups we want to return. | [optional] 

### Return type

[**AdAccountsCatalogsProductGroupsList200Response**](ad_accounts_catalogs_product_groups_list_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

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

