package api

import model.Error
import model.RelatedTerms

/**
  * Provides a default implementation for [[TermsApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-26T05:47:41.394513697Z[Etc/UTC]", comments = "Generator version: 7.18.0")
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
