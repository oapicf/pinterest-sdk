package api

import play.api.libs.json._
import model.Error
import model.LabelCreateRequest
import model.LabelUpdateRequest
import model.LabelsList200Response
import model.LabelsResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
trait LabelsApi {
  /**
    * Create labels
    * &lt;p&gt; &lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Closed beta&lt;/a&gt; This endpoint is not available to all users. &lt;/p&gt; &lt;p&gt;   Apply one or more labels to a campaign.   Currently, you can apply brand and custom labels. Future releases will provide more options.    &lt;b&gt;Note:&lt;/b&gt; You can only apply one brand label to a campaign. You can apply 30 custom labels to a campaign.  &lt;/p&gt;
    * @param adAccountId Unique identifier of an ad account.
    */
  def labelsCreate(adAccountId: String, labelCreateRequest: LabelCreateRequest): LabelsResponse

  /**
    * List labels
    * &lt;p&gt;   &lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Closed beta&lt;/a&gt;   This endpoint is not available to all users. &lt;/p&gt; &lt;p&gt;   See a list of labels for assets that your account owns, and filter the list by different criteria. &lt;/p&gt;
    * @param adAccountId Unique identifier of an ad account.
    * @param campaignIds List of Campaign Ids to use to filter the results.
    * @param labelIds List of Label Ids to use to filter the results.
    * @param entityStatuses Label entity status
    * @param labelTypes Label type.
    * @param pageSize Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information.
    * @param bookmark Cursor used to fetch the next page of items
    */
  def labelsList(adAccountId: String, campaignIds: Option[List[String]], labelIds: Option[List[String]], entityStatuses: Option[List[String]], labelTypes: Option[List[String]], pageSize: Option[Int], bookmark: Option[String]): LabelsList200Response

  /**
    * Update labels
    * &lt;p&gt;   &lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Closed beta&lt;/a&gt;   This endpoint is not available to all users. &lt;/p&gt; &lt;p&gt;   Change the properties of one or more labels. &lt;/p&gt;
    * @param adAccountId Unique identifier of an ad account.
    */
  def labelsUpdate(adAccountId: String, labelUpdateRequest: LabelUpdateRequest): LabelsResponse
}
