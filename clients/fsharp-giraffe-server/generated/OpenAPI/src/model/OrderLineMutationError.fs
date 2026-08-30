namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.OrderLine

module OrderLineMutationError =

  //#region OrderLineMutationError


  type OrderLineMutationError = {
    Data : OrderLine;
    ErrorMessages : string[];
  }
  //#endregion
