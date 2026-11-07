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
  &quot;offerCodeHash&quot; : &quot;138e9e0ff7e38cf511b880975eb574c09aa9d5e1657590ab0431040da68caa67&quot;,
  &quot;validateOnly&quot; : true
}"
  AdsCreditRedeemExamples <- AdsCreditRedeemExamples.Add("application/json", AdsCreditRedeemBody)

  let getAdsCreditRedeemExample mediaType =
    AdsCreditRedeemExamples.[mediaType]
      |> getConverter mediaType
  ()

  ()

  ()

  ()

  ()


  let mutable SsioInsertionOrderCreateExamples = Map.empty
  let mutable SsioInsertionOrderCreateBody = ""

  SsioInsertionOrderCreateBody <- WebUtility.HtmlDecode "{
  &quot;accepted_terms_id&quot; : &quot;accepted_terms_id&quot;,
  &quot;accepted_terms_time&quot; : 0,
  &quot;agency_link&quot; : &quot;agency_link&quot;,
  &quot;billing_contact_email&quot; : &quot;billing_contact_email&quot;,
  &quot;billing_contact_firstname&quot; : &quot;billing_contact_firstname&quot;,
  &quot;billing_contact_lastname&quot; : &quot;billing_contact_lastname&quot;,
  &quot;billto_billing_address_id&quot; : &quot;billto_billing_address_id&quot;,
  &quot;billto_business_address_id&quot; : &quot;billto_business_address_id&quot;,
  &quot;billto_company_id&quot; : &quot;billto_company_id&quot;,
  &quot;budget_amount&quot; : 6.027456183070403,
  &quot;currency_info&quot; : &quot;UNK&quot;,
  &quot;end_date&quot; : &quot;end_date&quot;,
  &quot;estimated_monthly_spend&quot; : 1.4658129805029452,
  &quot;media_contact_email&quot; : &quot;media_contact_email&quot;,
  &quot;media_contact_firstname&quot; : &quot;media_contact_firstname&quot;,
  &quot;media_contact_lastname&quot; : &quot;media_contact_lastname&quot;,
  &quot;order_line_type&quot; : &quot;&quot;,
  &quot;order_name&quot; : &quot;order_name&quot;,
  &quot;pmp_id&quot; : &quot;pmp_id&quot;,
  &quot;po_number&quot; : &quot;po_number&quot;,
  &quot;start_date&quot; : &quot;start_date&quot;,
  &quot;user_email&quot; : &quot;user_email&quot;
}"
  SsioInsertionOrderCreateExamples <- SsioInsertionOrderCreateExamples.Add("application/json", SsioInsertionOrderCreateBody)

  let getSsioInsertionOrderCreateExample mediaType =
    SsioInsertionOrderCreateExamples.[mediaType]
      |> getConverter mediaType

  let mutable SsioInsertionOrderEditExamples = Map.empty
  let mutable SsioInsertionOrderEditBody = ""

  SsioInsertionOrderEditBody <- WebUtility.HtmlDecode "{
  &quot;ads_manager_order_line_id&quot; : &quot;ads_manager_order_line_id&quot;,
  &quot;agency_link&quot; : &quot;agency_link&quot;,
  &quot;billing_contact_email&quot; : &quot;billing_contact_email&quot;,
  &quot;billing_contact_firstname&quot; : &quot;billing_contact_firstname&quot;,
  &quot;billing_contact_lastname&quot; : &quot;billing_contact_lastname&quot;,
  &quot;budget_amount&quot; : 0.8008281904610115,
  &quot;end_date&quot; : &quot;end_date&quot;,
  &quot;media_contact_email&quot; : &quot;media_contact_email&quot;,
  &quot;media_contact_firstname&quot; : &quot;media_contact_firstname&quot;,
  &quot;media_contact_lastname&quot; : &quot;media_contact_lastname&quot;,
  &quot;oracle_line_id&quot; : &quot;oracle_line_id&quot;,
  &quot;po_number&quot; : &quot;po_number&quot;,
  &quot;salesforce_order_id&quot; : &quot;salesforce_order_id&quot;,
  &quot;salesforce_order_line_id&quot; : &quot;salesforce_order_line_id&quot;,
  &quot;start_date&quot; : &quot;start_date&quot;,
  &quot;user_email&quot; : &quot;user_email&quot;
}"
  SsioInsertionOrderEditExamples <- SsioInsertionOrderEditExamples.Add("application/json", SsioInsertionOrderEditBody)

  let getSsioInsertionOrderEditExample mediaType =
    SsioInsertionOrderEditExamples.[mediaType]
      |> getConverter mediaType
  ()

  ()

  ()

