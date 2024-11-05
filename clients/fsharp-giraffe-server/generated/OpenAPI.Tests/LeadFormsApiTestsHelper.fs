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
open OpenAPI.LeadFormsApiHandler
open OpenAPI.LeadFormsApiHandlerParams

module LeadFormsApiHandlerTestsHelper =

  ()


  let mutable LeadFormTestCreateExamples = Map.empty
  let mutable LeadFormTestCreateBody = ""

  LeadFormTestCreateBody <- WebUtility.HtmlDecode "{
  &quot;answers&quot; : [ &quot;John&quot;, &quot;Doe&quot;, &quot;abc@email.com&quot;, &quot;987654321&quot; ]
}"
  LeadFormTestCreateExamples <- LeadFormTestCreateExamples.Add("application/json", LeadFormTestCreateBody)

  let getLeadFormTestCreateExample mediaType =
    LeadFormTestCreateExamples.[mediaType]
      |> getConverter mediaType

  let mutable LeadFormsCreateExamples = Map.empty
  let mutable LeadFormsCreateBody = ""

  LeadFormsCreateBody <- WebUtility.HtmlDecode "{
  &quot;completion_message&quot; : &quot;Thank you for submitting. We will contact you soon.&quot;,
  &quot;disclosure_language&quot; : &quot;By entering your personal information, you agree that your data will be collected and used.&quot;,
  &quot;name&quot; : &quot;Lead Form 3/14/2023&quot;,
  &quot;questions&quot; : [ {
    &quot;question_type&quot; : &quot;CUSTOM&quot;,
    &quot;custom_question_field_type&quot; : &quot;CHECKBOX&quot;,
    &quot;custom_question_label&quot; : &quot;What is your favorite animal?&quot;,
    &quot;custom_question_options&quot; : [ &quot;Dog&quot;, &quot;Cat&quot;, &quot;Bird&quot;, &quot;Turtle&quot; ]
  } ],
  &quot;policy_links&quot; : [ {
    &quot;label&quot; : &quot;Copyright&quot;,
    &quot;link&quot; : &quot;https://policy.pinterest.com/en/copyright&quot;
  } ],
  &quot;has_accepted_terms&quot; : false,
  &quot;privacy_policy_link&quot; : &quot;https://www.advertisername.com/privacy-policy&quot;,
  &quot;status&quot; : &quot;DRAFT&quot;
}"
  LeadFormsCreateExamples <- LeadFormsCreateExamples.Add("application/json", LeadFormsCreateBody)

  let getLeadFormsCreateExample mediaType =
    LeadFormsCreateExamples.[mediaType]
      |> getConverter mediaType
  ()


  let mutable LeadFormsUpdateExamples = Map.empty
  let mutable LeadFormsUpdateBody = ""

  LeadFormsUpdateBody <- WebUtility.HtmlDecode "{
  &quot;completion_message&quot; : &quot;Thank you for submitting. We will contact you soon.&quot;,
  &quot;disclosure_language&quot; : &quot;By entering your personal information, you agree that your data will be collected and used.&quot;,
  &quot;name&quot; : &quot;Lead Form 3/14/2023&quot;,
  &quot;questions&quot; : [ {
    &quot;question_type&quot; : &quot;CUSTOM&quot;,
    &quot;custom_question_field_type&quot; : &quot;CHECKBOX&quot;,
    &quot;custom_question_label&quot; : &quot;What is your favorite animal?&quot;,
    &quot;custom_question_options&quot; : [ &quot;Dog&quot;, &quot;Cat&quot;, &quot;Bird&quot;, &quot;Turtle&quot; ]
  } ],
  &quot;policy_links&quot; : [ {
    &quot;label&quot; : &quot;Copyright&quot;,
    &quot;link&quot; : &quot;https://policy.pinterest.com/en/copyright&quot;
  } ],
  &quot;has_accepted_terms&quot; : false,
  &quot;id&quot; : &quot;7765300871171&quot;,
  &quot;privacy_policy_link&quot; : &quot;https://www.advertisername.com/privacy-policy&quot;,
  &quot;status&quot; : &quot;DRAFT&quot;
}"
  LeadFormsUpdateExamples <- LeadFormsUpdateExamples.Add("application/json", LeadFormsUpdateBody)

  let getLeadFormsUpdateExample mediaType =
    LeadFormsUpdateExamples.[mediaType]
      |> getConverter mediaType
