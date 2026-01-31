
package org.openapitools.client.model


case class ConversionTagConfigs (
    /* Whether Automatic Enhanced Match birthdate is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information. */
    _aemDbEnabled: Option[Boolean],
    /* Whether Automatic Enhanced Match email is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information. */
    _aemEnabled: Option[Boolean],
    /* Whether Automatic Enhanced Match location is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information. */
    _aemExternalIdEnabled: Option[Boolean],
    /* Whether Automatic Enhanced Match name is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information. */
    _aemFnlnEnabled: Option[Boolean],
    /* Whether Automatic Enhanced Match gender is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information. */
    _aemGeEnabled: Option[Boolean],
    /* Whether Automatic Enhanced Match location is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information. */
    _aemLocEnabled: Option[Boolean],
    /* Whether Automatic Enhanced Match phone is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information. */
    _aemPhEnabled: Option[Boolean],
    /* Metadata ingestion frequency. */
    _mdFrequency: Option[Number],
    /* List of advertiser subdomains configured for NoCodeCAPI calls. */
    _noCodeCapiDomains: Option[List[String]]
)
object ConversionTagConfigs {
    def toStringBody(var_aemDbEnabled: Object, var_aemEnabled: Object, var_aemExternalIdEnabled: Object, var_aemFnlnEnabled: Object, var_aemGeEnabled: Object, var_aemLocEnabled: Object, var_aemPhEnabled: Object, var_mdFrequency: Object, var_noCodeCapiDomains: Object) =
        s"""
        | {
        | "aemDbEnabled":$var_aemDbEnabled,"aemEnabled":$var_aemEnabled,"aemExternalIdEnabled":$var_aemExternalIdEnabled,"aemFnlnEnabled":$var_aemFnlnEnabled,"aemGeEnabled":$var_aemGeEnabled,"aemLocEnabled":$var_aemLocEnabled,"aemPhEnabled":$var_aemPhEnabled,"mdFrequency":$var_mdFrequency,"noCodeCapiDomains":$var_noCodeCapiDomains
        | }
        """.stripMargin
}
