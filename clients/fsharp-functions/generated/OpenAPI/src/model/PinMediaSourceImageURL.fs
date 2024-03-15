namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module PinMediaSourceImageURL =

  //#region PinMediaSourceImageURL

  [<CLIMutable>]
  type PinMediaSourceImageURL = {
    [<JsonProperty(PropertyName = "source_type")>]
    SourceType : string;
    [<JsonProperty(PropertyName = "url")>]
    Url : string;
    [<JsonProperty(PropertyName = "is_standard")>]
    IsStandard : bool;
  }

  //#endregion
