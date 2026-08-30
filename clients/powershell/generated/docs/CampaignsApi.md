# PSOpenAPITools.PSOpenAPITools\Api.CampaignsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**Invoke-AdPinsAnalytics**](CampaignsApi.md#Invoke-AdPinsAnalytics) | **GET** /ad_accounts/{ad_account_id}/pins/analytics | Get pins analytics
[**Invoke-CampaignTargetingAnalyticsGet**](CampaignsApi.md#Invoke-CampaignTargetingAnalyticsGet) | **GET** /ad_accounts/{ad_account_id}/campaigns/targeting_analytics | Get targeting analytics for campaigns
[**Invoke-CampaignsAnalytics**](CampaignsApi.md#Invoke-CampaignsAnalytics) | **GET** /ad_accounts/{ad_account_id}/campaigns/analytics | Get campaign analytics
[**Invoke-CampaignsCreate**](CampaignsApi.md#Invoke-CampaignsCreate) | **POST** /ad_accounts/{ad_account_id}/campaigns | Create campaigns
[**Invoke-CampaignsGet**](CampaignsApi.md#Invoke-CampaignsGet) | **GET** /ad_accounts/{ad_account_id}/campaigns/{campaign_id} | Get campaign
[**Invoke-CampaignsList**](CampaignsApi.md#Invoke-CampaignsList) | **GET** /ad_accounts/{ad_account_id}/campaigns | List campaigns
[**Invoke-CampaignsUpdate**](CampaignsApi.md#Invoke-CampaignsUpdate) | **PATCH** /ad_accounts/{ad_account_id}/campaigns | Update campaigns
[**Get-CampaignDeliveryEstimates**](CampaignsApi.md#Get-CampaignDeliveryEstimates) | **POST** /ad_accounts/{ad_account_id}/campaigns/delivery_estimates | Get campaign delivery estimates


<a id="Invoke-AdPinsAnalytics"></a>
# **Invoke-AdPinsAnalytics**
> AdPinAnalytics[] Invoke-AdPinsAnalytics<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-CampaignId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-PinIds] <String[]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-StartDate] <System.DateTime><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-EndDate] <System.DateTime><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Columns] <PSCustomObject[]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Granularity] <PSCustomObject><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ClickWindowDays] <System.Nullable[Decimal]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-EngagementWindowDays] <System.Nullable[Decimal]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ViewWindowDays] <System.Nullable[Decimal]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ConversionReportTime] <String><br>

Get pins analytics

Get analytics for the pins given a campaign and pins in the specified `ad_account_id`, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days. Data will not be provided for conversion metrics but will be available for non-conversion metrics.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

# Configure OAuth2 access token for authorization: client_credentials
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$CampaignId = "MyCampaignId" # String | Campaign Id to use to filter the results.
$PinIds = "MyPinIds" # String[] | List of Pin IDs.
$StartDate = (Get-Date) # System.DateTime | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
$EndDate = (Get-Date) # System.DateTime | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
$Columns = "SPEND_IN_MICRO_DOLLAR" # ReportingColumnSync[] | Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.  For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned.
$Granularity = "TOTAL" # Granularity |   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly
$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account.
$ClickWindowDays = "0" # Decimal | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. (optional) (default to 30)
$EngagementWindowDays = "0" # Decimal | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. (optional) (default to 30)
$ViewWindowDays = "0" # Decimal | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day. (optional) (default to 1)
$ConversionReportTime = "TIME_OF_AD_ACTION" # String | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. (optional) (default to "TIME_OF_AD_ACTION")

# Get pins analytics
try {
    $Result = Invoke-AdPinsAnalytics -CampaignId $CampaignId -PinIds $PinIds -StartDate $StartDate -EndDate $EndDate -Columns $Columns -Granularity $Granularity -AdAccountId $AdAccountId -ClickWindowDays $ClickWindowDays -EngagementWindowDays $EngagementWindowDays -ViewWindowDays $ViewWindowDays -ConversionReportTime $ConversionReportTime
} catch {
    Write-Host ("Exception occurred when calling Invoke-AdPinsAnalytics: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **CampaignId** | **String**| Campaign Id to use to filter the results. | 
 **PinIds** | [**String[]**](String.md)| List of Pin IDs. | 
 **StartDate** | **System.DateTime**| Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | 
 **EndDate** | **System.DateTime**| Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | 
 **Columns** | [**ReportingColumnSync[]**](ReportingColumnSync.md)| Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.  For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned. | 
 **Granularity** | [**Granularity**](Granularity.md)|   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly | 
 **AdAccountId** | **String**| Unique identifier of an ad account. | 
 **ClickWindowDays** | **Decimal**| Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30]
 **EngagementWindowDays** | **Decimal**| Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. | [optional] [default to 30]
 **ViewWindowDays** | **Decimal**| Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional] [default to 1]
 **ConversionReportTime** | **String**| The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] [default to &quot;TIME_OF_AD_ACTION&quot;]

