#include "CatalogFeedsApi.h"

using namespace Tiny;



        Response<
            Feed_processing_results_list_200_response
        >
        CatalogFeedsApi::
        feedProcessingResults_list(
            
            std::string feedId
            , 
            
            std::string bookmark
            , 
            
            int pageSize
            , 
            
            std::string adAccountId
            
        )
        {
            std::string url = basepath + "/catalogs/feeds/{feed_id}/processing_results"; //feedId 


            // Headers  | 

            // Query    | bookmark pageSize adAccountId 
            addQueryParam("bookmark",bookmark);
            addQueryParam("page_size",pageSize);
            addQueryParam("ad_account_id",adAccountId);

            // Form     | 



                std::string s_feedId("{");
                s_feedId.append("feed_id");
                s_feedId.append("}");

                int pos = url.find(s_feedId);

                url.erase(pos, s_feedId.length());
                url.insert(pos, stringify(feedId));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            Feed_processing_results_list_200_response obj(output_string);


            Response<Feed_processing_results_list_200_response> response(obj, httpCode);
            return response;
        }

        Response<
            CatalogsFeed
        >
        CatalogFeedsApi::
        feeds_create(
            
            Feeds_create_request feedsCreateRequest
            , 
            
            std::string adAccountId
            
        )
        {
            std::string url = basepath + "/catalogs/feeds"; //


            // Headers  | 

            // Query    | adAccountId 
            addQueryParam("ad_account_id",adAccountId);

            // Form     | 
            addHeader("Content-Type", "application/json");





            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | feedsCreateRequest



            payload = feedsCreateRequest.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            CatalogsFeed obj(output_string);


            Response<CatalogsFeed> response(obj, httpCode);
            return response;
        }

        Response<
            String
        >
        CatalogFeedsApi::
        feeds_delete(
            
            std::string feedId
            , 
            
            std::string adAccountId
            
        )
        {
            std::string url = basepath + "/catalogs/feeds/{feed_id}"; //feedId 


            // Headers  | 

            // Query    | adAccountId 
            addQueryParam("ad_account_id",adAccountId);

            // Form     | 



                std::string s_feedId("{");
                s_feedId.append("feed_id");
                s_feedId.append("}");

                int pos = url.find(s_feedId);

                url.erase(pos, s_feedId.length());
                url.insert(pos, stringify(feedId));


            std::string payload = "";
            // Send Request
            // METHOD | DELETE
            // Body     | 
            int httpCode = sendRequest(url, "DELETE", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            CatalogsFeed
        >
        CatalogFeedsApi::
        feeds_get(
            
            std::string feedId
            , 
            
            std::string adAccountId
            
        )
        {
            std::string url = basepath + "/catalogs/feeds/{feed_id}"; //feedId 


            // Headers  | 

            // Query    | adAccountId 
            addQueryParam("ad_account_id",adAccountId);

            // Form     | 



                std::string s_feedId("{");
                s_feedId.append("feed_id");
                s_feedId.append("}");

                int pos = url.find(s_feedId);

                url.erase(pos, s_feedId.length());
                url.insert(pos, stringify(feedId));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            CatalogsFeed obj(output_string);


            Response<CatalogsFeed> response(obj, httpCode);
            return response;
        }

        Response<
            CatalogsFeedIngestion
        >
        CatalogFeedsApi::
        feeds_ingest(
            
            std::string feedId
            , 
            
            std::string adAccountId
            
        )
        {
            std::string url = basepath + "/catalogs/feeds/{feed_id}/ingest"; //feedId 


            // Headers  | 

            // Query    | adAccountId 
            addQueryParam("ad_account_id",adAccountId);

            // Form     | 



                std::string s_feedId("{");
                s_feedId.append("feed_id");
                s_feedId.append("}");

                int pos = url.find(s_feedId);

                url.erase(pos, s_feedId.length());
                url.insert(pos, stringify(feedId));


            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | 
            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            CatalogsFeedIngestion obj(output_string);


            Response<CatalogsFeedIngestion> response(obj, httpCode);
            return response;
        }

        Response<
            Feeds_list_200_response
        >
        CatalogFeedsApi::
        feeds_list(
            
            std::string bookmark
            , 
            
            int pageSize
            , 
            
            std::string catalogId
            , 
            
            std::string adAccountId
            
        )
        {
            std::string url = basepath + "/catalogs/feeds"; //


            // Headers  | 

            // Query    | bookmark pageSize catalogId adAccountId 
            addQueryParam("bookmark",bookmark);
            addQueryParam("page_size",pageSize);
            addQueryParam("catalog_id",catalogId);
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




            Feeds_list_200_response obj(output_string);


            Response<Feeds_list_200_response> response(obj, httpCode);
            return response;
        }

        Response<
            CatalogsFeed
        >
        CatalogFeedsApi::
        feeds_update(
            
            std::string feedId
            , 
            
            Feeds_update_request feedsUpdateRequest
            , 
            
            std::string adAccountId
            
        )
        {
            std::string url = basepath + "/catalogs/feeds/{feed_id}"; //feedId 


            // Headers  | 

            // Query    | adAccountId 
            addQueryParam("ad_account_id",adAccountId);

            // Form     | 
            addHeader("Content-Type", "application/json");



                std::string s_feedId("{");
                s_feedId.append("feed_id");
                s_feedId.append("}");

                int pos = url.find(s_feedId);

                url.erase(pos, s_feedId.length());
                url.insert(pos, stringify(feedId));


            std::string payload = "";
            // Send Request
            // METHOD | PATCH
            // Body     | feedsUpdateRequest



            payload = feedsUpdateRequest.toJson().dump();

            int httpCode = sendRequest(url, "PATCH", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            CatalogsFeed obj(output_string);


            Response<CatalogsFeed> response(obj, httpCode);
            return response;
        }

        Response<
            Items_issues_list_200_response
        >
        CatalogFeedsApi::
        itemsIssues_list(
            
            std::string processingResultId
            , 
            
            std::string bookmark
            , 
            
            int pageSize
            , 
            std::list<int> itemNumbers
            
            , 
            
            CatalogsItemValidationIssue itemValidationIssue
            , 
            
            std::string adAccountId
            
        )
        {
            std::string url = basepath + "/catalogs/processing_results/{processing_result_id}/item_issues"; //processingResultId 


            // Headers  | 

            // Query    | bookmark pageSize itemNumbers itemValidationIssue adAccountId 
            addQueryParam("bookmark",bookmark);
            addQueryParam("page_size",pageSize);
            for (auto &x : itemNumbers){
                addQueryParam("item_numbers", std::string(x));
            }
            addQueryParam("item_validation_issue",itemValidationIssue);
            addQueryParam("ad_account_id",adAccountId);

            // Form     | 



                std::string s_processingResultId("{");
                s_processingResultId.append("processing_result_id");
                s_processingResultId.append("}");

                int pos = url.find(s_processingResultId);

                url.erase(pos, s_processingResultId.length());
                url.insert(pos, stringify(processingResultId));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            Items_issues_list_200_response obj(output_string);


            Response<Items_issues_list_200_response> response(obj, httpCode);
            return response;
        }



