
package org.openapitools.client.model


case class ConversionTagCommon (
    /* Ad account ID. */
    _adAccountId: Option[String],
    /* Tag code snippet. */
    _codeSnippet: Option[String],
    _enhancedMatchStatus: Option[EnhancedMatchStatusType],
    /* Tag ID. */
    _id: Option[String],
    /* Time for the last event fired. */
    _lastFiredTimeMs: Option[Number],
    /* Conversion tag name. */
    _name: Option[String],
    _status: Option[EntityStatus],
    /* Version number. */
    _version: Option[String],
    _configs: Option[ConversionTagConfigs]
)
object ConversionTagCommon {
    def toStringBody(var_adAccountId: Object, var_codeSnippet: Object, var_enhancedMatchStatus: Object, var_id: Object, var_lastFiredTimeMs: Object, var_name: Object, var_status: Object, var_version: Object, var_configs: Object) =
        s"""
        | {
        | "adAccountId":$var_adAccountId,"codeSnippet":$var_codeSnippet,"enhancedMatchStatus":$var_enhancedMatchStatus,"id":$var_id,"lastFiredTimeMs":$var_lastFiredTimeMs,"name":$var_name,"status":$var_status,"version":$var_version,"configs":$var_configs
        | }
        """.stripMargin
}
