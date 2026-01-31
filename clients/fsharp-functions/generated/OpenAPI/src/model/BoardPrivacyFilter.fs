namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module BoardPrivacyFilter =

  //#region BoardPrivacyFilter

  let ALLEnum = "ALL"
  let PUBLICEnum = "PUBLIC"
  let PROTECTEDEnum = "PROTECTED"
  let SECRETEnum = "SECRET"
  let PUBLICANDSECRETEnum = "PUBLIC_AND_SECRET"
  type BoardPrivacyFilter = string

  //#endregion
