package api

import play.api.libs.json._
import model.Error
import model.OauthAccessTokenResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2022-05-07T10:47:31.836531Z[Etc/UTC]")
trait OauthApi {
  /**
    * Generate OAuth access token
    * Generate an OAuth access token by using an authorization code or a refresh token.  See &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Authentication&#39;&gt;Authentication&lt;/a&gt; for more.
    */
  def oauthToken(grantType: String): OauthAccessTokenResponse
}
