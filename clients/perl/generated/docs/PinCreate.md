# WWW::OpenAPIClient::Object::PinCreate

## Load the model package
```perl
use WWW::OpenAPIClient::Object::PinCreate;
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
**board_id** | **string** | The board to which this Pin belongs. | [optional] 
**board_section_id** | **string** | The board section to which this Pin belongs. | [optional] 
**board_owner** | [**BoardOwner**](BoardOwner.md) |  | [optional] 
**media** | [**SummaryPinMedia**](SummaryPinMedia.md) |  | [optional] 
**media_source** | [**PinMediaSource**](PinMediaSource.md) |  | [optional] 
**parent_pin_id** | **string** | The source pin id if this pin was saved from another pin. &lt;a href&#x3D;\&quot;https://help.pinterest.com/article/save-pins-on-pinterest\&quot;&gt;Learn more&lt;/a&gt;. | [optional] 
**note** | **string** | Private note for this Pin. &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/article/add-notes-to-your-pins\&quot;&gt;Learn more&lt;/a&gt;. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

