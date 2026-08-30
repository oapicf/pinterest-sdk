# AggregatedPinComment

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ai_disclosures** | Option<[**models::AiDisclosures**](AiDisclosures.md)> | AI disclosure declarations the creator has made about this Pin. | [optional]
**alt_text** | Option<**String**> |  | [optional]
**board_id** | Option<**String**> | The board to which this Pin belongs. | [optional]
**board_owner** | Option<[**models::BoardOwner**](BoardOwner.md)> |  | [optional][readonly]
**board_section_id** | Option<**String**> | The board section to which this Pin belongs. | [optional]
**created_at** | Option<**chrono::DateTime<chrono::FixedOffset>**> |  | [optional][readonly]
**creative_type** | Option<[**models::CreativeType**](CreativeType.md)> |  | [optional][readonly]
**description** | Option<**String**> |  | [optional]
**dominant_color** | Option<**String**> | Dominant pin color. Hex number, e.g. `#6E7874`. | [optional]
**has_been_promoted** | Option<**bool**> | Whether the Pin has been promoted or not. | [optional][readonly]
**id** | **String** |  | 
**is_owner** | Option<**bool**> | Whether the \"operation user_account\" is the Pin owner. | [optional][readonly]
**is_product** | Option<**bool**> | Whether the Pin is a product Pin. | [optional][readonly]
**is_standard** | Option<**bool**> | Whether the Pin is standard or not. See documentation on [Changes to Pin creation](/docs/api-features/content-overview/) for more information. | [optional][readonly]
**link** | Option<**String**> |  | [optional]
**media** | Option<[**models::PinMedia**](PinMedia.md)> |  | [optional][readonly]
**parent_pin_id** | Option<**String**> | The source pin id if this pin was saved from another pin. [Learn more](https://help.pinterest.com/article/save-pins-on-pinterest). | [optional]
**pin_metrics** | Option<**serde_json::Value**> | Pin metrics with associated time intervals if any. | [optional][readonly]
**title** | Option<**String**> |  | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


