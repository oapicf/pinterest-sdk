# SsioAccountResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**eligible** | **Boolean!** | Advertiser eligible to create order lines | [optional] [default to null]
**canEdit** | **Boolean!** | Advertiser eligible to update order lines | [optional] [default to null]
**billtoInfos** | [**SsioAccountItem**](SSIOAccountItem.md) | An array of Salesforce account information that includes address, io terms, etc. | [optional] [default to null]
**currency** | **String!** |  | [optional] [default to null]
**pmpNames** | [**SsioAccountPmpName**](SSIOAccountPMPName.md) |  | [optional] [default to null]
**error** | **String!** | Error indicator from Salesforce which could be \&quot;No Error\&quot; | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


