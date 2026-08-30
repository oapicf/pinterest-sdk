# WWW::OpenAPIClient::Object::AggregatedPinComment

## Load the model package
```perl
use WWW::OpenAPIClient::Object::AggregatedPinComment;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ai_disclosures** | [**AiDisclosures**](AiDisclosures.md) | AI disclosure declarations the creator has made about this Pin. | [optional] 
**alt_text** | **string** |  | [optional] 
**board_id** | **string** | The board to which this Pin belongs. | [optional] 
**board_owner** | [**BoardOwner**](BoardOwner.md) |  | [optional] [readonly] 
**board_section_id** | **string** | The board section to which this Pin belongs. | [optional] 
**created_at** | **DATE_TIME** |  | [optional] [readonly] 
**creative_type** | [**CreativeType**](CreativeType.md) |  | [optional] [readonly] 
**description** | **string** |  | [optional] 
**dominant_color** | **string** | Dominant pin color. Hex number, e.g. &#x60;#6E7874&#x60;. | [optional] 
**has_been_promoted** | **boolean** | Whether the Pin has been promoted or not. | [optional] [readonly] 
**id** | **string** |  | 
**is_owner** | **boolean** | Whether the \&quot;operation user_account\&quot; is the Pin owner. | [optional] [readonly] 
**is_product** | **boolean** | Whether the Pin is a product Pin. | [optional] [readonly] 
**is_standard** | **boolean** | Whether the Pin is standard or not. See documentation on [Changes to Pin creation](/docs/api-features/content-overview/) for more information. | [optional] [readonly] 
**link** | **string** |  | [optional] 
**media** | [**PinMedia**](PinMedia.md) |  | [optional] [readonly] 
**parent_pin_id** | **string** | The source pin id if this pin was saved from another pin. [Learn more](https://help.pinterest.com/article/save-pins-on-pinterest). | [optional] 
**pin_metrics** | **object** | Pin metrics with associated time intervals if any. | [optional] [readonly] 
**title** | **string** |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


