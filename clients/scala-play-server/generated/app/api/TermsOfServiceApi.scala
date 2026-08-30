package api

import play.api.libs.json._
import model.Error
import model.TermsOfService

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
trait TermsOfServiceApi {
  /**
    * Get terms of service
    * Get the text of the terms of service and see whether the advertiser has accepted the terms of service.
    * @param adAccountId Unique identifier of an ad account.
    * @param includeHtml Return HTML in TOS text.
    * @param tosType Request type.
    */
  def termsOfServiceGet(adAccountId: String, includeHtml: Option[Boolean], tosType: Option[String]): TermsOfService
}
