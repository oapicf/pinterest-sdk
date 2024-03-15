namespace OpenAPI.Model

open System
open System.Collections.Generic

module SingleInterestTargetingOptionResponse =

  //#region SingleInterestTargetingOptionResponse


  type SingleInterestTargetingOptionResponse = {
    Id : string;
    Name : string;
    ChildInterests : string[];
    Level : int;
  }
  //#endregion
