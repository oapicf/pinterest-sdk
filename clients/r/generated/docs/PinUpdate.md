# openapi::PinUpdate

Resource create or update operation model.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**alt_text** | **character** |  | [optional] [Max. length: 500] 
**board_id** | **character** | The board to which this Pin belongs. | [optional] [Pattern: ^\\d+$] 
**board_section_id** | **character** | The board section to which this Pin belongs. | [optional] [Pattern: ^\\d+$] 
**carousel_slots** | [**array[CarouselSlot]**](CarouselSlot.md) | Carousel Pin slots data. | [optional] 
**description** | **character** |  | [optional] [Max. length: 800] 
**link** | **character** |  | [optional] [Max. length: 2048] 
**title** | **character** |  | [optional] [Max. length: 100] 


