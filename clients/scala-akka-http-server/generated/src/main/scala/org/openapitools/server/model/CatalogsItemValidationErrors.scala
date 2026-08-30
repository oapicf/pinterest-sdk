package org.openapitools.server.model


/**
 * @param ADULT_INVALID Item has an invalid adult value. for example: ''null''
 * @param ADWORDS_FORMAT_INVALID Adword link contains too many characters. for example: ''null''
 * @param AVAILABILITY_INVALID Item is missing availability value in its product metadata, this item will not be published. for example: ''null''
 * @param BLOCKLISTED_IMAGE_SIGNATURE Item will not be published because it doesn't meet Pinterest's Merchant Guidelines. for example: ''null''
 * @param DESCRIPTION_MISSING Item is missing description in its product metadata, this item will not be published. for example: ''null''
 * @param DUPLICATE_PRODUCTS This product is duplicated. The duplicate entry will not be published. for example: ''null''
 * @param IMAGE_LINK_INVALID Image link is invalid. for example: ''null''
 * @param IMAGE_LINK_LENGTH_TOO_LONG Item has image_link URL that contains too many characters, so the item will not be published. for example: ''null''
 * @param IMAGE_LINK_MISSING Item is missing an image link URL in its product metadata, this item will not be published. for example: ''null''
 * @param INVALID_DOMAIN Product link value doesn't match the verified domain associated with this account. for example: ''null''
 * @param ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE Main image can't be found. for example: ''null''
 * @param ITEMID_MISSING Item is missing item id in its product metadata, this item will not be published. for example: ''null''
 * @param LINK_FORMAT_INVALID Link is invalid. for example: ''null''
 * @param LINK_LENGTH_TOO_LONG Product link contains too many characters, this item will not be published. for example: ''null''
 * @param LIST_PRICE_INVALID Item has a list price formatting error, this item will not be published. for example: ''null''
 * @param MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED Item exceed the maximum number of items per item group, this item will not be published. for example: ''null''
 * @param PARSE_LINE_ERROR Item contains formating errors. for example: ''null''
 * @param PINJOIN_CONTENT_UNSAFE Item will not be published because it doesn't meet Pinterest's Merchant Guidelines. for example: ''null''
 * @param PRICE_CANNOT_BE_DETERMINED Item price cannot be determined because the price, list price, and sale price are all different. for example: ''null''
 * @param PRICE_MISSING Product is missing a price, this item will not be published. for example: ''null''
 * @param PRODUCT_LINK_MISSING Item is missing a link URL in its product metadata, this item will not be published. for example: ''null''
 * @param PRODUCT_PRICE_INVALID Item has a price formatting error in its product metadata, this item will not be published. for example: ''null''
 * @param TITLE_MISSING Item is missing title in its product metadata, this item will not be published. for example: ''null''
*/
final case class CatalogsItemValidationErrors (
  ADULT_INVALID: Option[CatalogsItemValidationDetails] = None,
  ADWORDS_FORMAT_INVALID: Option[CatalogsItemValidationDetails] = None,
  AVAILABILITY_INVALID: Option[CatalogsItemValidationDetails] = None,
  BLOCKLISTED_IMAGE_SIGNATURE: Option[CatalogsItemValidationDetails] = None,
  DESCRIPTION_MISSING: Option[CatalogsItemValidationDetails] = None,
  DUPLICATE_PRODUCTS: Option[CatalogsItemValidationDetails] = None,
  IMAGE_LINK_INVALID: Option[CatalogsItemValidationDetails] = None,
  IMAGE_LINK_LENGTH_TOO_LONG: Option[CatalogsItemValidationDetails] = None,
  IMAGE_LINK_MISSING: Option[CatalogsItemValidationDetails] = None,
  INVALID_DOMAIN: Option[CatalogsItemValidationDetails] = None,
  ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE: Option[CatalogsItemValidationDetails] = None,
  ITEMID_MISSING: Option[CatalogsItemValidationDetails] = None,
  LINK_FORMAT_INVALID: Option[CatalogsItemValidationDetails] = None,
  LINK_LENGTH_TOO_LONG: Option[CatalogsItemValidationDetails] = None,
  LIST_PRICE_INVALID: Option[CatalogsItemValidationDetails] = None,
  MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED: Option[CatalogsItemValidationDetails] = None,
  PARSE_LINE_ERROR: Option[CatalogsItemValidationDetails] = None,
  PINJOIN_CONTENT_UNSAFE: Option[CatalogsItemValidationDetails] = None,
  PRICE_CANNOT_BE_DETERMINED: Option[CatalogsItemValidationDetails] = None,
  PRICE_MISSING: Option[CatalogsItemValidationDetails] = None,
  PRODUCT_LINK_MISSING: Option[CatalogsItemValidationDetails] = None,
  PRODUCT_PRICE_INVALID: Option[CatalogsItemValidationDetails] = None,
  TITLE_MISSING: Option[CatalogsItemValidationDetails] = None
)

