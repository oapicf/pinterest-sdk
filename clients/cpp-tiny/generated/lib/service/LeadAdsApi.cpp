#include "LeadAdsApi.h"

using namespace Tiny;



        Response<
            LeadSubscription
        >
        LeadAdsApi::
        adAccountsSubscriptions_delById(
            
            std::string adAccountId
            , 
            
            std::string subscriptionId
            
        )
        {
            std::string url = basepath + "/ad_accounts/{ad_account_id}/leads/subscriptions/{subscription_id}"; //adAccountId subscriptionId 


            // Headers  | 

            // Query    | 

            // Form     | 



                std::string s_adAccountId("{");
                s_adAccountId.append("ad_account_id");
                s_adAccountId.append("}");

                int pos = url.find(s_adAccountId);

                url.erase(pos, s_adAccountId.length());
                url.insert(pos, stringify(adAccountId));
                std::string s_subscriptionId("{");
                s_subscriptionId.append("subscription_id");
                s_subscriptionId.append("}");

                int pos = url.find(s_subscriptionId);

                url.erase(pos, s_subscriptionId.length());
                url.insert(pos, stringify(subscriptionId));


            std::string payload = "";
            // Send Request
            // METHOD | DELETE
            // Body     | 
            int httpCode = sendRequest(url, "DELETE", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            LeadSubscription obj(output_string);


            Response<LeadSubscription> response(obj, httpCode);
            return response;
        }

        Response<
            LeadSubscription
        >
        LeadAdsApi::
        adAccountsSubscriptions_getById(
            
            std::string adAccountId
            , 
            
            std::string subscriptionId
            
        )
        {
            std::string url = basepath + "/ad_accounts/{ad_account_id}/leads/subscriptions/{subscription_id}"; //adAccountId subscriptionId 


            // Headers  | 

            // Query    | 

            // Form     | 



                std::string s_adAccountId("{");
                s_adAccountId.append("ad_account_id");
                s_adAccountId.append("}");

                int pos = url.find(s_adAccountId);

                url.erase(pos, s_adAccountId.length());
                url.insert(pos, stringify(adAccountId));
                std::string s_subscriptionId("{");
                s_subscriptionId.append("subscription_id");
                s_subscriptionId.append("}");

                int pos = url.find(s_subscriptionId);

                url.erase(pos, s_subscriptionId.length());
                url.insert(pos, stringify(subscriptionId));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            LeadSubscription obj(output_string);


            Response<LeadSubscription> response(obj, httpCode);
            return response;
        }

        Response<
            Ad_accounts_subscriptions_get_list_200_response
        >
        LeadAdsApi::
        adAccountsSubscriptions_getList(
            
            std::string adAccountId
            , 
            
            std::string bookmark
            , 
            
            int pageSize
            
        )
        {
            std::string url = basepath + "/ad_accounts/{ad_account_id}/leads/subscriptions"; //adAccountId 


            // Headers  | 

            // Query    | bookmark pageSize 
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




            Ad_accounts_subscriptions_get_list_200_response obj(output_string);


            Response<Ad_accounts_subscriptions_get_list_200_response> response(obj, httpCode);
            return response;
        }

        Response<
            LeadSubscription
        >
        LeadAdsApi::
        adAccountsSubscriptions_post(
            
            std::string adAccountId
            , 
            
            LeadSubscriptionPostParamsCreate leadSubscriptionPostParamsCreate
            
        )
        {
            std::string url = basepath + "/ad_accounts/{ad_account_id}/leads/subscriptions"; //adAccountId 


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
            // Body     | leadSubscriptionPostParamsCreate



            payload = leadSubscriptionPostParamsCreate.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            LeadSubscription obj(output_string);


            Response<LeadSubscription> response(obj, httpCode);
            return response;
        }



