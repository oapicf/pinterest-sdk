# PSOpenAPITools.PSOpenAPITools\Api.AdGroupsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**Invoke-AdGroupsBidFloorGet**](AdGroupsApi.md#Invoke-AdGroupsBidFloorGet) | **POST** /ad_accounts/{ad_account_id}/bid_floor | Get bid floors
[**Invoke-AdGroupsTargetingAnalyticsGet**](AdGroupsApi.md#Invoke-AdGroupsTargetingAnalyticsGet) | **GET** /ad_accounts/{ad_account_id}/ad_groups/targeting_analytics | Get targeting analytics for ad groups
[**Invoke-AdGroupsAnalytics**](AdGroupsApi.md#Invoke-AdGroupsAnalytics) | **GET** /ad_accounts/{ad_account_id}/ad_groups/analytics | Get ad group analytics
[**Invoke-AdGroupsAudienceSizing**](AdGroupsApi.md#Invoke-AdGroupsAudienceSizing) | **GET** /ad_accounts/{ad_account_id}/ad_groups/audience_sizing | Get audience sizing
[**Invoke-AdGroupsCreate**](AdGroupsApi.md#Invoke-AdGroupsCreate) | **POST** /ad_accounts/{ad_account_id}/ad_groups | Create ad groups
[**Invoke-AdGroupsGet**](AdGroupsApi.md#Invoke-AdGroupsGet) | **GET** /ad_accounts/{ad_account_id}/ad_groups/{ad_group_id} | Get ad group
[**Invoke-AdGroupsList**](AdGroupsApi.md#Invoke-AdGroupsList) | **GET** /ad_accounts/{ad_account_id}/ad_groups | List ad groups
[**Invoke-AdGroupsUpdate**](AdGroupsApi.md#Invoke-AdGroupsUpdate) | **PATCH** /ad_accounts/{ad_account_id}/ad_groups | Update ad groups


<a id="Invoke-AdGroupsBidFloorGet"></a>
# **Invoke-AdGroupsBidFloorGet**
> BidFloor Invoke-AdGroupsBidFloorGet<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-BidFloorRequest] <PSCustomObject><br>

Get bid floors

List bid floors for your campaign configuration. Bid floors are given in microcurrency values based on the currency in the bid floor specification. <p/> <p>Microcurrency is used to track very small transactions, based on the currency set in the advertiser’s profile.</p> <p>A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser’s profile.</p> <p><strong>Equivalency equations</strong>, using dollars as an example currency:</p> <ul>   <li>$1 = 1,000,000 microdollars</li>   <li>1 microdollar = $0.000001 </li> </ul> <p><strong>To convert between currency and microcurrency</strong>, using dollars as an example currency:</p> <ul>   <li>To convert dollars to microdollars, mutiply dollars by 1,000,000</li>   <li>To convert microdollars to dollars, divide microdollars by 1,000,000</li> </ul> For more on bid floors see <a class=""reference external"" href=""https://help.pinterest.com/en/business/article/set-your-bid""> Set your bid</a>.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account.
$OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows = Initialize-OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows -ClickWindowDays 0 -EngagementWindowDays 0 -ViewWindowDays 0
$OptimizationGoalMetadataConversionTagV3GoalMetadata = Initialize-OptimizationGoalMetadataConversionTagV3GoalMetadata -AttributionWindows $OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows -ConversionEvent "PAGE_VISIT" -ConversionTagId "MyConversionTagId" -CpaGoalValueInMicroCurrency "MyCpaGoalValueInMicroCurrency" -IsRoasOptimized $false -LearningModeType "NOT_ACTIVE"

$OptimizationGoalMetadataFrequencyGoalMetadata = Initialize-OptimizationGoalMetadataFrequencyGoalMetadata -Frequency 0 -Timerange "THIRTY_DAY"
$OptimizationGoalMetadataScrollupGoalMetadata = Initialize-OptimizationGoalMetadataScrollupGoalMetadata -ScrollupGoalValueInMicroCurrency "MyScrollupGoalValueInMicroCurrency"
$OptimizationGoalMetadata = Initialize-OptimizationGoalMetadata -ConversionTagV3GoalMetadata $OptimizationGoalMetadataConversionTagV3GoalMetadata -FrequencyGoalMetadata $OptimizationGoalMetadataFrequencyGoalMetadata -ScrollupGoalMetadata $OptimizationGoalMetadataScrollupGoalMetadata

$BidFloorSpec = Initialize-BidFloorSpec -Countries "AD" -Currency "UNK" -ObjectiveType "AWARENESS" -BillableEvent "CLICKTHROUGH" -OptimizationGoalMetadata $OptimizationGoalMetadata -CreativeType "REGULAR"

"18-24""android_mobile""unknown"
$TargetingSpecSHOPPINGRETARGETING = Initialize-TargetingSpecSHOPPINGRETARGETING -LookbackWindow 30 -TagTypes 0 -ExclusionWindow 14
"CHOOSE_YOUR_OWN"$TargetingSpec = Initialize-TargetingSpec -AGEBUCKET "18-24" -APPTYPE "18-24""android_mobile" -AUDIENCEEXCLUDE "MyAUDIENCEEXCLUDE" -AUDIENCEINCLUDE "MyAUDIENCEINCLUDE" -GENDER "18-24""android_mobile""unknown" -GEO "MyGEO" -INTEREST "MyINTEREST" -LOCALE "MyLOCALE" -LOCATION "MyLOCATION" -SHOPPINGRETARGETING $TargetingSpecSHOPPINGRETARGETING -TARGETINGSTRATEGY "18-24""android_mobile""unknown"
$TargetingSpecSHOPPINGRETARGETING = Initialize-TargetingSpecSHOPPINGRETARGETING -LookbackWindow 30 -TagTypes 0 -ExclusionWindow 14
"CHOOSE_YOUR_OWN"

$BidFloorRequest = Initialize-BidFloorRequest -BidFloorSpecs $BidFloorSpec -TargetingSpec $TargetingSpec # BidFloorRequest | Parameters to get bid_floor info

# Get bid floors
try {
    $Result = Invoke-AdGroupsBidFloorGet -AdAccountId $AdAccountId -BidFloorRequest $BidFloorRequest
} catch {
    Write-Host ("Exception occurred when calling Invoke-AdGroupsBidFloorGet: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **AdAccountId** | **String**| Unique identifier of an ad account. | 
 **BidFloorRequest** | [**BidFloorRequest**](BidFloorRequest.md)| Parameters to get bid_floor info | 

### Return type

[**BidFloor**](BidFloor.md) (PSCustomObject)

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
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Columns] <String[]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Granularity] <PSCustomObject><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ClickWindowDays] <System.Nullable[Int32]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-EngagementWindowDays] <System.Nullable[Int32]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ViewWindowDays] <System.Nullable[Int32]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ConversionReportTime] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AttributionTypes] <PSCustomObject><br>

Get targeting analytics for ad groups

Get targeting analytics for one or more ad groups. For the requested ad group(s) and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. ""age_bucket"") for applicable values (e.g. ""45-49""). <p/> - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=""https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts"">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account.
$AdGroupIds = "MyAdGroupIds" # String[] | List of Ad group Ids to use to filter the results.
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

