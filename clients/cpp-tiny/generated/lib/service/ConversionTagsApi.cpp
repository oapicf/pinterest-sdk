#include "ConversionTagsApi.h"

using namespace Tiny;



        Response<
            ConversionTag
        >
        ConversionTagsApi::
        conversionTags_create(
            
            std::string adAccountId
            , 
            
            ConversionTagCreate conversionTagCreate
            
        )
        {
            std::string url = basepath + "/ad_accounts/{ad_account_id}/conversion_tags"; //adAccountId 


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
            // Body     | conversionTagCreate



            payload = conversionTagCreate.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            ConversionTag obj(output_string);


            Response<ConversionTag> response(obj, httpCode);
            return response;
        }

        Response<
            ConversionTag
        >
        ConversionTagsApi::
        conversionTags_get(
            
            std::string adAccountId
            , 
            
            std::string conversionTagId
            
        )
        {
            std::string url = basepath + "/ad_accounts/{ad_account_id}/conversion_tags/{conversion_tag_id}"; //adAccountId conversionTagId 


            // Headers  | 

            // Query    | 

            // Form     | 



                std::string s_adAccountId("{");
                s_adAccountId.append("ad_account_id");
                s_adAccountId.append("}");

                int pos = url.find(s_adAccountId);

                url.erase(pos, s_adAccountId.length());
                url.insert(pos, stringify(adAccountId));
                std::string s_conversionTagId("{");
                s_conversionTagId.append("conversion_tag_id");
                s_conversionTagId.append("}");

                int pos = url.find(s_conversionTagId);

                url.erase(pos, s_conversionTagId.length());
                url.insert(pos, stringify(conversionTagId));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            ConversionTag obj(output_string);


            Response<ConversionTag> response(obj, httpCode);
            return response;
        }

        Response<
            Conversion_tags_list_200_response
        >
        ConversionTagsApi::
        conversionTags_list(
            
            std::string adAccountId
            , 
            
            bool filterDeleted
            
        )
        {
            std::string url = basepath + "/ad_accounts/{ad_account_id}/conversion_tags"; //adAccountId 


            // Headers  | 

            // Query    | filterDeleted 
            addQueryParam("filter_deleted",filterDeleted);

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




            Conversion_tags_list_200_response obj(output_string);


            Response<Conversion_tags_list_200_response> response(obj, httpCode);
            return response;
        }

        Response<
            String
        >
        ConversionTagsApi::
        ocpmEligibleConversionTags_get(
            
            std::string adAccountId
            
        )
        {
            std::string url = basepath + "/ad_accounts/{ad_account_id}/conversion_tags/ocpm_eligible"; //adAccountId 


            // Headers  | 

            // Query    | 

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



            //TODO: Implement map logic here




            //TODO: No support for maps.
            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            Page_visit_conversion_tags_get_200_response
        >
        ConversionTagsApi::
        pageVisitConversionTags_get(
            
            std::string adAccountId
            , 
            
            std::string bookmark
            , 
            
            int pageSize
            , 
            
            Pinterest.Lib.PaginationOrder order
            
        )
        {
            std::string url = basepath + "/ad_accounts/{ad_account_id}/conversion_tags/page_visit"; //adAccountId 


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




            Page_visit_conversion_tags_get_200_response obj(output_string);


            Response<Page_visit_conversion_tags_get_200_response> response(obj, httpCode);
            return response;
        }



