# SSIOInsertionOrderStatusResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CreationTime** | **String** | Salesforce insertion order creation time | [optional] 
**PinOrderId** | **String** | Salesforce order id | [optional] 
**Status** | **String** | Salesforce insertion order status | [optional] 

## Examples

- Prepare the resource
```powershell
$SSIOInsertionOrderStatusResponse = Initialize-PSOpenAPIToolsSSIOInsertionOrderStatusResponse  -CreationTime 2017-06-21T23:11:11.000Z `
 -PinOrderId 0Q01N0000015hekSAB `
 -Status Approved
```

- Convert the resource to JSON
```powershell
$SSIOInsertionOrderStatusResponse | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

