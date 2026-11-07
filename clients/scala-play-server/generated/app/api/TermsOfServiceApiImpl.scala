package api

import model.Error
import model.TermsOfService

/**
  * Provides a default implementation for [[TermsOfServiceApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T04:12:42.952922086Z[Etc/UTC]", comments = "Generator version: 7.26.0")
class TermsOfServiceApiImpl extends TermsOfServiceApi {
  /**
    * @inheritdoc
    */
  override def termsOfServiceGet(adAccountId: String, includeHtml: Option[Boolean], tosType: Option[String]): TermsOfService = {
    // TODO: Implement better logic

    TermsOfService(None, None, None, None)
  }
}