# Get targeting analytics for ad groups
try {
    $Result = Invoke-AdGroupsTargetingAnalyticsGet -AdAccountId $AdAccountId -AdGroupIds $AdGroupIds -StartDate $StartDate -EndDate $EndDate -TargetingTypes $TargetingTypes -Columns $Columns -Granularity $Granularity -ClickWindowDays $ClickWindowDays -EngagementWindowDays $EngagementWindowDays -ViewWindowDays $ViewWindowDays -ConversionReportTime $ConversionReportTime -AttributionTypes $AttributionTypes
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

<a id="Invoke-AdGroupsAnalytics"></a>
# **Invoke-AdGroupsAnalytics**
> AdGroupsAnalyticsResponseInner[] Invoke-AdGroupsAnalytics<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-StartDate] <System.DateTime><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-EndDate] <System.DateTime><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdGroupIds] <String[]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Columns] <String[]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Granularity] <PSCustomObject><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ClickWindowDays] <System.Nullable[Int32]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-EngagementWindowDays] <System.Nullable[Int32]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ViewWindowDays] <System.Nullable[Int32]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ConversionReportTime] <String><br>

Get ad group analytics

Get analytics for the specified ad groups in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=""https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts"">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account.
$StartDate = (Get-Date) # System.DateTime | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
$EndDate = (Get-Date) # System.DateTime | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
$AdGroupIds = "MyAdGroupIds" # String[] | List of Ad group Ids to use to filter the results.
$Columns = "SPEND_IN_MICRO_DOLLAR" # String[] | Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned
$Granularity = "TOTAL" # Granularity | TOTAL - metrics are aggregated over the specified date range.<br> DAY - metrics are broken down daily.<br> HOUR - metrics are broken down hourly.<br>WEEKLY - metrics are broken down weekly.<br>MONTHLY - metrics are broken down monthly
$ClickWindowDays = "0" # Int32 | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. (optional) (default to 30)
$EngagementWindowDays = "0" # Int32 | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. (optional) (default to 30)
$ViewWindowDays = "0" # Int32 | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day. (optional) (default to 1)
$ConversionReportTime = "TIME_OF_AD_ACTION" # String | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. (optional) (default to "TIME_OF_AD_ACTION")

