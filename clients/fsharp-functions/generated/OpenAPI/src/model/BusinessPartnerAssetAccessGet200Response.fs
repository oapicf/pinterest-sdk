namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.GetPartnerAssetsResponse
open OpenAPI.Model.string option

module BusinessPartnerAssetAccessGet200Response =

  //#region BusinessPartnerAssetAccessGet200Response

  [<CLIMutable>]
  type BusinessPartnerAssetAccessGet200Response = {
    [<JsonProperty(PropertyName = "items")>]
    Items : GetPartnerAssetsResponse[];
    [<JsonProperty(PropertyName = "bookmark")>]
    Bookmark : string option;
  }

  //#endregion
