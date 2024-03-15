# WWW::OpenAPIClient::Object::SSIOAccountResponse

## Load the model package
```perl
use WWW::OpenAPIClient::Object::SSIOAccountResponse;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**eligible** | **boolean** | Advertiser eligible to create order lines | [optional] 
**can_edit** | **boolean** | Advertiser eligible to update order lines | [optional] 
**billto_infos** | [**ARRAY[SSIOAccountItem]**](SSIOAccountItem.md) | An array of Salesforce account information that includes address, io terms, etc. | [optional] 
**currency** | **string** |  | [optional] 
**pmp_names** | [**ARRAY[SSIOAccountPMPName]**](SSIOAccountPMPName.md) |  | [optional] 
**error** | **string** | Error indicator from Salesforce which could be \&quot;No Error\&quot; | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


