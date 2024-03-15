package api

import model.Audience
import model.AudienceCreateCustomRequest
import model.AudienceCreateRequest
import model.AudienceUpdateRequest
import model.AudiencesList200Response
import model.Error

/**
  * Provides a default implementation for [[AudiencesApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
class AudiencesApiImpl extends AudiencesApi {
  /**
    * @inheritdoc
    */
  override def audiencesCreate(adAccountId: String, audienceCreateRequest: AudienceCreateRequest): Audience = {
    // TODO: Implement better logic

    Audience(None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def audiencesCreateCustom(adAccountId: String, audienceCreateCustomRequest: AudienceCreateCustomRequest): Audience = {
    // TODO: Implement better logic

    Audience(None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def audiencesGet(adAccountId: String, audienceId: String): Audience = {
    // TODO: Implement better logic

    Audience(None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def audiencesList(adAccountId: String, bookmark: Option[String], order: Option[String], pageSize: Option[Int], ownershipType: Option[String]): AudiencesList200Response = {
    // TODO: Implement better logic

    AudiencesList200Response(List.empty[Audience], None)
  }

  /**
    * @inheritdoc
    */
  override def audiencesUpdate(adAccountId: String, audienceId: String, audienceUpdateRequest: Option[AudienceUpdateRequest]): Audience = {
    // TODO: Implement better logic

    Audience(None, None, None, None, None, None, None, None, None, None, None)
  }
}
