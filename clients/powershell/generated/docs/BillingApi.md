# PSOpenAPITools.PSOpenAPITools\Api.BillingApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**Invoke-AdsCreditRedeem**](BillingApi.md#Invoke-AdsCreditRedeem) | **POST** /ad_accounts/{ad_account_id}/ads_credit/redeem | Redeem ad credits
[**Invoke-AdsCreditsDiscountsGet**](BillingApi.md#Invoke-AdsCreditsDiscountsGet) | **GET** /ad_accounts/{ad_account_id}/ads_credit/discounts | Get ads credit discounts
[**Invoke-BillingProfilesGet**](BillingApi.md#Invoke-BillingProfilesGet) | **GET** /ad_accounts/{ad_account_id}/billing_profiles | Get billing profiles
[**Invoke-SsioAccountsGet**](BillingApi.md#Invoke-SsioAccountsGet) | **GET** /ad_accounts/{ad_account_id}/ssio/accounts | Get Salesforce account details including bill-to information.
[**Invoke-SsioInsertionOrderCreate**](BillingApi.md#Invoke-SsioInsertionOrderCreate) | **POST** /ad_accounts/{ad_account_id}/ssio/insertion_orders | Create insertion order through SSIO.
[**Invoke-SsioInsertionOrderEdit**](BillingApi.md#Invoke-SsioInsertionOrderEdit) | **PATCH** /ad_accounts/{ad_account_id}/ssio/insertion_orders | Edit insertion order through SSIO.
[**Invoke-SsioInsertionOrdersStatusGetByAdAccount**](BillingApi.md#Invoke-SsioInsertionOrdersStatusGetByAdAccount) | **GET** /ad_accounts/{ad_account_id}/ssio/insertion_orders/status | Get insertion order status by ad account id.
[**Invoke-SsioInsertionOrdersStatusGetByPinOrderId**](BillingApi.md#Invoke-SsioInsertionOrdersStatusGetByPinOrderId) | **GET** /ad_accounts/{ad_account_id}/ssio/insertion_orders/{pin_order_id}/status | Get insertion order status by pin order id.
[**Invoke-SsioOrderLinesGetByAdAccount**](BillingApi.md#Invoke-SsioOrderLinesGetByAdAccount) | **GET** /ad_accounts/{ad_account_id}/ssio/order_lines | Get Salesforce order lines by ad account id.


<a id="Invoke-AdsCreditRedeem"></a>
# **Invoke-AdsCreditRedeem**
> AdsCreditRedeemResponse Invoke-AdsCreditRedeem<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdsCreditRedeemRequest] <PSCustomObject><br>

Redeem ad credits

Redeem ads credit on behalf of the ad account id and apply it towards billing.  <strong>This endpoint might not be available to all apps. <a href='/docs/new/about-beta-access/'>Learn more</a>.</strong>

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account.
$AdsCreditRedeemRequest = Initialize-AdsCreditRedeemRequest -OfferCodeHash "138e9e0ff7e38cf511b880975eb574c09aa9d5e1657590ab0431040da68caa67" -ValidateOnly $true # AdsCreditRedeemRequest | Redeem ad credits request.

# Redeem ad credits
try {
    $Result = Invoke-AdsCreditRedeem -AdAccountId $AdAccountId -AdsCreditRedeemRequest $AdsCreditRedeemRequest
} catch {
    Write-Host ("Exception occurred when calling Invoke-AdsCreditRedeem: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **AdAccountId** | **String**| Unique identifier of an ad account. | 
 **AdsCreditRedeemRequest** | [**AdsCreditRedeemRequest**](AdsCreditRedeemRequest.md)| Redeem ad credits request. | 

### Return type

[**AdsCreditRedeemResponse**](AdsCreditRedeemResponse.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-AdsCreditsDiscountsGet"></a>
# **Invoke-AdsCreditsDiscountsGet**
> AdsCreditsDiscountsGet200Response Invoke-AdsCreditsDiscountsGet<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Bookmark] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-PageSize] <System.Nullable[Int32]><br>

Get ads credit discounts

Returns the list of discounts applied to the account.  <strong>This endpoint might not be available to all apps. <a href='/docs/new/about-beta-access/'>Learn more</a>.</strong>

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account.
$Bookmark = "MyBookmark" # String | Cursor used to fetch the next page of items (optional)
$PageSize = 56 # Int32 | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information. (optional) (default to 25)

# Get ads credit discounts
try {
    $Result = Invoke-AdsCreditsDiscountsGet -AdAccountId $AdAccountId -Bookmark $Bookmark -PageSize $PageSize
} catch {
    Write-Host ("Exception occurred when calling Invoke-AdsCreditsDiscountsGet: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **AdAccountId** | **String**| Unique identifier of an ad account. | 
 **Bookmark** | **String**| Cursor used to fetch the next page of items | [optional] 
 **PageSize** | **Int32**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]

### Return type

[**AdsCreditsDiscountsGet200Response**](AdsCreditsDiscountsGet200Response.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-BillingProfilesGet"></a>
# **Invoke-BillingProfilesGet**
> BillingProfilesGet200Response Invoke-BillingProfilesGet<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-IsActive] <Boolean><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Bookmark] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-PageSize] <System.Nullable[Int32]><br>

Get billing profiles

Get billing profiles in the advertiser account.  <strong>This endpoint might not be available to all apps. <a href='/docs/new/about-beta-access/'>Learn more</a>.</strong>

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account.
$IsActive = $true # Boolean | Return active billing profiles, if false return all billing profiles.
$Bookmark = "MyBookmark" # String | Cursor used to fetch the next page of items (optional)
$PageSize = 56 # Int32 | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information. (optional) (default to 25)

# Get billing profiles
try {
    $Result = Invoke-BillingProfilesGet -AdAccountId $AdAccountId -IsActive $IsActive -Bookmark $Bookmark -PageSize $PageSize
} catch {
    Write-Host ("Exception occurred when calling Invoke-BillingProfilesGet: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **AdAccountId** | **String**| Unique identifier of an ad account. | 
 **IsActive** | **Boolean**| Return active billing profiles, if false return all billing profiles. | 
 **Bookmark** | **String**| Cursor used to fetch the next page of items | [optional] 
 **PageSize** | **Int32**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]

### Return type

[**BillingProfilesGet200Response**](BillingProfilesGet200Response.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-SsioAccountsGet"></a>
# **Invoke-SsioAccountsGet**
> SSIOAccountResponse Invoke-SsioAccountsGet<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>

Get Salesforce account details including bill-to information.

Get Salesforce account details including bill-to information to be used in insertion orders process for <code>ad_account_id</code>. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=""https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts"">Business Access</a>: Admin, Finance, Campaign.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account.

# Get Salesforce account details including bill-to information.
try {
    $Result = Invoke-SsioAccountsGet -AdAccountId $AdAccountId
} catch {
    Write-Host ("Exception occurred when calling Invoke-SsioAccountsGet: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **AdAccountId** | **String**| Unique identifier of an ad account. | 

### Return type

[**SSIOAccountResponse**](SSIOAccountResponse.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-SsioInsertionOrderCreate"></a>
# **Invoke-SsioInsertionOrderCreate**
> SSIOCreateInsertionOrderResponse Invoke-SsioInsertionOrderCreate<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-SSIOCreateInsertionOrderRequest] <PSCustomObject><br>

Create insertion order through SSIO.

Create insertion order through SSIO for <code>ad_account_id</code>. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=""https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts"">Business Access</a>: Admin, Finance, Campaign.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account.
$SSIOCreateInsertionOrderRequest = Initialize-SSIOCreateInsertionOrderRequest -StartDate "2020-12-20" -EndDate "2020-12-20" -PoNumber "MyPoNumber" -BudgetAmount 5000000 -BillingContactFirstname "MyBillingContactFirstname" -BillingContactLastname "MyBillingContactLastname" -BillingContactEmail "test@example" -MediaContactFirstname "MyMediaContactFirstname" -MediaContactLastname "MyMediaContactLastname" -MediaContactEmail "test@example" -AgencyLink "MyAgencyLink" -UserEmail "test@example" -AcceptedTermsTime 0 -PmpId "MyPmpId" -OrderName "MyOrderName" -OrderLineType "BUDGET" -AcceptedTermsId "MyAcceptedTermsId" -BilltoCompanyId "MyBilltoCompanyId" -BilltoBusinessAddressId "MyBilltoBusinessAddressId" -BilltoBillingAddressId "MyBilltoBillingAddressId" -EstimatedMonthlySpend 0 -CurrencyInfo "UNK" # SSIOCreateInsertionOrderRequest | Order line to create.

# Create insertion order through SSIO.
try {
    $Result = Invoke-SsioInsertionOrderCreate -AdAccountId $AdAccountId -SSIOCreateInsertionOrderRequest $SSIOCreateInsertionOrderRequest
} catch {
    Write-Host ("Exception occurred when calling Invoke-SsioInsertionOrderCreate: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **AdAccountId** | **String**| Unique identifier of an ad account. | 
 **SSIOCreateInsertionOrderRequest** | [**SSIOCreateInsertionOrderRequest**](SSIOCreateInsertionOrderRequest.md)| Order line to create. | 

### Return type

[**SSIOCreateInsertionOrderResponse**](SSIOCreateInsertionOrderResponse.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-SsioInsertionOrderEdit"></a>
# **Invoke-SsioInsertionOrderEdit**
> SSIOEditInsertionOrderResponse Invoke-SsioInsertionOrderEdit<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-SSIOEditInsertionOrderRequest] <PSCustomObject><br>

Edit insertion order through SSIO.

Edit insertion order through SSIO for <code>ad_account_id</code>. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=""https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts"">Business Access</a>: Admin, Finance, Campaign.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account.
$SSIOEditInsertionOrderRequest = Initialize-SSIOEditInsertionOrderRequest -StartDate "2020-12-20" -EndDate "2020-12-20" -PoNumber "MyPoNumber" -BudgetAmount 5000000 -BillingContactFirstname "MyBillingContactFirstname" -BillingContactLastname "MyBillingContactLastname" -BillingContactEmail "test@example" -MediaContactFirstname "MyMediaContactFirstname" -MediaContactLastname "MyMediaContactLastname" -MediaContactEmail "test@example" -AgencyLink "MyAgencyLink" -UserEmail "test@example" -OracleLineId "MyOracleLineId" -SalesforceOrderId "MySalesforceOrderId" -SalesforceOrderLineId "MySalesforceOrderLineId" -AdsManagerOrderLineId "MyAdsManagerOrderLineId" # SSIOEditInsertionOrderRequest | Order line to create.

# Edit insertion order through SSIO.
try {
    $Result = Invoke-SsioInsertionOrderEdit -AdAccountId $AdAccountId -SSIOEditInsertionOrderRequest $SSIOEditInsertionOrderRequest
} catch {
    Write-Host ("Exception occurred when calling Invoke-SsioInsertionOrderEdit: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **AdAccountId** | **String**| Unique identifier of an ad account. | 
 **SSIOEditInsertionOrderRequest** | [**SSIOEditInsertionOrderRequest**](SSIOEditInsertionOrderRequest.md)| Order line to create. | 

### Return type

[**SSIOEditInsertionOrderResponse**](SSIOEditInsertionOrderResponse.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-SsioInsertionOrdersStatusGetByAdAccount"></a>
# **Invoke-SsioInsertionOrdersStatusGetByAdAccount**
> SsioInsertionOrdersStatusGetByAdAccount200Response Invoke-SsioInsertionOrdersStatusGetByAdAccount<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Bookmark] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-PageSize] <System.Nullable[Int32]><br>

Get insertion order status by ad account id.

Get insertion order status for account id <code>ad_account_id</code>. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=""https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts"">Business Access</a>: Admin, Finance, Campaign.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account.
$Bookmark = "MyBookmark" # String | Cursor used to fetch the next page of items (optional)
$PageSize = 56 # Int32 | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information. (optional) (default to 25)

# Get insertion order status by ad account id.
try {
    $Result = Invoke-SsioInsertionOrdersStatusGetByAdAccount -AdAccountId $AdAccountId -Bookmark $Bookmark -PageSize $PageSize
} catch {
    Write-Host ("Exception occurred when calling Invoke-SsioInsertionOrdersStatusGetByAdAccount: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **AdAccountId** | **String**| Unique identifier of an ad account. | 
 **Bookmark** | **String**| Cursor used to fetch the next page of items | [optional] 
 **PageSize** | **Int32**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]

### Return type

[**SsioInsertionOrdersStatusGetByAdAccount200Response**](SsioInsertionOrdersStatusGetByAdAccount200Response.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-SsioInsertionOrdersStatusGetByPinOrderId"></a>
# **Invoke-SsioInsertionOrdersStatusGetByPinOrderId**
> SSIOInsertionOrderStatusResponse Invoke-SsioInsertionOrdersStatusGetByPinOrderId<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-PinOrderId] <String><br>

Get insertion order status by pin order id.

Get insertion order status for pin order id <code>pin_order_id</code>. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=""https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts"">Business Access</a>: Admin, Finance, Campaign.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account.
$PinOrderId = "0Q01N0000015hekSVDFDC" # String | The pin order id associated with the ssio insertion order

# Get insertion order status by pin order id.
try {
    $Result = Invoke-SsioInsertionOrdersStatusGetByPinOrderId -AdAccountId $AdAccountId -PinOrderId $PinOrderId
} catch {
    Write-Host ("Exception occurred when calling Invoke-SsioInsertionOrdersStatusGetByPinOrderId: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **AdAccountId** | **String**| Unique identifier of an ad account. | 
 **PinOrderId** | **String**| The pin order id associated with the ssio insertion order | 

### Return type

[**SSIOInsertionOrderStatusResponse**](SSIOInsertionOrderStatusResponse.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-SsioOrderLinesGetByAdAccount"></a>
# **Invoke-SsioOrderLinesGetByAdAccount**
> SsioOrderLinesGetByAdAccount200Response Invoke-SsioOrderLinesGetByAdAccount<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Bookmark] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-PageSize] <System.Nullable[Int32]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-PinOrderId] <String><br>

Get Salesforce order lines by ad account id.

Get Salesforce order lines for account id <code>ad_account_id</code>. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=""https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts"">Business Access</a>: Admin, Finance, Campaign.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account.
$Bookmark = "MyBookmark" # String | Cursor used to fetch the next page of items (optional)
$PageSize = 56 # Int32 | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information. (optional) (default to 25)
$PinOrderId = "0Q01N0000015hekSVDFDC" # String | The pin order id associated with the ssio insertino order (optional)

# Get Salesforce order lines by ad account id.
try {
    $Result = Invoke-SsioOrderLinesGetByAdAccount -AdAccountId $AdAccountId -Bookmark $Bookmark -PageSize $PageSize -PinOrderId $PinOrderId
} catch {
    Write-Host ("Exception occurred when calling Invoke-SsioOrderLinesGetByAdAccount: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **AdAccountId** | **String**| Unique identifier of an ad account. | 
 **Bookmark** | **String**| Cursor used to fetch the next page of items | [optional] 
 **PageSize** | **Int32**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **PinOrderId** | **String**| The pin order id associated with the ssio insertino order | [optional] 

### Return type

[**SsioOrderLinesGetByAdAccount200Response**](SsioOrderLinesGetByAdAccount200Response.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

