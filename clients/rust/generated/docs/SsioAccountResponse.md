# SsioAccountResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**billto_infos** | Option<[**Vec<models::SsioAccountItem>**](SSIOAccountItem.md)> | An array of Salesforce account information that includes address, io terms, etc. | [optional]
**can_edit** | Option<**bool**> | Advertiser eligible to update order lines | [optional]
**currency** | Option<**String**> |  | [optional]
**eligible** | Option<**bool**> | Advertiser eligible to create order lines | [optional]
**error** | Option<**String**> | Error indicator from Salesforce which could be \"No Error\" | [optional]
**pmp_names** | Option<[**Vec<models::SsioAccountPmpName>**](SSIOAccountPMPName.md)> |  | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


