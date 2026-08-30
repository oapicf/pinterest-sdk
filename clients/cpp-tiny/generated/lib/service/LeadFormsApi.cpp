#include "LeadFormsApi.h"

using namespace Tiny;



        Response<
            LeadFormTest
        >
        LeadFormsApi::
        leadFormTest_create(
            
            std::string adAccountId
            , 
            
            std::string leadFormId
            , 
            
            LeadFormTestCreate leadFormTestCreate
            
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
            // Body     | leadFormTestCreate



            payload = leadFormTestCreate.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            LeadFormTest obj(output_string);


            Response<LeadFormTest> response(obj, httpCode);
            return response;
        }

        Response<
            LeadForm
        >
        LeadFormsApi::
        leadForm_get(
            
            std::string leadFormId
            , 
            
            std::string adAccountId
            
        )
        {
            std::string url = basepath + "/ad_accounts/{ad_account_id}/lead_forms/{lead_form_id}"; //leadFormId adAccountId 


            // Headers  | 

            // Query    | 

            // Form     | 



                std::string s_leadFormId("{");
                s_leadFormId.append("lead_form_id");
                s_leadFormId.append("}");

                int pos = url.find(s_leadFormId);

                url.erase(pos, s_leadFormId.length());
                url.insert(pos, stringify(leadFormId));
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




            LeadForm obj(output_string);


            Response<LeadForm> response(obj, httpCode);
            return response;
        }

        Response<
            Lead_forms_create_200_response
        >
        LeadFormsApi::
        leadForms_create(
            
            std::string adAccountId
            , 
            std::list<LeadFormCreate> leadFormCreate
            
            
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
            // Body     | leadFormCreate


            bourne::json tmp_arr = bourne::json::array();
            for(auto& var : leadFormCreate)
            {
                auto tmp = var.toJson();
                tmp_arr.append(tmp);

            }
            payload = tmp_arr.dump();


            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            Lead_forms_create_200_response obj(output_string);


            Response<Lead_forms_create_200_response> response(obj, httpCode);
            return response;
        }

        Response<
            Lead_forms_list_200_response
        >
        LeadFormsApi::
        leadForms_list(
            
            std::string adAccountId
            , 
            
            std::string bookmark
            , 
            
            int pageSize
            , 
            
            Pinterest.Lib.PaginationOrder order
            
        )
        {
            std::string url = basepath + "/ad_accounts/{ad_account_id}/lead_forms"; //adAccountId 


            // Headers  | 

            // Query    | bookmark pageSize order 
            addQueryParam("bookmark",bookmark);
            addQueryParam("page_size",pageSize);
            addQueryParam("order",order);

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
            Lead_forms_create_200_response
        >
        LeadFormsApi::
        leadForms_update(
            
            std::string adAccountId
            , 
            std::list<LeadFormBatchUpdate> leadFormBatchUpdate
            
            
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
            // Body     | leadFormBatchUpdate


            bourne::json tmp_arr = bourne::json::array();
            for(auto& var : leadFormBatchUpdate)
            {
                auto tmp = var.toJson();
                tmp_arr.append(tmp);

            }
            payload = tmp_arr.dump();


            int httpCode = sendRequest(url, "PATCH", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            Lead_forms_create_200_response obj(output_string);


            Response<Lead_forms_create_200_response> response(obj, httpCode);
            return response;
        }



