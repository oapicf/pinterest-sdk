namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module SSIOEditInsertionOrderRequest =

  //#region SSIOEditInsertionOrderRequest

  [<CLIMutable>]
  type SSIOEditInsertionOrderRequest = {
    [<JsonProperty(PropertyName = "start_date")>]
    StartDate : string;
    [<JsonProperty(PropertyName = "end_date")>]
    EndDate : string;
    [<JsonProperty(PropertyName = "po_number")>]
    PoNumber : string;
    [<JsonProperty(PropertyName = "budget_amount")>]
    BudgetAmount : decimal;
    [<JsonProperty(PropertyName = "billing_contact_firstname")>]
    BillingContactFirstname : string;
    [<JsonProperty(PropertyName = "billing_contact_lastname")>]
    BillingContactLastname : string;
    [<JsonProperty(PropertyName = "billing_contact_email")>]
    BillingContactEmail : string;
    [<JsonProperty(PropertyName = "media_contact_firstname")>]
    MediaContactFirstname : string;
    [<JsonProperty(PropertyName = "media_contact_lastname")>]
    MediaContactLastname : string;
    [<JsonProperty(PropertyName = "media_contact_email")>]
    MediaContactEmail : string;
    [<JsonProperty(PropertyName = "agency_link")>]
    AgencyLink : string;
    [<JsonProperty(PropertyName = "user_email")>]
    UserEmail : string;
    [<JsonProperty(PropertyName = "oracle_line_id")>]
    OracleLineId : string;
    [<JsonProperty(PropertyName = "salesforce_order_id")>]
    SalesforceOrderId : string;
    [<JsonProperty(PropertyName = "salesforce_order_line_id")>]
    SalesforceOrderLineId : string;
    [<JsonProperty(PropertyName = "ads_manager_order_line_id")>]
    AdsManagerOrderLineId : string;
  }

  //#endregion
