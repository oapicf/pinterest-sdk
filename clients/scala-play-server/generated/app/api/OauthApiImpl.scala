package api

import model.Error
import model.OauthAccessTokenResponse

/**
  * Provides a default implementation for [[OauthApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
class OauthApiImpl extends OauthApi {
  /**
    * @inheritdoc
    */
  override def oauthToken(grantType: String): OauthAccessTokenResponse = {
    // TODO: Implement better logic

    OauthAccessTokenResponse(None, "", bearer, 0, "")
  }
}
