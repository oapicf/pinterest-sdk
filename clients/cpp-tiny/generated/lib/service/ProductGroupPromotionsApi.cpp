#include "ProductGroupPromotionsApi.h"

using namespace Tiny;



        Response<
            ProductGroupPromotions
        >
        ProductGroupPromotionsApi::
        productGroupPromotions_create(
            
            std::string adAccountId
            , 
            
            ProductGroupPromotionsCreate productGroupPromotionsCreate
            
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
            // Body     | productGroupPromotionsCreate



            payload = productGroupPromotionsCreate.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            ProductGroupPromotions obj(output_string);


            Response<ProductGroupPromotions> response(obj, httpCode);
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
            
            std::string bookmark
            , 
            
            int pageSize
            , 
            
            Pinterest.Lib.PaginationOrder order
            , 
            std::list<std::string> productGroupPromotionIds
            
            , 
            std::list<EntityStatus> entityStatuses
            
            , 
            
            std::string adGroupId
            
        )
        {
            std::string url = basepath + "/ad_accounts/{ad_account_id}/product_group_promotions"; //adAccountId 


            // Headers  | 

            // Query    | bookmark pageSize order productGroupPromotionIds entityStatuses adGroupId 
            addQueryParam("bookmark",bookmark);
            addQueryParam("page_size",pageSize);
            addQueryParam("order",order);
            for (auto &x : productGroupPromotionIds){
                addQueryParam("product_group_promotion_ids", std::string(x));
            }
            for (auto &x : entityStatuses){
                addQueryParam("entity_statuses", std::string(x));
            }
            addQueryParam("ad_group_id",adGroupId);

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
            ProductGroupPromotions
        >
        ProductGroupPromotionsApi::
        productGroupPromotions_update(
            
            std::string adAccountId
            , 
            
            ProductGroupPromotionsUpdateWithRequiredBody productGroupPromotionsUpdateWithRequiredBody
            
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
            // Body     | productGroupPromotionsUpdateWithRequiredBody



            payload = productGroupPromotionsUpdateWithRequiredBody.toJson().dump();

            int httpCode = sendRequest(url, "PATCH", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            ProductGroupPromotions obj(output_string);


            Response<ProductGroupPromotions> response(obj, httpCode);
            return response;
        }

        Response<
            std::list<ProductGroupAnalyticsItems>
        >
        ProductGroupPromotionsApi::
        productGroups_analytics(
            
            Date startDate
            , 
            
            Date endDate
            , 
            std::list<std::string> productGroupIds
            
            , 
            std::list<ReportingColumnSync> columns
            
            , 
            
            Granularity granularity
            , 
            
            std::string adAccountId
            , 
            
            long clickWindowDays
            , 
            
            long engagementWindowDays
            , 
            
            long viewWindowDays
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



            std::list<ProductGroupAnalyticsItems> obj = std::list<ProductGroupAnalyticsItems>();
            bourne::json jsonPayload(output_string);








            
            for(auto& var : jsonPayload.array_range())
            {
                ProductGroupAnalyticsItems tmp(var.dump());
                obj.push_back(tmp);
            }
            







            Response<std::list<ProductGroupAnalyticsItems>> response(obj, httpCode);
            return response;
        }