# Get ad group analytics
try {
    $Result = Invoke-AdGroupsAnalytics -AdAccountId $AdAccountId -StartDate $StartDate -EndDate $EndDate -AdGroupIds $AdGroupIds -Columns $Columns -Granularity $Granularity -ClickWindowDays $ClickWindowDays -EngagementWindowDays $EngagementWindowDays -ViewWindowDays $ViewWindowDays -ConversionReportTime $ConversionReportTime
} catch {
    Write-Host ("Exception occurred when calling Invoke-AdGroupsAnalytics: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **AdAccountId** | **String**| Unique identifier of an ad account. | 
 **StartDate** | **System.DateTime**| Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | 
 **EndDate** | **System.DateTime**| Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | 
 **AdGroupIds** | [**String[]**](String.md)| List of Ad group Ids to use to filter the results. | 
 **Columns** | [**String[]**](String.md)| Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned | 
 **Granularity** | [**Granularity**](Granularity.md)| TOTAL - metrics are aggregated over the specified date range.&lt;br&gt; DAY - metrics are broken down daily.&lt;br&gt; HOUR - metrics are broken down hourly.&lt;br&gt;WEEKLY - metrics are broken down weekly.&lt;br&gt;MONTHLY - metrics are broken down monthly | 
 **ClickWindowDays** | **Int32**| Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30]
 **EngagementWindowDays** | **Int32**| Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30]
 **ViewWindowDays** | **Int32**| Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional] [default to 1]
 **ConversionReportTime** | **String**| The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] [default to &quot;TIME_OF_AD_ACTION&quot;]

### Return type

[**AdGroupsAnalyticsResponseInner[]**](AdGroupsAnalyticsResponseInner.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-AdGroupsAudienceSizing"></a>
# **Invoke-AdGroupsAudienceSizing**
> AdGroupAudienceSizingResponse Invoke-AdGroupsAudienceSizing<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdGroupAudienceSizingRequest] <PSCustomObject><br>

Get audience sizing

