# WWW::OpenAPIClient::Object::Pin

## Load the model package
```perl
use WWW::OpenAPIClient::Object::Pin;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **string** |  | [optional] [readonly] 
**created_at** | **DATE_TIME** |  | [optional] [readonly] 
**link** | **string** |  | [optional] 
**title** | **string** |  | [optional] 
**description** | **string** |  | [optional] 
**dominant_color** | **string** | Dominant pin color. Hex number, e.g. \\\&quot;#6E7874\\\&quot;. | [optional] 
**alt_text** | **string** |  | [optional] 
**creative_type** | [**CreativeType**](CreativeType.md) |  | [optional] [readonly] 
**board_id** | **string** | The board to which this Pin belongs. | [optional] 
**board_section_id** | **string** | The board section to which this Pin belongs. | [optional] 
**board_owner** | [**BoardOwner**](BoardOwner.md) |  | [optional] 
**is_owner** | **boolean** | Whether the \&quot;operation user_account\&quot; is the Pin owner. | [optional] [readonly] 
**media** | [**SummaryPinMedia**](SummaryPinMedia.md) |  | [optional] 
**media_source** | [**PinMediaSource**](PinMediaSource.md) |  | [optional] 
**parent_pin_id** | **string** | The source pin id if this pin was saved from another pin. &lt;a href&#x3D;\&quot;https://help.pinterest.com/article/save-pins-on-pinterest\&quot;&gt;Learn more&lt;/a&gt;. | [optional] 
**is_standard** | **boolean** | Whether the Pin is standard or not. See documentation on &lt;a href&#x3D;\&quot;https://developers.pinterest.com/docs/content/update/\&quot;&gt;Changes to Pin creation&lt;/a&gt; for more information. | [optional] 
**has_been_promoted** | **boolean** | Whether the Pin has been promoted or not. | [optional] [readonly] 
**note** | **string** | Private note for this Pin. &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/article/add-notes-to-your-pins\&quot;&gt;Learn more&lt;/a&gt;. | [optional] 
**pin_metrics** | **object** | Pin metrics with associated time intervals if any. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


