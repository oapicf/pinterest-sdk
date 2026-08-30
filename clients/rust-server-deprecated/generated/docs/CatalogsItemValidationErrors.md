# CatalogsItemValidationErrors

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**adult_invalid** | [***models::CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) | Item has an invalid adult value. | [optional] [default to None]
**adwords_format_invalid** | [***models::CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) | Adword link contains too many characters. | [optional] [default to None]
**availability_invalid** | [***models::CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) | Item is missing availability value in its product metadata, this item will not be published. | [optional] [default to None]
**blocklisted_image_signature** | [***models::CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) | Item will not be published because it doesn't meet Pinterest's Merchant Guidelines. | [optional] [default to None]
**description_missing** | [***models::CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) | Item is missing description in its product metadata, this item will not be published. | [optional] [default to None]
**duplicate_products** | [***models::CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) | This product is duplicated. The duplicate entry will not be published. | [optional] [default to None]
**image_link_invalid** | [***models::CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) | Image link is invalid. | [optional] [default to None]
**image_link_length_too_long** | [***models::CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) | Item has image_link URL that contains too many characters, so the item will not be published. | [optional] [default to None]
**image_link_missing** | [***models::CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) | Item is missing an image link URL in its product metadata, this item will not be published. | [optional] [default to None]
**invalid_domain** | [***models::CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) | Product link value doesn't match the verified domain associated with this account. | [optional] [default to None]
**item_main_image_download_failure** | [***models::CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) | Main image can't be found. | [optional] [default to None]
**itemid_missing** | [***models::CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) | Item is missing item id in its product metadata, this item will not be published. | [optional] [default to None]
**link_format_invalid** | [***models::CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) | Link is invalid. | [optional] [default to None]
**link_length_too_long** | [***models::CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) | Product link contains too many characters, this item will not be published. | [optional] [default to None]
**list_price_invalid** | [***models::CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) | Item has a list price formatting error, this item will not be published. | [optional] [default to None]
**max_items_per_item_group_exceeded** | [***models::CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) | Item exceed the maximum number of items per item group, this item will not be published. | [optional] [default to None]
**parse_line_error** | [***models::CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) | Item contains formating errors. | [optional] [default to None]
**pinjoin_content_unsafe** | [***models::CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) | Item will not be published because it doesn't meet Pinterest's Merchant Guidelines. | [optional] [default to None]
**price_cannot_be_determined** | [***models::CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) | Item price cannot be determined because the price, list price, and sale price are all different. | [optional] [default to None]
**price_missing** | [***models::CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) | Product is missing a price, this item will not be published. | [optional] [default to None]
**product_link_missing** | [***models::CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) | Item is missing a link URL in its product metadata, this item will not be published. | [optional] [default to None]
**product_price_invalid** | [***models::CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) | Item has a price formatting error in its product metadata, this item will not be published. | [optional] [default to None]
**title_missing** | [***models::CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) | Item is missing title in its product metadata, this item will not be published. | [optional] [default to None]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


