# PinMediaSourcePinURL
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**SourceType** | **String** |  | 
**IsAffiliateLink** | **Boolean** | This is an affiliate link or sponsored product. The FTC requires disclosure for paid partnerships and affiliate products. | [optional] [default to $false]

## Examples

- Prepare the resource
```powershell
$PinMediaSourcePinURL = Initialize-PSOpenAPIToolsPinMediaSourcePinURL  -SourceType null `
 -IsAffiliateLink null
```

- Convert the resource to JSON
```powershell
$PinMediaSourcePinURL | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

