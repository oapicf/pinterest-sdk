# CatalogsItemValidationErrors

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**adult_invalid** | Option<[**models::CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md)> | Item has an invalid adult value. | [optional]
**adwords_format_invalid** | Option<[**models::CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md)> | Adword link contains too many characters. | [optional]
**availability_invalid** | Option<[**models::CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md)> | Item is missing availability value in its product metadata, this item will not be published. | [optional]
**blocklisted_image_signature** | Option<[**models::CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md)> | Item will not be published because it doesn't meet Pinterest's Merchant Guidelines. | [optional]
**description_missing** | Option<[**models::CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md)> | Item is missing description in its product metadata, this item will not be published. | [optional]
**duplicate_products** | Option<[**models::CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md)> | This product is duplicated. The duplicate entry will not be published. | [optional]
**image_link_invalid** | Option<[**models::CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md)> | Image link is invalid. | [optional]
**image_link_length_too_long** | Option<[**models::CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md)> | Item has image_link URL that contains too many characters, so the item will not be published. | [optional]
**image_link_missing** | Option<[**models::CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md)> | Item is missing an image link URL in its product metadata, this item will not be published. | [optional]
**invalid_domain** | Option<[**models::CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md)> | Product link value doesn't match the verified domain associated with this account. | [optional]
**item_main_image_download_failure** | Option<[**models::CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md)> | Main image can't be found. | [optional]
**itemid_missing** | Option<[**models::CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md)> | Item is missing item id in its product metadata, this item will not be published. | [optional]
**link_format_invalid** | Option<[**models::CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md)> | Link is invalid. | [optional]
**link_length_too_long** | Option<[**models::CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md)> | Product link contains too many characters, this item will not be published. | [optional]
**list_price_invalid** | Option<[**models::CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md)> | Item has a list price formatting error, this item will not be published. | [optional]
**max_items_per_item_group_exceeded** | Option<[**models::CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md)> | Item exceed the maximum number of items per item group, this item will not be published. | [optional]
**parse_line_error** | Option<[**models::CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md)> | Item contains formating errors. | [optional]
**pinjoin_content_unsafe** | Option<[**models::CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md)> | Item will not be published because it doesn't meet Pinterest's Merchant Guidelines. | [optional]
**price_cannot_be_determined** | Option<[**models::CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md)> | Item price cannot be determined because the price, list price, and sale price are all different. | [optional]
**price_missing** | Option<[**models::CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md)> | Product is missing a price, this item will not be published. | [optional]
**product_link_missing** | Option<[**models::CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md)> | Item is missing a link URL in its product metadata, this item will not be published. | [optional]
**product_price_invalid** | Option<[**models::CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md)> | Item has a price formatting error in its product metadata, this item will not be published. | [optional]
**title_missing** | Option<[**models::CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md)> | Item is missing title in its product metadata, this item will not be published. | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


