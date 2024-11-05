namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.Exception
open OpenAPI.Model.LeadFormResponse

module LeadFormArrayResponseItemsInner =

  //#region LeadFormArrayResponseItemsInner


  type LeadFormArrayResponse_items_inner = {
    Data : LeadFormResponse;
    Exceptions : Exception[];
  }
  //#endregion
