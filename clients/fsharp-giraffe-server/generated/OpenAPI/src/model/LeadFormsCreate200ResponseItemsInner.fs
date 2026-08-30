namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.LeadForm
open OpenAPI.Model.PinterestLibBatchItemException

module LeadFormsCreate200ResponseItemsInner =

  //#region LeadFormsCreate200ResponseItemsInner


  type lead_forms_create_200_response_items_inner = {
    Data : LeadForm;
    Exceptions : PinterestLibBatchItemException[];
  }
  //#endregion
