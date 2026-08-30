# PinBase


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**`ai_disclosures`** | [**`*AiDisclosures`**](AiDisclosures.md) | AI disclosure declarations the creator has made about this Pin. | [optional] [default to nothing]
**`board_id`** | **`String`** | The board to which this Pin belongs. | [optional] [default to nothing]
**`board_owner`** | [**`*BoardOwner`**](BoardOwner.md) |  | [optional] [readonly] [default to nothing]
**`board_section_id`** | **`String`** | The board section to which this Pin belongs. | [optional] [default to nothing]
**`created_at`** | **`ZonedDateTime`** |  | [optional] [readonly] [default to nothing]
**`creative_type`** | [**`*CreativeType`**](CreativeType.md) |  | [optional] [readonly] [default to nothing]
**`dominant_color`** | **`String`** | Dominant pin color. Hex number, e.g. &#x60;#6E7874&#x60;. | [optional] [default to nothing]
**`has_been_promoted`** | **`Bool`** | Whether the Pin has been promoted or not. | [optional] [readonly] [default to nothing]
**`id`** | **`String`** |  | [default to nothing]
**`is_owner`** | **`Bool`** | Whether the \&quot;operation user_account\&quot; is the Pin owner. | [optional] [readonly] [default to nothing]
**`is_product`** | **`Bool`** | Whether the Pin is a product Pin. | [optional] [readonly] [default to nothing]
**`is_standard`** | **`Bool`** | Whether the Pin is standard or not. See documentation on [Changes to Pin creation](/docs/api-features/content-overview/) for more information. | [optional] [readonly] [default to nothing]
**`media`** | [**`*PinMedia`**](PinMedia.md) |  | [optional] [readonly] [default to nothing]
**`parent_pin_id`** | **`String`** | The source pin id if this pin was saved from another pin. [Learn more](https://help.pinterest.com/article/save-pins-on-pinterest). | [optional] [default to nothing]
**`pin_metrics`** | **`Any`** | Pin metrics with associated time intervals if any. | [optional] [readonly] [default to nothing]


[[Back to Model list]](../README.md#models) [[Back to API list]](../README.md#api-endpoints) [[Back to README]](../README.md)


