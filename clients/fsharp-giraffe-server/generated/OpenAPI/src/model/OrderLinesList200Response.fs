namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.OrderLine
open OpenAPI.Model.string option

module OrderLinesList200Response =

  //#region OrderLinesList200Response


  type order_lines_list_200_response = {
    Items : OrderLine[];
    Bookmark : string option;
  }
  //#endregion
