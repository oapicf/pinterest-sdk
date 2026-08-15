#include "TargetingTemplateApi.h"

using namespace Tiny;



        Response<
            TargetingTemplateGetResponseData
        >
        TargetingTemplateApi::
        targetingTemplate_create(
            
            std::string adAccountId
            , 
            
            TargetingTemplateCreate targetingTemplateCreate
            
        )
        {
            std::string url = basepath + "/ad_accounts/{ad_account_id}/targeting_templates"; //adAccountId 


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
            // Body     | targetingTemplateCreate



            payload = targetingTemplateCreate.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            TargetingTemplateGetResponseData obj(output_string);


            Response<TargetingTemplateGetResponseData> response(obj, httpCode);
            return response;
        }

        Response<
            Targeting_template_list_200_response
        >
        TargetingTemplateApi::
        targetingTemplate_list(
            
            std::string adAccountId
            , 
            
            std::string order
            , 
            
            bool includeSizing
            , 
            
            std::string searchQuery
            , 
            
            int pageSize
            , 
            
            std::string bookmark
            
        )
        {
            std::string url = basepath + "/ad_accounts/{ad_account_id}/targeting_templates"; //adAccountId 


            // Headers  | 

            // Query    | order includeSizing searchQuery pageSize bookmark 
            addQueryParam("order",order);
            addQueryParam("include_sizing",includeSizing);
            addQueryParam("search_query",searchQuery);
            addQueryParam("page_size",pageSize);
            addQueryParam("bookmark",bookmark);

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




            Targeting_template_list_200_response obj(output_string);


            Response<Targeting_template_list_200_response> response(obj, httpCode);
            return response;
        }

        Response<
            String
        >
        TargetingTemplateApi::
        targetingTemplate_update(
            
            std::string adAccountId
            , 
            
            TargetingTemplateUpdateRequest targetingTemplateUpdateRequest
            
        )
        {
            std::string url = basepath + "/ad_accounts/{ad_account_id}/targeting_templates"; //adAccountId 


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
            // Body     | targetingTemplateUpdateRequest



            payload = targetingTemplateUpdateRequest.toJson().dump();

            int httpCode = sendRequest(url, "PATCH", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }



