namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConversionEventResponse
open OpenAPI.Model.string option

module PageVisitConversionTagsGet200Response =

  //#region PageVisitConversionTagsGet200Response

  [<CLIMutable>]
  type PageVisitConversionTagsGet200Response = {
    [<JsonProperty(PropertyName = "bookmark")>]
    Bookmark : string option;
    [<JsonProperty(PropertyName = "items")>]
    Items : ConversionEventResponse[];
  }

  //#endregion
