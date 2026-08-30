# PinterestSdk.LeadsExportApi

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

```javascript
import PinterestSdk from 'pinterest-sdk';
let defaultClient = PinterestSdk.ApiClient.instance;
// Configure OAuth2 access token for authorization: pinterest_oauth2
let pinterest_oauth2 = defaultClient.authentications['pinterest_oauth2'];
pinterest_oauth2.accessToken = 'YOUR ACCESS TOKEN';

let apiInstance = new PinterestSdk.LeadsExportApi();
let adAccountId = "adAccountId_example"; // String | Unique identifier of an ad account.
let leadsExportsCreate = new PinterestSdk.LeadsExportsCreate(); // LeadsExportsCreate | 
apiInstance.leadsExportCreate(adAccountId, leadsExportsCreate, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String**| Unique identifier of an ad account. | 
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

```javascript
import PinterestSdk from 'pinterest-sdk';
let defaultClient = PinterestSdk.ApiClient.instance;
// Configure OAuth2 access token for authorization: pinterest_oauth2
let pinterest_oauth2 = defaultClient.authentications['pinterest_oauth2'];
pinterest_oauth2.accessToken = 'YOUR ACCESS TOKEN';

let apiInstance = new PinterestSdk.LeadsExportApi();
let adAccountId = "adAccountId_example"; // String | Unique identifier of an ad account.
let leadsExportId = "leadsExportId_example"; // String | lead_export_id token returned from the create a lead export endpoint
apiInstance.leadsExportGet(adAccountId, leadsExportId, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String**| Unique identifier of an ad account. | 
 **leadsExportId** | **String**| lead_export_id token returned from the create a lead export endpoint | 

### Return type

[**LeadsExportResponseData**](LeadsExportResponseData.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

