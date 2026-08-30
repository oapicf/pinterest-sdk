
package org.openapitools.client.model


case class CatalogsUpdatableCreativeAssetsAttributes (
    /* Link to the creative assets page. */
    _androidDeepLink: Option[String],
    /* Custom grouping of creative assets. */
    _customLabel0: Option[String],
    /* Custom grouping of creative assets. */
    _customLabel1: Option[String],
    /* Custom grouping of creative assets. */
    _customLabel2: Option[String],
    /* Custom grouping of creative assets. */
    _customLabel3: Option[String],
    /* Custom grouping of creative assets. */
    _customLabel4: Option[String],
    /* Brief description of the creative assets. */
    _description: Option[String],
    /* The categorization of the product based on the standardized Google Product Taxonomy. This is a set taxonomy. Both the text values and numeric codes are accepted. */
    _googleProductCategory: Option[String],
    /* IOS deep link to the creative assets page. */
    _iosDeepLink: Option[String],
    /* Link to the creative assets page. */
    _link: Option[String],
    /* The name of the creative assets. */
    _title: Option[String],
    /* Visibility of the creative assets. Must be one of the following values (upper or lowercase): 'visible', 'hidden'. */
    _visibility: Option[String]
)
object CatalogsUpdatableCreativeAssetsAttributes {
    def toStringBody(var_androidDeepLink: Object, var_customLabel0: Object, var_customLabel1: Object, var_customLabel2: Object, var_customLabel3: Object, var_customLabel4: Object, var_description: Object, var_googleProductCategory: Object, var_iosDeepLink: Object, var_link: Object, var_title: Object, var_visibility: Object) =
        s"""
        | {
        | "androidDeepLink":$var_androidDeepLink,"customLabel0":$var_customLabel0,"customLabel1":$var_customLabel1,"customLabel2":$var_customLabel2,"customLabel3":$var_customLabel3,"customLabel4":$var_customLabel4,"description":$var_description,"googleProductCategory":$var_googleProductCategory,"iosDeepLink":$var_iosDeepLink,"link":$var_link,"title":$var_title,"visibility":$var_visibility
        | }
        """.stripMargin
}
