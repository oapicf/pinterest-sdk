#include "AudienceInsightsApi.h"

using namespace Tiny;



        Response<
            AudienceDefinitionResponse
        >
        AudienceInsightsApi::
        audienceInsightsScopeAndType_get(
            
            std::string adAccountId
            
        )
        {
            std::string url = basepath + "/ad_accounts/{ad_account_id}/insights/audiences"; //adAccountId 


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




            AudienceDefinitionResponse obj(output_string);


            Response<AudienceDefinitionResponse> response(obj, httpCode);
            return response;
        }

        Response<
            AudienceInsightsResponse
        >
        AudienceInsightsApi::
        audienceInsights_get(
            
            std::string adAccountId
            , 
            
            AudienceInsightType audienceInsightType
            
        )
        {
            std::string url = basepath + "/ad_accounts/{ad_account_id}/audience_insights"; //adAccountId 


            // Headers  | 

            // Query    | audienceInsightType 
            addQueryParam("audience_insight_type",audienceInsightType);

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




            AudienceInsightsResponse obj(output_string);


            Response<AudienceInsightsResponse> response(obj, httpCode);
            return response;
        }



