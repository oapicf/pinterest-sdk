# ProductGroupPromotion
## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **ad\_group\_id** | **String** | ID of the ad group the product group belongs to. | [optional] [default to null] |
| **bid\_in\_micro\_currency** | **Integer** | The bid in micro currency. | [optional] [default to null] |
| **catalog\_product\_group\_id** | **String** | ID of the catalogs product group that this product group promotion references (required for create operations) | [optional] [default to null] |
| **catalog\_product\_group\_name** | **String** | Catalogs product group name | [optional] [default to null] |
| **collections\_header\_type** | [**CollectionsHeaderType**](CollectionsHeaderType.md) |  | [optional] [default to null] |
| **collections\_hero\_destination\_url** | **String** | Collections Hero Destination Url | [optional] [default to null] |
| **collections\_hero\_pin\_id** | **String** | Hero Pin ID if this PG is promoted as a Collection | [optional] [default to null] |
| **creative\_type** | [**CreativeType**](CreativeType.md) |  | [optional] [default to null] |
| **customizable\_cta\_type** | [**ProductGroupPromotionCustomizableCTAType**](ProductGroupPromotionCustomizableCTAType.md) |  | [optional] [default to null] |
| **definition** | **String** | The full product group definition path | [optional] [default to null] |
| **grid\_click\_type** | [**GridClickType**](GridClickType.md) |  | [optional] [default to null] |
| **id** | **String** | ID of the product group promotion (required for update operations). | [optional] [default to null] |
| **included** | **Boolean** | True if the group is BIDDABLE, false if it should be EXCLUDED from serving ads. | [optional] [default to null] |
| **is\_generate\_background** | **Boolean** | Enable generate backgrounds for the product group, default value is FALSE. When enabled, Pinterest will use generative AI to apply backgrounds for your product images that help drive user inspiration and engagement. | [optional] [default to null] |
| **is\_image\_auto\_resizing** | **Boolean** | Set to &#x60;TRUE&#x60; to automatically resize your product images with generative AI. This ensures that images have optimal appearance for better performance. | [optional] [default to null] |
| **is\_mdl** | **Boolean** | If set to true products promoted in this product group will use the Mobile Deep Link specified in your catalog | [optional] [default to null] |
| **parent\_id** | **String** | The parent Product Group ID of this Product Group | [optional] [default to null] |
| **preferred\_media\_type** | [**PreferredMediaType**](PreferredMediaType.md) |  | [optional] [default to null] |
| **relative\_definition** | **String** | The definition of the product group, relative to its parent - an attribute name/value pair | [optional] [default to null] |
| **selected\_image\_tag** | **String** | The ad image tag selected for the product group promotion. | [optional] [default to null] |
| **selected\_video\_tag** | **String** | The ad video tag selected for the product group promotion. | [optional] [default to null] |
| **slideshow\_collections\_description** | **String** | Slideshow Collections Description | [optional] [default to null] |
| **slideshow\_collections\_title** | **String** | Slideshow Collections Title | [optional] [default to null] |
| **status** | [**EntityStatus**](EntityStatus.md) |  | [optional] [default to null] |
| **tracking\_url** | **String** | Tracking template for proudct group promotions. 4000 limit | [optional] [default to null] |

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

