# pin_create_t

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **char \*** |  | [optional] [readonly] 
**created_at** | **char \*** |  | [optional] [readonly] 
**link** | **char \*** |  | [optional] 
**title** | **char \*** |  | [optional] 
**description** | **char \*** |  | [optional] 
**dominant_color** | **char \*** | Dominant pin color. Hex number, e.g. \\\&quot;#6E7874\\\&quot;. | [optional] 
**alt_text** | **char \*** |  | [optional] 
**board_id** | **char \*** | The board to which this Pin belongs. | [optional] 
**board_section_id** | **char \*** | The board section to which this Pin belongs. | [optional] 
**board_owner** | [**board_owner_t**](board_owner.md) \* |  | [optional] 
**media** | [**summary_pin_media_t**](summary_pin_media.md) \* |  | [optional] 
**media_source** | [**pin_media_source_t**](pin_media_source.md) \* |  | [optional] 
**parent_pin_id** | **char \*** | The source pin id if this pin was saved from another pin. &lt;a href&#x3D;\&quot;https://help.pinterest.com/article/save-pins-on-pinterest\&quot;&gt;Learn more&lt;/a&gt;. | [optional] 
**note** | **char \*** | Private note for this Pin. &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/article/add-notes-to-your-pins\&quot;&gt;Learn more&lt;/a&gt;. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


