#include "PinsApi.h"

using namespace Tiny;



        Response<
            String
        >
        PinsApi::
        multiPins_analytics(
            std::list<std::string> pinIds
            
            , 
            
            Date startDate
            , 
            
            Date endDate
            , 
            std::list<MultiPinsAnalyticsMetricTypesItem> metricTypes
            
            , 
            
            std::string appTypes
            , 
            
            std::string adAccountId
            
        )
        {
            std::string url = basepath + "/pins/analytics"; //


            // Headers  | 

            // Query    | pinIds startDate endDate appTypes metricTypes adAccountId 
            for (auto &x : pinIds){
                addQueryParam("pin_ids", std::string(x));
            }
            addQueryParam("start_date",startDate);
            addQueryParam("end_date",endDate);
            addQueryParam("app_types",appTypes);
            for (auto &x : metricTypes){
                addQueryParam("metric_types", std::string(x));
            }
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



            //TODO: Implement map logic here




            //TODO: No support for maps.
            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        PinsApi::
        pins_analytics(
            
            std::string pinId
            , 
            
            Date startDate
            , 
            
            Date endDate
            , 
            std::list<QuerypinanalyticsmetrictypesItems> metricTypes
            
            , 
            
            std::string appTypes
            , 
            
            std::string splitField
            , 
            
            std::string adAccountId
            
        )
        {
            std::string url = basepath + "/pins/{pin_id}/analytics"; //pinId 


            // Headers  | 

            // Query    | startDate endDate appTypes metricTypes splitField adAccountId 
            addQueryParam("start_date",startDate);
            addQueryParam("end_date",endDate);
            addQueryParam("app_types",appTypes);
            for (auto &x : metricTypes){
                addQueryParam("metric_types", std::string(x));
            }
            addQueryParam("split_field",splitField);
            addQueryParam("ad_account_id",adAccountId);

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



            //TODO: Implement map logic here




            //TODO: No support for maps.
            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            Pin
        >
        PinsApi::
        pins_create(
            
            PinCreate pinCreate
            , 
            
            std::string adAccountId
            
        )
        {
            std::string url = basepath + "/pins"; //


            // Headers  | 

            // Query    | adAccountId 
            addQueryParam("ad_account_id",adAccountId);

            // Form     | 
            addHeader("Content-Type", "application/json");





            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | pinCreate



            payload = pinCreate.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            Pin obj(output_string);


            Response<Pin> response(obj, httpCode);
            return response;
        }

        Response<
            Pin
        >
        PinsApi::
        pins_delete(
            
            std::string pinId
            , 
            
            std::string adAccountId
            
        )
        {
            std::string url = basepath + "/pins/{pin_id}"; //pinId 


            // Headers  | 

            // Query    | adAccountId 
            addQueryParam("ad_account_id",adAccountId);

            // Form     | 



                std::string s_pinId("{");
                s_pinId.append("pin_id");
                s_pinId.append("}");

                int pos = url.find(s_pinId);

                url.erase(pos, s_pinId.length());
                url.insert(pos, stringify(pinId));


            std::string payload = "";
            // Send Request
            // METHOD | DELETE
            // Body     | 
            int httpCode = sendRequest(url, "DELETE", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            Pin obj(output_string);


            Response<Pin> response(obj, httpCode);
            return response;
        }

        Response<
            Pin
        >
        PinsApi::
        pins_get(
            
            std::string pinId
            , 
            
            std::string adAccountId
            , 
            
            bool pinMetrics
            
        )
        {
            std::string url = basepath + "/pins/{pin_id}"; //pinId 


            // Headers  | 

            // Query    | adAccountId pinMetrics 
            addQueryParam("ad_account_id",adAccountId);
            addQueryParam("pin_metrics",pinMetrics);

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




            Pin obj(output_string);


            Response<Pin> response(obj, httpCode);
            return response;
        }

        Response<
            Pins_list_200_response
        >
        PinsApi::
        pins_list(
            
            PinFilter pinFilter
            , 
            
            bool pinMetrics
            , 
            
            bool includeProtectedPins
            , 
            
            PinType pinType
            , 
            std::list<CreativeType> creativeTypes
            
            , 
            
            std::string adAccountId
            , 
            
            std::string domain
            , 
            std::list<std::string> domains
            
            , 
            
            bool includeProductTagObj
            , 
            
            std::string bookmark
            , 
            
            int pageSize
            
        )
        {
            std::string url = basepath + "/pins"; //


            // Headers  | 

            // Query    | pinFilter pinMetrics includeProtectedPins pinType creativeTypes adAccountId domain domains includeProductTagObj bookmark pageSize 
            addQueryParam("pin_filter",pinFilter);
            addQueryParam("pin_metrics",pinMetrics);
            addQueryParam("include_protected_pins",includeProtectedPins);
            addQueryParam("pin_type",pinType);
            for (auto &x : creativeTypes){
                addQueryParam("creative_types", std::string(x));
            }
            addQueryParam("ad_account_id",adAccountId);
            addQueryParam("domain",domain);
            for (auto &x : domains){
                addQueryParam("domains", std::string(x));
            }
            addQueryParam("include_product_tag_obj",includeProductTagObj);
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




            Pins_list_200_response obj(output_string);


            Response<Pins_list_200_response> response(obj, httpCode);
            return response;
        }

        Response<
            Pin
        >
        PinsApi::
        pins_save(
            
            std::string pinId
            , 
            
            PinsSaveRequestCreate pinsSaveRequestCreate
            , 
            
            std::string adAccountId
            
        )
        {
            std::string url = basepath + "/pins/{pin_id}/save"; //pinId 


            // Headers  | 

            // Query    | adAccountId 
            addQueryParam("ad_account_id",adAccountId);

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
            // Body     | pinsSaveRequestCreate



            payload = pinsSaveRequestCreate.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            Pin obj(output_string);


            Response<Pin> response(obj, httpCode);
            return response;
        }

        Response<
            Pin
        >
        PinsApi::
        pins_update(
            
            std::string pinId
            , 
            
            PinUpdate pinUpdate
            , 
            
            std::string adAccountId
            
        )
        {
            std::string url = basepath + "/pins/{pin_id}"; //pinId 


            // Headers  | 

            // Query    | adAccountId 
            addQueryParam("ad_account_id",adAccountId);

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
            // METHOD | PATCH
            // Body     | pinUpdate



            payload = pinUpdate.toJson().dump();

            int httpCode = sendRequest(url, "PATCH", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            Pin obj(output_string);


            Response<Pin> response(obj, httpCode);
            return response;
        }



