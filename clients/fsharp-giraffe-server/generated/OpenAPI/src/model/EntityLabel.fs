namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.EntityLabelStatus
open OpenAPI.Model.LabelParentType

module EntityLabel =

  //#region EntityLabel


  type EntityLabel = {
    EntityId : string;
    EntityType : LabelParentType;
    LabelId : string;
    Status : EntityLabelStatus;
  }
  //#endregion
