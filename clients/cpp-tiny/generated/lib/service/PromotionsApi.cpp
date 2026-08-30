#include "PromotionsApi.h"

using namespace Tiny;



        Response<
            PromotionsResponse
        >
        PromotionsApi::
        promotions_create(
            
            std::string adAccountId
            , 
            std::list<PromotionCreate> promotionCreate
            
            
        )
        {
            std::string url = basepath + "/ad_accounts/{ad_account_id}/promotions"; //adAccountId 


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
            // Body     | promotionCreate


            bourne::json tmp_arr = bourne::json::array();
            for(auto& var : promotionCreate)
            {
                auto tmp = var.toJson();
                tmp_arr.append(tmp);

            }
            payload = tmp_arr.dump();


            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            PromotionsResponse obj(output_string);


            Response<PromotionsResponse> response(obj, httpCode);
            return response;
        }

        Response<
            Promotion
        >
        PromotionsApi::
        promotions_delete(
            
            std::string promotionId
            , 
            
            std::string adAccountId
            
        )
        {
            std::string url = basepath + "/ad_accounts/{ad_account_id}/promotions/{promotion_id}"; //promotionId adAccountId 


            // Headers  | 

            // Query    | 

            // Form     | 



                std::string s_promotionId("{");
                s_promotionId.append("promotion_id");
                s_promotionId.append("}");

                int pos = url.find(s_promotionId);

                url.erase(pos, s_promotionId.length());
                url.insert(pos, stringify(promotionId));
                std::string s_adAccountId("{");
                s_adAccountId.append("ad_account_id");
                s_adAccountId.append("}");

                int pos = url.find(s_adAccountId);

                url.erase(pos, s_adAccountId.length());
                url.insert(pos, stringify(adAccountId));


            std::string payload = "";
            // Send Request
            // METHOD | DELETE
            // Body     | 
            int httpCode = sendRequest(url, "DELETE", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            Promotion obj(output_string);


            Response<Promotion> response(obj, httpCode);
            return response;
        }

        Response<
            Promotion
        >
        PromotionsApi::
        promotions_get(
            
            std::string promotionId
            , 
            
            std::string adAccountId
            
        )
        {
            std::string url = basepath + "/ad_accounts/{ad_account_id}/promotions/{promotion_id}"; //promotionId adAccountId 


            // Headers  | 

            // Query    | 

            // Form     | 



                std::string s_promotionId("{");
                s_promotionId.append("promotion_id");
                s_promotionId.append("}");

                int pos = url.find(s_promotionId);

                url.erase(pos, s_promotionId.length());
                url.insert(pos, stringify(promotionId));
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




            Promotion obj(output_string);


            Response<Promotion> response(obj, httpCode);
            return response;
        }

        Response<
            Promotions_list_200_response
        >
        PromotionsApi::
        promotions_list(
            
            std::string adAccountId
            , 
            
            std::string bookmark
            , 
            
            int pageSize
            , 
            
            Pinterest.Lib.PaginationOrder order
            
        )
        {
            std::string url = basepath + "/ad_accounts/{ad_account_id}/promotions"; //adAccountId 


            // Headers  | 

            // Query    | bookmark pageSize order 
            addQueryParam("bookmark",bookmark);
            addQueryParam("page_size",pageSize);
            addQueryParam("order",order);

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




            Promotions_list_200_response obj(output_string);


            Response<Promotions_list_200_response> response(obj, httpCode);
            return response;
        }

        Response<
            PromotionsResponse
        >
        PromotionsApi::
        promotions_update(
            
            std::string adAccountId
            , 
            std::list<PromotionBatchUpdate> promotionBatchUpdate
            
            
        )
        {
            std::string url = basepath + "/ad_accounts/{ad_account_id}/promotions"; //adAccountId 


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
            // Body     | promotionBatchUpdate


            bourne::json tmp_arr = bourne::json::array();
            for(auto& var : promotionBatchUpdate)
            {
                auto tmp = var.toJson();
                tmp_arr.append(tmp);

            }
            payload = tmp_arr.dump();


            int httpCode = sendRequest(url, "PATCH", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            PromotionsResponse obj(output_string);


            Response<PromotionsResponse> response(obj, httpCode);
            return response;
        }



