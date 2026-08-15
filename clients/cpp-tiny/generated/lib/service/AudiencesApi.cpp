#include "AudiencesApi.h"

using namespace Tiny;



        Response<
            Audience
        >
        AudiencesApi::
        audiences_create(
            
            std::string adAccountId
            , 
            
            AudienceCreateRequest audienceCreateRequest
            
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
            // Body     | audienceCreateRequest



            payload = audienceCreateRequest.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            Audience obj(output_string);


            Response<Audience> response(obj, httpCode);
            return response;
        }

        Response<
            Audience
        >
        AudiencesApi::
        audiences_get(
            
            std::string adAccountId
            , 
            
            std::string audienceId
            
        )
        {
            std::string url = basepath + "/ad_accounts/{ad_account_id}/audiences/{audience_id}"; //adAccountId audienceId 


            // Headers  | 

            // Query    | 

            // Form     | 



                std::string s_adAccountId("{");
                s_adAccountId.append("ad_account_id");
                s_adAccountId.append("}");

                int pos = url.find(s_adAccountId);

                url.erase(pos, s_adAccountId.length());
                url.insert(pos, stringify(adAccountId));
                std::string s_audienceId("{");
                s_audienceId.append("audience_id");
                s_audienceId.append("}");

                int pos = url.find(s_audienceId);

                url.erase(pos, s_audienceId.length());
                url.insert(pos, stringify(audienceId));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            Audience obj(output_string);


            Response<Audience> response(obj, httpCode);
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
            
            std::string order
            , 
            
            int pageSize
            , 
            
            std::string ownershipType
            
        )
        {
            std::string url = basepath + "/ad_accounts/{ad_account_id}/audiences"; //adAccountId 


            // Headers  | 

            // Query    | bookmark order pageSize ownershipType 
            addQueryParam("bookmark",bookmark);
            addQueryParam("order",order);
            addQueryParam("page_size",pageSize);
            addQueryParam("ownership_type",ownershipType);

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
            Audience
        >
        AudiencesApi::
        audiences_update(
            
            std::string adAccountId
            , 
            
            std::string audienceId
            , 
            
            AudienceUpdateRequest audienceUpdateRequest
            
        )
        {
            std::string url = basepath + "/ad_accounts/{ad_account_id}/audiences/{audience_id}"; //adAccountId audienceId 


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
                std::string s_audienceId("{");
                s_audienceId.append("audience_id");
                s_audienceId.append("}");

                int pos = url.find(s_audienceId);

                url.erase(pos, s_audienceId.length());
                url.insert(pos, stringify(audienceId));


            std::string payload = "";
            // Send Request
            // METHOD | PATCH
            // Body     | audienceUpdateRequest



            payload = audienceUpdateRequest.toJson().dump();

            int httpCode = sendRequest(url, "PATCH", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            Audience obj(output_string);


            Response<Audience> response(obj, httpCode);
            return response;
        }



