# PinterestSdkClient::CatalogReportsApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**reports_create**](CatalogReportsApi.md#reports_create) | **POST** /catalogs/reports | Build catalogs report |
| [**reports_get**](CatalogReportsApi.md#reports_get) | **GET** /catalogs/reports | Get catalogs report |
| [**reports_stats**](CatalogReportsApi.md#reports_stats) | **GET** /catalogs/reports/stats | List report stats |


## reports_create

> <CatalogsCreateReportResponse> reports_create(catalogs_report_parameters, opts)

Build catalogs report

Async request to create a report of the catalog owned by the \"operation user_account\". This endpoint generates a report upon receiving the first approved request of the day. Any following requests with identical parameters will yield the same report even if data has changed. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  Note: The All Items report is limited to 25 million items per catalog.

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::CatalogReportsApi.new
catalogs_report_parameters = PinterestSdkClient::CatalogsHotelReportParameters.new({catalog_type: 'HOTEL', report: PinterestSdkClient::CatalogsReportDistributionIssueFilter.new({report_type: 'DISTRIBUTION_ISSUES'})}) # CatalogsReportParameters | 
opts = {
  ad_account_id: 'ad_account_id_example' # String | Unique identifier of an ad account.
}

begin
  # Build catalogs report
  result = api_instance.reports_create(catalogs_report_parameters, opts)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling CatalogReportsApi->reports_create: #{e}"
end
```

#### Using the reports_create_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<CatalogsCreateReportResponse>, Integer, Hash)> reports_create_with_http_info(catalogs_report_parameters, opts)

```ruby
begin
  # Build catalogs report
  data, status_code, headers = api_instance.reports_create_with_http_info(catalogs_report_parameters, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <CatalogsCreateReportResponse>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling CatalogReportsApi->reports_create_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **catalogs_report_parameters** | [**CatalogsReportParameters**](CatalogsReportParameters.md) |  |  |
| **ad_account_id** | **String** | Unique identifier of an ad account. | [optional] |

### Return type

[**CatalogsCreateReportResponse**](CatalogsCreateReportResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## reports_get

> <CatalogsReport> reports_get(token, opts)

Get catalogs report

This returns a URL to a report given a token returned from [Build catalogs report](/docs/api/v5/#operation/reports/create). You can use the URL to download the report. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::CatalogReportsApi.new
token = 'token_example' # String | Token returned from the post request creation call
opts = {
  ad_account_id: 'ad_account_id_example' # String | Unique identifier of an ad account.
}

begin
  # Get catalogs report
  result = api_instance.reports_get(token, opts)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling CatalogReportsApi->reports_get: #{e}"
end
```

#### Using the reports_get_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<CatalogsReport>, Integer, Hash)> reports_get_with_http_info(token, opts)

```ruby
begin
  # Get catalogs report
  data, status_code, headers = api_instance.reports_get_with_http_info(token, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <CatalogsReport>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling CatalogReportsApi->reports_get_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **token** | **String** | Token returned from the post request creation call |  |
| **ad_account_id** | **String** | Unique identifier of an ad account. | [optional] |

### Return type

[**CatalogsReport**](CatalogsReport.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## reports_stats

> <ReportsStats200Response> reports_stats(parameters, opts)

List report stats

List aggregated numbers of issues for a catalog owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::CatalogReportsApi.new
parameters = { ... } # CatalogsReportStatsParameters | Contains the parameters for report identification.
opts = {
  ad_account_id: 'ad_account_id_example', # String | Unique identifier of an ad account.
  bookmark: 'bookmark_example', # String | Cursor used to fetch the next page of items
  page_size: 56 # Integer | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
}

begin
  # List report stats
  result = api_instance.reports_stats(parameters, opts)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling CatalogReportsApi->reports_stats: #{e}"
end
```

#### Using the reports_stats_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<ReportsStats200Response>, Integer, Hash)> reports_stats_with_http_info(parameters, opts)

```ruby
begin
  # List report stats
  data, status_code, headers = api_instance.reports_stats_with_http_info(parameters, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <ReportsStats200Response>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling CatalogReportsApi->reports_stats_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **parameters** | [**CatalogsReportStatsParameters**](.md) | Contains the parameters for report identification. |  |
| **ad_account_id** | **String** | Unique identifier of an ad account. | [optional] |
| **bookmark** | **String** | Cursor used to fetch the next page of items | [optional] |
| **page_size** | **Integer** | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional][default to 25] |

### Return type

[**ReportsStats200Response**](ReportsStats200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

