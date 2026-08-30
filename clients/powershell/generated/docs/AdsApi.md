# PSOpenAPITools.PSOpenAPITools\Api.AdsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**Invoke-AdPreviewsCreate**](AdsApi.md#Invoke-AdPreviewsCreate) | **POST** /ad_accounts/{ad_account_id}/ad_previews | Create ad preview with pin or image
[**Invoke-AdTargetingAnalyticsGet**](AdsApi.md#Invoke-AdTargetingAnalyticsGet) | **GET** /ad_accounts/{ad_account_id}/ads/targeting_analytics | Get targeting analytics for ads
[**Invoke-AdsAnalytics**](AdsApi.md#Invoke-AdsAnalytics) | **GET** /ad_accounts/{ad_account_id}/ads/analytics | Get ad analytics
[**Invoke-AdsCreate**](AdsApi.md#Invoke-AdsCreate) | **POST** /ad_accounts/{ad_account_id}/ads | Create ads
[**Invoke-AdsGet**](AdsApi.md#Invoke-AdsGet) | **GET** /ad_accounts/{ad_account_id}/ads/{ad_id} | Get ad
[**Invoke-AdsList**](AdsApi.md#Invoke-AdsList) | **GET** /ad_accounts/{ad_account_id}/ads | List ads
[**Invoke-AdsUpdate**](AdsApi.md#Invoke-AdsUpdate) | **PATCH** /ad_accounts/{ad_account_id}/ads | Update ads
[**Invoke-CampaignAdPreviewCreate**](AdsApi.md#Invoke-CampaignAdPreviewCreate) | **POST** /ad_accounts/{ad_account_id}/campaign_ad_preview | Create ad preview records for one or more ad groups
[**Invoke-CampaignAdPreviewDelete**](AdsApi.md#Invoke-CampaignAdPreviewDelete) | **DELETE** /ad_accounts/{ad_account_id}/campaign_ad_preview | Delete ad preview records for one or more ad groups
[**Invoke-CampaignAdPreviewRead**](AdsApi.md#Invoke-CampaignAdPreviewRead) | **GET** /ad_accounts/{ad_account_id}/campaign_ad_preview | Fetch ad preview records for one or more ad groups


<a id="Invoke-AdPreviewsCreate"></a>
# **Invoke-AdPreviewsCreate**
> AdPreviewURLResponse Invoke-AdPreviewsCreate<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdPreviewRequest] <PSCustomObject><br>

Create ad preview with pin or image

Create an ad preview given an ad account ID and either an existing organic pin ID or the URL for an image to be used to create the Pin and the ad.  If you are creating a preview from an existing Pin, that Pin must be promotable: that is, it must have a clickthrough link and meet other requirements. (See [Ads Overview](https://help.pinterest.com/en/business/article/promoted-pins-overview).)  You can view the returned preview URL on a webpage or iframe for 7 days, after which the URL expires. Collection ads are not currently supported ad preview.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account.
$AdPreviewRequest = Initialize-AdPreviewRequest -ImageUrl "https://somewebsite.com/someimage.jpg" -PromotionId "7834020404549" -Title "My Preview Image" -CreativeType "SHOPPING" -PinId "7389479023" -CatalogProductGroupId "123456789" -CustomizableCtaType "GET_OFFER" -HeroImageTitle "My Preview Image" -HeroImageUrl "https://somewebsite.com/someimage.jpg" -HeroPinId "987654321" -ImageTag "Christmas Sale" -ItemId "111111111" -PreferredMediaType "VIDEO" -ShowPromotion $false -VideoTag "Black Friday Sale" # AdPreviewRequest | 

# Create ad preview with pin or image
try {
    $Result = Invoke-AdPreviewsCreate -AdAccountId $AdAccountId -AdPreviewRequest $AdPreviewRequest
} catch {
    Write-Host ("Exception occurred when calling Invoke-AdPreviewsCreate: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **AdAccountId** | **String**| Unique identifier of an ad account. | 
 **AdPreviewRequest** | [**AdPreviewRequest**](AdPreviewRequest.md)|  | 

### Return type

[**AdPreviewURLResponse**](AdPreviewURLResponse.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-AdTargetingAnalyticsGet"></a>
# **Invoke-AdTargetingAnalyticsGet**
> MetricsResponse Invoke-AdTargetingAnalyticsGet<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdIds] <String[]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-StartDate] <System.DateTime><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-EndDate] <System.DateTime><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-TargetingTypes] <PSCustomObject[]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Columns] <PSCustomObject[]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Granularity] <PSCustomObject><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ClickWindowDays] <PSCustomObject><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-EngagementWindowDays] <PSCustomObject><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ViewWindowDays] <PSCustomObject><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ConversionReportTime] <PSCustomObject><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AttributionTypes] <PSCustomObject[]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ReportingTimezone] <PSCustomObject><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-SortColumns] <String[]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-SortAscending] <System.Nullable[Boolean]><br>

