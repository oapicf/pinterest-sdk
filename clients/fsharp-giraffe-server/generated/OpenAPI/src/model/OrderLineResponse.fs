namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.OrderLine
open OpenAPI.Model.OrderLineError

module OrderLineResponse =

  //#region OrderLineResponse


  type OrderLineResponse = {
    Errors : OrderLineError[];
    OrderLine : OrderLine[];
  }
  //#endregion
