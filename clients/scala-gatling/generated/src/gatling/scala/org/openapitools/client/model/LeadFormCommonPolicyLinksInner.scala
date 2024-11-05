
package org.openapitools.client.model


case class LeadFormCommonPolicyLinksInner (
    /* Policy label for an additional policy link. */
    _label: Option[String],
    /* Policy link for an additional policy link. */
    _link: Option[String]
)
object LeadFormCommonPolicyLinksInner {
    def toStringBody(var_label: Object, var_link: Object) =
        s"""
        | {
        | "label":$var_label,"link":$var_link
        | }
        """.stripMargin
}