Get targeting analytics for ads

Get targeting analytics for one or more ads. For the requested ad(s) and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. ""age_bucket"") for applicable values (e.g. ""45-49"").  * The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. * If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. * If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

# Configure OAuth2 access token for authorization: client_credentials
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account.
$AdIds = "MyAdIds" # String[] | List of Ad Ids to use to filter the results.
$StartDate = (Get-Date) # System.DateTime | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
$EndDate = (Get-Date) # System.DateTime | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
$TargetingTypes = "KEYWORD" # AdsAnalyticsAdTargetingType[] | Targeting type breakdowns for the report. The reporting per targeting type is independent from each other. [""AGE_BUCKET_AND_GENDER""] is in BETA and not yet available to all users.
$Columns = "SPEND_IN_MICRO_DOLLAR" # ReportingColumnSync[] | Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.  For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned.
$Granularity = "TOTAL" # Granularity |   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly
$ClickWindowDays = "0" # ConversionAttributionWindowDays | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. (optional)
$EngagementWindowDays = "0" # ConversionAttributionWindowDays | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.  **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. (optional)
$ViewWindowDays = "0" # ConversionAttributionWindowDays | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day. (optional)
$ConversionReportTime = "TIME_OF_AD_ACTION" # ConversionReportTimeType | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. (optional)
$AttributionTypes = "INDIVIDUAL" # ConversionReportAttributionType[] | List of types of attribution for the conversion report (optional)
$ReportingTimezone = "PINTEREST_TIME_ZONE" # ReportingTimeZone | Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users. (optional)
$SortColumns = "MySortColumns" # String[] | Sort Columns. (optional)
$SortAscending = $true # Boolean | Sort ascending. (optional)

# Get targeting analytics for ads
try {
    $Result = Invoke-AdTargetingAnalyticsGet -AdAccountId $AdAccountId -AdIds $AdIds -StartDate $StartDate -EndDate $EndDate -TargetingTypes $TargetingTypes -Columns $Columns -Granularity $Granularity -ClickWindowDays $ClickWindowDays -EngagementWindowDays $EngagementWindowDays -ViewWindowDays $ViewWindowDays -ConversionReportTime $ConversionReportTime -AttributionTypes $AttributionTypes -ReportingTimezone $ReportingTimezone -SortColumns $SortColumns -SortAscending $SortAscending
} catch {
    Write-Host ("Exception occurred when calling Invoke-AdTargetingAnalyticsGet: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **AdAccountId** | **String**| Unique identifier of an ad account. | 
 **AdIds** | [**String[]**](String.md)| List of Ad Ids to use to filter the results. | 
 **StartDate** | **System.DateTime**| Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | 
 **EndDate** | **System.DateTime**| Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | 
 **TargetingTypes** | [**AdsAnalyticsAdTargetingType[]**](AdsAnalyticsAdTargetingType.md)| Targeting type breakdowns for the report. The reporting per targeting type is independent from each other. [&quot;&quot;AGE_BUCKET_AND_GENDER&quot;&quot;] is in BETA and not yet available to all users. | 
 **Columns** | [**ReportingColumnSync[]**](ReportingColumnSync.md)| Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.  For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned. | 
 **Granularity** | [**Granularity**](Granularity.md)|   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly | 
 **ClickWindowDays** | [**ConversionAttributionWindowDays**](ConversionAttributionWindowDays.md)| Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] 
 **EngagementWindowDays** | [**ConversionAttributionWindowDays**](ConversionAttributionWindowDays.md)| Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.  **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. | [optional] 
 **ViewWindowDays** | [**ConversionAttributionWindowDays**](ConversionAttributionWindowDays.md)| Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional] 
 **ConversionReportTime** | [**ConversionReportTimeType**](ConversionReportTimeType.md)| The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] 
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

