namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.LeadForm
open OpenAPI.Model.string option

module LeadFormsList200Response =

  //#region LeadFormsList200Response

  [<CLIMutable>]
  type LeadFormsList200Response = {
    [<JsonProperty(PropertyName = "bookmark")>]
    Bookmark : string option;
    [<JsonProperty(PropertyName = "items")>]
    Items : LeadForm[];
  }

  //#endregion
