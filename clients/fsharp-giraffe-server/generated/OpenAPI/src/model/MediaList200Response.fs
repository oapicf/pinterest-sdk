namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.MediaUploadDetails
open OpenAPI.Model.string option

module MediaList200Response =

  //#region MediaList200Response


  type media_list_200_response = {
    Items : MediaUploadDetails[];
    Bookmark : string option;
  }
  //#endregion
