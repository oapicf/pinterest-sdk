namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.string option

module BoardMedia =

  //#region BoardMedia


  type BoardMedia = {
    ImageCoverUrl : string option;
    PinThumbnailUrls : string[];
  }
  //#endregion
