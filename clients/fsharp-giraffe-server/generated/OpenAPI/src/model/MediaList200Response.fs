namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.Media
open OpenAPI.Model.string option

module MediaList200Response =

  //#region MediaList200Response


  type media_list_200_response = {
    Bookmark : string option;
    Items : Media[];
  }
  //#endregion
