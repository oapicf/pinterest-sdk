#include "AdGroupsApi.h"

using namespace Tiny;



        Response<
            BidFloor
        >
        AdGroupsApi::
        adGroupsBidFloor_get(
            
            std::string adAccountId
            , 
            
            BidFloorCreate bidFloorCreate
            
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
            // Body     | bidFloorCreate



            payload = bidFloorCreate.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            BidFloor obj(output_string);


            Response<BidFloor> response(obj, httpCode);
            return response;
        }

        Response<
            DynamicTitlesDownloadCSV
        >
        AdGroupsApi::
        adGroupsDynamicTitles_downloadCsv(
            
            std::string adAccountId
            , 
            
            std::string adGroupId
            
        )
        {
            std::string url = basepath + "/ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles/csv"; //adAccountId adGroupId 


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




            DynamicTitlesDownloadCSV obj(output_string);


            Response<DynamicTitlesDownloadCSV> response(obj, httpCode);
            return response;
        }

        Response<
            DynamicTitlesGetStatus
        >
        AdGroupsApi::
        adGroupsDynamicTitles_getStatus(
            
            std::string adAccountId
            , 
            
            std::string adGroupId
            
        )
        {
            std::string url = basepath + "/ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles/status"; //adAccountId adGroupId 


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




            DynamicTitlesGetStatus obj(output_string);


            Response<DynamicTitlesGetStatus> response(obj, httpCode);
            return response;
        }

        Response<
            DynamicTitlesUploadURL
        >
        AdGroupsApi::
        adGroupsDynamicTitles_getUploadUrl(
            
            std::string adAccountId
            , 
            
            std::string adGroupId
            
        )
        {
            std::string url = basepath + "/ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles/uploads"; //adAccountId adGroupId 


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




            DynamicTitlesUploadURL obj(output_string);


            Response<DynamicTitlesUploadURL> response(obj, httpCode);
            return response;
        }

        Response<
            DynamicTitlesProcessCSV
        >
        AdGroupsApi::
        adGroupsDynamicTitles_processCsv(
            
            std::string adAccountId
            , 
            
            std::string adGroupId
            , 
            
            DynamicTitlesProcessCSVCreate dynamicTitlesProcessCSVCreate
            
        )
        {
            std::string url = basepath + "/ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles"; //adAccountId adGroupId 


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
                std::string s_adGroupId("{");
                s_adGroupId.append("ad_group_id");
                s_adGroupId.append("}");

                int pos = url.find(s_adGroupId);

                url.erase(pos, s_adGroupId.length());
                url.insert(pos, stringify(adGroupId));


            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | dynamicTitlesProcessCSVCreate



            payload = dynamicTitlesProcessCSVCreate.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            DynamicTitlesProcessCSV obj(output_string);


            Response<DynamicTitlesProcessCSV> response(obj, httpCode);
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
            std::list<ReportingColumnSync> columns
            
            , 
            
            Granularity granularity
            , 
            
            long clickWindowDays
            , 
            
            long engagementWindowDays
            , 
            
            long viewWindowDays
            , 
            
            std::string conversionReportTime
            , 
            std::list<ConversionReportAttributionType> attributionTypes
            
            , 
            
            ReportingTimeZone reportingTimezone
            , 
            std::list<std::string> sortColumns
            
            , 
            
            bool sortAscending
            
        )
        {
            std::string url = basepath + "/ad_accounts/{ad_account_id}/ad_groups/targeting_analytics"; //adAccountId 


            // Headers  | 

            // Query    | adGroupIds startDate endDate targetingTypes columns granularity clickWindowDays engagementWindowDays viewWindowDays conversionReportTime attributionTypes reportingTimezone sortColumns sortAscending 
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
            for (auto &x : sortColumns){
                addQueryParam("sort_columns", std::string(x));
            }
            addQueryParam("sort_ascending",sortAscending);

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
            std::list<AdGroupsAnalyticsMetrics>
        >
        AdGroupsApi::
        adGroups_analytics(
            
            Date startDate
            , 
            
            Date endDate
            , 
            std::list<std::string> adGroupIds
            
            , 
            std::list<ReportingColumnSync> columns
            
            , 
            
            Granularity granularity
            , 
            
            std::string adAccountId
            , 
            
            long clickWindowDays
            , 
            
            long engagementWindowDays
            , 
            
            long viewWindowDays
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



            std::list<AdGroupsAnalyticsMetrics> obj = std::list<AdGroupsAnalyticsMetrics>();
            bourne::json jsonPayload(output_string);








            
            for(auto& var : jsonPayload.array_range())
            {
                AdGroupsAnalyticsMetrics tmp(var.dump());
                obj.push_back(tmp);
            }
            







            Response<std::list<AdGroupsAnalyticsMetrics>> response(obj, httpCode);
            return response;
        }

        Response<
            AdGroupAudienceSizing
        >
        AdGroupsApi::
        adGroups_audienceSizing(
            
            std::string adAccountId
            , 
            
            AdGroupAudienceSizingCreate adGroupAudienceSizingCreate
            
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
            // Body     | adGroupAudienceSizingCreate



            payload = adGroupAudienceSizingCreate.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            AdGroupAudienceSizing obj(output_string);


            Response<AdGroupAudienceSizing> response(obj, httpCode);
            return response;
        }

        Response<
            Ad_groups_create_200_response
        >
        AdGroupsApi::
        adGroups_create(
            
            std::string adAccountId
            , 
            std::list<AdGroupCreateCreate> adGroupCreateCreate
            
            
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
            // Body     | adGroupCreateCreate


            bourne::json tmp_arr = bourne::json::array();
            for(auto& var : adGroupCreateCreate)
            {
                auto tmp = var.toJson();
                tmp_arr.append(tmp);

            }
            payload = tmp_arr.dump();


            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            Ad_groups_create_200_response obj(output_string);


            Response<Ad_groups_create_200_response> response(obj, httpCode);
            return response;
        }

        Response<
            AdGroup
        >
        AdGroupsApi::
        adGroups_get(
            
            std::string adGroupId
            , 
            
            std::string adAccountId
            
        )
        {
            std::string url = basepath + "/ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}"; //adGroupId adAccountId 


            // Headers  | 

            // Query    | 

            // Form     | 



                std::string s_adGroupId("{");
                s_adGroupId.append("ad_group_id");
                s_adGroupId.append("}");

                int pos = url.find(s_adGroupId);

                url.erase(pos, s_adGroupId.length());
                url.insert(pos, stringify(adGroupId));
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




            AdGroup obj(output_string);


            Response<AdGroup> response(obj, httpCode);
            return response;
        }

        Response<
            Ad_groups_list_200_response
        >
        AdGroupsApi::
        adGroups_list(
            
            std::string adAccountId
            , 
            
            std::string bookmark
            , 
            
            int pageSize
            , 
            
            Pinterest.Lib.PaginationOrder order
            , 
            std::list<std::string> campaignIds
            
            , 
            std::list<std::string> adGroupIds
            
            , 
            std::list<EntityStatus> entityStatuses
            
            , 
            
            bool translateInterestsToNames
            
        )
        {
            std::string url = basepath + "/ad_accounts/{ad_account_id}/ad_groups"; //adAccountId 


            // Headers  | 

            // Query    | bookmark pageSize order campaignIds adGroupIds entityStatuses translateInterestsToNames 
            addQueryParam("bookmark",bookmark);
            addQueryParam("page_size",pageSize);
            addQueryParam("order",order);
            for (auto &x : campaignIds){
                addQueryParam("campaign_ids", std::string(x));
            }
            for (auto &x : adGroupIds){
                addQueryParam("ad_group_ids", std::string(x));
            }
            for (auto &x : entityStatuses){
                addQueryParam("entity_statuses", std::string(x));
            }
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
            Ad_groups_create_200_response
        >
        AdGroupsApi::
        adGroups_update(
            
            std::string adAccountId
            , 
            std::list<AdGroupUpdateBatchUpdate> adGroupUpdateBatchUpdate
            
            
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
            // Body     | adGroupUpdateBatchUpdate


            bourne::json tmp_arr = bourne::json::array();
            for(auto& var : adGroupUpdateBatchUpdate)
            {
                auto tmp = var.toJson();
                tmp_arr.append(tmp);

            }
            payload = tmp_arr.dump();


            int httpCode = sendRequest(url, "PATCH", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            Ad_groups_create_200_response obj(output_string);


            Response<Ad_groups_create_200_response> response(obj, httpCode);
            return response;
        }

        Response<
            Ad_groups_list_200_response
        >
        AdGroupsApi::
        getAdGroupsByPromotionIds_list(
            
            std::string adAccountId
            , 
            std::list<std::string> promotionIds
            
            , 
            
            std::string bookmark
            , 
            
            int pageSize
            , 
            
            Pinterest.Lib.PaginationOrder order
            
        )
        {
            std::string url = basepath + "/ad_accounts/{ad_account_id}/promotion_applied_entities"; //adAccountId 


            // Headers  | 

            // Query    | bookmark pageSize order promotionIds 
            addQueryParam("bookmark",bookmark);
            addQueryParam("page_size",pageSize);
            addQueryParam("order",order);
            for (auto &x : promotionIds){
                addQueryParam("promotion_ids", std::string(x));
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




            Ad_groups_list_200_response obj(output_string);


            Response<Ad_groups_list_200_response> response(obj, httpCode);
            return response;
        }



