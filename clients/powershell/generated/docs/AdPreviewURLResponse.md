# AdPreviewURLResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Url** | **String** | &#39;Preview URL, expires in 7 days. Can be used in an iframe. For example: https://ads.pinterest.com/ad-preview/74667c814dd2b19/ The preview object ID/key is the last param - 74667c814dd2b19&#39; | [optional] 

## Examples

- Prepare the resource
```powershell
$AdPreviewURLResponse = Initialize-PSOpenAPIToolsAdPreviewURLResponse  -Url https://ads.pinterest.com/ad-preview/58f1a0e9ab0bd0f99462a0e4c5dd7e8297888c8a36331e88f757abe8f0295d31/
```

- Convert the resource to JSON
```powershell
$AdPreviewURLResponse | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

