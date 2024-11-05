# LeadsExportApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**leadsExportCreate**](LeadsExportApi.md#leadsExportCreate) | **POST** /ad_accounts/{ad_account_id}/leads_export | Create a request to export leads collected from a lead ad |
| [**leadsExportGet**](LeadsExportApi.md#leadsExportGet) | **GET** /ad_accounts/{ad_account_id}/leads_export/{leads_export_id} | Get the lead export from the lead export create call |


<a id="leadsExportCreate"></a>
# **leadsExportCreate**
> LeadsExportCreateResponse leadsExportCreate(adAccountId, leadsExportCreateRequest)

Create a request to export leads collected from a lead ad

&lt;strong&gt;This feature is currently in beta and not available to all apps, if you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.&lt;/strong&gt;  Create an export of leads collected from a lead ad. This returns a lead_export_id  token that you can use to download the export when it is ready.  Note: Lead ad data will be available up to 30 days after the lead has been submitted.  For more, see &lt;a class&#x3D;\&quot;reference external\&quot; href&#x3D;\&quot;https://help.pinterest.com/en/business/article/lead-ads\&quot;&gt;Lead ads&lt;/a&gt;.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = LeadsExportApi()
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
val leadsExportCreateRequest : LeadsExportCreateRequest =  // LeadsExportCreateRequest | 
try {
    val result : LeadsExportCreateResponse = apiInstance.leadsExportCreate(adAccountId, leadsExportCreateRequest)
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
| **adAccountId** | **kotlin.String**| Unique identifier of an ad account. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **leadsExportCreateRequest** | [**LeadsExportCreateRequest**](LeadsExportCreateRequest.md)|  | |

### Return type

[**LeadsExportCreateResponse**](LeadsExportCreateResponse.md)

### Authorization


Configure pinterest_oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="leadsExportGet"></a>
# **leadsExportGet**
> LeadsExportResponseData leadsExportGet(adAccountId, leadsExportId)

Get the lead export from the lead export create call

&lt;strong&gt;This feature is currently in beta and not available to all apps, if you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.&lt;/strong&gt;  Get the export of leads collected from a lead ad. This returns a URL to a list of lead export given a lead_export_id token returned from the create a lead export call. You can use the URL to download the report.  Note: Lead ad data will be available up to 30 days after the lead has been submitted.  For more, see &lt;a class&#x3D;\&quot;reference external\&quot; href&#x3D;\&quot;https://help.pinterest.com/en/business/article/lead-ads\&quot;&gt;Lead ads&lt;/a&gt;.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = LeadsExportApi()
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
val leadsExportId : kotlin.String = 123755885175 // kotlin.String | lead_export_id token returned from the create a lead export endpoint
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
| **adAccountId** | **kotlin.String**| Unique identifier of an ad account. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **leadsExportId** | **kotlin.String**| lead_export_id token returned from the create a lead export endpoint | |

### Return type

[**LeadsExportResponseData**](LeadsExportResponseData.md)

### Authorization


Configure pinterest_oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

