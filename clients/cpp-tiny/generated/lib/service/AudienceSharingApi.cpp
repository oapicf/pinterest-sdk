#include "AudienceSharingApi.h"

using namespace Tiny;



        Response<
            Ad_accounts_audiences_shared_accounts_list_200_response
        >
        AudienceSharingApi::
        adAccountsAudiencesSharedAccounts_list(
            
            std::string adAccountId
            , 
            
            std::string audienceId
            , 
            
            AudienceAccountType accountType
            , 
            
            int pageSize
            , 
            
            std::string bookmark
            
        )
        {
            std::string url = basepath + "/ad_accounts/{ad_account_id}/audiences/shared/accounts"; //adAccountId 


            // Headers  | 

            // Query    | audienceId accountType pageSize bookmark 
            addQueryParam("audience_id",audienceId);
            addQueryParam("account_type",accountType);
            addQueryParam("page_size",pageSize);
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




            Ad_accounts_audiences_shared_accounts_list_200_response obj(output_string);


            Response<Ad_accounts_audiences_shared_accounts_list_200_response> response(obj, httpCode);
            return response;
        }

        Response<
            Ad_accounts_audiences_shared_accounts_list_200_response
        >
        AudienceSharingApi::
        businessAccountAudiencesSharedAccounts_list(
            
            std::string businessId
            , 
            
            std::string audienceId
            , 
            
            AudienceAccountType accountType
            , 
            
            int pageSize
            , 
            
            std::string bookmark
            
        )
        {
            std::string url = basepath + "/businesses/{business_id}/audiences/shared/accounts"; //businessId 


            // Headers  | 

            // Query    | audienceId accountType pageSize bookmark 
            addQueryParam("audience_id",audienceId);
            addQueryParam("account_type",accountType);
            addQueryParam("page_size",pageSize);
            addQueryParam("bookmark",bookmark);

            // Form     | 



                std::string s_businessId("{");
                s_businessId.append("business_id");
                s_businessId.append("}");

                int pos = url.find(s_businessId);

                url.erase(pos, s_businessId.length());
                url.insert(pos, stringify(businessId));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            Ad_accounts_audiences_shared_accounts_list_200_response obj(output_string);


            Response<Ad_accounts_audiences_shared_accounts_list_200_response> response(obj, httpCode);
            return response;
        }

        Response<
            Audiences_list_200_response
        >
        AudienceSharingApi::
        sharedAudiencesForBusiness_list(
            
            std::string businessId
            , 
            
            std::string bookmark
            , 
            
            std::string order
            , 
            
            int pageSize
            
        )
        {
            std::string url = basepath + "/businesses/{business_id}/audiences"; //businessId 


            // Headers  | 

            // Query    | bookmark order pageSize 
            addQueryParam("bookmark",bookmark);
            addQueryParam("order",order);
            addQueryParam("page_size",pageSize);

            // Form     | 



                std::string s_businessId("{");
                s_businessId.append("business_id");
                s_businessId.append("}");

                int pos = url.find(s_businessId);

                url.erase(pos, s_businessId.length());
                url.insert(pos, stringify(businessId));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            Audiences_list_200_response obj(output_string);


            Response<Audiences_list_200_response> response(obj, httpCode);
            return response;
        }

        Response<
            SharedAudienceResponse
        >
        AudienceSharingApi::
        updateAdAccountToAdAccountSharedAudience(
            
            std::string adAccountId
            , 
            
            SharedAudience sharedAudience
            
        )
        {
            std::string url = basepath + "/ad_accounts/{ad_account_id}/audiences/ad_accounts/shared"; //adAccountId 


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
            // Body     | sharedAudience



            payload = sharedAudience.toJson().dump();

            int httpCode = sendRequest(url, "PATCH", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            SharedAudienceResponse obj(output_string);


            Response<SharedAudienceResponse> response(obj, httpCode);
            return response;
        }

        Response<
            BusinessSharedAudienceResponse
        >
        AudienceSharingApi::
        updateAdAccountToBusinessSharedAudience(
            
            std::string adAccountId
            , 
            
            BusinessSharedAudience businessSharedAudience
            
        )
        {
            std::string url = basepath + "/ad_accounts/{ad_account_id}/audiences/businesses/shared"; //adAccountId 


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
            // Body     | businessSharedAudience



            payload = businessSharedAudience.toJson().dump();

            int httpCode = sendRequest(url, "PATCH", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            BusinessSharedAudienceResponse obj(output_string);


            Response<BusinessSharedAudienceResponse> response(obj, httpCode);
            return response;
        }

        Response<
            SharedAudienceResponse
        >
        AudienceSharingApi::
        updateBusinessToAdAccountSharedAudience(
            
            std::string businessId
            , 
            
            SharedAudience sharedAudience
            
        )
        {
            std::string url = basepath + "/businesses/{business_id}/audiences/ad_accounts/shared"; //businessId 


            // Headers  | 

            // Query    | 

            // Form     | 
            addHeader("Content-Type", "application/json");



                std::string s_businessId("{");
                s_businessId.append("business_id");
                s_businessId.append("}");

                int pos = url.find(s_businessId);

                url.erase(pos, s_businessId.length());
                url.insert(pos, stringify(businessId));


            std::string payload = "";
            // Send Request
            // METHOD | PATCH
            // Body     | sharedAudience



            payload = sharedAudience.toJson().dump();

            int httpCode = sendRequest(url, "PATCH", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            SharedAudienceResponse obj(output_string);


            Response<SharedAudienceResponse> response(obj, httpCode);
            return response;
        }

        Response<
            BusinessSharedAudienceResponse
        >
        AudienceSharingApi::
        updateBusinessToBusinessSharedAudience(
            
            std::string businessId
            , 
            
            BusinessSharedAudience businessSharedAudience
            
        )
        {
            std::string url = basepath + "/businesses/{business_id}/audiences/businesses/shared"; //businessId 


            // Headers  | 

            // Query    | 

            // Form     | 
            addHeader("Content-Type", "application/json");



                std::string s_businessId("{");
                s_businessId.append("business_id");
                s_businessId.append("}");

                int pos = url.find(s_businessId);

                url.erase(pos, s_businessId.length());
                url.insert(pos, stringify(businessId));


            std::string payload = "";
            // Send Request
            // METHOD | PATCH
            // Body     | businessSharedAudience



            payload = businessSharedAudience.toJson().dump();

            int httpCode = sendRequest(url, "PATCH", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            BusinessSharedAudienceResponse obj(output_string);


            Response<BusinessSharedAudienceResponse> response(obj, httpCode);
            return response;
        }



