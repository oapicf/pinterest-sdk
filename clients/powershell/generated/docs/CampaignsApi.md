# PSOpenAPITools.PSOpenAPITools\Api.CampaignsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**Invoke-CampaignTargetingAnalyticsGet**](CampaignsApi.md#Invoke-CampaignTargetingAnalyticsGet) | **GET** /ad_accounts/{ad_account_id}/campaigns/targeting_analytics | Get targeting analytics for campaigns
[**Invoke-CampaignsAnalytics**](CampaignsApi.md#Invoke-CampaignsAnalytics) | **GET** /ad_accounts/{ad_account_id}/campaigns/analytics | Get campaign analytics
[**Invoke-CampaignsCreate**](CampaignsApi.md#Invoke-CampaignsCreate) | **POST** /ad_accounts/{ad_account_id}/campaigns | Create campaigns
[**Invoke-CampaignsGet**](CampaignsApi.md#Invoke-CampaignsGet) | **GET** /ad_accounts/{ad_account_id}/campaigns/{campaign_id} | Get campaign
[**Invoke-CampaignsList**](CampaignsApi.md#Invoke-CampaignsList) | **GET** /ad_accounts/{ad_account_id}/campaigns | List campaigns
[**Invoke-CampaignsUpdate**](CampaignsApi.md#Invoke-CampaignsUpdate) | **PATCH** /ad_accounts/{ad_account_id}/campaigns | Update campaigns


<a id="Invoke-CampaignTargetingAnalyticsGet"></a>
# **Invoke-CampaignTargetingAnalyticsGet**
> MetricsResponse Invoke-CampaignTargetingAnalyticsGet<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-CampaignIds] <String[]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-StartDate] <System.DateTime><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-EndDate] <System.DateTime><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-TargetingTypes] <PSCustomObject[]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Columns] <String[]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Granularity] <PSCustomObject><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ClickWindowDays] <System.Nullable[Int32]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-EngagementWindowDays] <System.Nullable[Int32]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ViewWindowDays] <System.Nullable[Int32]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ConversionReportTime] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AttributionTypes] <PSCustomObject><br>

Get targeting analytics for campaigns

Get targeting analytics for one or more campaigns. For the requested account and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. ""age_bucket"") for applicable values (e.g. ""45-49""). <p/> - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=""https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts"">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account.
$CampaignIds = "MyCampaignIds" # String[] | List of Campaign Ids to use to filter the results.
$StartDate = (Get-Date) # System.DateTime | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
$EndDate = (Get-Date) # System.DateTime | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
$TargetingTypes = "KEYWORD" # AdsAnalyticsTargetingType[] | Targeting type breakdowns for the report. The reporting per targeting type <br> is independent from each other.
$Columns = "SPEND_IN_MICRO_DOLLAR" # String[] | Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned
$Granularity = "TOTAL" # Granularity | TOTAL - metrics are aggregated over the specified date range.<br> DAY - metrics are broken down daily.<br> HOUR - metrics are broken down hourly.<br>WEEKLY - metrics are broken down weekly.<br>MONTHLY - metrics are broken down monthly
$ClickWindowDays = "0" # Int32 | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. (optional) (default to 30)
$EngagementWindowDays = "0" # Int32 | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. (optional) (default to 30)
$ViewWindowDays = "0" # Int32 | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day. (optional) (default to 1)
$ConversionReportTime = "TIME_OF_AD_ACTION" # String | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. (optional) (default to "TIME_OF_AD_ACTION")
$AttributionTypes = "INDIVIDUAL" # ConversionReportAttributionType | List of types of attribution for the conversion report (optional)

