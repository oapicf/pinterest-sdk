#include "ProductTagsApi.h"

using namespace Tiny;



        Response<
            ProductTagsResponse
        >
        ProductTagsApi::
        productTags_bulkAdd(
            
            std::string pinId
            , 
            
            ProductTagsBulkAddRequest productTagsBulkAddRequest
            
        )
        {
            std::string url = basepath + "/pins/{pin_id}/product_tags"; //pinId 


            // Headers  | 

            // Query    | 

            // Form     | 
            addHeader("Content-Type", "application/json");



                std::string s_pinId("{");
                s_pinId.append("pin_id");
                s_pinId.append("}");

                int pos = url.find(s_pinId);

                url.erase(pos, s_pinId.length());
                url.insert(pos, stringify(pinId));


            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | productTagsBulkAddRequest



            payload = productTagsBulkAddRequest.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            ProductTagsResponse obj(output_string);


            Response<ProductTagsResponse> response(obj, httpCode);
            return response;
        }

        Response<
            String
        >
        ProductTagsApi::
        productTags_bulkDelete(
            
            std::string pinId
            , 
            
            ProductTagsBulkDeleteRequest productTagsBulkDeleteRequest
            
        )
        {
            std::string url = basepath + "/pins/{pin_id}/product_tags/bulk-delete"; //pinId 


            // Headers  | 

            // Query    | 

            // Form     | 
            addHeader("Content-Type", "application/json");



                std::string s_pinId("{");
                s_pinId.append("pin_id");
                s_pinId.append("}");

                int pos = url.find(s_pinId);

                url.erase(pos, s_pinId.length());
                url.insert(pos, stringify(pinId));


            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | productTagsBulkDeleteRequest



            payload = productTagsBulkDeleteRequest.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            ProductTagsResponse
        >
        ProductTagsApi::
        productTags_list(
            
            std::string pinId
            
        )
        {
            std::string url = basepath + "/pins/{pin_id}/product_tags"; //pinId 


            // Headers  | 

            // Query    | 

            // Form     | 



                std::string s_pinId("{");
                s_pinId.append("pin_id");
                s_pinId.append("}");

                int pos = url.find(s_pinId);

                url.erase(pos, s_pinId.length());
                url.insert(pos, stringify(pinId));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            ProductTagsResponse obj(output_string);


            Response<ProductTagsResponse> response(obj, httpCode);
            return response;
        }



