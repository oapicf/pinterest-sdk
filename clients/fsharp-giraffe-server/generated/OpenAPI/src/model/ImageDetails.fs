namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.int option

module ImageDetails =

  //#region ImageDetails


  type ImageDetails = {
    Width : int;
    Height : int option;
    Url : string;
  }
  //#endregion
