#include "KeywordsApi.h"

using namespace Tiny;



        Response<
            KeywordsMetricsArrayResponse
        >
        KeywordsApi::
        countryKeywordsMetrics_get(
            
            std::string adAccountId
            , 
            
            std::string countryCode
            , 
            std::list<std::string> keywords
            
            
        )
        {
            std::string url = basepath + "/ad_accounts/{ad_account_id}/keywords/metrics"; //adAccountId 


            // Headers  | 

            // Query    | countryCode keywords 
            addQueryParam("country_code",countryCode);
            for (auto &x : keywords){
                addQueryParam("keywords", std::string(x));
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




            KeywordsMetricsArrayResponse obj(output_string);


            Response<KeywordsMetricsArrayResponse> response(obj, httpCode);
            return response;
        }

        Response<
            Keywords
        >
        KeywordsApi::
        keywords_create(
            
            std::string adAccountId
            , 
            
            KeywordsCreate keywordsCreate
            
        )
        {
            std::string url = basepath + "/ad_accounts/{ad_account_id}/keywords"; //adAccountId 


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
            // Body     | keywordsCreate



            payload = keywordsCreate.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            Keywords obj(output_string);


            Response<Keywords> response(obj, httpCode);
            return response;
        }

        Response<
            Keywords_get_200_response
        >
        KeywordsApi::
        keywords_get(
            
            std::string adAccountId
            , 
            
            std::string campaignId
            , 
            
            std::string adGroupId
            , 
            std::list<std::string> adGroupIds
            
            , 
            std::list<MatchType> matchTypes
            
            , 
            
            std::string bookmark
            , 
            
            int pageSize
            
        )
        {
            std::string url = basepath + "/ad_accounts/{ad_account_id}/keywords"; //adAccountId 


            // Headers  | 

            // Query    | campaignId adGroupId adGroupIds matchTypes bookmark pageSize 
            addQueryParam("campaign_id",campaignId);
            addQueryParam("ad_group_id",adGroupId);
            for (auto &x : adGroupIds){
                addQueryParam("ad_group_ids", std::string(x));
            }
            for (auto &x : matchTypes){
                addQueryParam("match_types", std::string(x));
            }
            addQueryParam("bookmark",bookmark);
            addQueryParam("page_size",pageSize);

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




            Keywords_get_200_response obj(output_string);


            Response<Keywords_get_200_response> response(obj, httpCode);
            return response;
        }

        Response<
            Keywords
        >
        KeywordsApi::
        keywords_update(
            
            std::string adAccountId
            , 
            
            KeywordsUpdate keywordsUpdate
            
        )
        {
            std::string url = basepath + "/ad_accounts/{ad_account_id}/keywords"; //adAccountId 


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
            // Body     | keywordsUpdate



            payload = keywordsUpdate.toJson().dump();

            int httpCode = sendRequest(url, "PATCH", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            Keywords obj(output_string);


            Response<Keywords> response(obj, httpCode);
            return response;
        }

        Response<
            TrendingKeywordsResponse
        >
        KeywordsApi::
        trendingKeywords_list(
            
            TrendsSupportedRegion region
            , 
            
            TrendType trendType
            , 
            std::list<TrendsL1Interest> interests
            
            , 
            std::list<TrendsGenderFilter> genders
            
            , 
            std::list<TrendsAgeBucket> ages
            
            , 
            std::list<std::string> includeKeywords
            
            , 
            
            bool normalizeAgainstGroup
            , 
            
            int limit
            , 
            
            bool includeDemographics
            
        )
        {
            std::string url = basepath + "/trends/keywords/{region}/top/{trend_type}"; //region trendType 


            // Headers  | 

            // Query    | interests genders ages includeKeywords normalizeAgainstGroup limit includeDemographics 
            for (auto &x : interests){
                addQueryParam("interests", std::string(x));
            }
            for (auto &x : genders){
                addQueryParam("genders", std::string(x));
            }
            for (auto &x : ages){
                addQueryParam("ages", std::string(x));
            }
            for (auto &x : includeKeywords){
                addQueryParam("include_keywords", std::string(x));
            }
            addQueryParam("normalize_against_group",normalizeAgainstGroup);
            addQueryParam("limit",limit);
            addQueryParam("include_demographics",includeDemographics);

            // Form     | 



                std::string s_region("{");
                s_region.append("region");
                s_region.append("}");

                int pos = url.find(s_region);

                url.erase(pos, s_region.length());
                url.insert(pos, stringify(region));
                std::string s_trendType("{");
                s_trendType.append("trend_type");
                s_trendType.append("}");

                int pos = url.find(s_trendType);

                url.erase(pos, s_trendType.length());
                url.insert(pos, stringify(trendType));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            TrendingKeywordsResponse obj(output_string);


            Response<TrendingKeywordsResponse> response(obj, httpCode);
            return response;
        }



