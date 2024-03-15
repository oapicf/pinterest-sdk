namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AdGroupResponse
open OpenAPI.Model.Exception

module AdGroupArrayResponseElement =

  //#region AdGroupArrayResponseElement


  type AdGroupArrayResponseElement = {
    Data : AdGroupResponse;
    Exceptions : Exception[];
  }
  //#endregion
