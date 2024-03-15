namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CustomerList
open OpenAPI.Model.string option

module CustomerListsList200Response =

  //#region CustomerListsList200Response


  type customer_lists_list_200_response = {
    Items : CustomerList[];
    Bookmark : string option;
  }
  //#endregion
