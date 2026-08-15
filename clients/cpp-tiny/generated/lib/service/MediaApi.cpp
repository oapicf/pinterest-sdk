#include "MediaApi.h"

using namespace Tiny;



        Response<
            MediaUpload
        >
        MediaApi::
        media_create(
            
            MediaUploadCreate mediaUploadCreate
            
        )
        {
            std::string url = basepath + "/media"; //


            // Headers  | 

            // Query    | 

            // Form     | 
            addHeader("Content-Type", "application/json");





            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | mediaUploadCreate



            payload = mediaUploadCreate.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            MediaUpload obj(output_string);


            Response<MediaUpload> response(obj, httpCode);
            return response;
        }

        Response<
            Media
        >
        MediaApi::
        media_get(
            
            std::string mediaId
            
        )
        {
            std::string url = basepath + "/media/{media_id}"; //mediaId 


            // Headers  | 

            // Query    | 

            // Form     | 



                std::string s_mediaId("{");
                s_mediaId.append("media_id");
                s_mediaId.append("}");

                int pos = url.find(s_mediaId);

                url.erase(pos, s_mediaId.length());
                url.insert(pos, stringify(mediaId));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            Media obj(output_string);


            Response<Media> response(obj, httpCode);
            return response;
        }

        Response<
            Media_list_200_response
        >
        MediaApi::
        media_list(
            
            std::string bookmark
            , 
            
            int pageSize
            
        )
        {
            std::string url = basepath + "/media"; //


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




            Media_list_200_response obj(output_string);


            Response<Media_list_200_response> response(obj, httpCode);
            return response;
        }



