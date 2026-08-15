#include "MsotEventsApi.h"

using namespace Tiny;



        Response<
            String
        >
        MsotEventsApi::
        msotEvents_create(
            
            std::string adAccountId
            , 
            
            ConversionMSOTEvents conversionMSOTEvents
            
        )
        {
            std::string url = basepath + "/ad_accounts/{ad_account_id}/msot/events"; //adAccountId 


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
            // Body     | conversionMSOTEvents



            payload = conversionMSOTEvents.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }



