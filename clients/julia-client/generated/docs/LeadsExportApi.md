# LeadsExportApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**leads_export_create**](LeadsExportApi.md#leads_export_create) | **POST** /ad_accounts/{ad_account_id}/leads_export | Create a request to export leads collected from a lead ad
[**leads_export_get**](LeadsExportApi.md#leads_export_get) | **GET** /ad_accounts/{ad_account_id}/leads_export/{leads_export_id} | Get the lead export from the lead export create call


# **leads_export_create**
> `leads_export_create`(_api::`LeadsExportApi`, `ad_account_id`::`String`, `leads_exports_create`::`LeadsExportsCreate`; _mediaType=nothing) -> `LeadsExports`, `OpenAPI.Clients.ApiResponse` <br/>
> `leads_export_create`(_api::`LeadsExportApi`, response_stream::`Channel`, `ad_account_id`::`String`, `leads_exports_create`::`LeadsExportsCreate`; _mediaType=nothing) -> `Channel`{ `LeadsExports` }, `OpenAPI.Clients.ApiResponse`

Create a request to export leads collected from a lead ad

**This feature is currently in beta and not available to all apps. If you're interested in joining the beta, please reach out to your Pinterest account manager.**  Create an export of leads collected from a lead ad. This returns a `leads_export_id` token that you can use to download the export when it is ready.  Note: Lead ad data will be available up to 30 days after the lead has been submitted.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`LeadsExportApi`** | API context | 
**`ad_account_id`** | **`String`** | Unique identifier of an ad account. |
**`leads_exports_create`** | [**`LeadsExportsCreate`**](LeadsExportsCreate.md) |  |

### Return type

[**`LeadsExports`**](LeadsExports.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **leads_export_get**
> `leads_export_get`(_api::`LeadsExportApi`, `ad_account_id`::`String`, `leads_export_id`::`String`; _mediaType=nothing) -> `LeadsExportResponseData`, `OpenAPI.Clients.ApiResponse` <br/>
> `leads_export_get`(_api::`LeadsExportApi`, response_stream::`Channel`, `ad_account_id`::`String`, `leads_export_id`::`String`; _mediaType=nothing) -> `Channel`{ `LeadsExportResponseData` }, `OpenAPI.Clients.ApiResponse`

Get the lead export from the lead export create call

**This feature is currently in beta and not available to all apps. If you're interested in joining the beta, please reach out to your Pinterest account manager.**  Get the export of leads collected from a lead ad. This returns a URL to a list of lead export given a lead_export_id token returned from the create a lead export call. You can use the URL to download the report.  Note: Lead ad data will be available up to 30 days after the lead has been submitted.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`LeadsExportApi`** | API context | 
**`ad_account_id`** | **`String`** | Unique identifier of an ad account. |
**`leads_export_id`** | **`String`** | lead_export_id token returned from the create a lead export endpoint |

### Return type

[**`LeadsExportResponseData`**](LeadsExportResponseData.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

