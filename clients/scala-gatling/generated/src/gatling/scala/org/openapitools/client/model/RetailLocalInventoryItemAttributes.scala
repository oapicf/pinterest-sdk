
package org.openapitools.client.model


case class RetailLocalInventoryItemAttributes (
    /* Ad link for the item */
    _adLink: Option[String],
    /* Availability status of the item */
    _availability: ItemAvailability,
    /* The price of the product. It supports the following formats, \"49.99 USD\", \"49.99USD\" and \"49.99\". If the currency is not included, we default to US dollars. */
    _price: String,
    /* The sale price of the product. It supports the following formats, \"24.99 USD\", \"24.99USD\" and \"24.99\". If the currency is not included, we default to US dollars. */
    _salePrice: Option[String]
)
object RetailLocalInventoryItemAttributes {
    def toStringBody(var_adLink: Object, var_availability: Object, var_price: Object, var_salePrice: Object) =
        s"""
        | {
        | "adLink":$var_adLink,"availability":$var_availability,"price":$var_price,"salePrice":$var_salePrice
        | }
        """.stripMargin
}
