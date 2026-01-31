package api

import play.api.libs.json._
import model.CustomerListUploadCreateRequest
import model.CustomerListUploadCreateResponse
import model.CustomerListUploadResponse
import model.Error

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
trait CustomerListUploadsApi {
  /**
    * Create customer list upload
    * &lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Closed beta&lt;/a&gt;  &lt;p&gt;Create a customer list upload request for multipart S3 upload.&lt;/p&gt; &lt;p&gt;Note: Each part must be at least 5mb; however the last part can be any size greater than 0. Clients with smaller files can request a single part count. This minimal part size restriction is defined by the AWS S3 API.&lt;/p&gt; &lt;p&gt;&lt;b&gt;Please review the &lt;u&gt;&lt;a href&#x3D;\&quot;/docs/api/v5/customer_lists-update/\&quot; target&#x3D;\&quot;_blank\&quot;&gt;update customer list endpoint&lt;/a&gt;&lt;/u&gt; documentation for additional information.&lt;/b&gt;&lt;/p&gt;
    * @param adAccountId Unique identifier of an ad account.
    * @param customerListId Unique identifier of a customer list
    * @param customerListUploadCreateRequest Parameters to create a customer list upload request
    */
  def customerListUploadsCreate(adAccountId: String, customerListId: String, customerListUploadCreateRequest: CustomerListUploadCreateRequest): CustomerListUploadCreateResponse

  /**
    * Get customer list upload
    * &lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Closed beta&lt;/a&gt; &lt;p&gt;Get the metadata for a given upload by its ID.&lt;/p&gt;
    * @param adAccountId Unique identifier of an ad account.
    * @param customerListId Unique identifier of a customer list
    * @param customerListUploadId Unique identifier of a customer list upload
    */
  def customerListUploadsGet(adAccountId: String, customerListId: String, customerListUploadId: String): CustomerListUploadResponse

  /**
    * Run customer list upload
    * &lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Closed beta&lt;/a&gt; &lt;p&gt;Begin processing a customer list upload.&lt;/p&gt;
    * @param adAccountId Unique identifier of an ad account.
    * @param customerListId Unique identifier of a customer list
    * @param customerListUploadId Unique identifier of a customer list upload
    */
  def customerListUploadsRun(adAccountId: String, customerListId: String, customerListUploadId: String): CustomerListUploadResponse
}
