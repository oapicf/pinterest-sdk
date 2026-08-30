#include "OauthApi.h"

using namespace Tiny;



        Response<
            ConversionAccessToken
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




            ConversionAccessToken obj(output_string);


            Response<ConversionAccessToken> response(obj, httpCode);
            return response;
        }

        Response<
            OauthAccessToken
        >
        OauthApi::
        oauth_token(
            
            TokenGrantType grantType
            , 
            
            std::string code
            , 
            
            std::string continuousRefresh
            , 
            
            std::string redirectUri
            , 
            
            std::string refreshToken
            , 
            
            std::string scope
            
        )
        {
            std::string url = basepath + "/oauth/token"; //


            // Headers  | 

            // Query    | 

            // Form     | code continuousRefresh grantType redirectUri refreshToken scope 
            addHeader("Content-Type", "application/x-www-form-urlencoded");

            addFormParam("code",code);
            addFormParam("continuous_refresh",continuousRefresh);
            addFormParam("grant_type",grantType);
            addFormParam("redirect_uri",redirectUri);
            addFormParam("refresh_token",refreshToken);
            addFormParam("scope",scope);




            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | 
            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            OauthAccessToken obj(output_string);


            Response<OauthAccessToken> response(obj, httpCode);
            return response;
        }

        Response<
            String
        >
        OauthApi::
        token_revoke(
            
            std::string token
            , 
            
            TokenTypeHint tokenTypeHint
            
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