### Return type

[**AdPinAnalytics[]**](AdPinAnalytics.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-CampaignTargetingAnalyticsGet"></a>
# **Invoke-CampaignTargetingAnalyticsGet**
> MetricsResponse Invoke-CampaignTargetingAnalyticsGet<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-CampaignIds] <String[]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-StartDate] <System.DateTime><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-EndDate] <System.DateTime><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-TargetingTypes] <PSCustomObject[]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Columns] <PSCustomObject[]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Granularity] <PSCustomObject><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ClickWindowDays] <System.Nullable[Decimal]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-EngagementWindowDays] <System.Nullable[Decimal]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ViewWindowDays] <System.Nullable[Decimal]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ConversionReportTime] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AttributionTypes] <PSCustomObject[]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ReportingTimezone] <PSCustomObject><br>

Get targeting analytics for campaigns

Get targeting analytics for one or more campaigns. For the requested account and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. ""age_bucket"") for applicable values (e.g. ""45-49"").  * The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. * If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. * If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

# Configure OAuth2 access token for authorization: client_credentials
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account.
$CampaignIds = "MyCampaignIds" # String[] | List of Campaign Ids to use to filter the results.
$StartDate = (Get-Date) # System.DateTime | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
$EndDate = (Get-Date) # System.DateTime | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
$TargetingTypes = "KEYWORD" # AdsAnalyticsCampaignTargetingType[] | Targeting type breakdowns for the report. The reporting per targeting type is independent from each other. [""AGE_BUCKET_AND_GENDER""] is in BETA and not yet available to all users.
$Columns = "SPEND_IN_MICRO_DOLLAR" # ReportingColumnSync[] | Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.  For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned.
$Granularity = "TOTAL" # Granularity |   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly
$ClickWindowDays = "0" # Decimal | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. (optional) (default to 30)
$EngagementWindowDays = "0" # Decimal | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. (optional) (default to 30)
$ViewWindowDays = "0" # Decimal | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day. (optional) (default to 1)
$ConversionReportTime = "TIME_OF_AD_ACTION" # String | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. (optional) (default to "TIME_OF_AD_ACTION")
$AttributionTypes = "INDIVIDUAL" # ConversionReportAttributionType[] | List of types of attribution for the conversion report (optional)
$ReportingTimezone = "PINTEREST_TIME_ZONE" # ReportingTimeZone | Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users. (optional)

# Get targeting analytics for campaigns
try {
    $Result = Invoke-CampaignTargetingAnalyticsGet -AdAccountId $AdAccountId -CampaignIds $CampaignIds -StartDate $StartDate -EndDate $EndDate -TargetingTypes $TargetingTypes -Columns $Columns -Granularity $Granularity -ClickWindowDays $ClickWindowDays -EngagementWindowDays $EngagementWindowDays -ViewWindowDays $ViewWindowDays -ConversionReportTime $ConversionReportTime -AttributionTypes $AttributionTypes -ReportingTimezone $ReportingTimezone
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
 **TargetingTypes** | [**AdsAnalyticsCampaignTargetingType[]**](AdsAnalyticsCampaignTargetingType.md)| Targeting type breakdowns for the report. The reporting per targeting type is independent from each other. [&quot;&quot;AGE_BUCKET_AND_GENDER&quot;&quot;] is in BETA and not yet available to all users. | 
 **Columns** | [**ReportingColumnSync[]**](ReportingColumnSync.md)| Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.  For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned. | 
 **Granularity** | [**Granularity**](Granularity.md)|   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly | 
 **ClickWindowDays** | **Decimal**| Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30]
 **EngagementWindowDays** | **Decimal**| Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. | [optional] [default to 30]
 **ViewWindowDays** | **Decimal**| Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional] [default to 1]
 **ConversionReportTime** | **String**| The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] [default to &quot;TIME_OF_AD_ACTION&quot;]
 **AttributionTypes** | [**ConversionReportAttributionType[]**](ConversionReportAttributionType.md)| List of types of attribution for the conversion report | [optional] 
 **ReportingTimezone** | [**ReportingTimeZone**](ReportingTimeZone.md)| Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users. | [optional] 

