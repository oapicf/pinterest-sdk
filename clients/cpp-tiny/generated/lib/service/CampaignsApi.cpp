#include "CampaignsApi.h"

using namespace Tiny;



        Response<
            std::list<AdPinAnalytics>
        >
        CampaignsApi::
        adPins_analytics(
            
            std::string adAccountId
            , 
            
            std::string campaignId
            , 
            std::list<std::string> pinIds
            
            , 
            
            Date startDate
            , 
            
            Date endDate
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
            std::list<CampaignsAnalyticsResponse_inner>
        >
        CampaignsApi::
        campaigns_analytics(
            
            std::string adAccountId
            , 
            
            Date startDate
            , 
            
            Date endDate
            , 
            std::list<std::string> campaignIds
            
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



            std::list<CampaignsAnalyticsResponse_inner> obj = std::list<CampaignsAnalyticsResponse_inner>();
            bourne::json jsonPayload(output_string);








            
            for(auto& var : jsonPayload.array_range())
            {
                CampaignsAnalyticsResponse_inner tmp(var.dump());
                obj.push_back(tmp);
            }
            







            Response<std::list<CampaignsAnalyticsResponse_inner>> response(obj, httpCode);
            return response;
        }

        Response<
            CampaignCreateResponse
        >
        CampaignsApi::
        campaigns_create(
            
            std::string adAccountId
            , 
            std::list<CampaignCreateRequest> campaignCreateRequest
            
            
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
            // Body     | campaignCreateRequest


            bourne::json tmp_arr = bourne::json::array();
            for(auto& var : campaignCreateRequest)
            {
                auto tmp = var.toJson();
                tmp_arr.append(tmp);

            }
            payload = tmp_arr.dump();


            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            CampaignCreateResponse obj(output_string);


            Response<CampaignCreateResponse> response(obj, httpCode);
            return response;
        }

        Response<
            CampaignResponse
        >
        CampaignsApi::
        campaigns_get(
            
            std::string adAccountId
            , 
            
            std::string campaignId
            
        )
        {
            std::string url = basepath + "/ad_accounts/{ad_account_id}/campaigns/{campaign_id}"; //adAccountId campaignId 


            // Headers  | 

            // Query    | 

            // Form     | 



                std::string s_adAccountId("{");
                s_adAccountId.append("ad_account_id");
                s_adAccountId.append("}");

                int pos = url.find(s_adAccountId);

                url.erase(pos, s_adAccountId.length());
                url.insert(pos, stringify(adAccountId));
                std::string s_campaignId("{");
                s_campaignId.append("campaign_id");
                s_campaignId.append("}");

                int pos = url.find(s_campaignId);

                url.erase(pos, s_campaignId.length());
                url.insert(pos, stringify(campaignId));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            CampaignResponse obj(output_string);


            Response<CampaignResponse> response(obj, httpCode);
            return response;
        }

        Response<
            Campaigns_list_200_response
        >
        CampaignsApi::
        campaigns_list(
            
            std::string adAccountId
            , 
            std::list<std::string> campaignIds
            
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
            std::string url = basepath + "/ad_accounts/{ad_account_id}/campaigns"; //adAccountId 


            // Headers  | 

            // Query    | campaignIds entityStatuses pageSize order bookmark 
            for (auto &x : campaignIds){
                addQueryParam("campaign_ids", std::string(x));
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




            Campaigns_list_200_response obj(output_string);


            Response<Campaigns_list_200_response> response(obj, httpCode);
            return response;
        }

        Response<
            CampaignUpdateResponse
        >
        CampaignsApi::
        campaigns_update(
            
            std::string adAccountId
            , 
            std::list<CampaignUpdateRequest> campaignUpdateRequest
            
            
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
            // Body     | campaignUpdateRequest


            bourne::json tmp_arr = bourne::json::array();
            for(auto& var : campaignUpdateRequest)
            {
                auto tmp = var.toJson();
                tmp_arr.append(tmp);

            }
            payload = tmp_arr.dump();


            int httpCode = sendRequest(url, "PATCH", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            CampaignUpdateResponse obj(output_string);


            Response<CampaignUpdateResponse> response(obj, httpCode);
            return response;
        }



