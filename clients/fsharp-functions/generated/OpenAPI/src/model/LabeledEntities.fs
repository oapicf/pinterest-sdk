namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.EntityLabel
open OpenAPI.Model.EntityLabelError

module LabeledEntities =

  //#region LabeledEntities

  [<CLIMutable>]
  type LabeledEntities = {
    [<JsonProperty(PropertyName = "entities_labels")>]
    EntitiesLabels : EntityLabel[];
    [<JsonProperty(PropertyName = "errors")>]
    Errors : EntityLabelError[];
  }

  //#endregion
