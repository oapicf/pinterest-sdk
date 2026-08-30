package api

import model.AdAccountsAudience
import model.AdAccountsAudienceCreate
import model.AdAccountsAudienceUpdate
import model.AudienceOwnershipType
import model.AudiencesList200Response
import model.Error
import model.PaginationOrder

/**
  * Provides a default implementation for [[AudiencesApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
class AudiencesApiImpl extends AudiencesApi {
  /**
    * @inheritdoc
    */
  override def audiencesCreate(adAccountId: String, adAccountsAudienceCreate: AdAccountsAudienceCreate): AdAccountsAudience = {
    // TODO: Implement better logic

    AdAccountsAudience(None, None, None, None, None, "", None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def audiencesGet(audienceId: String, adAccountId: String): AdAccountsAudience = {
    // TODO: Implement better logic

    AdAccountsAudience(None, None, None, None, None, "", None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def audiencesList(adAccountId: String, bookmark: Option[String], pageSize: Option[Int], order: Option[PaginationOrder], ownershipType: Option[AudienceOwnershipType], excludeNca: Option[Boolean]): AudiencesList200Response = {
    // TODO: Implement better logic

    AudiencesList200Response(None, List.empty[AdAccountsAudience])
  }

  /**
    * @inheritdoc
    */
  override def audiencesUpdate(audienceId: String, adAccountId: String, adAccountsAudienceUpdate: AdAccountsAudienceUpdate): AdAccountsAudience = {
    // TODO: Implement better logic

    AdAccountsAudience(None, None, None, None, None, "", None, None, None, None, None, None, None)
  }
}
