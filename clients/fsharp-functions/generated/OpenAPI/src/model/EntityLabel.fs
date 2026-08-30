namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.EntityLabelStatus
open OpenAPI.Model.LabelParentType

module EntityLabel =

  //#region EntityLabel

  [<CLIMutable>]
  type EntityLabel = {
    [<JsonProperty(PropertyName = "entity_id")>]
    EntityId : string;
    [<JsonProperty(PropertyName = "entity_type")>]
    EntityType : LabelParentType;
    [<JsonProperty(PropertyName = "label_id")>]
    LabelId : string;
    [<JsonProperty(PropertyName = "status")>]
    Status : EntityLabelStatus;
  }

  //#endregion
