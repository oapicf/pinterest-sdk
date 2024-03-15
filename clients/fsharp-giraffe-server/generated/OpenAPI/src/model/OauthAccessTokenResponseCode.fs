namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.OauthAccessTokenResponse

module OauthAccessTokenResponseCode =

  //#region OauthAccessTokenResponseCode


  type OauthAccessTokenResponseCode = {
    RefreshToken : string;
    RefreshTokenExpiresIn : int;
  }
  //#endregion
