
package org.openapitools.client.model


case class CatalogsItemValidationIssues (
    /* Item number based on order of appearance in the Catalogs Feed. For example, '0' refers to first item found in a feed that was downloaded from a 'location' specified during feed creation. */
    _itemNumber: Integer,
    /* The merchant-created unique ID that represents the product. */
    _itemId: String,
    _errors: CatalogsItemValidationErrors,
    _warnings: CatalogsItemValidationWarnings
)
object CatalogsItemValidationIssues {
    def toStringBody(var_itemNumber: Object, var_itemId: Object, var_errors: Object, var_warnings: Object) =
        s"""
        | {
        | "itemNumber":$var_itemNumber,"itemId":$var_itemId,"errors":$var_errors,"warnings":$var_warnings
        | }
        """.stripMargin
}
