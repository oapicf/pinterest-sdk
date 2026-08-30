#include "AudienceInsightsApi.h"

using namespace Tiny;



        Response<
            Audience_insights_scope_and_type_get_200_response
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




            Audience_insights_scope_and_type_get_200_response obj(output_string);


            Response<Audience_insights_scope_and_type_get_200_response> response(obj, httpCode);
            return response;
        }

        Response<
            AudienceInsights
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




            AudienceInsights obj(output_string);


            Response<AudienceInsights> response(obj, httpCode);
            return response;
        }



