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
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-PromotionCreateRequest] <PSCustomObject[]><br>

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
$PromotionCreateRequest = Initialize-PromotionCreateRequest -DiscountStatus "OTHER" -EndTime 1678003860 -ExternalId "abc" -PlatformType "DEFAULT" -PromotionCode "blackfriday10" -PromotionCustomId "freeshipping_2025" -PromotionTitle "Black Friday 10% off" -PromotionType "VARIABLE" -StartTime 1677003860 -TemplateValues $PromotionTemplateValue # PromotionCreateRequest[] | List of promotions to create, size limit [1, 30].

# Create promotions
try {
    $Result = Invoke-PromotionsCreate -AdAccountId $AdAccountId -PromotionCreateRequest $PromotionCreateRequest
} catch {
    Write-Host ("Exception occurred when calling Invoke-PromotionsCreate: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **AdAccountId** | **String**| Unique identifier of an ad account. | 
 **PromotionCreateRequest** | [**PromotionCreateRequest[]**](PromotionCreateRequest.md)| List of promotions to create, size limit [1, 30]. | 

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
> void Invoke-PromotionsDelete<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-PromotionId] <String><br>

Delete promotion by id

Delete a promotion within Pinterest.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account.
$PromotionId = "MyPromotionId" # String | Unique identifier of a promotion

# Delete promotion by id
try {
    $Result = Invoke-PromotionsDelete -AdAccountId $AdAccountId -PromotionId $PromotionId
} catch {
    Write-Host ("Exception occurred when calling Invoke-PromotionsDelete: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **AdAccountId** | **String**| Unique identifier of an ad account. | 
 **PromotionId** | **String**| Unique identifier of a promotion | 

### Return type

void (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-PromotionsGet"></a>
# **Invoke-PromotionsGet**
> PromotionResponse Invoke-PromotionsGet<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-PromotionId] <String><br>

Get promotion by id

Get a promotion by its Pinterest-specific id. It must be associated with the provided ad account id.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account.
$PromotionId = "MyPromotionId" # String | Unique identifier of a promotion

# Get promotion by id
try {
    $Result = Invoke-PromotionsGet -AdAccountId $AdAccountId -PromotionId $PromotionId
} catch {
    Write-Host ("Exception occurred when calling Invoke-PromotionsGet: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **AdAccountId** | **String**| Unique identifier of an ad account. | 
 **PromotionId** | **String**| Unique identifier of a promotion | 

### Return type

[**PromotionResponse**](PromotionResponse.md) (PSCustomObject)

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
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-PageSize] <System.Nullable[Int32]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Order] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Bookmark] <String><br>

Get promotions

Gets all promotions associated with an ad account ID that can be applied to an ad group. Can be either internally-saved promotions or external promotions imported from a commerce integration.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account.
$PageSize = 56 # Int32 | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (optional) (default to 25)
$Order = "ASCENDING" # String | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. (optional)
$Bookmark = "MyBookmark" # String | Cursor used to fetch the next page of items (optional)

# Get promotions
try {
    $Result = Invoke-PromotionsList -AdAccountId $AdAccountId -PageSize $PageSize -Order $Order -Bookmark $Bookmark
} catch {
    Write-Host ("Exception occurred when calling Invoke-PromotionsList: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **AdAccountId** | **String**| Unique identifier of an ad account. | 
 **PageSize** | **Int32**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **Order** | **String**| The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] 
 **Bookmark** | **String**| Cursor used to fetch the next page of items | [optional] 

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
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-PromotionUpdateRequest] <PSCustomObject[]><br>

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
$PromotionUpdateRequest = Initialize-PromotionUpdateRequest -DiscountStatus "OTHER" -EndTime 1678003860 -ExternalId "abc" -PlatformType "DEFAULT" -PromotionCode "blackfriday10" -PromotionCustomId "freeshipping_2025" -PromotionTitle "Black Friday 10% off" -PromotionType "VARIABLE" -StartTime 1677003860 -TemplateValues $PromotionTemplateValue -Id "7834020347906" -Status "ACTIVE" # PromotionUpdateRequest[] | List of promotions to create, size limit [1, 30].

# Update promotions
try {
    $Result = Invoke-PromotionsUpdate -AdAccountId $AdAccountId -PromotionUpdateRequest $PromotionUpdateRequest
} catch {
    Write-Host ("Exception occurred when calling Invoke-PromotionsUpdate: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **AdAccountId** | **String**| Unique identifier of an ad account. | 
 **PromotionUpdateRequest** | [**PromotionUpdateRequest[]**](PromotionUpdateRequest.md)| List of promotions to create, size limit [1, 30]. | 

### Return type

[**PromotionsResponse**](PromotionsResponse.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

