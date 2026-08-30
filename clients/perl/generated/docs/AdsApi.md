# WWW::OpenAPIClient::AdsApi

## Load the API package
```perl
use WWW::OpenAPIClient::Object::AdsApi;
```

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ad_previews_create**](AdsApi.md#ad_previews_create) | **POST** /ad_accounts/{ad_account_id}/ad_previews | Create ad preview with pin or image
[**ad_targeting_analytics_get**](AdsApi.md#ad_targeting_analytics_get) | **GET** /ad_accounts/{ad_account_id}/ads/targeting_analytics | Get targeting analytics for ads
[**ads_analytics**](AdsApi.md#ads_analytics) | **GET** /ad_accounts/{ad_account_id}/ads/analytics | Get ad analytics
[**ads_create**](AdsApi.md#ads_create) | **POST** /ad_accounts/{ad_account_id}/ads | Create ads
[**ads_get**](AdsApi.md#ads_get) | **GET** /ad_accounts/{ad_account_id}/ads/{ad_id} | Get ad
[**ads_list**](AdsApi.md#ads_list) | **GET** /ad_accounts/{ad_account_id}/ads | List ads
[**ads_update**](AdsApi.md#ads_update) | **PATCH** /ad_accounts/{ad_account_id}/ads | Update ads
[**campaign_ad_preview_create**](AdsApi.md#campaign_ad_preview_create) | **POST** /ad_accounts/{ad_account_id}/campaign_ad_preview | Create ad preview records for one or more ad groups
[**campaign_ad_preview_delete**](AdsApi.md#campaign_ad_preview_delete) | **DELETE** /ad_accounts/{ad_account_id}/campaign_ad_preview | Delete ad preview records for one or more ad groups
[**campaign_ad_preview_read**](AdsApi.md#campaign_ad_preview_read) | **GET** /ad_accounts/{ad_account_id}/campaign_ad_preview | Fetch ad preview records for one or more ad groups


# **ad_previews_create**
> AdPreviewURLResponse ad_previews_create(ad_account_id => $ad_account_id, ad_preview_request => $ad_preview_request)

Create ad preview with pin or image

Create an ad preview given an ad account ID and either an existing organic pin ID or the URL for an image to be used to create the Pin and the ad.  If you are creating a preview from an existing Pin, that Pin must be promotable: that is, it must have a clickthrough link and meet other requirements. (See [Ads Overview](https://help.pinterest.com/en/business/article/promoted-pins-overview).)  You can view the returned preview URL on a webpage or iframe for 7 days, after which the URL expires. Collection ads are not currently supported ad preview.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::AdsApi;
my $api_instance = WWW::OpenAPIClient::AdsApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $ad_account_id = "ad_account_id_example"; # string | Unique identifier of an ad account.
my $ad_preview_request = WWW::OpenAPIClient::Object::AdPreviewRequest->new(); # AdPreviewRequest | 

eval {
    my $result = $api_instance->ad_previews_create(ad_account_id => $ad_account_id, ad_preview_request => $ad_preview_request);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling AdsApi->ad_previews_create: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **string**| Unique identifier of an ad account. | 
 **ad_preview_request** | [**AdPreviewRequest**](AdPreviewRequest.md)|  | 

### Return type

[**AdPreviewURLResponse**](AdPreviewURLResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ad_targeting_analytics_get**
> MetricsResponse ad_targeting_analytics_get(ad_account_id => $ad_account_id, ad_ids => $ad_ids, start_date => $start_date, end_date => $end_date, targeting_types => $targeting_types, columns => $columns, granularity => $granularity, click_window_days => $click_window_days, engagement_window_days => $engagement_window_days, view_window_days => $view_window_days, conversion_report_time => $conversion_report_time, attribution_types => $attribution_types, reporting_timezone => $reporting_timezone, sort_columns => $sort_columns, sort_ascending => $sort_ascending)

Get targeting analytics for ads

Get targeting analytics for one or more ads. For the requested ad(s) and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \"age_bucket\") for applicable values (e.g. \"45-49\").  * The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. * If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. * If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::AdsApi;
my $api_instance = WWW::OpenAPIClient::AdsApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
    # Configure OAuth2 access token for authorization: client_credentials
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $ad_account_id = "ad_account_id_example"; # string | Unique identifier of an ad account.
my $ad_ids = [("null")]; # ARRAY[string] | List of Ad Ids to use to filter the results.
my $start_date = DateTime->from_epoch(epoch => str2time('null')); # DATE | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
my $end_date = DateTime->from_epoch(epoch => str2time('null')); # DATE | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
my $targeting_types = [(new WWW::OpenAPIClient.AdsAnalyticsAdTargetingType())]; # ARRAY[AdsAnalyticsAdTargetingType] | Targeting type breakdowns for the report. The reporting per targeting type is independent from each other. [\"AGE_BUCKET_AND_GENDER\"] is in BETA and not yet available to all users.
my $columns = [(new WWW::OpenAPIClient.ReportingColumnSync())]; # ARRAY[ReportingColumnSync] | Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.  For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned.
my $granularity = new WWW::OpenAPIClient.Granularity(); # Granularity |   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly
my $click_window_days = new WWW::OpenAPIClient.ConversionAttributionWindowDays(); # ConversionAttributionWindowDays | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
my $engagement_window_days = new WWW::OpenAPIClient.ConversionAttributionWindowDays(); # ConversionAttributionWindowDays | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.  **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**.
my $view_window_days = new WWW::OpenAPIClient.ConversionAttributionWindowDays(); # ConversionAttributionWindowDays | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.
my $conversion_report_time = new WWW::OpenAPIClient.ConversionReportTimeType(); # ConversionReportTimeType | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
my $attribution_types = [(new WWW::OpenAPIClient.ConversionReportAttributionType())]; # ARRAY[ConversionReportAttributionType] | List of types of attribution for the conversion report
my $reporting_timezone = new WWW::OpenAPIClient.ReportingTimeZone(); # ReportingTimeZone | Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users.
my $sort_columns = [("null")]; # ARRAY[string] | Sort Columns.
my $sort_ascending = null; # boolean | Sort ascending.

eval {
    my $result = $api_instance->ad_targeting_analytics_get(ad_account_id => $ad_account_id, ad_ids => $ad_ids, start_date => $start_date, end_date => $end_date, targeting_types => $targeting_types, columns => $columns, granularity => $granularity, click_window_days => $click_window_days, engagement_window_days => $engagement_window_days, view_window_days => $view_window_days, conversion_report_time => $conversion_report_time, attribution_types => $attribution_types, reporting_timezone => $reporting_timezone, sort_columns => $sort_columns, sort_ascending => $sort_ascending);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling AdsApi->ad_targeting_analytics_get: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **string**| Unique identifier of an ad account. | 
 **ad_ids** | [**ARRAY[string]**](string.md)| List of Ad Ids to use to filter the results. | 
 **start_date** | **DATE**| Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | 
 **end_date** | **DATE**| Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | 
 **targeting_types** | [**ARRAY[AdsAnalyticsAdTargetingType]**](AdsAnalyticsAdTargetingType.md)| Targeting type breakdowns for the report. The reporting per targeting type is independent from each other. [\&quot;AGE_BUCKET_AND_GENDER\&quot;] is in BETA and not yet available to all users. | 
 **columns** | [**ARRAY[ReportingColumnSync]**](ReportingColumnSync.md)| Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.  For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned. | 
 **granularity** | [**Granularity**](.md)|   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly | 
 **click_window_days** | [**ConversionAttributionWindowDays**](.md)| Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] 
 **engagement_window_days** | [**ConversionAttributionWindowDays**](.md)| Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.  **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. | [optional] 
 **view_window_days** | [**ConversionAttributionWindowDays**](.md)| Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional] 
 **conversion_report_time** | [**ConversionReportTimeType**](.md)| The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] 
 **attribution_types** | [**ARRAY[ConversionReportAttributionType]**](ConversionReportAttributionType.md)| List of types of attribution for the conversion report | [optional] 
 **reporting_timezone** | [**ReportingTimeZone**](.md)| Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users. | [optional] 
 **sort_columns** | [**ARRAY[string]**](string.md)| Sort Columns. | [optional] 
 **sort_ascending** | **boolean**| Sort ascending. | [optional] 

### Return type

[**MetricsResponse**](MetricsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ads_analytics**
> ARRAY[AdsAnalytics] ads_analytics(start_date => $start_date, end_date => $end_date, columns => $columns, granularity => $granularity, ad_account_id => $ad_account_id, pin_ids => $pin_ids, ad_ids => $ad_ids, click_window_days => $click_window_days, engagement_window_days => $engagement_window_days, view_window_days => $view_window_days, conversion_report_time => $conversion_report_time, campaign_ids => $campaign_ids, reporting_timezone => $reporting_timezone)

Get ad analytics

    Get analytics for the specified ads in the specified `ad_account_id`, filtered by the specified options.     - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager.     - The request must contain either ad_ids or both campaign_ids and pin_ids.     - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days.     - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::AdsApi;
my $api_instance = WWW::OpenAPIClient::AdsApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
    # Configure OAuth2 access token for authorization: client_credentials
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $start_date = DateTime->from_epoch(epoch => str2time('null')); # DATE | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
my $end_date = DateTime->from_epoch(epoch => str2time('null')); # DATE | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
my $columns = [(new WWW::OpenAPIClient.ReportingColumnSync())]; # ARRAY[ReportingColumnSync] | Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.  For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned.
my $granularity = new WWW::OpenAPIClient.Granularity(); # Granularity |   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly
my $ad_account_id = "ad_account_id_example"; # string | Unique identifier of an ad account.
my $pin_ids = [("null")]; # ARRAY[string] | List of Pin IDs.
my $ad_ids = [("null")]; # ARRAY[string] | List of Ad Ids to use to filter the results.
my $click_window_days = 30; # double | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
my $engagement_window_days = 30; # double | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**.
my $view_window_days = 1; # double | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.
my $conversion_report_time = 'TIME_OF_AD_ACTION'; # string | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
my $campaign_ids = [("null")]; # ARRAY[string] | List of Campaign Ids to use to filter the results.
my $reporting_timezone = new WWW::OpenAPIClient.ReportingTimeZone(); # ReportingTimeZone | Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users.

eval {
    my $result = $api_instance->ads_analytics(start_date => $start_date, end_date => $end_date, columns => $columns, granularity => $granularity, ad_account_id => $ad_account_id, pin_ids => $pin_ids, ad_ids => $ad_ids, click_window_days => $click_window_days, engagement_window_days => $engagement_window_days, view_window_days => $view_window_days, conversion_report_time => $conversion_report_time, campaign_ids => $campaign_ids, reporting_timezone => $reporting_timezone);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling AdsApi->ads_analytics: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **start_date** | **DATE**| Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | 
 **end_date** | **DATE**| Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | 
 **columns** | [**ARRAY[ReportingColumnSync]**](ReportingColumnSync.md)| Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.  For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned. | 
 **granularity** | [**Granularity**](.md)|   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly | 
 **ad_account_id** | **string**| Unique identifier of an ad account. | 
 **pin_ids** | [**ARRAY[string]**](string.md)| List of Pin IDs. | [optional] 
 **ad_ids** | [**ARRAY[string]**](string.md)| List of Ad Ids to use to filter the results. | [optional] 
 **click_window_days** | **double**| Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30]
 **engagement_window_days** | **double**| Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. | [optional] [default to 30]
 **view_window_days** | **double**| Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional] [default to 1]
 **conversion_report_time** | **string**| The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] [default to &#39;TIME_OF_AD_ACTION&#39;]
 **campaign_ids** | [**ARRAY[string]**](string.md)| List of Campaign Ids to use to filter the results. | [optional] 
 **reporting_timezone** | [**ReportingTimeZone**](.md)| Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users. | [optional] 

### Return type

[**ARRAY[AdsAnalytics]**](AdsAnalytics.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ads_create**
> AdBatchWriteResponseModel ads_create(ad_account_id => $ad_account_id, ad_create => $ad_create)

Create ads

Create multiple new ads. Request must contain ad_group_id, creative_type, and the source Pin pin_id.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::AdsApi;
my $api_instance = WWW::OpenAPIClient::AdsApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $ad_account_id = "ad_account_id_example"; # string | Unique identifier of an ad account.
my $ad_create = [WWW::OpenAPIClient::Object::ARRAY[AdCreate]->new()]; # ARRAY[AdCreate] | 

eval {
    my $result = $api_instance->ads_create(ad_account_id => $ad_account_id, ad_create => $ad_create);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling AdsApi->ads_create: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **string**| Unique identifier of an ad account. | 
 **ad_create** | [**ARRAY[AdCreate]**](AdCreate.md)|  | 

### Return type

[**AdBatchWriteResponseModel**](AdBatchWriteResponseModel.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ads_get**
> Ad ads_get(ad_id => $ad_id, ad_account_id => $ad_account_id)

Get ad

Get a specific ad given the ad ID. If your pin is rejected, rejected_reasons will contain additional information from the Ad Review process. For more information about our policies and rejection reasons see the [Pinterest advertising standards](https://www.pinterest.com/_/_/policy/advertising-guidelines/).

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::AdsApi;
my $api_instance = WWW::OpenAPIClient::AdsApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
    # Configure OAuth2 access token for authorization: client_credentials
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $ad_id = "ad_id_example"; # string | The ID of this ad.
my $ad_account_id = "ad_account_id_example"; # string | Unique identifier of an ad account.

eval {
    my $result = $api_instance->ads_get(ad_id => $ad_id, ad_account_id => $ad_account_id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling AdsApi->ads_get: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_id** | **string**| The ID of this ad. | 
 **ad_account_id** | **string**| Unique identifier of an ad account. | 

### Return type

[**Ad**](Ad.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ads_list**
> AdsList200Response ads_list(ad_account_id => $ad_account_id, bookmark => $bookmark, page_size => $page_size, order => $order, campaign_ids => $campaign_ids, ad_group_ids => $ad_group_ids, ad_ids => $ad_ids, entity_statuses => $entity_statuses)

List ads

List ads that meet the filters provided:     - Listed campaign ids or ad group ids or ad ids     - Listed entity statuses  If no filter is provided, all ads in the ad account are returned.  **Note:** Provide only `campaign_id` or `ad_group_id` or `ad_id`. Do not provide more than one type.  Review status is provided for each ad; if `review_status` is `REJECTED`, the `rejected_reasons` field will contain additional information.  For more, see [Pinterest advertising standards](https://policy.pinterest.com/en/advertising-guidelines).

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::AdsApi;
my $api_instance = WWW::OpenAPIClient::AdsApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
    # Configure OAuth2 access token for authorization: client_credentials
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $ad_account_id = "ad_account_id_example"; # string | Unique identifier of an ad account.
my $bookmark = "bookmark_example"; # string | Cursor used to fetch the next page of items
my $page_size = 25; # int | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
my $order = new WWW::OpenAPIClient.PinterestLibPaginationOrder(); # PinterestLibPaginationOrder | The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.
my $campaign_ids = [("null")]; # ARRAY[string] | List of Campaign Ids to use to filter the results.
my $ad_group_ids = [("null")]; # ARRAY[string] | List of Ad group Ids to retrieve keywords from. This feature is currently in BETA and is not available to all users.
my $ad_ids = [("null")]; # ARRAY[string] | List of Ad Ids to use to filter the results.
my $entity_statuses = [(new WWW::OpenAPIClient.EntityStatus())]; # ARRAY[EntityStatus] | Entity status

eval {
    my $result = $api_instance->ads_list(ad_account_id => $ad_account_id, bookmark => $bookmark, page_size => $page_size, order => $order, campaign_ids => $campaign_ids, ad_group_ids => $ad_group_ids, ad_ids => $ad_ids, entity_statuses => $entity_statuses);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling AdsApi->ads_list: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **string**| Unique identifier of an ad account. | 
 **bookmark** | **string**| Cursor used to fetch the next page of items | [optional] 
 **page_size** | **int**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]
 **order** | [**PinterestLibPaginationOrder**](.md)| The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] 
 **campaign_ids** | [**ARRAY[string]**](string.md)| List of Campaign Ids to use to filter the results. | [optional] 
 **ad_group_ids** | [**ARRAY[string]**](string.md)| List of Ad group Ids to retrieve keywords from. This feature is currently in BETA and is not available to all users. | [optional] 
 **ad_ids** | [**ARRAY[string]**](string.md)| List of Ad Ids to use to filter the results. | [optional] 
 **entity_statuses** | [**ARRAY[EntityStatus]**](EntityStatus.md)| Entity status | [optional] 

### Return type

[**AdsList200Response**](AdsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ads_update**
> AdBatchWriteResponseModel ads_update(ad_account_id => $ad_account_id, ad_batch_update => $ad_batch_update)

Update ads

Update multiple existing ads

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::AdsApi;
my $api_instance = WWW::OpenAPIClient::AdsApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $ad_account_id = "ad_account_id_example"; # string | Unique identifier of an ad account.
my $ad_batch_update = [WWW::OpenAPIClient::Object::ARRAY[AdBatchUpdate]->new()]; # ARRAY[AdBatchUpdate] | 

eval {
    my $result = $api_instance->ads_update(ad_account_id => $ad_account_id, ad_batch_update => $ad_batch_update);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling AdsApi->ads_update: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **string**| Unique identifier of an ad account. | 
 **ad_batch_update** | [**ARRAY[AdBatchUpdate]**](AdBatchUpdate.md)|  | 

### Return type

[**AdBatchWriteResponseModel**](AdBatchWriteResponseModel.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **campaign_ad_preview_create**
> ARRAY[CampaignAdPreviewCreate200ResponseInner] campaign_ad_preview_create(ad_account_id => $ad_account_id, campaign_ad_preview_create => $campaign_ad_preview_create)

Create ad preview records for one or more ad groups

Create ad preview records for one or more ad groups that can be shared. Each ad group is processed independently; individual failures do not block other previews.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::AdsApi;
my $api_instance = WWW::OpenAPIClient::AdsApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $ad_account_id = "ad_account_id_example"; # string | Unique identifier of an ad account.
my $campaign_ad_preview_create = [WWW::OpenAPIClient::Object::ARRAY[CampaignAdPreviewCreate]->new()]; # ARRAY[CampaignAdPreviewCreate] | 

eval {
    my $result = $api_instance->campaign_ad_preview_create(ad_account_id => $ad_account_id, campaign_ad_preview_create => $campaign_ad_preview_create);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling AdsApi->campaign_ad_preview_create: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **string**| Unique identifier of an ad account. | 
 **campaign_ad_preview_create** | [**ARRAY[CampaignAdPreviewCreate]**](CampaignAdPreviewCreate.md)|  | 

### Return type

[**ARRAY[CampaignAdPreviewCreate200ResponseInner]**](CampaignAdPreviewCreate200ResponseInner.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **campaign_ad_preview_delete**
> ARRAY[CampaignAdPreviewDelete200ResponseInner] campaign_ad_preview_delete(ad_group_ids => $ad_group_ids, ad_account_id => $ad_account_id)

Delete ad preview records for one or more ad groups

Delete ad preview records for one or more ad groups. All ad groups are validated before deleting any records.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::AdsApi;
my $api_instance = WWW::OpenAPIClient::AdsApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $ad_group_ids = [("null")]; # ARRAY[string] | List of Ad group Ids to use to filter the results.
my $ad_account_id = "ad_account_id_example"; # string | Unique identifier of an ad account.

eval {
    my $result = $api_instance->campaign_ad_preview_delete(ad_group_ids => $ad_group_ids, ad_account_id => $ad_account_id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling AdsApi->campaign_ad_preview_delete: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_group_ids** | [**ARRAY[string]**](string.md)| List of Ad group Ids to use to filter the results. | 
 **ad_account_id** | **string**| Unique identifier of an ad account. | 

### Return type

[**ARRAY[CampaignAdPreviewDelete200ResponseInner]**](CampaignAdPreviewDelete200ResponseInner.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **campaign_ad_preview_read**
> ARRAY[CampaignAdPreview] campaign_ad_preview_read(ad_group_ids => $ad_group_ids, ad_account_id => $ad_account_id)

Fetch ad preview records for one or more ad groups

Fetch ad preview records for one or more ad groups. Returns all active previews associated with the provided ad group IDs.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::AdsApi;
my $api_instance = WWW::OpenAPIClient::AdsApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $ad_group_ids = [("null")]; # ARRAY[string] | List of Ad group Ids to use to filter the results.
my $ad_account_id = "ad_account_id_example"; # string | Unique identifier of an ad account.

eval {
    my $result = $api_instance->campaign_ad_preview_read(ad_group_ids => $ad_group_ids, ad_account_id => $ad_account_id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling AdsApi->campaign_ad_preview_read: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_group_ids** | [**ARRAY[string]**](string.md)| List of Ad group Ids to use to filter the results. | 
 **ad_account_id** | **string**| Unique identifier of an ad account. | 

### Return type

[**ARRAY[CampaignAdPreview]**](CampaignAdPreview.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

