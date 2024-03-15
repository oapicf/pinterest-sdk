# LeadAdsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**AdAccountsSubscriptionsDelById**](LeadAdsApi.md#AdAccountsSubscriptionsDelById) | **DELETE** /ad_accounts/{ad_account_id}/leads/subscriptions/{subscription_id} | Delete lead ads subscription
[**AdAccountsSubscriptionsGetById**](LeadAdsApi.md#AdAccountsSubscriptionsGetById) | **GET** /ad_accounts/{ad_account_id}/leads/subscriptions/{subscription_id} | Get lead ads subscription
[**AdAccountsSubscriptionsGetList**](LeadAdsApi.md#AdAccountsSubscriptionsGetList) | **GET** /ad_accounts/{ad_account_id}/leads/subscriptions | Get lead ads subscriptions
[**AdAccountsSubscriptionsPost**](LeadAdsApi.md#AdAccountsSubscriptionsPost) | **POST** /ad_accounts/{ad_account_id}/leads/subscriptions | Create lead ads subscription


# **AdAccountsSubscriptionsDelById**
> AdAccountsSubscriptionsDelById(ad_account_id, subscription_id)

Delete lead ads subscription

Delete an existing lead ads webhook subscription by ID. - Only requests for the OWNER or ADMIN of the ad_account will be allowed.  <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/new/about-beta-access/'>Learn more</a>.</strong>

### Example
```R
library(openapi)

# Delete lead ads subscription
#
# prepare function argument(s)
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account.
var_subscription_id <- "subscription_id_example" # character | Unique identifier of a subscription.

api_instance <- LeadAdsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
api_instance$AdAccountsSubscriptionsDelById(var_ad_account_id, var_subscription_id)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **character**| Unique identifier of an ad account. | 
 **subscription_id** | **character**| Unique identifier of a subscription. | 

### Return type

void (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Subscription deleted successfully |  -  |
| **400** | Invalid input parameters. |  -  |
| **403** | You are not authorized to delete this subscription. |  -  |
| **404** | Subscription not found. |  -  |
| **0** | Unexpected error. |  -  |

# **AdAccountsSubscriptionsGetById**
> AdAccountGetSubscriptionResponse AdAccountsSubscriptionsGetById(ad_account_id, subscription_id)

Get lead ads subscription

Get a specific lead ads subscription record. - Only requests for the OWNER or ADMIN of the ad_account will be allowed.  <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/new/about-beta-access/'>Learn more</a>.</strong>

### Example
```R
library(openapi)

# Get lead ads subscription
#
# prepare function argument(s)
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account.
var_subscription_id <- "subscription_id_example" # character | Unique identifier of a subscription.

api_instance <- LeadAdsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$AdAccountsSubscriptionsGetById(var_ad_account_id, var_subscription_iddata_file = "result.txt")
result <- api_instance$AdAccountsSubscriptionsGetById(var_ad_account_id, var_subscription_id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **character**| Unique identifier of an ad account. | 
 **subscription_id** | **character**| Unique identifier of a subscription. | 

### Return type

[**AdAccountGetSubscriptionResponse**](AdAccountGetSubscriptionResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Invalid input parameters. |  -  |
| **403** | Can&#39;t access this subscription. |  -  |
| **404** | Subscription not found. |  -  |
| **0** | Unexpected error. |  -  |

# **AdAccountsSubscriptionsGetList**
> AdAccountsSubscriptionsGetList200Response AdAccountsSubscriptionsGetList(ad_account_id, page_size = 25, bookmark = var.bookmark)

Get lead ads subscriptions

Get the advertiser's list of lead ads subscriptions. - Only requests for the OWNER or ADMIN of the ad_account will be allowed.  <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/new/about-beta-access/'>Learn more</a>.</strong>

### Example
```R
library(openapi)

# Get lead ads subscriptions
#
# prepare function argument(s)
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account.
var_page_size <- 25 # integer | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information. (Optional)
var_bookmark <- "bookmark_example" # character | Cursor used to fetch the next page of items (Optional)

api_instance <- LeadAdsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$AdAccountsSubscriptionsGetList(var_ad_account_id, page_size = var_page_size, bookmark = var_bookmarkdata_file = "result.txt")
result <- api_instance$AdAccountsSubscriptionsGetList(var_ad_account_id, page_size = var_page_size, bookmark = var_bookmark)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **character**| Unique identifier of an ad account. | 
 **page_size** | **integer**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **bookmark** | **character**| Cursor used to fetch the next page of items | [optional] 

### Return type

[**AdAccountsSubscriptionsGetList200Response**](ad_accounts_subscriptions_get_list_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **403** | Can&#39;t access this subscription. |  -  |
| **0** | Unexpected error. |  -  |

# **AdAccountsSubscriptionsPost**
> AdAccountCreateSubscriptionResponse AdAccountsSubscriptionsPost(ad_account_id, ad_account_create_subscription_request)

Create lead ads subscription

Create a lead ads webhook subscription. - Only requests for the OWNER or ADMIN of the ad_account will be allowed. - Advertisers can set up multiple integrations using ad_account_id + lead_form_id but only one integration per unique records.  <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/new/about-beta-access/'>Learn more</a>.</strong>

### Example
```R
library(openapi)

# Create lead ads subscription
#
# prepare function argument(s)
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account.
var_ad_account_create_subscription_request <- AdAccountCreateSubscriptionRequest$new("webhook_url_example", "lead_form_id_example", "partner_access_token_example", "partner_refresh_token_example") # AdAccountCreateSubscriptionRequest | Subscription to create.

api_instance <- LeadAdsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$AdAccountsSubscriptionsPost(var_ad_account_id, var_ad_account_create_subscription_requestdata_file = "result.txt")
result <- api_instance$AdAccountsSubscriptionsPost(var_ad_account_id, var_ad_account_create_subscription_request)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **character**| Unique identifier of an ad account. | 
 **ad_account_create_subscription_request** | [**AdAccountCreateSubscriptionRequest**](AdAccountCreateSubscriptionRequest.md)| Subscription to create. | 

### Return type

[**AdAccountCreateSubscriptionResponse**](AdAccountCreateSubscriptionResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Invalid input parameters. |  -  |
| **403** | Can&#39;t access this subscription. |  -  |
| **0** | Unexpected error. |  -  |

