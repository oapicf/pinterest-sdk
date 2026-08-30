namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module ConversionDeletionRequestEPIKTargets =

  //#region ConversionDeletionRequestEPIKTargets

  [<CLIMutable>]
  type ConversionDeletionRequestEPIKTargets = {
    [<JsonProperty(PropertyName = "epiks")>]
    Epiks : string[];
  }

  //#endregion