Get potential audience size for an ad group with given targeting criteria.  Potential audience size estimates the number of people you may be able to reach per month with your campaign.  It is based on historical advertising data and the targeting criteria you select. It does not guarantee results or take into account factors such as bid, budget, schedule, seasonality or product experiments.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account.
"REGULAR"
"18-24""android_mobile""unknown"
$TargetingSpecSHOPPINGRETARGETING = Initialize-TargetingSpecSHOPPINGRETARGETING -LookbackWindow 30 -TagTypes 0 -ExclusionWindow 14
"CHOOSE_YOUR_OWN"$TargetingSpec = Initialize-TargetingSpec -AGEBUCKET "18-24" -APPTYPE "18-24""android_mobile" -AUDIENCEEXCLUDE "MyAUDIENCEEXCLUDE" -AUDIENCEINCLUDE "MyAUDIENCEINCLUDE" -GENDER "18-24""android_mobile""unknown" -GEO "MyGEO" -INTEREST "MyINTEREST" -LOCALE "MyLOCALE" -LOCATION "MyLOCATION" -SHOPPINGRETARGETING $TargetingSpecSHOPPINGRETARGETING -TARGETINGSTRATEGY "18-24""android_mobile""unknown"
$TargetingSpecSHOPPINGRETARGETING = Initialize-TargetingSpecSHOPPINGRETARGETING -LookbackWindow 30 -TagTypes 0 -ExclusionWindow 14
"CHOOSE_YOUR_OWN"

$AdGroupAudienceSizingRequestKeywordsInner = Initialize-AdGroupAudienceSizingRequestKeywordsInner -MatchType "BROAD" -Value "MyValue"
$AdGroupAudienceSizingRequest = Initialize-AdGroupAudienceSizingRequest -AutoTargetingEnabled $true -PlacementGroup "ALL" -CreativeTypes "REGULAR" -TargetingSpec $TargetingSpec -ProductGroupIds "23423422123" -Keywords $AdGroupAudienceSizingRequestKeywordsInner # AdGroupAudienceSizingRequest |  (optional)

