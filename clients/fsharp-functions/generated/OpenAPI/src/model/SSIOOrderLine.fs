namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.Currency
open OpenAPI.Model.decimal option
open OpenAPI.Model.string option

module SSIOOrderLine =

  //#region SSIOOrderLine

  [<CLIMutable>]
  type SSIOOrderLine = {
    [<JsonProperty(PropertyName = "salesforce_order_line_id")>]
    SalesforceOrderLineId : string option;
    [<JsonProperty(PropertyName = "ads_manager_order_line_id")>]
    AdsManagerOrderLineId : string option;
    [<JsonProperty(PropertyName = "pin_order_id")>]
    PinOrderId : string option;
    [<JsonProperty(PropertyName = "last_modified_date_time")>]
    LastModifiedDateTime : string option;
    [<JsonProperty(PropertyName = "start_date")>]
    StartDate : DateTime;
    [<JsonProperty(PropertyName = "end_date")>]
    EndDate : DateTime;
    [<JsonProperty(PropertyName = "bill_to_company_name")>]
    BillToCompanyName : string option;
    [<JsonProperty(PropertyName = "billing_contact_firstname")>]
    BillingContactFirstname : string option;
    [<JsonProperty(PropertyName = "billing_contact_lastname")>]
    BillingContactLastname : string option;
    [<JsonProperty(PropertyName = "billing_contact_email")>]
    BillingContactEmail : string option;
    [<JsonProperty(PropertyName = "media_contact_email")>]
    MediaContactEmail : string option;
    [<JsonProperty(PropertyName = "media_contact_firstname")>]
    MediaContactFirstname : string option;
    [<JsonProperty(PropertyName = "media_contact_lastname")>]
    MediaContactLastname : string option;
    [<JsonProperty(PropertyName = "currency_info")>]
    CurrencyInfo : Currency;
    [<JsonProperty(PropertyName = "agency_link")>]
    AgencyLink : string option;
    [<JsonProperty(PropertyName = "po_number")>]
    PoNumber : string option;
    [<JsonProperty(PropertyName = "order_name")>]
    OrderName : string option;
    [<JsonProperty(PropertyName = "pmp_name")>]
    PmpName : string option;
    [<JsonProperty(PropertyName = "accepted_terms_id")>]
    AcceptedTermsId : string option;
    [<JsonProperty(PropertyName = "accepted_terms_time")>]
    AcceptedTermsTime : string option;
    [<JsonProperty(PropertyName = "budget_amount")>]
    BudgetAmount : decimal option;
    [<JsonProperty(PropertyName = "estimated_monthly_spend")>]
    EstimatedMonthlySpend : decimal option;
  }

  //#endregion
