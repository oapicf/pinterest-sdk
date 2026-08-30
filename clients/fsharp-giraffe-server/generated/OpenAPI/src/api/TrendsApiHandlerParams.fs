namespace OpenAPI

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
open System.Collections.Generic
open System

module TrendsApiHandlerParams =


    //#region Query parameters
    [<CLIMutable>]
    type TrendsEditorialArticlesListQueryParams = {
      region : ProductCategoryRegion ;

    }
    //#endregion


    type TrendsEditorialArticlesListStatusCode200Response = {
      content:TrendsEditorial[];
      
    }

    type TrendsEditorialArticlesListStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type TrendsEditorialArticlesListStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type TrendsEditorialArticlesListStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type TrendsEditorialArticlesListStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type TrendsEditorialArticlesListStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type TrendsEditorialArticlesListDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type TrendsEditorialArticlesListResult = TrendsEditorialArticlesListStatusCode200 of TrendsEditorialArticlesListStatusCode200Response|TrendsEditorialArticlesListStatusCode400 of TrendsEditorialArticlesListStatusCode400Response|TrendsEditorialArticlesListStatusCode401 of TrendsEditorialArticlesListStatusCode401Response|TrendsEditorialArticlesListStatusCode403 of TrendsEditorialArticlesListStatusCode403Response|TrendsEditorialArticlesListStatusCode404 of TrendsEditorialArticlesListStatusCode404Response|TrendsEditorialArticlesListStatusCode429 of TrendsEditorialArticlesListStatusCode429Response|TrendsEditorialArticlesListDefaultStatusCode of TrendsEditorialArticlesListDefaultStatusCodeResponse

    type TrendsEditorialArticlesListArgs = {
      queryParams:Result<TrendsEditorialArticlesListQueryParams,string>;
    }

    //#region Query parameters
    [<CLIMutable>]
    type TrendsFeaturedTopicsListQueryParams = {
      interest : InterestsEnum option;


      region : ProductCategoryRegion ;

    }
    //#endregion


    type TrendsFeaturedTopicsListStatusCode200Response = {
      content:FeaturedTrend[];
      
    }

    type TrendsFeaturedTopicsListStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type TrendsFeaturedTopicsListStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type TrendsFeaturedTopicsListStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type TrendsFeaturedTopicsListStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type TrendsFeaturedTopicsListStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type TrendsFeaturedTopicsListDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type TrendsFeaturedTopicsListResult = TrendsFeaturedTopicsListStatusCode200 of TrendsFeaturedTopicsListStatusCode200Response|TrendsFeaturedTopicsListStatusCode400 of TrendsFeaturedTopicsListStatusCode400Response|TrendsFeaturedTopicsListStatusCode401 of TrendsFeaturedTopicsListStatusCode401Response|TrendsFeaturedTopicsListStatusCode403 of TrendsFeaturedTopicsListStatusCode403Response|TrendsFeaturedTopicsListStatusCode404 of TrendsFeaturedTopicsListStatusCode404Response|TrendsFeaturedTopicsListStatusCode429 of TrendsFeaturedTopicsListStatusCode429Response|TrendsFeaturedTopicsListDefaultStatusCode of TrendsFeaturedTopicsListDefaultStatusCodeResponse

    type TrendsFeaturedTopicsListArgs = {
      queryParams:Result<TrendsFeaturedTopicsListQueryParams,string>;
    }

    //#region Query parameters
    [<CLIMutable>]
    type TrendsProductCategoriesDetailsListQueryParams = {
      productCategories : ProductCategoryEnum[] ;


      region : ProductCategoryRegion ;


      lookbackWindow : ProductCategoryDetailLookbackWindow option;


      engagementType : ProductCategoriesEngagementType option;

    }
    //#endregion


    type TrendsProductCategoriesDetailsListStatusCode200Response = {
      content:ProductCategoryDetails[];
      
    }

    type TrendsProductCategoriesDetailsListStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type TrendsProductCategoriesDetailsListStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type TrendsProductCategoriesDetailsListStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type TrendsProductCategoriesDetailsListStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type TrendsProductCategoriesDetailsListStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type TrendsProductCategoriesDetailsListDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type TrendsProductCategoriesDetailsListResult = TrendsProductCategoriesDetailsListStatusCode200 of TrendsProductCategoriesDetailsListStatusCode200Response|TrendsProductCategoriesDetailsListStatusCode400 of TrendsProductCategoriesDetailsListStatusCode400Response|TrendsProductCategoriesDetailsListStatusCode401 of TrendsProductCategoriesDetailsListStatusCode401Response|TrendsProductCategoriesDetailsListStatusCode403 of TrendsProductCategoriesDetailsListStatusCode403Response|TrendsProductCategoriesDetailsListStatusCode404 of TrendsProductCategoriesDetailsListStatusCode404Response|TrendsProductCategoriesDetailsListStatusCode429 of TrendsProductCategoriesDetailsListStatusCode429Response|TrendsProductCategoriesDetailsListDefaultStatusCode of TrendsProductCategoriesDetailsListDefaultStatusCodeResponse

    type TrendsProductCategoriesDetailsListArgs = {
      queryParams:Result<TrendsProductCategoriesDetailsListQueryParams,string>;
    }

    //#region Query parameters
    [<CLIMutable>]
    type TrendsProductCategoriesTrendingListQueryParams = {
      region : ProductCategoryRegion ;


      verticals : VerticalProductCategory[] option;


      ages : AgeTrendsBucket[] option;


      genders : GenderBucket[] option;


      engagementType : ProductCategoriesEngagementType option;

    }
    //#endregion


    type TrendsProductCategoriesTrendingListStatusCode200Response = {
      content:TrendingProductCategory[];
      
    }

    type TrendsProductCategoriesTrendingListStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type TrendsProductCategoriesTrendingListStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type TrendsProductCategoriesTrendingListStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type TrendsProductCategoriesTrendingListStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type TrendsProductCategoriesTrendingListStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type TrendsProductCategoriesTrendingListDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type TrendsProductCategoriesTrendingListResult = TrendsProductCategoriesTrendingListStatusCode200 of TrendsProductCategoriesTrendingListStatusCode200Response|TrendsProductCategoriesTrendingListStatusCode400 of TrendsProductCategoriesTrendingListStatusCode400Response|TrendsProductCategoriesTrendingListStatusCode401 of TrendsProductCategoriesTrendingListStatusCode401Response|TrendsProductCategoriesTrendingListStatusCode403 of TrendsProductCategoriesTrendingListStatusCode403Response|TrendsProductCategoriesTrendingListStatusCode404 of TrendsProductCategoriesTrendingListStatusCode404Response|TrendsProductCategoriesTrendingListStatusCode429 of TrendsProductCategoriesTrendingListStatusCode429Response|TrendsProductCategoriesTrendingListDefaultStatusCode of TrendsProductCategoriesTrendingListDefaultStatusCodeResponse

    type TrendsProductCategoriesTrendingListArgs = {
      queryParams:Result<TrendsProductCategoriesTrendingListQueryParams,string>;
    }
