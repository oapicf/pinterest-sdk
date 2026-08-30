# PinBase
## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **ai\_disclosures** | [**AiDisclosures**](AiDisclosures.md) | AI disclosure declarations the creator has made about this Pin. | [optional] [default to null] |
| **board\_id** | **String** | The board to which this Pin belongs. | [optional] [default to null] |
| **board\_owner** | [**BoardOwner**](BoardOwner.md) |  | [optional] [default to null] |
| **board\_section\_id** | **String** | The board section to which this Pin belongs. | [optional] [default to null] |
| **created\_at** | **Date** |  | [optional] [default to null] |
| **creative\_type** | [**CreativeType**](CreativeType.md) |  | [optional] [default to null] |
| **dominant\_color** | **String** | Dominant pin color. Hex number, e.g. &#x60;#6E7874&#x60;. | [optional] [default to null] |
| **has\_been\_promoted** | **Boolean** | Whether the Pin has been promoted or not. | [optional] [default to null] |
| **id** | **String** |  | [default to null] |
| **is\_owner** | **Boolean** | Whether the \&quot;operation user_account\&quot; is the Pin owner. | [optional] [default to null] |
| **is\_product** | **Boolean** | Whether the Pin is a product Pin. | [optional] [default to null] |
| **is\_standard** | **Boolean** | Whether the Pin is standard or not. See documentation on [Changes to Pin creation](/docs/api-features/content-overview/) for more information. | [optional] [default to null] |
| **media** | [**PinMedia**](PinMedia.md) |  | [optional] [default to null] |
| **parent\_pin\_id** | **String** | The source pin id if this pin was saved from another pin. [Learn more](https://help.pinterest.com/article/save-pins-on-pinterest). | [optional] [default to null] |
| **pin\_metrics** | [**Object**](.md) | Pin metrics with associated time intervals if any. | [optional] [default to null] |

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