<a id="Invoke-AdsAnalytics"></a>
# **Invoke-AdsAnalytics**
> AdsAnalytics[] Invoke-AdsAnalytics<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-StartDate] <System.DateTime><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-EndDate] <System.DateTime><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Columns] <PSCustomObject[]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Granularity] <PSCustomObject><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-PinIds] <String[]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdIds] <String[]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ClickWindowDays] <System.Nullable[Decimal]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-EngagementWindowDays] <System.Nullable[Decimal]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ViewWindowDays] <System.Nullable[Decimal]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ConversionReportTime] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-CampaignIds] <String[]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ReportingTimezone] <PSCustomObject><br>

Get ad analytics

    Get analytics for the specified ads in the specified `ad_account_id`, filtered by the specified options.     - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager.     - The request must contain either ad_ids or both campaign_ids and pin_ids.     - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days.     - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.

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
$Columns = "SPEND_IN_MICRO_DOLLAR" # ReportingColumnSync[] | Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.  For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned.
$Granularity = "TOTAL" # Granularity |   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly
$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account.
$PinIds = "MyPinIds" # String[] | List of Pin IDs. (optional)
$AdIds = "MyAdIds" # String[] | List of Ad Ids to use to filter the results. (optional)
$ClickWindowDays = "0" # Decimal | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. (optional) (default to 30)
$EngagementWindowDays = "0" # Decimal | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. (optional) (default to 30)
$ViewWindowDays = "0" # Decimal | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day. (optional) (default to 1)
$ConversionReportTime = "TIME_OF_AD_ACTION" # String | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. (optional) (default to "TIME_OF_AD_ACTION")
$CampaignIds = "MyCampaignIds" # String[] | List of Campaign Ids to use to filter the results. (optional)
$ReportingTimezone = "PINTEREST_TIME_ZONE" # ReportingTimeZone | Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users. (optional)

# Get ad analytics
try {
    $Result = Invoke-AdsAnalytics -StartDate $StartDate -EndDate $EndDate -Columns $Columns -Granularity $Granularity -AdAccountId $AdAccountId -PinIds $PinIds -AdIds $AdIds -ClickWindowDays $ClickWindowDays -EngagementWindowDays $EngagementWindowDays -ViewWindowDays $ViewWindowDays -ConversionReportTime $ConversionReportTime -CampaignIds $CampaignIds -ReportingTimezone $ReportingTimezone
} catch {
    Write-Host ("Exception occurred when calling Invoke-AdsAnalytics: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **StartDate** | **System.DateTime**| Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | 
 **EndDate** | **System.DateTime**| Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | 
 **Columns** | [**ReportingColumnSync[]**](ReportingColumnSync.md)| Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.  For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned. | 
 **Granularity** | [**Granularity**](Granularity.md)|   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly | 
 **AdAccountId** | **String**| Unique identifier of an ad account. | 
 **PinIds** | [**String[]**](String.md)| List of Pin IDs. | [optional] 
 **AdIds** | [**String[]**](String.md)| List of Ad Ids to use to filter the results. | [optional] 
 **ClickWindowDays** | **Decimal**| Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30]
 **EngagementWindowDays** | **Decimal**| Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. | [optional] [default to 30]
 **ViewWindowDays** | **Decimal**| Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional] [default to 1]
 **ConversionReportTime** | **String**| The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] [default to &quot;TIME_OF_AD_ACTION&quot;]
 **CampaignIds** | [**String[]**](String.md)| List of Campaign Ids to use to filter the results. | [optional] 
 **ReportingTimezone** | [**ReportingTimeZone**](ReportingTimeZone.md)| Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users. | [optional] 

