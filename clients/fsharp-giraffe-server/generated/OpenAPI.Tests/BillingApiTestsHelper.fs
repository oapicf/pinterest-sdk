namespace OpenAPI.Tests

open System
open System.Net
open System.Net.Http
open System.IO
open Microsoft.AspNetCore.Builder
open Microsoft.AspNetCore.Hosting
open Microsoft.AspNetCore.TestHost
open Microsoft.Extensions.DependencyInjection
open FSharp.Control.Tasks.V2.ContextInsensitive
open Xunit
open System.Text
open TestHelper
open OpenAPI.BillingApiHandler
open OpenAPI.BillingApiHandlerParams

module BillingApiHandlerTestsHelper =


  let mutable AdsCreditRedeemExamples = Map.empty
  let mutable AdsCreditRedeemBody = ""

  AdsCreditRedeemBody <- WebUtility.HtmlDecode "{
  &quot;validateOnly&quot; : true,
  &quot;offerCodeHash&quot; : &quot;138e9e0ff7e38cf511b880975eb574c09aa9d5e1657590ab0431040da68caa67&quot;
}"
  AdsCreditRedeemExamples <- AdsCreditRedeemExamples.Add("application/json", AdsCreditRedeemBody)

  let getAdsCreditRedeemExample mediaType =
    AdsCreditRedeemExamples.[mediaType]
      |> getConverter mediaType
  ()

  ()

  ()


  let mutable SsioInsertionOrderCreateExamples = Map.empty
  let mutable SsioInsertionOrderCreateBody = ""

  SsioInsertionOrderCreateBody <- WebUtility.HtmlDecode "{
  &quot;end_date&quot; : &quot;2020-12-20&quot;,
  &quot;billto_company_id&quot; : &quot;billto_company_id&quot;,
  &quot;billing_contact_firstname&quot; : &quot;billing_contact_firstname&quot;,
  &quot;user_email&quot; : &quot;test@example&quot;,
  &quot;order_line_type&quot; : &quot;BUDGET&quot;,
  &quot;currency_info&quot; : &quot;USD&quot;,
  &quot;billing_contact_email&quot; : &quot;test@example&quot;,
  &quot;estimated_monthly_spend&quot; : 6.027456183070403,
  &quot;media_contact_email&quot; : &quot;test@example&quot;,
  &quot;billing_contact_lastname&quot; : &quot;billing_contact_lastname&quot;,
  &quot;order_name&quot; : &quot;order_name&quot;,
  &quot;po_number&quot; : &quot;po_number&quot;,
  &quot;agency_link&quot; : &quot;agency_link&quot;,
  &quot;pmp_id&quot; : &quot;pmp_id&quot;,
  &quot;accepted_terms_id&quot; : &quot;accepted_terms_id&quot;,
  &quot;accepted_terms_time&quot; : 0,
  &quot;media_contact_lastname&quot; : &quot;media_contact_lastname&quot;,
  &quot;start_date&quot; : &quot;2020-12-20&quot;,
  &quot;budget_amount&quot; : 5000000,
  &quot;media_contact_firstname&quot; : &quot;media_contact_firstname&quot;,
  &quot;billto_business_address_id&quot; : &quot;billto_business_address_id&quot;,
  &quot;billto_billing_address_id&quot; : &quot;billto_billing_address_id&quot;
}"
  SsioInsertionOrderCreateExamples <- SsioInsertionOrderCreateExamples.Add("application/json", SsioInsertionOrderCreateBody)

  let getSsioInsertionOrderCreateExample mediaType =
    SsioInsertionOrderCreateExamples.[mediaType]
      |> getConverter mediaType

  let mutable SsioInsertionOrderEditExamples = Map.empty
  let mutable SsioInsertionOrderEditBody = ""

  SsioInsertionOrderEditBody <- WebUtility.HtmlDecode "{
  &quot;end_date&quot; : &quot;2020-12-20&quot;,
  &quot;salesforce_order_line_id&quot; : &quot;salesforce_order_line_id&quot;,
  &quot;billing_contact_firstname&quot; : &quot;billing_contact_firstname&quot;,
  &quot;user_email&quot; : &quot;test@example&quot;,
  &quot;ads_manager_order_line_id&quot; : &quot;ads_manager_order_line_id&quot;,
  &quot;billing_contact_email&quot; : &quot;test@example&quot;,
  &quot;media_contact_email&quot; : &quot;test@example&quot;,
  &quot;billing_contact_lastname&quot; : &quot;billing_contact_lastname&quot;,
  &quot;salesforce_order_id&quot; : &quot;salesforce_order_id&quot;,
  &quot;po_number&quot; : &quot;po_number&quot;,
  &quot;agency_link&quot; : &quot;agency_link&quot;,
  &quot;media_contact_lastname&quot; : &quot;media_contact_lastname&quot;,
  &quot;start_date&quot; : &quot;2020-12-20&quot;,
  &quot;budget_amount&quot; : 5000000,
  &quot;media_contact_firstname&quot; : &quot;media_contact_firstname&quot;,
  &quot;oracle_line_id&quot; : &quot;oracle_line_id&quot;
}"
  SsioInsertionOrderEditExamples <- SsioInsertionOrderEditExamples.Add("application/json", SsioInsertionOrderEditBody)

  let getSsioInsertionOrderEditExample mediaType =
    SsioInsertionOrderEditExamples.[mediaType]
      |> getConverter mediaType
  ()

  ()

  ()

