namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.NullableLabelStatus
open OpenAPI.Model.NullableLabelType

module LabelErrorData =

  //#region LabelErrorData

  [<CLIMutable>]
  type LabelErrorData = {
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "label_type")>]
    LabelType : NullableLabelType;
    [<JsonProperty(PropertyName = "status")>]
    Status : NullableLabelStatus;
    [<JsonProperty(PropertyName = "value")>]
    Value : string;
  }

  //#endregion
