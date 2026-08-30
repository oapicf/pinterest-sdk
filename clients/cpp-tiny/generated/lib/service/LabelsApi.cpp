#include "LabelsApi.h"

using namespace Tiny;



        Response<
            LabeledEntities
        >
        LabelsApi::
        labels_apply(
            
            std::string adAccountId
            , 
            
            std::string labelId
            , 
            
            LabeledEntitiesCreate labeledEntitiesCreate
            
        )
        {
            std::string url = basepath + "/ad_accounts/{ad_account_id}/labels/{label_id}/apply"; //adAccountId labelId 


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
                std::string s_labelId("{");
                s_labelId.append("label_id");
                s_labelId.append("}");

                int pos = url.find(s_labelId);

                url.erase(pos, s_labelId.length());
                url.insert(pos, stringify(labelId));


            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | labeledEntitiesCreate



            payload = labeledEntitiesCreate.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            LabeledEntities obj(output_string);


            Response<LabeledEntities> response(obj, httpCode);
            return response;
        }

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
            std::list<QueryLabelEntityStatusesItems> entityStatuses
            
            , 
            std::list<QueryLabelTypesItems> labelTypes
            
            , 
            
            std::string bookmark
            , 
            
            int pageSize
            
        )
        {
            std::string url = basepath + "/ad_accounts/{ad_account_id}/labels"; //adAccountId 


            // Headers  | 

            // Query    | campaignIds labelIds entityStatuses labelTypes bookmark pageSize 
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
            addQueryParam("bookmark",bookmark);
            addQueryParam("page_size",pageSize);

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
            LabeledEntities
        >
        LabelsApi::
        labels_remove(
            
            std::string adAccountId
            , 
            
            std::string labelId
            , 
            
            LabeledEntitiesCreate labeledEntitiesCreate
            
        )
        {
            std::string url = basepath + "/ad_accounts/{ad_account_id}/labels/{label_id}/remove"; //adAccountId labelId 


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
                std::string s_labelId("{");
                s_labelId.append("label_id");
                s_labelId.append("}");

                int pos = url.find(s_labelId);

                url.erase(pos, s_labelId.length());
                url.insert(pos, stringify(labelId));


            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | labeledEntitiesCreate



            payload = labeledEntitiesCreate.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            LabeledEntities obj(output_string);


            Response<LabeledEntities> response(obj, httpCode);
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



