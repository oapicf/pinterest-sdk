#include "AudienceSharingApi.h"

using namespace Tiny;



        Response<
            Ad_accounts_audiences_shared_accounts_list_200_response
        >
        AudienceSharingApi::
        adAccountsAudiencesSharedAccounts_list(
            
            std::string audienceId
            , 
            
            AudienceAccountType accountType
            , 
            
            std::string adAccountId
            , 
            
            std::string bookmark
            , 
            
            int pageSize
            
        )
        {
            std::string url = basepath + "/ad_accounts/{ad_account_id}/audiences/shared/accounts"; //adAccountId 


            // Headers  | 

            // Query    | audienceId accountType bookmark pageSize 
            addQueryParam("audience_id",audienceId);
            addQueryParam("account_type",accountType);
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
            
            std::string bookmark
            , 
            
            int pageSize
            
        )
        {
            std::string url = basepath + "/businesses/{business_id}/audiences/shared/accounts"; //businessId 


            // Headers  | 

            // Query    | audienceId accountType bookmark pageSize 
            addQueryParam("audience_id",audienceId);
            addQueryParam("account_type",accountType);
            addQueryParam("bookmark",bookmark);
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




            Ad_accounts_audiences_shared_accounts_list_200_response obj(output_string);


            Response<Ad_accounts_audiences_shared_accounts_list_200_response> response(obj, httpCode);
            return response;
        }

        Response<
            Shared_audiences_for_business_list_200_response
        >
        AudienceSharingApi::
        sharedAudiencesForBusiness_list(
            
            std::string businessId
            , 
            
            Order order
            , 
            
            std::string bookmark
            , 
            
            int pageSize
            
        )
        {
            std::string url = basepath + "/businesses/{business_id}/audiences"; //businessId 


            // Headers  | 

            // Query    | order bookmark pageSize 
            addQueryParam("order",order);
            addQueryParam("bookmark",bookmark);
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




            Shared_audiences_for_business_list_200_response obj(output_string);


            Response<Shared_audiences_for_business_list_200_response> response(obj, httpCode);
            return response;
        }

        Response<
            AdAccountToAdAccountSharedAudience
        >
        AudienceSharingApi::
        updateAdAccountToAdAccountSharedAudience(
            
            std::string adAccountId
            , 
            
            AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody adAccountToAdAccountSharedAudienceUpdateWithRequiredBody
            
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
            // Body     | adAccountToAdAccountSharedAudienceUpdateWithRequiredBody



            payload = adAccountToAdAccountSharedAudienceUpdateWithRequiredBody.toJson().dump();

            int httpCode = sendRequest(url, "PATCH", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            AdAccountToAdAccountSharedAudience obj(output_string);


            Response<AdAccountToAdAccountSharedAudience> response(obj, httpCode);
            return response;
        }

        Response<
            AdAccountToBusinessSharedAudience
        >
        AudienceSharingApi::
        updateAdAccountToBusinessSharedAudience(
            
            std::string adAccountId
            , 
            
            AdAccountToBusinessSharedAudienceUpdateWithRequiredBody adAccountToBusinessSharedAudienceUpdateWithRequiredBody
            
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
            // Body     | adAccountToBusinessSharedAudienceUpdateWithRequiredBody



            payload = adAccountToBusinessSharedAudienceUpdateWithRequiredBody.toJson().dump();

            int httpCode = sendRequest(url, "PATCH", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            AdAccountToBusinessSharedAudience obj(output_string);


            Response<AdAccountToBusinessSharedAudience> response(obj, httpCode);
            return response;
        }

        Response<
            BusinessToAdAccountSharedAudience
        >
        AudienceSharingApi::
        updateBusinessToAdAccountSharedAudience(
            
            std::string businessId
            , 
            
            BusinessToAdAccountSharedAudienceUpdateWithRequiredBody businessToAdAccountSharedAudienceUpdateWithRequiredBody
            
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
            // Body     | businessToAdAccountSharedAudienceUpdateWithRequiredBody



            payload = businessToAdAccountSharedAudienceUpdateWithRequiredBody.toJson().dump();

            int httpCode = sendRequest(url, "PATCH", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            BusinessToAdAccountSharedAudience obj(output_string);


            Response<BusinessToAdAccountSharedAudience> response(obj, httpCode);
            return response;
        }

        Response<
            BusinessToBusinessSharedAudience
        >
        AudienceSharingApi::
        updateBusinessToBusinessSharedAudience(
            
            std::string businessId
            , 
            
            BusinessToBusinessSharedAudienceUpdateWithRequiredBody businessToBusinessSharedAudienceUpdateWithRequiredBody
            
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
            // Body     | businessToBusinessSharedAudienceUpdateWithRequiredBody



            payload = businessToBusinessSharedAudienceUpdateWithRequiredBody.toJson().dump();

            int httpCode = sendRequest(url, "PATCH", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            BusinessToBusinessSharedAudience obj(output_string);


            Response<BusinessToBusinessSharedAudience> response(obj, httpCode);
            return response;
        }



