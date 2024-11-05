# PSOpenAPITools.PSOpenAPITools\Api.AdvancedAuctionApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**Invoke-AdvancedAuctionItemsGetPost**](AdvancedAuctionApi.md#Invoke-AdvancedAuctionItemsGetPost) | **POST** /advanced_auction/items/get | Get item bid options (POST)
[**Invoke-AdvancedAuctionItemsSubmitPost**](AdvancedAuctionApi.md#Invoke-AdvancedAuctionItemsSubmitPost) | **POST** /advanced_auction/items/submit | Operate on item level bid options


<a id="Invoke-AdvancedAuctionItemsGetPost"></a>
# **Invoke-AdvancedAuctionItemsGetPost**
> AdvancedAuctionItems Invoke-AdvancedAuctionItemsGetPost<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdvancedAuctionItemsGetRequest] <PSCustomObject><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>

Get item bid options (POST)

Get the bid options for a batch of retail catalog items.  The catalog must be owned by the ""operation user_account"". <a href=""/docs/api-features/shopping-overview/#Update%20items%20in%20batch"" target=""_blank"">See detailed documentation here.</a> By default, the ""operation user_account"" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the ""operation user_account"". In order to do this, the token user_account must have one of the following <a href=""https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts"">Business Access</a> roles on the ad_account: `Owner`, `Admin`.  This endpoint is not available to all users.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$AdvancedAuctionItemsGetRecord = Initialize-AdvancedAuctionItemsGetRecord -ItemId "DS0294-M" -Country "AD" -Language "AM"
$AdvancedAuctionItemsGetRequest = Initialize-AdvancedAuctionItemsGetRequest -CatalogId "2680059592705" -Items $AdvancedAuctionItemsGetRecord # AdvancedAuctionItemsGetRequest | Request object used to get bid options values for a batch of retail catalog items
$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account. (optional)

# Get item bid options (POST)
try {
    $Result = Invoke-AdvancedAuctionItemsGetPost -AdvancedAuctionItemsGetRequest $AdvancedAuctionItemsGetRequest -AdAccountId $AdAccountId
} catch {
    Write-Host ("Exception occurred when calling Invoke-AdvancedAuctionItemsGetPost: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **AdvancedAuctionItemsGetRequest** | [**AdvancedAuctionItemsGetRequest**](AdvancedAuctionItemsGetRequest.md)| Request object used to get bid options values for a batch of retail catalog items | 
 **AdAccountId** | **String**| Unique identifier of an ad account. | [optional] 

### Return type

[**AdvancedAuctionItems**](AdvancedAuctionItems.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-AdvancedAuctionItemsSubmitPost"></a>
# **Invoke-AdvancedAuctionItemsSubmitPost**
> AdvancedAuctionProcessedItems Invoke-AdvancedAuctionItemsSubmitPost<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdvancedAuctionItemsSubmitRequest] <PSCustomObject><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>

Operate on item level bid options

This endpoint supports multiple operations on a set of one or more bid options (bid price and bid adjustments for targeting categories) for retail catalog items. These advanced auction settings are applied in campaigns using objective_type `CATALOG_SALES` and ad groups using bid_strategy_type `MAX_BID`.  The catalog must be owned by the ""operation user_account"". <a href=""/docs/api-features/modify-items-in-batch/"" target=""_blank"">See detailed documentation here.</a> By default, the ""operation user_account"" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the ""operation user_account"". In order to do this, the token user_account must have one of the following <a href=""https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts"">Business Access</a> roles on the ad_account: `Owner`, `Admin`.  This endpoint is not available to all users.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$AdvancedAuctionBidOptions = Initialize-AdvancedAuctionBidOptions -BidInMicroCurrency 5000000 -AppTypeMultipliers  -PlacementMultipliers 
$AdvancedAuctionItemsSubmitRecord = Initialize-AdvancedAuctionItemsSubmitRecord -Operation "UPSERT" -ItemId "DS0294-M" -Country "AD" -Language "AM" -BidOptions $AdvancedAuctionBidOptions -UpdateMask "BID"

$AdvancedAuctionItemsSubmitRequest = Initialize-AdvancedAuctionItemsSubmitRequest -CatalogId "2680059592705" -Items $AdvancedAuctionItemsSubmitRecord # AdvancedAuctionItemsSubmitRequest | Request object used to upsert or delete bid options for a batch of retail catalog items
$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account. (optional)

# Operate on item level bid options
try {
    $Result = Invoke-AdvancedAuctionItemsSubmitPost -AdvancedAuctionItemsSubmitRequest $AdvancedAuctionItemsSubmitRequest -AdAccountId $AdAccountId
} catch {
    Write-Host ("Exception occurred when calling Invoke-AdvancedAuctionItemsSubmitPost: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **AdvancedAuctionItemsSubmitRequest** | [**AdvancedAuctionItemsSubmitRequest**](AdvancedAuctionItemsSubmitRequest.md)| Request object used to upsert or delete bid options for a batch of retail catalog items | 
 **AdAccountId** | **String**| Unique identifier of an ad account. | [optional] 

### Return type

[**AdvancedAuctionProcessedItems**](AdvancedAuctionProcessedItems.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

