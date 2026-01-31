package api

import model.Audience
import model.AudienceCreateRequest
import model.AudienceUpdateRequest
import model.AudiencesList200Response
import model.Error

/**
  * Provides a default implementation for [[AudiencesApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
class AudiencesApiImpl extends AudiencesApi {
  /**
    * @inheritdoc
    */
  override def audiencesCreate(adAccountId: String, audienceCreateRequest: AudienceCreateRequest): Audience = {
    // TODO: Implement better logic

    Audience(None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def audiencesGet(adAccountId: String, audienceId: String): Audience = {
    // TODO: Implement better logic

    Audience(None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def audiencesList(adAccountId: String, bookmark: Option[String], order: Option[String], pageSize: Option[Int], ownershipType: Option[String]): AudiencesList200Response = {
    // TODO: Implement better logic

    AudiencesList200Response(None, List.empty[Audience])
  }

  /**
    * @inheritdoc
    */
  override def audiencesUpdate(adAccountId: String, audienceId: String, audienceUpdateRequest: AudienceUpdateRequest): Audience = {
    // TODO: Implement better logic

    Audience(None, None, None, None, None, None, None, None, None, None, None, None)
  }
}
