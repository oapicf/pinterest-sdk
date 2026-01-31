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
open OpenAPI.CustomerListUploadsApiHandler
open OpenAPI.CustomerListUploadsApiHandlerParams

module CustomerListUploadsApiHandlerTestsHelper =


  let mutable CustomerListUploadsCreateExamples = Map.empty
  let mutable CustomerListUploadsCreateBody = ""

  CustomerListUploadsCreateBody <- WebUtility.HtmlDecode "{
  &quot;total_parts&quot; : 2,
  &quot;operation&quot; : &quot;operation&quot;
}"
  CustomerListUploadsCreateExamples <- CustomerListUploadsCreateExamples.Add("application/json", CustomerListUploadsCreateBody)

  let getCustomerListUploadsCreateExample mediaType =
    CustomerListUploadsCreateExamples.[mediaType]
      |> getConverter mediaType
  ()

  ()

