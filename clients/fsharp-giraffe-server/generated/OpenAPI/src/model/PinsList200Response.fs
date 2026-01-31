namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.Pin
open OpenAPI.Model.string option

module PinsList200Response =

  //#region PinsList200Response


  type pins_list_200_response = {
    Bookmark : string option;
    Items : Pin[];
  }
  //#endregion