# Get targeting analytics for campaigns
try {
    $Result = Invoke-CampaignTargetingAnalyticsGet -AdAccountId $AdAccountId -CampaignIds $CampaignIds -StartDate $StartDate -EndDate $EndDate -TargetingTypes $TargetingTypes -Columns $Columns -Granularity $Granularity -ClickWindowDays $ClickWindowDays -EngagementWindowDays $EngagementWindowDays -ViewWindowDays $ViewWindowDays -ConversionReportTime $ConversionReportTime -AttributionTypes $AttributionTypes
} catch {
    Write-Host ("Exception occurred when calling Invoke-CampaignTargetingAnalyticsGet: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **AdAccountId** | **String**| Unique identifier of an ad account. | 
 **CampaignIds** | [**String[]**](String.md)| List of Campaign Ids to use to filter the results. | 
 **StartDate** | **System.DateTime**| Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | 
 **EndDate** | **System.DateTime**| Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | 
 **TargetingTypes** | [**AdsAnalyticsTargetingType[]**](AdsAnalyticsTargetingType.md)| Targeting type breakdowns for the report. The reporting per targeting type &lt;br&gt; is independent from each other. | 
 **Columns** | [**String[]**](String.md)| Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned | 
 **Granularity** | [**Granularity**](Granularity.md)| TOTAL - metrics are aggregated over the specified date range.&lt;br&gt; DAY - metrics are broken down daily.&lt;br&gt; HOUR - metrics are broken down hourly.&lt;br&gt;WEEKLY - metrics are broken down weekly.&lt;br&gt;MONTHLY - metrics are broken down monthly | 
 **ClickWindowDays** | **Int32**| Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30]
 **EngagementWindowDays** | **Int32**| Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30]
 **ViewWindowDays** | **Int32**| Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional] [default to 1]
 **ConversionReportTime** | **String**| The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] [default to &quot;TIME_OF_AD_ACTION&quot;]
 **AttributionTypes** | [**ConversionReportAttributionType**](ConversionReportAttributionType.md)| List of types of attribution for the conversion report | [optional] 

### Return type

[**MetricsResponse**](MetricsResponse.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-CampaignsAnalytics"></a>
# **Invoke-CampaignsAnalytics**
> CampaignsAnalyticsResponseInner[] Invoke-CampaignsAnalytics<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-StartDate] <System.DateTime><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-EndDate] <System.DateTime><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-CampaignIds] <String[]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Columns] <String[]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Granularity] <PSCustomObject><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ClickWindowDays] <System.Nullable[Int32]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-EngagementWindowDays] <System.Nullable[Int32]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ViewWindowDays] <System.Nullable[Int32]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ConversionReportTime] <String><br>

Get campaign analytics

Get analytics for the specified campaigns in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=""https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts"">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account.
$StartDate = (Get-Date) # System.DateTime | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
$EndDate = (Get-Date) # System.DateTime | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
$CampaignIds = "MyCampaignIds" # String[] | List of Campaign Ids to use to filter the results.
$Columns = "SPEND_IN_MICRO_DOLLAR" # String[] | Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned
$Granularity = "TOTAL" # Granularity | TOTAL - metrics are aggregated over the specified date range.<br> DAY - metrics are broken down daily.<br> HOUR - metrics are broken down hourly.<br>WEEKLY - metrics are broken down weekly.<br>MONTHLY - metrics are broken down monthly
$ClickWindowDays = "0" # Int32 | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. (optional) (default to 30)
$EngagementWindowDays = "0" # Int32 | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. (optional) (default to 30)
$ViewWindowDays = "0" # Int32 | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day. (optional) (default to 1)
$ConversionReportTime = "TIME_OF_AD_ACTION" # String | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. (optional) (default to "TIME_OF_AD_ACTION")

# Get campaign analytics
try {
    $Result = Invoke-CampaignsAnalytics -AdAccountId $AdAccountId -StartDate $StartDate -EndDate $EndDate -CampaignIds $CampaignIds -Columns $Columns -Granularity $Granularity -ClickWindowDays $ClickWindowDays -EngagementWindowDays $EngagementWindowDays -ViewWindowDays $ViewWindowDays -ConversionReportTime $ConversionReportTime
} catch {
    Write-Host ("Exception occurred when calling Invoke-CampaignsAnalytics: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **AdAccountId** | **String**| Unique identifier of an ad account. | 
 **StartDate** | **System.DateTime**| Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | 
 **EndDate** | **System.DateTime**| Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | 
 **CampaignIds** | [**String[]**](String.md)| List of Campaign Ids to use to filter the results. | 
 **Columns** | [**String[]**](String.md)| Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned | 
 **Granularity** | [**Granularity**](Granularity.md)| TOTAL - metrics are aggregated over the specified date range.&lt;br&gt; DAY - metrics are broken down daily.&lt;br&gt; HOUR - metrics are broken down hourly.&lt;br&gt;WEEKLY - metrics are broken down weekly.&lt;br&gt;MONTHLY - metrics are broken down monthly | 
 **ClickWindowDays** | **Int32**| Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30]
 **EngagementWindowDays** | **Int32**| Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30]
 **ViewWindowDays** | **Int32**| Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional] [default to 1]
 **ConversionReportTime** | **String**| The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] [default to &quot;TIME_OF_AD_ACTION&quot;]

