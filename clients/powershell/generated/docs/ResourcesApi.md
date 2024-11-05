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
> AdAccountsCountryResponse Invoke-AdAccountCountriesGet<br>

Get ad accounts countries

Get Ad Accounts countries

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
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

[**AdAccountsCountryResponse**](AdAccountsCountryResponse.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-DeliveryMetricsGet"></a>
# **Invoke-DeliveryMetricsGet**
> DeliveryMetricsResponse Invoke-DeliveryMetricsGet<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ReportType] <String><br>

Get available metrics' definitions

Get the definitions for ads and organic metrics available across both synchronous and asynchronous report endpoints. The `display_name` attribute will match how the metric is named in our native tools like Ads Manager. See <a href='/docs/api-features/analytics-overview/'>Organic Analytics</a> and <a href='/docs/api-features/ads-reporting/'>Ads Analytics</a> for more information.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$ReportType = "SYNC" # String | Report type. (optional)

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
 **ReportType** | **String**| Report type. | [optional] 

### Return type

[**DeliveryMetricsResponse**](DeliveryMetricsResponse.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="ConvertTo-terestTargetingOptionsGet"></a>
# **ConvertTo-terestTargetingOptionsGet**
> SingleInterestTargetingOptionResponse ConvertTo-terestTargetingOptionsGet<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-InterestId] <String><br>

Get interest details

<p>Get details of a specific interest given interest ID.</p> <p>Click <a href=""https://docs.google.com/spreadsheets/d/1HxL-0Z3p2fgxis9YBP2HWC3tvPrs1hAuHDRtH-NJTIM/edit#gid=118370875"" target=""_blank"">here</a> for a spreadsheet listing interests and their IDs.</p>

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
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

[**SingleInterestTargetingOptionResponse**](SingleInterestTargetingOptionResponse.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-LeadFormQuestionsGet"></a>
# **Invoke-LeadFormQuestionsGet**
> void Invoke-LeadFormQuestionsGet<br>

Get lead form questions

Get a list of all lead form question type names. Some questions might not be used.  <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/getting-started/beta-and-advanced-access/'>Learn more</a>.</strong>

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
> BookClosedResponse Invoke-MetricsReadyStateGet<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Date] <String><br>

Get metrics ready state

Learn whether conversion or non-conversion metrics are finalized and ready to query.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$Date = "2022-07-13" # String | Analytics reports request date (UTC). Format: YYYY-MM-DD

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

[**BookClosedResponse**](BookClosedResponse.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-TargetingOptionsGet"></a>
# **Invoke-TargetingOptionsGet**
> SystemCollectionsHashtable[] Invoke-TargetingOptionsGet<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-TargetingType] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ClientId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-OauthSignature] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Timestamp] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>

Get targeting options

<p>You can use targeting values in ads placement to define your intended audience. </p> <p>Targeting metrics are organized around targeting specifications.</p> <p>For more information on ads targeting, see <a class=""reference external"" href=""https://help.pinterest.com/en/business/article/audience-targeting"" target=""_blank"">Audience targeting</a>.</p> <p><b>Sample return:</b></p> <pre class=""literal-block""> [{&quot;36313&quot;: &quot;Australia: Moreton Bay - North&quot;, &quot;124735&quot;: &quot;Canada: North Battleford&quot;, &quot;36109&quot;: &quot;Australia: Murray&quot;, &quot;36108&quot;: &quot;Australia: Mid North Coast&quot;, &quot;36101&quot;: &quot;Australia: Capital Region&quot;, &quot;811&quot;: &quot;U.S.: Reno&quot;, &quot;36103&quot;: &quot;Australia: Central West&quot;, &quot;36102&quot;: &quot;Australia: Central Coast&quot;, &quot;36105&quot;: &quot;Australia: Far West and Orana&quot;, &quot;36104&quot;: &quot;Australia: Coffs Harbour - Grafton&quot;, &quot;36107&quot;: &quot;Australia: Illawarra&quot;, &quot;36106&quot;: &quot;Australia: Hunter Valley Exc Newcastle&quot;, &quot;554017&quot;: &quot;New Zealand: Wanganui&quot;, &quot;554016&quot;: &quot;New Zealand: Marlborough&quot;, &quot;554015&quot;: &quot;New Zealand: Gisborne&quot;, &quot;554014&quot;: &quot;New Zealand: Tararua&quot;, &quot;554013&quot;: &quot;New Zealand: Invercargill&quot;, &quot;GR&quot;: &quot;Greece&quot;, &quot;554011&quot;: &quot;New Zealand: Whangarei&quot;, &quot;554010&quot;: &quot;New Zealand: Far North&quot;, &quot;717&quot;: &quot;U.S.: Quincy-Hannibal-Keokuk&quot;, &quot;716&quot;: &quot;U.S.: Baton Rouge&quot;,...}] </pre>

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$TargetingType = "APPTYPE" # String | Public targeting type.
$ClientId = "1094834" # String | Client ID. (optional)
$OauthSignature = "8209f" # String | Oauth signature (optional)
$Timestamp = "1618338184277" # String | Timestamp (optional)
$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account. (optional)

# Get targeting options
try {
    $Result = Invoke-TargetingOptionsGet -TargetingType $TargetingType -ClientId $ClientId -OauthSignature $OauthSignature -Timestamp $Timestamp -AdAccountId $AdAccountId
} catch {
    Write-Host ("Exception occurred when calling Invoke-TargetingOptionsGet: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **TargetingType** | **String**| Public targeting type. | 
 **ClientId** | **String**| Client ID. | [optional] 
 **OauthSignature** | **String**| Oauth signature | [optional] 
 **Timestamp** | **String**| Timestamp | [optional] 
 **AdAccountId** | **String**| Unique identifier of an ad account. | [optional] 

### Return type

[**SystemCollectionsHashtable[]**](SystemCollectionsHashtable.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

