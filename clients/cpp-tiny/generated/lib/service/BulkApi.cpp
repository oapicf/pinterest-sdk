#include "BulkApi.h"

using namespace Tiny;



        Response<
            BulkDownload
        >
        BulkApi::
        bulkDownload_create(
            
            std::string adAccountId
            , 
            
            BulkDownloadCreate bulkDownloadCreate
            
        )
        {
            std::string url = basepath + "/ad_accounts/{ad_account_id}/bulk/download"; //adAccountId 


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
            // Body     | bulkDownloadCreate



            payload = bulkDownloadCreate.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            BulkDownload obj(output_string);


            Response<BulkDownload> response(obj, httpCode);
            return response;
        }

        Response<
            BulkJobData
        >
        BulkApi::
        bulkRequest_get(
            
            std::string adAccountId
            , 
            
            std::string bulkRequestId
            , 
            
            bool includeDetails
            
        )
        {
            std::string url = basepath + "/ad_accounts/{ad_account_id}/bulk/{bulk_request_id}"; //adAccountId bulkRequestId 


            // Headers  | 

            // Query    | includeDetails 
            addQueryParam("include_details",includeDetails);

            // Form     | 



                std::string s_adAccountId("{");
                s_adAccountId.append("ad_account_id");
                s_adAccountId.append("}");

                int pos = url.find(s_adAccountId);

                url.erase(pos, s_adAccountId.length());
                url.insert(pos, stringify(adAccountId));
                std::string s_bulkRequestId("{");
                s_bulkRequestId.append("bulk_request_id");
                s_bulkRequestId.append("}");

                int pos = url.find(s_bulkRequestId);

                url.erase(pos, s_bulkRequestId.length());
                url.insert(pos, stringify(bulkRequestId));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            BulkJobData obj(output_string);


            Response<BulkJobData> response(obj, httpCode);
            return response;
        }

        Response<
            BulkUpsertResponse
        >
        BulkApi::
        bulkUpsert_create(
            
            std::string adAccountId
            , 
            
            BulkUpsertRequest bulkUpsertRequest
            
        )
        {
            std::string url = basepath + "/ad_accounts/{ad_account_id}/bulk/upsert"; //adAccountId 


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
            // Body     | bulkUpsertRequest



            payload = bulkUpsertRequest.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            BulkUpsertResponse obj(output_string);


            Response<BulkUpsertResponse> response(obj, httpCode);
            return response;
        }



