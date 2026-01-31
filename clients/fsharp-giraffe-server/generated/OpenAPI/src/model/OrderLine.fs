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
    AdAccountId : string;
    Budget : decimal option;
    EndTime : decimal option;
    Id : string;
    Name : string option;
    PaidBudget : decimal option;
    PaidType : OrderLinePaidType;
    PurchaseOrderId : string option;
    StartTime : decimal;
    Status : OrderLineStatus;
    Type : string;
    CampaignIds : string[];
  }
  //#endregion
