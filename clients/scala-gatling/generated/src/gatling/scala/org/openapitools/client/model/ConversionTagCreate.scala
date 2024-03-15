
package org.openapitools.client.model


case class ConversionTagCreate (
    /* Conversion tag name. */
    _name: String,
    /* Whether Automatic Enhanced Match email is enabled. See <a href=\"https://help.pinterest.com/en/business/article/enhanced-match\" target=\"_blank\">Enhanced match</a> for more information. */
    _aemEnabled: Option[Boolean],
    /* Metadata ingestion frequency. */
    _mdFrequency: Option[Number],
    /* Whether Automatic Enhanced Match name is enabled. See <a href=\"https://help.pinterest.com/en/business/article/enhanced-match\" target=\"_blank\">Enhanced match</a> for more information. */
    _aemFnlnEnabled: Option[Boolean],
    /* Whether Automatic Enhanced Match phone is enabled. See <a href=\"https://help.pinterest.com/en/business/article/enhanced-match\" target=\"_blank\">Enhanced match</a> for more information. */
    _aemPhEnabled: Option[Boolean],
    /* Whether Automatic Enhanced Match gender is enabled. See <a href=\"https://help.pinterest.com/en/business/article/enhanced-match\" target=\"_blank\">Enhanced match</a> for more information. */
    _aemGeEnabled: Option[Boolean],
    /* Whether Automatic Enhanced Match birthdate is enabled. See <a href=\"https://help.pinterest.com/en/business/article/enhanced-match\" target=\"_blank\">Enhanced match</a> for more information. */
    _aemDbEnabled: Option[Boolean],
    /* Whether Automatic Enhanced Match location is enabled. See <a href=\"https://help.pinterest.com/en/business/article/enhanced-match\" target=\"_blank\">Enhanced match</a> for more information. */
    _aemLocEnabled: Option[Boolean]
)
object ConversionTagCreate {
    def toStringBody(var_name: Object, var_aemEnabled: Object, var_mdFrequency: Object, var_aemFnlnEnabled: Object, var_aemPhEnabled: Object, var_aemGeEnabled: Object, var_aemDbEnabled: Object, var_aemLocEnabled: Object) =
        s"""
        | {
        | "name":$var_name,"aemEnabled":$var_aemEnabled,"mdFrequency":$var_mdFrequency,"aemFnlnEnabled":$var_aemFnlnEnabled,"aemPhEnabled":$var_aemPhEnabled,"aemGeEnabled":$var_aemGeEnabled,"aemDbEnabled":$var_aemDbEnabled,"aemLocEnabled":$var_aemLocEnabled
        | }
        """.stripMargin
}
