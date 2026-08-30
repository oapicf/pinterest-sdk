# WWW::OpenAPIClient::Object::PinCreate

## Load the model package
```perl
use WWW::OpenAPIClient::Object::PinCreate;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ai_disclosures** | [**AiDisclosures**](AiDisclosures.md) | AI disclosure declarations the creator has made about this Pin. | [optional] 
**alt_text** | **string** |  | [optional] 
**board_id** | **string** | The board to which this Pin belongs. | [optional] 
**board_section_id** | **string** | The board section to which this Pin belongs. | [optional] 
**description** | **string** |  | [optional] 
**dominant_color** | **string** | Dominant pin color. Hex number, e.g. &#x60;#6E7874&#x60;. | [optional] 
**link** | **string** |  | [optional] 
**media_source** | [**PinMediaSource**](PinMediaSource.md) |  | [optional] 
**parent_pin_id** | **string** | The source pin id if this pin was saved from another pin. [Learn more](https://help.pinterest.com/article/save-pins-on-pinterest). | [optional] 
**sponsor_id** | **string** | The sponsor account id to request paid partnership from.  Currently the field is only available to a list of users in a closed beta. | [optional] 
**title** | **string** |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


