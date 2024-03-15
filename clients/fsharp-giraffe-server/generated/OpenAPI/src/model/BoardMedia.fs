namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.string option

module BoardMedia =

  //#region BoardMedia


  type Board_media = {
    ImageCoverUrl : string option;
    PinThumbnailUrls : string[];
  }
  //#endregion
