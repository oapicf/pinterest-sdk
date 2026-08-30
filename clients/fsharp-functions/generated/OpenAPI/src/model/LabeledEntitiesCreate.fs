namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module LabeledEntitiesCreate =

  //#region LabeledEntitiesCreate

  [<CLIMutable>]
  type LabeledEntitiesCreate = {
    [<JsonProperty(PropertyName = "entity_ids")>]
    EntityIds : string[];
  }

  //#endregion
