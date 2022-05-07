namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.OauthAccessTokenRequest
open OpenAPI.Model.OauthAccessTokenRequestCodeAllOf

module OauthAccessTokenRequestCode =

  //#region OauthAccessTokenRequestCode


  type OauthAccessTokenRequestCode = {
    Code : string;
    RedirectUri : string;
  }
  //#endregion