### Return type

[**CampaignsAnalyticsResponseInner[]**](CampaignsAnalyticsResponseInner.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-CampaignsCreate"></a>
# **Invoke-CampaignsCreate**
> CampaignCreateResponse Invoke-CampaignsCreate<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-CampaignCreateRequest] <PSCustomObject[]><br>

Create campaigns

Create multiple new campaigns. Every campaign has its own campaign_id and houses one or more ad groups, which contain one or more ads. For more, see <a href=""https://help.pinterest.com/en/business/article/set-up-your-campaign/"">Set up your campaign</a>. <p/> <strong>Note:</strong> - The values for 'lifetime_spend_cap' and 'daily_spend_cap' are microcurrency amounts based on the currency field set in the advertiser's profile. (e.g. USD) <p/> <p>Microcurrency is used to track very small transactions, based on the currency set in the advertiser’s profile.</p> <p>A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser’s profile.</p> <p><strong>Equivalency equations</strong>, using dollars as an example currency:</p> <ul>   <li>$1 = 1,000,000 microdollars</li>   <li>1 microdollar = $0.000001 </li> </ul> <p><strong>To convert between currency and microcurrency</strong>, using dollars as an example currency:</p> <ul>   <li>To convert dollars to microdollars, mutiply dollars by 1,000,000</li>   <li>To convert microdollars to dollars, divide microdollars by 1,000,000</li> </ul>

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account.
$AdCommonTrackingUrls = Initialize-AdCommonTrackingUrls -Impression "MyImpression" -Click "MyClick" -Engagement "MyEngagement" -BuyableButton "MyBuyableButton" -AudienceVerification "MyAudienceVerification"
$CampaignCreateRequest = Initialize-CampaignCreateRequest -AdAccountId "549755885175" -Name "ACME Tools" -Status "ACTIVE" -LifetimeSpendCap 1432744744 -DailySpendCap 1432744744 -OrderLineId "549755885175" -TrackingUrls $AdCommonTrackingUrls -StartTime 1580865126 -EndTime 1644023526 -SummaryStatus "RUNNING" -IsFlexibleDailyBudgets $true -DefaultAdGroupBudgetInMicroCurrency 0 -IsAutomatedCampaign $true -ObjectiveType "AWARENESS" # CampaignCreateRequest[] | Array of campaigns.

# Create campaigns
try {
    $Result = Invoke-CampaignsCreate -AdAccountId $AdAccountId -CampaignCreateRequest $CampaignCreateRequest
} catch {
    Write-Host ("Exception occurred when calling Invoke-CampaignsCreate: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **AdAccountId** | **String**| Unique identifier of an ad account. | 
 **CampaignCreateRequest** | [**CampaignCreateRequest[]**](CampaignCreateRequest.md)| Array of campaigns. | 

### Return type

[**CampaignCreateResponse**](CampaignCreateResponse.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-CampaignsGet"></a>
# **Invoke-CampaignsGet**
> CampaignResponse Invoke-CampaignsGet<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-CampaignId] <String><br>

Get campaign

Get a specific campaign given the campaign ID.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account.
$CampaignId = "MyCampaignId" # String | Campaign ID, must be associated with the ad account ID provided in the path.

# Get campaign
try {
    $Result = Invoke-CampaignsGet -AdAccountId $AdAccountId -CampaignId $CampaignId
} catch {
    Write-Host ("Exception occurred when calling Invoke-CampaignsGet: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **AdAccountId** | **String**| Unique identifier of an ad account. | 
 **CampaignId** | **String**| Campaign ID, must be associated with the ad account ID provided in the path. | 

### Return type

[**CampaignResponse**](CampaignResponse.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-CampaignsList"></a>
# **Invoke-CampaignsList**
> CampaignsList200Response Invoke-CampaignsList<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-CampaignIds] <String[]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-EntityStatuses] <String[]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-PageSize] <System.Nullable[Int32]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Order] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Bookmark] <String><br>

