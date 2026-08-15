#include "LabelsApi.h"

using namespace Tiny;



        Response<
            LabelsResponse
        >
        LabelsApi::
        labels_create(
            
            std::string adAccountId
            , 
            
            LabelCreateRequest labelCreateRequest
            
        )
        {
            std::string url = basepath + "/ad_accounts/{ad_account_id}/labels"; //adAccountId 


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
            // Body     | labelCreateRequest



            payload = labelCreateRequest.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            LabelsResponse obj(output_string);


            Response<LabelsResponse> response(obj, httpCode);
            return response;
        }

        Response<
            Labels_list_200_response
        >
        LabelsApi::
        labels_list(
            
            std::string adAccountId
            , 
            std::list<std::string> campaignIds
            
            , 
            std::list<std::string> labelIds
            
            , 
            std::list<std::string> entityStatuses
            
            , 
            std::list<std::string> labelTypes
            
            , 
            
            int pageSize
            , 
            
            std::string bookmark
            
        )
        {
            std::string url = basepath + "/ad_accounts/{ad_account_id}/labels"; //adAccountId 


            // Headers  | 

            // Query    | campaignIds labelIds entityStatuses labelTypes pageSize bookmark 
            for (auto &x : campaignIds){
                addQueryParam("campaign_ids", std::string(x));
            }
            for (auto &x : labelIds){
                addQueryParam("label_ids", std::string(x));
            }
            for (auto &x : entityStatuses){
                addQueryParam("entity_statuses", std::string(x));
            }
            for (auto &x : labelTypes){
                addQueryParam("label_types", std::string(x));
            }
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




            Labels_list_200_response obj(output_string);


            Response<Labels_list_200_response> response(obj, httpCode);
            return response;
        }

        Response<
            LabelsResponse
        >
        LabelsApi::
        labels_update(
            
            std::string adAccountId
            , 
            
            LabelUpdateRequest labelUpdateRequest
            
        )
        {
            std::string url = basepath + "/ad_accounts/{ad_account_id}/labels"; //adAccountId 


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
            // Body     | labelUpdateRequest



            payload = labelUpdateRequest.toJson().dump();

            int httpCode = sendRequest(url, "PATCH", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            LabelsResponse obj(output_string);


            Response<LabelsResponse> response(obj, httpCode);
            return response;
        }



