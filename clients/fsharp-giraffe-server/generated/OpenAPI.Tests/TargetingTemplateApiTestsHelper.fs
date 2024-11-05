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
  &quot;targeting_attributes&quot; : {
    &quot;GEO&quot; : [ &quot;GEO&quot;, &quot;GEO&quot; ],
    &quot;LOCATION&quot; : [ &quot;LOCATION&quot;, &quot;LOCATION&quot; ],
    &quot;LOCALE&quot; : [ &quot;LOCALE&quot;, &quot;LOCALE&quot; ],
    &quot;AGE_BUCKET&quot; : [ &quot;35-44&quot;, &quot;50-54&quot; ],
    &quot;AUDIENCE_INCLUDE&quot; : [ &quot;AUDIENCE_INCLUDE&quot;, &quot;AUDIENCE_INCLUDE&quot; ],
    &quot;SHOPPING_RETARGETING&quot; : [ {
      &quot;lookback_window&quot; : 30,
      &quot;exclusion_window&quot; : 14,
      &quot;tag_types&quot; : [ 0, 6 ]
    }, {
      &quot;lookback_window&quot; : 30,
      &quot;exclusion_window&quot; : 14,
      &quot;tag_types&quot; : [ 0, 6 ]
    } ],
    &quot;GENDER&quot; : [ &quot;unknown&quot;, &quot;unknown&quot; ],
    &quot;TARGETING_STRATEGY&quot; : [ &quot;CHOOSE_YOUR_OWN&quot;, &quot;CHOOSE_YOUR_OWN&quot; ],
    &quot;APPTYPE&quot; : [ &quot;ipad&quot;, &quot;iphone&quot; ],
    &quot;AUDIENCE_EXCLUDE&quot; : [ &quot;AUDIENCE_EXCLUDE&quot;, &quot;AUDIENCE_EXCLUDE&quot; ],
    &quot;INTEREST&quot; : [ &quot;INTEREST&quot;, &quot;INTEREST&quot; ]
  },
  &quot;keywords&quot; : [ {
    &quot;value&quot; : &quot;cats&quot;,
    &quot;match_type&quot; : &quot;EXACT_NEGATIVE&quot;
  } ],
  &quot;name&quot; : &quot;Gaming&quot;,
  &quot;auto_targeting_enabled&quot; : true,
  &quot;placement_group&quot; : &quot;ALL&quot;,
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
  &quot;operation_type&quot; : &quot;REMOVE&quot;,
  &quot;id&quot; : &quot;643&quot;
}"
  TargetingTemplateUpdateExamples <- TargetingTemplateUpdateExamples.Add("application/json", TargetingTemplateUpdateBody)

  let getTargetingTemplateUpdateExample mediaType =
    TargetingTemplateUpdateExamples.[mediaType]
      |> getConverter mediaType
