#include "ProductCategoriesApi.h"

using namespace Tiny;



        Response<
            std::list<FeaturedTrend>
        >
        ProductCategoriesApi::
        trendsFeaturedTopics_list(
            
            ProductCategoryRegion region
            , 
            
            InterestsEnum interest
            
        )
        {
            std::string url = basepath + "/trends/topics/featured"; //


            // Headers  | 

            // Query    | interest region 
            addQueryParam("interest",interest);
            addQueryParam("region",region);

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();



            std::list<FeaturedTrend> obj = std::list<FeaturedTrend>();
            bourne::json jsonPayload(output_string);








            
            for(auto& var : jsonPayload.array_range())
            {
                FeaturedTrend tmp(var.dump());
                obj.push_back(tmp);
            }
            







            Response<std::list<FeaturedTrend>> response(obj, httpCode);
            return response;
        }

        Response<
            std::list<ProductCategoryDetails>
        >
        ProductCategoriesApi::
        trendsProductCategoriesDetails_list(
            std::list<ProductCategoryEnum> productCategories
            
            , 
            
            ProductCategoryRegion region
            , 
            
            ProductCategoryDetailLookbackWindow lookbackWindow
            , 
            
            ProductCategoriesEngagementType engagementType
            
        )
        {
            std::string url = basepath + "/trends/product_categories/details"; //


            // Headers  | 

            // Query    | productCategories region lookbackWindow engagementType 
            for (auto &x : productCategories){
                addQueryParam("product_categories", std::string(x));
            }
            addQueryParam("region",region);
            addQueryParam("lookback_window",lookbackWindow);
            addQueryParam("engagement_type",engagementType);

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();



            std::list<ProductCategoryDetails> obj = std::list<ProductCategoryDetails>();
            bourne::json jsonPayload(output_string);








            
            for(auto& var : jsonPayload.array_range())
            {
                ProductCategoryDetails tmp(var.dump());
                obj.push_back(tmp);
            }
            







            Response<std::list<ProductCategoryDetails>> response(obj, httpCode);
            return response;
        }

        Response<
            std::list<TrendingProductCategory>
        >
        ProductCategoriesApi::
        trendsProductCategoriesTrending_list(
            
            ProductCategoryRegion region
            , 
            std::list<VerticalProductCategory> verticals
            
            , 
            std::list<AgeTrendsBucket> ages
            
            , 
            std::list<GenderBucket> genders
            
            , 
            
            ProductCategoriesEngagementType engagementType
            
        )
        {
            std::string url = basepath + "/trends/product_categories/trending"; //


            // Headers  | 

            // Query    | region verticals ages genders engagementType 
            addQueryParam("region",region);
            for (auto &x : verticals){
                addQueryParam("verticals", std::string(x));
            }
            for (auto &x : ages){
                addQueryParam("ages", std::string(x));
            }
            for (auto &x : genders){
                addQueryParam("genders", std::string(x));
            }
            addQueryParam("engagement_type",engagementType);

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();



            std::list<TrendingProductCategory> obj = std::list<TrendingProductCategory>();
            bourne::json jsonPayload(output_string);








            
            for(auto& var : jsonPayload.array_range())
            {
                TrendingProductCategory tmp(var.dump());
                obj.push_back(tmp);
            }
            







            Response<std::list<TrendingProductCategory>> response(obj, httpCode);
            return response;
        }



