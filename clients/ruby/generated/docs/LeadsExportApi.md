# PinterestSdkClient::LeadsExportApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**leads_export_create**](LeadsExportApi.md#leads_export_create) | **POST** /ad_accounts/{ad_account_id}/leads_export | Create a request to export leads collected from a lead ad |
| [**leads_export_get**](LeadsExportApi.md#leads_export_get) | **GET** /ad_accounts/{ad_account_id}/leads_export/{leads_export_id} | Get the lead export from the lead export create call |


## leads_export_create

> <LeadsExports> leads_export_create(ad_account_id, leads_exports_create)

Create a request to export leads collected from a lead ad

**This feature is currently in beta and not available to all apps. If you're interested in joining the beta, please reach out to your Pinterest account manager.**  Create an export of leads collected from a lead ad. This returns a `leads_export_id` token that you can use to download the export when it is ready.  Note: Lead ad data will be available up to 30 days after the lead has been submitted.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::LeadsExportApi.new
ad_account_id = 'ad_account_id_example' # String | Unique identifier of an ad account.
leads_exports_create = PinterestSdkClient::LeadsExportsCreate.new({ad_id: '687201361754', end_date: '2020-12-20', start_date: '2020-12-20'}) # LeadsExportsCreate | 

begin
  # Create a request to export leads collected from a lead ad
  result = api_instance.leads_export_create(ad_account_id, leads_exports_create)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling LeadsExportApi->leads_export_create: #{e}"
end
```

#### Using the leads_export_create_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<LeadsExports>, Integer, Hash)> leads_export_create_with_http_info(ad_account_id, leads_exports_create)

```ruby
begin
  # Create a request to export leads collected from a lead ad
  data, status_code, headers = api_instance.leads_export_create_with_http_info(ad_account_id, leads_exports_create)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <LeadsExports>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling LeadsExportApi->leads_export_create_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_account_id** | **String** | Unique identifier of an ad account. |  |
| **leads_exports_create** | [**LeadsExportsCreate**](LeadsExportsCreate.md) |  |  |

### Return type

[**LeadsExports**](LeadsExports.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## leads_export_get

> <LeadsExportResponseData> leads_export_get(ad_account_id, leads_export_id)

Get the lead export from the lead export create call

**This feature is currently in beta and not available to all apps. If you're interested in joining the beta, please reach out to your Pinterest account manager.**  Get the export of leads collected from a lead ad. This returns a URL to a list of lead export given a lead_export_id token returned from the create a lead export call. You can use the URL to download the report.  Note: Lead ad data will be available up to 30 days after the lead has been submitted.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::LeadsExportApi.new
ad_account_id = 'ad_account_id_example' # String | Unique identifier of an ad account.
leads_export_id = 'leads_export_id_example' # String | lead_export_id token returned from the create a lead export endpoint

begin
  # Get the lead export from the lead export create call
  result = api_instance.leads_export_get(ad_account_id, leads_export_id)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling LeadsExportApi->leads_export_get: #{e}"
end
```

#### Using the leads_export_get_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<LeadsExportResponseData>, Integer, Hash)> leads_export_get_with_http_info(ad_account_id, leads_export_id)

```ruby
begin
  # Get the lead export from the lead export create call
  data, status_code, headers = api_instance.leads_export_get_with_http_info(ad_account_id, leads_export_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <LeadsExportResponseData>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling LeadsExportApi->leads_export_get_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_account_id** | **String** | Unique identifier of an ad account. |  |
| **leads_export_id** | **String** | lead_export_id token returned from the create a lead export endpoint |  |

### Return type

[**LeadsExportResponseData**](LeadsExportResponseData.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

