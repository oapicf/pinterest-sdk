# Pin
## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **id** | **String** |  | [optional] [default to null] |
| **created\_at** | **Date** |  | [optional] [default to null] |
| **link** | **String** |  | [optional] [default to null] |
| **title** | **String** |  | [optional] [default to null] |
| **description** | **String** |  | [optional] [default to null] |
| **dominant\_color** | **String** | Dominant pin color. Hex number, e.g. \\\&quot;#6E7874\\\&quot;. | [optional] [default to null] |
| **alt\_text** | **String** |  | [optional] [default to null] |
| **creative\_type** | [**CreativeType**](CreativeType.md) |  | [optional] [default to null] |
| **board\_id** | **String** | The board to which this Pin belongs. | [optional] [default to null] |
| **board\_section\_id** | **String** | The board section to which this Pin belongs. | [optional] [default to null] |
| **board\_owner** | [**BoardOwner**](BoardOwner.md) |  | [optional] [default to null] |
| **is\_owner** | **Boolean** | Whether the \&quot;operation user_account\&quot; is the Pin owner. | [optional] [default to null] |
| **media** | [**PinMedia**](PinMedia.md) |  | [optional] [default to null] |
| **media\_source** | [**PinMediaSource**](PinMediaSource.md) |  | [optional] [default to null] |
| **parent\_pin\_id** | **String** | The source pin id if this pin was saved from another pin. &lt;a href&#x3D;\&quot;https://help.pinterest.com/article/save-pins-on-pinterest\&quot;&gt;Learn more&lt;/a&gt;. | [optional] [default to null] |
| **is\_standard** | **Boolean** | Whether the Pin is standard or not. See documentation on &lt;a href&#x3D;\&quot;/docs/api-features/content-overview/\&quot;&gt;Changes to Pin creation&lt;/a&gt; for more information. | [optional] [default to null] |
| **has\_been\_promoted** | **Boolean** | Whether the Pin has been promoted or not. | [optional] [default to null] |
| **note** | **String** | Private note for this Pin. &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/article/add-notes-to-your-pins\&quot;&gt;Learn more&lt;/a&gt;. | [optional] [default to null] |
| **pin\_metrics** | [**Object**](.md) | Pin metrics with associated time intervals if any. | [optional] [default to null] |

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

