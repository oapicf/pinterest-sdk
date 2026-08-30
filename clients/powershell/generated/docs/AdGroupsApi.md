# PSOpenAPITools.PSOpenAPITools\Api.AdGroupsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**Invoke-AdGroupsBidFloorGet**](AdGroupsApi.md#Invoke-AdGroupsBidFloorGet) | **POST** /ad_accounts/{ad_account_id}/bid_floor | Get bid floors
[**Invoke-AdGroupsDynamicTitlesDownloadCsv**](AdGroupsApi.md#Invoke-AdGroupsDynamicTitlesDownloadCsv) | **GET** /ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles/csv | Get dynamic titles CSV download URL
[**Invoke-AdGroupsDynamicTitlesGetStatus**](AdGroupsApi.md#Invoke-AdGroupsDynamicTitlesGetStatus) | **GET** /ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles/status | Get dynamic titles status
[**Invoke-AdGroupsDynamicTitlesGetUploadUrl**](AdGroupsApi.md#Invoke-AdGroupsDynamicTitlesGetUploadUrl) | **GET** /ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles/uploads | Get dynamic titles upload URL
[**Invoke-AdGroupsDynamicTitlesProcessCsv**](AdGroupsApi.md#Invoke-AdGroupsDynamicTitlesProcessCsv) | **POST** /ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles | Process dynamic titles CSV
[**Invoke-AdGroupsTargetingAnalyticsGet**](AdGroupsApi.md#Invoke-AdGroupsTargetingAnalyticsGet) | **GET** /ad_accounts/{ad_account_id}/ad_groups/targeting_analytics | Get targeting analytics for ad groups
[**Invoke-AdGroupsAnalytics**](AdGroupsApi.md#Invoke-AdGroupsAnalytics) | **GET** /ad_accounts/{ad_account_id}/ad_groups/analytics | Get ad group analytics
[**Invoke-AdGroupsAudienceSizing**](AdGroupsApi.md#Invoke-AdGroupsAudienceSizing) | **POST** /ad_accounts/{ad_account_id}/ad_groups/audience_sizing | Get audience sizing
[**Invoke-AdGroupsCreate**](AdGroupsApi.md#Invoke-AdGroupsCreate) | **POST** /ad_accounts/{ad_account_id}/ad_groups | Create ad groups
[**Invoke-AdGroupsGet**](AdGroupsApi.md#Invoke-AdGroupsGet) | **GET** /ad_accounts/{ad_account_id}/ad_groups/{ad_group_id} | Get ad group
[**Invoke-AdGroupsList**](AdGroupsApi.md#Invoke-AdGroupsList) | **GET** /ad_accounts/{ad_account_id}/ad_groups | List ad groups
[**Invoke-AdGroupsUpdate**](AdGroupsApi.md#Invoke-AdGroupsUpdate) | **PATCH** /ad_accounts/{ad_account_id}/ad_groups | Update ad groups
[**Get-AdGroupsByPromotionIdsList**](AdGroupsApi.md#Get-AdGroupsByPromotionIdsList) | **GET** /ad_accounts/{ad_account_id}/promotion_applied_entities | List of ad groups using promotions IDs.


<a id="Invoke-AdGroupsBidFloorGet"></a>
# **Invoke-AdGroupsBidFloorGet**
> BidFloor Invoke-AdGroupsBidFloorGet<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-BidFloorCreate] <PSCustomObject><br>

Get bid floors

List bid floors for your campaign configuration. Bid floors are given in microcurrency values based on the currency in the bid floor specification.  Microcurrency is used to track very small transactions, based on the currency set in the advertiser's profile.  A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser's profile.  **Equivalency equations**, using dollars as an example currency:  * $1 = 1,000,000 microdollars * 1 microdollar = $0.000001  **To convert between currency and microcurrency**, using dollars as an example currency:  * To convert dollars to microdollars, mutiply dollars by 1,000,000 * To convert microdollars to dollars, divide microdollars by 1,000,000  For more on bid floors see [Set your bid](https://help.pinterest.com/en/business/article/set-your-bid).

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

# Configure OAuth2 access token for authorization: client_credentials
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account.
$AttributionWindows = Initialize-AttributionWindows -ClickWindowDays 0 -EngagementWindowDays 0 -ViewWindowDays 0
$ConversionTagV3GoalMetadata = Initialize-ConversionTagV3GoalMetadata -AttributionWindows $AttributionWindows -ConversionEvent "PAGE_VISIT" -ConversionTagId "MyConversionTagId" -CpaGoalValueInMicroCurrency "MyCpaGoalValueInMicroCurrency" -IsRoasOptimized $false -ReportingEvent "MyReportingEvent"

$FrequencyGoalMetadata = Initialize-FrequencyGoalMetadata -Frequency 0 -Timerange "THIRTY_DAY"
$ScrollupGoalMetadata = Initialize-ScrollupGoalMetadata -ScrollupGoalValueInMicroCurrency "MyScrollupGoalValueInMicroCurrency"
$OptimizationGoalMetadata = Initialize-OptimizationGoalMetadata -ConversionTagV3GoalMetadata $ConversionTagV3GoalMetadata -FrequencyGoalMetadata $FrequencyGoalMetadata -ScrollupGoalMetadata $ScrollupGoalMetadata

$BidFloorSpec = Initialize-BidFloorSpec -BillableEvent "CLICKTHROUGH" -Countries "AD" -CreativeType "REGULAR" -Currency "UNK" -ObjectiveType "AWARENESS" -OptimizationGoalMetadata $OptimizationGoalMetadata

$TargetingSpecShoppingRetargeting = Initialize-TargetingSpecShoppingRetargeting -ExclusionWindow 14 -LookbackWindow 30 -TagTypes 0
$TargetingSpecOptimal = Initialize-TargetingSpecOptimal -AGEBUCKET "18-24" -APPTYPE "android_mobile" -AUDIENCEEXCLUDE "MyAUDIENCEEXCLUDE" -AUDIENCEINCLUDE "MyAUDIENCEINCLUDE" -GENDER "unknown" -GEO "MyGEO" -GEOEXCLUDE "MyGEOEXCLUDE" -INTEREST "MyINTEREST" -LOCALE "MyLOCALE" -LOCATION "MyLOCATION" -LOCATIONEXCLUDE "MyLOCATIONEXCLUDE" -MAXIMUMAGE "MyMAXIMUMAGE" -MINIMUMAGE "MyMINIMUMAGE" -SHOPPINGRETARGETING $TargetingSpecShoppingRetargeting -TARGETINGSTRATEGY "CHOOSE_YOUR_OWN"

$BidFloorCreate = Initialize-BidFloorCreate -BidFloorSpecs $BidFloorSpec -TargetingSpec $TargetingSpecOptimal # BidFloorCreate | 

# Get bid floors
try {
    $Result = Invoke-AdGroupsBidFloorGet -AdAccountId $AdAccountId -BidFloorCreate $BidFloorCreate
} catch {
    Write-Host ("Exception occurred when calling Invoke-AdGroupsBidFloorGet: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **AdAccountId** | **String**| Unique identifier of an ad account. | 
 **BidFloorCreate** | [**BidFloorCreate**](BidFloorCreate.md)|  | 

### Return type

[**BidFloor**](BidFloor.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-AdGroupsDynamicTitlesDownloadCsv"></a>
# **Invoke-AdGroupsDynamicTitlesDownloadCsv**
> DynamicTitlesDownloadCSV Invoke-AdGroupsDynamicTitlesDownloadCsv<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdGroupId] <String><br>

Get dynamic titles CSV download URL

Get a presigned S3 download URL for the dynamic titles review CSV. Returns 400 if titles have not been generated yet.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account.
$AdGroupId = "MyAdGroupId" # String | Ad group ID.

# Get dynamic titles CSV download URL
try {
    $Result = Invoke-AdGroupsDynamicTitlesDownloadCsv -AdAccountId $AdAccountId -AdGroupId $AdGroupId
} catch {
    Write-Host ("Exception occurred when calling Invoke-AdGroupsDynamicTitlesDownloadCsv: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **AdAccountId** | **String**| Unique identifier of an ad account. | 
 **AdGroupId** | **String**| Ad group ID. | 

### Return type

[**DynamicTitlesDownloadCSV**](DynamicTitlesDownloadCSV.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-AdGroupsDynamicTitlesGetStatus"></a>
# **Invoke-AdGroupsDynamicTitlesGetStatus**
> DynamicTitlesGetStatus Invoke-AdGroupsDynamicTitlesGetStatus<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdGroupId] <String><br>

Get dynamic titles status

Get dynamic titles generation status for an ad group, including whether titles are ready for review and counts of generated and reviewed titles.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account.
$AdGroupId = "MyAdGroupId" # String | Ad group ID.

# Get dynamic titles status
try {
    $Result = Invoke-AdGroupsDynamicTitlesGetStatus -AdAccountId $AdAccountId -AdGroupId $AdGroupId
} catch {
    Write-Host ("Exception occurred when calling Invoke-AdGroupsDynamicTitlesGetStatus: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **AdAccountId** | **String**| Unique identifier of an ad account. | 
 **AdGroupId** | **String**| Ad group ID. | 

### Return type

[**DynamicTitlesGetStatus**](DynamicTitlesGetStatus.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-AdGroupsDynamicTitlesGetUploadUrl"></a>
# **Invoke-AdGroupsDynamicTitlesGetUploadUrl**
> DynamicTitlesUploadURL Invoke-AdGroupsDynamicTitlesGetUploadUrl<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdGroupId] <String><br>

Get dynamic titles upload URL

Get a presigned S3 upload URL for the dynamic titles review CSV and a request_id for submission.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account.
$AdGroupId = "MyAdGroupId" # String | Ad group ID.

# Get dynamic titles upload URL
try {
    $Result = Invoke-AdGroupsDynamicTitlesGetUploadUrl -AdAccountId $AdAccountId -AdGroupId $AdGroupId
} catch {
    Write-Host ("Exception occurred when calling Invoke-AdGroupsDynamicTitlesGetUploadUrl: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **AdAccountId** | **String**| Unique identifier of an ad account. | 
 **AdGroupId** | **String**| Ad group ID. | 

### Return type

[**DynamicTitlesUploadURL**](DynamicTitlesUploadURL.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-AdGroupsDynamicTitlesProcessCsv"></a>
# **Invoke-AdGroupsDynamicTitlesProcessCsv**
> DynamicTitlesProcessCSV Invoke-AdGroupsDynamicTitlesProcessCsv<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdGroupId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-DynamicTitlesProcessCSVCreate] <PSCustomObject><br>

Process dynamic titles CSV

Validate and process the uploaded dynamic titles review CSV. Returns validation errors if the CSV is invalid.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account.
$AdGroupId = "MyAdGroupId" # String | Ad group ID.
$DynamicTitlesProcessCSVCreate = Initialize-DynamicTitlesProcessCSVCreate -RequestId "MyRequestId" # DynamicTitlesProcessCSVCreate | 

# Process dynamic titles CSV
try {
    $Result = Invoke-AdGroupsDynamicTitlesProcessCsv -AdAccountId $AdAccountId -AdGroupId $AdGroupId -DynamicTitlesProcessCSVCreate $DynamicTitlesProcessCSVCreate
} catch {
    Write-Host ("Exception occurred when calling Invoke-AdGroupsDynamicTitlesProcessCsv: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **AdAccountId** | **String**| Unique identifier of an ad account. | 
 **AdGroupId** | **String**| Ad group ID. | 
 **DynamicTitlesProcessCSVCreate** | [**DynamicTitlesProcessCSVCreate**](DynamicTitlesProcessCSVCreate.md)|  | 

### Return type

[**DynamicTitlesProcessCSV**](DynamicTitlesProcessCSV.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-AdGroupsTargetingAnalyticsGet"></a>
# **Invoke-AdGroupsTargetingAnalyticsGet**
> MetricsResponse Invoke-AdGroupsTargetingAnalyticsGet<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdGroupIds] <String[]><br>
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
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-SortColumns] <String[]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-SortAscending] <System.Nullable[Boolean]><br>

Get targeting analytics for ad groups

Get targeting analytics for one or more ad groups. For the requested ad group(s) and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. ""age_bucket"") for applicable values (e.g. ""45-49"").  - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

# Configure OAuth2 access token for authorization: client_credentials
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account.
$AdGroupIds = "MyAdGroupIds" # String[] | List of Ad group Ids to use to filter the results.
$StartDate = (Get-Date) # System.DateTime | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
$EndDate = (Get-Date) # System.DateTime | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
$TargetingTypes = "KEYWORD" # AdsAnalyticsAdGroupTargetingType[] | Targeting type breakdowns for the report. The reporting per targeting type is independent from each other. [""AGE_BUCKET_AND_GENDER"", ""CREATIVE_ENHANCEMENTS""] are in BETA and not yet available to all users.
$Columns = "SPEND_IN_MICRO_DOLLAR" # ReportingColumnSync[] | Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.  For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned.
$Granularity = "TOTAL" # Granularity |   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly
$ClickWindowDays = "0" # Decimal | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. (optional) (default to 30)
$EngagementWindowDays = "0" # Decimal | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. (optional) (default to 30)
$ViewWindowDays = "0" # Decimal | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day. (optional) (default to 1)
$ConversionReportTime = "TIME_OF_AD_ACTION" # String | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. (optional) (default to "TIME_OF_AD_ACTION")
$AttributionTypes = "INDIVIDUAL" # ConversionReportAttributionType[] | List of types of attribution for the conversion report (optional)
$ReportingTimezone = "PINTEREST_TIME_ZONE" # ReportingTimeZone | Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users. (optional)
$SortColumns = "MySortColumns" # String[] | Sort Columns. (optional)
$SortAscending = $true # Boolean | Sort ascending. (optional)

# Get targeting analytics for ad groups
try {
    $Result = Invoke-AdGroupsTargetingAnalyticsGet -AdAccountId $AdAccountId -AdGroupIds $AdGroupIds -StartDate $StartDate -EndDate $EndDate -TargetingTypes $TargetingTypes -Columns $Columns -Granularity $Granularity -ClickWindowDays $ClickWindowDays -EngagementWindowDays $EngagementWindowDays -ViewWindowDays $ViewWindowDays -ConversionReportTime $ConversionReportTime -AttributionTypes $AttributionTypes -ReportingTimezone $ReportingTimezone -SortColumns $SortColumns -SortAscending $SortAscending
} catch {
    Write-Host ("Exception occurred when calling Invoke-AdGroupsTargetingAnalyticsGet: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **AdAccountId** | **String**| Unique identifier of an ad account. | 
 **AdGroupIds** | [**String[]**](String.md)| List of Ad group Ids to use to filter the results. | 
 **StartDate** | **System.DateTime**| Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | 
 **EndDate** | **System.DateTime**| Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | 
 **TargetingTypes** | [**AdsAnalyticsAdGroupTargetingType[]**](AdsAnalyticsAdGroupTargetingType.md)| Targeting type breakdowns for the report. The reporting per targeting type is independent from each other. [&quot;&quot;AGE_BUCKET_AND_GENDER&quot;&quot;, &quot;&quot;CREATIVE_ENHANCEMENTS&quot;&quot;] are in BETA and not yet available to all users. | 
 **Columns** | [**ReportingColumnSync[]**](ReportingColumnSync.md)| Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.  For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned. | 
 **Granularity** | [**Granularity**](Granularity.md)|   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly | 
 **ClickWindowDays** | **Decimal**| Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30]
 **EngagementWindowDays** | **Decimal**| Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. | [optional] [default to 30]
 **ViewWindowDays** | **Decimal**| Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional] [default to 1]
 **ConversionReportTime** | **String**| The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] [default to &quot;TIME_OF_AD_ACTION&quot;]
 **AttributionTypes** | [**ConversionReportAttributionType[]**](ConversionReportAttributionType.md)| List of types of attribution for the conversion report | [optional] 
 **ReportingTimezone** | [**ReportingTimeZone**](ReportingTimeZone.md)| Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users. | [optional] 
 **SortColumns** | [**String[]**](String.md)| Sort Columns. | [optional] 
 **SortAscending** | **Boolean**| Sort ascending. | [optional] 

### Return type

[**MetricsResponse**](MetricsResponse.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-AdGroupsAnalytics"></a>
# **Invoke-AdGroupsAnalytics**
> AdGroupsAnalyticsMetrics[] Invoke-AdGroupsAnalytics<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-StartDate] <System.DateTime><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-EndDate] <System.DateTime><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdGroupIds] <String[]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Columns] <PSCustomObject[]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Granularity] <PSCustomObject><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ClickWindowDays] <System.Nullable[Decimal]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-EngagementWindowDays] <System.Nullable[Decimal]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ViewWindowDays] <System.Nullable[Decimal]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ConversionReportTime] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AggregateReportRows] <System.Nullable[Boolean]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ReportingTimezone] <PSCustomObject><br>

Get ad group analytics

Get analytics for the specified ad groups in the specified `ad_account_id`, filtered by the specified options.  - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.

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
$AdGroupIds = "MyAdGroupIds" # String[] | List of Ad group Ids to use to filter the results.
$Columns = "SPEND_IN_MICRO_DOLLAR" # ReportingColumnSync[] | Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.  For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned.
$Granularity = "TOTAL" # Granularity |   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly
$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account.
$ClickWindowDays = "0" # Decimal | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. (optional) (default to 30)
$EngagementWindowDays = "0" # Decimal | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. (optional) (default to 30)
$ViewWindowDays = "0" # Decimal | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day. (optional) (default to 1)
$ConversionReportTime = "TIME_OF_AD_ACTION" # String | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. (optional) (default to "TIME_OF_AD_ACTION")
$AggregateReportRows = $true # Boolean | Determines if report rows should be aggregated across all requested entities. This feature is currently in BETA and is not available to all users. (optional) (default to $false)
$ReportingTimezone = "PINTEREST_TIME_ZONE" # ReportingTimeZone | Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users. (optional)

# Get ad group analytics
try {
    $Result = Invoke-AdGroupsAnalytics -StartDate $StartDate -EndDate $EndDate -AdGroupIds $AdGroupIds -Columns $Columns -Granularity $Granularity -AdAccountId $AdAccountId -ClickWindowDays $ClickWindowDays -EngagementWindowDays $EngagementWindowDays -ViewWindowDays $ViewWindowDays -ConversionReportTime $ConversionReportTime -AggregateReportRows $AggregateReportRows -ReportingTimezone $ReportingTimezone
} catch {
    Write-Host ("Exception occurred when calling Invoke-AdGroupsAnalytics: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **StartDate** | **System.DateTime**| Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | 
 **EndDate** | **System.DateTime**| Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | 
 **AdGroupIds** | [**String[]**](String.md)| List of Ad group Ids to use to filter the results. | 
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

[**AdGroupsAnalyticsMetrics[]**](AdGroupsAnalyticsMetrics.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-AdGroupsAudienceSizing"></a>
# **Invoke-AdGroupsAudienceSizing**
> AdGroupAudienceSizing Invoke-AdGroupsAudienceSizing<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdGroupAudienceSizingCreate] <PSCustomObject><br>

Get audience sizing

Get potential audience size for an ad group with given targeting criteria. Potential audience size estimates the number of people you may be able to reach per month with your campaign. It is based on historical advertising data and the targeting criteria you select. It does not guarantee results or take into account factors such as bid, budget, schedule, seasonality or product experiments.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

# Configure OAuth2 access token for authorization: client_credentials
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account.
$AdGroupAudienceSizingKeyword = Initialize-AdGroupAudienceSizingKeyword -MatchType "BROAD" -Value "MyValue"

$TargetingSpecShoppingRetargeting = Initialize-TargetingSpecShoppingRetargeting -ExclusionWindow 14 -LookbackWindow 30 -TagTypes 0
$TargetingSpecOptimal = Initialize-TargetingSpecOptimal -AGEBUCKET "18-24" -APPTYPE "android_mobile" -AUDIENCEEXCLUDE "MyAUDIENCEEXCLUDE" -AUDIENCEINCLUDE "MyAUDIENCEINCLUDE" -GENDER "unknown" -GEO "MyGEO" -GEOEXCLUDE "MyGEOEXCLUDE" -INTEREST "MyINTEREST" -LOCALE "MyLOCALE" -LOCATION "MyLOCATION" -LOCATIONEXCLUDE "MyLOCATIONEXCLUDE" -MAXIMUMAGE "MyMAXIMUMAGE" -MINIMUMAGE "MyMINIMUMAGE" -SHOPPINGRETARGETING $TargetingSpecShoppingRetargeting -TARGETINGSTRATEGY "CHOOSE_YOUR_OWN"

$AdGroupAudienceSizingCreate = Initialize-AdGroupAudienceSizingCreate -AutoTargetingEnabled $false -CreativeTypes "REGULAR" -Keywords $AdGroupAudienceSizingKeyword -PlacementGroup "ALL" -ProductGroupIds "MyProductGroupIds" -TargetingSpec $TargetingSpecOptimal # AdGroupAudienceSizingCreate | 

# Get audience sizing
try {
    $Result = Invoke-AdGroupsAudienceSizing -AdAccountId $AdAccountId -AdGroupAudienceSizingCreate $AdGroupAudienceSizingCreate
} catch {
    Write-Host ("Exception occurred when calling Invoke-AdGroupsAudienceSizing: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **AdAccountId** | **String**| Unique identifier of an ad account. | 
 **AdGroupAudienceSizingCreate** | [**AdGroupAudienceSizingCreate**](AdGroupAudienceSizingCreate.md)|  | 

### Return type

[**AdGroupAudienceSizing**](AdGroupAudienceSizing.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-AdGroupsCreate"></a>
# **Invoke-AdGroupsCreate**
> AdGroupsCreate200Response Invoke-AdGroupsCreate<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdGroupCreateCreate] <PSCustomObject[]><br>

Create ad groups

Create multiple new ad groups. All ads in a given ad group will have the same budget, bid, run dates, targeting, and placement (search, browse, other).  For more information, [click here](https://help.pinterest.com/en/business/article/campaign-structure).  **Notes:** - `bid_in_micro_currency` and `budget_in_micro_currency` should be expressed in microcurrency amounts based on the currency field set in the advertiser's profile.  Microcurrency is used to track very small transactions, based on the currency set in the advertiser's profile. A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser's profile.  **Equivalency equations**, using dollars as an example currency: - $1 = 1,000,000 microdollars - 1 microdollar = $0.000001  **To convert between currency and microcurrency**, using dollars as an example currency: - To convert dollars to microdollars, multiply dollars by 1,000,000 - To convert microdollars to dollars, divide microdollars by 1,000,000  - Ad groups belong to ad campaigns. Some types of campaigns (e.g. budget optimization) have limits on the number of ad groups they can hold. If you exceed those limits, you will get an error message. - Certain organizations with [closed beta](/docs/getting-started/using-beta-and-restricted-features/) access can set `start_time` and `end_time` at the ad group level for campaigns with Campaign Budget Optimization (CBO) objectives: `TRAFFIC`, `AWARENESS`, `WEB_CONVERSIONS`, and `CATALOG_SALES`. All other organizations can set these scheduling parameters for non-CBO campaigns only. - If the parent ad campaign has start and end times set, ad group start and end times must occur within the parent campaign schedule.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account.
$AdgroupTrackingFeatures = Initialize-AdgroupTrackingFeatures -Enabled "TRENDS"

$AttributionWindows = Initialize-AttributionWindows -ClickWindowDays 0 -EngagementWindowDays 0 -ViewWindowDays 0
$ConversionTagV3GoalMetadata = Initialize-ConversionTagV3GoalMetadata -AttributionWindows $AttributionWindows -ConversionEvent "PAGE_VISIT" -ConversionTagId "MyConversionTagId" -CpaGoalValueInMicroCurrency "MyCpaGoalValueInMicroCurrency" -IsRoasOptimized $false -ReportingEvent "MyReportingEvent"

$FrequencyGoalMetadata = Initialize-FrequencyGoalMetadata -Frequency 0 -Timerange "THIRTY_DAY"
$ScrollupGoalMetadata = Initialize-ScrollupGoalMetadata -ScrollupGoalValueInMicroCurrency "MyScrollupGoalValueInMicroCurrency"
$NullableOptimizationGoalMetadata = Initialize-NullableOptimizationGoalMetadata -ConversionTagV3GoalMetadata $ConversionTagV3GoalMetadata -FrequencyGoalMetadata $FrequencyGoalMetadata -ScrollupGoalMetadata $ScrollupGoalMetadata

$PerformancePlusCampaignSettings = Initialize-PerformancePlusCampaignSettings -BoostProspectingAdGroupBid $false -PinnerListExclusions "MyPinnerListExclusions"

$TargetingSpecShoppingRetargeting = Initialize-TargetingSpecShoppingRetargeting -ExclusionWindow 14 -LookbackWindow 30 -TagTypes 0
$TargetingSpecOptimal = Initialize-TargetingSpecOptimal -AGEBUCKET "18-24" -APPTYPE "android_mobile" -AUDIENCEEXCLUDE "MyAUDIENCEEXCLUDE" -AUDIENCEINCLUDE "MyAUDIENCEINCLUDE" -GENDER "unknown" -GEO "MyGEO" -GEOEXCLUDE "MyGEOEXCLUDE" -INTEREST "MyINTEREST" -LOCALE "MyLOCALE" -LOCATION "MyLOCATION" -LOCATIONEXCLUDE "MyLOCATIONEXCLUDE" -MAXIMUMAGE "MyMAXIMUMAGE" -MINIMUMAGE "MyMINIMUMAGE" -SHOPPINGRETARGETING $TargetingSpecShoppingRetargeting -TARGETINGSTRATEGY "CHOOSE_YOUR_OWN"

$AdGroupTrackingURLs = Initialize-AdGroupTrackingURLs -AudienceVerification "MyAudienceVerification" -BuyableButton "MyBuyableButton" -Click "MyClick" -Engagement "MyEngagement" -Impression "MyImpression"
$AdGroupCreateCreate = Initialize-AdGroupCreateCreate -AutoTargetingEnabled $false -BidInMicroCurrency 0 -BidMultiplier 0 -BidStrategyType "AUTOMATIC_BID" -BillableEvent "CLICKTHROUGH" -BudgetInMicroCurrency 0 -BudgetType "DAILY" -CampaignId "MyCampaignId" -CustomerSegmentId "MyCustomerSegmentId" -EndTime 0 -ExtFeatures $AdgroupTrackingFeatures -FeedProfileId "MyFeedProfileId" -IsCreativeOptimization $false -IsLocalInventory $false -LifetimeFrequencyCap 0 -LocalInventoryRadiusInMiles 0 -Name "MyName" -OptimizationGoalMetadata $NullableOptimizationGoalMetadata -PacingDeliveryType "STANDARD" -PerformancePlusCampaignSettings $PerformancePlusCampaignSettings -PlacementGroup "ALL" -PlacementTrafficType "ALL" -PromotionApplicationLevel "NONE" -PromotionId "MyPromotionId" -PromotionIds "MyPromotionIds" -StartTime 0 -Status "ACTIVE" -TargetingSpec $TargetingSpecOptimal -TargetingTemplateIds "MyTargetingTemplateIds" -TrackingUrls $AdGroupTrackingURLs # AdGroupCreateCreate[] | 

# Create ad groups
try {
    $Result = Invoke-AdGroupsCreate -AdAccountId $AdAccountId -AdGroupCreateCreate $AdGroupCreateCreate
} catch {
    Write-Host ("Exception occurred when calling Invoke-AdGroupsCreate: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **AdAccountId** | **String**| Unique identifier of an ad account. | 
 **AdGroupCreateCreate** | [**AdGroupCreateCreate[]**](AdGroupCreateCreate.md)|  | 

### Return type

[**AdGroupsCreate200Response**](AdGroupsCreate200Response.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-AdGroupsGet"></a>
# **Invoke-AdGroupsGet**
> AdGroup Invoke-AdGroupsGet<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdGroupId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>

Get ad group

Get a specific ad group given the ad group ID.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

# Configure OAuth2 access token for authorization: client_credentials
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$AdGroupId = "MyAdGroupId" # String | Ad group ID.
$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account.

# Get ad group
try {
    $Result = Invoke-AdGroupsGet -AdGroupId $AdGroupId -AdAccountId $AdAccountId
} catch {
    Write-Host ("Exception occurred when calling Invoke-AdGroupsGet: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **AdGroupId** | **String**| Ad group ID. | 
 **AdAccountId** | **String**| Unique identifier of an ad account. | 

### Return type

[**AdGroup**](AdGroup.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-AdGroupsList"></a>
# **Invoke-AdGroupsList**
> AdGroupsList200Response Invoke-AdGroupsList<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Bookmark] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-PageSize] <System.Nullable[Int32]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Order] <PSCustomObject><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-CampaignIds] <String[]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdGroupIds] <String[]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-EntityStatuses] <PSCustomObject[]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-TranslateInterestsToNames] <System.Nullable[Boolean]><br>

List ad groups

List ad groups based on provided campaign IDs or ad group IDs.(campaign_ids or ad_group_ids). **Note:** Provide only campaign_id or ad_group_id. Do not provide both.

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
$AdGroupIds = "MyAdGroupIds" # String[] | List of Ad group Ids to retrieve keywords from. This feature is currently in BETA and is not available to all users. (optional)
$EntityStatuses = "ACTIVE" # EntityStatus[] | Entity status (optional)
$TranslateInterestsToNames = $true # Boolean | Return interests as text names (if value is true) rather than topic IDs. (optional) (default to $false)

# List ad groups
try {
    $Result = Invoke-AdGroupsList -AdAccountId $AdAccountId -Bookmark $Bookmark -PageSize $PageSize -Order $Order -CampaignIds $CampaignIds -AdGroupIds $AdGroupIds -EntityStatuses $EntityStatuses -TranslateInterestsToNames $TranslateInterestsToNames
} catch {
    Write-Host ("Exception occurred when calling Invoke-AdGroupsList: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
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
 **AdGroupIds** | [**String[]**](String.md)| List of Ad group Ids to retrieve keywords from. This feature is currently in BETA and is not available to all users. | [optional] 
 **EntityStatuses** | [**EntityStatus[]**](EntityStatus.md)| Entity status | [optional] 
 **TranslateInterestsToNames** | **Boolean**| Return interests as text names (if value is true) rather than topic IDs. | [optional] [default to $false]

### Return type

[**AdGroupsList200Response**](AdGroupsList200Response.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-AdGroupsUpdate"></a>
# **Invoke-AdGroupsUpdate**
> AdGroupsCreate200Response Invoke-AdGroupsUpdate<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdGroupUpdateBatchUpdate] <PSCustomObject[]><br>

Update ad groups

Update multiple existing ad groups.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account.
$AdgroupTrackingFeatures = Initialize-AdgroupTrackingFeatures -Enabled "TRENDS"

$AttributionWindows = Initialize-AttributionWindows -ClickWindowDays 0 -EngagementWindowDays 0 -ViewWindowDays 0
$ConversionTagV3GoalMetadata = Initialize-ConversionTagV3GoalMetadata -AttributionWindows $AttributionWindows -ConversionEvent "PAGE_VISIT" -ConversionTagId "MyConversionTagId" -CpaGoalValueInMicroCurrency "MyCpaGoalValueInMicroCurrency" -IsRoasOptimized $false -ReportingEvent "MyReportingEvent"

$FrequencyGoalMetadata = Initialize-FrequencyGoalMetadata -Frequency 0 -Timerange "THIRTY_DAY"
$ScrollupGoalMetadata = Initialize-ScrollupGoalMetadata -ScrollupGoalValueInMicroCurrency "MyScrollupGoalValueInMicroCurrency"
$NullableOptimizationGoalMetadata = Initialize-NullableOptimizationGoalMetadata -ConversionTagV3GoalMetadata $ConversionTagV3GoalMetadata -FrequencyGoalMetadata $FrequencyGoalMetadata -ScrollupGoalMetadata $ScrollupGoalMetadata

$PerformancePlusCampaignSettings = Initialize-PerformancePlusCampaignSettings -BoostProspectingAdGroupBid $false -PinnerListExclusions "MyPinnerListExclusions"

$TargetingSpecShoppingRetargeting = Initialize-TargetingSpecShoppingRetargeting -ExclusionWindow 14 -LookbackWindow 30 -TagTypes 0
$TargetingSpecOptimal = Initialize-TargetingSpecOptimal -AGEBUCKET "18-24" -APPTYPE "android_mobile" -AUDIENCEEXCLUDE "MyAUDIENCEEXCLUDE" -AUDIENCEINCLUDE "MyAUDIENCEINCLUDE" -GENDER "unknown" -GEO "MyGEO" -GEOEXCLUDE "MyGEOEXCLUDE" -INTEREST "MyINTEREST" -LOCALE "MyLOCALE" -LOCATION "MyLOCATION" -LOCATIONEXCLUDE "MyLOCATIONEXCLUDE" -MAXIMUMAGE "MyMAXIMUMAGE" -MINIMUMAGE "MyMINIMUMAGE" -SHOPPINGRETARGETING $TargetingSpecShoppingRetargeting -TARGETINGSTRATEGY "CHOOSE_YOUR_OWN"

$TargetingSpecOperations = Initialize-TargetingSpecOperations -Field "MINIMUM_AGE" -Operation "SET" -Values $TargetingSpecShoppingRetargeting -Value "MyValue"

$AdGroupTrackingURLs = Initialize-AdGroupTrackingURLs -AudienceVerification "MyAudienceVerification" -BuyableButton "MyBuyableButton" -Click "MyClick" -Engagement "MyEngagement" -Impression "MyImpression"
$AdGroupUpdateBatchUpdate = Initialize-AdGroupUpdateBatchUpdate -AutoTargetingEnabled $false -BidInMicroCurrency 0 -BidMultiplier 0 -BidStrategyType "AUTOMATIC_BID" -BillableEvent "CLICKTHROUGH" -BudgetInMicroCurrency 0 -BudgetType "DAILY" -CampaignId "MyCampaignId" -CustomerSegmentId "MyCustomerSegmentId" -EndTime 0 -ExtFeatures $AdgroupTrackingFeatures -FeedProfileId "MyFeedProfileId" -Id "MyId" -IsCreativeOptimization $false -IsLocalInventory $false -LifetimeFrequencyCap 0 -LocalInventoryRadiusInMiles 0 -Name "MyName" -OptimizationGoalMetadata $NullableOptimizationGoalMetadata -PacingDeliveryType "STANDARD" -PerformancePlusCampaignSettings $PerformancePlusCampaignSettings -PlacementGroup "ALL" -PlacementTrafficType "ALL" -PromotionApplicationLevel "NONE" -PromotionId "MyPromotionId" -PromotionIds "MyPromotionIds" -StartTime 0 -Status "ACTIVE" -TargetingSpec $TargetingSpecOptimal -TargetingSpecOperations $TargetingSpecOperations -TargetingTemplateIds "MyTargetingTemplateIds" -TrackingUrls $AdGroupTrackingURLs # AdGroupUpdateBatchUpdate[] | 

# Update ad groups
try {
    $Result = Invoke-AdGroupsUpdate -AdAccountId $AdAccountId -AdGroupUpdateBatchUpdate $AdGroupUpdateBatchUpdate
} catch {
    Write-Host ("Exception occurred when calling Invoke-AdGroupsUpdate: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **AdAccountId** | **String**| Unique identifier of an ad account. | 
 **AdGroupUpdateBatchUpdate** | [**AdGroupUpdateBatchUpdate[]**](AdGroupUpdateBatchUpdate.md)|  | 

### Return type

[**AdGroupsCreate200Response**](AdGroupsCreate200Response.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Get-AdGroupsByPromotionIdsList"></a>
# **Get-AdGroupsByPromotionIdsList**
> AdGroupsList200Response Get-AdGroupsByPromotionIdsList<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-PromotionIds] <String[]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Bookmark] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-PageSize] <System.Nullable[Int32]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Order] <PSCustomObject><br>

List of ad groups using promotions IDs.

  Get a list of ad groups that are associated with those promotion ids

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account.
$PromotionIds = "MyPromotionIds" # String[] | List of Promotion IDs to use to filter the results.
$Bookmark = "MyBookmark" # String | Cursor used to fetch the next page of items (optional)
$PageSize = 56 # Int32 | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional) (default to 25)
$Order = "ASCENDING" # PinterestLibPaginationOrder | The order in which to sort the items returned: ""ASCENDING"" or ""DESCENDING"" by ID. Note that higher-value IDs are associated with more-recently added items. (optional)

# List of ad groups using promotions IDs.
try {
    $Result = Get-AdGroupsByPromotionIdsList -AdAccountId $AdAccountId -PromotionIds $PromotionIds -Bookmark $Bookmark -PageSize $PageSize -Order $Order
} catch {
    Write-Host ("Exception occurred when calling Get-AdGroupsByPromotionIdsList: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **AdAccountId** | **String**| Unique identifier of an ad account. | 
 **PromotionIds** | [**String[]**](String.md)| List of Promotion IDs to use to filter the results. | 
 **Bookmark** | **String**| Cursor used to fetch the next page of items | [optional] 
 **PageSize** | **Int32**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]
 **Order** | [**PinterestLibPaginationOrder**](PinterestLibPaginationOrder.md)| The order in which to sort the items returned: &quot;&quot;ASCENDING&quot;&quot; or &quot;&quot;DESCENDING&quot;&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] 

### Return type

[**AdGroupsList200Response**](AdGroupsList200Response.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

