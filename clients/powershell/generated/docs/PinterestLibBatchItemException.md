# PinterestLibBatchItemException
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Code** | **Int32** |  | [optional] 
**Message** | **String** |  | 

## Examples

- Prepare the resource
```powershell
$PinterestLibBatchItemException = Initialize-PSOpenAPIToolsPinterestLibBatchItemException  -Code 2 `
 -Message Advertiser not found.
```

- Convert the resource to JSON
```powershell
$PinterestLibBatchItemException | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

