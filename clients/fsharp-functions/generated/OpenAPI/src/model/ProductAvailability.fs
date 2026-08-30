namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module ProductAvailability =

  //#region ProductAvailability

  let INSTOCKEnum = "IN_STOCK"
  let OUTOFSTOCKEnum = "OUT_OF_STOCK"
  let PREORDEREnum = "PREORDER"
  type ProductAvailability = string

  //#endregion
