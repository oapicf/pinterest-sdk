#include "CustomerSegmentApi.h"

using namespace Tiny;



        Response<
            CustomerSegment
        >
        CustomerSegmentApi::
        customerSegment_create(
            
            std::string adAccountId
            , 
            
            CustomerSegmentCreate customerSegmentCreate
            
        )
        {
            std::string url = basepath + "/ad_accounts/{ad_account_id}/customer_segments"; //adAccountId 


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
            // Body     | customerSegmentCreate



            payload = customerSegmentCreate.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            CustomerSegment obj(output_string);


            Response<CustomerSegment> response(obj, httpCode);
            return response;
        }

        Response<
            Customer_segment_list_200_response
        >
        CustomerSegmentApi::
        customerSegment_list(
            
            std::string adAccountId
            , 
            
            std::string bookmark
            , 
            
            int pageSize
            , 
            
            Pinterest.Lib.PaginationOrder order
            , 
            
            bool includeSizing
            , 
            
            std::string searchQuery
            
        )
        {
            std::string url = basepath + "/ad_accounts/{ad_account_id}/customer_segments"; //adAccountId 


            // Headers  | 

            // Query    | bookmark pageSize order includeSizing searchQuery 
            addQueryParam("bookmark",bookmark);
            addQueryParam("page_size",pageSize);
            addQueryParam("order",order);
            addQueryParam("include_sizing",includeSizing);
            addQueryParam("search_query",searchQuery);

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




            Customer_segment_list_200_response obj(output_string);


            Response<Customer_segment_list_200_response> response(obj, httpCode);
            return response;
        }

        Response<
            String
        >
        CustomerSegmentApi::
        customerSegment_update(
            
            std::string adAccountId
            , 
            
            CustomerSegmentUpdateRequestUpdateWithRequiredBody customerSegmentUpdateRequestUpdateWithRequiredBody
            
        )
        {
            std::string url = basepath + "/ad_accounts/{ad_account_id}/customer_segments"; //adAccountId 


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
            // Body     | customerSegmentUpdateRequestUpdateWithRequiredBody



            payload = customerSegmentUpdateRequestUpdateWithRequiredBody.toJson().dump();

            int httpCode = sendRequest(url, "PATCH", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }



