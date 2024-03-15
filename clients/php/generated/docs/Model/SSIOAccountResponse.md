# # SSIOAccountResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**eligible** | **bool** | Advertiser eligible to create order lines | [optional]
**can_edit** | **bool** | Advertiser eligible to update order lines | [optional]
**billto_infos** | [**\OpenAPI\Client\Model\SSIOAccountItem[]**](SSIOAccountItem.md) | An array of Salesforce account information that includes address, io terms, etc. | [optional]
**currency** | **string** |  | [optional]
**pmp_names** | [**\OpenAPI\Client\Model\SSIOAccountPMPName[]**](SSIOAccountPMPName.md) |  | [optional]
**error** | **string** | Error indicator from Salesforce which could be \&quot;No Error\&quot; | [optional]

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
