namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConversionDeletionRequestTargets

module ConversionDeletionRequestCreate =

  //#region ConversionDeletionRequestCreate

  [<CLIMutable>]
  type ConversionDeletionRequestCreate = {
    [<JsonProperty(PropertyName = "deletion_targets")>]
    DeletionTargets : ConversionDeletionRequestTargets;
  }

  //#endregion
