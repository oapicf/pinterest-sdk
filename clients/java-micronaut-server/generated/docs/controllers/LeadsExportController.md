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
Mono<LeadsExportCreateResponse> LeadsExportController.leadsExportCreate(adAccountIdleadsExportCreateRequest)
```

Create a request to export leads collected from a lead ad

&lt;strong&gt;This feature is currently in beta and not available to all apps, if you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.&lt;/strong&gt;  Create an export of leads collected from a lead ad. This returns a lead_export_id  token that you can use to download the export when it is ready.  Note: Lead ad data will be available up to 30 days after the lead has been submitted.  For more, see &lt;a class&#x3D;\&quot;reference external\&quot; href&#x3D;\&quot;https://help.pinterest.com/en/business/article/lead-ads\&quot;&gt;Lead ads&lt;/a&gt;.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**adAccountId** | `String` | Unique identifier of an ad account. |
**leadsExportCreateRequest** | [**LeadsExportCreateRequest**](../../docs/models/LeadsExportCreateRequest.md) |  |

### Return type
[**LeadsExportCreateResponse**](../../docs/models/LeadsExportCreateResponse.md)

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

&lt;strong&gt;This feature is currently in beta and not available to all apps, if you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.&lt;/strong&gt;  Get the export of leads collected from a lead ad. This returns a URL to a list of lead export given a lead_export_id token returned from the create a lead export call. You can use the URL to download the report.  Note: Lead ad data will be available up to 30 days after the lead has been submitted.  For more, see &lt;a class&#x3D;\&quot;reference external\&quot; href&#x3D;\&quot;https://help.pinterest.com/en/business/article/lead-ads\&quot;&gt;Lead ads&lt;/a&gt;.

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

