#include "AdvancedAuctionApi.h"

using namespace Tiny;



        Response<
            AdvancedAuctionItems
        >
        AdvancedAuctionApi::
        advancedAuctionItemsGet_post(
            
            AdvancedAuctionItemsGetRequest advancedAuctionItemsGetRequest
            , 
            
            std::string adAccountId
            
        )
        {
            std::string url = basepath + "/advanced_auction/items/get"; //


            // Headers  | 

            // Query    | adAccountId 
            addQueryParam("ad_account_id",adAccountId);

            // Form     | 
            addHeader("Content-Type", "application/json");





            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | advancedAuctionItemsGetRequest



            payload = advancedAuctionItemsGetRequest.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            AdvancedAuctionItems obj(output_string);


            Response<AdvancedAuctionItems> response(obj, httpCode);
            return response;
        }

        Response<
            AdvancedAuctionProcessedItems
        >
        AdvancedAuctionApi::
        advancedAuctionItemsSubmit_post(
            
            AdvancedAuctionItemsSubmitRequest advancedAuctionItemsSubmitRequest
            , 
            
            std::string adAccountId
            
        )
        {
            std::string url = basepath + "/advanced_auction/items/submit"; //


            // Headers  | 

            // Query    | adAccountId 
            addQueryParam("ad_account_id",adAccountId);

            // Form     | 
            addHeader("Content-Type", "application/json");





            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | advancedAuctionItemsSubmitRequest



            payload = advancedAuctionItemsSubmitRequest.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            AdvancedAuctionProcessedItems obj(output_string);


            Response<AdvancedAuctionProcessedItems> response(obj, httpCode);
            return response;
        }



