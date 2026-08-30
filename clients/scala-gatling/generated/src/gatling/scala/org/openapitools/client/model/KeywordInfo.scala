
package org.openapitools.client.model


case class KeywordInfo (
    /* Keyword Name */
    _name: String,
    /* MoM growth as a percentage, if there is no growth rate, this field is not present */
    _pctGrowthMom: Option[Number]
)
object KeywordInfo {
    def toStringBody(var_name: Object, var_pctGrowthMom: Object) =
        s"""
        | {
        | "name":$var_name,"pctGrowthMom":$var_pctGrowthMom
        | }
        """.stripMargin
}
