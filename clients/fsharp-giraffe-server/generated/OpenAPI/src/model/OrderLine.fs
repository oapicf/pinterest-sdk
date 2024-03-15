namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.OrderLinePaidType
open OpenAPI.Model.OrderLineStatus
open OpenAPI.Model.decimal option
open OpenAPI.Model.string option

module OrderLine =

  //#region OrderLine


  type OrderLine = {
    Id : string;
    Type : string;
    AdAccountId : string;
    PurchaseOrderId : string option;
    StartTime : decimal;
    EndTime : decimal option;
    Budget : decimal option;
    PaidBudget : decimal option;
    Status : OrderLineStatus;
    Name : string option;
    PaidType : OrderLinePaidType;
    CampaignIds : string[];
  }
  //#endregion
