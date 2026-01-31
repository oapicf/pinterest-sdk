namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.string option

module Paginated =

  //#region Paginated


  type Paginated = {
    Bookmark : string option;
    Items : obj[];
  }
  //#endregion
