namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module AudienceStatus =

  //#region AudienceStatus

  let INITIALIZINGEnum = "INITIALIZING"
  let READYEnum = "READY"
  let TOOSMALLEnum = "TOO_SMALL"
  let ELIGIBLEEnum = "ELIGIBLE"
  let PERSONASINELIGIBLESIZEEnum = "PERSONAS_INELIGIBLE_SIZE"
  let PERSONASINITIALIZINGEnum = "PERSONAS_INITIALIZING"
  type AudienceStatus = string

  //#endregion
