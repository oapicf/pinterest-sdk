# openapi::PinCreate

Resource create operation model.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**alt_text** | **character** |  | [optional] [Max. length: 500] 
**board_id** | **character** | The board to which this Pin belongs. | [optional] [Pattern: ^\\d+$] 
**board_section_id** | **character** | The board section to which this Pin belongs. | [optional] [Pattern: ^\\d+$] 
**description** | **character** |  | [optional] [Max. length: 800] 
**dominant_color** | **character** | Dominant pin color. Hex number, e.g. &#x60;#6E7874&#x60;. | [optional] 
**link** | **character** |  | [optional] [Max. length: 2048] 
**media_source** | [**PinMediaSource**](PinMediaSource.md) |  | [optional] 
**parent_pin_id** | **character** | The source pin id if this pin was saved from another pin. [Learn more](https://help.pinterest.com/article/save-pins-on-pinterest). | [optional] [Pattern: ^\\d+$] 
**sponsor_id** | **character** | The sponsor account id to request paid partnership from.  Currently the field is only available to a list of users in a closed beta. | [optional] [Pattern: ^\\d+$] 
**title** | **character** |  | [optional] [Max. length: 100] 


