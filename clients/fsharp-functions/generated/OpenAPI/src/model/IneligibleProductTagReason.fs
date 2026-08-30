namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module IneligibleProductTagReason =

  //#region IneligibleProductTagReason

  let PINMISSINGEnum = "PIN_MISSING"
  let PINISPRIVATEEnum = "PIN_IS_PRIVATE"
  let PRODUCTMETADATAMISSINGEnum = "PRODUCT_METADATA_MISSING"
  let PINNOTFROMVERIFIEDDOMAINEnum = "PIN_NOT_FROM_VERIFIED_DOMAIN"
  let PINNOTFROMSAMEUSERASHEROPINEnum = "PIN_NOT_FROM_SAME_USER_AS_HERO_PIN"
  type IneligibleProductTagReason = string

  //#endregion
