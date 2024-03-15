package api

import model.Error
import model.OauthAccessTokenResponse

/**
  * Provides a default implementation for [[OauthApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
class OauthApiImpl extends OauthApi {
  /**
    * @inheritdoc
    */
  override def oauthToken(grantType: String): OauthAccessTokenResponse = {
    // TODO: Implement better logic

    OauthAccessTokenResponse(None, "", bearer, 0, "")
  }
}
