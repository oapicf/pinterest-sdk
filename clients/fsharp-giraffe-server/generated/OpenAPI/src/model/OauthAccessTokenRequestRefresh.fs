namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.OauthAccessTokenRequest
open OpenAPI.Model.OauthAccessTokenRequestRefreshAllOf

module OauthAccessTokenRequestRefresh =

  //#region OauthAccessTokenRequestRefresh


  type OauthAccessTokenRequestRefresh = {
    RefreshToken : string;
    Scope : string;
  }
  //#endregion
