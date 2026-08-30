#include "CampaignsApi.h"

using namespace Tiny;



        Response<
            std::list<AdPinAnalytics>
        >
        CampaignsApi::
        adPins_analytics(
            
            std::string campaignId
            , 
            std::list<std::string> pinIds
            
            , 
            
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
            
            long clickWindowDays
            , 
            
            long engagementWindowDays
            , 
            
            long viewWindowDays
            , 
            
            std::string conversionReportTime
            
        )
        {
            std::string url = basepath + "/ad_accounts/{ad_account_id}/pins/analytics"; //adAccountId 


            // Headers  | 

            // Query    | campaignId pinIds startDate endDate columns granularity clickWindowDays engagementWindowDays viewWindowDays conversionReportTime 
            addQueryParam("campaign_id",campaignId);
            for (auto &x : pinIds){
                addQueryParam("pin_ids", std::string(x));
            }
            addQueryParam("start_date",startDate);
            addQueryParam("end_date",endDate);
            for (auto &x : columns){
                addQueryParam("columns", std::string(x));
            }
            addQueryParam("granularity",granularity);
            addQueryParam("click_window_days",clickWindowDays);
            addQueryParam("engagement_window_days",engagementWindowDays);
            addQueryParam("view_window_days",viewWindowDays);
            addQueryParam("conversion_report_time",conversionReportTime);

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



            std::list<AdPinAnalytics> obj = std::list<AdPinAnalytics>();
            bourne::json jsonPayload(output_string);








            
            for(auto& var : jsonPayload.array_range())
            {
                AdPinAnalytics tmp(var.dump());
                obj.push_back(tmp);
            }
            







            Response<std::list<AdPinAnalytics>> response(obj, httpCode);
            return response;
        }

        Response<
            MetricsResponse
        >
        CampaignsApi::
        campaignTargetingAnalytics_get(
            
            std::string adAccountId
            , 
            std::list<std::string> campaignIds
            
            , 
            
            Date startDate
            , 
            
            Date endDate
            , 
            std::list<AdsAnalyticsCampaignTargetingType> targetingTypes
            
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
            
        )
        {
            std::string url = basepath + "/ad_accounts/{ad_account_id}/campaigns/targeting_analytics"; //adAccountId 


            // Headers  | 

            // Query    | campaignIds startDate endDate targetingTypes columns granularity clickWindowDays engagementWindowDays viewWindowDays conversionReportTime attributionTypes reportingTimezone 
            for (auto &x : campaignIds){
                addQueryParam("campaign_ids", std::string(x));
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
            std::list<CampaignsAnalyticsMetrics>
        >
        CampaignsApi::
        campaigns_analytics(
            
            Date startDate
            , 
            
            Date endDate
            , 
            std::list<std::string> campaignIds
            
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
            std::string url = basepath + "/ad_accounts/{ad_account_id}/campaigns/analytics"; //adAccountId 


            // Headers  | 

            // Query    | startDate endDate campaignIds columns granularity clickWindowDays engagementWindowDays viewWindowDays conversionReportTime aggregateReportRows reportingTimezone 
            addQueryParam("start_date",startDate);
            addQueryParam("end_date",endDate);
            for (auto &x : campaignIds){
                addQueryParam("campaign_ids", std::string(x));
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



            std::list<CampaignsAnalyticsMetrics> obj = std::list<CampaignsAnalyticsMetrics>();
            bourne::json jsonPayload(output_string);








            
            for(auto& var : jsonPayload.array_range())
            {
                CampaignsAnalyticsMetrics tmp(var.dump());
                obj.push_back(tmp);
            }
            







            Response<std::list<CampaignsAnalyticsMetrics>> response(obj, httpCode);
            return response;
        }

        Response<
            CampaignBatchWriteResponseModel
        >
        CampaignsApi::
        campaigns_create(
            
            std::string adAccountId
            , 
            std::list<CampaignCreateItem> campaignCreateItem
            
            
        )
        {
            std::string url = basepath + "/ad_accounts/{ad_account_id}/campaigns"; //adAccountId 


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
            // Body     | campaignCreateItem


            bourne::json tmp_arr = bourne::json::array();
            for(auto& var : campaignCreateItem)
            {
                auto tmp = var.toJson();
                tmp_arr.append(tmp);

            }
            payload = tmp_arr.dump();


            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            CampaignBatchWriteResponseModel obj(output_string);


            Response<CampaignBatchWriteResponseModel> response(obj, httpCode);
            return response;
        }

        Response<
            Campaign
        >
        CampaignsApi::
        campaigns_get(
            
            std::string campaignId
            , 
            
            std::string adAccountId
            
        )
        {
            std::string url = basepath + "/ad_accounts/{ad_account_id}/campaigns/{campaign_id}"; //campaignId adAccountId 


            // Headers  | 

            // Query    | 

            // Form     | 



                std::string s_campaignId("{");
                s_campaignId.append("campaign_id");
                s_campaignId.append("}");

                int pos = url.find(s_campaignId);

                url.erase(pos, s_campaignId.length());
                url.insert(pos, stringify(campaignId));
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




            Campaign obj(output_string);


            Response<Campaign> response(obj, httpCode);
            return response;
        }

        Response<
            Campaigns_list_200_response
        >
        CampaignsApi::
        campaigns_list(
            
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
            std::list<EntityStatus> entityStatuses
            
            
        )
        {
            std::string url = basepath + "/ad_accounts/{ad_account_id}/campaigns"; //adAccountId 


            // Headers  | 

            // Query    | bookmark pageSize order campaignIds entityStatuses 
            addQueryParam("bookmark",bookmark);
            addQueryParam("page_size",pageSize);
            addQueryParam("order",order);
            for (auto &x : campaignIds){
                addQueryParam("campaign_ids", std::string(x));
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




            Campaigns_list_200_response obj(output_string);


            Response<Campaigns_list_200_response> response(obj, httpCode);
            return response;
        }

        Response<
            CampaignBatchWriteResponseModel
        >
        CampaignsApi::
        campaigns_update(
            
            std::string adAccountId
            , 
            std::list<CampaignBatchUpdateItem> campaignBatchUpdateItem
            
            
        )
        {
            std::string url = basepath + "/ad_accounts/{ad_account_id}/campaigns"; //adAccountId 


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
            // Body     | campaignBatchUpdateItem


            bourne::json tmp_arr = bourne::json::array();
            for(auto& var : campaignBatchUpdateItem)
            {
                auto tmp = var.toJson();
                tmp_arr.append(tmp);

            }
            payload = tmp_arr.dump();


            int httpCode = sendRequest(url, "PATCH", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            CampaignBatchWriteResponseModel obj(output_string);


            Response<CampaignBatchWriteResponseModel> response(obj, httpCode);
            return response;
        }

        Response<
            CampaignDeliveryEstimatesResponse
        >
        CampaignsApi::
        getCampaignDeliveryEstimates(
            
            std::string adAccountId
            , 
            std::list<CampaignDeliveryEstimatesCampaign> campaignDeliveryEstimatesCampaign
            
            
        )
        {
            std::string url = basepath + "/ad_accounts/{ad_account_id}/campaigns/delivery_estimates"; //adAccountId 


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
            // Body     | campaignDeliveryEstimatesCampaign


            bourne::json tmp_arr = bourne::json::array();
            for(auto& var : campaignDeliveryEstimatesCampaign)
            {
                auto tmp = var.toJson();
                tmp_arr.append(tmp);

            }
            payload = tmp_arr.dump();


            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            CampaignDeliveryEstimatesResponse obj(output_string);


            Response<CampaignDeliveryEstimatesResponse> response(obj, httpCode);
            return response;
        }



