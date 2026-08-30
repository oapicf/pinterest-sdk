#include "BusinessAccessRelationshipsApi.h"

using namespace Tiny;



        Response<
            BrandAccount
        >
        BusinessAccessRelationshipsApi::
        brandAccounts_create(
            
            std::string businessHierarchyId
            , 
            
            BrandAccountCreate brandAccountCreate
            
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
            // Body     | brandAccountCreate



            payload = brandAccountCreate.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            BrandAccount obj(output_string);


            Response<BrandAccount> response(obj, httpCode);
            return response;
        }

        Response<
            BrandAccount
        >
        BusinessAccessRelationshipsApi::
        brandAccounts_update(
            
            std::string brandAccountId
            , 
            
            std::string businessHierarchyId
            , 
            
            BrandAccountUpdate brandAccountUpdate
            
        )
        {
            std::string url = basepath + "/business_access/business_hierarchy/{business_hierarchy_id}/brand_accounts/{brand_account_id}"; //brandAccountId businessHierarchyId 


            // Headers  | 

            // Query    | 

            // Form     | 
            addHeader("Content-Type", "application/json");



                std::string s_brandAccountId("{");
                s_brandAccountId.append("brand_account_id");
                s_brandAccountId.append("}");

                int pos = url.find(s_brandAccountId);

                url.erase(pos, s_brandAccountId.length());
                url.insert(pos, stringify(brandAccountId));
                std::string s_businessHierarchyId("{");
                s_businessHierarchyId.append("business_hierarchy_id");
                s_businessHierarchyId.append("}");

                int pos = url.find(s_businessHierarchyId);

                url.erase(pos, s_businessHierarchyId.length());
                url.insert(pos, stringify(businessHierarchyId));


            std::string payload = "";
            // Send Request
            // METHOD | PATCH
            // Body     | brandAccountUpdate



            payload = brandAccountUpdate.toJson().dump();

            int httpCode = sendRequest(url, "PATCH", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            BrandAccount obj(output_string);


            Response<BrandAccount> response(obj, httpCode);
            return response;
        }

        Response<
            Delete_business_membership_200_response
        >
        BusinessAccessRelationshipsApi::
        deleteBusinessMembership(
            
            std::string businessId
            , 
            
            DeleteBusinessMembershipBody deleteBusinessMembershipBody
            
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
            // Body     | deleteBusinessMembershipBody



            payload = deleteBusinessMembershipBody.toJson().dump();

            int httpCode = sendRequest(url, "DELETE", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            Delete_business_membership_200_response obj(output_string);


            Response<Delete_business_membership_200_response> response(obj, httpCode);
            return response;
        }

        Response<
            DeleteBusinessPartners
        >
        BusinessAccessRelationshipsApi::
        deleteBusinessPartners(
            
            std::string businessId
            , 
            
            DeleteBusinessPartnersDelete deleteBusinessPartnersDelete
            
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
            // Body     | deleteBusinessPartnersDelete



            payload = deleteBusinessPartnersDelete.toJson().dump();

            int httpCode = sendRequest(url, "DELETE", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            DeleteBusinessPartners obj(output_string);


            Response<DeleteBusinessPartners> response(obj, httpCode);
            return response;
        }

        Response<
            Get_business_employers_200_response
        >
        BusinessAccessRelationshipsApi::
        get_businessEmployers(
            
            bool assetsSummary
            , 
            
            std::string bookmark
            , 
            
            int pageSize
            
        )
        {
            std::string url = basepath + "/businesses/employers"; //


            // Headers  | 

            // Query    | assetsSummary bookmark pageSize 
            addQueryParam("assets_summary",assetsSummary);
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




            Get_business_employers_200_response obj(output_string);


            Response<Get_business_employers_200_response> response(obj, httpCode);
            return response;
        }

        Response<
            Get_business_employers_200_response
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




            Get_business_employers_200_response obj(output_string);


            Response<Get_business_employers_200_response> response(obj, httpCode);
            return response;
        }

        Response<
            Get_business_employers_200_response
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
            
            bool sortAscending
            , 
            
            std::string bookmark
            , 
            
            int pageSize
            
        )
        {
            std::string url = basepath + "/businesses/{business_id}/partners"; //businessId 


            // Headers  | 

            // Query    | assetsSummary partnerType partnerIds startIndex sortAscending bookmark pageSize 
            addQueryParam("assets_summary",assetsSummary);
            addQueryParam("partner_type",partnerType);
            addQueryParam("partner_ids",partnerIds);
            addQueryParam("start_index",startIndex);
            addQueryParam("sort_ascending",sortAscending);
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




            Get_business_employers_200_response obj(output_string);


            Response<Get_business_employers_200_response> response(obj, httpCode);
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
            
            SystemUserUpdateWithRequiredBody systemUserUpdateWithRequiredBody
            
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
            // Body     | systemUserUpdateWithRequiredBody



            payload = systemUserUpdateWithRequiredBody.toJson().dump();

            int httpCode = sendRequest(url, "PATCH", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            UpdateBusinessMembershipsResponse
        >
        BusinessAccessRelationshipsApi::
        update_businessMemberships(
            
            std::string businessId
            , 
            std::list<BusinessMembershipMember> businessMembershipMember
            
            
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
            // Body     | businessMembershipMember


            bourne::json tmp_arr = bourne::json::array();
            for(auto& var : businessMembershipMember)
            {
                auto tmp = var.toJson();
                tmp_arr.append(tmp);

            }
            payload = tmp_arr.dump();


            int httpCode = sendRequest(url, "PATCH", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            UpdateBusinessMembershipsResponse obj(output_string);


            Response<UpdateBusinessMembershipsResponse> response(obj, httpCode);
            return response;
        }



