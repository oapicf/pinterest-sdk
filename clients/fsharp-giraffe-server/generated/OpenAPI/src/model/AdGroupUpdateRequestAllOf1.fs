namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.TargetingSpecOperations

module AdGroupUpdateRequestAllOf1 =

  //#region AdGroupUpdateRequestAllOf1


  type AdGroupUpdateRequestAllOf1 = {
    BidMultiplier : decimal;
    Id : string;
    TargetingSpecOperations : TargetingSpecOperations[];
  }
  //#endregion
