# SsioAccountResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**eligible** | Option<**bool**> | Advertiser eligible to create order lines | [optional]
**can_edit** | Option<**bool**> | Advertiser eligible to update order lines | [optional]
**billto_infos** | Option<[**Vec<models::SsioAccountItem>**](SSIOAccountItem.md)> | An array of Salesforce account information that includes address, io terms, etc. | [optional]
**currency** | Option<**String**> |  | [optional]
**pmp_names** | Option<[**Vec<models::SsioAccountPmpName>**](SSIOAccountPMPName.md)> |  | [optional]
**error** | Option<**String**> | Error indicator from Salesforce which could be \"No Error\" | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


