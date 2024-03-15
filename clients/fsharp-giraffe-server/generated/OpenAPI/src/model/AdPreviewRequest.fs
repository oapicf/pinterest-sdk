namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AdPreviewCreateFromImage
open OpenAPI.Model.AdPreviewCreateFromPin

module AdPreviewRequest =

  //#region AdPreviewRequest


  type AdPreviewRequest = {
    ImageUrl : string;
    Title : string;
    PinId : string;
  }
  //#endregion
