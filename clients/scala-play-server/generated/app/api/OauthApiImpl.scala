package api

import model.ConversionAccessToken
import model.Error
import model.OauthAccessToken
import model.TokenGrantType
import model.TokenTypeHint

/**
  * Provides a default implementation for [[OauthApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
class OauthApiImpl extends OauthApi {
  /**
    * @inheritdoc
    */
  override def oauthConversionToken(): ConversionAccessToken = {
    // TODO: Implement better logic

    ConversionAccessToken("", None)
  }

  /**
    * @inheritdoc
    */
  override def oauthToken(grantType: TokenGrantType, code: Option[String], continuousRefresh: Option[String], redirectUri: Option[String], refreshToken: Option[String], scope: Option[String]): OauthAccessToken = {
    // TODO: Implement better logic

    OauthAccessToken("", 0, None, None, None, None, None, bearer)
  }

  /**
    * @inheritdoc
    */
  override def tokenRevoke(token: String, tokenTypeHint: Option[TokenTypeHint]): Unit = {
    // TODO: Implement better logic

    
  }
}
