# SsioAccountResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**eligible** | **bool** | Advertiser eligible to create order lines | [optional] [default to None]
**can_edit** | **bool** | Advertiser eligible to update order lines | [optional] [default to None]
**billto_infos** | [**Vec<models::SsioAccountItem>**](SSIOAccountItem.md) | An array of Salesforce account information that includes address, io terms, etc. | [optional] [default to None]
**currency** | **String** |  | [optional] [default to None]
**pmp_names** | [**Vec<models::SsioAccountPmpName>**](SSIOAccountPMPName.md) |  | [optional] [default to None]
**error** | **String** | Error indicator from Salesforce which could be \"No Error\" | [optional] [default to None]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


