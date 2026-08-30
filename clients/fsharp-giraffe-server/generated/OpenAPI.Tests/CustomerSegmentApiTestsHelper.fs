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
open OpenAPI.CustomerSegmentApiHandler
open OpenAPI.CustomerSegmentApiHandlerParams

module CustomerSegmentApiHandlerTestsHelper =


  let mutable CustomerSegmentCreateExamples = Map.empty
  let mutable CustomerSegmentCreateBody = ""

  CustomerSegmentCreateBody <- WebUtility.HtmlDecode "{
  &quot;audience_ids&quot; : [ &quot;audience_ids&quot;, &quot;audience_ids&quot; ],
  &quot;name&quot; : &quot;name&quot;
}"
  CustomerSegmentCreateExamples <- CustomerSegmentCreateExamples.Add("application/json", CustomerSegmentCreateBody)

  let getCustomerSegmentCreateExample mediaType =
    CustomerSegmentCreateExamples.[mediaType]
      |> getConverter mediaType
  ()


  let mutable CustomerSegmentUpdateExamples = Map.empty
  let mutable CustomerSegmentUpdateBody = ""

  CustomerSegmentUpdateBody <- WebUtility.HtmlDecode "{
  &quot;audience_ids&quot; : [ &quot;audience_ids&quot;, &quot;audience_ids&quot; ],
  &quot;id&quot; : &quot;id&quot;,
  &quot;operation_type&quot; : &quot;UPDATE&quot;
}"
  CustomerSegmentUpdateExamples <- CustomerSegmentUpdateExamples.Add("application/json", CustomerSegmentUpdateBody)

  let getCustomerSegmentUpdateExample mediaType =
    CustomerSegmentUpdateExamples.[mediaType]
      |> getConverter mediaType
