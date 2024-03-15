# openapi::PinUpdate

Pin fields for updates

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**alt_text** | **character** | Pin&#39;s alternative text. | [optional] [Max. length: 500] 
**board_id** | **character** | The id of the board to move the Pin onto. | [optional] [Pattern: ^\\d+$] 
**board_section_id** | **character** | &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/article/create-a-board-section\&quot;&gt;Board section&lt;/a&gt; ID. | [optional] [Pattern: ^\\d+$] 
**description** | **character** | Pin description - 800 characters maximum. | [optional] [Max. length: 800] 
**link** | **character** | URL viewer is taken to when they click pin. | [optional] [Max. length: 2048] 
**title** | **character** | The native pin title that creators explicitly prefer to display. | [optional] [Max. length: 100] 
**carousel_slots** | [**array[PinUpdateCarouselSlotsInner]**](PinUpdate_carousel_slots_inner.md) | Carousel Pin slots data. | [optional] 
**note** | **character** | Private note for this Pin. &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/article/add-notes-to-your-pins\&quot;&gt;Learn more&lt;/a&gt;. | [optional] 


