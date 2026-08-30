# pin_t

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ai_disclosures** | [**ai_disclosures_t**](ai_disclosures.md) \* | AI disclosure declarations the creator has made about this Pin. | [optional] 
**board_id** | **char \*** | The board to which this Pin belongs. | [optional] 
**board_owner** | [**board_owner_t**](board_owner.md) \* |  | [optional] [readonly] 
**board_section_id** | **char \*** | The board section to which this Pin belongs. | [optional] 
**created_at** | **char \*** |  | [optional] [readonly] 
**creative_type** | **creative_type_t \*** |  | [optional] [readonly] 
**dominant_color** | **char \*** | Dominant pin color. Hex number, e.g. &#x60;#6E7874&#x60;. | [optional] 
**has_been_promoted** | **int** | Whether the Pin has been promoted or not. | [optional] [readonly] 
**id** | **char \*** |  | 
**is_owner** | **int** | Whether the \&quot;operation user_account\&quot; is the Pin owner. | [optional] [readonly] 
**is_product** | **int** | Whether the Pin is a product Pin. | [optional] [readonly] 
**is_standard** | **int** | Whether the Pin is standard or not. See documentation on [Changes to Pin creation](/docs/api-features/content-overview/) for more information. | [optional] [readonly] 
**media** | [**pin_media_t**](pin_media.md) \* |  | [optional] [readonly] 
**parent_pin_id** | **char \*** | The source pin id if this pin was saved from another pin. [Learn more](https://help.pinterest.com/article/save-pins-on-pinterest). | [optional] 
**pin_metrics** | [**object_t**](.md) \* | Pin metrics with associated time intervals if any. | [optional] [readonly] 
**alt_text** | **char \*** |  | [optional] 
**description** | **char \*** |  | [optional] 
**link** | **char \*** |  | [optional] 
**title** | **char \*** |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


