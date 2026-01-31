namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.LabelType

module LabelCreateRequestLabelsInner =

  //#region LabelCreateRequestLabelsInner

  [<CLIMutable>]
  type LabelCreateRequestLabelsInner = {
    [<JsonProperty(PropertyName = "label_type")>]
    LabelType : LabelType;
    [<JsonProperty(PropertyName = "value")>]
    Value : string;
  }

  //#endregion
