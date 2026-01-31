namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.LabelStatus
open OpenAPI.Model.LabelType
open OpenAPI.Model.string option

module Label =

  //#region Label

  [<CLIMutable>]
  type Label = {
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "label_type")>]
    LabelType : LabelType;
    [<JsonProperty(PropertyName = "parent_id")>]
    ParentId : string;
    [<JsonProperty(PropertyName = "parent_type")>]
    ParentType : string option;
    [<JsonProperty(PropertyName = "status")>]
    Status : LabelStatus;
    [<JsonProperty(PropertyName = "value")>]
    Value : string;
  }

  //#endregion
