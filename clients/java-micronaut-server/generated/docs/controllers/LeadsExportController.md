# LeadsExportController

All URIs are relative to `"/v5"`

The controller class is defined in **[LeadsExportController.java](../../src/main/java/org/openapitools/controller/LeadsExportController.java)**

Method | HTTP request | Description
------------- | ------------- | -------------
[**leadsExportCreate**](#leadsExportCreate) | **POST** /ad_accounts/{ad_account_id}/leads_export | Create a request to export leads collected from a lead ad
[**leadsExportGet**](#leadsExportGet) | **GET** /ad_accounts/{ad_account_id}/leads_export/{leads_export_id} | Get the lead export from the lead export create call

<a id="leadsExportCreate"></a>
# **leadsExportCreate**
```java
Mono<LeadsExports> LeadsExportController.leadsExportCreate(adAccountIdleadsExportsCreate)
```

Create a request to export leads collected from a lead ad

**This feature is currently in beta and not available to all apps. If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.**  Create an export of leads collected from a lead ad. This returns a &#x60;leads_export_id&#x60; token that you can use to download the export when it is ready.  Note: Lead ad data will be available up to 30 days after the lead has been submitted.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**adAccountId** | `String` | Unique identifier of an ad account. |
**leadsExportsCreate** | [**LeadsExportsCreate**](../../docs/models/LeadsExportsCreate.md) |  |

### Return type
[**LeadsExports**](../../docs/models/LeadsExports.md)

### Authorization
* **pinterest_oauth2**, scopes: `ads:write`

### HTTP request headers
 - **Accepts Content-Type**: `application/json`
 - **Produces Content-Type**: `application/json`

<a id="leadsExportGet"></a>
# **leadsExportGet**
```java
Mono<LeadsExportResponseData> LeadsExportController.leadsExportGet(adAccountIdleadsExportId)
```

Get the lead export from the lead export create call

**This feature is currently in beta and not available to all apps. If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.**  Get the export of leads collected from a lead ad. This returns a URL to a list of lead export given a lead_export_id token returned from the create a lead export call. You can use the URL to download the report.  Note: Lead ad data will be available up to 30 days after the lead has been submitted.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**adAccountId** | `String` | Unique identifier of an ad account. |
**leadsExportId** | `String` | lead_export_id token returned from the create a lead export endpoint |

### Return type
[**LeadsExportResponseData**](../../docs/models/LeadsExportResponseData.md)

### Authorization
* **pinterest_oauth2**, scopes: `ads:read`

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

