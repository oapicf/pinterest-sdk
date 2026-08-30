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
open Newtonsoft
open TestHelper
open TrendsApiHandlerTestsHelper
open OpenAPI.TrendsApiHandler
open OpenAPI.TrendsApiHandlerParams
open OpenAPI.Model.AgeTrendsBucket
open OpenAPI.Model.FeaturedTrend
open OpenAPI.Model.GenderBucket
open OpenAPI.Model.InterestsEnum
open OpenAPI.Model.PinterestLibError
open OpenAPI.Model.ProductCategoriesEngagementType
open OpenAPI.Model.ProductCategoryDetailLookbackWindow
open OpenAPI.Model.ProductCategoryDetails
open OpenAPI.Model.ProductCategoryEnum
open OpenAPI.Model.ProductCategoryRegion
open OpenAPI.Model.TrendingProductCategory
open OpenAPI.Model.TrendsEditorial
open OpenAPI.Model.VerticalProductCategory

module TrendsApiHandlerTests =

  // ---------------------------------
  // Tests
  // ---------------------------------

  [<Fact>]
  let ``TrendsEditorialArticlesList - Returns editorial articles for a given region returns 200 where The request has succeeded.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/trends/editorial_articles" + "?region=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``TrendsEditorialArticlesList - Returns editorial articles for a given region returns 400 where The request could not be understood by the server due to unexpected data.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/trends/editorial_articles" + "?region=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``TrendsEditorialArticlesList - Returns editorial articles for a given region returns 401 where Authentication is required and has either failed or not been provided.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/trends/editorial_articles" + "?region=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``TrendsEditorialArticlesList - Returns editorial articles for a given region returns 403 where The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/trends/editorial_articles" + "?region=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``TrendsEditorialArticlesList - Returns editorial articles for a given region returns 404 where The requested resource could not be found on this server.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/trends/editorial_articles" + "?region=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``TrendsEditorialArticlesList - Returns editorial articles for a given region returns 429 where The user has sent too many requests in a given amount of time and is being rate limited.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/trends/editorial_articles" + "?region=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(429))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``TrendsEditorialArticlesList - Returns editorial articles for a given region returns 0 where An unexpected error response.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/trends/editorial_articles" + "?region=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``TrendsFeaturedTopicsList - Get featured topics returns 200 where The request has succeeded.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/trends/topics/featured" + "?interest=ADDME&region=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``TrendsFeaturedTopicsList - Get featured topics returns 400 where The request could not be understood by the server due to unexpected data.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/trends/topics/featured" + "?interest=ADDME&region=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``TrendsFeaturedTopicsList - Get featured topics returns 401 where Authentication is required and has either failed or not been provided.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/trends/topics/featured" + "?interest=ADDME&region=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``TrendsFeaturedTopicsList - Get featured topics returns 403 where The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/trends/topics/featured" + "?interest=ADDME&region=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``TrendsFeaturedTopicsList - Get featured topics returns 404 where The requested resource could not be found on this server.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/trends/topics/featured" + "?interest=ADDME&region=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``TrendsFeaturedTopicsList - Get featured topics returns 429 where The user has sent too many requests in a given amount of time and is being rate limited.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/trends/topics/featured" + "?interest=ADDME&region=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(429))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``TrendsFeaturedTopicsList - Get featured topics returns 0 where An unexpected error response.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/trends/topics/featured" + "?interest=ADDME&region=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``TrendsProductCategoriesDetailsList - Get product category details returns 200 where The request has succeeded.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/trends/product_categories/details" + "?productCategories=ADDME&region=ADDME&lookbackWindow=ADDME&engagementType=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``TrendsProductCategoriesDetailsList - Get product category details returns 400 where The request could not be understood by the server due to unexpected data.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/trends/product_categories/details" + "?productCategories=ADDME&region=ADDME&lookbackWindow=ADDME&engagementType=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``TrendsProductCategoriesDetailsList - Get product category details returns 401 where Authentication is required and has either failed or not been provided.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/trends/product_categories/details" + "?productCategories=ADDME&region=ADDME&lookbackWindow=ADDME&engagementType=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``TrendsProductCategoriesDetailsList - Get product category details returns 403 where The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/trends/product_categories/details" + "?productCategories=ADDME&region=ADDME&lookbackWindow=ADDME&engagementType=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``TrendsProductCategoriesDetailsList - Get product category details returns 404 where The requested resource could not be found on this server.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/trends/product_categories/details" + "?productCategories=ADDME&region=ADDME&lookbackWindow=ADDME&engagementType=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``TrendsProductCategoriesDetailsList - Get product category details returns 429 where The user has sent too many requests in a given amount of time and is being rate limited.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/trends/product_categories/details" + "?productCategories=ADDME&region=ADDME&lookbackWindow=ADDME&engagementType=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(429))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``TrendsProductCategoriesDetailsList - Get product category details returns 0 where An unexpected error response.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/trends/product_categories/details" + "?productCategories=ADDME&region=ADDME&lookbackWindow=ADDME&engagementType=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``TrendsProductCategoriesTrendingList - Get a list of growing Shopping Product Categories returns 200 where The request has succeeded.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/trends/product_categories/trending" + "?region=ADDME&verticals=ADDME&ages=ADDME&genders=ADDME&engagementType=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``TrendsProductCategoriesTrendingList - Get a list of growing Shopping Product Categories returns 400 where The request could not be understood by the server due to unexpected data.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/trends/product_categories/trending" + "?region=ADDME&verticals=ADDME&ages=ADDME&genders=ADDME&engagementType=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``TrendsProductCategoriesTrendingList - Get a list of growing Shopping Product Categories returns 401 where Authentication is required and has either failed or not been provided.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/trends/product_categories/trending" + "?region=ADDME&verticals=ADDME&ages=ADDME&genders=ADDME&engagementType=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``TrendsProductCategoriesTrendingList - Get a list of growing Shopping Product Categories returns 403 where The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/trends/product_categories/trending" + "?region=ADDME&verticals=ADDME&ages=ADDME&genders=ADDME&engagementType=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``TrendsProductCategoriesTrendingList - Get a list of growing Shopping Product Categories returns 404 where The requested resource could not be found on this server.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/trends/product_categories/trending" + "?region=ADDME&verticals=ADDME&ages=ADDME&genders=ADDME&engagementType=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``TrendsProductCategoriesTrendingList - Get a list of growing Shopping Product Categories returns 429 where The user has sent too many requests in a given amount of time and is being rate limited.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/trends/product_categories/trending" + "?region=ADDME&verticals=ADDME&ages=ADDME&genders=ADDME&engagementType=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(429))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``TrendsProductCategoriesTrendingList - Get a list of growing Shopping Product Categories returns 0 where An unexpected error response.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/trends/product_categories/trending" + "?region=ADDME&verticals=ADDME&ages=ADDME&genders=ADDME&engagementType=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

