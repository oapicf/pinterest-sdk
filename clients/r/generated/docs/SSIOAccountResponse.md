# openapi::SSIOAccountResponse


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**eligible** | **character** | Advertiser eligible to create order lines | [optional] 
**can_edit** | **character** | Advertiser eligible to update order lines | [optional] 
**billto_infos** | [**array[SSIOAccountItem]**](SSIOAccountItem.md) | An array of Salesforce account information that includes address, io terms, etc. | [optional] 
**currency** | **character** |  | [optional] 
**pmp_names** | [**array[SSIOAccountPMPName]**](SSIOAccountPMPName.md) |  | [optional] 
**error** | **character** | Error indicator from Salesforce which could be \&quot;No Error\&quot; | [optional] 


