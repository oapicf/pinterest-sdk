package org.openapitools.server.model


/**
 * = LineItem =
 *
 * @param productBrand Product brand. For example, \"Parker\". for example: ''Parker''
 * @param productCategory Product category. For example, \"Shoes\". for example: ''Shoes''
 * @param productId Product ID. For example, 1414. for example: ''1414''
 * @param productName Product name. For example, \"Parker Boots\". for example: ''Parker Boots''
 * @param productPrice Product price. For example, \"99.99\". for example: ''99.99''
 * @param productQuantity Product quantity. For example, 2. for example: ''2''
 * @param productVariant Product variant. For example, \"Red\". for example: ''Red''
 * @param productVariantId Product variant ID. For example, \"1414-34832\". for example: ''1414-34832''
*/
final case class LineItem (
  productBrand: Option[String] = None,
  productCategory: Option[String] = None,
  productId: Option[Int] = None,
  productName: Option[String] = None,
  productPrice: Option[String] = None,
  productQuantity: Option[Int] = None,
  productVariant: Option[String] = None,
  productVariantId: Option[String] = None
)

