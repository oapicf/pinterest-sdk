package org.openapitools.server.model


/**
 * @param id The id of a product. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check <a href=\"https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\" target=\"_blank\">here</a> (Install the Pinterest tag section). for example: ''null''
 * @param itemBrand The brand of a product. for example: ''null''
 * @param itemCategory The category of a product. for example: ''null''
 * @param itemName The name of a product. for example: ''null''
 * @param itemPrice The price of a product. Accepted as a string in the request; it will be parsed into a double. This is the original item value before any discount. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check <a href=\"https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\" target=\"_blank\">here</a> (Install the Pinterest tag section). for example: ''null''
 * @param quantity The amount of a product. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check <a href=\"https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\" target=\"_blank\">here</a> (Install the Pinterest tag section). for example: ''null''
*/
final case class ConversionEventsDataInnerCustomDataContentsInner (
  id: Option[String] = None,
  itemBrand: Option[String] = None,
  itemCategory: Option[String] = None,
  itemName: Option[String] = None,
  itemPrice: Option[String] = None,
  quantity: Option[Long] = None
)

