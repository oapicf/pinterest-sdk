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
open OpenAPI.ConversionsApiHandler
open OpenAPI.ConversionsApiHandlerParams

module ConversionsApiHandlerTestsHelper =


  let mutable AdvertiserDefinedEventsCreateExamples = Map.empty
  let mutable AdvertiserDefinedEventsCreateBody = ""

  AdvertiserDefinedEventsCreateBody <- WebUtility.HtmlDecode "{
  &quot;items&quot; : [ {
    &quot;mapped_conversion_type&quot; : &quot;SIGNUP&quot;,
    &quot;name&quot; : &quot;newsletter_signup&quot;
  }, {
    &quot;mapped_conversion_type&quot; : &quot;SIGNUP&quot;,
    &quot;name&quot; : &quot;newsletter_signup&quot;
  } ]
}"
  AdvertiserDefinedEventsCreateExamples <- AdvertiserDefinedEventsCreateExamples.Add("application/json", AdvertiserDefinedEventsCreateBody)

  let getAdvertiserDefinedEventsCreateExample mediaType =
    AdvertiserDefinedEventsCreateExamples.[mediaType]
      |> getConverter mediaType
  ()

  ()


  let mutable AdvertiserDefinedEventsUpdateExamples = Map.empty
  let mutable AdvertiserDefinedEventsUpdateBody = ""

  AdvertiserDefinedEventsUpdateBody <- WebUtility.HtmlDecode "{
  &quot;items&quot; : [ {
    &quot;mapped_conversion_type&quot; : &quot;SIGNUP&quot;,
    &quot;name&quot; : &quot;newsletter_signup&quot;
  }, {
    &quot;mapped_conversion_type&quot; : &quot;SIGNUP&quot;,
    &quot;name&quot; : &quot;newsletter_signup&quot;
  } ]
}"
  AdvertiserDefinedEventsUpdateExamples <- AdvertiserDefinedEventsUpdateExamples.Add("application/json", AdvertiserDefinedEventsUpdateBody)

  let getAdvertiserDefinedEventsUpdateExample mediaType =
    AdvertiserDefinedEventsUpdateExamples.[mediaType]
      |> getConverter mediaType
