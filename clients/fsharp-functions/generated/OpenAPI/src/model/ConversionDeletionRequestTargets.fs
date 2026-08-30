namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConversionDeletionRequestEPIKTargets
open OpenAPI.Model.ConversionDeletionRequestUserEmailTargets

module ConversionDeletionRequestTargets =

  //#region ConversionDeletionRequestTargets

  [<CLIMutable>]
  type ConversionDeletionRequestTargets = {
    [<JsonProperty(PropertyName = "user_emails")>]
    UserEmails : string[];
    [<JsonProperty(PropertyName = "epiks")>]
    Epiks : string[];
  }

  //#endregion
