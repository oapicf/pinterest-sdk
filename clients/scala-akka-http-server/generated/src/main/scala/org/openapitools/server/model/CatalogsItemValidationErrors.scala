package org.openapitools.server.model


/**
 * @param ADULT_INVALID  for example: ''null''
 * @param ADWORDS_FORMAT_INVALID  for example: ''null''
 * @param AVAILABILITY_INVALID  for example: ''null''
 * @param BLOCKLISTED_IMAGE_SIGNATURE  for example: ''null''
 * @param DESCRIPTION_MISSING  for example: ''null''
 * @param DUPLICATE_PRODUCTS  for example: ''null''
 * @param IMAGE_LINK_INVALID  for example: ''null''
 * @param IMAGE_LINK_LENGTH_TOO_LONG  for example: ''null''
 * @param IMAGE_LINK_MISSING  for example: ''null''
 * @param INVALID_DOMAIN  for example: ''null''
 * @param ITEMID_MISSING  for example: ''null''
 * @param ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE  for example: ''null''
 * @param LINK_FORMAT_INVALID  for example: ''null''
 * @param LINK_LENGTH_TOO_LONG  for example: ''null''
 * @param LIST_PRICE_INVALID  for example: ''null''
 * @param MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED  for example: ''null''
 * @param PARSE_LINE_ERROR  for example: ''null''
 * @param PINJOIN_CONTENT_UNSAFE  for example: ''null''
 * @param PRICE_CANNOT_BE_DETERMINED  for example: ''null''
 * @param PRICE_MISSING  for example: ''null''
 * @param PRODUCT_LINK_MISSING  for example: ''null''
 * @param PRODUCT_PRICE_INVALID  for example: ''null''
 * @param TITLE_MISSING  for example: ''null''
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
  ITEMID_MISSING: Option[CatalogsItemValidationDetails] = None,
  ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE: Option[CatalogsItemValidationDetails] = None,
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

