namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.OauthAccessTokenRequest

module OauthAccessTokenRequestRefresh =

  //#region OauthAccessTokenRequestRefresh


  type OauthAccessTokenRequestRefresh = {
    RefreshToken : string;
    Scope : string;
    RefreshOn : bool;
  }
  //#endregion
