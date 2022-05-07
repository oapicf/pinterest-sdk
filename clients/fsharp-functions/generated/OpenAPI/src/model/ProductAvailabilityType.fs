namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module ProductAvailabilityType =

  //#region ProductAvailabilityType

  let INSTOCKEnum = "IN_STOCK"
  let OUTOFSTOCKEnum = "OUT_OF_STOCK"
  let PREORDEREnum = "PREORDER"
  let NullEnum = "null"
  type ProductAvailabilityType = string

  //#endregion
