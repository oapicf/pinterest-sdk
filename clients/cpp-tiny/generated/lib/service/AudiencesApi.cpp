#include "AudiencesApi.h"

using namespace Tiny;



        Response<
            AdAccountsAudience
        >
        AudiencesApi::
        audiences_create(
            
            std::string adAccountId
            , 
            
            AdAccountsAudienceCreate adAccountsAudienceCreate
            
        )
        {
            std::string url = basepath + "/ad_accounts/{ad_account_id}/audiences"; //adAccountId 


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
            // Body     | adAccountsAudienceCreate



            payload = adAccountsAudienceCreate.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            AdAccountsAudience obj(output_string);


            Response<AdAccountsAudience> response(obj, httpCode);
            return response;
        }

        Response<
            AdAccountsAudience
        >
        AudiencesApi::
        audiences_get(
            
            std::string audienceId
            , 
            
            std::string adAccountId
            
        )
        {
            std::string url = basepath + "/ad_accounts/{ad_account_id}/audiences/{audience_id}"; //audienceId adAccountId 


            // Headers  | 

            // Query    | 

            // Form     | 



                std::string s_audienceId("{");
                s_audienceId.append("audience_id");
                s_audienceId.append("}");

                int pos = url.find(s_audienceId);

                url.erase(pos, s_audienceId.length());
                url.insert(pos, stringify(audienceId));
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




            AdAccountsAudience obj(output_string);


            Response<AdAccountsAudience> response(obj, httpCode);
            return response;
        }

        Response<
            Audiences_list_200_response
        >
        AudiencesApi::
        audiences_list(
            
            std::string adAccountId
            , 
            
            std::string bookmark
            , 
            
            int pageSize
            , 
            
            Pinterest.Lib.PaginationOrder order
            , 
            
            AudienceOwnershipType ownershipType
            , 
            
            bool excludeNca
            
        )
        {
            std::string url = basepath + "/ad_accounts/{ad_account_id}/audiences"; //adAccountId 


            // Headers  | 

            // Query    | bookmark pageSize order ownershipType excludeNca 
            addQueryParam("bookmark",bookmark);
            addQueryParam("page_size",pageSize);
            addQueryParam("order",order);
            addQueryParam("ownership_type",ownershipType);
            addQueryParam("exclude_nca",excludeNca);

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




            Audiences_list_200_response obj(output_string);


            Response<Audiences_list_200_response> response(obj, httpCode);
            return response;
        }

        Response<
            AdAccountsAudience
        >
        AudiencesApi::
        audiences_update(
            
            std::string audienceId
            , 
            
            std::string adAccountId
            , 
            
            AdAccountsAudienceUpdate adAccountsAudienceUpdate
            
        )
        {
            std::string url = basepath + "/ad_accounts/{ad_account_id}/audiences/{audience_id}"; //audienceId adAccountId 


            // Headers  | 

            // Query    | 

            // Form     | 
            addHeader("Content-Type", "application/json");



                std::string s_audienceId("{");
                s_audienceId.append("audience_id");
                s_audienceId.append("}");

                int pos = url.find(s_audienceId);

                url.erase(pos, s_audienceId.length());
                url.insert(pos, stringify(audienceId));
                std::string s_adAccountId("{");
                s_adAccountId.append("ad_account_id");
                s_adAccountId.append("}");

                int pos = url.find(s_adAccountId);

                url.erase(pos, s_adAccountId.length());
                url.insert(pos, stringify(adAccountId));


            std::string payload = "";
            // Send Request
            // METHOD | PATCH
            // Body     | adAccountsAudienceUpdate



            payload = adAccountsAudienceUpdate.toJson().dump();

            int httpCode = sendRequest(url, "PATCH", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            AdAccountsAudience obj(output_string);


            Response<AdAccountsAudience> response(obj, httpCode);
            return response;
        }



