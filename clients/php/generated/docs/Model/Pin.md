# # Pin

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **string** |  | [optional] [readonly]
**created_at** | **\DateTime** |  | [optional] [readonly]
**link** | **string** |  | [optional]
**title** | **string** |  | [optional]
**description** | **string** |  | [optional]
**dominant_color** | **string** | Dominant pin color. Hex number, e.g. \\\&quot;#6E7874\\\&quot;. | [optional]
**alt_text** | **string** |  | [optional]
**creative_type** | [**\OpenAPI\Client\Model\CreativeType**](CreativeType.md) |  | [optional] [readonly]
**board_id** | **string** | The board to which this Pin belongs. | [optional]
**board_section_id** | **string** | The board section to which this Pin belongs. | [optional]
**board_owner** | [**\OpenAPI\Client\Model\BoardOwner**](BoardOwner.md) |  | [optional] [readonly]
**is_owner** | **bool** | Whether the \&quot;operation user_account\&quot; is the Pin owner. | [optional] [readonly]
**media** | [**\OpenAPI\Client\Model\PinMedia**](PinMedia.md) |  | [optional] [readonly]
**media_source** | [**\OpenAPI\Client\Model\PinMediaSource**](PinMediaSource.md) |  | [optional]
**parent_pin_id** | **string** | The source pin id if this pin was saved from another pin. &lt;a href&#x3D;\&quot;https://help.pinterest.com/article/save-pins-on-pinterest\&quot;&gt;Learn more&lt;/a&gt;. | [optional]
**is_standard** | **bool** | Whether the Pin is standard or not. See documentation on &lt;a href&#x3D;\&quot;/docs/api-features/content-overview/\&quot;&gt;Changes to Pin creation&lt;/a&gt; for more information. | [optional]
**has_been_promoted** | **bool** | Whether the Pin has been promoted or not. | [optional] [readonly]
**note** | **string** | Private note for this Pin. &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/article/add-notes-to-your-pins\&quot;&gt;Learn more&lt;/a&gt;. | [optional]
**pin_metrics** | **object** | Pin metrics with associated time intervals if any. | [optional]

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
