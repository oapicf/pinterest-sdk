namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AdvancedAuctionOperationError
open OpenAPI.Model.Country
open OpenAPI.Model.Language

module AdvancedAuctionItemsSubmitDeleteRecord =

  //#region AdvancedAuctionItemsSubmitDeleteRecord

  //#region enums
  type OperationEnum = DELETEEnum of string  
  //#endregion

  type AdvancedAuctionItemsSubmitDeleteRecord = {
    Country : Country;
    Errors : AdvancedAuctionOperationError[];
    ItemId : string;
    Language : Language;
    Operation : OperationEnum;
  }
  //#endregion
