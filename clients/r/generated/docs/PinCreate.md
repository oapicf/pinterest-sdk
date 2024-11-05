# openapi::PinCreate

Pin

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **character** |  | [optional] [readonly] [Pattern: ^\\d+$] 
**created_at** | **character** |  | [optional] [readonly] 
**link** | **character** |  | [optional] [Max. length: 2048] 
**title** | **character** |  | [optional] [Max. length: 100] 
**description** | **character** |  | [optional] [Max. length: 800] 
**dominant_color** | **character** | Dominant pin color. Hex number, e.g. \\\&quot;#6E7874\\\&quot;. | [optional] 
**alt_text** | **character** |  | [optional] [Max. length: 500] 
**board_id** | **character** | The board to which this Pin belongs. | [optional] [Pattern: ^\\d+$] 
**board_section_id** | **character** | The board section to which this Pin belongs. | [optional] [Pattern: ^\\d+$] 
**board_owner** | [**BoardOwner**](BoardOwner.md) |  | [optional] [readonly] 
**media** | [**PinMedia**](PinMedia.md) |  | [optional] [readonly] 
**media_source** | [**PinMediaSource**](PinMediaSource.md) |  | [optional] 
**parent_pin_id** | **character** | The source pin id if this pin was saved from another pin. &lt;a href&#x3D;\&quot;https://help.pinterest.com/article/save-pins-on-pinterest\&quot;&gt;Learn more&lt;/a&gt;. | [optional] [Pattern: ^\\d+$] 
**note** | **character** | Private note for this Pin. &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/article/add-notes-to-your-pins\&quot;&gt;Learn more&lt;/a&gt;. | [optional] 


