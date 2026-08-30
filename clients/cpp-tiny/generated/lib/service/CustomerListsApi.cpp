#include "CustomerListsApi.h"

using namespace Tiny;



        Response<
            CustomerList
        >
        CustomerListsApi::
        customerLists_create(
            
            std::string adAccountId
            , 
            
            CustomerListCreate customerListCreate
            
        )
        {
            std::string url = basepath + "/ad_accounts/{ad_account_id}/customer_lists"; //adAccountId 


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
            // Body     | customerListCreate



            payload = customerListCreate.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            CustomerList obj(output_string);


            Response<CustomerList> response(obj, httpCode);
            return response;
        }

        Response<
            CustomerList
        >
        CustomerListsApi::
        customerLists_get(
            
            std::string adAccountId
            , 
            
            std::string customerListId
            
        )
        {
            std::string url = basepath + "/ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}"; //adAccountId customerListId 


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


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            CustomerList obj(output_string);


            Response<CustomerList> response(obj, httpCode);
            return response;
        }

        Response<
            Customer_lists_list_200_response
        >
        CustomerListsApi::
        customerLists_list(
            
            std::string adAccountId
            , 
            
            std::string bookmark
            , 
            
            int pageSize
            , 
            
            Pinterest.Lib.PaginationOrder order
            , 
            
            bool excludeNca
            
        )
        {
            std::string url = basepath + "/ad_accounts/{ad_account_id}/customer_lists"; //adAccountId 


            // Headers  | 

            // Query    | bookmark pageSize order excludeNca 
            addQueryParam("bookmark",bookmark);
            addQueryParam("page_size",pageSize);
            addQueryParam("order",order);
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




            Customer_lists_list_200_response obj(output_string);


            Response<Customer_lists_list_200_response> response(obj, httpCode);
            return response;
        }

        Response<
            CustomerList
        >
        CustomerListsApi::
        customerLists_update(
            
            std::string adAccountId
            , 
            
            std::string customerListId
            , 
            
            CustomerListUpdateWithRequiredBody customerListUpdateWithRequiredBody
            
        )
        {
            std::string url = basepath + "/ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}"; //adAccountId customerListId 


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
            // METHOD | PATCH
            // Body     | customerListUpdateWithRequiredBody



            payload = customerListUpdateWithRequiredBody.toJson().dump();

            int httpCode = sendRequest(url, "PATCH", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            CustomerList obj(output_string);


            Response<CustomerList> response(obj, httpCode);
            return response;
        }



