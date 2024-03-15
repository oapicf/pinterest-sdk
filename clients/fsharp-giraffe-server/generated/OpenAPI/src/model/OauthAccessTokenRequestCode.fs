namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.OauthAccessTokenRequest

module OauthAccessTokenRequestCode =

  //#region OauthAccessTokenRequestCode


  type OauthAccessTokenRequestCode = {
    Code : string;
    RedirectUri : string;
  }
  //#endregion
