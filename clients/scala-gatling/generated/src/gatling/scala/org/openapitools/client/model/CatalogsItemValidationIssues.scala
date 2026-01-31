
package org.openapitools.client.model


case class CatalogsItemValidationIssues (
    _errors: CatalogsItemValidationErrors,
    /* The merchant-created unique ID that represents the product. */
    _itemId: String,
    /* Item number based on order of appearance in the Catalogs Feed. For example, '0' refers to first item found in a feed that was downloaded from a 'location' specified during feed creation. */
    _itemNumber: Integer,
    _warnings: CatalogsItemValidationWarnings
)
object CatalogsItemValidationIssues {
    def toStringBody(var_errors: Object, var_itemId: Object, var_itemNumber: Object, var_warnings: Object) =
        s"""
        | {
        | "errors":$var_errors,"itemId":$var_itemId,"itemNumber":$var_itemNumber,"warnings":$var_warnings
        | }
        """.stripMargin
}
