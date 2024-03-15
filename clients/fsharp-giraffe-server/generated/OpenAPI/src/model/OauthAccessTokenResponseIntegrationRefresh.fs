namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.OauthAccessTokenResponse

module OauthAccessTokenResponseIntegrationRefresh =

  //#region OauthAccessTokenResponseIntegrationRefresh


  type OauthAccessTokenResponseIntegrationRefresh = {
    RefreshToken : string;
    RefreshTokenExpiresIn : int;
  }
  //#endregion
