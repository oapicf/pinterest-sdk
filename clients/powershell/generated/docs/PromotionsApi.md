# PSOpenAPITools.PSOpenAPITools\Api.PromotionsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**Invoke-PromotionsCreate**](PromotionsApi.md#Invoke-PromotionsCreate) | **POST** /ad_accounts/{ad_account_id}/promotions | Create promotions
[**Invoke-PromotionsDelete**](PromotionsApi.md#Invoke-PromotionsDelete) | **DELETE** /ad_accounts/{ad_account_id}/promotions/{promotion_id} | Delete promotion by id
[**Invoke-PromotionsGet**](PromotionsApi.md#Invoke-PromotionsGet) | **GET** /ad_accounts/{ad_account_id}/promotions/{promotion_id} | Get promotion by id
[**Invoke-PromotionsList**](PromotionsApi.md#Invoke-PromotionsList) | **GET** /ad_accounts/{ad_account_id}/promotions | Get promotions
[**Invoke-PromotionsUpdate**](PromotionsApi.md#Invoke-PromotionsUpdate) | **PATCH** /ad_accounts/{ad_account_id}/promotions | Update promotions


<a id="Invoke-PromotionsCreate"></a>
# **Invoke-PromotionsCreate**
> PromotionsResponse Invoke-PromotionsCreate<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-PromotionCreate] <PSCustomObject[]><br>

Create promotions

Create multiple new promotions.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account.
$PromotionTemplateValue = Initialize-PromotionTemplateValue -Amount 100 -CurrencyCode "UNK" -CustomText "My promotion" -Percent 10
$PromotionCreate = Initialize-PromotionCreate -DiscountStatus "OTHER" -EndTime 0 -ExternalId "MyExternalId" -PlatformType "MyPlatformType" -PromotionCode "MyPromotionCode" -PromotionCustomId "MyPromotionCustomId" -PromotionTitle "MyPromotionTitle" -PromotionType "VARIABLE" -StartTime 0 -TemplateValues $PromotionTemplateValue # PromotionCreate[] | 

# Create promotions
try {
    $Result = Invoke-PromotionsCreate -AdAccountId $AdAccountId -PromotionCreate $PromotionCreate
} catch {
    Write-Host ("Exception occurred when calling Invoke-PromotionsCreate: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **AdAccountId** | **String**| Unique identifier of an ad account. | 
 **PromotionCreate** | [**PromotionCreate[]**](PromotionCreate.md)|  | 

### Return type

[**PromotionsResponse**](PromotionsResponse.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-PromotionsDelete"></a>
# **Invoke-PromotionsDelete**
> Promotion Invoke-PromotionsDelete<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-PromotionId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>

Delete promotion by id

Delete a promotion within Pinterest.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$PromotionId = "MyPromotionId" # String | Promotion ID
$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account.

# Delete promotion by id
try {
    $Result = Invoke-PromotionsDelete -PromotionId $PromotionId -AdAccountId $AdAccountId
} catch {
    Write-Host ("Exception occurred when calling Invoke-PromotionsDelete: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **PromotionId** | **String**| Promotion ID | 
 **AdAccountId** | **String**| Unique identifier of an ad account. | 

### Return type

[**Promotion**](Promotion.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-PromotionsGet"></a>
# **Invoke-PromotionsGet**
> Promotion Invoke-PromotionsGet<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-PromotionId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>

Get promotion by id

Get a promotion by its Pinterest-specific id. It must be associated with the provided ad account id.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$PromotionId = "MyPromotionId" # String | Promotion ID
$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account.

# Get promotion by id
try {
    $Result = Invoke-PromotionsGet -PromotionId $PromotionId -AdAccountId $AdAccountId
} catch {
    Write-Host ("Exception occurred when calling Invoke-PromotionsGet: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **PromotionId** | **String**| Promotion ID | 
 **AdAccountId** | **String**| Unique identifier of an ad account. | 

### Return type

[**Promotion**](Promotion.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-PromotionsList"></a>
# **Invoke-PromotionsList**
> PromotionsList200Response Invoke-PromotionsList<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Bookmark] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-PageSize] <System.Nullable[Int32]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Order] <PSCustomObject><br>

Get promotions

Gets all promotions associated with an ad account ID that can be applied to an ad group. Can be either internally-saved promotions or external promotions imported from a commerce integration.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account.
$Bookmark = "MyBookmark" # String | Cursor used to fetch the next page of items (optional)
$PageSize = 56 # Int32 | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional) (default to 25)
$Order = "ASCENDING" # PinterestLibPaginationOrder | The order in which to sort the items returned: ""ASCENDING"" or ""DESCENDING"" by ID. Note that higher-value IDs are associated with more-recently added items. (optional)

# Get promotions
try {
    $Result = Invoke-PromotionsList -AdAccountId $AdAccountId -Bookmark $Bookmark -PageSize $PageSize -Order $Order
} catch {
    Write-Host ("Exception occurred when calling Invoke-PromotionsList: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **AdAccountId** | **String**| Unique identifier of an ad account. | 
 **Bookmark** | **String**| Cursor used to fetch the next page of items | [optional] 
 **PageSize** | **Int32**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]
 **Order** | [**PinterestLibPaginationOrder**](PinterestLibPaginationOrder.md)| The order in which to sort the items returned: &quot;&quot;ASCENDING&quot;&quot; or &quot;&quot;DESCENDING&quot;&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] 

### Return type

[**PromotionsList200Response**](PromotionsList200Response.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-PromotionsUpdate"></a>
# **Invoke-PromotionsUpdate**
> PromotionsResponse Invoke-PromotionsUpdate<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-PromotionBatchUpdate] <PSCustomObject[]><br>

Update promotions

Update multiple promotions.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account.
$PromotionTemplateValue = Initialize-PromotionTemplateValue -Amount 100 -CurrencyCode "UNK" -CustomText "My promotion" -Percent 10
$PromotionBatchUpdate = Initialize-PromotionBatchUpdate -DiscountStatus "OTHER" -EndTime 0 -ExternalId "MyExternalId" -Id "MyId" -PlatformType "MyPlatformType" -PromotionCode "MyPromotionCode" -PromotionCustomId "MyPromotionCustomId" -PromotionTitle "MyPromotionTitle" -PromotionType "VARIABLE" -StartTime 0 -TemplateValues $PromotionTemplateValue # PromotionBatchUpdate[] | 

# Update promotions
try {
    $Result = Invoke-PromotionsUpdate -AdAccountId $AdAccountId -PromotionBatchUpdate $PromotionBatchUpdate
} catch {
    Write-Host ("Exception occurred when calling Invoke-PromotionsUpdate: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **AdAccountId** | **String**| Unique identifier of an ad account. | 
 **PromotionBatchUpdate** | [**PromotionBatchUpdate[]**](PromotionBatchUpdate.md)|  | 

### Return type

[**PromotionsResponse**](PromotionsResponse.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

