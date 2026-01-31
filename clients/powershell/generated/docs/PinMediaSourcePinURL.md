# PinMediaSourcePinURL
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**IsAffiliateLink** | **Boolean** | This is an affiliate link or sponsored product. The FTC requires disclosure for paid partnerships and affiliate products. | [optional] [default to $false]
**SourceType** | **String** |  | 

## Examples

- Prepare the resource
```powershell
$PinMediaSourcePinURL = Initialize-PSOpenAPIToolsPinMediaSourcePinURL  -IsAffiliateLink null `
 -SourceType null
```

- Convert the resource to JSON
```powershell
$PinMediaSourcePinURL | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

