#include "TermsOfServiceApi.h"

using namespace Tiny;



        Response<
            TermsOfService
        >
        TermsOfServiceApi::
        termsOfService_get(
            
            std::string adAccountId
            , 
            
            bool includeHtml
            , 
            
            std::string tosType
            
        )
        {
            std::string url = basepath + "/ad_accounts/{ad_account_id}/terms_of_service"; //adAccountId 


            // Headers  | 

            // Query    | includeHtml tosType 
            addQueryParam("include_html",includeHtml);
            addQueryParam("tos_type",tosType);

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




            TermsOfService obj(output_string);


            Response<TermsOfService> response(obj, httpCode);
            return response;
        }



