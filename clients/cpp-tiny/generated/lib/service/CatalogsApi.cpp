#include "CatalogsApi.h"

using namespace Tiny;



        Response<
            CatalogsAvailableFilterValues
        >
        CatalogsApi::
        catalogs_availableFilterValues(
            
            std::string catalogId
            , 
            
            std::string feedId
            , 
            
            Country country
            , 
            
            CatalogsLocale language
            , 
            
            std::string adAccountId
            
        )
        {
            std::string url = basepath + "/catalogs/available_filter_values"; //


            // Headers  | 

            // Query    | catalogId feedId country language adAccountId 
            addQueryParam("catalog_id",catalogId);
            addQueryParam("feed_id",feedId);
            addQueryParam("country",country);
            addQueryParam("language",language);
            addQueryParam("ad_account_id",adAccountId);

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            CatalogsAvailableFilterValues obj(output_string);


            Response<CatalogsAvailableFilterValues> response(obj, httpCode);
            return response;
        }

        Response<
            Catalog
        >
        CatalogsApi::
        catalogs_create(
            
            CatalogCreate catalogCreate
            , 
            
            std::string adAccountId
            
        )
        {
            std::string url = basepath + "/catalogs"; //


            // Headers  | 

            // Query    | adAccountId 
            addQueryParam("ad_account_id",adAccountId);

            // Form     | 
            addHeader("Content-Type", "application/json");





            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | catalogCreate



            payload = catalogCreate.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            Catalog obj(output_string);


            Response<Catalog> response(obj, httpCode);
            return response;
        }

        Response<
            Catalogs_list_200_response
        >
        CatalogsApi::
        catalogs_list(
            
            std::string adAccountId
            , 
            
            std::string bookmark
            , 
            
            int pageSize
            
        )
        {
            std::string url = basepath + "/catalogs"; //


            // Headers  | 

            // Query    | adAccountId bookmark pageSize 
            addQueryParam("ad_account_id",adAccountId);
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




            Catalogs_list_200_response obj(output_string);


            Response<Catalogs_list_200_response> response(obj, httpCode);
            return response;
        }



