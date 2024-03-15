# PSOpenAPITools.PSOpenAPITools\Api.ConversionEventsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**Invoke-EventsCreate**](ConversionEventsApi.md#Invoke-EventsCreate) | **POST** /ad_accounts/{ad_account_id}/events | Send conversions


<a id="Invoke-EventsCreate"></a>
# **Invoke-EventsCreate**
> ConversionApiResponse Invoke-EventsCreate<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ConversionEvents] <PSCustomObject><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Test] <System.Nullable[Boolean]><br>

Send conversions

The Pinterest API offers advertisers a way to send Pinterest their conversion information (including web conversions, in-app conversions, or even offline conversions) based on their <code>ad_account_id</code>. The request body should be a JSON object. - This endpoint requires an <code>access_token</code> be generated through Ads Manager. Review the <a href=""/docs/conversions/conversions/"">Conversions Guide</a> for more details. - The token's <code>user_account</code> must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=""https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts"">Business Access</a>: Admin, Analyst, Audience, Campaign. (Note that the token can be used across multiple ad accounts under an user ID.) - This endpoint has a rate limit of 5,000 calls per minute per ad account. - If the merchant is submitting this information using both Pinterest conversion tags and the Pinterest API, Pinterest will remove duplicate information before reporting. (Note that events that took place offline cannot be deduplicated.)

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"


$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account.
$ConversionEventsUserData = Initialize-ConversionEventsUserData -Ph "MyPh" -Ge "MyGe" -Db "MyDb" -Ln "MyLn" -Fn "MyFn" -Ct "MyCt" -St "MySt" -Zp "MyZp" -Country "MyCountry" -ExternalId "MyExternalId" -ClickId "dj0yJnU9b2JDcFFHekV4SHJNcmVrbFBkUEdqakh0akdUT1VjVVUmcD0yJm49cnNBQ3F2Q2dOVDBXWWhkWklrUGxBUSZ0PUFBQUFBR1BaY3Bv" -PartnerId "BUJrTlRRzGJmWhRXFZdkioV6wKPBve7Lom__GU9J74hq2NIQj4O3nOZJrp3mcUr5MptkXsI14juMOIM9mNZnM4zEUFT2JLVaFhcOfuuWz3IWEDtBf6I0DPc"

$ConversionEventsDataInnerCustomDataContentsInner = Initialize-ConversionEventsDataInnerCustomDataContentsInner -Id "red-pinterest-shirt-logo-1" -ItemPrice "1325.12" -Quantity 5 -ItemName "pinterest-clothing-shirt" -ItemCategory "pinterest-entertainment" -ItemBrand "pinterest"
$ConversionEventsDataInnerCustomData = Initialize-ConversionEventsDataInnerCustomData -Currency "USD" -Value "72.39" -ContentIds "MyContentIds" -ContentName "pinterest-themed-clothing" -ContentCategory "shirts" -ContentBrand "pinterest-brand" -Contents $ConversionEventsDataInnerCustomDataContentsInner -NumItems 2 -OrderId "my_order_id" -SearchString "sample string" -OptOutType "LDP" -Np "ss-company"

$ConversionEventsDataInner = Initialize-ConversionEventsDataInner -EventName "checkout" -ActionSource "app_ios" -EventTime 1451431341 -EventId "eventId0001" -EventSourceUrl "https://www.my-clothing-shop.org/" -OptOut $false -PartnerName "ss-partnername" -UserData $ConversionEventsUserData -CustomData $ConversionEventsDataInnerCustomData -AppId "429047995" -AppName "Pinterest" -AppVersion "7.9" -DeviceBrand "Apple" -DeviceCarrier "T-Mobile" -DeviceModel "iPhone X" -DeviceType "iPhone" -OsVersion "12.1.4" -Wifi $false -Language "en"

$ConversionEvents = Initialize-ConversionEvents -VarData $ConversionEventsDataInner # ConversionEvents | Conversion events.
$Test = $true # Boolean | Include query param ?test=true to mark the request as a test request. The events will not be recorded but the API will still return the same response messages. Use this mode to verify your requests are working and your events are constructed correctly. Warning: If you use this query parameter, be certain that it is off (set to false or deleted) before sending a legitimate (non-testing) request. (optional)

# Send conversions
try {
    $Result = Invoke-EventsCreate -AdAccountId $AdAccountId -ConversionEvents $ConversionEvents -Test $Test
} catch {
    Write-Host ("Exception occurred when calling Invoke-EventsCreate: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **AdAccountId** | **String**| Unique identifier of an ad account. | 
 **ConversionEvents** | [**ConversionEvents**](ConversionEvents.md)| Conversion events. | 
 **Test** | **Boolean**| Include query param ?test&#x3D;true to mark the request as a test request. The events will not be recorded but the API will still return the same response messages. Use this mode to verify your requests are working and your events are constructed correctly. Warning: If you use this query parameter, be certain that it is off (set to false or deleted) before sending a legitimate (non-testing) request. | [optional] 

### Return type

[**ConversionApiResponse**](ConversionApiResponse.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [conversion_token](../README.md#conversion_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

