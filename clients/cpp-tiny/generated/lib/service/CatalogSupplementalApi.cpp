#include "CatalogSupplementalApi.h"

using namespace Tiny;



        Response<
            SupplementalItemsBatchResponse
        >
        CatalogSupplementalApi::
        catalogsLocalInventoryItemsBatch_operate(
            
            std::string catalogId
            , 
            
            LocalInventoryItemsBatchCreate localInventoryItemsBatchCreate
            , 
            
            std::string adAccountId
            
        )
        {
            std::string url = basepath + "/catalogs/{catalog_id}/local_inventory_items/batch"; //catalogId 


            // Headers  | 

            // Query    | adAccountId 
            addQueryParam("ad_account_id",adAccountId);

            // Form     | 
            addHeader("Content-Type", "application/json");



                std::string s_catalogId("{");
                s_catalogId.append("catalog_id");
                s_catalogId.append("}");

                int pos = url.find(s_catalogId);

                url.erase(pos, s_catalogId.length());
                url.insert(pos, stringify(catalogId));


            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | localInventoryItemsBatchCreate



            payload = localInventoryItemsBatchCreate.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            SupplementalItemsBatchResponse obj(output_string);


            Response<SupplementalItemsBatchResponse> response(obj, httpCode);
            return response;
        }

        Response<
            LocalInventoryItemsGet
        >
        CatalogSupplementalApi::
        catalogsLocalInventoryItems_post(
            
            std::string catalogId
            , 
            
            LocalInventoryItemsGetCreate localInventoryItemsGetCreate
            , 
            
            std::string adAccountId
            
        )
        {
            std::string url = basepath + "/catalogs/{catalog_id}/local_inventory_items/query"; //catalogId 


            // Headers  | 

            // Query    | adAccountId 
            addQueryParam("ad_account_id",adAccountId);

            // Form     | 
            addHeader("Content-Type", "application/json");



                std::string s_catalogId("{");
                s_catalogId.append("catalog_id");
                s_catalogId.append("}");

                int pos = url.find(s_catalogId);

                url.erase(pos, s_catalogId.length());
                url.insert(pos, stringify(catalogId));


            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | localInventoryItemsGetCreate



            payload = localInventoryItemsGetCreate.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            LocalInventoryItemsGet obj(output_string);


            Response<LocalInventoryItemsGet> response(obj, httpCode);
            return response;
        }

        Response<
            std::list<Catalogs_local_stores_create_200_response_inner>
        >
        CatalogSupplementalApi::
        catalogsLocalStores_create(
            
            std::string catalogId
            , 
            std::list<LocalStoreCreate> localStoreCreate
            
            , 
            
            std::string adAccountId
            
        )
        {
            std::string url = basepath + "/catalogs/{catalog_id}/local_stores"; //catalogId 


            // Headers  | 

            // Query    | adAccountId 
            addQueryParam("ad_account_id",adAccountId);

            // Form     | 
            addHeader("Content-Type", "application/json");



                std::string s_catalogId("{");
                s_catalogId.append("catalog_id");
                s_catalogId.append("}");

                int pos = url.find(s_catalogId);

                url.erase(pos, s_catalogId.length());
                url.insert(pos, stringify(catalogId));


            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | localStoreCreate


            bourne::json tmp_arr = bourne::json::array();
            for(auto& var : localStoreCreate)
            {
                auto tmp = var.toJson();
                tmp_arr.append(tmp);

            }
            payload = tmp_arr.dump();


            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();



            std::list<Catalogs_local_stores_create_200_response_inner> obj = std::list<Catalogs_local_stores_create_200_response_inner>();
            bourne::json jsonPayload(output_string);








            
            for(auto& var : jsonPayload.array_range())
            {
                Catalogs_local_stores_create_200_response_inner tmp(var.dump());
                obj.push_back(tmp);
            }
            







            Response<std::list<Catalogs_local_stores_create_200_response_inner>> response(obj, httpCode);
            return response;
        }

        Response<
            std::list<Catalogs_local_stores_delete_200_response_inner>
        >
        CatalogSupplementalApi::
        catalogsLocalStores_delete(
            
            std::string catalogId
            , 
            std::list<std::string> ids
            
            , 
            
            std::string adAccountId
            
        )
        {
            std::string url = basepath + "/catalogs/{catalog_id}/local_stores"; //catalogId 


            // Headers  | 

            // Query    | ids adAccountId 
            for (auto &x : ids){
                addQueryParam("ids", std::string(x));
            }
            addQueryParam("ad_account_id",adAccountId);

            // Form     | 



                std::string s_catalogId("{");
                s_catalogId.append("catalog_id");
                s_catalogId.append("}");

                int pos = url.find(s_catalogId);

                url.erase(pos, s_catalogId.length());
                url.insert(pos, stringify(catalogId));


            std::string payload = "";
            // Send Request
            // METHOD | DELETE
            // Body     | 
            int httpCode = sendRequest(url, "DELETE", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();



            std::list<Catalogs_local_stores_delete_200_response_inner> obj = std::list<Catalogs_local_stores_delete_200_response_inner>();
            bourne::json jsonPayload(output_string);








            
            for(auto& var : jsonPayload.array_range())
            {
                Catalogs_local_stores_delete_200_response_inner tmp(var.dump());
                obj.push_back(tmp);
            }
            







            Response<std::list<Catalogs_local_stores_delete_200_response_inner>> response(obj, httpCode);
            return response;
        }

        Response<
            Catalogs_local_stores_list_200_response
        >
        CatalogSupplementalApi::
        catalogsLocalStores_list(
            
            std::string catalogId
            , 
            std::list<std::string> ids
            
            , 
            
            std::string adAccountId
            , 
            
            std::string bookmark
            , 
            
            int pageSize
            
        )
        {
            std::string url = basepath + "/catalogs/{catalog_id}/local_stores"; //catalogId 


            // Headers  | 

            // Query    | ids adAccountId bookmark pageSize 
            for (auto &x : ids){
                addQueryParam("ids", std::string(x));
            }
            addQueryParam("ad_account_id",adAccountId);
            addQueryParam("bookmark",bookmark);
            addQueryParam("page_size",pageSize);

            // Form     | 



                std::string s_catalogId("{");
                s_catalogId.append("catalog_id");
                s_catalogId.append("}");

                int pos = url.find(s_catalogId);

                url.erase(pos, s_catalogId.length());
                url.insert(pos, stringify(catalogId));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            Catalogs_local_stores_list_200_response obj(output_string);


            Response<Catalogs_local_stores_list_200_response> response(obj, httpCode);
            return response;
        }

        Response<
            std::list<Catalogs_local_stores_create_200_response_inner>
        >
        CatalogSupplementalApi::
        catalogsLocalStores_update(
            
            std::string catalogId
            , 
            std::list<LocalStoreBatchUpdate> localStoreBatchUpdate
            
            , 
            
            std::string adAccountId
            
        )
        {
            std::string url = basepath + "/catalogs/{catalog_id}/local_stores"; //catalogId 


            // Headers  | 

            // Query    | adAccountId 
            addQueryParam("ad_account_id",adAccountId);

            // Form     | 
            addHeader("Content-Type", "application/json");



                std::string s_catalogId("{");
                s_catalogId.append("catalog_id");
                s_catalogId.append("}");

                int pos = url.find(s_catalogId);

                url.erase(pos, s_catalogId.length());
                url.insert(pos, stringify(catalogId));


            std::string payload = "";
            // Send Request
            // METHOD | PATCH
            // Body     | localStoreBatchUpdate


            bourne::json tmp_arr = bourne::json::array();
            for(auto& var : localStoreBatchUpdate)
            {
                auto tmp = var.toJson();
                tmp_arr.append(tmp);

            }
            payload = tmp_arr.dump();


            int httpCode = sendRequest(url, "PATCH", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();



            std::list<Catalogs_local_stores_create_200_response_inner> obj = std::list<Catalogs_local_stores_create_200_response_inner>();
            bourne::json jsonPayload(output_string);








            
            for(auto& var : jsonPayload.array_range())
            {
                Catalogs_local_stores_create_200_response_inner tmp(var.dump());
                obj.push_back(tmp);
            }
            







            Response<std::list<Catalogs_local_stores_create_200_response_inner>> response(obj, httpCode);
            return response;
        }

        Response<
            SupplementalItemsBatchResponse
        >
        CatalogSupplementalApi::
        catalogsSupplementalItemsBatch_get(
            
            std::string catalogId
            , 
            
            std::string batchId
            , 
            
            std::string adAccountId
            
        )
        {
            std::string url = basepath + "/catalogs/{catalog_id}/supplemental_items/batch/{batch_id}"; //catalogId batchId 


            // Headers  | 

            // Query    | adAccountId 
            addQueryParam("ad_account_id",adAccountId);

            // Form     | 



                std::string s_catalogId("{");
                s_catalogId.append("catalog_id");
                s_catalogId.append("}");

                int pos = url.find(s_catalogId);

                url.erase(pos, s_catalogId.length());
                url.insert(pos, stringify(catalogId));
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




            SupplementalItemsBatchResponse obj(output_string);


            Response<SupplementalItemsBatchResponse> response(obj, httpCode);
            return response;
        }



