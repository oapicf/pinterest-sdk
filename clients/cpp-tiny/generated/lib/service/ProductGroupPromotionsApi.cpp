#include "ProductGroupPromotionsApi.h"

using namespace Tiny;



        Response<
            ProductGroupPromotionResponse
        >
        ProductGroupPromotionsApi::
        productGroupPromotions_create(
            
            std::string adAccountId
            , 
            
            ProductGroupPromotionCreateRequest productGroupPromotionCreateRequest
            
        )
        {
            std::string url = basepath + "/ad_accounts/{ad_account_id}/product_group_promotions"; //adAccountId 


            // Headers  | 

            // Query    | 

            // Form     | 
            addHeader("Content-Type", "application/json");



                std::string s_adAccountId("{");
                s_adAccountId.append("ad_account_id");
                s_adAccountId.append("}");

                int pos = url.find(s_adAccountId);

                url.erase(pos, s_adAccountId.length());
                url.insert(pos, stringify(adAccountId));


            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | productGroupPromotionCreateRequest



            payload = productGroupPromotionCreateRequest.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            ProductGroupPromotionResponse obj(output_string);


            Response<ProductGroupPromotionResponse> response(obj, httpCode);
            return response;
        }

        Response<
            ProductGroupPromotion
        >
        ProductGroupPromotionsApi::
        productGroupPromotions_get(
            
            std::string adAccountId
            , 
            
            std::string productGroupPromotionId
            
        )
        {
            std::string url = basepath + "/ad_accounts/{ad_account_id}/product_group_promotions/{product_group_promotion_id}"; //adAccountId productGroupPromotionId 


            // Headers  | 

            // Query    | 

            // Form     | 



                std::string s_adAccountId("{");
                s_adAccountId.append("ad_account_id");
                s_adAccountId.append("}");

                int pos = url.find(s_adAccountId);

                url.erase(pos, s_adAccountId.length());
                url.insert(pos, stringify(adAccountId));
                std::string s_productGroupPromotionId("{");
                s_productGroupPromotionId.append("product_group_promotion_id");
                s_productGroupPromotionId.append("}");

                int pos = url.find(s_productGroupPromotionId);

                url.erase(pos, s_productGroupPromotionId.length());
                url.insert(pos, stringify(productGroupPromotionId));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            ProductGroupPromotion obj(output_string);


            Response<ProductGroupPromotion> response(obj, httpCode);
            return response;
        }

        Response<
            Product_group_promotions_list_200_response
        >
        ProductGroupPromotionsApi::
        productGroupPromotions_list(
            
            std::string adAccountId
            , 
            std::list<std::string> productGroupPromotionIds
            
            , 
            std::list<std::string> entityStatuses
            
            , 
            
            std::string adGroupId
            , 
            
            int pageSize
            , 
            
            std::string order
            , 
            
            std::string bookmark
            
        )
        {
            std::string url = basepath + "/ad_accounts/{ad_account_id}/product_group_promotions"; //adAccountId 


            // Headers  | 

            // Query    | productGroupPromotionIds entityStatuses adGroupId pageSize order bookmark 
            for (auto &x : productGroupPromotionIds){
                addQueryParam("product_group_promotion_ids", std::string(x));
            }
            for (auto &x : entityStatuses){
                addQueryParam("entity_statuses", std::string(x));
            }
            addQueryParam("ad_group_id",adGroupId);
            addQueryParam("page_size",pageSize);
            addQueryParam("order",order);
            addQueryParam("bookmark",bookmark);

            // Form     | 



                std::string s_adAccountId("{");
                s_adAccountId.append("ad_account_id");
                s_adAccountId.append("}");

                int pos = url.find(s_adAccountId);

                url.erase(pos, s_adAccountId.length());
                url.insert(pos, stringify(adAccountId));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            Product_group_promotions_list_200_response obj(output_string);


            Response<Product_group_promotions_list_200_response> response(obj, httpCode);
            return response;
        }

        Response<
            ProductGroupPromotionResponse
        >
        ProductGroupPromotionsApi::
        productGroupPromotions_update(
            
            std::string adAccountId
            , 
            
            ProductGroupPromotionUpdateRequest productGroupPromotionUpdateRequest
            
        )
        {
            std::string url = basepath + "/ad_accounts/{ad_account_id}/product_group_promotions"; //adAccountId 


            // Headers  | 

            // Query    | 

            // Form     | 
            addHeader("Content-Type", "application/json");



                std::string s_adAccountId("{");
                s_adAccountId.append("ad_account_id");
                s_adAccountId.append("}");

                int pos = url.find(s_adAccountId);

                url.erase(pos, s_adAccountId.length());
                url.insert(pos, stringify(adAccountId));


            std::string payload = "";
            // Send Request
            // METHOD | PATCH
            // Body     | productGroupPromotionUpdateRequest



            payload = productGroupPromotionUpdateRequest.toJson().dump();

            int httpCode = sendRequest(url, "PATCH", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            ProductGroupPromotionResponse obj(output_string);


            Response<ProductGroupPromotionResponse> response(obj, httpCode);
            return response;
        }

        Response<
            std::list<ProductGroupAnalyticsResponse_inner>
        >
        ProductGroupPromotionsApi::
        productGroups_analytics(
            
            std::string adAccountId
            , 
            
            Date startDate
            , 
            
            Date endDate
            , 
            std::list<std::string> productGroupIds
            
            , 
            std::list<std::string> columns
            
            , 
            
            Granularity granularity
            , 
            
            int clickWindowDays
            , 
            
            int engagementWindowDays
            , 
            
            int viewWindowDays
            , 
            
            std::string conversionReportTime
            , 
            
            ReportingTimeZone reportingTimezone
            
        )
        {
            std::string url = basepath + "/ad_accounts/{ad_account_id}/product_groups/analytics"; //adAccountId 


            // Headers  | 

            // Query    | startDate endDate productGroupIds columns granularity clickWindowDays engagementWindowDays viewWindowDays conversionReportTime reportingTimezone 
            addQueryParam("start_date",startDate);
            addQueryParam("end_date",endDate);
            for (auto &x : productGroupIds){
                addQueryParam("product_group_ids", std::string(x));
            }
            for (auto &x : columns){
                addQueryParam("columns", std::string(x));
            }
            addQueryParam("granularity",granularity);
            addQueryParam("click_window_days",clickWindowDays);
            addQueryParam("engagement_window_days",engagementWindowDays);
            addQueryParam("view_window_days",viewWindowDays);
            addQueryParam("conversion_report_time",conversionReportTime);
            addQueryParam("reporting_timezone",reportingTimezone);

            // Form     | 



                std::string s_adAccountId("{");
                s_adAccountId.append("ad_account_id");
                s_adAccountId.append("}");

                int pos = url.find(s_adAccountId);

                url.erase(pos, s_adAccountId.length());
                url.insert(pos, stringify(adAccountId));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();



            std::list<ProductGroupAnalyticsResponse_inner> obj = std::list<ProductGroupAnalyticsResponse_inner>();
            bourne::json jsonPayload(output_string);








            
            for(auto& var : jsonPayload.array_range())
            {
                ProductGroupAnalyticsResponse_inner tmp(var.dump());
                obj.push_back(tmp);
            }
            







            Response<std::list<ProductGroupAnalyticsResponse_inner>> response(obj, httpCode);
            return response;
        }



