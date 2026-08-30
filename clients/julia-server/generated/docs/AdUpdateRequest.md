# AdUpdateRequest


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**`id`** | **`String`** | The ID of this ad. | [default to nothing]
**`pin_id`** | **`String`** | Pin ID. This field may only be updated for draft ads. | [optional] [default to nothing]
**`ad_group_id`** | **`String`** | ID of the ad group that contains the ad. | [optional] [default to nothing]
**`android_deep_link`** | **`String`** | Deep link URL for Android devices. | [optional] [default to nothing]
**`carousel_android_deep_links`** | **`Vector{String}`** | Comma-separated deep links for the carousel pin on Android. | [optional] [default to nothing]
**`carousel_destination_urls`** | **`Vector{String}`** | Comma-separated destination URLs for the carousel pin to promote. | [optional] [default to nothing]
**`carousel_ios_deep_links`** | **`Vector{String}`** | Comma-separated deep links for the carousel pin on iOS. | [optional] [default to nothing]
**`click_tracking_url`** | **`String`** | Tracking url for the ad clicks. | [optional] [default to nothing]
**`creative_type`** | [**`*CreativeType`**](CreativeType.md) |  | [optional] [default to nothing]
**`customizable_cta_type`** | [**`*CustomizableCTAType`**](CustomizableCTAType.md) |  | [optional] [default to nothing]
**`destination_url`** | **`String`** | Destination URL. | [optional] [default to nothing]
**`disclosure_type`** | [**`*DisclosureType`**](DisclosureType.md) |  | [optional] [default to nothing]
**`disclosure_url`** | **`String`** | URL for a page that provides disclosures about a pharmaceutical product, such as potential side effects. Make sure the URL takes the user directly to the disclosure content and the referenced site is secure. | [optional] [default to nothing]
**`grid_click_type`** | [**`*GridClickType`**](GridClickType.md) |  | [optional] [default to nothing]
**`ios_deep_link`** | **`String`** | Deep link URL for iOS devices. | [optional] [default to nothing]
**`is_carting`** | **`Bool`** | Is the ad a carting/WTB ad? | [optional] [default to nothing]
**`is_pin_deleted`** | **`Bool`** | Is original pin deleted? | [optional] [default to nothing]
**`is_removable`** | **`Bool`** | Is pin repinnable? | [optional] [default to nothing]
**`lead_form_id`** | **`String`** | Lead form ID for lead ad generation. | [optional] [default to nothing]
**`name`** | **`String`** | Name of the ad - 255 chars max. | [optional] [default to nothing]
**`quiz_pin_data`** | **`Any`** | Before creating a quiz ad, you must create an organic Pin using POST/Create Pin for each result in the quiz. Quiz ads cannot be saved by a Pinner. Quiz ad results can be saved. | [optional] [default to nothing]
**`status`** | [**`*EntityStatus`**](EntityStatus.md) |  | [optional] [default to nothing]
**`tracking_urls`** | **`Any`** |  | [optional] [default to nothing]
**`view_tracking_url`** | **`String`** | Tracking URL for ad impressions. | [optional] [default to nothing]


[[Back to Model list]](../README.md#models) [[Back to API list]](../README.md#api-endpoints) [[Back to README]](../README.md)


