#include "CatalogReportsApi.h"

using namespace Tiny;



        Response<
            CatalogsCreateReportResponse
        >
        CatalogReportsApi::
        reports_create(
            
            CatalogsReportParameters catalogsReportParameters
            , 
            
            std::string adAccountId
            
        )
        {
            std::string url = basepath + "/catalogs/reports"; //


            // Headers  | 

            // Query    | adAccountId 
            addQueryParam("ad_account_id",adAccountId);

            // Form     | 
            addHeader("Content-Type", "application/json");





            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | catalogsReportParameters



            payload = catalogsReportParameters.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            CatalogsCreateReportResponse obj(output_string);


            Response<CatalogsCreateReportResponse> response(obj, httpCode);
            return response;
        }

        Response<
            CatalogsReport
        >
        CatalogReportsApi::
        reports_get(
            
            std::string token
            , 
            
            std::string adAccountId
            
        )
        {
            std::string url = basepath + "/catalogs/reports"; //


            // Headers  | 

            // Query    | adAccountId token 
            addQueryParam("ad_account_id",adAccountId);
            addQueryParam("token",token);

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            CatalogsReport obj(output_string);


            Response<CatalogsReport> response(obj, httpCode);
            return response;
        }

        Response<
            Reports_stats_200_response
        >
        CatalogReportsApi::
        reports_stats(
            // TODO: Implement Maps
            CatalogsReportStatsParameters parameters
            , 
            
            std::string adAccountId
            , 
            
            std::string bookmark
            , 
            
            int pageSize
            
        )
        {
            std::string url = basepath + "/catalogs/reports/stats"; //


            // Headers  | 

            // Query    | adAccountId parameters bookmark pageSize 
            addQueryParam("ad_account_id",adAccountId);
            addQueryParam("parameters",parameters);
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




            Reports_stats_200_response obj(output_string);


            Response<Reports_stats_200_response> response(obj, httpCode);
            return response;
        }



