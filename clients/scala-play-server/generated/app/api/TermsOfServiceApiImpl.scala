package api

import model.Error
import model.TermsOfService

/**
  * Provides a default implementation for [[TermsOfServiceApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2025-05-10T05:44:38.070631387Z[Etc/UTC]", comments = "Generator version: 7.12.0")
class TermsOfServiceApiImpl extends TermsOfServiceApi {
  /**
    * @inheritdoc
    */
  override def termsOfServiceGet(adAccountId: String, includeHtml: Option[Boolean], tosType: Option[String]): TermsOfService = {
    // TODO: Implement better logic

    TermsOfService(None, None, None, None)
  }
}
