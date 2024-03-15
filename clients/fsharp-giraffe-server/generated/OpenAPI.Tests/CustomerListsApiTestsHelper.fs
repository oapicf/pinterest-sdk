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
open OpenAPI.CustomerListsApiHandler
open OpenAPI.CustomerListsApiHandlerParams

module CustomerListsApiHandlerTestsHelper =


  let mutable CustomerListsCreateExamples = Map.empty
  let mutable CustomerListsCreateBody = ""

  CustomerListsCreateBody <- WebUtility.HtmlDecode "{
  &quot;list_type&quot; : &quot;EMAIL&quot;,
  &quot;records&quot; : &quot;email1@pinterest.com,email2@pinterest.com,..&lt;more records&gt;&quot;,
  &quot;name&quot; : &quot;The Glengarry Glen Ross leads&quot;,
  &quot;exceptions&quot; : &quot;{}&quot;
}"
  CustomerListsCreateExamples <- CustomerListsCreateExamples.Add("application/json", CustomerListsCreateBody)

  let getCustomerListsCreateExample mediaType =
    CustomerListsCreateExamples.[mediaType]
      |> getConverter mediaType
  ()

  ()


  let mutable CustomerListsUpdateExamples = Map.empty
  let mutable CustomerListsUpdateBody = ""

  CustomerListsUpdateBody <- WebUtility.HtmlDecode "{
  &quot;operation_type&quot; : &quot;operation_type&quot;,
  &quot;records&quot; : &quot;email2@pinterest.com,email6@pinterest.com,&quot;,
  &quot;exceptions&quot; : {
    &quot;code&quot; : 2,
    &quot;message&quot; : &quot;Advertiser not found.&quot;
  }
}"
  CustomerListsUpdateExamples <- CustomerListsUpdateExamples.Add("application/json", CustomerListsUpdateBody)

  let getCustomerListsUpdateExample mediaType =
    CustomerListsUpdateExamples.[mediaType]
      |> getConverter mediaType
