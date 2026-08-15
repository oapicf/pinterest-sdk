#include "LeadFormsApi.h"

using namespace Tiny;



        Response<
            LeadFormTestResponse
        >
        LeadFormsApi::
        leadFormTest_create(
            
            std::string adAccountId
            , 
            
            std::string leadFormId
            , 
            
            LeadFormTestRequest leadFormTestRequest
            
        )
        {
            std::string url = basepath + "/ad_accounts/{ad_account_id}/lead_forms/{lead_form_id}/test"; //adAccountId leadFormId 


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
                std::string s_leadFormId("{");
                s_leadFormId.append("lead_form_id");
                s_leadFormId.append("}");

                int pos = url.find(s_leadFormId);

                url.erase(pos, s_leadFormId.length());
                url.insert(pos, stringify(leadFormId));


            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | leadFormTestRequest



            payload = leadFormTestRequest.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            LeadFormTestResponse obj(output_string);


            Response<LeadFormTestResponse> response(obj, httpCode);
            return response;
        }

        Response<
            LeadFormResponse
        >
        LeadFormsApi::
        leadForm_get(
            
            std::string adAccountId
            , 
            
            std::string leadFormId
            
        )
        {
            std::string url = basepath + "/ad_accounts/{ad_account_id}/lead_forms/{lead_form_id}"; //adAccountId leadFormId 


            // Headers  | 

            // Query    | 

            // Form     | 



                std::string s_adAccountId("{");
                s_adAccountId.append("ad_account_id");
                s_adAccountId.append("}");

                int pos = url.find(s_adAccountId);

                url.erase(pos, s_adAccountId.length());
                url.insert(pos, stringify(adAccountId));
                std::string s_leadFormId("{");
                s_leadFormId.append("lead_form_id");
                s_leadFormId.append("}");

                int pos = url.find(s_leadFormId);

                url.erase(pos, s_leadFormId.length());
                url.insert(pos, stringify(leadFormId));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            LeadFormResponse obj(output_string);


            Response<LeadFormResponse> response(obj, httpCode);
            return response;
        }

        Response<
            LeadFormArrayResponse
        >
        LeadFormsApi::
        leadForms_create(
            
            std::string adAccountId
            , 
            std::list<LeadFormCreateRequest> leadFormCreateRequest
            
            
        )
        {
            std::string url = basepath + "/ad_accounts/{ad_account_id}/lead_forms"; //adAccountId 


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
            // Body     | leadFormCreateRequest


            bourne::json tmp_arr = bourne::json::array();
            for(auto& var : leadFormCreateRequest)
            {
                auto tmp = var.toJson();
                tmp_arr.append(tmp);

            }
            payload = tmp_arr.dump();


            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            LeadFormArrayResponse obj(output_string);


            Response<LeadFormArrayResponse> response(obj, httpCode);
            return response;
        }

        Response<
            Lead_forms_list_200_response
        >
        LeadFormsApi::
        leadForms_list(
            
            std::string adAccountId
            , 
            
            int pageSize
            , 
            
            std::string order
            , 
            
            std::string bookmark
            
        )
        {
            std::string url = basepath + "/ad_accounts/{ad_account_id}/lead_forms"; //adAccountId 


            // Headers  | 

            // Query    | pageSize order bookmark 
            addQueryParam("page_size",pageSize);
            addQueryParam("order",order);
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




            Lead_forms_list_200_response obj(output_string);


            Response<Lead_forms_list_200_response> response(obj, httpCode);
            return response;
        }

        Response<
            LeadFormArrayResponse
        >
        LeadFormsApi::
        leadForms_update(
            
            std::string adAccountId
            , 
            std::list<LeadFormUpdateRequest> leadFormUpdateRequest
            
            
        )
        {
            std::string url = basepath + "/ad_accounts/{ad_account_id}/lead_forms"; //adAccountId 


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
            // Body     | leadFormUpdateRequest


            bourne::json tmp_arr = bourne::json::array();
            for(auto& var : leadFormUpdateRequest)
            {
                auto tmp = var.toJson();
                tmp_arr.append(tmp);

            }
            payload = tmp_arr.dump();


            int httpCode = sendRequest(url, "PATCH", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            LeadFormArrayResponse obj(output_string);


            Response<LeadFormArrayResponse> response(obj, httpCode);
            return response;
        }



