# openapi::Pin


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ai_disclosures** | [**AiDisclosures**](AiDisclosures.md) | AI disclosure declarations the creator has made about this Pin. | [optional] 
**board_id** | **character** | The board to which this Pin belongs. | [optional] [Pattern: ^\\d+$] 
**board_owner** | [**BoardOwner**](BoardOwner.md) |  | [optional] [readonly] 
**board_section_id** | **character** | The board section to which this Pin belongs. | [optional] [Pattern: ^\\d+$] 
**created_at** | **character** |  | [optional] [readonly] 
**creative_type** | [**CreativeType**](CreativeType.md) |  | [optional] [readonly] [Enum: ] 
**dominant_color** | **character** | Dominant pin color. Hex number, e.g. &#x60;#6E7874&#x60;. | [optional] 
**has_been_promoted** | **character** | Whether the Pin has been promoted or not. | [optional] [readonly] 
**id** | **character** |  | [Pattern: ^\\d+$] 
**is_owner** | **character** | Whether the \&quot;operation user_account\&quot; is the Pin owner. | [optional] [readonly] 
**is_product** | **character** | Whether the Pin is a product Pin. | [optional] [readonly] 
**is_standard** | **character** | Whether the Pin is standard or not. See documentation on [Changes to Pin creation](/docs/api-features/content-overview/) for more information. | [optional] [readonly] 
**media** | [**PinMedia**](PinMedia.md) |  | [optional] [readonly] 
**parent_pin_id** | **character** | The source pin id if this pin was saved from another pin. [Learn more](https://help.pinterest.com/article/save-pins-on-pinterest). | [optional] [Pattern: ^\\d+$] 
**pin_metrics** | **object** | Pin metrics with associated time intervals if any. | [optional] [readonly] 
**alt_text** | **character** |  | [optional] [Max. length: 500] 
**description** | **character** |  | [optional] [Max. length: 800] 
**link** | **character** |  | [optional] [Max. length: 2048] 
**title** | **character** |  | [optional] [Max. length: 100] 


