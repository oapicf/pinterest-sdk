#include "SearchApi.h"

using namespace Tiny;



        Response<
            Search_partner_pins_200_response
        >
        SearchApi::
        searchPartnerPins(
            
            std::string term
            , 
            
            std::string countryCode
            , 
            
            std::string bookmark
            , 
            
            std::string locale
            , 
            
            int limit
            
        )
        {
            std::string url = basepath + "/search/partner/pins"; //


            // Headers  | 

            // Query    | term countryCode bookmark locale limit 
            addQueryParam("term",term);
            addQueryParam("country_code",countryCode);
            addQueryParam("bookmark",bookmark);
            addQueryParam("locale",locale);
            addQueryParam("limit",limit);

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            Search_partner_pins_200_response obj(output_string);


            Response<Search_partner_pins_200_response> response(obj, httpCode);
            return response;
        }

        Response<
            Search_user_boards_get_200_response
        >
        SearchApi::
        searchUserBoards_get(
            
            std::string adAccountId
            , 
            
            std::string bookmark
            , 
            
            int pageSize
            , 
            
            std::string query
            
        )
        {
            std::string url = basepath + "/search/boards"; //


            // Headers  | 

            // Query    | adAccountId bookmark pageSize query 
            addQueryParam("ad_account_id",adAccountId);
            addQueryParam("bookmark",bookmark);
            addQueryParam("page_size",pageSize);
            addQueryParam("query",query);

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            Search_user_boards_get_200_response obj(output_string);


            Response<Search_user_boards_get_200_response> response(obj, httpCode);
            return response;
        }

        Response<
            Search_user_pins_list_200_response
        >
        SearchApi::
        searchUserPins_list(
            
            std::string query
            , 
            
            std::string adAccountId
            , 
            
            std::string bookmark
            
        )
        {
            std::string url = basepath + "/search/pins"; //


            // Headers  | 

            // Query    | adAccountId query bookmark 
            addQueryParam("ad_account_id",adAccountId);
            addQueryParam("query",query);
            addQueryParam("bookmark",bookmark);

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            Search_user_pins_list_200_response obj(output_string);


            Response<Search_user_pins_list_200_response> response(obj, httpCode);
            return response;
        }



