namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.NullableLabelStatus
open OpenAPI.Model.NullableLabelType

module Label =

  //#region Label

  [<CLIMutable>]
  type Label = {
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
