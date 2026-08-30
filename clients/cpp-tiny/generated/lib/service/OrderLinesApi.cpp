#include "OrderLinesApi.h"

using namespace Tiny;



        Response<
            OrderLine
        >
        OrderLinesApi::
        orderLines_get(
            
            std::string orderLineId
            , 
            
            std::string adAccountId
            
        )
        {
            std::string url = basepath + "/ad_accounts/{ad_account_id}/order_lines/{order_line_id}"; //orderLineId adAccountId 


            // Headers  | 

            // Query    | 

            // Form     | 



                std::string s_orderLineId("{");
                s_orderLineId.append("order_line_id");
                s_orderLineId.append("}");

                int pos = url.find(s_orderLineId);

                url.erase(pos, s_orderLineId.length());
                url.insert(pos, stringify(orderLineId));
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




            OrderLine obj(output_string);


            Response<OrderLine> response(obj, httpCode);
            return response;
        }

        Response<
            Order_lines_list_200_response
        >
        OrderLinesApi::
        orderLines_list(
            
            std::string adAccountId
            , 
            
            std::string bookmark
            , 
            
            int pageSize
            , 
            
            Pinterest.Lib.PaginationOrder order
            
        )
        {
            std::string url = basepath + "/ad_accounts/{ad_account_id}/order_lines"; //adAccountId 


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




            Order_lines_list_200_response obj(output_string);


            Response<Order_lines_list_200_response> response(obj, httpCode);
            return response;
        }



