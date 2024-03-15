
package org.openapitools.client.model


case class LineItem (
    /* Product brand. For example, \"Parker\". */
    _productBrand: Option[String],
    /* Product category. For example, \"Shoes\". */
    _productCategory: Option[String],
    /* Product ID. For example, 1414. */
    _productId: Option[Integer],
    /* Product name. For example, \"Parker Boots\". */
    _productName: Option[String],
    /* Product price. For example, \"99.99\". */
    _productPrice: Option[String],
    /* Product quantity. For example, 2. */
    _productQuantity: Option[Integer],
    /* Product variant. For example, \"Red\". */
    _productVariant: Option[String],
    /* Product variant ID. For example, \"1414-34832\". */
    _productVariantId: Option[String]
)
object LineItem {
    def toStringBody(var_productBrand: Object, var_productCategory: Object, var_productId: Object, var_productName: Object, var_productPrice: Object, var_productQuantity: Object, var_productVariant: Object, var_productVariantId: Object) =
        s"""
        | {
        | "productBrand":$var_productBrand,"productCategory":$var_productCategory,"productId":$var_productId,"productName":$var_productName,"productPrice":$var_productPrice,"productQuantity":$var_productQuantity,"productVariant":$var_productVariant,"productVariantId":$var_productVariantId
        | }
        """.stripMargin
}
