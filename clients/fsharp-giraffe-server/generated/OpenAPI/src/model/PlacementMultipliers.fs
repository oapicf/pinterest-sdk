namespace OpenAPI.Model

open System
open System.Collections.Generic
open System.Collections.Generic

module PlacementMultipliers =

  //#region PlacementMultipliers

  //#region enums
  type PLACEMENTEnum = SEARCHEnum of string  |  BROWSEEnum of string  
  //#endregion

  type PlacementMultipliers = {
    PLACEMENT : PLACEMENTEnum;
  }
  //#endregion
