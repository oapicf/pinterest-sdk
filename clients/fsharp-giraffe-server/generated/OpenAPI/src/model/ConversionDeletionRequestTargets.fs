namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ConversionDeletionRequestEPIKTargets
open OpenAPI.Model.ConversionDeletionRequestUserEmailTargets

module ConversionDeletionRequestTargets =

  //#region ConversionDeletionRequestTargets


  type ConversionDeletionRequestTargets = {
    UserEmails : string[];
    Epiks : string[];
  }
  //#endregion
