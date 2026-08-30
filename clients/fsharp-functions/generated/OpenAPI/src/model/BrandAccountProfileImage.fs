namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module BrandAccountProfileImage =

  //#region BrandAccountProfileImage

  [<CLIMutable>]
  type BrandAccountProfileImage = {
    [<JsonProperty(PropertyName = "content_type")>]
    ContentType : string;
    [<JsonProperty(PropertyName = "data")>]
    Data : string;
  }

  //#endregion
