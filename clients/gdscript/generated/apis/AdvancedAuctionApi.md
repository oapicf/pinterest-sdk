<a name="__pageTop"></a>
# AdvancedAuctionApi   { #AdvancedAuctionApi }


All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**advanced_auction_items_get/post**](#advanced_auction_items_get/post) | **POST** `/advanced_auction/items/get` | Get item bid options (POST)
[**advanced_auction_items_submit/post**](#advanced_auction_items_submit/post) | **POST** `/advanced_auction/items/submit` | Operate on item level bid options

# **advanced_auction_items_get/post**   { #advanced_auction_items_get/post }
<a name="advanced_auction_items_get/post"></a>

> `advanced_auction_items_get/post(advancedAuctionItemsGetRequest: AdvancedAuctionItemsGetRequest,adAccountId = "", on_success: Callable, on_failure: Callable)`

Get item bid options (POST)

Get the bid options for a batch of retail catalog items.  The catalog must be owned by the \"operation user_account\". [See detailed documentation here.](/docs/api-features/shopping-overview/#Update%20items%20in%20batch) By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: `Owner`, `Admin`.  This endpoint is not available to all users.

### Example

* OAuth Authentication (`pinterest_oauth2`)

```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = AdvancedAuctionApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = AdvancedAuctionApi.new(config, client)

var advancedAuctionItemsGetRequest = AdvancedAuctionItemsGetRequest.new()
# … fill model advancedAuctionItemsGetRequest with data

# Invoke an endpoint
api.advanced_auction_items_get/post(
	# advancedAuctionItemsGetRequest: AdvancedAuctionItemsGetRequest
	advancedAuctionItemsGetRequest,
	# adAccountId: String = ""   Eg: adAccountId_example
	# Unique identifier of an ad account.
	adAccountId,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "advanced_auction_items_get/post", response)
		assert(response.data is AdvancedAuctionItems)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **advanced_auction_items_submit/post**   { #advanced_auction_items_submit/post }
<a name="advanced_auction_items_submit/post"></a>

> `advanced_auction_items_submit/post(advancedAuctionItemsSubmitRequest: AdvancedAuctionItemsSubmitRequest,adAccountId = "", on_success: Callable, on_failure: Callable)`

Operate on item level bid options

This endpoint supports multiple operations on a set of one or more bid options (bid price and bid adjustments for targeting categories) for retail catalog items. These advanced auction settings are applied in campaigns using objective_type `CATALOG_SALES` and ad groups using bid_strategy_type `MAX_BID`.  The catalog must be owned by the \"operation user_account\". [See detailed documentation here.](/docs/api-features/modify-items-in-batch/) By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: `Owner`, `Admin`.  This endpoint is not available to all users.

### Example

* OAuth Authentication (`pinterest_oauth2`)

```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = AdvancedAuctionApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = AdvancedAuctionApi.new(config, client)

var advancedAuctionItemsSubmitRequest = AdvancedAuctionItemsSubmitRequest.new()
# … fill model advancedAuctionItemsSubmitRequest with data

# Invoke an endpoint
api.advanced_auction_items_submit/post(
	# advancedAuctionItemsSubmitRequest: AdvancedAuctionItemsSubmitRequest
	advancedAuctionItemsSubmitRequest,
	# adAccountId: String = ""   Eg: adAccountId_example
	# Unique identifier of an ad account.
	adAccountId,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "advanced_auction_items_submit/post", response)
		assert(response.data is AdvancedAuctionProcessedItems)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), 
[client_credentials](../README.md#client_credentials), 
[conversion_token](../README.md#conversion_token), 
[basic](../README.md#basic)

[[Back to top]](#__pageTop) \
[[Back to API list]](../README.md#documentation-for-api-endpoints) \
[[Back to Model list]](../README.md#documentation-for-models) \
[[Back to README]](../README.md) \

