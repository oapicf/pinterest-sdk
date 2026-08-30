#include "UserAccountApi.h"

using namespace Tiny;



        Response<
            Boards_list_200_response
        >
        UserAccountApi::
        boardsUserFollows_list(
            
            std::string adAccountId
            , 
            
            bool explicitFollowing
            , 
            
            std::string bookmark
            , 
            
            int pageSize
            
        )
        {
            std::string url = basepath + "/user_account/following/boards"; //


            // Headers  | 

            // Query    | adAccountId explicitFollowing bookmark pageSize 
            addQueryParam("ad_account_id",adAccountId);
            addQueryParam("explicit_following",explicitFollowing);
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




            Boards_list_200_response obj(output_string);


            Response<Boards_list_200_response> response(obj, httpCode);
            return response;
        }

        Response<
            FollowUser
        >
        UserAccountApi::
        followUser_update(
            
            std::string username
            , 
            
            FollowUserCreate followUserCreate
            
        )
        {
            std::string url = basepath + "/user_account/following/{username}"; //username 


            // Headers  | 

            // Query    | 

            // Form     | 
            addHeader("Content-Type", "application/json");



                std::string s_username("{");
                s_username.append("username");
                s_username.append("}");

                int pos = url.find(s_username);

                url.erase(pos, s_username.length());
                url.insert(pos, stringify(username));


            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | followUserCreate



            payload = followUserCreate.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            FollowUser obj(output_string);


            Response<FollowUser> response(obj, httpCode);
            return response;
        }

        Response<
            Followers_list_200_response
        >
        UserAccountApi::
        followers_list(
            
            std::string bookmark
            , 
            
            int pageSize
            
        )
        {
            std::string url = basepath + "/user_account/followers"; //


            // Headers  | 

            // Query    | bookmark pageSize 
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




            Followers_list_200_response obj(output_string);


            Response<Followers_list_200_response> response(obj, httpCode);
            return response;
        }

        Response<
            std::list<LinkedBusiness>
        >
        UserAccountApi::
        linkedBusinessAccounts_get(
        )
        {
            std::string url = basepath + "/user_account/businesses"; //


            // Headers  | 

            // Query    | 

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();



            std::list<LinkedBusiness> obj = std::list<LinkedBusiness>();
            bourne::json jsonPayload(output_string);








            
            for(auto& var : jsonPayload.array_range())
            {
                LinkedBusiness tmp(var.dump());
                obj.push_back(tmp);
            }
            







            Response<std::list<LinkedBusiness>> response(obj, httpCode);
            return response;
        }

        Response<
            UserWebsite
        >
        UserAccountApi::
        unverifyWebsite_delete(
            
            std::string website
            
        )
        {
            std::string url = basepath + "/user_account/websites"; //


            // Headers  | 

            // Query    | website 
            addQueryParam("website",website);

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | DELETE
            // Body     | 
            int httpCode = sendRequest(url, "DELETE", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            UserWebsite obj(output_string);


            Response<UserWebsite> response(obj, httpCode);
            return response;
        }

        Response<
            String
        >
        UserAccountApi::
        userAccount_analytics(
            
            Date startDate
            , 
            
            Date endDate
            , 
            
            std::string fromClaimedContent
            , 
            
            std::string pinFormat
            , 
            
            std::string appTypes
            , 
            
            std::string contentType
            , 
            
            std::string source
            , 
            std::list<QuerymetrictypesItems> metricTypes
            
            , 
            
            std::string splitField
            , 
            
            std::string adAccountId
            
        )
        {
            std::string url = basepath + "/user_account/analytics"; //


            // Headers  | 

            // Query    | startDate endDate fromClaimedContent pinFormat appTypes contentType source metricTypes splitField adAccountId 
            addQueryParam("start_date",startDate);
            addQueryParam("end_date",endDate);
            addQueryParam("from_claimed_content",fromClaimedContent);
            addQueryParam("pin_format",pinFormat);
            addQueryParam("app_types",appTypes);
            addQueryParam("content_type",contentType);
            addQueryParam("source",source);
            for (auto &x : metricTypes){
                addQueryParam("metric_types", std::string(x));
            }
            addQueryParam("split_field",splitField);
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
            TopPinsAnalyticsResponse
        >
        UserAccountApi::
        userAccount_analytics_topPins(
            
            Date startDate
            , 
            
            Date endDate
            , 
            
            TopPinsSortBy sortBy
            , 
            
            std::string fromClaimedContent
            , 
            
            std::string pinFormat
            , 
            
            std::string appTypes
            , 
            
            std::string contentType
            , 
            
            std::string source
            , 
            std::list<QuerymetrictypesItems> metricTypes
            
            , 
            
            int numOfPins
            , 
            
            long createdInLastNDays
            , 
            
            std::string adAccountId
            
        )
        {
            std::string url = basepath + "/user_account/analytics/top_pins"; //


            // Headers  | 

            // Query    | startDate endDate sortBy fromClaimedContent pinFormat appTypes contentType source metricTypes numOfPins createdInLastNDays adAccountId 
            addQueryParam("start_date",startDate);
            addQueryParam("end_date",endDate);
            addQueryParam("sort_by",sortBy);
            addQueryParam("from_claimed_content",fromClaimedContent);
            addQueryParam("pin_format",pinFormat);
            addQueryParam("app_types",appTypes);
            addQueryParam("content_type",contentType);
            addQueryParam("source",source);
            for (auto &x : metricTypes){
                addQueryParam("metric_types", std::string(x));
            }
            addQueryParam("num_of_pins",numOfPins);
            addQueryParam("created_in_last_n_days",createdInLastNDays);
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




            TopPinsAnalyticsResponse obj(output_string);


            Response<TopPinsAnalyticsResponse> response(obj, httpCode);
            return response;
        }

        Response<
            TopVideoPinsAnalyticsResponse
        >
        UserAccountApi::
        userAccount_analytics_topVideoPins(
            
            Date startDate
            , 
            
            Date endDate
            , 
            
            TopVideoPinsSortBy sortBy
            , 
            
            std::string fromClaimedContent
            , 
            
            std::string pinFormat
            , 
            
            std::string appTypes
            , 
            
            std::string contentType
            , 
            
            std::string source
            , 
            std::list<QueryvideopinmetrictypesItems> metricTypes
            
            , 
            
            int numOfPins
            , 
            
            long createdInLastNDays
            , 
            
            std::string adAccountId
            
        )
        {
            std::string url = basepath + "/user_account/analytics/top_video_pins"; //


            // Headers  | 

            // Query    | startDate endDate sortBy fromClaimedContent pinFormat appTypes contentType source metricTypes numOfPins createdInLastNDays adAccountId 
            addQueryParam("start_date",startDate);
            addQueryParam("end_date",endDate);
            addQueryParam("sort_by",sortBy);
            addQueryParam("from_claimed_content",fromClaimedContent);
            addQueryParam("pin_format",pinFormat);
            addQueryParam("app_types",appTypes);
            addQueryParam("content_type",contentType);
            addQueryParam("source",source);
            for (auto &x : metricTypes){
                addQueryParam("metric_types", std::string(x));
            }
            addQueryParam("num_of_pins",numOfPins);
            addQueryParam("created_in_last_n_days",createdInLastNDays);
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




            TopVideoPinsAnalyticsResponse obj(output_string);


            Response<TopVideoPinsAnalyticsResponse> response(obj, httpCode);
            return response;
        }

        Response<
            User_account_followed_interests_200_response
        >
        UserAccountApi::
        userAccount_followedInterests(
            
            std::string username
            , 
            
            std::string bookmark
            , 
            
            int pageSize
            
        )
        {
            std::string url = basepath + "/users/{username}/interests/follow"; //username 


            // Headers  | 

            // Query    | bookmark pageSize 
            addQueryParam("bookmark",bookmark);
            addQueryParam("page_size",pageSize);

            // Form     | 



                std::string s_username("{");
                s_username.append("username");
                s_username.append("}");

                int pos = url.find(s_username);

                url.erase(pos, s_username.length());
                url.insert(pos, stringify(username));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            User_account_followed_interests_200_response obj(output_string);


            Response<User_account_followed_interests_200_response> response(obj, httpCode);
            return response;
        }

        Response<
            Account
        >
        UserAccountApi::
        userAccount_get(
            
            std::string adAccountId
            
        )
        {
            std::string url = basepath + "/user_account"; //


            // Headers  | 

            // Query    | adAccountId 
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




            Account obj(output_string);


            Response<Account> response(obj, httpCode);
            return response;
        }

        Response<
            Followers_list_200_response
        >
        UserAccountApi::
        userFollowing_get(
            
            std::string adAccountId
            , 
            
            bool explicitFollowing
            , 
            
            UserFollowingFeedType feedType
            , 
            
            std::string bookmark
            , 
            
            int pageSize
            
        )
        {
            std::string url = basepath + "/user_account/following"; //


            // Headers  | 

            // Query    | adAccountId explicitFollowing feedType bookmark pageSize 
            addQueryParam("ad_account_id",adAccountId);
            addQueryParam("explicit_following",explicitFollowing);
            addQueryParam("feed_type",feedType);
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




            Followers_list_200_response obj(output_string);


            Response<Followers_list_200_response> response(obj, httpCode);
            return response;
        }

        Response<
            User_websites_get_200_response
        >
        UserAccountApi::
        userWebsites_get(
            
            std::string bookmark
            , 
            
            int pageSize
            
        )
        {
            std::string url = basepath + "/user_account/websites"; //


            // Headers  | 

            // Query    | bookmark pageSize 
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




            User_websites_get_200_response obj(output_string);


            Response<User_websites_get_200_response> response(obj, httpCode);
            return response;
        }

        Response<
            UserWebsite
        >
        UserAccountApi::
        verifyWebsite_update(
            
            UserWebsiteCreate userWebsiteCreate
            , 
            
            std::string adAccountId
            
        )
        {
            std::string url = basepath + "/user_account/websites"; //


            // Headers  | 

            // Query    | adAccountId 
            addQueryParam("ad_account_id",adAccountId);

            // Form     | 
            addHeader("Content-Type", "application/json");





            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | userWebsiteCreate



            payload = userWebsiteCreate.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            UserWebsite obj(output_string);


            Response<UserWebsite> response(obj, httpCode);
            return response;
        }

        Response<
            UserWebsiteVerification
        >
        UserAccountApi::
        websiteVerification_get(
            
            std::string adAccountId
            
        )
        {
            std::string url = basepath + "/user_account/websites/verification"; //


            // Headers  | 

            // Query    | adAccountId 
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




            UserWebsiteVerification obj(output_string);


            Response<UserWebsiteVerification> response(obj, httpCode);
            return response;
        }