### Return type

[**AdsAnalytics[]**](AdsAnalytics.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-AdsCreate"></a>
# **Invoke-AdsCreate**
> AdBatchWriteResponseModel Invoke-AdsCreate<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdCreate] <PSCustomObject[]><br>

Create ads

Create multiple new ads. Request must contain ad_group_id, creative_type, and the source Pin pin_id.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account.
$QuizPinOption = Initialize-QuizPinOption -Id 0 -Text "MyText"
$QuizPinQuestion = Initialize-QuizPinQuestion -Options $QuizPinOption -QuestionId 0 -QuestionText "MyQuestionText"

$QuizPinResult = Initialize-QuizPinResult -AndroidDeepLink "MyAndroidDeepLink" -DestinationUrl "MyDestinationUrl" -IosDeepLink "MyIosDeepLink" -OrganicPinId "MyOrganicPinId" -ResultId 0
$QuizPinData = Initialize-QuizPinData -Questions $QuizPinQuestion -Results $QuizPinResult -TieBreakerCustomResult $QuizPinResult -TieBreakerType "RANDOM"

$TrackingUrls = Initialize-TrackingUrls -AudienceVerification "MyAudienceVerification" -BuyableButton "MyBuyableButton" -Click "MyClick" -Engagement "MyEngagement" -Impression "MyImpression"
$AdCreate = Initialize-AdCreate -AdGroupId "MyAdGroupId" -AndroidDeepLink "MyAndroidDeepLink" -CarouselAndroidDeepLinks "MyCarouselAndroidDeepLinks" -CarouselDestinationUrls "MyCarouselDestinationUrls" -CarouselIosDeepLinks "MyCarouselIosDeepLinks" -ClickTrackingUrl "MyClickTrackingUrl" -CollectionItemsDestinationUrlTemplate "MyCollectionItemsDestinationUrlTemplate" -CollectionsHeaderType "SHOP_THIS_COLLECTION" -CreativeType "REGULAR" -CustomizableCtaType "GET_OFFER" -DestinationUrl "MyDestinationUrl" -DisclosureType "NO_DISCLOSURE" -DisclosureUrl "MyDisclosureUrl" -GridClickType "CLOSEUP" -IosDeepLink "MyIosDeepLink" -IsCarting $false -IsCollageAcceptedTerms $false -IsCollageSingleDestination $false -IsPinDeleted $false -IsRemovable $false -LeadFormId "MyLeadFormId" -Name "MyName" -PinId "MyPinId" -QuizPinData $QuizPinData -Status "ACTIVE" -TrackingUrls $TrackingUrls -ViewTrackingUrl "MyViewTrackingUrl" # AdCreate[] | 

# Create ads
try {
    $Result = Invoke-AdsCreate -AdAccountId $AdAccountId -AdCreate $AdCreate
} catch {
    Write-Host ("Exception occurred when calling Invoke-AdsCreate: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **AdAccountId** | **String**| Unique identifier of an ad account. | 
 **AdCreate** | [**AdCreate[]**](AdCreate.md)|  | 

### Return type

[**AdBatchWriteResponseModel**](AdBatchWriteResponseModel.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-AdsGet"></a>
# **Invoke-AdsGet**
> Ad Invoke-AdsGet<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>

Get ad

Get a specific ad given the ad ID. If your pin is rejected, rejected_reasons will contain additional information from the Ad Review process. For more information about our policies and rejection reasons see the [Pinterest advertising standards](https://www.pinterest.com/_/_/policy/advertising-guidelines/).

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

# Configure OAuth2 access token for authorization: client_credentials
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$AdId = "MyAdId" # String | The ID of this ad.
$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account.

# Get ad
try {
    $Result = Invoke-AdsGet -AdId $AdId -AdAccountId $AdAccountId
} catch {
    Write-Host ("Exception occurred when calling Invoke-AdsGet: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **AdId** | **String**| The ID of this ad. | 
 **AdAccountId** | **String**| Unique identifier of an ad account. | 

### Return type

[**Ad**](Ad.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-AdsList"></a>
# **Invoke-AdsList**
> AdsList200Response Invoke-AdsList<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Bookmark] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-PageSize] <System.Nullable[Int32]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Order] <PSCustomObject><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-CampaignIds] <String[]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdGroupIds] <String[]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdIds] <String[]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-EntityStatuses] <PSCustomObject[]><br>

