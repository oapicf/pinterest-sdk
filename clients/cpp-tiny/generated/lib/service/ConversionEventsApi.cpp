#include "ConversionEventsApi.h"

using namespace Tiny;



        Response<
            ConversionEvents
        >
        ConversionEventsApi::
        events_create(
            
            std::string adAccountId
            , 
            
            ConversionEventsCreate conversionEventsCreate
            , 
            
            bool test
            
        )
        {
            std::string url = basepath + "/ad_accounts/{ad_account_id}/events"; //adAccountId 


            // Headers  | 

            // Query    | test 
            addQueryParam("test",test);

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
            // Body     | conversionEventsCreate



            payload = conversionEventsCreate.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            ConversionEvents obj(output_string);


            Response<ConversionEvents> response(obj, httpCode);
            return response;
        }



