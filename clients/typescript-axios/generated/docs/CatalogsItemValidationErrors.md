# CatalogsItemValidationErrors


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ADULT_INVALID** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) | Item has an invalid adult value. | [optional] [default to undefined]
**ADWORDS_FORMAT_INVALID** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) | Adword link contains too many characters. | [optional] [default to undefined]
**AVAILABILITY_INVALID** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) | Item is missing availability value in its product metadata, this item will not be published. | [optional] [default to undefined]
**BLOCKLISTED_IMAGE_SIGNATURE** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) | Item will not be published because it doesn\&#39;t meet Pinterest\&#39;s Merchant Guidelines. | [optional] [default to undefined]
**DESCRIPTION_MISSING** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) | Item is missing description in its product metadata, this item will not be published. | [optional] [default to undefined]
**DUPLICATE_PRODUCTS** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) | This product is duplicated. The duplicate entry will not be published. | [optional] [default to undefined]
**IMAGE_LINK_INVALID** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) | Image link is invalid. | [optional] [default to undefined]
**IMAGE_LINK_LENGTH_TOO_LONG** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) | Item has image_link URL that contains too many characters, so the item will not be published. | [optional] [default to undefined]
**IMAGE_LINK_MISSING** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) | Item is missing an image link URL in its product metadata, this item will not be published. | [optional] [default to undefined]
**INVALID_DOMAIN** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) | Product link value doesn\&#39;t match the verified domain associated with this account. | [optional] [default to undefined]
**ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) | Main image can\&#39;t be found. | [optional] [default to undefined]
**ITEMID_MISSING** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) | Item is missing item id in its product metadata, this item will not be published. | [optional] [default to undefined]
**LINK_FORMAT_INVALID** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) | Link is invalid. | [optional] [default to undefined]
**LINK_LENGTH_TOO_LONG** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) | Product link contains too many characters, this item will not be published. | [optional] [default to undefined]
**LIST_PRICE_INVALID** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) | Item has a list price formatting error, this item will not be published. | [optional] [default to undefined]
**MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) | Item exceed the maximum number of items per item group, this item will not be published. | [optional] [default to undefined]
**PARSE_LINE_ERROR** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) | Item contains formating errors. | [optional] [default to undefined]
**PINJOIN_CONTENT_UNSAFE** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) | Item will not be published because it doesn\&#39;t meet Pinterest\&#39;s Merchant Guidelines. | [optional] [default to undefined]
**PRICE_CANNOT_BE_DETERMINED** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) | Item price cannot be determined because the price, list price, and sale price are all different. | [optional] [default to undefined]
**PRICE_MISSING** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) | Product is missing a price, this item will not be published. | [optional] [default to undefined]
**PRODUCT_LINK_MISSING** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) | Item is missing a link URL in its product metadata, this item will not be published. | [optional] [default to undefined]
**PRODUCT_PRICE_INVALID** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) | Item has a price formatting error in its product metadata, this item will not be published. | [optional] [default to undefined]
**TITLE_MISSING** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) | Item is missing title in its product metadata, this item will not be published. | [optional] [default to undefined]

## Example

```typescript
import { CatalogsItemValidationErrors } from './api';

const instance: CatalogsItemValidationErrors = {
    ADULT_INVALID,
    ADWORDS_FORMAT_INVALID,
    AVAILABILITY_INVALID,
    BLOCKLISTED_IMAGE_SIGNATURE,
    DESCRIPTION_MISSING,
    DUPLICATE_PRODUCTS,
    IMAGE_LINK_INVALID,
    IMAGE_LINK_LENGTH_TOO_LONG,
    IMAGE_LINK_MISSING,
    INVALID_DOMAIN,
    ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE,
    ITEMID_MISSING,
    LINK_FORMAT_INVALID,
    LINK_LENGTH_TOO_LONG,
    LIST_PRICE_INVALID,
    MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED,
    PARSE_LINE_ERROR,
    PINJOIN_CONTENT_UNSAFE,
    PRICE_CANNOT_BE_DETERMINED,
    PRICE_MISSING,
    PRODUCT_LINK_MISSING,
    PRODUCT_PRICE_INVALID,
    TITLE_MISSING,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