List campaigns

Get a list of the campaigns in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=""https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts"">Business Access</a>: Admin, Analyst, Campaign Manager.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account.
$CampaignIds = "MyCampaignIds" # String[] | List of Campaign Ids to use to filter the results. (optional)
$EntityStatuses = "ACTIVE" # String[] | Entity status (optional)
$PageSize = 56 # Int32 | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information. (optional) (default to 25)
$Order = "ASCENDING" # String | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. (optional)
$Bookmark = "MyBookmark" # String | Cursor used to fetch the next page of items (optional)

# List campaigns
try {
    $Result = Invoke-CampaignsList -AdAccountId $AdAccountId -CampaignIds $CampaignIds -EntityStatuses $EntityStatuses -PageSize $PageSize -Order $Order -Bookmark $Bookmark
} catch {
    Write-Host ("Exception occurred when calling Invoke-CampaignsList: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **AdAccountId** | **String**| Unique identifier of an ad account. | 
 **CampaignIds** | [**String[]**](String.md)| List of Campaign Ids to use to filter the results. | [optional] 
 **EntityStatuses** | [**String[]**](String.md)| Entity status | [optional] 
 **PageSize** | **Int32**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **Order** | **String**| The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] 
 **Bookmark** | **String**| Cursor used to fetch the next page of items | [optional] 

### Return type

[**CampaignsList200Response**](CampaignsList200Response.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-CampaignsUpdate"></a>
# **Invoke-CampaignsUpdate**
> CampaignUpdateResponse Invoke-CampaignsUpdate<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-CampaignUpdateRequest] <PSCustomObject[]><br>

Update campaigns

Update multiple ad campaigns based on campaign_ids. <p/> <strong>Note:</strong><p/> - <p>The values for 'lifetime_spend_cap' and 'daily_spend_cap' are microcurrency amounts based on the currency field set in the advertiser's profile. (e.g. USD) <p/> <p>Microcurrency is used to track very small transactions, based on the currency set in the advertiser’s profile.</p> <p>A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser’s profile.</p> <p><strong>Equivalency equations</strong>, using dollars as an example currency:</p> <ul>   <li>$1 = 1,000,000 microdollars</li>   <li>1 microdollar = $0.000001 </li> </ul> <p><strong>To convert between currency and microcurrency</strong>, using dollars as an example currency:</p> <ul>   <li>To convert dollars to microdollars, mutiply dollars by 1,000,000</li>   <li>To convert microdollars to dollars, divide microdollars by 1,000,000</li> </ul>

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account.
$AdCommonTrackingUrls = Initialize-AdCommonTrackingUrls -Impression "MyImpression" -Click "MyClick" -Engagement "MyEngagement" -BuyableButton "MyBuyableButton" -AudienceVerification "MyAudienceVerification"
$CampaignUpdateRequest = Initialize-CampaignUpdateRequest -Id "549755885175" -AdAccountId "549755885175" -Name "ACME Tools" -Status "ACTIVE" -LifetimeSpendCap 1432744744 -DailySpendCap 1432744744 -OrderLineId "549755885175" -TrackingUrls $AdCommonTrackingUrls -StartTime 1580865126 -EndTime 1644023526 -SummaryStatus "RUNNING" -IsFlexibleDailyBudgets $true -DefaultAdGroupBudgetInMicroCurrency 0 -IsAutomatedCampaign $true -IsCampaignBudgetOptimization $true -ObjectiveType "AWARENESS" # CampaignUpdateRequest[] | Array of campaigns.

# Update campaigns
try {
    $Result = Invoke-CampaignsUpdate -AdAccountId $AdAccountId -CampaignUpdateRequest $CampaignUpdateRequest
} catch {
    Write-Host ("Exception occurred when calling Invoke-CampaignsUpdate: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **AdAccountId** | **String**| Unique identifier of an ad account. | 
 **CampaignUpdateRequest** | [**CampaignUpdateRequest[]**](CampaignUpdateRequest.md)| Array of campaigns. | 

### Return type

[**CampaignUpdateResponse**](CampaignUpdateResponse.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

