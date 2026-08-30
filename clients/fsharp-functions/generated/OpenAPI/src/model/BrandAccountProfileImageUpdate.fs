namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module BrandAccountProfileImageUpdate =

  //#region BrandAccountProfileImageUpdate

  [<CLIMutable>]
  type BrandAccountProfileImageUpdate = {
    [<JsonProperty(PropertyName = "content_type")>]
    ContentType : string;
    [<JsonProperty(PropertyName = "data")>]
    Data : string;
  }

  //#endregion
