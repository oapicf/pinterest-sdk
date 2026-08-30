#include "AdAccountsApi.h"

using namespace Tiny;



        Response<
            MetricsResponse
        >
        AdAccountsApi::
        adAccountTargetingAnalytics_get(
            
            std::string adAccountId
            , 
            
            Date startDate
            , 
            
            Date endDate
            , 
            std::list<AdsAnalyticsAccountTargetingType> targetingTypes
            
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
            std::string url = basepath + "/ad_accounts/{ad_account_id}/targeting_analytics"; //adAccountId 


            // Headers  | 

            // Query    | startDate endDate targetingTypes columns granularity clickWindowDays engagementWindowDays viewWindowDays conversionReportTime attributionTypes reportingTimezone 
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
            std::list<AdAccountAnalyticsItems>
        >
        AdAccountsApi::
        adAccount_analytics(
            
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
            , 
            
            ReportingTimeZone reportingTimezone
            
        )
        {
            std::string url = basepath + "/ad_accounts/{ad_account_id}/analytics"; //adAccountId 


            // Headers  | 

            // Query    | startDate endDate columns granularity clickWindowDays engagementWindowDays viewWindowDays conversionReportTime reportingTimezone 
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



            std::list<AdAccountAnalyticsItems> obj = std::list<AdAccountAnalyticsItems>();
            bourne::json jsonPayload(output_string);








            
            for(auto& var : jsonPayload.array_range())
            {
                AdAccountAnalyticsItems tmp(var.dump());
                obj.push_back(tmp);
            }
            







            Response<std::list<AdAccountAnalyticsItems>> response(obj, httpCode);
            return response;
        }

        Response<
            AdAccount
        >
        AdAccountsApi::
        adAccounts_create(
            
            AdAccountCreate adAccountCreate
            
        )
        {
            std::string url = basepath + "/ad_accounts"; //


            // Headers  | 

            // Query    | 

            // Form     | 
            addHeader("Content-Type", "application/json");





            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | adAccountCreate



            payload = adAccountCreate.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            AdAccount obj(output_string);


            Response<AdAccount> response(obj, httpCode);
            return response;
        }

        Response<
            AdAccount
        >
        AdAccountsApi::
        adAccounts_get(
            
            std::string adAccountId
            
        )
        {
            std::string url = basepath + "/ad_accounts/{ad_account_id}"; //adAccountId 


            // Headers  | 

            // Query    | 

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




            AdAccount obj(output_string);


            Response<AdAccount> response(obj, httpCode);
            return response;
        }

        Response<
            Ad_accounts_list_200_response
        >
        AdAccountsApi::
        adAccounts_list(
            
            bool includeSharedAccounts
            , 
            
            std::string bookmark
            , 
            
            int pageSize
            
        )
        {
            std::string url = basepath + "/ad_accounts"; //


            // Headers  | 

            // Query    | includeSharedAccounts bookmark pageSize 
            addQueryParam("include_shared_accounts",includeSharedAccounts);
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




            Ad_accounts_list_200_response obj(output_string);


            Response<Ad_accounts_list_200_response> response(obj, httpCode);
            return response;
        }

        Response<
            ConversionProductReport
        >
        AdAccountsApi::
        analytics_createConversionProductReport(
            
            std::string adAccountId
            , 
            
            ConversionProductReportCreate conversionProductReportCreate
            
        )
        {
            std::string url = basepath + "/ad_accounts/{ad_account_id}/reports/brand_category_sku"; //adAccountId 


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
            // Body     | conversionProductReportCreate



            payload = conversionProductReportCreate.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            ConversionProductReport obj(output_string);


            Response<ConversionProductReport> response(obj, httpCode);
            return response;
        }

        Response<
            MMMReport
        >
        AdAccountsApi::
        analytics_createMmmReport(
            
            std::string adAccountId
            , 
            
            MMMReportCreate mMMReportCreate
            
        )
        {
            std::string url = basepath + "/ad_accounts/{ad_account_id}/mmm_reports"; //adAccountId 


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
            // Body     | mMMReportCreate



            payload = mMMReportCreate.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            MMMReport obj(output_string);


            Response<MMMReport> response(obj, httpCode);
            return response;
        }

        Response<
            AdsAnalyticsCreateAsyncResponse
        >
        AdAccountsApi::
        analytics_createReport(
            
            std::string adAccountId
            , 
            
            AdsAnalyticsCreateAsyncRequest adsAnalyticsCreateAsyncRequest
            
        )
        {
            std::string url = basepath + "/ad_accounts/{ad_account_id}/reports"; //adAccountId 


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
            // Body     | adsAnalyticsCreateAsyncRequest



            payload = adsAnalyticsCreateAsyncRequest.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            AdsAnalyticsCreateAsyncResponse obj(output_string);


            Response<AdsAnalyticsCreateAsyncResponse> response(obj, httpCode);
            return response;
        }

        Response<
            TemplateBasedReport
        >
        AdAccountsApi::
        analytics_createTemplateReport(
            
            std::string adAccountId
            , 
            
            std::string templateId
            , 
            
            Date startDate
            , 
            
            Date endDate
            , 
            
            Granularity granularity
            
        )
        {
            std::string url = basepath + "/ad_accounts/{ad_account_id}/templates/{template_id}/reports"; //adAccountId templateId 


            // Headers  | 

            // Query    | startDate endDate granularity 
            addQueryParam("start_date",startDate);
            addQueryParam("end_date",endDate);
            addQueryParam("granularity",granularity);

            // Form     | 



                std::string s_adAccountId("{");
                s_adAccountId.append("ad_account_id");
                s_adAccountId.append("}");

                int pos = url.find(s_adAccountId);

                url.erase(pos, s_adAccountId.length());
                url.insert(pos, stringify(adAccountId));
                std::string s_templateId("{");
                s_templateId.append("template_id");
                s_templateId.append("}");

                int pos = url.find(s_templateId);

                url.erase(pos, s_templateId.length());
                url.insert(pos, stringify(templateId));


            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | 
            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            TemplateBasedReport obj(output_string);


            Response<TemplateBasedReport> response(obj, httpCode);
            return response;
        }

        Response<
            ConversionProductReport
        >
        AdAccountsApi::
        analytics_getConversionProductReport(
            
            std::string adAccountId
            , 
            
            std::string token
            
        )
        {
            std::string url = basepath + "/ad_accounts/{ad_account_id}/reports/brand_category_sku"; //adAccountId 


            // Headers  | 

            // Query    | token 
            addQueryParam("token",token);

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




            ConversionProductReport obj(output_string);


            Response<ConversionProductReport> response(obj, httpCode);
            return response;
        }

        Response<
            MMMReport
        >
        AdAccountsApi::
        analytics_getMmmReport(
            
            std::string adAccountId
            , 
            
            std::string token
            
        )
        {
            std::string url = basepath + "/ad_accounts/{ad_account_id}/mmm_reports"; //adAccountId 


            // Headers  | 

            // Query    | token 
            addQueryParam("token",token);

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




            MMMReport obj(output_string);


            Response<MMMReport> response(obj, httpCode);
            return response;
        }

        Response<
            AdsAnalyticsGetAsyncResponse
        >
        AdAccountsApi::
        analytics_getReport(
            
            std::string adAccountId
            , 
            
            std::string token
            
        )
        {
            std::string url = basepath + "/ad_accounts/{ad_account_id}/reports"; //adAccountId 


            // Headers  | 

            // Query    | token 
            addQueryParam("token",token);

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




            AdsAnalyticsGetAsyncResponse obj(output_string);


            Response<AdsAnalyticsGetAsyncResponse> response(obj, httpCode);
            return response;
        }

        Response<
            std::string
        >
        AdAccountsApi::
        sandbox_delete(
            
            std::string adAccountId
            
        )
        {
            std::string url = basepath + "/ad_accounts/{ad_account_id}/sandbox"; //adAccountId 


            // Headers  | 

            // Query    | 

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



            bourne::json jsonPayload(output_string);
            std::string obj;
            jsonToValue(&obj, jsonPayload, "std::string");



            Response<std::string> response(obj, httpCode);
            return response;
        }

        Response<
            Templates_list_200_response
        >
        AdAccountsApi::
        templates_list(
            
            std::string adAccountId
            , 
            
            std::string bookmark
            , 
            
            int pageSize
            , 
            
            Pinterest.Lib.PaginationOrder order
            
        )
        {
            std::string url = basepath + "/ad_accounts/{ad_account_id}/templates"; //adAccountId 


            // Headers  | 

            // Query    | bookmark pageSize order 
            addQueryParam("bookmark",bookmark);
            addQueryParam("page_size",pageSize);
            addQueryParam("order",order);

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




            Templates_list_200_response obj(output_string);


            Response<Templates_list_200_response> response(obj, httpCode);
            return response;
        }



