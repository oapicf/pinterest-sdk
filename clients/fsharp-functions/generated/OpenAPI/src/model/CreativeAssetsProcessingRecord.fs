namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ItemProcessingStatus
open OpenAPI.Model.ItemValidationEvent

module CreativeAssetsProcessingRecord =

  //#region CreativeAssetsProcessingRecord

  [<CLIMutable>]
  type CreativeAssetsProcessingRecord = {
    [<JsonProperty(PropertyName = "creative_assets_id")>]
    CreativeAssetsId : string;
    [<JsonProperty(PropertyName = "errors")>]
    Errors : ItemValidationEvent[];
    [<JsonProperty(PropertyName = "warnings")>]
    Warnings : ItemValidationEvent[];
    [<JsonProperty(PropertyName = "status")>]
    Status : ItemProcessingStatus;
  }

  //#endregion
