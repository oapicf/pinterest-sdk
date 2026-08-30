namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module ConversionDeletionRequestUserEmailTargets =

  //#region ConversionDeletionRequestUserEmailTargets

  [<CLIMutable>]
  type ConversionDeletionRequestUserEmailTargets = {
    [<JsonProperty(PropertyName = "user_emails")>]
    UserEmails : string[];
  }

  //#endregion
