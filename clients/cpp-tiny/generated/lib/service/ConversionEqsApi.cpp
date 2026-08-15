#include "ConversionEqsApi.h"

using namespace Tiny;



        Response<
            std::list<EventQualityScore>
        >
        ConversionEqsApi::
        conversionEqs_list(
            
            LookbackPeriodOptions lookbackPeriod
            , 
            
            std::string adAccountId
            , 
            
            SourcePlatformOptions sourcePlatform
            , 
            
            IngestionSourceOptions ingestionSource
            
        )
        {
            std::string url = basepath + "/ad_accounts/{ad_account_id}/conversion_eqs"; //adAccountId 


            // Headers  | 

            // Query    | lookbackPeriod sourcePlatform ingestionSource 
            addQueryParam("lookback_period",lookbackPeriod);
            addQueryParam("source_platform",sourcePlatform);
            addQueryParam("ingestion_source",ingestionSource);

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



            std::list<EventQualityScore> obj = std::list<EventQualityScore>();
            bourne::json jsonPayload(output_string);








            
            for(auto& var : jsonPayload.array_range())
            {
                EventQualityScore tmp(var.dump());
                obj.push_back(tmp);
            }
            







            Response<std::list<EventQualityScore>> response(obj, httpCode);
            return response;
        }



