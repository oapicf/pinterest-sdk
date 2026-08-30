namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.Currency
open OpenAPI.Model.SSIOOrderLineType

module SSIOInsertionOrderCreate =

  //#region SSIOInsertionOrderCreate

  [<CLIMutable>]
  type SSIOInsertionOrderCreate = {
    [<JsonProperty(PropertyName = "accepted_terms_id")>]
    AcceptedTermsId : string;
    [<JsonProperty(PropertyName = "accepted_terms_time")>]
    AcceptedTermsTime : int;
    [<JsonProperty(PropertyName = "agency_link")>]
    AgencyLink : string;
    [<JsonProperty(PropertyName = "billing_contact_email")>]
    BillingContactEmail : string;
    [<JsonProperty(PropertyName = "billing_contact_firstname")>]
    BillingContactFirstname : string;
    [<JsonProperty(PropertyName = "billing_contact_lastname")>]
    BillingContactLastname : string;
    [<JsonProperty(PropertyName = "billto_billing_address_id")>]
    BilltoBillingAddressId : string;
    [<JsonProperty(PropertyName = "billto_business_address_id")>]
    BilltoBusinessAddressId : string;
    [<JsonProperty(PropertyName = "billto_company_id")>]
    BilltoCompanyId : string;
    [<JsonProperty(PropertyName = "budget_amount")>]
    BudgetAmount : double;
    [<JsonProperty(PropertyName = "currency_info")>]
    CurrencyInfo : Currency;
    [<JsonProperty(PropertyName = "end_date")>]
    EndDate : string;
    [<JsonProperty(PropertyName = "estimated_monthly_spend")>]
    EstimatedMonthlySpend : double;
    [<JsonProperty(PropertyName = "media_contact_email")>]
    MediaContactEmail : string;
    [<JsonProperty(PropertyName = "media_contact_firstname")>]
    MediaContactFirstname : string;
    [<JsonProperty(PropertyName = "media_contact_lastname")>]
    MediaContactLastname : string;
    [<JsonProperty(PropertyName = "order_line_type")>]
    OrderLineType : SSIOOrderLineType;
    [<JsonProperty(PropertyName = "order_name")>]
    OrderName : string;
    [<JsonProperty(PropertyName = "pmp_id")>]
    PmpId : string;
    [<JsonProperty(PropertyName = "po_number")>]
    PoNumber : string;
    [<JsonProperty(PropertyName = "start_date")>]
    StartDate : string;
    [<JsonProperty(PropertyName = "user_email")>]
    UserEmail : string;
  }

  //#endregion
