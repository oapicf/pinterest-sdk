namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AdResponse
open OpenAPI.Model.Exception

module AdArrayResponseElement =

  //#region AdArrayResponseElement


  type AdArrayResponseElement = {
    Data : AdResponse;
    Exceptions : Exception;
  }
  //#endregion
