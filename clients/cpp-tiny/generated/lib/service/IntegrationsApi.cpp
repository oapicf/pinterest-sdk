#include "IntegrationsApi.h"

using namespace Tiny;



        Response<
            String
        >
        IntegrationsApi::
        integrationsCommerce_del(
            
            std::string externalBusinessId
            
        )
        {
            std::string url = basepath + "/integrations/commerce/{external_business_id}"; //externalBusinessId 


            // Headers  | 

            // Query    | 

            // Form     | 



                std::string s_externalBusinessId("{");
                s_externalBusinessId.append("external_business_id");
                s_externalBusinessId.append("}");

                int pos = url.find(s_externalBusinessId);

                url.erase(pos, s_externalBusinessId.length());
                url.insert(pos, stringify(externalBusinessId));


            std::string payload = "";
            // Send Request
            // METHOD | DELETE
            // Body     | 
            int httpCode = sendRequest(url, "DELETE", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            IntegrationMetadata
        >
        IntegrationsApi::
        integrationsCommerce_get(
            
            std::string externalBusinessId
            
        )
        {
            std::string url = basepath + "/integrations/commerce/{external_business_id}"; //externalBusinessId 


            // Headers  | 

            // Query    | 

            // Form     | 



                std::string s_externalBusinessId("{");
                s_externalBusinessId.append("external_business_id");
                s_externalBusinessId.append("}");

                int pos = url.find(s_externalBusinessId);

                url.erase(pos, s_externalBusinessId.length());
                url.insert(pos, stringify(externalBusinessId));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            IntegrationMetadata obj(output_string);


            Response<IntegrationMetadata> response(obj, httpCode);
            return response;
        }

        Response<
            IntegrationMetadata
        >
        IntegrationsApi::
        integrationsCommerce_patch(
            
            std::string externalBusinessId
            , 
            
            IntegrationRequestPatch integrationRequestPatch
            
        )
        {
            std::string url = basepath + "/integrations/commerce/{external_business_id}"; //externalBusinessId 


            // Headers  | 

            // Query    | 

            // Form     | 
            addHeader("Content-Type", "application/json");



                std::string s_externalBusinessId("{");
                s_externalBusinessId.append("external_business_id");
                s_externalBusinessId.append("}");

                int pos = url.find(s_externalBusinessId);

                url.erase(pos, s_externalBusinessId.length());
                url.insert(pos, stringify(externalBusinessId));


            std::string payload = "";
            // Send Request
            // METHOD | PATCH
            // Body     | integrationRequestPatch



            payload = integrationRequestPatch.toJson().dump();

            int httpCode = sendRequest(url, "PATCH", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            IntegrationMetadata obj(output_string);


            Response<IntegrationMetadata> response(obj, httpCode);
            return response;
        }

        Response<
            IntegrationMetadata
        >
        IntegrationsApi::
        integrationsCommerce_post(
            
            IntegrationRequest integrationRequest
            
        )
        {
            std::string url = basepath + "/integrations/commerce"; //


            // Headers  | 

            // Query    | 

            // Form     | 
            addHeader("Content-Type", "application/json");





            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | integrationRequest



            payload = integrationRequest.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            IntegrationMetadata obj(output_string);


            Response<IntegrationMetadata> response(obj, httpCode);
            return response;
        }

        Response<
            IntegrationLogsSuccessResponse
        >
        IntegrationsApi::
        integrationsLogs_post(
            
            IntegrationLogsRequest integrationLogsRequest
            
        )
        {
            std::string url = basepath + "/integrations/logs"; //


            // Headers  | 

            // Query    | 

            // Form     | 
            addHeader("Content-Type", "application/json");





            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | integrationLogsRequest



            payload = integrationLogsRequest.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            IntegrationLogsSuccessResponse obj(output_string);


            Response<IntegrationLogsSuccessResponse> response(obj, httpCode);
            return response;
        }

        Response<
            IntegrationRecord
        >
        IntegrationsApi::
        integrations_getById(
            
            std::string id
            
        )
        {
            std::string url = basepath + "/integrations/{id}"; //id 


            // Headers  | 

            // Query    | 

            // Form     | 



                std::string s_id("{");
                s_id.append("id");
                s_id.append("}");

                int pos = url.find(s_id);

                url.erase(pos, s_id.length());
                url.insert(pos, stringify(id));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            IntegrationRecord obj(output_string);


            Response<IntegrationRecord> response(obj, httpCode);
            return response;
        }

        Response<
            Integrations_get_list_200_response
        >
        IntegrationsApi::
        integrations_getList(
            
            std::string bookmark
            , 
            
            int pageSize
            
        )
        {
            std::string url = basepath + "/integrations"; //


            // Headers  | 

            // Query    | bookmark pageSize 
            addQueryParam("bookmark",bookmark);
            addQueryParam("page_size",pageSize);

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            Integrations_get_list_200_response obj(output_string);


            Response<Integrations_get_list_200_response> response(obj, httpCode);
            return response;
        }



