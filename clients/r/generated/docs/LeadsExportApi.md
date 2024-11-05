# LeadsExportApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**LeadsExportCreate**](LeadsExportApi.md#LeadsExportCreate) | **POST** /ad_accounts/{ad_account_id}/leads_export | Create a request to export leads collected from a lead ad
[**LeadsExportGet**](LeadsExportApi.md#LeadsExportGet) | **GET** /ad_accounts/{ad_account_id}/leads_export/{leads_export_id} | Get the lead export from the lead export create call


# **LeadsExportCreate**
> LeadsExportCreateResponse LeadsExportCreate(ad_account_id, leads_export_create_request)

Create a request to export leads collected from a lead ad

<strong>This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.</strong>  Create an export of leads collected from a lead ad. This returns a lead_export_id  token that you can use to download the export when it is ready.  Note: Lead ad data will be available up to 30 days after the lead has been submitted.  For more, see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/lead-ads\">Lead ads</a>.

### Example
```R
library(openapi)

# Create a request to export leads collected from a lead ad
#
# prepare function argument(s)
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account.
var_leads_export_create_request <- LeadsExportCreateRequest$new("start_date_example", "end_date_example", "ad_id_example") # LeadsExportCreateRequest | 

api_instance <- LeadsExportApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$LeadsExportCreate(var_ad_account_id, var_leads_export_create_requestdata_file = "result.txt")
result <- api_instance$LeadsExportCreate(var_ad_account_id, var_leads_export_create_request)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **character**| Unique identifier of an ad account. | 
 **leads_export_create_request** | [**LeadsExportCreateRequest**](LeadsExportCreateRequest.md)|  | 

### Return type

[**LeadsExportCreateResponse**](LeadsExportCreateResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Invalid ad account parameter. |  -  |
| **0** | Unexpected error |  -  |

# **LeadsExportGet**
> LeadsExportResponseData LeadsExportGet(ad_account_id, leads_export_id)

Get the lead export from the lead export create call

<strong>This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.</strong>  Get the export of leads collected from a lead ad. This returns a URL to a list of lead export given a lead_export_id token returned from the create a lead export call. You can use the URL to download the report.  Note: Lead ad data will be available up to 30 days after the lead has been submitted.  For more, see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/lead-ads\">Lead ads</a>.

### Example
```R
library(openapi)

# Get the lead export from the lead export create call
#
# prepare function argument(s)
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account.
var_leads_export_id <- "123755885175" # character | lead_export_id token returned from the create a lead export endpoint

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
| **200** | Success |  -  |
| **400** | Invalid ad account parameter. |  -  |
| **404** | Invalid leads export id parameter. |  -  |
| **0** | Unexpected error |  -  |

