#include "BusinessAccessInviteApi.h"

using namespace Tiny;



        Response<
            CreateAssetAccessRequestResponse
        >
        BusinessAccessInviteApi::
        assetAccessRequests_create(
            
            std::string businessId
            , 
            
            CreateAssetAccessRequestBody createAssetAccessRequestBody
            
        )
        {
            std::string url = basepath + "/businesses/{business_id}/requests/assets/access"; //businessId 


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
            // Body     | createAssetAccessRequestBody



            payload = createAssetAccessRequestBody.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            CreateAssetAccessRequestResponse obj(output_string);


            Response<CreateAssetAccessRequestResponse> response(obj, httpCode);
            return response;
        }

        Response<
            DeleteInvitesResultsResponseArray
        >
        BusinessAccessInviteApi::
        cancelInvitesOrRequests(
            
            std::string businessId
            , 
            
            CancelInvitesBody cancelInvitesBody
            
        )
        {
            std::string url = basepath + "/businesses/{business_id}/invites"; //businessId 


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
            // Body     | cancelInvitesBody



            payload = cancelInvitesBody.toJson().dump();

            int httpCode = sendRequest(url, "DELETE", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            DeleteInvitesResultsResponseArray obj(output_string);


            Response<DeleteInvitesResultsResponseArray> response(obj, httpCode);
            return response;
        }

        Response<
            UpdateInvitesResultsResponseArray
        >
        BusinessAccessInviteApi::
        createAssetInvites(
            
            std::string businessId
            , 
            
            CreateAssetInvitesRequest createAssetInvitesRequest
            
        )
        {
            std::string url = basepath + "/businesses/{business_id}/invites/assets/access"; //businessId 


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
            // Body     | createAssetInvitesRequest



            payload = createAssetInvitesRequest.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            UpdateInvitesResultsResponseArray obj(output_string);


            Response<UpdateInvitesResultsResponseArray> response(obj, httpCode);
            return response;
        }

        Response<
            CreateInvitesResultsResponseArray
        >
        BusinessAccessInviteApi::
        createMembershipOrPartnershipInvites(
            
            std::string businessId
            , 
            
            CreateMembershipOrPartnershipInvitesBody createMembershipOrPartnershipInvitesBody
            
        )
        {
            std::string url = basepath + "/businesses/{business_id}/invites"; //businessId 


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
            // Body     | createMembershipOrPartnershipInvitesBody



            payload = createMembershipOrPartnershipInvitesBody.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            CreateInvitesResultsResponseArray obj(output_string);


            Response<CreateInvitesResultsResponseArray> response(obj, httpCode);
            return response;
        }

        Response<
            Get_invites_200_response
        >
        BusinessAccessInviteApi::
        get_invites(
            
            std::string businessId
            , 
            
            bool isMember
            , 
            std::list<std::string> inviteStatus
            
            , 
            
            InviteType inviteType
            , 
            
            std::string bookmark
            , 
            
            int pageSize
            
        )
        {
            std::string url = basepath + "/businesses/{business_id}/invites"; //businessId 


            // Headers  | 

            // Query    | isMember inviteStatus inviteType bookmark pageSize 
            addQueryParam("is_member",isMember);
            for (auto &x : inviteStatus){
                addQueryParam("invite_status", std::string(x));
            }
            addQueryParam("invite_type",inviteType);
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




            Get_invites_200_response obj(output_string);


            Response<Get_invites_200_response> response(obj, httpCode);
            return response;
        }

        Response<
            RespondToInvitesResponseArray
        >
        BusinessAccessInviteApi::
        respondBusinessAccessInvites(
            
            AuthRespondInvitesBody authRespondInvitesBody
            
        )
        {
            std::string url = basepath + "/businesses/invites"; //


            // Headers  | 

            // Query    | 

            // Form     | 
            addHeader("Content-Type", "application/json");





            std::string payload = "";
            // Send Request
            // METHOD | PATCH
            // Body     | authRespondInvitesBody



            payload = authRespondInvitesBody.toJson().dump();

            int httpCode = sendRequest(url, "PATCH", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            RespondToInvitesResponseArray obj(output_string);


            Response<RespondToInvitesResponseArray> response(obj, httpCode);
            return response;
        }



