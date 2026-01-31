namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.LabelsResponse
open OpenAPI.Model.string option

module LabelsList200Response =

  //#region LabelsList200Response


  type labels_list_200_response = {
    Bookmark : string option;
    Items : LabelsResponse[];
  }
  //#endregion
