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
open OpenAPI.CatalogProductGroupsApiHandler
open OpenAPI.CatalogProductGroupsApiHandlerParams

module CatalogProductGroupsApiHandlerTestsHelper =

  ()


  let mutable CatalogsProductGroupsCreateExamples = Map.empty
  let mutable CatalogsProductGroupsCreateBody = ""

  CatalogsProductGroupsCreateBody <- WebUtility.HtmlDecode "{
  &quot;description&quot; : &quot;description&quot;,
  &quot;feed_id&quot; : &quot;2680059592705&quot;,
  &quot;filters&quot; : {
    &quot;any_of&quot; : [ {
      &quot;MIN_PRICE&quot; : {
        &quot;inclusion&quot; : true,
        &quot;negated&quot; : true,
        &quot;values&quot; : 0.14658129805029452
      }
    }, {
      &quot;MIN_PRICE&quot; : {
        &quot;inclusion&quot; : true,
        &quot;negated&quot; : true,
        &quot;values&quot; : 0.14658129805029452
      }
    } ]
  },
  &quot;is_featured&quot; : true,
  &quot;name&quot; : &quot;name&quot;
}"
  CatalogsProductGroupsCreateExamples <- CatalogsProductGroupsCreateExamples.Add("application/json", CatalogsProductGroupsCreateBody)

  let getCatalogsProductGroupsCreateExample mediaType =
    CatalogsProductGroupsCreateExamples.[mediaType]
      |> getConverter mediaType

  let mutable CatalogsProductGroupsCreateManyExamples = Map.empty
  let mutable CatalogsProductGroupsCreateManyBody = ""

  CatalogsProductGroupsCreateManyBody <- WebUtility.HtmlDecode "{
  &quot;description&quot; : &quot;description&quot;,
  &quot;feed_id&quot; : &quot;2680059592705&quot;,
  &quot;filters&quot; : {
    &quot;any_of&quot; : [ {
      &quot;MIN_PRICE&quot; : {
        &quot;inclusion&quot; : true,
        &quot;negated&quot; : true,
        &quot;values&quot; : 0.14658129805029452
      }
    }, {
      &quot;MIN_PRICE&quot; : {
        &quot;inclusion&quot; : true,
        &quot;negated&quot; : true,
        &quot;values&quot; : 0.14658129805029452
      }
    } ]
  },
  &quot;is_featured&quot; : true,
  &quot;name&quot; : &quot;name&quot;
}"
  CatalogsProductGroupsCreateManyExamples <- CatalogsProductGroupsCreateManyExamples.Add("application/json", CatalogsProductGroupsCreateManyBody)

  let getCatalogsProductGroupsCreateManyExample mediaType =
    CatalogsProductGroupsCreateManyExamples.[mediaType]
      |> getConverter mediaType
  ()

  ()

  ()

  ()

  ()


  let mutable CatalogsProductGroupsUpdateExamples = Map.empty
  let mutable CatalogsProductGroupsUpdateBody = ""

  CatalogsProductGroupsUpdateBody <- WebUtility.HtmlDecode "{
  &quot;description&quot; : &quot;description&quot;,
  &quot;is_featured&quot; : true,
  &quot;name&quot; : &quot;name&quot;
}"
  CatalogsProductGroupsUpdateExamples <- CatalogsProductGroupsUpdateExamples.Add("application/json", CatalogsProductGroupsUpdateBody)

  let getCatalogsProductGroupsUpdateExample mediaType =
    CatalogsProductGroupsUpdateExamples.[mediaType]
      |> getConverter mediaType

  let mutable ProductsByProductGroupFilterListExamples = Map.empty
  let mutable ProductsByProductGroupFilterListBody = ""

  ProductsByProductGroupFilterListBody <- WebUtility.HtmlDecode "{
  &quot;feed_id&quot; : &quot;2680059592705&quot;,
  &quot;filters&quot; : {
    &quot;any_of&quot; : [ {
      &quot;MIN_PRICE&quot; : {
        &quot;inclusion&quot; : true,
        &quot;negated&quot; : true,
        &quot;values&quot; : 0.14658129805029452
      }
    }, {
      &quot;MIN_PRICE&quot; : {
        &quot;inclusion&quot; : true,
        &quot;negated&quot; : true,
        &quot;values&quot; : 0.14658129805029452
      }
    } ]
  }
}"
  ProductsByProductGroupFilterListExamples <- ProductsByProductGroupFilterListExamples.Add("application/json", ProductsByProductGroupFilterListBody)

  let getProductsByProductGroupFilterListExample mediaType =
    ProductsByProductGroupFilterListExamples.[mediaType]
      |> getConverter mediaType
