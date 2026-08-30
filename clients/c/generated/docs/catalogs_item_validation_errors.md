# catalogs_item_validation_errors_t

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**adult_invalid** | [**catalogs_item_validation_details_t**](catalogs_item_validation_details.md) \* | Item has an invalid adult value. | [optional] 
**adwords_format_invalid** | [**catalogs_item_validation_details_t**](catalogs_item_validation_details.md) \* | Adword link contains too many characters. | [optional] 
**availability_invalid** | [**catalogs_item_validation_details_t**](catalogs_item_validation_details.md) \* | Item is missing availability value in its product metadata, this item will not be published. | [optional] 
**blocklisted_image_signature** | [**catalogs_item_validation_details_t**](catalogs_item_validation_details.md) \* | Item will not be published because it doesn&#39;t meet Pinterest&#39;s Merchant Guidelines. | [optional] 
**description_missing** | [**catalogs_item_validation_details_t**](catalogs_item_validation_details.md) \* | Item is missing description in its product metadata, this item will not be published. | [optional] 
**duplicate_products** | [**catalogs_item_validation_details_t**](catalogs_item_validation_details.md) \* | This product is duplicated. The duplicate entry will not be published. | [optional] 
**image_link_invalid** | [**catalogs_item_validation_details_t**](catalogs_item_validation_details.md) \* | Image link is invalid. | [optional] 
**image_link_length_too_long** | [**catalogs_item_validation_details_t**](catalogs_item_validation_details.md) \* | Item has image_link URL that contains too many characters, so the item will not be published. | [optional] 
**image_link_missing** | [**catalogs_item_validation_details_t**](catalogs_item_validation_details.md) \* | Item is missing an image link URL in its product metadata, this item will not be published. | [optional] 
**invalid_domain** | [**catalogs_item_validation_details_t**](catalogs_item_validation_details.md) \* | Product link value doesn&#39;t match the verified domain associated with this account. | [optional] 
**item_main_image_download_failure** | [**catalogs_item_validation_details_t**](catalogs_item_validation_details.md) \* | Main image can&#39;t be found. | [optional] 
**itemid_missing** | [**catalogs_item_validation_details_t**](catalogs_item_validation_details.md) \* | Item is missing item id in its product metadata, this item will not be published. | [optional] 
**link_format_invalid** | [**catalogs_item_validation_details_t**](catalogs_item_validation_details.md) \* | Link is invalid. | [optional] 
**link_length_too_long** | [**catalogs_item_validation_details_t**](catalogs_item_validation_details.md) \* | Product link contains too many characters, this item will not be published. | [optional] 
**list_price_invalid** | [**catalogs_item_validation_details_t**](catalogs_item_validation_details.md) \* | Item has a list price formatting error, this item will not be published. | [optional] 
**max_items_per_item_group_exceeded** | [**catalogs_item_validation_details_t**](catalogs_item_validation_details.md) \* | Item exceed the maximum number of items per item group, this item will not be published. | [optional] 
**parse_line_error** | [**catalogs_item_validation_details_t**](catalogs_item_validation_details.md) \* | Item contains formating errors. | [optional] 
**pinjoin_content_unsafe** | [**catalogs_item_validation_details_t**](catalogs_item_validation_details.md) \* | Item will not be published because it doesn&#39;t meet Pinterest&#39;s Merchant Guidelines. | [optional] 
**price_cannot_be_determined** | [**catalogs_item_validation_details_t**](catalogs_item_validation_details.md) \* | Item price cannot be determined because the price, list price, and sale price are all different. | [optional] 
**price_missing** | [**catalogs_item_validation_details_t**](catalogs_item_validation_details.md) \* | Product is missing a price, this item will not be published. | [optional] 
**product_link_missing** | [**catalogs_item_validation_details_t**](catalogs_item_validation_details.md) \* | Item is missing a link URL in its product metadata, this item will not be published. | [optional] 
**product_price_invalid** | [**catalogs_item_validation_details_t**](catalogs_item_validation_details.md) \* | Item has a price formatting error in its product metadata, this item will not be published. | [optional] 
**title_missing** | [**catalogs_item_validation_details_t**](catalogs_item_validation_details.md) \* | Item is missing title in its product metadata, this item will not be published. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


