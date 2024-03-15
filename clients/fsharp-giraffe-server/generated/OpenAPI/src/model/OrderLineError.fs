namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.OrderLine

module OrderLineError =

  //#region OrderLineError


  type OrderLineError = {
    Data : OrderLine;
    ErrorMessages : string[];
  }
  //#endregion
