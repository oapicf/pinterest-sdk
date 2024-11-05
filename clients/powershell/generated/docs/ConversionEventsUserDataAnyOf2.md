# ConversionEventsUserDataAnyOf2
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Em** | **String[]** | Sha256 hashes of lowercase version of user&#39;s email addresses. Used for matching. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format. | [optional] 
**HashedMaids** | **String[]** | Sha256 hashes of user&#39;s &quot;&quot;Google Advertising IDs&quot;&quot; (GAIDs) or &quot;&quot;Apple&#39;s Identifier for Advertisers&quot;&quot; (IDFAs). Used for matching. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format. | [optional] 
**ClientIpAddress** | **String** | The user&#39;s IP address, which can be either in IPv4 or IPv6 format. Used for matching. We highly recommend this for all events. It may improve reporting performance such as ROAS/CPA. | 
**ClientUserAgent** | **String** | The user agent string of the user&#39;s web browser. We highly recommend this for all events. It may improve reporting performance such as ROAS/CPA. | 

## Examples

- Prepare the resource
```powershell
$ConversionEventsUserDataAnyOf2 = Initialize-PSOpenAPIToolsConversionEventsUserDataAnyOf2  -Em [&quot;411e44ce1261728ffd2c0686e44e3fffe413c0e2c5adc498bc7da883d476b9c8&quot;,&quot;09831ea51bd1b7b32a836683a00a9ccaf3d05f59499f42d9883412ed79289969&quot;] `
 -HashedMaids [&quot;0192518eb84137ccfe82c8b6322d29631dae7e28ed9d0f6dd5f245d73a58c5f1&quot;,&quot;837b850ac46d62b2272a71de73c27801ff011ac1e36c5432620c8755cf90db46&quot;] `
 -ClientIpAddress 216.3.128.12 `
 -ClientUserAgent Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/67.0.3396.87 Safari/537.36
```

- Convert the resource to JSON
```powershell
$ConversionEventsUserDataAnyOf2 | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