# Get audience sizing
try {
    $Result = Invoke-AdGroupsAudienceSizing -AdAccountId $AdAccountId -AdGroupAudienceSizingRequest $AdGroupAudienceSizingRequest
} catch {
    Write-Host ("Exception occurred when calling Invoke-AdGroupsAudienceSizing: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **AdAccountId** | **String**| Unique identifier of an ad account. | 
 **AdGroupAudienceSizingRequest** | [**AdGroupAudienceSizingRequest**](AdGroupAudienceSizingRequest.md)|  | [optional] 

### Return type

[**AdGroupAudienceSizingResponse**](AdGroupAudienceSizingResponse.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-AdGroupsCreate"></a>
# **Invoke-AdGroupsCreate**
> AdGroupArrayResponse Invoke-AdGroupsCreate<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdGroupCreateRequest] <PSCustomObject[]><br>

Create ad groups

Create multiple new ad groups. All ads in a given ad group will have the same budget, bid, run dates, targeting, and placement (search, browse, other). For more information, <a href=""https://help.pinterest.com/en/business/article/campaign-structure"" target=""_blank""> click here</a>.</p> <strong>Note:</strong> - 'bid_in_micro_currency' and 'budget_in_micro_currency' should be expressed in microcurrency amounts based on the currency field set in the advertiser's profile.<p/> <p>Microcurrency is used to track very small transactions, based on the currency set in the advertiser’s profile.</p> <p>A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser’s profile.</p> <p><strong>Equivalency equations</strong>, using dollars as an example currency:</p> <ul>   <li>$1 = 1,000,000 microdollars</li>   <li>1 microdollar = $0.000001 </li> </ul> <p><strong>To convert between currency and microcurrency</strong>, using dollars as an example currency:</p> <ul>   <li>To convert dollars to microdollars, mutiply dollars by 1,000,000</li>   <li>To convert microdollars to dollars, divide microdollars by 1,000,000</li> </ul> - Ad groups belong to ad campaigns. Some types of campaigns (e.g. budget optimization) have limits on the number of ad groups they can hold. If you exceed those limits, you will get an error message. - Start and end time cannot be set for ad groups that belong to CBO campaigns. Currently, campaigns with the following objective types: TRAFFIC, AWARENESS, WEB_CONVERSIONS, and CATALOG_SALES will default to CBO.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account.
$OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows = Initialize-OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows -ClickWindowDays 0 -EngagementWindowDays 0 -ViewWindowDays 0
$OptimizationGoalMetadataConversionTagV3GoalMetadata = Initialize-OptimizationGoalMetadataConversionTagV3GoalMetadata -AttributionWindows $OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows -ConversionEvent "PAGE_VISIT" -ConversionTagId "MyConversionTagId" -CpaGoalValueInMicroCurrency "MyCpaGoalValueInMicroCurrency" -IsRoasOptimized $false -LearningModeType "NOT_ACTIVE"

$OptimizationGoalMetadataFrequencyGoalMetadata = Initialize-OptimizationGoalMetadataFrequencyGoalMetadata -Frequency 0 -Timerange "THIRTY_DAY"
$OptimizationGoalMetadataScrollupGoalMetadata = Initialize-OptimizationGoalMetadataScrollupGoalMetadata -ScrollupGoalValueInMicroCurrency "MyScrollupGoalValueInMicroCurrency"
$AdGroupCommonOptimizationGoalMetadata = Initialize-AdGroupCommonOptimizationGoalMetadata -ConversionTagV3GoalMetadata $OptimizationGoalMetadataConversionTagV3GoalMetadata -FrequencyGoalMetadata $OptimizationGoalMetadataFrequencyGoalMetadata -ScrollupGoalMetadata $OptimizationGoalMetadataScrollupGoalMetadata

"18-24""android_mobile""unknown"
$TargetingSpecSHOPPINGRETARGETING = Initialize-TargetingSpecSHOPPINGRETARGETING -LookbackWindow 30 -TagTypes 0 -ExclusionWindow 14
"CHOOSE_YOUR_OWN"$TargetingSpec = Initialize-TargetingSpec -AGEBUCKET "18-24" -APPTYPE "18-24""android_mobile" -AUDIENCEEXCLUDE "MyAUDIENCEEXCLUDE" -AUDIENCEINCLUDE "MyAUDIENCEINCLUDE" -GENDER "18-24""android_mobile""unknown" -GEO "MyGEO" -INTEREST "MyINTEREST" -LOCALE "MyLOCALE" -LOCATION "MyLOCATION" -SHOPPINGRETARGETING $TargetingSpecSHOPPINGRETARGETING -TARGETINGSTRATEGY "18-24""android_mobile""unknown"
$TargetingSpecSHOPPINGRETARGETING = Initialize-TargetingSpecSHOPPINGRETARGETING -LookbackWindow 30 -TagTypes 0 -ExclusionWindow 14
"CHOOSE_YOUR_OWN"

$AdGroupCommonTrackingUrls = Initialize-AdGroupCommonTrackingUrls -Impression "MyImpression" -Click "MyClick" -Engagement "MyEngagement" -BuyableButton "MyBuyableButton" -AudienceVerification "MyAudienceVerification"
$AdGroupCreateRequest = Initialize-AdGroupCreateRequest -Name "Ad Group For Pin: 687195905986" -Status "ACTIVE" -BudgetInMicroCurrency 5000000 -BidInMicroCurrency 5000000 -OptimizationGoalMetadata $AdGroupCommonOptimizationGoalMetadata -BudgetType "DAILY" -StartTime 5686848000 -EndTime 5705424000 -TargetingSpec $TargetingSpec -LifetimeFrequencyCap 100 -TrackingUrls $AdGroupCommonTrackingUrls -AutoTargetingEnabled $true -PlacementGroup "ALL" -PacingDeliveryType "STANDARD" -CampaignId "626736533506" -BillableEvent "CLICKTHROUGH" -BidStrategyType "AUTOMATIC_BID" # AdGroupCreateRequest[] | List of ad groups to create, size limit [1, 30].

# Create ad groups
try {
    $Result = Invoke-AdGroupsCreate -AdAccountId $AdAccountId -AdGroupCreateRequest $AdGroupCreateRequest
} catch {
    Write-Host ("Exception occurred when calling Invoke-AdGroupsCreate: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **AdAccountId** | **String**| Unique identifier of an ad account. | 
 **AdGroupCreateRequest** | [**AdGroupCreateRequest[]**](AdGroupCreateRequest.md)| List of ad groups to create, size limit [1, 30]. | 

### Return type

[**AdGroupArrayResponse**](AdGroupArrayResponse.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-AdGroupsGet"></a>
# **Invoke-AdGroupsGet**
> AdGroupResponse Invoke-AdGroupsGet<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdGroupId] <String><br>

Get ad group

Get a specific ad given the ad ID. If your pin is rejected, rejected_reasons will contain additional information from the Ad Review process. For more information about our policies and rejection reasons see the <a href=""https://www.pinterest.com/_/_/policy/advertising-guidelines/"" target=""_blank"">Pinterest advertising standards</a>.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account.
$AdGroupId = "MyAdGroupId" # String | Unique identifier of an ad group.

# Get ad group
try {
    $Result = Invoke-AdGroupsGet -AdAccountId $AdAccountId -AdGroupId $AdGroupId
} catch {
    Write-Host ("Exception occurred when calling Invoke-AdGroupsGet: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **AdAccountId** | **String**| Unique identifier of an ad account. | 
 **AdGroupId** | **String**| Unique identifier of an ad group. | 

### Return type

[**AdGroupResponse**](AdGroupResponse.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-AdGroupsList"></a>
# **Invoke-AdGroupsList**
> AdGroupsList200Response Invoke-AdGroupsList<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-CampaignIds] <String[]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdGroupIds] <String[]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-EntityStatuses] <String[]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-PageSize] <System.Nullable[Int32]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Order] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Bookmark] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-TranslateInterestsToNames] <System.Nullable[Boolean]><br>

