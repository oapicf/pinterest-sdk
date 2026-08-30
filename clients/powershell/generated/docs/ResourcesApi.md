# PSOpenAPITools.PSOpenAPITools\Api.ResourcesApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**Invoke-AdAccountCountriesGet**](ResourcesApi.md#Invoke-AdAccountCountriesGet) | **GET** /resources/ad_account_countries | Get ad accounts countries
[**Invoke-DeliveryMetricsGet**](ResourcesApi.md#Invoke-DeliveryMetricsGet) | **GET** /resources/delivery_metrics | Get available metrics&#39; definitions
[**ConvertTo-terestTargetingOptionsGet**](ResourcesApi.md#ConvertTo-terestTargetingOptionsGet) | **GET** /resources/targeting/interests/{interest_id} | Get interest details
[**Invoke-LeadFormQuestionsGet**](ResourcesApi.md#Invoke-LeadFormQuestionsGet) | **GET** /resources/lead_form_questions | Get lead form questions
[**Invoke-MetricsReadyStateGet**](ResourcesApi.md#Invoke-MetricsReadyStateGet) | **GET** /resources/metrics_ready_state | Get metrics ready state
[**Invoke-TargetingOptionsGet**](ResourcesApi.md#Invoke-TargetingOptionsGet) | **GET** /resources/targeting/{targeting_type} | Get targeting options


<a id="Invoke-AdAccountCountriesGet"></a>
# **Invoke-AdAccountCountriesGet**
> AdAccountCountriesGet200Response Invoke-AdAccountCountriesGet<br>

Get ad accounts countries

Get Ad Accounts countries

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

# Configure OAuth2 access token for authorization: client_credentials
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"


# Get ad accounts countries
try {
    $Result = Invoke-AdAccountCountriesGet
} catch {
    Write-Host ("Exception occurred when calling Invoke-AdAccountCountriesGet: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**AdAccountCountriesGet200Response**](AdAccountCountriesGet200Response.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-DeliveryMetricsGet"></a>
# **Invoke-DeliveryMetricsGet**
> DeliveryMetricsGet200Response Invoke-DeliveryMetricsGet<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ReportType] <PSCustomObject><br>

Get available metrics' definitions

Get the definitions for ads and organic metrics available across both synchronous and asynchronous report endpoints. The `display_name` attribute will match how the metric is named in our native tools like Ads Manager. See [Organic Analytics](/docs/api-features/analytics-overview/) and [Ads Analytics](/docs/api-features/ads-reporting/) for more information.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

# Configure OAuth2 access token for authorization: client_credentials
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$ReportType = "SYNC" # ReportType | Report type. (optional)

# Get available metrics' definitions
try {
    $Result = Invoke-DeliveryMetricsGet -ReportType $ReportType
} catch {
    Write-Host ("Exception occurred when calling Invoke-DeliveryMetricsGet: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ReportType** | [**ReportType**](ReportType.md)| Report type. | [optional] 

### Return type

[**DeliveryMetricsGet200Response**](DeliveryMetricsGet200Response.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="ConvertTo-terestTargetingOptionsGet"></a>
# **ConvertTo-terestTargetingOptionsGet**
> SingleInterestTargetingOption ConvertTo-terestTargetingOptionsGet<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-InterestId] <String><br>

Get interest details

Get details of a specific interest given interest ID.  Click [here](https://docs.google.com/spreadsheets/d/1HxL-0Z3p2fgxis9YBP2HWC3tvPrs1hAuHDRtH-NJTIM/edit#gid=118370875) for a spreadsheet listing interests and their IDs.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

# Configure OAuth2 access token for authorization: client_credentials
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$InterestId = "MyInterestId" # String | Unique identifier of an interest.

# Get interest details
try {
    $Result = ConvertTo-terestTargetingOptionsGet -InterestId $InterestId
} catch {
    Write-Host ("Exception occurred when calling ConvertTo-terestTargetingOptionsGet: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **InterestId** | **String**| Unique identifier of an interest. | 

### Return type

[**SingleInterestTargetingOption**](SingleInterestTargetingOption.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-LeadFormQuestionsGet"></a>
# **Invoke-LeadFormQuestionsGet**
> void Invoke-LeadFormQuestionsGet<br>

Get lead form questions

Get a list of all lead form question type names. Some questions might not be used.  **This endpoint is currently in beta and not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"


# Get lead form questions
try {
    $Result = Invoke-LeadFormQuestionsGet
} catch {
    Write-Host ("Exception occurred when calling Invoke-LeadFormQuestionsGet: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

void (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-MetricsReadyStateGet"></a>
# **Invoke-MetricsReadyStateGet**
> BookClosed Invoke-MetricsReadyStateGet<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Date] <String><br>

Get metrics ready state

Learn whether conversion or non-conversion metrics are finalized and ready to query.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$Date = "MyDate" # String | Analytics reports request date (UTC). Format: YYYY-MM-DD

# Get metrics ready state
try {
    $Result = Invoke-MetricsReadyStateGet -Date $Date
} catch {
    Write-Host ("Exception occurred when calling Invoke-MetricsReadyStateGet: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **Date** | **String**| Analytics reports request date (UTC). Format: YYYY-MM-DD | 

### Return type

[**BookClosed**](BookClosed.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-TargetingOptionsGet"></a>
# **Invoke-TargetingOptionsGet**
> SystemCollectionsHashtable[] Invoke-TargetingOptionsGet<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-TargetingType] <PSCustomObject><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ClientId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-OauthSignature] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Timestamp] <String><br>

Get targeting options

    You can use targeting values in ads placement to define your intended audience.      Targeting metrics are organized around targeting specifications.      For more information on ads targeting, see [Audience targeting](https://help.pinterest.com/en/business/article/audience-targeting).      **Sample return:**      ```     [{""36313"": ""Australia: Moreton Bay - North"", ""124735"": ""Canada: North Battleford"", ""36109"": ""Australia: Murray"", ""36108"": ""Australia: Mid North Coast"", ""36101"": ""Australia: Capital Region"", ""811"": ""U.S.: Reno"", ""36103"": ""Australia: Central West"", ""36102"": ""Australia: Central Coast"", ""36105"": ""Australia: Far West and Orana"", ""36104"": ""Australia: Coffs Harbour - Grafton"", ""36107"": ""Australia: Illawarra"", ""36106"": ""Australia: Hunter Valley Exc Newcastle"", ""554017"": ""New Zealand: Wanganui"", ""554016"": ""New Zealand: Marlborough"", ""554015"": ""New Zealand: Gisborne"", ""554014"": ""New Zealand: Tararua"", ""554013"": ""New Zealand: Invercargill"", ""GR"": ""Greece"", ""554011"": ""New Zealand: Whangarei"", ""554010"": ""New Zealand: Far North"", ""717"": ""U.S.: Quincy-Hannibal-Keokuk"", ""716"": ""U.S.: Baton Rouge"",...}]     ```

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

# Configure OAuth2 access token for authorization: client_credentials
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$TargetingType = "APPTYPE" # PublicTargetingType | Public targeting type
$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account. (optional)
$ClientId = "MyClientId" # String | Client ID (optional)
$OauthSignature = "MyOauthSignature" # String | Oauth signature (optional)
$Timestamp = "MyTimestamp" # String | Timestamp. (optional)

# Get targeting options
try {
    $Result = Invoke-TargetingOptionsGet -TargetingType $TargetingType -AdAccountId $AdAccountId -ClientId $ClientId -OauthSignature $OauthSignature -Timestamp $Timestamp
} catch {
    Write-Host ("Exception occurred when calling Invoke-TargetingOptionsGet: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **TargetingType** | [**PublicTargetingType**](PublicTargetingType.md)| Public targeting type | 
 **AdAccountId** | **String**| Unique identifier of an ad account. | [optional] 
 **ClientId** | **String**| Client ID | [optional] 
 **OauthSignature** | **String**| Oauth signature | [optional] 
 **Timestamp** | **String**| Timestamp. | [optional] 

### Return type

[**SystemCollectionsHashtable[]**](SystemCollectionsHashtable.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

