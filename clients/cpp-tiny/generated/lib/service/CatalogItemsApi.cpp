#include "CatalogItemsApi.h"

using namespace Tiny;



        Response<
            CatalogsItemsBatch
        >
        CatalogItemsApi::
        itemsBatch_get(
            
            std::string batchId
            , 
            
            std::string adAccountId
            
        )
        {
            std::string url = basepath + "/catalogs/items/batch/{batch_id}"; //batchId 


            // Headers  | 

            // Query    | adAccountId 
            addQueryParam("ad_account_id",adAccountId);

            // Form     | 



                std::string s_batchId("{");
                s_batchId.append("batch_id");
                s_batchId.append("}");

                int pos = url.find(s_batchId);

                url.erase(pos, s_batchId.length());
                url.insert(pos, stringify(batchId));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            CatalogsItemsBatch obj(output_string);


            Response<CatalogsItemsBatch> response(obj, httpCode);
            return response;
        }

        Response<
            CatalogsItemsBatch
        >
        CatalogItemsApi::
        itemsBatch_post(
            
            Items_batch_post_request itemsBatchPostRequest
            , 
            
            std::string adAccountId
            
        )
        {
            std::string url = basepath + "/catalogs/items/batch"; //


            // Headers  | 

            // Query    | adAccountId 
            addQueryParam("ad_account_id",adAccountId);

            // Form     | 
            addHeader("Content-Type", "application/json");





            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | itemsBatchPostRequest



            payload = itemsBatchPostRequest.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            CatalogsItemsBatch obj(output_string);


            Response<CatalogsItemsBatch> response(obj, httpCode);
            return response;
        }

        Response<
            CatalogsItems
        >
        CatalogItemsApi::
        items_post(
            
            CatalogsItemsRequest catalogsItemsRequest
            , 
            
            std::string adAccountId
            
        )
        {
            std::string url = basepath + "/catalogs/items"; //


            // Headers  | 

            // Query    | adAccountId 
            addQueryParam("ad_account_id",adAccountId);

            // Form     | 
            addHeader("Content-Type", "application/json");





            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | catalogsItemsRequest



            payload = catalogsItemsRequest.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            CatalogsItems obj(output_string);


            Response<CatalogsItems> response(obj, httpCode);
            return response;
        }



