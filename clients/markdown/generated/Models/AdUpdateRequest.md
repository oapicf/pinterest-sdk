# AdUpdateRequest
## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **ad\_group\_id** | **String** | ID of the ad group that contains the ad. | [optional] [default to null] |
| **android\_deep\_link** | **String** | Deep link URL for Android devices. Not currently available. Using this field will generate an error. | [optional] [default to null] |
| **carousel\_android\_deep\_links** | **List** | Comma-separated deep links for the carousel pin on Android. | [optional] [default to null] |
| **carousel\_destination\_urls** | **List** | Comma-separated destination URLs for the carousel pin to promote. | [optional] [default to null] |
| **carousel\_ios\_deep\_links** | **List** | Comma-separated deep links for the carousel pin on iOS. | [optional] [default to null] |
| **click\_tracking\_url** | **String** | Tracking url for the ad clicks. | [optional] [default to null] |
| **creative\_type** | [**CreativeType**](CreativeType.md) |  | [optional] [default to null] |
| **destination\_url** | **String** | Destination URL. | [optional] [default to null] |
| **ios\_deep\_link** | **String** | Deep link URL for iOS devices. Not currently available. Using this field will generate an error. | [optional] [default to null] |
| **is\_pin\_deleted** | **Boolean** | Is original pin deleted? | [optional] [default to null] |
| **is\_removable** | **Boolean** | Is pin repinnable? | [optional] [default to null] |
| **name** | **String** | Name of the ad - 255 chars max. | [optional] [default to null] |
| **status** | [**EntityStatus**](EntityStatus.md) |  | [optional] [default to null] |
| **tracking\_urls** | [**AdCommon_tracking_urls**](AdCommon_tracking_urls.md) |  | [optional] [default to null] |
| **view\_tracking\_url** | **String** | Tracking URL for ad impressions. | [optional] [default to null] |
| **lead\_form\_id** | **String** | Lead form ID for lead ad generation. | [optional] [default to null] |
| **grid\_click\_type** | [**GridClickType**](GridClickType.md) |  | [optional] [default to null] |
| **customizable\_cta\_type** | **String** | Select a call to action (CTA) to display below your ad. Available only for ads with direct links enabled. CTA options for consideration and conversion campaigns are LEARN_MORE, SHOP_NOW, BOOK_NOW, SIGN_UP, VISIT_WEBSITE, BUY_NOW, GET_OFFER, ORDER_NOW, ADD_TO_CART (for conversion campaigns with add to cart conversion events only) | [optional] [default to null] |
| **quiz\_pin\_data** | [**AdCommon_quiz_pin_data**](AdCommon_quiz_pin_data.md) |  | [optional] [default to null] |
| **id** | **String** | The ID of this ad. | [default to null] |
| **pin\_id** | **String** | Pin ID. This field may only be updated for draft ads. | [optional] [default to null] |

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