List ads

List ads that meet the filters provided:     - Listed campaign ids or ad group ids or ad ids     - Listed entity statuses  If no filter is provided, all ads in the ad account are returned.  **Note:** Provide only `campaign_id` or `ad_group_id` or `ad_id`. Do not provide more than one type.  Review status is provided for each ad; if `review_status` is `REJECTED`, the `rejected_reasons` field will contain additional information.  For more, see [Pinterest advertising standards](https://policy.pinterest.com/en/advertising-guidelines).

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
$AdIds = "MyAdIds" # String[] | List of Ad Ids to use to filter the results. (optional)
$EntityStatuses = "ACTIVE" # EntityStatus[] | Entity status (optional)

# List ads
try {
    $Result = Invoke-AdsList -AdAccountId $AdAccountId -Bookmark $Bookmark -PageSize $PageSize -Order $Order -CampaignIds $CampaignIds -AdGroupIds $AdGroupIds -AdIds $AdIds -EntityStatuses $EntityStatuses
} catch {
    Write-Host ("Exception occurred when calling Invoke-AdsList: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
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
 **AdIds** | [**String[]**](String.md)| List of Ad Ids to use to filter the results. | [optional] 
 **EntityStatuses** | [**EntityStatus[]**](EntityStatus.md)| Entity status | [optional] 

### Return type

[**AdsList200Response**](AdsList200Response.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-AdsUpdate"></a>
# **Invoke-AdsUpdate**
> AdBatchWriteResponseModel Invoke-AdsUpdate<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdBatchUpdate] <PSCustomObject[]><br>

Update ads

Update multiple existing ads

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account.
$QuizPinOption = Initialize-QuizPinOption -Id 0 -Text "MyText"
$QuizPinQuestion = Initialize-QuizPinQuestion -Options $QuizPinOption -QuestionId 0 -QuestionText "MyQuestionText"

$QuizPinResult = Initialize-QuizPinResult -AndroidDeepLink "MyAndroidDeepLink" -DestinationUrl "MyDestinationUrl" -IosDeepLink "MyIosDeepLink" -OrganicPinId "MyOrganicPinId" -ResultId 0
$QuizPinData = Initialize-QuizPinData -Questions $QuizPinQuestion -Results $QuizPinResult -TieBreakerCustomResult $QuizPinResult -TieBreakerType "RANDOM"

$TrackingUrls = Initialize-TrackingUrls -AudienceVerification "MyAudienceVerification" -BuyableButton "MyBuyableButton" -Click "MyClick" -Engagement "MyEngagement" -Impression "MyImpression"
$AdBatchUpdate = Initialize-AdBatchUpdate -AdGroupId "MyAdGroupId" -AndroidDeepLink "MyAndroidDeepLink" -CarouselAndroidDeepLinks "MyCarouselAndroidDeepLinks" -CarouselDestinationUrls "MyCarouselDestinationUrls" -CarouselIosDeepLinks "MyCarouselIosDeepLinks" -ClickTrackingUrl "MyClickTrackingUrl" -CollectionItemsDestinationUrlTemplate "MyCollectionItemsDestinationUrlTemplate" -CollectionsHeaderType "SHOP_THIS_COLLECTION" -CreativeType "REGULAR" -CustomizableCtaType "GET_OFFER" -DestinationUrl "MyDestinationUrl" -DisclosureType "NO_DISCLOSURE" -DisclosureUrl "MyDisclosureUrl" -GridClickType "CLOSEUP" -Id "MyId" -IosDeepLink "MyIosDeepLink" -IsCarting $false -IsCollageAcceptedTerms $false -IsCollageSingleDestination $false -IsPinDeleted $false -IsRemovable $false -LeadFormId "MyLeadFormId" -Name "MyName" -PinId "MyPinId" -QuizPinData $QuizPinData -Status "ACTIVE" -TrackingUrls $TrackingUrls -ViewTrackingUrl "MyViewTrackingUrl" # AdBatchUpdate[] | 

# Update ads
try {
    $Result = Invoke-AdsUpdate -AdAccountId $AdAccountId -AdBatchUpdate $AdBatchUpdate
} catch {
    Write-Host ("Exception occurred when calling Invoke-AdsUpdate: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **AdAccountId** | **String**| Unique identifier of an ad account. | 
 **AdBatchUpdate** | [**AdBatchUpdate[]**](AdBatchUpdate.md)|  | 

### Return type

[**AdBatchWriteResponseModel**](AdBatchWriteResponseModel.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-CampaignAdPreviewCreate"></a>
# **Invoke-CampaignAdPreviewCreate**
> CampaignAdPreviewCreate200ResponseInner[] Invoke-CampaignAdPreviewCreate<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-CampaignAdPreviewCreate] <PSCustomObject[]><br>

Create ad preview records for one or more ad groups

Create ad preview records for one or more ad groups that can be shared. Each ad group is processed independently; individual failures do not block other previews.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account.
$CampaignAdPreviewCreate = Initialize-CampaignAdPreviewCreate -AdGroupId "1234567890" # CampaignAdPreviewCreate[] | 

# Create ad preview records for one or more ad groups
try {
    $Result = Invoke-CampaignAdPreviewCreate -AdAccountId $AdAccountId -CampaignAdPreviewCreate $CampaignAdPreviewCreate
} catch {
    Write-Host ("Exception occurred when calling Invoke-CampaignAdPreviewCreate: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **AdAccountId** | **String**| Unique identifier of an ad account. | 
 **CampaignAdPreviewCreate** | [**CampaignAdPreviewCreate[]**](CampaignAdPreviewCreate.md)|  | 

### Return type

[**CampaignAdPreviewCreate200ResponseInner[]**](CampaignAdPreviewCreate200ResponseInner.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-CampaignAdPreviewDelete"></a>
# **Invoke-CampaignAdPreviewDelete**
> CampaignAdPreviewDelete200ResponseInner[] Invoke-CampaignAdPreviewDelete<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdGroupIds] <String[]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>

Delete ad preview records for one or more ad groups

Delete ad preview records for one or more ad groups. All ad groups are validated before deleting any records.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$AdGroupIds = "MyAdGroupIds" # String[] | List of Ad group Ids to use to filter the results.
$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account.

# Delete ad preview records for one or more ad groups
try {
    $Result = Invoke-CampaignAdPreviewDelete -AdGroupIds $AdGroupIds -AdAccountId $AdAccountId
} catch {
    Write-Host ("Exception occurred when calling Invoke-CampaignAdPreviewDelete: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **AdGroupIds** | [**String[]**](String.md)| List of Ad group Ids to use to filter the results. | 
 **AdAccountId** | **String**| Unique identifier of an ad account. | 

### Return type

[**CampaignAdPreviewDelete200ResponseInner[]**](CampaignAdPreviewDelete200ResponseInner.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-CampaignAdPreviewRead"></a>
# **Invoke-CampaignAdPreviewRead**
> CampaignAdPreview[] Invoke-CampaignAdPreviewRead<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdGroupIds] <String[]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>

Fetch ad preview records for one or more ad groups

Fetch ad preview records for one or more ad groups. Returns all active previews associated with the provided ad group IDs.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$AdGroupIds = "MyAdGroupIds" # String[] | List of Ad group Ids to use to filter the results.
$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account.

# Fetch ad preview records for one or more ad groups
try {
    $Result = Invoke-CampaignAdPreviewRead -AdGroupIds $AdGroupIds -AdAccountId $AdAccountId
} catch {
    Write-Host ("Exception occurred when calling Invoke-CampaignAdPreviewRead: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **AdGroupIds** | [**String[]**](String.md)| List of Ad group Ids to use to filter the results. | 
 **AdAccountId** | **String**| Unique identifier of an ad account. | 

### Return type

[**CampaignAdPreview[]**](CampaignAdPreview.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

