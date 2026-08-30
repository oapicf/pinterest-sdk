#include "LeadsExportApi.h"

using namespace Tiny;



        Response<
            LeadsExports
        >
        LeadsExportApi::
        leadsExport_create(
            
            std::string adAccountId
            , 
            
            LeadsExportsCreate leadsExportsCreate
            
        )
        {
            std::string url = basepath + "/ad_accounts/{ad_account_id}/leads_export"; //adAccountId 


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
            // Body     | leadsExportsCreate



            payload = leadsExportsCreate.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            LeadsExports obj(output_string);


            Response<LeadsExports> response(obj, httpCode);
            return response;
        }

        Response<
            LeadsExportResponseData
        >
        LeadsExportApi::
        leadsExport_get(
            
            std::string adAccountId
            , 
            
            std::string leadsExportId
            
        )
        {
            std::string url = basepath + "/ad_accounts/{ad_account_id}/leads_export/{leads_export_id}"; //adAccountId leadsExportId 


            // Headers  | 

            // Query    | 

            // Form     | 



                std::string s_adAccountId("{");
                s_adAccountId.append("ad_account_id");
                s_adAccountId.append("}");

                int pos = url.find(s_adAccountId);

                url.erase(pos, s_adAccountId.length());
                url.insert(pos, stringify(adAccountId));
                std::string s_leadsExportId("{");
                s_leadsExportId.append("leads_export_id");
                s_leadsExportId.append("}");

                int pos = url.find(s_leadsExportId);

                url.erase(pos, s_leadsExportId.length());
                url.insert(pos, stringify(leadsExportId));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            LeadsExportResponseData obj(output_string);


            Response<LeadsExportResponseData> response(obj, httpCode);
            return response;
        }