List ad groups

List ad groups based on provided campaign IDs or ad group IDs.(campaign_ids or ad_group_ids). <p/> <strong>Note:</strong><p/> Provide only campaign_id or ad_group_id. Do not provide both.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account.
$CampaignIds = "MyCampaignIds" # String[] | List of Campaign Ids to use to filter the results. (optional)
$AdGroupIds = "MyAdGroupIds" # String[] | List of Ad group Ids to use to filter the results. (optional)
$EntityStatuses = "ACTIVE" # String[] | Entity status (optional)
$PageSize = 56 # Int32 | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information. (optional) (default to 25)
$Order = "ASCENDING" # String | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. (optional)
$Bookmark = "MyBookmark" # String | Cursor used to fetch the next page of items (optional)
$TranslateInterestsToNames = $true # Boolean | Return interests as text names (if value is true) rather than topic IDs. (optional) (default to $false)

# List ad groups
try {
    $Result = Invoke-AdGroupsList -AdAccountId $AdAccountId -CampaignIds $CampaignIds -AdGroupIds $AdGroupIds -EntityStatuses $EntityStatuses -PageSize $PageSize -Order $Order -Bookmark $Bookmark -TranslateInterestsToNames $TranslateInterestsToNames
} catch {
    Write-Host ("Exception occurred when calling Invoke-AdGroupsList: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **AdAccountId** | **String**| Unique identifier of an ad account. | 
 **CampaignIds** | [**String[]**](String.md)| List of Campaign Ids to use to filter the results. | [optional] 
 **AdGroupIds** | [**String[]**](String.md)| List of Ad group Ids to use to filter the results. | [optional] 
 **EntityStatuses** | [**String[]**](String.md)| Entity status | [optional] 
 **PageSize** | **Int32**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **Order** | **String**| The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] 
 **Bookmark** | **String**| Cursor used to fetch the next page of items | [optional] 
 **TranslateInterestsToNames** | **Boolean**| Return interests as text names (if value is true) rather than topic IDs. | [optional] [default to $false]

### Return type

[**AdGroupsList200Response**](AdGroupsList200Response.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-AdGroupsUpdate"></a>
# **Invoke-AdGroupsUpdate**
> AdGroupArrayResponse Invoke-AdGroupsUpdate<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdGroupUpdateRequest] <PSCustomObject[]><br>

Update ad groups

Update multiple existing ad groups.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account.
$OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows = Initialize-OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows -ClickWindowDays 0 -EngagementWindowDays 0 -ViewWindowDays 0
$OptimizationGoalMetadataConversionTagV3GoalMetadata = Initialize-OptimizationGoalMetadataConversionTagV3GoalMetadata -AttributionWindows $OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows -ConversionEvent "PAGE_VISIT" -ConversionTagId "MyConversionTagId" -CpaGoalValueInMicroCurrency "MyCpaGoalValueInMicroCurrency" -IsRoasOptimized $false -LearningModeType "NOT_ACTIVE"

$OptimizationGoalMetadataFrequencyGoalMetadata = Initialize-OptimizationGoalMetadataFrequencyGoalMetadata -Frequency 0 -Timerange "THIRTY_DAY"
$OptimizationGoalMetadataScrollupGoalMetadata = Initialize-OptimizationGoalMetadataScrollupGoalMetadata -ScrollupGoalValueInMicroCurrency "MyScrollupGoalValueInMicroCurrency"
$AdGroupCommonOptimizationGoalMetadata = Initialize-AdGroupCommonOptimizationGoalMetadata -ConversionTagV3GoalMetadata $OptimizationGoalMetadataConversionTagV3GoalMetadata -FrequencyGoalMetadata $OptimizationGoalMetadataFrequencyGoalMetadata -ScrollupGoalMetadata $OptimizationGoalMetadataScrollupGoalMetadata

"18-24""android_mobile""unknown"
$TargetingSpecSHOPPINGRETARGETING = Initialize-TargetingSpecSHOPPINGRETARGETING -LookbackWindow 30 -TagTypes 0 -ExclusionWindow 14
"CHOOSE_YOUR_OWN"$TargetingSpec = Initialize-TargetingSpec -AGEBUCKET "18-24" -APPTYPE "18-24""android_mobile" -AUDIENCEEXCLUDE "MyAUDIENCEEXCLUDE" -AUDIENCEINCLUDE "MyAUDIENCEINCLUDE" -GENDER "18-24""android_mobile""unknown" -GEO "MyGEO" -INTEREST "MyINTEREST" -LOCALE "MyLOCALE" -LOCATION "MyLOCATION" -SHOPPINGRETARGETING $TargetingSpecSHOPPINGRETARGETING -TARGETINGSTRATEGY "18-24""android_mobile""unknown"
$TargetingSpecSHOPPINGRETARGETING = Initialize-TargetingSpecSHOPPINGRETARGETING -LookbackWindow 30 -TagTypes 0 -ExclusionWindow 14
"CHOOSE_YOUR_OWN"

$AdGroupCommonTrackingUrls = Initialize-AdGroupCommonTrackingUrls -Impression "MyImpression" -Click "MyClick" -Engagement "MyEngagement" -BuyableButton "MyBuyableButton" -AudienceVerification "MyAudienceVerification"
$AdGroupUpdateRequest = Initialize-AdGroupUpdateRequest -Name "Ad Group For Pin: 687195905986" -Status "ACTIVE" -BudgetInMicroCurrency 5000000 -BidInMicroCurrency 5000000 -OptimizationGoalMetadata $AdGroupCommonOptimizationGoalMetadata -BudgetType "DAILY" -StartTime 5686848000 -EndTime 5705424000 -TargetingSpec $TargetingSpec -LifetimeFrequencyCap 100 -TrackingUrls $AdGroupCommonTrackingUrls -AutoTargetingEnabled $true -PlacementGroup "ALL" -PacingDeliveryType "STANDARD" -CampaignId "626736533506" -BillableEvent "CLICKTHROUGH" -BidStrategyType "AUTOMATIC_BID" -Id "2680060704746" # AdGroupUpdateRequest[] | List of ad groups to update, size limit [1, 30].

# Update ad groups
try {
    $Result = Invoke-AdGroupsUpdate -AdAccountId $AdAccountId -AdGroupUpdateRequest $AdGroupUpdateRequest
} catch {
    Write-Host ("Exception occurred when calling Invoke-AdGroupsUpdate: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **AdAccountId** | **String**| Unique identifier of an ad account. | 
 **AdGroupUpdateRequest** | [**AdGroupUpdateRequest[]**](AdGroupUpdateRequest.md)| List of ad groups to update, size limit [1, 30]. | 

### Return type

[**AdGroupArrayResponse**](AdGroupArrayResponse.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

