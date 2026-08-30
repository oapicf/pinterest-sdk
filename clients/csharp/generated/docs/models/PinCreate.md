# Org.OpenAPITools.Model.PinCreate
Resource create operation model.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AiDisclosures** | [**AiDisclosures**](AiDisclosures.md) | AI disclosure declarations the creator has made about this Pin. | [optional] 
**AltText** | **string** |  | [optional] 
**BoardId** | **string** | The board to which this Pin belongs. | [optional] 
**BoardSectionId** | **string** | The board section to which this Pin belongs. | [optional] 
**Description** | **string** |  | [optional] 
**DominantColor** | **string** | Dominant pin color. Hex number, e.g. &#x60;#6E7874&#x60;. | [optional] 
**Link** | **string** |  | [optional] 
**MediaSource** | [**PinMediaSource**](PinMediaSource.md) |  | [optional] 
**ParentPinId** | **string** | The source pin id if this pin was saved from another pin. [Learn more](https://help.pinterest.com/article/save-pins-on-pinterest). | [optional] 
**SponsorId** | **string** | The sponsor account id to request paid partnership from.  Currently the field is only available to a list of users in a closed beta. | [optional] 
**Title** | **string** |  | [optional] 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

