namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.OrderLinePaidType
open OpenAPI.Model.OrderLineStatus
open OpenAPI.Model.decimal option
open OpenAPI.Model.string option

module OrderLines =

  //#region OrderLines

  [<CLIMutable>]
  type OrderLines = {
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "type")>]
    Type : string;
    [<JsonProperty(PropertyName = "ad_account_id")>]
    AdAccountId : string;
    [<JsonProperty(PropertyName = "purchase_order_id")>]
    PurchaseOrderId : string option;
    [<JsonProperty(PropertyName = "start_time")>]
    StartTime : decimal;
    [<JsonProperty(PropertyName = "end_time")>]
    EndTime : decimal option;
    [<JsonProperty(PropertyName = "budget")>]
    Budget : decimal option;
    [<JsonProperty(PropertyName = "paid_budget")>]
    PaidBudget : decimal option;
    [<JsonProperty(PropertyName = "status")>]
    Status : OrderLineStatus;
    [<JsonProperty(PropertyName = "name")>]
    Name : string option;
    [<JsonProperty(PropertyName = "paid_type")>]
    PaidType : OrderLinePaidType;
  }

  //#endregion
