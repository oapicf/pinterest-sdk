# PinRead

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ai_disclosures** | [***models::AiDisclosures**](AiDisclosures.md) | AI disclosure declarations the creator has made about this Pin. | [optional] [default to None]
**board_id** | **String** | The board to which this Pin belongs. | [optional] [default to None]
**board_owner** | [***models::BoardOwner**](BoardOwner.md) |  | [optional] [readonly] [default to None]
**board_section_id** | **swagger::Nullable<String>** | The board section to which this Pin belongs. | [optional] [default to None]
**created_at** | [**chrono::DateTime::<chrono::Utc>**](DateTime.md) |  | [optional] [readonly] [default to None]
**creative_type** | [***models::CreativeType**](CreativeType.md) |  | [optional] [readonly] [default to None]
**dominant_color** | **swagger::Nullable<String>** | Dominant pin color. Hex number, e.g. `#6E7874`. | [optional] [default to None]
**has_been_promoted** | **bool** | Whether the Pin has been promoted or not. | [optional] [readonly] [default to None]
**id** | **String** |  | 
**is_owner** | **bool** | Whether the \"operation user_account\" is the Pin owner. | [optional] [readonly] [default to None]
**is_product** | **bool** | Whether the Pin is a product Pin. | [optional] [readonly] [default to None]
**is_standard** | **bool** | Whether the Pin is standard or not. See documentation on [Changes to Pin creation](/docs/api-features/content-overview/) for more information. | [optional] [readonly] [default to None]
**media** | [***models::PinMedia**](PinMedia.md) |  | [optional] [readonly] [default to None]
**parent_pin_id** | **swagger::Nullable<String>** | The source pin id if this pin was saved from another pin. [Learn more](https://help.pinterest.com/article/save-pins-on-pinterest). | [optional] [default to None]
**pin_metrics** | [***serde_json::Value**](.md) | Pin metrics with associated time intervals if any. | [optional] [readonly] [default to None]
**alt_text** | **swagger::Nullable<String>** |  | [optional] [default to None]
**description** | **swagger::Nullable<String>** |  | [optional] [default to None]
**link** | **swagger::Nullable<String>** |  | [optional] [default to None]
**title** | **swagger::Nullable<String>** |  | [optional] [default to None]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


