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
open OpenAPI.TargetingTemplateApiHandler
open OpenAPI.TargetingTemplateApiHandlerParams

module TargetingTemplateApiHandlerTestsHelper =


  let mutable TargetingTemplateCreateExamples = Map.empty
  let mutable TargetingTemplateCreateBody = ""

  TargetingTemplateCreateBody <- WebUtility.HtmlDecode "{
  &quot;auto_targeting_enabled&quot; : true,
  &quot;keywords&quot; : [ {
    &quot;match_type&quot; : &quot;BROAD&quot;,
    &quot;value&quot; : &quot;couples halloween costumes&quot;
  }, {
    &quot;match_type&quot; : &quot;BROAD&quot;,
    &quot;value&quot; : &quot;couples halloween costumes&quot;
  } ],
  &quot;name&quot; : &quot;name&quot;,
  &quot;placement_group&quot; : &quot;ALL&quot;,
  &quot;targeting_attributes&quot; : &quot;&quot;,
  &quot;tracking_urls&quot; : {
    &quot;impression&quot; : [ &quot;URL1&quot;, &quot;URL2&quot; ],
    &quot;click&quot; : [ &quot;URL1&quot;, &quot;URL2&quot; ],
    &quot;engagement&quot; : [ &quot;URL1&quot;, &quot;URL2&quot; ],
    &quot;buyable_button&quot; : [ &quot;URL1&quot;, &quot;URL2&quot; ],
    &quot;audience_verification&quot; : [ &quot;URL1&quot;, &quot;URL2&quot; ]
  }
}"
  TargetingTemplateCreateExamples <- TargetingTemplateCreateExamples.Add("application/json", TargetingTemplateCreateBody)

  let getTargetingTemplateCreateExample mediaType =
    TargetingTemplateCreateExamples.[mediaType]
      |> getConverter mediaType
  ()


  let mutable TargetingTemplateUpdateExamples = Map.empty
  let mutable TargetingTemplateUpdateBody = ""

  TargetingTemplateUpdateBody <- WebUtility.HtmlDecode "{
  &quot;id&quot; : &quot;643&quot;,
  &quot;operation_type&quot; : &quot;UPDATE&quot;,
  &quot;targeting_attributes&quot; : &quot;&quot;
}"
  TargetingTemplateUpdateExamples <- TargetingTemplateUpdateExamples.Add("application/json", TargetingTemplateUpdateBody)

  let getTargetingTemplateUpdateExample mediaType =
    TargetingTemplateUpdateExamples.[mediaType]
      |> getConverter mediaType
