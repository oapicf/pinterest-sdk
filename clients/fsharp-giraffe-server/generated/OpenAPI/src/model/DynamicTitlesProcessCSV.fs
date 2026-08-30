namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.DynamicTitlesProcessCSVError

module DynamicTitlesProcessCSV =

  //#region DynamicTitlesProcessCSV


  type DynamicTitlesProcessCSV = {
    Errors : DynamicTitlesProcessCSVError[];
    Status : string;
  }
  //#endregion
