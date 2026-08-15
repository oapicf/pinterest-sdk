#include "AdGroupsApi.h"

using namespace Tiny;



        Response<
            BidFloor
        >
        AdGroupsApi::
        adGroupsBidFloor_get(
            
            std::string adAccountId
            , 
            
            BidFloorRequest bidFloorRequest
            
        )
        {
            std::string url = basepath + "/ad_accounts/{ad_account_id}/bid_floor"; //adAccountId 


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
            // Body     | bidFloorRequest



            payload = bidFloorRequest.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            BidFloor obj(output_string);


            Response<BidFloor> response(obj, httpCode);
            return response;
        }

        Response<
            MetricsResponse
        >
        AdGroupsApi::
        adGroupsTargetingAnalytics_get(
            
            std::string adAccountId
            , 
            std::list<std::string> adGroupIds
            
            , 
            
            Date startDate
            , 
            
            Date endDate
            , 
            std::list<AdsAnalyticsAdGroupTargetingType> targetingTypes
            
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
            std::string url = basepath + "/ad_accounts/{ad_account_id}/ad_groups/targeting_analytics"; //adAccountId 


            // Headers  | 

            // Query    | adGroupIds startDate endDate targetingTypes columns granularity clickWindowDays engagementWindowDays viewWindowDays conversionReportTime attributionTypes reportingTimezone 
            for (auto &x : adGroupIds){
                addQueryParam("ad_group_ids", std::string(x));
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
            std::list<AdGroupsAnalyticsResponse_inner>
        >
        AdGroupsApi::
        adGroups_analytics(
            
            std::string adAccountId
            , 
            
            Date startDate
            , 
            
            Date endDate
            , 
            std::list<std::string> adGroupIds
            
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
            
            bool aggregateReportRows
            , 
            
            ReportingTimeZone reportingTimezone
            
        )
        {
            std::string url = basepath + "/ad_accounts/{ad_account_id}/ad_groups/analytics"; //adAccountId 


            // Headers  | 

            // Query    | startDate endDate adGroupIds columns granularity clickWindowDays engagementWindowDays viewWindowDays conversionReportTime aggregateReportRows reportingTimezone 
            addQueryParam("start_date",startDate);
            addQueryParam("end_date",endDate);
            for (auto &x : adGroupIds){
                addQueryParam("ad_group_ids", std::string(x));
            }
            for (auto &x : columns){
                addQueryParam("columns", std::string(x));
            }
            addQueryParam("granularity",granularity);
            addQueryParam("click_window_days",clickWindowDays);
            addQueryParam("engagement_window_days",engagementWindowDays);
            addQueryParam("view_window_days",viewWindowDays);
            addQueryParam("conversion_report_time",conversionReportTime);
            addQueryParam("aggregate_report_rows",aggregateReportRows);
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



            std::list<AdGroupsAnalyticsResponse_inner> obj = std::list<AdGroupsAnalyticsResponse_inner>();
            bourne::json jsonPayload(output_string);








            
            for(auto& var : jsonPayload.array_range())
            {
                AdGroupsAnalyticsResponse_inner tmp(var.dump());
                obj.push_back(tmp);
            }
            







            Response<std::list<AdGroupsAnalyticsResponse_inner>> response(obj, httpCode);
            return response;
        }

        Response<
            AdGroupAudienceSizingResponse
        >
        AdGroupsApi::
        adGroups_audienceSizing(
            
            std::string adAccountId
            , 
            
            AdGroupAudienceSizingRequest adGroupAudienceSizingRequest
            
        )
        {
            std::string url = basepath + "/ad_accounts/{ad_account_id}/ad_groups/audience_sizing"; //adAccountId 


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
            // Body     | adGroupAudienceSizingRequest



            payload = adGroupAudienceSizingRequest.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            AdGroupAudienceSizingResponse obj(output_string);


            Response<AdGroupAudienceSizingResponse> response(obj, httpCode);
            return response;
        }

        Response<
            AdGroupArrayResponse
        >
        AdGroupsApi::
        adGroups_create(
            
            std::string adAccountId
            , 
            std::list<AdGroupCreateRequest> adGroupCreateRequest
            
            
        )
        {
            std::string url = basepath + "/ad_accounts/{ad_account_id}/ad_groups"; //adAccountId 


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
            // Body     | adGroupCreateRequest


            bourne::json tmp_arr = bourne::json::array();
            for(auto& var : adGroupCreateRequest)
            {
                auto tmp = var.toJson();
                tmp_arr.append(tmp);

            }
            payload = tmp_arr.dump();


            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            AdGroupArrayResponse obj(output_string);


            Response<AdGroupArrayResponse> response(obj, httpCode);
            return response;
        }

        Response<
            AdGroupResponse
        >
        AdGroupsApi::
        adGroups_get(
            
            std::string adAccountId
            , 
            
            std::string adGroupId
            
        )
        {
            std::string url = basepath + "/ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}"; //adAccountId adGroupId 


            // Headers  | 

            // Query    | 

            // Form     | 



                std::string s_adAccountId("{");
                s_adAccountId.append("ad_account_id");
                s_adAccountId.append("}");

                int pos = url.find(s_adAccountId);

                url.erase(pos, s_adAccountId.length());
                url.insert(pos, stringify(adAccountId));
                std::string s_adGroupId("{");
                s_adGroupId.append("ad_group_id");
                s_adGroupId.append("}");

                int pos = url.find(s_adGroupId);

                url.erase(pos, s_adGroupId.length());
                url.insert(pos, stringify(adGroupId));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            AdGroupResponse obj(output_string);


            Response<AdGroupResponse> response(obj, httpCode);
            return response;
        }

        Response<
            Ad_groups_list_200_response
        >
        AdGroupsApi::
        adGroups_list(
            
            std::string adAccountId
            , 
            std::list<std::string> campaignIds
            
            , 
            std::list<std::string> adGroupIds
            
            , 
            std::list<std::string> entityStatuses
            
            , 
            
            int pageSize
            , 
            
            std::string order
            , 
            
            std::string bookmark
            , 
            
            bool translateInterestsToNames
            
        )
        {
            std::string url = basepath + "/ad_accounts/{ad_account_id}/ad_groups"; //adAccountId 


            // Headers  | 

            // Query    | campaignIds adGroupIds entityStatuses pageSize order bookmark translateInterestsToNames 
            for (auto &x : campaignIds){
                addQueryParam("campaign_ids", std::string(x));
            }
            for (auto &x : adGroupIds){
                addQueryParam("ad_group_ids", std::string(x));
            }
            for (auto &x : entityStatuses){
                addQueryParam("entity_statuses", std::string(x));
            }
            addQueryParam("page_size",pageSize);
            addQueryParam("order",order);
            addQueryParam("bookmark",bookmark);
            addQueryParam("translate_interests_to_names",translateInterestsToNames);

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




            Ad_groups_list_200_response obj(output_string);


            Response<Ad_groups_list_200_response> response(obj, httpCode);
            return response;
        }

        Response<
            AdGroupArrayResponse
        >
        AdGroupsApi::
        adGroups_update(
            
            std::string adAccountId
            , 
            std::list<AdGroupUpdateRequest> adGroupUpdateRequest
            
            
        )
        {
            std::string url = basepath + "/ad_accounts/{ad_account_id}/ad_groups"; //adAccountId 


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
            // Body     | adGroupUpdateRequest


            bourne::json tmp_arr = bourne::json::array();
            for(auto& var : adGroupUpdateRequest)
            {
                auto tmp = var.toJson();
                tmp_arr.append(tmp);

            }
            payload = tmp_arr.dump();


            int httpCode = sendRequest(url, "PATCH", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            AdGroupArrayResponse obj(output_string);


            Response<AdGroupArrayResponse> response(obj, httpCode);
            return response;
        }



