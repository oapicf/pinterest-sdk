#include "BusinessAccessRelationshipsApi.h"

using namespace Tiny;



        Response<
            Brand_accounts_create_200_response
        >
        BusinessAccessRelationshipsApi::
        brandAccounts_create(
            
            std::string businessHierarchyId
            , 
            
            Brand_accounts_create_request brandAccountsCreateRequest
            
        )
        {
            std::string url = basepath + "/business_access/business_hierarchy/{business_hierarchy_id}/brand_accounts"; //businessHierarchyId 


            // Headers  | 

            // Query    | 

            // Form     | 
            addHeader("Content-Type", "application/json");



                std::string s_businessHierarchyId("{");
                s_businessHierarchyId.append("business_hierarchy_id");
                s_businessHierarchyId.append("}");

                int pos = url.find(s_businessHierarchyId);

                url.erase(pos, s_businessHierarchyId.length());
                url.insert(pos, stringify(businessHierarchyId));


            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | brandAccountsCreateRequest



            payload = brandAccountsCreateRequest.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            Brand_accounts_create_200_response obj(output_string);


            Response<Brand_accounts_create_200_response> response(obj, httpCode);
            return response;
        }

        Response<
            Brand_accounts_create_200_response
        >
        BusinessAccessRelationshipsApi::
        brandAccounts_update(
            
            std::string businessHierarchyId
            , 
            
            std::string brandAccountId
            , 
            
            Brand_accounts_update_request brandAccountsUpdateRequest
            
        )
        {
            std::string url = basepath + "/business_access/business_hierarchy/{business_hierarchy_id}/brand_accounts/{brand_account_id}"; //businessHierarchyId brandAccountId 


            // Headers  | 

            // Query    | 

            // Form     | 
            addHeader("Content-Type", "application/json");



                std::string s_businessHierarchyId("{");
                s_businessHierarchyId.append("business_hierarchy_id");
                s_businessHierarchyId.append("}");

                int pos = url.find(s_businessHierarchyId);

                url.erase(pos, s_businessHierarchyId.length());
                url.insert(pos, stringify(businessHierarchyId));
                std::string s_brandAccountId("{");
                s_brandAccountId.append("brand_account_id");
                s_brandAccountId.append("}");

                int pos = url.find(s_brandAccountId);

                url.erase(pos, s_brandAccountId.length());
                url.insert(pos, stringify(brandAccountId));


            std::string payload = "";
            // Send Request
            // METHOD | PATCH
            // Body     | brandAccountsUpdateRequest



            payload = brandAccountsUpdateRequest.toJson().dump();

            int httpCode = sendRequest(url, "PATCH", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            Brand_accounts_create_200_response obj(output_string);


            Response<Brand_accounts_create_200_response> response(obj, httpCode);
            return response;
        }

        Response<
            DeletedMembersResponse
        >
        BusinessAccessRelationshipsApi::
        deleteBusinessMembership(
            
            std::string businessId
            , 
            
            MembersToDeleteBody membersToDeleteBody
            
        )
        {
            std::string url = basepath + "/businesses/{business_id}/members"; //businessId 


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
            // METHOD | DELETE
            // Body     | membersToDeleteBody



            payload = membersToDeleteBody.toJson().dump();

            int httpCode = sendRequest(url, "DELETE", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            DeletedMembersResponse obj(output_string);


            Response<DeletedMembersResponse> response(obj, httpCode);
            return response;
        }

        Response<
            DeletePartnersResponse
        >
        BusinessAccessRelationshipsApi::
        deleteBusinessPartners(
            
            std::string businessId
            , 
            
            DeletePartnersRequest deletePartnersRequest
            
        )
        {
            std::string url = basepath + "/businesses/{business_id}/partners"; //businessId 


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
            // METHOD | DELETE
            // Body     | deletePartnersRequest



            payload = deletePartnersRequest.toJson().dump();

            int httpCode = sendRequest(url, "DELETE", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            DeletePartnersResponse obj(output_string);


            Response<DeletePartnersResponse> response(obj, httpCode);
            return response;
        }

        Response<
            Get_business_employers_200_response
        >
        BusinessAccessRelationshipsApi::
        get_businessEmployers(
            
            int pageSize
            , 
            
            std::string bookmark
            
        )
        {
            std::string url = basepath + "/businesses/employers"; //


            // Headers  | 

            // Query    | pageSize bookmark 
            addQueryParam("page_size",pageSize);
            addQueryParam("bookmark",bookmark);

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            Get_business_employers_200_response obj(output_string);


            Response<Get_business_employers_200_response> response(obj, httpCode);
            return response;
        }

        Response<
            Get_business_members_200_response
        >
        BusinessAccessRelationshipsApi::
        get_businessMembers(
            
            std::string businessId
            , 
            
            bool fetchSystemUsers
            , 
            
            bool assetsSummary
            , 
            std::list<MemberBusinessRole> businessRoles
            
            , 
            
            std::string memberIds
            , 
            
            int startIndex
            , 
            
            std::string bookmark
            , 
            
            int pageSize
            
        )
        {
            std::string url = basepath + "/businesses/{business_id}/members"; //businessId 


            // Headers  | 

            // Query    | fetchSystemUsers assetsSummary businessRoles memberIds startIndex bookmark pageSize 
            addQueryParam("fetch_system_users",fetchSystemUsers);
            addQueryParam("assets_summary",assetsSummary);
            for (auto &x : businessRoles){
                addQueryParam("business_roles", std::string(x));
            }
            addQueryParam("member_ids",memberIds);
            addQueryParam("start_index",startIndex);
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




            Get_business_members_200_response obj(output_string);


            Response<Get_business_members_200_response> response(obj, httpCode);
            return response;
        }

        Response<
            Get_business_partners_200_response
        >
        BusinessAccessRelationshipsApi::
        get_businessPartners(
            
            std::string businessId
            , 
            
            bool assetsSummary
            , 
            
            PartnerType partnerType
            , 
            
            std::string partnerIds
            , 
            
            int startIndex
            , 
            
            int pageSize
            , 
            
            std::string bookmark
            
        )
        {
            std::string url = basepath + "/businesses/{business_id}/partners"; //businessId 


            // Headers  | 

            // Query    | assetsSummary partnerType partnerIds startIndex pageSize bookmark 
            addQueryParam("assets_summary",assetsSummary);
            addQueryParam("partner_type",partnerType);
            addQueryParam("partner_ids",partnerIds);
            addQueryParam("start_index",startIndex);
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




            Get_business_partners_200_response obj(output_string);


            Response<Get_business_partners_200_response> response(obj, httpCode);
            return response;
        }

        Response<
            String
        >
        BusinessAccessRelationshipsApi::
        systemUser_update(
            
            std::string businessId
            , 
            
            std::string systemUserId
            , 
            
            System_user_update_request systemUserUpdateRequest
            
        )
        {
            std::string url = basepath + "/businesses/{business_id}/system_users/{system_user_id}"; //businessId systemUserId 


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
                std::string s_systemUserId("{");
                s_systemUserId.append("system_user_id");
                s_systemUserId.append("}");

                int pos = url.find(s_systemUserId);

                url.erase(pos, s_systemUserId.length());
                url.insert(pos, stringify(systemUserId));


            std::string payload = "";
            // Send Request
            // METHOD | PATCH
            // Body     | systemUserUpdateRequest



            payload = systemUserUpdateRequest.toJson().dump();

            int httpCode = sendRequest(url, "PATCH", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            UpdateMemberResultsResponseArray
        >
        BusinessAccessRelationshipsApi::
        update_businessMemberships(
            
            std::string businessId
            , 
            std::list<UpdateMemberBusinessRoleBody> updateMemberBusinessRoleBody
            
            
        )
        {
            std::string url = basepath + "/businesses/{business_id}/members"; //businessId 


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
            // Body     | updateMemberBusinessRoleBody


            bourne::json tmp_arr = bourne::json::array();
            for(auto& var : updateMemberBusinessRoleBody)
            {
                auto tmp = var.toJson();
                tmp_arr.append(tmp);

            }
            payload = tmp_arr.dump();


            int httpCode = sendRequest(url, "PATCH", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            UpdateMemberResultsResponseArray obj(output_string);


            Response<UpdateMemberResultsResponseArray> response(obj, httpCode);
            return response;
        }



