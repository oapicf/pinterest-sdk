package api

import play.api.libs.json._
import model.Error
import model.RelatedTerms

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
trait TermsApi {
  /**
    * List related terms
    * Get a list of terms logically related to each input term. &lt;p/&gt; Example: the term &#39;workout&#39; would list related terms like &#39;one song workout&#39;, &#39;yoga workout&#39;, &#39;workout motivation&#39;, etc.
    * @param terms List of input terms.
    */
  def termsRelatedList(terms: List[String]): RelatedTerms

  /**
    * List suggested terms
    * Get popular search terms that begin with your input term. &lt;p/&gt; Example: &#39;sport&#39; would return popular terms like &#39;sports bar&#39; and &#39;sportswear&#39;, but not &#39;motor sports&#39; since the phrase does not begin with the given term.
    * @param term Input term.
    * @param limit Max suggested terms to return.
    */
  def termsSuggestedList(term: String, limit: Option[Int]): List[String]
}
