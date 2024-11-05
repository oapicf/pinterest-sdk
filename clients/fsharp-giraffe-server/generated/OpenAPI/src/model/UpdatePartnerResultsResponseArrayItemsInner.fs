namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.BusinessAccessError
open OpenAPI.Model.string option

module UpdatePartnerResultsResponseArrayItemsInner =

  //#region UpdatePartnerResultsResponseArrayItemsInner


  type UpdatePartnerResultsResponseArray_items_inner = {
    Exception : BusinessAccessError;
    MemberOrPartnerId : string option;
  }
  //#endregion
