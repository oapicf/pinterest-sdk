namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.SSIOInsertionOrderStatus
open OpenAPI.Model.string option

module SsioInsertionOrdersStatusGetByAdAccount200Response =

  //#region SsioInsertionOrdersStatusGetByAdAccount200Response


  type ssio_insertion_orders_status_get_by_ad_account_200_response = {
    Items : SSIOInsertionOrderStatus[];
    Bookmark : string option;
  }
  //#endregion
