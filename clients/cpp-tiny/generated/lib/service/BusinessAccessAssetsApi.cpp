#include "BusinessAccessAssetsApi.h"

using namespace Tiny;



        Response<
            AssetGroupInput
        >
        BusinessAccessAssetsApi::
        assetGroup_create(
            
            std::string businessId
            , 
            
            AssetGroupInputCreate assetGroupInputCreate
            
        )
        {
            std::string url = basepath + "/businesses/{business_id}/asset_groups"; //businessId 


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
            // METHOD | POST
            // Body     | assetGroupInputCreate



            payload = assetGroupInputCreate.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            AssetGroupInput obj(output_string);


            Response<AssetGroupInput> response(obj, httpCode);
            return response;
        }

        Response<
            AssetGroupDeletion
        >
        BusinessAccessAssetsApi::
        assetGroup_delete(
            
            std::string businessId
            , 
            
            AssetGroupDeletionDelete assetGroupDeletionDelete
            
        )
        {
            std::string url = basepath + "/businesses/{business_id}/asset_groups"; //businessId 


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
            // Body     | assetGroupDeletionDelete



            payload = assetGroupDeletionDelete.toJson().dump();

            int httpCode = sendRequest(url, "DELETE", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            AssetGroupDeletion obj(output_string);


            Response<AssetGroupDeletion> response(obj, httpCode);
            return response;
        }

        Response<
            AssetGroupModification
        >
        BusinessAccessAssetsApi::
        assetGroup_update(
            
            std::string businessId
            , 
            
            AssetGroupModificationReadOrUpdate assetGroupModificationReadOrUpdate
            
        )
        {
            std::string url = basepath + "/businesses/{business_id}/asset_groups"; //businessId 


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
            // Body     | assetGroupModificationReadOrUpdate



            payload = assetGroupModificationReadOrUpdate.toJson().dump();

            int httpCode = sendRequest(url, "PATCH", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            AssetGroupModification obj(output_string);


            Response<AssetGroupModification> response(obj, httpCode);
            return response;
        }

        Response<
            Business_asset_members_get_200_response
        >
        BusinessAccessAssetsApi::
        businessAssetMembers_get(
            
            std::string businessId
            , 
            
            std::string assetId
            , 
            
            int startIndex
            , 
            
            bool fetchSystemUsers
            , 
            
            std::string bookmark
            , 
            
            int pageSize
            
        )
        {
            std::string url = basepath + "/businesses/{business_id}/assets/{asset_id}/members"; //businessId assetId 


            // Headers  | 

            // Query    | startIndex fetchSystemUsers bookmark pageSize 
            addQueryParam("start_index",startIndex);
            addQueryParam("fetch_system_users",fetchSystemUsers);
            addQueryParam("bookmark",bookmark);
            addQueryParam("page_size",pageSize);

            // Form     | 



                std::string s_businessId("{");
                s_businessId.append("business_id");
                s_businessId.append("}");

                int pos = url.find(s_businessId);

                url.erase(pos, s_businessId.length());
                url.insert(pos, stringify(businessId));
                std::string s_assetId("{");
                s_assetId.append("asset_id");
                s_assetId.append("}");

                int pos = url.find(s_assetId);

                url.erase(pos, s_assetId.length());
                url.insert(pos, stringify(assetId));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            Business_asset_members_get_200_response obj(output_string);


            Response<Business_asset_members_get_200_response> response(obj, httpCode);
            return response;
        }

        Response<
            Business_asset_members_get_200_response
        >
        BusinessAccessAssetsApi::
        businessAssetPartners_get(
            
            std::string businessId
            , 
            
            std::string assetId
            , 
            
            int startIndex
            , 
            
            std::string bookmark
            , 
            
            int pageSize
            
        )
        {
            std::string url = basepath + "/businesses/{business_id}/assets/{asset_id}/partners"; //businessId assetId 


            // Headers  | 

            // Query    | startIndex bookmark pageSize 
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
                std::string s_assetId("{");
                s_assetId.append("asset_id");
                s_assetId.append("}");

                int pos = url.find(s_assetId);

                url.erase(pos, s_assetId.length());
                url.insert(pos, stringify(assetId));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            Business_asset_members_get_200_response obj(output_string);


            Response<Business_asset_members_get_200_response> response(obj, httpCode);
            return response;
        }

        Response<
            Business_assets_get_200_response
        >
        BusinessAccessAssetsApi::
        businessAssets_get(
            
            std::string businessId
            , 
            std::list<PermissionsWithOwner> permissions
            
            , 
            
            std::string childAssetId
            , 
            
            std::string assetGroupId
            , 
            
            std::string assetType
            , 
            
            int startIndex
            , 
            
            std::string bookmark
            , 
            
            int pageSize
            
        )
        {
            std::string url = basepath + "/businesses/{business_id}/assets"; //businessId 


            // Headers  | 

            // Query    | permissions childAssetId assetGroupId assetType startIndex bookmark pageSize 
            for (auto &x : permissions){
                addQueryParam("permissions", std::string(x));
            }
            addQueryParam("child_asset_id",childAssetId);
            addQueryParam("asset_group_id",assetGroupId);
            addQueryParam("asset_type",assetType);
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




            Business_assets_get_200_response obj(output_string);


            Response<Business_assets_get_200_response> response(obj, httpCode);
            return response;
        }

        Response<
            BusinessMemberAssetsGetResponse
        >
        BusinessAccessAssetsApi::
        businessMemberAssets_get(
            
            std::string businessId
            , 
            
            std::string memberId
            , 
            
            std::string assetType
            , 
            
            int startIndex
            , 
            
            AssetSortBy sortBy
            , 
            
            bool sortAscending
            , 
            
            AssetSearchBy searchBy
            , 
            
            std::string searchValue
            , 
            
            AssetPermissionType assetPermissionType
            , 
            std::list<NonDraftEntityStatus> adAccountStatuses
            
            , 
            
            std::string bookmark
            , 
            
            int pageSize
            
        )
        {
            std::string url = basepath + "/businesses/{business_id}/members/{member_id}/assets"; //businessId memberId 


            // Headers  | 

            // Query    | assetType startIndex sortBy sortAscending searchBy searchValue assetPermissionType adAccountStatuses bookmark pageSize 
            addQueryParam("asset_type",assetType);
            addQueryParam("start_index",startIndex);
            addQueryParam("sort_by",sortBy);
            addQueryParam("sort_ascending",sortAscending);
            addQueryParam("search_by",searchBy);
            addQueryParam("search_value",searchValue);
            addQueryParam("asset_permission_type",assetPermissionType);
            for (auto &x : adAccountStatuses){
                addQueryParam("ad_account_statuses", std::string(x));
            }
            addQueryParam("bookmark",bookmark);
            addQueryParam("page_size",pageSize);

            // Form     | 



                std::string s_businessId("{");
                s_businessId.append("business_id");
                s_businessId.append("}");

                int pos = url.find(s_businessId);

                url.erase(pos, s_businessId.length());
                url.insert(pos, stringify(businessId));
                std::string s_memberId("{");
                s_memberId.append("member_id");
                s_memberId.append("}");

                int pos = url.find(s_memberId);

                url.erase(pos, s_memberId.length());
                url.insert(pos, stringify(memberId));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            BusinessMemberAssetsGetResponse obj(output_string);


            Response<BusinessMemberAssetsGetResponse> response(obj, httpCode);
            return response;
        }

        Response<
            DeleteMemberAccessResultsResponseArray
        >
        BusinessAccessAssetsApi::
        businessMembersAssetAccess_delete(
            
            std::string businessId
            , 
            
            BusinessMembersAssetAccessDeleteBody businessMembersAssetAccessDeleteBody
            
        )
        {
            std::string url = basepath + "/businesses/{business_id}/members/assets/access"; //businessId 


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
            // Body     | businessMembersAssetAccessDeleteBody



            payload = businessMembersAssetAccessDeleteBody.toJson().dump();

            int httpCode = sendRequest(url, "DELETE", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            DeleteMemberAccessResultsResponseArray obj(output_string);


            Response<DeleteMemberAccessResultsResponseArray> response(obj, httpCode);
            return response;
        }

        Response<
            UpdateMemberAssetsResultsResponseArray
        >
        BusinessAccessAssetsApi::
        businessMembersAssetAccess_update(
            
            std::string businessId
            , 
            
            UpdateMemberAssetAccessBody updateMemberAssetAccessBody
            
        )
        {
            std::string url = basepath + "/businesses/{business_id}/members/assets/access"; //businessId 


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
            // Body     | updateMemberAssetAccessBody



            payload = updateMemberAssetAccessBody.toJson().dump();

            int httpCode = sendRequest(url, "PATCH", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            UpdateMemberAssetsResultsResponseArray obj(output_string);


            Response<UpdateMemberAssetsResultsResponseArray> response(obj, httpCode);
            return response;
        }

        Response<
            Business_partner_asset_access_get_200_response
        >
        BusinessAccessAssetsApi::
        businessPartnerAssetAccess_get(
            
            std::string businessId
            , 
            
            std::string partnerId
            , 
            
            std::string partnerType
            , 
            
            std::string assetType
            , 
            
            int startIndex
            , 
            
            AssetSortBy sortBy
            , 
            
            bool sortAscending
            , 
            
            AssetSearchBy searchBy
            , 
            
            std::string searchValue
            , 
            
            std::string bookmark
            , 
            
            int pageSize
            
        )
        {
            std::string url = basepath + "/businesses/{business_id}/partners/{partner_id}/assets"; //businessId partnerId 


            // Headers  | 

            // Query    | partnerType assetType startIndex sortBy sortAscending searchBy searchValue bookmark pageSize 
            addQueryParam("partner_type",partnerType);
            addQueryParam("asset_type",assetType);
            addQueryParam("start_index",startIndex);
            addQueryParam("sort_by",sortBy);
            addQueryParam("sort_ascending",sortAscending);
            addQueryParam("search_by",searchBy);
            addQueryParam("search_value",searchValue);
            addQueryParam("bookmark",bookmark);
            addQueryParam("page_size",pageSize);

            // Form     | 



                std::string s_businessId("{");
                s_businessId.append("business_id");
                s_businessId.append("}");

                int pos = url.find(s_businessId);

                url.erase(pos, s_businessId.length());
                url.insert(pos, stringify(businessId));
                std::string s_partnerId("{");
                s_partnerId.append("partner_id");
                s_partnerId.append("}");

                int pos = url.find(s_partnerId);

                url.erase(pos, s_partnerId.length());
                url.insert(pos, stringify(partnerId));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            Business_partner_asset_access_get_200_response obj(output_string);


            Response<Business_partner_asset_access_get_200_response> response(obj, httpCode);
            return response;
        }

        Response<
            DeletePartnerAssetAccessResultsResponseArray
        >
        BusinessAccessAssetsApi::
        deletePartnerAssetAccessHandlerImpl(
            
            std::string businessId
            , 
            
            DeletePartnerAssetAccessBody deletePartnerAssetAccessBody
            
        )
        {
            std::string url = basepath + "/businesses/{business_id}/partners/assets"; //businessId 


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
            // Body     | deletePartnerAssetAccessBody



            payload = deletePartnerAssetAccessBody.toJson().dump();

            int httpCode = sendRequest(url, "DELETE", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            DeletePartnerAssetAccessResultsResponseArray obj(output_string);


            Response<DeletePartnerAssetAccessResultsResponseArray> response(obj, httpCode);
            return response;
        }

        Response<
            UpdatePartnerAssetsResultsResponseArray
        >
        BusinessAccessAssetsApi::
        updatePartnerAssetAccessHandlerImpl(
            
            std::string businessId
            , 
            
            UpdatePartnerAssetAccessBody updatePartnerAssetAccessBody
            
        )
        {
            std::string url = basepath + "/businesses/{business_id}/partners/assets"; //businessId 


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
            // Body     | updatePartnerAssetAccessBody



            payload = updatePartnerAssetAccessBody.toJson().dump();

            int httpCode = sendRequest(url, "PATCH", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            UpdatePartnerAssetsResultsResponseArray obj(output_string);


            Response<UpdatePartnerAssetsResultsResponseArray> response(obj, httpCode);
            return response;
        }



