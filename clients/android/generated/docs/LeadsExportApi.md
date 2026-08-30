# LeadsExportApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**leadsExportCreate**](LeadsExportApi.md#leadsExportCreate) | **POST** /ad_accounts/{ad_account_id}/leads_export | Create a request to export leads collected from a lead ad
[**leadsExportGet**](LeadsExportApi.md#leadsExportGet) | **GET** /ad_accounts/{ad_account_id}/leads_export/{leads_export_id} | Get the lead export from the lead export create call



## leadsExportCreate

> LeadsExports leadsExportCreate(adAccountId, leadsExportsCreate)

Create a request to export leads collected from a lead ad

**This feature is currently in beta and not available to all apps. If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.**  Create an export of leads collected from a lead ad. This returns a &#x60;leads_export_id&#x60; token that you can use to download the export when it is ready.  Note: Lead ad data will be available up to 30 days after the lead has been submitted.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).

### Example

```java
// Import classes:
//import org.openapitools.client.api.LeadsExportApi;

LeadsExportApi apiInstance = new LeadsExportApi();
String adAccountId = null; // String | Unique identifier of an ad account.
LeadsExportsCreate leadsExportsCreate = new LeadsExportsCreate(); // LeadsExportsCreate | 
try {
    LeadsExports result = apiInstance.leadsExportCreate(adAccountId, leadsExportsCreate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LeadsExportApi#leadsExportCreate");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String**| Unique identifier of an ad account. | [default to null]
 **leadsExportsCreate** | [**LeadsExportsCreate**](LeadsExportsCreate.md)|  |

### Return type

[**LeadsExports**](LeadsExports.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## leadsExportGet

> LeadsExportResponseData leadsExportGet(adAccountId, leadsExportId)

Get the lead export from the lead export create call

**This feature is currently in beta and not available to all apps. If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.**  Get the export of leads collected from a lead ad. This returns a URL to a list of lead export given a lead_export_id token returned from the create a lead export call. You can use the URL to download the report.  Note: Lead ad data will be available up to 30 days after the lead has been submitted.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).

### Example

```java
// Import classes:
//import org.openapitools.client.api.LeadsExportApi;

LeadsExportApi apiInstance = new LeadsExportApi();
String adAccountId = null; // String | Unique identifier of an ad account.
String leadsExportId = null; // String | lead_export_id token returned from the create a lead export endpoint
try {
    LeadsExportResponseData result = apiInstance.leadsExportGet(adAccountId, leadsExportId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LeadsExportApi#leadsExportGet");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String**| Unique identifier of an ad account. | [default to null]
 **leadsExportId** | **String**| lead_export_id token returned from the create a lead export endpoint | [default to null]

### Return type

[**LeadsExportResponseData**](LeadsExportResponseData.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

