#include "ConversionsApi.h"

using namespace Tiny;



        Response<
            Advertiser_defined_events_create_200_response
        >
        ConversionsApi::
        advertiserDefinedEvents_create(
            
            std::string adAccountId
            , 
            
            AdvertiserDefinedEventsCreateRequest advertiserDefinedEventsCreateRequest
            
        )
        {
            std::string url = basepath + "/ad_accounts/{ad_account_id}/advertiser_defined_events"; //adAccountId 


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
            // Body     | advertiserDefinedEventsCreateRequest



            payload = advertiserDefinedEventsCreateRequest.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            Advertiser_defined_events_create_200_response obj(output_string);


            Response<Advertiser_defined_events_create_200_response> response(obj, httpCode);
            return response;
        }

        Response<
            Advertiser_defined_events_create_200_response
        >
        ConversionsApi::
        advertiserDefinedEvents_delete(
            
            std::string adAccountId
            , 
            std::list<std::string> eventNames
            
            
        )
        {
            std::string url = basepath + "/ad_accounts/{ad_account_id}/advertiser_defined_events"; //adAccountId 


            // Headers  | 

            // Query    | eventNames 
            for (auto &x : eventNames){
                addQueryParam("event_names", std::string(x));
            }

            // Form     | 



                std::string s_adAccountId("{");
                s_adAccountId.append("ad_account_id");
                s_adAccountId.append("}");

                int pos = url.find(s_adAccountId);

                url.erase(pos, s_adAccountId.length());
                url.insert(pos, stringify(adAccountId));


            std::string payload = "";
            // Send Request
            // METHOD | DELETE
            // Body     | 
            int httpCode = sendRequest(url, "DELETE", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            Advertiser_defined_events_create_200_response obj(output_string);


            Response<Advertiser_defined_events_create_200_response> response(obj, httpCode);
            return response;
        }

        Response<
            Advertiser_defined_events_get_200_response
        >
        ConversionsApi::
        advertiserDefinedEvents_get(
            
            std::string adAccountId
            
        )
        {
            std::string url = basepath + "/ad_accounts/{ad_account_id}/advertiser_defined_events"; //adAccountId 


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




            Advertiser_defined_events_get_200_response obj(output_string);


            Response<Advertiser_defined_events_get_200_response> response(obj, httpCode);
            return response;
        }

        Response<
            Advertiser_defined_events_create_200_response
        >
        ConversionsApi::
        advertiserDefinedEvents_update(
            
            std::string adAccountId
            , 
            
            AdvertiserDefinedEventsCreateRequest advertiserDefinedEventsCreateRequest
            
        )
        {
            std::string url = basepath + "/ad_accounts/{ad_account_id}/advertiser_defined_events"; //adAccountId 


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
            // Body     | advertiserDefinedEventsCreateRequest



            payload = advertiserDefinedEventsCreateRequest.toJson().dump();

            int httpCode = sendRequest(url, "PATCH", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            Advertiser_defined_events_create_200_response obj(output_string);


            Response<Advertiser_defined_events_create_200_response> response(obj, httpCode);
            return response;
        }



