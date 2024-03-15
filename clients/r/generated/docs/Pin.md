# openapi::Pin

Pin

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **character** |  | [optional] [readonly] [Pattern: ^\\d+$] 
**created_at** | **character** |  | [optional] [readonly] 
**link** | **character** |  | [optional] [Max. length: 2048] 
**title** | **character** |  | [optional] 
**description** | **character** |  | [optional] 
**dominant_color** | **character** | Dominant pin color. Hex number, e.g. \\\&quot;#6E7874\\\&quot;. | [optional] 
**alt_text** | **character** |  | [optional] [Max. length: 500] 
**creative_type** | [**CreativeType**](CreativeType.md) |  | [optional] [readonly] [Enum: ] 
**board_id** | **character** | The board to which this Pin belongs. | [optional] [Pattern: ^\\d+$] 
**board_section_id** | **character** | The board section to which this Pin belongs. | [optional] [Pattern: ^\\d+$] 
**board_owner** | [**BoardOwner**](Board_owner.md) |  | [optional] 
**is_owner** | **character** | Whether the \&quot;operation user_account\&quot; is the Pin owner. | [optional] [readonly] 
**media** | [**SummaryPinMedia**](SummaryPin_media.md) |  | [optional] 
**media_source** | [**PinMediaSource**](PinMediaSource.md) |  | [optional] 
**parent_pin_id** | **character** | The source pin id if this pin was saved from another pin. &lt;a href&#x3D;\&quot;https://help.pinterest.com/article/save-pins-on-pinterest\&quot;&gt;Learn more&lt;/a&gt;. | [optional] [Pattern: ^\\d+$] 
**is_standard** | **character** | Whether the Pin is standard or not. See documentation on &lt;a href&#x3D;\&quot;https://developers.pinterest.com/docs/content/update/\&quot;&gt;Changes to Pin creation&lt;/a&gt; for more information. | [optional] 
**has_been_promoted** | **character** | Whether the Pin has been promoted or not. | [optional] [readonly] 
**note** | **character** | Private note for this Pin. &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/article/add-notes-to-your-pins\&quot;&gt;Learn more&lt;/a&gt;. | [optional] 
**pin_metrics** | **object** | Pin metrics with associated time intervals if any. | [optional] 


