#include "ResourcesApi.h"

using namespace Tiny;



        Response<
            AdAccountsCountryResponse
        >
        ResourcesApi::
        adAccountCountries_get(
        )
        {
            std::string url = basepath + "/resources/ad_account_countries"; //


            // Headers  | 

            // Query    | 

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            AdAccountsCountryResponse obj(output_string);


            Response<AdAccountsCountryResponse> response(obj, httpCode);
            return response;
        }

        Response<
            DeliveryMetricsResponse
        >
        ResourcesApi::
        deliveryMetrics_get(
            
            std::string reportType
            
        )
        {
            std::string url = basepath + "/resources/delivery_metrics"; //


            // Headers  | 

            // Query    | reportType 
            addQueryParam("report_type",reportType);

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            DeliveryMetricsResponse obj(output_string);


            Response<DeliveryMetricsResponse> response(obj, httpCode);
            return response;
        }

        Response<
            SingleInterestTargetingOptionResponse
        >
        ResourcesApi::
        interestTargetingOptions_get(
            
            std::string interestId
            
        )
        {
            std::string url = basepath + "/resources/targeting/interests/{interest_id}"; //interestId 


            // Headers  | 

            // Query    | 

            // Form     | 



                std::string s_interestId("{");
                s_interestId.append("interest_id");
                s_interestId.append("}");

                int pos = url.find(s_interestId);

                url.erase(pos, s_interestId.length());
                url.insert(pos, stringify(interestId));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            SingleInterestTargetingOptionResponse obj(output_string);


            Response<SingleInterestTargetingOptionResponse> response(obj, httpCode);
            return response;
        }

        Response<
            String
        >
        ResourcesApi::
        leadFormQuestions_get(
        )
        {
            std::string url = basepath + "/resources/lead_form_questions"; //


            // Headers  | 

            // Query    | 

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            BookClosedResponse
        >
        ResourcesApi::
        metricsReadyState_get(
            
            std::string date
            
        )
        {
            std::string url = basepath + "/resources/metrics_ready_state"; //


            // Headers  | 

            // Query    | date 
            addQueryParam("date",date);

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            BookClosedResponse obj(output_string);


            Response<BookClosedResponse> response(obj, httpCode);
            return response;
        }

        Response<
            std::list<Object>
        >
        ResourcesApi::
        targetingOptions_get(
            
            std::string targetingType
            , 
            
            std::string clientId
            , 
            
            std::string oauthSignature
            , 
            
            std::string timestamp
            , 
            
            std::string adAccountId
            
        )
        {
            std::string url = basepath + "/resources/targeting/{targeting_type}"; //targetingType 


            // Headers  | 

            // Query    | clientId oauthSignature timestamp adAccountId 
            addQueryParam("client_id",clientId);
            addQueryParam("oauth_signature",oauthSignature);
            addQueryParam("timestamp",timestamp);
            addQueryParam("ad_account_id",adAccountId);

            // Form     | 



                std::string s_targetingType("{");
                s_targetingType.append("targeting_type");
                s_targetingType.append("}");

                int pos = url.find(s_targetingType);

                url.erase(pos, s_targetingType.length());
                url.insert(pos, stringify(targetingType));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();



            std::list<Object> obj = std::list<Object>();
            bourne::json jsonPayload(output_string);








            
            for(auto& var : jsonPayload.array_range())
            {
                Object tmp(var.dump());
                obj.push_back(tmp);
            }
            







            Response<std::list<Object>> response(obj, httpCode);
            return response;
        }



