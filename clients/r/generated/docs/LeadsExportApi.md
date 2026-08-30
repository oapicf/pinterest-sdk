# LeadsExportApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**LeadsExportCreate**](LeadsExportApi.md#LeadsExportCreate) | **POST** /ad_accounts/{ad_account_id}/leads_export | Create a request to export leads collected from a lead ad
[**LeadsExportGet**](LeadsExportApi.md#LeadsExportGet) | **GET** /ad_accounts/{ad_account_id}/leads_export/{leads_export_id} | Get the lead export from the lead export create call


# **LeadsExportCreate**
> LeadsExports LeadsExportCreate(ad_account_id, leads_exports_create)

Create a request to export leads collected from a lead ad

**This feature is currently in beta and not available to all apps. If you're interested in joining the beta, please reach out to your Pinterest account manager.**  Create an export of leads collected from a lead ad. This returns a `leads_export_id` token that you can use to download the export when it is ready.  Note: Lead ad data will be available up to 30 days after the lead has been submitted.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).

### Example
```R
library(openapi)

# Create a request to export leads collected from a lead ad
#
# prepare function argument(s)
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account.
var_leads_exports_create <- LeadsExportsCreate$new("ad_id_example", "end_date_example", "start_date_example") # LeadsExportsCreate | 

api_instance <- LeadsExportApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$LeadsExportCreate(var_ad_account_id, var_leads_exports_createdata_file = "result.txt")
result <- api_instance$LeadsExportCreate(var_ad_account_id, var_leads_exports_create)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **character**| Unique identifier of an ad account. | 
 **leads_exports_create** | [**LeadsExportsCreate**](LeadsExportsCreate.md)|  | 

### Return type

[**LeadsExports**](LeadsExports.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **201** | Resource create operation completed successfully. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **0** | An unexpected error response. |  -  |

# **LeadsExportGet**
> LeadsExportResponseData LeadsExportGet(ad_account_id, leads_export_id)

Get the lead export from the lead export create call

**This feature is currently in beta and not available to all apps. If you're interested in joining the beta, please reach out to your Pinterest account manager.**  Get the export of leads collected from a lead ad. This returns a URL to a list of lead export given a lead_export_id token returned from the create a lead export call. You can use the URL to download the report.  Note: Lead ad data will be available up to 30 days after the lead has been submitted.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).

### Example
```R
library(openapi)

# Get the lead export from the lead export create call
#
# prepare function argument(s)
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account.
var_leads_export_id <- "leads_export_id_example" # character | lead_export_id token returned from the create a lead export endpoint

api_instance <- LeadsExportApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$LeadsExportGet(var_ad_account_id, var_leads_export_iddata_file = "result.txt")
result <- api_instance$LeadsExportGet(var_ad_account_id, var_leads_export_id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **character**| Unique identifier of an ad account. | 
 **leads_export_id** | **character**| lead_export_id token returned from the create a lead export endpoint | 

### Return type

[**LeadsExportResponseData**](LeadsExportResponseData.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **0** | An unexpected error response. |  -  |

