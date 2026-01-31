# LeadsExportApi

All URIs are relative to *https://api.pinterest.com/v5*

|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|[**leadsExportCreate**](#leadsexportcreate) | **POST** /ad_accounts/{ad_account_id}/leads_export | Create a request to export leads collected from a lead ad|
|[**leadsExportGet**](#leadsexportget) | **GET** /ad_accounts/{ad_account_id}/leads_export/{leads_export_id} | Get the lead export from the lead export create call|

# **leadsExportCreate**
> LeadsExportCreateResponse leadsExportCreate(leadsExportCreateRequest)

<strong>This feature is currently in beta and not available to all apps, if you\'re interested in joining the beta, please reach out to your Pinterest account manager.</strong>  Create an export of leads collected from a lead ad. This returns a lead_export_id  token that you can use to download the export when it is ready.  Note: Lead ad data will be available up to 30 days after the lead has been submitted.  For more, see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/lead-ads\">Lead ads</a>.

### Example

```typescript
import {
    LeadsExportApi,
    Configuration,
    LeadsExportCreateRequest
} from './api';

const configuration = new Configuration();
const apiInstance = new LeadsExportApi(configuration);

let adAccountId: string; //Unique identifier of an ad account. (default to undefined)
let leadsExportCreateRequest: LeadsExportCreateRequest; //

const { status, data } = await apiInstance.leadsExportCreate(
    adAccountId,
    leadsExportCreateRequest
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **leadsExportCreateRequest** | **LeadsExportCreateRequest**|  | |
| **adAccountId** | [**string**] | Unique identifier of an ad account. | defaults to undefined|


### Return type

**LeadsExportCreateResponse**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | Success |  -  |
|**400** | Invalid ad account parameter. |  -  |
|**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **leadsExportGet**
> LeadsExportResponseData leadsExportGet()

<strong>This feature is currently in beta and not available to all apps, if you\'re interested in joining the beta, please reach out to your Pinterest account manager.</strong>  Get the export of leads collected from a lead ad. This returns a URL to a list of lead export given a lead_export_id token returned from the create a lead export call. You can use the URL to download the report.  Note: Lead ad data will be available up to 30 days after the lead has been submitted.  For more, see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/lead-ads\">Lead ads</a>.

### Example

```typescript
import {
    LeadsExportApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new LeadsExportApi(configuration);

let adAccountId: string; //Unique identifier of an ad account. (default to undefined)
let leadsExportId: string; //lead_export_id token returned from the create a lead export endpoint (default to undefined)

const { status, data } = await apiInstance.leadsExportGet(
    adAccountId,
    leadsExportId
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **adAccountId** | [**string**] | Unique identifier of an ad account. | defaults to undefined|
| **leadsExportId** | [**string**] | lead_export_id token returned from the create a lead export endpoint | defaults to undefined|


### Return type

**LeadsExportResponseData**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | Success |  -  |
|**400** | Invalid ad account parameter. |  -  |
|**404** | Invalid leads export id parameter. |  -  |
|**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

