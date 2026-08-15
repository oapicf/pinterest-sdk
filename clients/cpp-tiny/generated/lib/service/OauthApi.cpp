#include "OauthApi.h"

using namespace Tiny;



        Response<
            ConversionAccessTokenResponse
        >
        OauthApi::
        oauth_conversionToken(
        )
        {
            std::string url = basepath + "/oauth/conversion_token"; //


            // Headers  | 

            // Query    | 

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | 
            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            ConversionAccessTokenResponse obj(output_string);


            Response<ConversionAccessTokenResponse> response(obj, httpCode);
            return response;
        }

        Response<
            OauthAccessTokenResponse
        >
        OauthApi::
        oauth_token(
            
            std::string grantType
            
        )
        {
            std::string url = basepath + "/oauth/token"; //


            // Headers  | 

            // Query    | 

            // Form     | grantType 
            addHeader("Content-Type", "application/x-www-form-urlencoded");

            addFormParam("grant_type",grantType);




            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | 
            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            OauthAccessTokenResponse obj(output_string);


            Response<OauthAccessTokenResponse> response(obj, httpCode);
            return response;
        }

        Response<
            String
        >
        OauthApi::
        token_revoke(
            
            std::string token
            , 
            
            std::string tokenTypeHint
            
        )
        {
            std::string url = basepath + "/oauth/token/revoke"; //


            // Headers  | 

            // Query    | 

            // Form     | token tokenTypeHint 
            addHeader("Content-Type", "application/x-www-form-urlencoded");

            addFormParam("token",token);
            addFormParam("token_type_hint",tokenTypeHint);




            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | 
            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }



