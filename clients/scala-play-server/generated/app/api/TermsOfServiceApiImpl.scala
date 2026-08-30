package api

import model.Error
import model.TermsOfService

/**
  * Provides a default implementation for [[TermsOfServiceApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
class TermsOfServiceApiImpl extends TermsOfServiceApi {
  /**
    * @inheritdoc
    */
  override def termsOfServiceGet(adAccountId: String, includeHtml: Option[Boolean], tosType: Option[String]): TermsOfService = {
    // TODO: Implement better logic

    TermsOfService(None, None, None, None)
  }
}
