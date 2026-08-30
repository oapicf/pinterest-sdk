namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.LabelType

module LabelCreateItem =

  //#region LabelCreateItem

  [<CLIMutable>]
  type LabelCreateItem = {
    [<JsonProperty(PropertyName = "label_type")>]
    LabelType : LabelType;
    [<JsonProperty(PropertyName = "value")>]
    Value : string;
  }

  //#endregion
