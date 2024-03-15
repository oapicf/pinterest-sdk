namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.OauthAccessTokenResponse

module OauthAccessTokenResponseEverlastingRefresh =

  //#region OauthAccessTokenResponseEverlastingRefresh


  type OauthAccessTokenResponseEverlastingRefresh = {
    RefreshToken : string;
    RefreshTokenExpiresIn : int;
    RefreshTokenExpiresAt : int;
  }
  //#endregion
