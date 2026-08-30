namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.OrderLine
open OpenAPI.Model.OrderLineMutationError

module OrderLineMutationResult =

  //#region OrderLineMutationResult


  type OrderLineMutationResult = {
    Errors : OrderLineMutationError[];
    OrderLine : OrderLine[];
  }
  //#endregion
