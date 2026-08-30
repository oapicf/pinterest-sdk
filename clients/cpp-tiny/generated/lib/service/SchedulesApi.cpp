#include "SchedulesApi.h"

using namespace Tiny;



        Response<
            std::list<Schedules_create_200_response_inner>
        >
        SchedulesApi::
        schedules_create(
            
            std::string adAccountId
            , 
            std::list<ScheduleCreate> scheduleCreate
            
            
        )
        {
            std::string url = basepath + "/ad_accounts/{ad_account_id}/schedules"; //adAccountId 


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
            // Body     | scheduleCreate


            bourne::json tmp_arr = bourne::json::array();
            for(auto& var : scheduleCreate)
            {
                auto tmp = var.toJson();
                tmp_arr.append(tmp);

            }
            payload = tmp_arr.dump();


            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();



            std::list<Schedules_create_200_response_inner> obj = std::list<Schedules_create_200_response_inner>();
            bourne::json jsonPayload(output_string);








            
            for(auto& var : jsonPayload.array_range())
            {
                Schedules_create_200_response_inner tmp(var.dump());
                obj.push_back(tmp);
            }
            







            Response<std::list<Schedules_create_200_response_inner>> response(obj, httpCode);
            return response;
        }

        Response<
            Schedules_list_200_response
        >
        SchedulesApi::
        schedules_list(
            
            std::string adAccountId
            , 
            std::list<std::string> entityIds
            
            , 
            
            std::string bookmark
            , 
            
            int pageSize
            , 
            
            Pinterest.Lib.PaginationOrder order
            , 
            std::list<ScheduleStatus> scheduleStatuses
            
            , 
            
            ScheduleType scheduleType
            
        )
        {
            std::string url = basepath + "/ad_accounts/{ad_account_id}/schedules"; //adAccountId 


            // Headers  | 

            // Query    | bookmark pageSize order scheduleStatuses scheduleType entityIds 
            addQueryParam("bookmark",bookmark);
            addQueryParam("page_size",pageSize);
            addQueryParam("order",order);
            for (auto &x : scheduleStatuses){
                addQueryParam("schedule_statuses", std::string(x));
            }
            addQueryParam("schedule_type",scheduleType);
            for (auto &x : entityIds){
                addQueryParam("entity_ids", std::string(x));
            }

            // Form     | 



                std::string s_adAccountId("{");
                s_adAccountId.append("ad_account_id");
                s_adAccountId.append("}");

                int pos = url.find(s_adAccountId);

                url.erase(pos, s_adAccountId.length());
                url.insert(pos, stringify(adAccountId));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            Schedules_list_200_response obj(output_string);


            Response<Schedules_list_200_response> response(obj, httpCode);
            return response;
        }

        Response<
            std::list<Schedules_create_200_response_inner>
        >
        SchedulesApi::
        schedules_update(
            
            std::string adAccountId
            , 
            std::list<ScheduleBatchUpdate> scheduleBatchUpdate
            
            
        )
        {
            std::string url = basepath + "/ad_accounts/{ad_account_id}/schedules"; //adAccountId 


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
            // METHOD | PATCH
            // Body     | scheduleBatchUpdate


            bourne::json tmp_arr = bourne::json::array();
            for(auto& var : scheduleBatchUpdate)
            {
                auto tmp = var.toJson();
                tmp_arr.append(tmp);

            }
            payload = tmp_arr.dump();


            int httpCode = sendRequest(url, "PATCH", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();



            std::list<Schedules_create_200_response_inner> obj = std::list<Schedules_create_200_response_inner>();
            bourne::json jsonPayload(output_string);








            
            for(auto& var : jsonPayload.array_range())
            {
                Schedules_create_200_response_inner tmp(var.dump());
                obj.push_back(tmp);
            }
            







            Response<std::list<Schedules_create_200_response_inner>> response(obj, httpCode);
            return response;
        }



