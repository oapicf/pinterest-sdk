namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.string option

module Paginated =

  //#region Paginated


  type Paginated = {
    Items : obj[];
    Bookmark : string option;
  }
  //#endregion
