namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.EntityLabel
open OpenAPI.Model.EntityLabelError

module LabeledEntities =

  //#region LabeledEntities


  type LabeledEntities = {
    EntitiesLabels : EntityLabel[];
    Errors : EntityLabelError[];
  }
  //#endregion
