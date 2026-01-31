namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.BoardPrivacy
open OpenAPI.Model.string option

module BoardCreate =

  //#region BoardCreate

  [<CLIMutable>]
  type BoardCreate = {
    [<JsonProperty(PropertyName = "description")>]
    Description : string option;
    [<JsonProperty(PropertyName = "is_ads_only")>]
    IsAdsOnly : bool;
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "privacy")>]
    Privacy : BoardPrivacy;
  }

  //#endregion
