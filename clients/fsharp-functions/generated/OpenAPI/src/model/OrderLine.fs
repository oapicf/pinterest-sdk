namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.OrderLinePaidType
open OpenAPI.Model.OrderLineStatus
open OpenAPI.Model.decimal option
open OpenAPI.Model.string option

module OrderLine =

  //#region OrderLine

  [<CLIMutable>]
  type OrderLine = {
    [<JsonProperty(PropertyName = "ad_account_id")>]
    AdAccountId : string;
    [<JsonProperty(PropertyName = "budget")>]
    Budget : decimal option;
    [<JsonProperty(PropertyName = "campaign_ids")>]
    CampaignIds : string[];
    [<JsonProperty(PropertyName = "end_time")>]
    EndTime : decimal option;
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "name")>]
    Name : string option;
    [<JsonProperty(PropertyName = "paid_budget")>]
    PaidBudget : decimal option;
    [<JsonProperty(PropertyName = "paid_type")>]
    PaidType : OrderLinePaidType;
    [<JsonProperty(PropertyName = "purchase_order_id")>]
    PurchaseOrderId : string option;
    [<JsonProperty(PropertyName = "start_time")>]
    StartTime : decimal;
    [<JsonProperty(PropertyName = "status")>]
    Status : OrderLineStatus;
    [<JsonProperty(PropertyName = "type")>]
    Type : string;
  }

  //#endregion
