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
            std::list<ReportingColumnSync> columns
            
            , 
            
            Granularity granularity
            , 
            
            ConversionAttributionWindowDays clickWindowDays
            , 
            
            ConversionAttributionWindowDays engagementWindowDays
            , 
            
            ConversionAttributionWindowDays viewWindowDays
            , 
            
            ConversionReportTimeType conversionReportTime
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
            std::string url = basepath + "/ad_accounts/{ad_account_id}/ads/targeting_analytics"; //adAccountId 


            // Headers  | 

            // Query    | adIds startDate endDate targetingTypes columns granularity clickWindowDays engagementWindowDays viewWindowDays conversionReportTime attributionTypes reportingTimezone sortColumns sortAscending 
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
            std::list<AdsAnalytics>
        >
        AdsApi::
        ads_analytics(
            
            Date startDate
            , 
            
            Date endDate
            , 
            std::list<ReportingColumnSync> columns
            
            , 
            
            Granularity granularity
            , 
            
            std::string adAccountId
            , 
            std::list<std::string> pinIds
            
            , 
            std::list<std::string> adIds
            
            , 
            
            long clickWindowDays
            , 
            
            long engagementWindowDays
            , 
            
            long viewWindowDays
            , 
            
            std::string conversionReportTime
            , 
            std::list<std::string> campaignIds
            
            , 
            
            ReportingTimeZone reportingTimezone
            
        )
        {
            std::string url = basepath + "/ad_accounts/{ad_account_id}/ads/analytics"; //adAccountId 


            // Headers  | 

            // Query    | pinIds startDate endDate adIds columns granularity clickWindowDays engagementWindowDays viewWindowDays conversionReportTime campaignIds reportingTimezone 
            for (auto &x : pinIds){
                addQueryParam("pin_ids", std::string(x));
            }
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



            std::list<AdsAnalytics> obj = std::list<AdsAnalytics>();
            bourne::json jsonPayload(output_string);








            
            for(auto& var : jsonPayload.array_range())
            {
                AdsAnalytics tmp(var.dump());
                obj.push_back(tmp);
            }
            







            Response<std::list<AdsAnalytics>> response(obj, httpCode);
            return response;
        }

        Response<
            AdBatchWriteResponseModel
        >
        AdsApi::
        ads_create(
            
            std::string adAccountId
            , 
            std::list<AdCreate> adCreate
            
            
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
            // Body     | adCreate


            bourne::json tmp_arr = bourne::json::array();
            for(auto& var : adCreate)
            {
                auto tmp = var.toJson();
                tmp_arr.append(tmp);

            }
            payload = tmp_arr.dump();


            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            AdBatchWriteResponseModel obj(output_string);


            Response<AdBatchWriteResponseModel> response(obj, httpCode);
            return response;
        }

        Response<
            Ad
        >
        AdsApi::
        ads_get(
            
            std::string adId
            , 
            
            std::string adAccountId
            
        )
        {
            std::string url = basepath + "/ad_accounts/{ad_account_id}/ads/{ad_id}"; //adId adAccountId 


            // Headers  | 

            // Query    | 

            // Form     | 



                std::string s_adId("{");
                s_adId.append("ad_id");
                s_adId.append("}");

                int pos = url.find(s_adId);

                url.erase(pos, s_adId.length());
                url.insert(pos, stringify(adId));
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




            Ad obj(output_string);


            Response<Ad> response(obj, httpCode);
            return response;
        }

        Response<
            Ads_list_200_response
        >
        AdsApi::
        ads_list(
            
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
            std::list<std::string> adIds
            
            , 
            std::list<EntityStatus> entityStatuses
            
            
        )
        {
            std::string url = basepath + "/ad_accounts/{ad_account_id}/ads"; //adAccountId 


            // Headers  | 

            // Query    | bookmark pageSize order campaignIds adGroupIds adIds entityStatuses 
            addQueryParam("bookmark",bookmark);
            addQueryParam("page_size",pageSize);
            addQueryParam("order",order);
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
            AdBatchWriteResponseModel
        >
        AdsApi::
        ads_update(
            
            std::string adAccountId
            , 
            std::list<AdBatchUpdate> adBatchUpdate
            
            
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
            // Body     | adBatchUpdate


            bourne::json tmp_arr = bourne::json::array();
            for(auto& var : adBatchUpdate)
            {
                auto tmp = var.toJson();
                tmp_arr.append(tmp);

            }
            payload = tmp_arr.dump();


            int httpCode = sendRequest(url, "PATCH", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            AdBatchWriteResponseModel obj(output_string);


            Response<AdBatchWriteResponseModel> response(obj, httpCode);
            return response;
        }

        Response<
            std::list<Campaign_ad_preview_create_200_response_inner>
        >
        AdsApi::
        campaignAdPreview_create(
            
            std::string adAccountId
            , 
            std::list<CampaignAdPreviewCreate> campaignAdPreviewCreate
            
            
        )
        {
            std::string url = basepath + "/ad_accounts/{ad_account_id}/campaign_ad_preview"; //adAccountId 


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
            // Body     | campaignAdPreviewCreate


            bourne::json tmp_arr = bourne::json::array();
            for(auto& var : campaignAdPreviewCreate)
            {
                auto tmp = var.toJson();
                tmp_arr.append(tmp);

            }
            payload = tmp_arr.dump();


            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();



            std::list<Campaign_ad_preview_create_200_response_inner> obj = std::list<Campaign_ad_preview_create_200_response_inner>();
            bourne::json jsonPayload(output_string);








            
            for(auto& var : jsonPayload.array_range())
            {
                Campaign_ad_preview_create_200_response_inner tmp(var.dump());
                obj.push_back(tmp);
            }
            







            Response<std::list<Campaign_ad_preview_create_200_response_inner>> response(obj, httpCode);
            return response;
        }

        Response<
            std::list<Campaign_ad_preview_delete_200_response_inner>
        >
        AdsApi::
        campaignAdPreview_delete(
            std::list<std::string> adGroupIds
            
            , 
            
            std::string adAccountId
            
        )
        {
            std::string url = basepath + "/ad_accounts/{ad_account_id}/campaign_ad_preview"; //adAccountId 


            // Headers  | 

            // Query    | adGroupIds 
            for (auto &x : adGroupIds){
                addQueryParam("ad_group_ids", std::string(x));
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
            // METHOD | DELETE
            // Body     | 
            int httpCode = sendRequest(url, "DELETE", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();



            std::list<Campaign_ad_preview_delete_200_response_inner> obj = std::list<Campaign_ad_preview_delete_200_response_inner>();
            bourne::json jsonPayload(output_string);








            
            for(auto& var : jsonPayload.array_range())
            {
                Campaign_ad_preview_delete_200_response_inner tmp(var.dump());
                obj.push_back(tmp);
            }
            







            Response<std::list<Campaign_ad_preview_delete_200_response_inner>> response(obj, httpCode);
            return response;
        }

        Response<
            std::list<CampaignAdPreview>
        >
        AdsApi::
        campaignAdPreview_read(
            std::list<std::string> adGroupIds
            
            , 
            
            std::string adAccountId
            
        )
        {
            std::string url = basepath + "/ad_accounts/{ad_account_id}/campaign_ad_preview"; //adAccountId 


            // Headers  | 

            // Query    | adGroupIds 
            for (auto &x : adGroupIds){
                addQueryParam("ad_group_ids", std::string(x));
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



            std::list<CampaignAdPreview> obj = std::list<CampaignAdPreview>();
            bourne::json jsonPayload(output_string);








            
            for(auto& var : jsonPayload.array_range())
            {
                CampaignAdPreview tmp(var.dump());
                obj.push_back(tmp);
            }
            







            Response<std::list<CampaignAdPreview>> response(obj, httpCode);
            return response;
        }



