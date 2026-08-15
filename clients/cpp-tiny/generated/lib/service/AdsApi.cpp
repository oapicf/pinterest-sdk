#include "AdsApi.h"

using namespace Tiny;



        Response<
            AdPreviewURLResponse
        >
        AdsApi::
        adPreviews_create(
            
            std::string adAccountId
            , 
            
            AdPreviewRequest adPreviewRequest
            
        )
        {
            std::string url = basepath + "/ad_accounts/{ad_account_id}/ad_previews"; //adAccountId 


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
            // Body     | adPreviewRequest



            payload = adPreviewRequest.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            AdPreviewURLResponse obj(output_string);


            Response<AdPreviewURLResponse> response(obj, httpCode);
            return response;
        }

        Response<
            MetricsResponse
        >
        AdsApi::
        adTargetingAnalytics_get(
            
            std::string adAccountId
            , 
            std::list<std::string> adIds
            
            , 
            
            Date startDate
            , 
            
            Date endDate
            , 
            std::list<AdsAnalyticsAdTargetingType> targetingTypes
            
            , 
            std::list<std::string> columns
            
            , 
            
            Granularity granularity
            , 
            
            int clickWindowDays
            , 
            
            int engagementWindowDays
            , 
            
            int viewWindowDays
            , 
            
            std::string conversionReportTime
            , 
            std::list<ConversionReportAttributionType> attributionTypes
            
            , 
            
            ReportingTimeZone reportingTimezone
            
        )
        {
            std::string url = basepath + "/ad_accounts/{ad_account_id}/ads/targeting_analytics"; //adAccountId 


            // Headers  | 

            // Query    | adIds startDate endDate targetingTypes columns granularity clickWindowDays engagementWindowDays viewWindowDays conversionReportTime attributionTypes reportingTimezone 
            for (auto &x : adIds){
                addQueryParam("ad_ids", std::string(x));
            }
            addQueryParam("start_date",startDate);
            addQueryParam("end_date",endDate);
            for (auto &x : targetingTypes){
                addQueryParam("targeting_types", std::string(x));
            }
            for (auto &x : columns){
                addQueryParam("columns", std::string(x));
            }
            addQueryParam("granularity",granularity);
            addQueryParam("click_window_days",clickWindowDays);
            addQueryParam("engagement_window_days",engagementWindowDays);
            addQueryParam("view_window_days",viewWindowDays);
            addQueryParam("conversion_report_time",conversionReportTime);
            for (auto &x : attributionTypes){
                addQueryParam("attribution_types", std::string(x));
            }
            addQueryParam("reporting_timezone",reportingTimezone);

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




            MetricsResponse obj(output_string);


            Response<MetricsResponse> response(obj, httpCode);
            return response;
        }

        Response<
            std::list<AdsAnalyticsResponse_inner>
        >
        AdsApi::
        ads_analytics(
            
            std::string adAccountId
            , 
            
            Date startDate
            , 
            
            Date endDate
            , 
            std::list<std::string> columns
            
            , 
            
            Granularity granularity
            , 
            std::list<std::string> adIds
            
            , 
            
            int clickWindowDays
            , 
            
            int engagementWindowDays
            , 
            
            int viewWindowDays
            , 
            
            std::string conversionReportTime
            , 
            std::list<std::string> pinIds
            
            , 
            std::list<std::string> campaignIds
            
            , 
            
            ReportingTimeZone reportingTimezone
            
        )
        {
            std::string url = basepath + "/ad_accounts/{ad_account_id}/ads/analytics"; //adAccountId 


            // Headers  | 

            // Query    | startDate endDate adIds columns granularity clickWindowDays engagementWindowDays viewWindowDays conversionReportTime pinIds campaignIds reportingTimezone 
            addQueryParam("start_date",startDate);
            addQueryParam("end_date",endDate);
            for (auto &x : adIds){
                addQueryParam("ad_ids", std::string(x));
            }
            for (auto &x : columns){
                addQueryParam("columns", std::string(x));
            }
            addQueryParam("granularity",granularity);
            addQueryParam("click_window_days",clickWindowDays);
            addQueryParam("engagement_window_days",engagementWindowDays);
            addQueryParam("view_window_days",viewWindowDays);
            addQueryParam("conversion_report_time",conversionReportTime);
            for (auto &x : pinIds){
                addQueryParam("pin_ids", std::string(x));
            }
            for (auto &x : campaignIds){
                addQueryParam("campaign_ids", std::string(x));
            }
            addQueryParam("reporting_timezone",reportingTimezone);

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



            std::list<AdsAnalyticsResponse_inner> obj = std::list<AdsAnalyticsResponse_inner>();
            bourne::json jsonPayload(output_string);








            
            for(auto& var : jsonPayload.array_range())
            {
                AdsAnalyticsResponse_inner tmp(var.dump());
                obj.push_back(tmp);
            }
            







            Response<std::list<AdsAnalyticsResponse_inner>> response(obj, httpCode);
            return response;
        }

        Response<
            AdArrayResponse
        >
        AdsApi::
        ads_create(
            
            std::string adAccountId
            , 
            std::list<AdCreateRequest> adCreateRequest
            
            
        )
        {
            std::string url = basepath + "/ad_accounts/{ad_account_id}/ads"; //adAccountId 


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
            // Body     | adCreateRequest


            bourne::json tmp_arr = bourne::json::array();
            for(auto& var : adCreateRequest)
            {
                auto tmp = var.toJson();
                tmp_arr.append(tmp);

            }
            payload = tmp_arr.dump();


            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            AdArrayResponse obj(output_string);


            Response<AdArrayResponse> response(obj, httpCode);
            return response;
        }

        Response<
            AdResponse
        >
        AdsApi::
        ads_get(
            
            std::string adAccountId
            , 
            
            std::string adId
            
        )
        {
            std::string url = basepath + "/ad_accounts/{ad_account_id}/ads/{ad_id}"; //adAccountId adId 


            // Headers  | 

            // Query    | 

            // Form     | 



                std::string s_adAccountId("{");
                s_adAccountId.append("ad_account_id");
                s_adAccountId.append("}");

                int pos = url.find(s_adAccountId);

                url.erase(pos, s_adAccountId.length());
                url.insert(pos, stringify(adAccountId));
                std::string s_adId("{");
                s_adId.append("ad_id");
                s_adId.append("}");

                int pos = url.find(s_adId);

                url.erase(pos, s_adId.length());
                url.insert(pos, stringify(adId));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            AdResponse obj(output_string);


            Response<AdResponse> response(obj, httpCode);
            return response;
        }

        Response<
            Ads_list_200_response
        >
        AdsApi::
        ads_list(
            
            std::string adAccountId
            , 
            std::list<std::string> campaignIds
            
            , 
            std::list<std::string> adGroupIds
            
            , 
            std::list<std::string> adIds
            
            , 
            std::list<std::string> entityStatuses
            
            , 
            
            int pageSize
            , 
            
            std::string order
            , 
            
            std::string bookmark
            
        )
        {
            std::string url = basepath + "/ad_accounts/{ad_account_id}/ads"; //adAccountId 


            // Headers  | 

            // Query    | campaignIds adGroupIds adIds entityStatuses pageSize order bookmark 
            for (auto &x : campaignIds){
                addQueryParam("campaign_ids", std::string(x));
            }
            for (auto &x : adGroupIds){
                addQueryParam("ad_group_ids", std::string(x));
            }
            for (auto &x : adIds){
                addQueryParam("ad_ids", std::string(x));
            }
            for (auto &x : entityStatuses){
                addQueryParam("entity_statuses", std::string(x));
            }
            addQueryParam("page_size",pageSize);
            addQueryParam("order",order);
            addQueryParam("bookmark",bookmark);

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




            Ads_list_200_response obj(output_string);


            Response<Ads_list_200_response> response(obj, httpCode);
            return response;
        }

        Response<
            AdArrayResponse
        >
        AdsApi::
        ads_update(
            
            std::string adAccountId
            , 
            std::list<AdUpdateRequest> adUpdateRequest
            
            
        )
        {
            std::string url = basepath + "/ad_accounts/{ad_account_id}/ads"; //adAccountId 


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
            // Body     | adUpdateRequest


            bourne::json tmp_arr = bourne::json::array();
            for(auto& var : adUpdateRequest)
            {
                auto tmp = var.toJson();
                tmp_arr.append(tmp);

            }
            payload = tmp_arr.dump();


            int httpCode = sendRequest(url, "PATCH", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            AdArrayResponse obj(output_string);


            Response<AdArrayResponse> response(obj, httpCode);
            return response;
        }



