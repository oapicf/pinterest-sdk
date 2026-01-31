namespace OpenAPI.Model

open System
open System.Collections.Generic

module RecordCounts =

  //#region RecordCounts


  type RecordCounts = {
    Invalid : int;
    Processed : int;
    Valid : int;
  }
  //#endregion
