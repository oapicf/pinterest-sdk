#include "NotificationApi.h"

using namespace Tiny;



        Response<
            NotificationResponse
        >
        NotificationApi::
        notification_post(
            
            NotificationPostRequest notificationPostRequest
            
        )
        {
            std::string url = basepath + "/notifications"; //


            // Headers  | 

            // Query    | 

            // Form     | 
            addHeader("Content-Type", "application/json");





            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | notificationPostRequest



            payload = notificationPostRequest.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            NotificationResponse obj(output_string);


            Response<NotificationResponse> response(obj, httpCode);
            return response;
        }



