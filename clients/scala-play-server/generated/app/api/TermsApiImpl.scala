package api

import model.Error
import model.RelatedTerms

/**
  * Provides a default implementation for [[TermsApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:25:30.649114982Z[Etc/UTC]", comments = "Generator version: 7.26.0")
class TermsApiImpl extends TermsApi {
  /**
    * @inheritdoc
    */
  override def termsRelatedList(terms: List[String]): RelatedTerms = {
    // TODO: Implement better logic

    RelatedTerms(None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def termsSuggestedList(term: String, limit: Option[Int]): List[String] = {
    // TODO: Implement better logic

    List.empty[String]
  }
}
