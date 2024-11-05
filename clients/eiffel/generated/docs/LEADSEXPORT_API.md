# LEADSEXPORT_API

All URIs are relative to *https://api.pinterest.com/v5*

Feature | HTTP request | Description
------------- | ------------- | -------------
[**leads_export_create**](LEADSEXPORT_API.md#leads_export_create) | **Post** /ad_accounts/{ad_account_id}/leads_export | Create a request to export leads collected from a lead ad
[**leads_export_get**](LEADSEXPORT_API.md#leads_export_get) | **Get** /ad_accounts/{ad_account_id}/leads_export/{leads_export_id} | Get the lead export from the lead export create call


# **leads_export_create**
> leads_export_create (ad_account_id: STRING_32 ; leads_export_create_request: LEADS_EXPORT_CREATE_REQUEST ): detachable LEADS_EXPORT_CREATE_RESPONSE


Create a request to export leads collected from a lead ad

<strong>This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.</strong>  Create an export of leads collected from a lead ad. This returns a lead_export_id  token that you can use to download the export when it is ready.  Note: Lead ad data will be available up to 30 days after the lead has been submitted.  For more, see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/lead-ads\">Lead ads</a>.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [default to null]
 **leads_export_create_request** | [**LEADS_EXPORT_CREATE_REQUEST**](LEADS_EXPORT_CREATE_REQUEST.md)|  | 

### Return type

[**LEADS_EXPORT_CREATE_RESPONSE**](LeadsExportCreateResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **leads_export_get**
> leads_export_get (ad_account_id: STRING_32 ; leads_export_id: STRING_32 ): detachable LEADS_EXPORT_RESPONSE_DATA


Get the lead export from the lead export create call

<strong>This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.</strong>  Get the export of leads collected from a lead ad. This returns a URL to a list of lead export given a lead_export_id token returned from the create a lead export call. You can use the URL to download the report.  Note: Lead ad data will be available up to 30 days after the lead has been submitted.  For more, see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/lead-ads\">Lead ads</a>.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [default to null]
 **leads_export_id** | **STRING_32**| lead_export_id token returned from the create a lead export endpoint | [default to null]

### Return type

[**LEADS_EXPORT_RESPONSE_DATA**](LeadsExportResponseData.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