### Return type

[**MetricsResponse**](MetricsResponse.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-CampaignsAnalytics"></a>
# **Invoke-CampaignsAnalytics**
> CampaignsAnalyticsMetrics[] Invoke-CampaignsAnalytics<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-StartDate] <System.DateTime><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-EndDate] <System.DateTime><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-CampaignIds] <String[]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Columns] <PSCustomObject[]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Granularity] <PSCustomObject><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ClickWindowDays] <System.Nullable[Decimal]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-EngagementWindowDays] <System.Nullable[Decimal]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ViewWindowDays] <System.Nullable[Decimal]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ConversionReportTime] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AggregateReportRows] <System.Nullable[Boolean]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ReportingTimezone] <PSCustomObject><br>

Get campaign analytics

Get analytics for the specified campaigns in the specified `ad_account_id`, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

# Configure OAuth2 access token for authorization: client_credentials
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$StartDate = (Get-Date) # System.DateTime | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
$EndDate = (Get-Date) # System.DateTime | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
$CampaignIds = "MyCampaignIds" # String[] | List of Campaign Ids to use to filter the results.
$Columns = "SPEND_IN_MICRO_DOLLAR" # ReportingColumnSync[] | Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.  For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned.
$Granularity = "TOTAL" # Granularity |   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly
$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account.
$ClickWindowDays = "0" # Decimal | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. (optional) (default to 30)
$EngagementWindowDays = "0" # Decimal | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. (optional) (default to 30)
$ViewWindowDays = "0" # Decimal | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day. (optional) (default to 1)
$ConversionReportTime = "TIME_OF_AD_ACTION" # String | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. (optional) (default to "TIME_OF_AD_ACTION")
$AggregateReportRows = $true # Boolean | Determines if report rows should be aggregated across all requested entities. This feature is currently in BETA and is not available to all users. (optional) (default to $false)
$ReportingTimezone = "PINTEREST_TIME_ZONE" # ReportingTimeZone | Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users. (optional)

# Get campaign analytics
try {
    $Result = Invoke-CampaignsAnalytics -StartDate $StartDate -EndDate $EndDate -CampaignIds $CampaignIds -Columns $Columns -Granularity $Granularity -AdAccountId $AdAccountId -ClickWindowDays $ClickWindowDays -EngagementWindowDays $EngagementWindowDays -ViewWindowDays $ViewWindowDays -ConversionReportTime $ConversionReportTime -AggregateReportRows $AggregateReportRows -ReportingTimezone $ReportingTimezone
} catch {
    Write-Host ("Exception occurred when calling Invoke-CampaignsAnalytics: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **StartDate** | **System.DateTime**| Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | 
 **EndDate** | **System.DateTime**| Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | 
 **CampaignIds** | [**String[]**](String.md)| List of Campaign Ids to use to filter the results. | 
 **Columns** | [**ReportingColumnSync[]**](ReportingColumnSync.md)| Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.  For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned. | 
 **Granularity** | [**Granularity**](Granularity.md)|   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly | 
 **AdAccountId** | **String**| Unique identifier of an ad account. | 
 **ClickWindowDays** | **Decimal**| Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30]
 **EngagementWindowDays** | **Decimal**| Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. | [optional] [default to 30]
 **ViewWindowDays** | **Decimal**| Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional] [default to 1]
 **ConversionReportTime** | **String**| The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] [default to &quot;TIME_OF_AD_ACTION&quot;]
 **AggregateReportRows** | **Boolean**| Determines if report rows should be aggregated across all requested entities. This feature is currently in BETA and is not available to all users. | [optional] [default to $false]
 **ReportingTimezone** | [**ReportingTimeZone**](ReportingTimeZone.md)| Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users. | [optional] 

### Return type

[**CampaignsAnalyticsMetrics[]**](CampaignsAnalyticsMetrics.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-CampaignsCreate"></a>
# **Invoke-CampaignsCreate**
> CampaignBatchWriteResponseModel Invoke-CampaignsCreate<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-CampaignCreateItem] <PSCustomObject[]><br>

