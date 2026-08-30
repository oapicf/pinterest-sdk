# pinterestsdk.AdvancedAuctionApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**advanced_auction_items_get_post**](AdvancedAuctionApi.md#advanced_auction_items_get_post) | **POST** /advanced_auction/items/get | Get item bid options (POST)
[**advanced_auction_items_submit_post**](AdvancedAuctionApi.md#advanced_auction_items_submit_post) | **POST** /advanced_auction/items/submit | Operate on item level bid options


# **advanced_auction_items_get_post**
> AdvancedAuctionItems advanced_auction_items_get_post(advanced_auction_items_get_request, ad_account_id=ad_account_id)

Get item bid options (POST)

Get the bid options for a batch of retail catalog items.

The catalog must be owned by the "operation user_account". [See detailed documentation here.](/docs/api-features/shopping-overview/#Update%20items%20in%20batch) By default, the "operation user_account" is the token user_account.

Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the "operation user_account". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: `Owner`, `Admin`.

This endpoint is not available to all users.

### Example

* OAuth Authentication (pinterest_oauth2):

```python
import pinterestsdk
from pinterestsdk.models.advanced_auction_items import AdvancedAuctionItems
from pinterestsdk.models.advanced_auction_items_get_request import AdvancedAuctionItemsGetRequest
from pinterestsdk.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.pinterest.com/v5
# See configuration.py for a list of all supported configuration parameters.
configuration = pinterestsdk.Configuration(
    host = "https://api.pinterest.com/v5"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with pinterestsdk.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = pinterestsdk.AdvancedAuctionApi(api_client)
    advanced_auction_items_get_request = pinterestsdk.AdvancedAuctionItemsGetRequest() # AdvancedAuctionItemsGetRequest | 
    ad_account_id = 'ad_account_id_example' # str | Unique identifier of an ad account. (optional)

    try:
        # Get item bid options (POST)
        api_response = api_instance.advanced_auction_items_get_post(advanced_auction_items_get_request, ad_account_id=ad_account_id)
        print("The response of AdvancedAuctionApi->advanced_auction_items_get_post:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling AdvancedAuctionApi->advanced_auction_items_get_post: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **advanced_auction_items_get_request** | [**AdvancedAuctionItemsGetRequest**](AdvancedAuctionItemsGetRequest.md)|  | 
 **ad_account_id** | **str**| Unique identifier of an ad account. | [optional] 

### Return type

[**AdvancedAuctionItems**](AdvancedAuctionItems.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The request has succeeded. |  -  |
**400** | The request could not be understood by the server due to unexpected data. |  -  |
**401** | Authentication is required and has either failed or not been provided. |  -  |
**403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
**404** | The requested resource could not be found on this server. |  -  |
**429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
**500** | The server encountered an unexpected condition that prevented it from fulfilling the request. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **advanced_auction_items_submit_post**
> AdvancedAuctionProcessedItems advanced_auction_items_submit_post(advanced_auction_items_submit_request, ad_account_id=ad_account_id)

Operate on item level bid options

This endpoint supports multiple operations on a set of one or more bid options (bid price and bid adjustments for targeting categories) for retail catalog items. These advanced auction settings are applied in campaigns using objective_type `CATALOG_SALES` and ad groups using bid_strategy_type `MAX_BID`.

The catalog must be owned by the "operation user_account". [See detailed documentation here.](/docs/api-features/modify-items-in-batch/) By default, the "operation user_account" is the token user_account.

Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the "operation user_account". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: `Owner`, `Admin`.

This endpoint is not available to all users.

### Example

* OAuth Authentication (pinterest_oauth2):

```python
import pinterestsdk
from pinterestsdk.models.advanced_auction_items_submit_request import AdvancedAuctionItemsSubmitRequest
from pinterestsdk.models.advanced_auction_processed_items import AdvancedAuctionProcessedItems
from pinterestsdk.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.pinterest.com/v5
# See configuration.py for a list of all supported configuration parameters.
configuration = pinterestsdk.Configuration(
    host = "https://api.pinterest.com/v5"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with pinterestsdk.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = pinterestsdk.AdvancedAuctionApi(api_client)
    advanced_auction_items_submit_request = pinterestsdk.AdvancedAuctionItemsSubmitRequest() # AdvancedAuctionItemsSubmitRequest | 
    ad_account_id = 'ad_account_id_example' # str | Unique identifier of an ad account. (optional)

    try:
        # Operate on item level bid options
        api_response = api_instance.advanced_auction_items_submit_post(advanced_auction_items_submit_request, ad_account_id=ad_account_id)
        print("The response of AdvancedAuctionApi->advanced_auction_items_submit_post:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling AdvancedAuctionApi->advanced_auction_items_submit_post: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **advanced_auction_items_submit_request** | [**AdvancedAuctionItemsSubmitRequest**](AdvancedAuctionItemsSubmitRequest.md)|  | 
 **ad_account_id** | **str**| Unique identifier of an ad account. | [optional] 

### Return type

[**AdvancedAuctionProcessedItems**](AdvancedAuctionProcessedItems.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The request has succeeded. |  -  |
**206** | Successful |  -  |
**400** | The request could not be understood by the server due to unexpected data. |  -  |
**401** | Authentication is required and has either failed or not been provided. |  -  |
**403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
**404** | The requested resource could not be found on this server. |  -  |
**429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
**500** | The server encountered an unexpected condition that prevented it from fulfilling the request. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

