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
open OpenAPI.NotificationApiHandler
open OpenAPI.NotificationApiHandlerParams

module NotificationApiHandlerTestsHelper =


  let mutable NotificationPostExamples = Map.empty
  let mutable NotificationPostBody = ""

  NotificationPostBody <- WebUtility.HtmlDecode ""
  NotificationPostExamples <- NotificationPostExamples.Add("", NotificationPostBody)

  let getNotificationPostExample mediaType =
    NotificationPostExamples.[mediaType]
      |> getConverter mediaType
