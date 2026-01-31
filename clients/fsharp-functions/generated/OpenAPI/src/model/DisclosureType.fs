namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module DisclosureType =

  //#region DisclosureType

  let NODISCLOSUREEnum = "NO_DISCLOSURE"
  let PRESCRIBINGINFORMATIONEnum = "PRESCRIBING_INFORMATION"
  let PRESCRIBINGINFORMATIONBOXWARNINGEnum = "PRESCRIBING_INFORMATION_BOX_WARNING"
  let IMPORTANTSAFETYINFOEnum = "IMPORTANT_SAFETY_INFO"
  let MEDGUIDEEnum = "MED_GUIDE"
  let PATIENTINFORMATIONEnum = "PATIENT_INFORMATION"
  type DisclosureType = string

  //#endregion
