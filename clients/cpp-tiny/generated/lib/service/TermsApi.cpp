#include "TermsApi.h"

using namespace Tiny;



        Response<
            RelatedTerms
        >
        TermsApi::
        termsRelated_list(
            std::list<std::string> terms
            
            
        )
        {
            std::string url = basepath + "/terms/related"; //


            // Headers  | 

            // Query    | terms 
            for (auto &x : terms){
                addQueryParam("terms", std::string(x));
            }

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            RelatedTerms obj(output_string);


            Response<RelatedTerms> response(obj, httpCode);
            return response;
        }

        Response<
            std::list<std::string>
        >
        TermsApi::
        termsSuggested_list(
            
            std::string term
            , 
            
            int limit
            
        )
        {
            std::string url = basepath + "/terms/suggested"; //


            // Headers  | 

            // Query    | term limit 
            addQueryParam("term",term);
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



            std::list<std::string> obj = std::list<std::string>();
            bourne::json jsonPayload(output_string);








            
            for(auto& var : jsonPayload.array_range())
            {
                std::string tmp(var.dump());
                obj.push_back(tmp);
            }
            







            Response<std::list<std::string>> response(obj, httpCode);
            return response;
        }



