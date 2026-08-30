
# Table `CatalogsItemValidationErrors`
(mapped from: CatalogsItemValidationErrors)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**ADULT_INVALID** | ADULT_INVALID | long |  | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) | Item has an invalid adult value. |  [optional] [foreignkey]
**ADWORDS_FORMAT_INVALID** | ADWORDS_FORMAT_INVALID | long |  | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) | Adword link contains too many characters. |  [optional] [foreignkey]
**AVAILABILITY_INVALID** | AVAILABILITY_INVALID | long |  | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) | Item is missing availability value in its product metadata, this item will not be published. |  [optional] [foreignkey]
**BLOCKLISTED_IMAGE_SIGNATURE** | BLOCKLISTED_IMAGE_SIGNATURE | long |  | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) | Item will not be published because it doesn&#39;t meet Pinterest&#39;s Merchant Guidelines. |  [optional] [foreignkey]
**DESCRIPTION_MISSING** | DESCRIPTION_MISSING | long |  | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) | Item is missing description in its product metadata, this item will not be published. |  [optional] [foreignkey]
**DUPLICATE_PRODUCTS** | DUPLICATE_PRODUCTS | long |  | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) | This product is duplicated. The duplicate entry will not be published. |  [optional] [foreignkey]
**IMAGE_LINK_INVALID** | IMAGE_LINK_INVALID | long |  | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) | Image link is invalid. |  [optional] [foreignkey]
**IMAGE_LINK_LENGTH_TOO_LONG** | IMAGE_LINK_LENGTH_TOO_LONG | long |  | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) | Item has image_link URL that contains too many characters, so the item will not be published. |  [optional] [foreignkey]
**IMAGE_LINK_MISSING** | IMAGE_LINK_MISSING | long |  | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) | Item is missing an image link URL in its product metadata, this item will not be published. |  [optional] [foreignkey]
**INVALID_DOMAIN** | INVALID_DOMAIN | long |  | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) | Product link value doesn&#39;t match the verified domain associated with this account. |  [optional] [foreignkey]
**ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE** | ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE | long |  | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) | Main image can&#39;t be found. |  [optional] [foreignkey]
**ITEMID_MISSING** | ITEMID_MISSING | long |  | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) | Item is missing item id in its product metadata, this item will not be published. |  [optional] [foreignkey]
**LINK_FORMAT_INVALID** | LINK_FORMAT_INVALID | long |  | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) | Link is invalid. |  [optional] [foreignkey]
**LINK_LENGTH_TOO_LONG** | LINK_LENGTH_TOO_LONG | long |  | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) | Product link contains too many characters, this item will not be published. |  [optional] [foreignkey]
**LIST_PRICE_INVALID** | LIST_PRICE_INVALID | long |  | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) | Item has a list price formatting error, this item will not be published. |  [optional] [foreignkey]
**MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED** | MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED | long |  | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) | Item exceed the maximum number of items per item group, this item will not be published. |  [optional] [foreignkey]
**PARSE_LINE_ERROR** | PARSE_LINE_ERROR | long |  | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) | Item contains formating errors. |  [optional] [foreignkey]
**PINJOIN_CONTENT_UNSAFE** | PINJOIN_CONTENT_UNSAFE | long |  | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) | Item will not be published because it doesn&#39;t meet Pinterest&#39;s Merchant Guidelines. |  [optional] [foreignkey]
**PRICE_CANNOT_BE_DETERMINED** | PRICE_CANNOT_BE_DETERMINED | long |  | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) | Item price cannot be determined because the price, list price, and sale price are all different. |  [optional] [foreignkey]
**PRICE_MISSING** | PRICE_MISSING | long |  | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) | Product is missing a price, this item will not be published. |  [optional] [foreignkey]
**PRODUCT_LINK_MISSING** | PRODUCT_LINK_MISSING | long |  | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) | Item is missing a link URL in its product metadata, this item will not be published. |  [optional] [foreignkey]
**PRODUCT_PRICE_INVALID** | PRODUCT_PRICE_INVALID | long |  | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) | Item has a price formatting error in its product metadata, this item will not be published. |  [optional] [foreignkey]
**TITLE_MISSING** | TITLE_MISSING | long |  | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) | Item is missing title in its product metadata, this item will not be published. |  [optional] [foreignkey]

























