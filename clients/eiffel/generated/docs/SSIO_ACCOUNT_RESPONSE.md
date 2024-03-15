# SSIO_ACCOUNT_RESPONSE

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**eligible** | **BOOLEAN** | Advertiser eligible to create order lines | [optional] [default to null]
**can_edit** | **BOOLEAN** | Advertiser eligible to update order lines | [optional] [default to null]
**billto_infos** | [**LIST [SSIO_ACCOUNT_ITEM]**](SSIOAccountItem.md) | An array of Salesforce account information that includes address, io terms, etc. | [optional] [default to null]
**currency** | [**STRING_32**](STRING_32.md) |  | [optional] [default to null]
**pmp_names** | [**LIST [SSIO_ACCOUNT_PMP_NAME]**](SSIOAccountPMPName.md) |  | [optional] [default to null]
**error** | [**STRING_32**](STRING_32.md) | Error indicator from Salesforce which could be \&quot;No Error\&quot; | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


