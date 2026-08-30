# openapi::CatalogsItemValidationErrors


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ADULT_INVALID** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) | Item has an invalid adult value. | [optional] 
**ADWORDS_FORMAT_INVALID** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) | Adword link contains too many characters. | [optional] 
**AVAILABILITY_INVALID** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) | Item is missing availability value in its product metadata, this item will not be published. | [optional] 
**BLOCKLISTED_IMAGE_SIGNATURE** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) | Item will not be published because it doesn&#39;t meet Pinterest&#39;s Merchant Guidelines. | [optional] 
**DESCRIPTION_MISSING** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) | Item is missing description in its product metadata, this item will not be published. | [optional] 
**DUPLICATE_PRODUCTS** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) | This product is duplicated. The duplicate entry will not be published. | [optional] 
**IMAGE_LINK_INVALID** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) | Image link is invalid. | [optional] 
**IMAGE_LINK_LENGTH_TOO_LONG** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) | Item has image_link URL that contains too many characters, so the item will not be published. | [optional] 
**IMAGE_LINK_MISSING** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) | Item is missing an image link URL in its product metadata, this item will not be published. | [optional] 
**INVALID_DOMAIN** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) | Product link value doesn&#39;t match the verified domain associated with this account. | [optional] 
**ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) | Main image can&#39;t be found. | [optional] 
**ITEMID_MISSING** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) | Item is missing item id in its product metadata, this item will not be published. | [optional] 
**LINK_FORMAT_INVALID** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) | Link is invalid. | [optional] 
**LINK_LENGTH_TOO_LONG** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) | Product link contains too many characters, this item will not be published. | [optional] 
**LIST_PRICE_INVALID** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) | Item has a list price formatting error, this item will not be published. | [optional] 
**MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) | Item exceed the maximum number of items per item group, this item will not be published. | [optional] 
**PARSE_LINE_ERROR** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) | Item contains formating errors. | [optional] 
**PINJOIN_CONTENT_UNSAFE** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) | Item will not be published because it doesn&#39;t meet Pinterest&#39;s Merchant Guidelines. | [optional] 
**PRICE_CANNOT_BE_DETERMINED** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) | Item price cannot be determined because the price, list price, and sale price are all different. | [optional] 
**PRICE_MISSING** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) | Product is missing a price, this item will not be published. | [optional] 
**PRODUCT_LINK_MISSING** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) | Item is missing a link URL in its product metadata, this item will not be published. | [optional] 
**PRODUCT_PRICE_INVALID** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) | Item has a price formatting error in its product metadata, this item will not be published. | [optional] 
**TITLE_MISSING** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) | Item is missing title in its product metadata, this item will not be published. | [optional] 


