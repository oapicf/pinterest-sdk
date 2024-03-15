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
  ()

