# LeadsExportApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**leadsExportCreate**](LeadsExportApi.md#leadsExportCreate) | **Post** /ad_accounts/{ad_account_id}/leads_export | Create a request to export leads collected from a lead ad
[**leadsExportGet**](LeadsExportApi.md#leadsExportGet) | **Get** /ad_accounts/{ad_account_id}/leads_export/{leads_export_id} | Get the lead export from the lead export create call


<a name="leadsExportCreate"></a>
# **leadsExportCreate**
> LeadsExports leadsExportCreate(adAccountId, leadsExportsCreate)

Create a request to export leads collected from a lead ad

**This feature is currently in beta and not available to all apps. If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.**  Create an export of leads collected from a lead ad. This returns a &#x60;leads_export_id&#x60; token that you can use to download the export when it is ready.  Note: Lead ad data will be available up to 30 days after the lead has been submitted.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = LeadsExportApi()
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
val leadsExportsCreate : LeadsExportsCreate =  // LeadsExportsCreate | 
try {
    val result : LeadsExports = apiInstance.leadsExportCreate(adAccountId, leadsExportsCreate)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LeadsExportApi#leadsExportCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LeadsExportApi#leadsExportCreate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **kotlin.String**| Unique identifier of an ad account. |
 **leadsExportsCreate** | [**LeadsExportsCreate**](LeadsExportsCreate.md)|  |

### Return type

[**LeadsExports**](LeadsExports.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: APPLICATION_JSON
 - **Accept**: APPLICATION_JSON

<a name="leadsExportGet"></a>
# **leadsExportGet**
> LeadsExportResponseData leadsExportGet(adAccountId, leadsExportId)

Get the lead export from the lead export create call

**This feature is currently in beta and not available to all apps. If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.**  Get the export of leads collected from a lead ad. This returns a URL to a list of lead export given a lead_export_id token returned from the create a lead export call. You can use the URL to download the report.  Note: Lead ad data will be available up to 30 days after the lead has been submitted.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = LeadsExportApi()
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
val leadsExportId : kotlin.String = leadsExportId_example // kotlin.String | lead_export_id token returned from the create a lead export endpoint
try {
    val result : LeadsExportResponseData = apiInstance.leadsExportGet(adAccountId, leadsExportId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LeadsExportApi#leadsExportGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LeadsExportApi#leadsExportGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **kotlin.String**| Unique identifier of an ad account. |
 **leadsExportId** | **kotlin.String**| lead_export_id token returned from the create a lead export endpoint |

### Return type

[**LeadsExportResponseData**](LeadsExportResponseData.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: APPLICATION_JSON

