#include "ConversionsApi.h"

using namespace Tiny;



        Response<
            AdvertiserDefinedEventsResponse
        >
        ConversionsApi::
        advertiserDefinedEvents_get(
            
            std::string adAccountId
            
        )
        {
            std::string url = basepath + "/ad_accounts/{ad_account_id}/advertiser_defined_events"; //adAccountId 


            // Headers  | 

            // Query    | 

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




            AdvertiserDefinedEventsResponse obj(output_string);


            Response<AdvertiserDefinedEventsResponse> response(obj, httpCode);
            return response;
        }



