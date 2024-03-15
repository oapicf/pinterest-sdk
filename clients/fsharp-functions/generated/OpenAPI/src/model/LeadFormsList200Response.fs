namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.LeadFormResponse
open OpenAPI.Model.string option

module LeadFormsList200Response =

  //#region LeadFormsList200Response

  [<CLIMutable>]
  type LeadFormsList200Response = {
    [<JsonProperty(PropertyName = "items")>]
    Items : LeadFormResponse[];
    [<JsonProperty(PropertyName = "bookmark")>]
    Bookmark : string option;
  }

  //#endregion