Create campaigns

Create multiple new campaigns. Every campaign has its own campaign_id and houses one or more ad groups, which contain one or more ads.  For more, see [Set up your campaign](https://help.pinterest.com/en/business/article/set-up-your-campaign/).  **Note:** - The values for `lifetime_spend_cap` and `daily_spend_cap` are microcurrency amounts based on the currency field set in the advertiser's profile (e.g. USD).  Microcurrency is used to track very small transactions, based on the currency set in the advertiser's profile.  A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser's profile.  **Equivalency equations**, using dollars as an example currency:  - $1 = 1,000,000 microdollars - 1 microdollar = $0.000001  **To convert between currency and microcurrency**, using dollars as an example currency:  - To convert dollars to microdollars, multiply dollars by 1,000,000 - To convert microdollars to dollars, divide microdollars by 1,000,000

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account.
$CampaignBidOptions = Initialize-CampaignBidOptions -AgeBucketMultipliers  -AppTypeMultipliers  -AudienceMultipliers  -FreqBidMultiplierTimeWindow "WEEK" -FrequencyMultipliers  -GenderMultipliers  -PlacementMultipliers 
$TrackingUrls = Initialize-TrackingUrls -AudienceVerification "MyAudienceVerification" -BuyableButton "MyBuyableButton" -Click "MyClick" -Engagement "MyEngagement" -Impression "MyImpression"
$CampaignCreateItem = Initialize-CampaignCreateItem -AdAccountId "549755885175" -AppId "429047995" -AppPlatform "IOS" -BidOptions $CampaignBidOptions -DailySpendCap 1432744744 -DefaultAdGroupBudgetInMicroCurrency 0 -EndTime 1644023526 -IntendedPromotionType "LEGACY" -IsAutomatedCampaign $true -IsCampaignBudgetOptimization $true -IsFlexibleDailyBudgets $true -IsLtvOptimized $true -IsPerformancePlus $true -IsTopOfSearch $true -LifetimeSpendCap 1432744744 -Name "ACME Tools" -ObjectiveType "AWARENESS" -OrderLineId "549755885175" -StartTime 1580865126 -Status "ACTIVE" -TrackingUrls $TrackingUrls # CampaignCreateItem[] | 

# Create campaigns
try {
    $Result = Invoke-CampaignsCreate -AdAccountId $AdAccountId -CampaignCreateItem $CampaignCreateItem
} catch {
    Write-Host ("Exception occurred when calling Invoke-CampaignsCreate: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **AdAccountId** | **String**| Unique identifier of an ad account. | 
 **CampaignCreateItem** | [**CampaignCreateItem[]**](CampaignCreateItem.md)|  | 

### Return type

[**CampaignBatchWriteResponseModel**](CampaignBatchWriteResponseModel.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-CampaignsGet"></a>
# **Invoke-CampaignsGet**
> Campaign Invoke-CampaignsGet<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-CampaignId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>

Get campaign

Get a specific campaign given the campaign ID.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

# Configure OAuth2 access token for authorization: client_credentials
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$CampaignId = "MyCampaignId" # String | Campaign ID, must be associated with the ad account ID provided in the path.
$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account.

# Get campaign
try {
    $Result = Invoke-CampaignsGet -CampaignId $CampaignId -AdAccountId $AdAccountId
} catch {
    Write-Host ("Exception occurred when calling Invoke-CampaignsGet: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **CampaignId** | **String**| Campaign ID, must be associated with the ad account ID provided in the path. | 
 **AdAccountId** | **String**| Unique identifier of an ad account. | 

### Return type

[**Campaign**](Campaign.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-CampaignsList"></a>
# **Invoke-CampaignsList**
> CampaignsList200Response Invoke-CampaignsList<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Bookmark] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-PageSize] <System.Nullable[Int32]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Order] <PSCustomObject><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-CampaignIds] <String[]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-EntityStatuses] <PSCustomObject[]><br>

List campaigns

Get a list of the campaigns in the specified `ad_account_id`, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

# Configure OAuth2 access token for authorization: client_credentials
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account.
$Bookmark = "MyBookmark" # String | Cursor used to fetch the next page of items (optional)
$PageSize = 56 # Int32 | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional) (default to 25)
$Order = "ASCENDING" # PinterestLibPaginationOrder | The order in which to sort the items returned: ""ASCENDING"" or ""DESCENDING"" by ID. Note that higher-value IDs are associated with more-recently added items. (optional)
$CampaignIds = "MyCampaignIds" # String[] | List of Campaign Ids to use to filter the results. (optional)
$EntityStatuses = "ACTIVE" # EntityStatus[] | Entity status (optional)

# List campaigns
try {
    $Result = Invoke-CampaignsList -AdAccountId $AdAccountId -Bookmark $Bookmark -PageSize $PageSize -Order $Order -CampaignIds $CampaignIds -EntityStatuses $EntityStatuses
} catch {
    Write-Host ("Exception occurred when calling Invoke-CampaignsList: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
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
 **CampaignIds** | [**String[]**](String.md)| List of Campaign Ids to use to filter the results. | [optional] 
 **EntityStatuses** | [**EntityStatus[]**](EntityStatus.md)| Entity status | [optional] 

### Return type

[**CampaignsList200Response**](CampaignsList200Response.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-CampaignsUpdate"></a>
# **Invoke-CampaignsUpdate**
> CampaignBatchWriteResponseModel Invoke-CampaignsUpdate<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-CampaignBatchUpdateItem] <PSCustomObject[]><br>

Update campaigns

Update multiple ad campaigns based on campaign_ids.  **Note:** - The values for `lifetime_spend_cap` and `daily_spend_cap` are microcurrency amounts based on the currency field set in the advertiser's profile (e.g. USD).  Microcurrency is used to track very small transactions, based on the currency set in the advertiser's profile.  A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser's profile.  **Equivalency equations**, using dollars as an example currency:  - $1 = 1,000,000 microdollars - 1 microdollar = $0.000001  **To convert between currency and microcurrency**, using dollars as an example currency:  - To convert dollars to microdollars, multiply dollars by 1,000,000 - To convert microdollars to dollars, divide microdollars by 1,000,000

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account.
$CampaignBidOptionsUpdate = Initialize-CampaignBidOptionsUpdate -AgeBucketMultipliers  -AppTypeMultipliers  -AudienceMultipliers  -FreqBidMultiplierTimeWindow "WEEK" -FrequencyMultipliers  -GenderMultipliers  -PlacementMultipliers  -UpdateMask "AUDIENCE"
$PerformancePlusCampaignSettings = Initialize-PerformancePlusCampaignSettings -BoostProspectingAdGroupBid $false -PinnerListExclusions "MyPinnerListExclusions"
$TrackingUrls = Initialize-TrackingUrls -AudienceVerification "MyAudienceVerification" -BuyableButton "MyBuyableButton" -Click "MyClick" -Engagement "MyEngagement" -Impression "MyImpression"
$CampaignBatchUpdateItem = Initialize-CampaignBatchUpdateItem -AdAccountId "549755885175" -AppId "429047995" -AppPlatform "IOS" -BidOptions $CampaignBidOptionsUpdate -DailySpendCap 1432744744 -DefaultAdGroupBudgetInMicroCurrency 0 -EndTime 1644023526 -Id "549755885175" -IntendedPromotionType "LEGACY" -IsAutomatedCampaign $true -IsCampaignBudgetOptimization $true -IsFlexibleDailyBudgets $true -IsLtvOptimized $true -IsPerformancePlus $true -IsTopOfSearch $true -LifetimeSpendCap 1432744744 -Name "ACME Tools" -ObjectiveType "AWARENESS" -OrderLineId "549755885175" -PerformancePlusCampaignSettings $PerformancePlusCampaignSettings -StartTime 1580865126 -Status "ACTIVE" -TrackingUrls $TrackingUrls # CampaignBatchUpdateItem[] | 

# Update campaigns
try {
    $Result = Invoke-CampaignsUpdate -AdAccountId $AdAccountId -CampaignBatchUpdateItem $CampaignBatchUpdateItem
} catch {
    Write-Host ("Exception occurred when calling Invoke-CampaignsUpdate: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **AdAccountId** | **String**| Unique identifier of an ad account. | 
 **CampaignBatchUpdateItem** | [**CampaignBatchUpdateItem[]**](CampaignBatchUpdateItem.md)|  | 

### Return type

[**CampaignBatchWriteResponseModel**](CampaignBatchWriteResponseModel.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Get-CampaignDeliveryEstimates"></a>
# **Get-CampaignDeliveryEstimates**
> CampaignDeliveryEstimatesResponse Get-CampaignDeliveryEstimates<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-CampaignDeliveryEstimatesCampaign] <PSCustomObject[]><br>

Get campaign delivery estimates

Get delivery estimates for an ads campaign  **This endpoint is currently in beta and is not available to all apps [Learn more](/docs/new/about-beta-access/).**

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account.
$AdGroupDeliveryEstimatesKeywordsItems = Initialize-AdGroupDeliveryEstimatesKeywordsItems -MatchType "BROAD" -Value "MyValue"

$AttributionWindows = Initialize-AttributionWindows -ClickWindowDays 0 -EngagementWindowDays 0 -ViewWindowDays 0
$ConversionTagV3GoalMetadata = Initialize-ConversionTagV3GoalMetadata -AttributionWindows $AttributionWindows -ConversionEvent "PAGE_VISIT" -ConversionTagId "MyConversionTagId" -CpaGoalValueInMicroCurrency "MyCpaGoalValueInMicroCurrency" -IsRoasOptimized $false -ReportingEvent "MyReportingEvent"

$FrequencyGoalMetadata = Initialize-FrequencyGoalMetadata -Frequency 0 -Timerange "THIRTY_DAY"
$ScrollupGoalMetadata = Initialize-ScrollupGoalMetadata -ScrollupGoalValueInMicroCurrency "MyScrollupGoalValueInMicroCurrency"
$OptimizationGoalMetadata = Initialize-OptimizationGoalMetadata -ConversionTagV3GoalMetadata $ConversionTagV3GoalMetadata -FrequencyGoalMetadata $FrequencyGoalMetadata -ScrollupGoalMetadata $ScrollupGoalMetadata

$TargetingSpecShoppingRetargeting = Initialize-TargetingSpecShoppingRetargeting -ExclusionWindow 14 -LookbackWindow 30 -TagTypes 0
$TargetingSpecOptimal = Initialize-TargetingSpecOptimal -AGEBUCKET "18-24" -APPTYPE "android_mobile" -AUDIENCEEXCLUDE "MyAUDIENCEEXCLUDE" -AUDIENCEINCLUDE "MyAUDIENCEINCLUDE" -GENDER "unknown" -GEO "MyGEO" -GEOEXCLUDE "MyGEOEXCLUDE" -INTEREST "MyINTEREST" -LOCALE "MyLOCALE" -LOCATION "MyLOCATION" -LOCATIONEXCLUDE "MyLOCATIONEXCLUDE" -MAXIMUMAGE "MyMAXIMUMAGE" -MINIMUMAGE "MyMINIMUMAGE" -SHOPPINGRETARGETING $TargetingSpecShoppingRetargeting -TARGETINGSTRATEGY "CHOOSE_YOUR_OWN"

$AdGroupDeliveryEstimates = Initialize-AdGroupDeliveryEstimates -AutoTargetingEnabled $false -CreativeTypes "REGULAR" -Keywords $AdGroupDeliveryEstimatesKeywordsItems -MonthlyFrequencyCap 0 -OptimizationGoalMetadata $OptimizationGoalMetadata -OptimizationType "CLICKTHROUGH" -PlacementGroup "ALL" -ProductGroupIds "MyProductGroupIds" -TargetingSpec $TargetingSpecOptimal

$CampaignDeliveryEstimatesCampaign = Initialize-CampaignDeliveryEstimatesCampaign -AdGroups $AdGroupDeliveryEstimates -BudgetDurationType "FIXED_DAILY" -DailySpendCap 50000000 -EndDate "MyEndDate" -LifetimeSpendCap 500000000 -ObjectiveType "AWARENESS" -StartDate "MyStartDate" # CampaignDeliveryEstimatesCampaign[] | 

# Get campaign delivery estimates
try {
    $Result = Get-CampaignDeliveryEstimates -AdAccountId $AdAccountId -CampaignDeliveryEstimatesCampaign $CampaignDeliveryEstimatesCampaign
} catch {
    Write-Host ("Exception occurred when calling Get-CampaignDeliveryEstimates: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **AdAccountId** | **String**| Unique identifier of an ad account. | 
 **CampaignDeliveryEstimatesCampaign** | [**CampaignDeliveryEstimatesCampaign[]**](CampaignDeliveryEstimatesCampaign.md)|  | 

### Return type

[**CampaignDeliveryEstimatesResponse**](CampaignDeliveryEstimatesResponse.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

