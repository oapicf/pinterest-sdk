#include "CustomerListUploadsApi.h"

using namespace Tiny;



        Response<
            CustomerListUploadCreateResponse
        >
        CustomerListUploadsApi::
        customerListUploads_create(
            
            std::string adAccountId
            , 
            
            std::string customerListId
            , 
            
            CustomerListUploadCreateRequest customerListUploadCreateRequest
            
        )
        {
            std::string url = basepath + "/ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads"; //adAccountId customerListId 


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
                std::string s_customerListId("{");
                s_customerListId.append("customer_list_id");
                s_customerListId.append("}");

                int pos = url.find(s_customerListId);

                url.erase(pos, s_customerListId.length());
                url.insert(pos, stringify(customerListId));


            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | customerListUploadCreateRequest



            payload = customerListUploadCreateRequest.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            CustomerListUploadCreateResponse obj(output_string);


            Response<CustomerListUploadCreateResponse> response(obj, httpCode);
            return response;
        }

        Response<
            CustomerListUpload
        >
        CustomerListUploadsApi::
        customerListUploads_get(
            
            std::string adAccountId
            , 
            
            std::string customerListId
            , 
            
            std::string customerListUploadId
            
        )
        {
            std::string url = basepath + "/ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads/{customer_list_upload_id}"; //adAccountId customerListId customerListUploadId 


            // Headers  | 

            // Query    | 

            // Form     | 



                std::string s_adAccountId("{");
                s_adAccountId.append("ad_account_id");
                s_adAccountId.append("}");

                int pos = url.find(s_adAccountId);

                url.erase(pos, s_adAccountId.length());
                url.insert(pos, stringify(adAccountId));
                std::string s_customerListId("{");
                s_customerListId.append("customer_list_id");
                s_customerListId.append("}");

                int pos = url.find(s_customerListId);

                url.erase(pos, s_customerListId.length());
                url.insert(pos, stringify(customerListId));
                std::string s_customerListUploadId("{");
                s_customerListUploadId.append("customer_list_upload_id");
                s_customerListUploadId.append("}");

                int pos = url.find(s_customerListUploadId);

                url.erase(pos, s_customerListUploadId.length());
                url.insert(pos, stringify(customerListUploadId));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            CustomerListUpload obj(output_string);


            Response<CustomerListUpload> response(obj, httpCode);
            return response;
        }

        Response<
            CustomerListUpload
        >
        CustomerListUploadsApi::
        customerListUploads_run(
            
            std::string adAccountId
            , 
            
            std::string customerListId
            , 
            
            std::string customerListUploadId
            
        )
        {
            std::string url = basepath + "/ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads/{customer_list_upload_id}/run"; //adAccountId customerListId customerListUploadId 


            // Headers  | 

            // Query    | 

            // Form     | 



                std::string s_adAccountId("{");
                s_adAccountId.append("ad_account_id");
                s_adAccountId.append("}");

                int pos = url.find(s_adAccountId);

                url.erase(pos, s_adAccountId.length());
                url.insert(pos, stringify(adAccountId));
                std::string s_customerListId("{");
                s_customerListId.append("customer_list_id");
                s_customerListId.append("}");

                int pos = url.find(s_customerListId);

                url.erase(pos, s_customerListId.length());
                url.insert(pos, stringify(customerListId));
                std::string s_customerListUploadId("{");
                s_customerListUploadId.append("customer_list_upload_id");
                s_customerListUploadId.append("}");

                int pos = url.find(s_customerListUploadId);

                url.erase(pos, s_customerListUploadId.length());
                url.insert(pos, stringify(customerListUploadId));


            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | 
            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            CustomerListUpload obj(output_string);


            Response<CustomerListUpload> response(obj, httpCode);
            return response;
        }



