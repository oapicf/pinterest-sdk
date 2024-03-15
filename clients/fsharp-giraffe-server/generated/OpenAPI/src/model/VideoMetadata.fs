namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.string option

module VideoMetadata =

  //#region VideoMetadata


  type VideoMetadata = {
    ItemType : string;
    CoverImageUrl : string;
    VideoUrl : string option;
    Duration : decimal;
    Height : int;
    Width : int;
  }
  //#endregion
