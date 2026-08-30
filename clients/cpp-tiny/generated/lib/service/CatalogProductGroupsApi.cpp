#include "CatalogProductGroupsApi.h"

using namespace Tiny;



        Response<
            Catalogs_product_group_pins_list_200_response
        >
        CatalogProductGroupsApi::
        catalogsProductGroupPins_list(
            
            std::string productGroupId
            , 
            
            std::string adAccountId
            , 
            
            bool pinMetrics
            , 
            
            std::string bookmark
            , 
            
            int pageSize
            
        )
        {
            std::string url = basepath + "/catalogs/product_groups/{product_group_id}/products"; //productGroupId 


            // Headers  | 

            // Query    | adAccountId pinMetrics bookmark pageSize 
            addQueryParam("ad_account_id",adAccountId);
            addQueryParam("pin_metrics",pinMetrics);
            addQueryParam("bookmark",bookmark);
            addQueryParam("page_size",pageSize);

            // Form     | 



                std::string s_productGroupId("{");
                s_productGroupId.append("product_group_id");
                s_productGroupId.append("}");

                int pos = url.find(s_productGroupId);

                url.erase(pos, s_productGroupId.length());
                url.insert(pos, stringify(productGroupId));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            Catalogs_product_group_pins_list_200_response obj(output_string);


            Response<Catalogs_product_group_pins_list_200_response> response(obj, httpCode);
            return response;
        }

        Response<
            CatalogsVerticalProductGroup
        >
        CatalogProductGroupsApi::
        catalogsProductGroups_create(
            
            CatalogsProductGroupsCreateRequestSchema catalogsProductGroupsCreateRequestSchema
            , 
            
            std::string adAccountId
            
        )
        {
            std::string url = basepath + "/catalogs/product_groups"; //


            // Headers  | 

            // Query    | adAccountId 
            addQueryParam("ad_account_id",adAccountId);

            // Form     | 
            addHeader("Content-Type", "application/json");





            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | catalogsProductGroupsCreateRequestSchema



            payload = catalogsProductGroupsCreateRequestSchema.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            CatalogsVerticalProductGroup obj(output_string);


            Response<CatalogsVerticalProductGroup> response(obj, httpCode);
            return response;
        }

        Response<
            std::list<std::string>
        >
        CatalogProductGroupsApi::
        catalogsProductGroups_createMany(
            std::list<CatalogsProductGroupsCreateManyRequestItems> catalogsProductGroupsCreateManyRequestItems
            
            , 
            
            std::string adAccountId
            
        )
        {
            std::string url = basepath + "/catalogs/product_groups/multiple"; //


            // Headers  | 

            // Query    | adAccountId 
            addQueryParam("ad_account_id",adAccountId);

            // Form     | 
            addHeader("Content-Type", "application/json");





            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | catalogsProductGroupsCreateManyRequestItems


            bourne::json tmp_arr = bourne::json::array();
            for(auto& var : catalogsProductGroupsCreateManyRequestItems)
            {
                auto tmp = var.toJson();
                tmp_arr.append(tmp);

            }
            payload = tmp_arr.dump();


            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();



            std::list<std::string> obj = std::list<std::string>();
            bourne::json jsonPayload(output_string);








            
            for(auto& var : jsonPayload.array_range())
            {
                std::string tmp(var.dump());
                obj.push_back(tmp);
            }
            







            Response<std::list<std::string>> response(obj, httpCode);
            return response;
        }

        Response<
            CatalogsVerticalProductGroup
        >
        CatalogProductGroupsApi::
        catalogsProductGroups_delete(
            
            std::string productGroupId
            , 
            
            std::string adAccountId
            
        )
        {
            std::string url = basepath + "/catalogs/product_groups/{product_group_id}"; //productGroupId 


            // Headers  | 

            // Query    | adAccountId 
            addQueryParam("ad_account_id",adAccountId);

            // Form     | 



                std::string s_productGroupId("{");
                s_productGroupId.append("product_group_id");
                s_productGroupId.append("}");

                int pos = url.find(s_productGroupId);

                url.erase(pos, s_productGroupId.length());
                url.insert(pos, stringify(productGroupId));


            std::string payload = "";
            // Send Request
            // METHOD | DELETE
            // Body     | 
            int httpCode = sendRequest(url, "DELETE", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            CatalogsVerticalProductGroup obj(output_string);


            Response<CatalogsVerticalProductGroup> response(obj, httpCode);
            return response;
        }

        Response<
            String
        >
        CatalogProductGroupsApi::
        catalogsProductGroups_deleteMany(
            std::list<int> id
            
            , 
            
            std::string adAccountId
            
        )
        {
            std::string url = basepath + "/catalogs/product_groups/multiple"; //


            // Headers  | 

            // Query    | id adAccountId 
            for (auto &x : id){
                addQueryParam("id", std::string(x));
            }
            addQueryParam("ad_account_id",adAccountId);

            // Form     | 





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
            CatalogsVerticalProductGroup
        >
        CatalogProductGroupsApi::
        catalogsProductGroups_get(
            
            std::string productGroupId
            , 
            
            std::string adAccountId
            
        )
        {
            std::string url = basepath + "/catalogs/product_groups/{product_group_id}"; //productGroupId 


            // Headers  | 

            // Query    | adAccountId 
            addQueryParam("ad_account_id",adAccountId);

            // Form     | 



                std::string s_productGroupId("{");
                s_productGroupId.append("product_group_id");
                s_productGroupId.append("}");

                int pos = url.find(s_productGroupId);

                url.erase(pos, s_productGroupId.length());
                url.insert(pos, stringify(productGroupId));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            CatalogsVerticalProductGroup obj(output_string);


            Response<CatalogsVerticalProductGroup> response(obj, httpCode);
            return response;
        }

        Response<
            Catalogs_product_groups_list_200_response
        >
        CatalogProductGroupsApi::
        catalogsProductGroups_list(
            std::list<int> id
            
            , 
            
            std::string feedId
            , 
            
            std::string catalogId
            , 
            
            std::string adAccountId
            , 
            
            std::string bookmark
            , 
            
            int pageSize
            
        )
        {
            std::string url = basepath + "/catalogs/product_groups"; //


            // Headers  | 

            // Query    | id feedId catalogId adAccountId bookmark pageSize 
            for (auto &x : id){
                addQueryParam("id", std::string(x));
            }
            addQueryParam("feed_id",feedId);
            addQueryParam("catalog_id",catalogId);
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




            Catalogs_product_groups_list_200_response obj(output_string);


            Response<Catalogs_product_groups_list_200_response> response(obj, httpCode);
            return response;
        }

        Response<
            CatalogsProductGroupProductCountsVertical
        >
        CatalogProductGroupsApi::
        catalogsProductGroups_productCountsGet(
            
            std::string productGroupId
            , 
            
            std::string adAccountId
            
        )
        {
            std::string url = basepath + "/catalogs/product_groups/{product_group_id}/product_counts"; //productGroupId 


            // Headers  | 

            // Query    | adAccountId 
            addQueryParam("ad_account_id",adAccountId);

            // Form     | 



                std::string s_productGroupId("{");
                s_productGroupId.append("product_group_id");
                s_productGroupId.append("}");

                int pos = url.find(s_productGroupId);

                url.erase(pos, s_productGroupId.length());
                url.insert(pos, stringify(productGroupId));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            CatalogsProductGroupProductCountsVertical obj(output_string);


            Response<CatalogsProductGroupProductCountsVertical> response(obj, httpCode);
            return response;
        }

        Response<
            CatalogsVerticalProductGroup
        >
        CatalogProductGroupsApi::
        catalogsProductGroups_update(
            
            std::string productGroupId
            , 
            
            CatalogsProductGroupsUpdateRequestSchema catalogsProductGroupsUpdateRequestSchema
            , 
            
            std::string adAccountId
            
        )
        {
            std::string url = basepath + "/catalogs/product_groups/{product_group_id}"; //productGroupId 


            // Headers  | 

            // Query    | adAccountId 
            addQueryParam("ad_account_id",adAccountId);

            // Form     | 
            addHeader("Content-Type", "application/json");



                std::string s_productGroupId("{");
                s_productGroupId.append("product_group_id");
                s_productGroupId.append("}");

                int pos = url.find(s_productGroupId);

                url.erase(pos, s_productGroupId.length());
                url.insert(pos, stringify(productGroupId));


            std::string payload = "";
            // Send Request
            // METHOD | PATCH
            // Body     | catalogsProductGroupsUpdateRequestSchema



            payload = catalogsProductGroupsUpdateRequestSchema.toJson().dump();

            int httpCode = sendRequest(url, "PATCH", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            CatalogsVerticalProductGroup obj(output_string);


            Response<CatalogsVerticalProductGroup> response(obj, httpCode);
            return response;
        }

        Response<
            Catalogs_product_group_pins_list_200_response
        >
        CatalogProductGroupsApi::
        productsByProductGroupFilter_list(
            
            CatalogsListProductsByFilterRequest catalogsListProductsByFilterRequest
            , 
            
            std::string bookmark
            , 
            
            int pageSize
            , 
            
            std::string adAccountId
            , 
            
            bool pinMetrics
            
        )
        {
            std::string url = basepath + "/catalogs/products/get_by_product_group_filters"; //


            // Headers  | 

            // Query    | bookmark pageSize adAccountId pinMetrics 
            addQueryParam("bookmark",bookmark);
            addQueryParam("page_size",pageSize);
            addQueryParam("ad_account_id",adAccountId);
            addQueryParam("pin_metrics",pinMetrics);

            // Form     | 
            addHeader("Content-Type", "application/json");





            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | catalogsListProductsByFilterRequest



            payload = catalogsListProductsByFilterRequest.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            Catalogs_product_group_pins_list_200_response obj(output_string);


            Response<Catalogs_product_group_pins_list_200_response> response(obj, httpCode);
            return response;
        }



