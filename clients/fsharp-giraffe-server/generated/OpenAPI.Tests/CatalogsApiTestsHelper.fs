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
open OpenAPI.CatalogsApiHandler
open OpenAPI.CatalogsApiHandlerParams

module CatalogsApiHandlerTestsHelper =

  ()

  ()


  let mutable CatalogsProductGroupsCreateExamples = Map.empty
  let mutable CatalogsProductGroupsCreateBody = ""

  CatalogsProductGroupsCreateBody <- WebUtility.HtmlDecode ""
  CatalogsProductGroupsCreateExamples <- CatalogsProductGroupsCreateExamples.Add("", CatalogsProductGroupsCreateBody)

  let getCatalogsProductGroupsCreateExample mediaType =
    CatalogsProductGroupsCreateExamples.[mediaType]
      |> getConverter mediaType
  ()

  ()

  ()

  ()


  let mutable CatalogsProductGroupsUpdateExamples = Map.empty
  let mutable CatalogsProductGroupsUpdateBody = ""

  CatalogsProductGroupsUpdateBody <- WebUtility.HtmlDecode ""
  CatalogsProductGroupsUpdateExamples <- CatalogsProductGroupsUpdateExamples.Add("", CatalogsProductGroupsUpdateBody)

  let getCatalogsProductGroupsUpdateExample mediaType =
    CatalogsProductGroupsUpdateExamples.[mediaType]
      |> getConverter mediaType
  ()


  let mutable FeedsCreateExamples = Map.empty
  let mutable FeedsCreateBody = ""

  FeedsCreateBody <- WebUtility.HtmlDecode ""
  FeedsCreateExamples <- FeedsCreateExamples.Add("", FeedsCreateBody)

  let getFeedsCreateExample mediaType =
    FeedsCreateExamples.[mediaType]
      |> getConverter mediaType
  ()

  ()

  ()


  let mutable FeedsUpdateExamples = Map.empty
  let mutable FeedsUpdateBody = ""

  FeedsUpdateBody <- WebUtility.HtmlDecode ""
  FeedsUpdateExamples <- FeedsUpdateExamples.Add("", FeedsUpdateBody)

  let getFeedsUpdateExample mediaType =
    FeedsUpdateExamples.[mediaType]
      |> getConverter mediaType
  ()


  let mutable ItemsBatchPostExamples = Map.empty
  let mutable ItemsBatchPostBody = ""

  ItemsBatchPostBody <- WebUtility.HtmlDecode ""
  ItemsBatchPostExamples <- ItemsBatchPostExamples.Add("", ItemsBatchPostBody)

  let getItemsBatchPostExample mediaType =
    ItemsBatchPostExamples.[mediaType]
      |> getConverter mediaType
  ()

  ()


  let mutable ProductsByProductGroupFilterListExamples = Map.empty
  let mutable ProductsByProductGroupFilterListBody = ""

  ProductsByProductGroupFilterListBody <- WebUtility.HtmlDecode "{
  &quot;filters&quot; : {
    &quot;any_of&quot; : [ {
      &quot;MIN_PRICE&quot; : {
        &quot;inclusion&quot; : true,
        &quot;negated&quot; : false,
        &quot;values&quot; : 0.08008281904610115
      }
    }, {
      &quot;MIN_PRICE&quot; : {
        &quot;inclusion&quot; : true,
        &quot;negated&quot; : false,
        &quot;values&quot; : 0.08008281904610115
      }
    } ]
  },
  &quot;feed_id&quot; : &quot;2680059592705&quot;
}"
  ProductsByProductGroupFilterListExamples <- ProductsByProductGroupFilterListExamples.Add("application/json", ProductsByProductGroupFilterListBody)

  let getProductsByProductGroupFilterListExample mediaType =
    ProductsByProductGroupFilterListExamples.[mediaType]
      |> getConverter mediaType
