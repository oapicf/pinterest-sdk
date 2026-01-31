namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module LabelBulkUpdateRequest =

  //#region LabelBulkUpdateRequest

  [<CLIMutable>]
  type LabelBulkUpdateRequest = {
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "status")>]
    Status : string;
    [<JsonProperty(PropertyName = "value")>]
    Value : string;
  }

  //#endregion
