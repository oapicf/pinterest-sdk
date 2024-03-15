namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.SSIOOrderLine
open OpenAPI.Model.string option

module SsioOrderLinesGetByAdAccount200Response =

  //#region SsioOrderLinesGetByAdAccount200Response


  type ssio_order_lines_get_by_ad_account_200_response = {
    Items : SSIOOrderLine[];
    Bookmark : string option;
  }
  //#endregion
