namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module ItemAvailability =

  //#region ItemAvailability

  let InStockEnum = "in stock"
  let OutOfStockEnum = "out of stock"
  let PreorderEnum = "preorder"
  type ItemAvailability = string

  //#endregion
