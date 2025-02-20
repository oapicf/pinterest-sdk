/**
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.9.0).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package org.openapitools.api;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.rest.RestParamType;
import org.springframework.stereotype.Component;
import org.openapitools.model.*;
import org.apache.camel.model.rest.RestBindingMode;
import org.apache.camel.LoggingLevel;

@Component
public class BusinessAccessInviteApi extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        

        /**
        POST /businesses/{business_id}/requests/assets/access : Create a request to access an existing partner&#39;s assets.
        **/
        rest()
            .securityDefinitions()
                .oauth2("pinterest_oauth2")
                    .flow("accessCode")
                    .tokenUrl("https://api.pinterest.com/v5/oauth/token")
                    .authorizationUrl("https://www.pinterest.com/oauth/")
                        .withScope("biz_access:read","See business access data")
                        .withScope("biz_access:write","Create, update, or delete business access data")
                
            .endSecurityDefinition()
            .post("/businesses/{business_id}/requests/assets/access")
                .description("Create a request to access an existing partner's assets.")
                .id("assetAccessRequestsCreateApi")
                .produces("application/json")
                .outType(CreateAssetAccessRequestResponse.class)
                .consumes("application/json")
                .type(CreateAssetAccessRequestBody.class)
                
                .param()
                    .name("businessId")
                    .type(RestParamType.path)
                    .required(true)
                    .description("Unique identifier of the requesting business.")
                .endParam()
                .param()
                    .name("createAssetAccessRequestBody")
                    .type(RestParamType.body)
                    .required(true)
                .endParam()
                .to("direct:assetAccessRequestsCreate");
        

        /**
        DELETE /businesses/{business_id}/invites : Cancel invites/requests
        **/
        rest()
            .securityDefinitions()
                .oauth2("pinterest_oauth2")
                    .flow("accessCode")
                    .tokenUrl("https://api.pinterest.com/v5/oauth/token")
                    .authorizationUrl("https://www.pinterest.com/oauth/")
                        .withScope("biz_access:write","Create, update, or delete business access data")
                
            .endSecurityDefinition()
            .delete("/businesses/{business_id}/invites")
                .description("Cancel invites/requests")
                .id("cancelInvitesOrRequestsApi")
                .produces("application/json")
                .outType(DeleteInvitesResultsResponseArray.class)
                .consumes("application/json")
                .type(CancelInvitesBody.class)
                
                .param()
                    .name("businessId")
                    .type(RestParamType.path)
                    .required(true)
                    .description("Business id")
                .endParam()
                .param()
                    .name("cancelInvitesBody")
                    .type(RestParamType.body)
                    .required(true)
                    .description("A list with invite ids")
                .endParam()
                .to("direct:cancelInvitesOrRequests");
        

        /**
        POST /businesses/{business_id}/invites/assets/access : Update invite/request with an asset permission
        **/
        rest()
            .securityDefinitions()
                .oauth2("pinterest_oauth2")
                    .flow("accessCode")
                    .tokenUrl("https://api.pinterest.com/v5/oauth/token")
                    .authorizationUrl("https://www.pinterest.com/oauth/")
                        .withScope("biz_access:read","See business access data")
                        .withScope("biz_access:write","Create, update, or delete business access data")
                
            .endSecurityDefinition()
            .post("/businesses/{business_id}/invites/assets/access")
                .description("Update invite/request with an asset permission")
                .id("createAssetInvitesApi")
                .produces("application/json")
                .outType(UpdateInvitesResultsResponseArray.class)
                .consumes("application/json")
                .type(CreateAssetInvitesRequest.class)
                
                .param()
                    .name("businessId")
                    .type(RestParamType.path)
                    .required(true)
                    .description("Unique identifier of the requesting business.")
                .endParam()
                .param()
                    .name("createAssetInvitesRequest")
                    .type(RestParamType.body)
                    .required(true)
                    .description("A list of invites/requests together with the asset permissions to be assigned to the invite/request. ")
                .endParam()
                .to("direct:createAssetInvites");
        

        /**
        POST /businesses/{business_id}/invites : Create invites or requests
        **/
        rest()
            .securityDefinitions()
                .oauth2("pinterest_oauth2")
                    .flow("accessCode")
                    .tokenUrl("https://api.pinterest.com/v5/oauth/token")
                    .authorizationUrl("https://www.pinterest.com/oauth/")
                        .withScope("biz_access:write","Create, update, or delete business access data")
                
            .endSecurityDefinition()
            .post("/businesses/{business_id}/invites")
                .description("Create invites or requests")
                .id("createMembershipOrPartnershipInvitesApi")
                .produces("application/json")
                .outType(CreateInvitesResultsResponseArray.class)
                .consumes("application/json")
                .type(CreateMembershipOrPartnershipInvitesBody.class)
                
                .param()
                    .name("businessId")
                    .type(RestParamType.path)
                    .required(true)
                    .description("Business id")
                .endParam()
                .param()
                    .name("createMembershipOrPartnershipInvitesBody")
                    .type(RestParamType.body)
                    .required(true)
                    .description("An object with the properties: invite_type, partners, members, business_role")
                .endParam()
                .to("direct:createMembershipOrPartnershipInvites");
        

        /**
        GET /businesses/{business_id}/invites : Get invites/requests
        **/
        rest()
            .securityDefinitions()
                .oauth2("pinterest_oauth2")
                    .flow("accessCode")
                    .tokenUrl("https://api.pinterest.com/v5/oauth/token")
                    .authorizationUrl("https://www.pinterest.com/oauth/")
                        .withScope("biz_access:read","See business access data")
                
            .endSecurityDefinition()
            .get("/businesses/{business_id}/invites")
                .description("Get invites/requests")
                .id("getInvitesApi")
                .produces("application/json")
                .outType(GetInvites200Response.class)
                .param()
                    .name("businessId")
                    .type(RestParamType.path)
                    .required(true)
                    .description("Unique identifier of the requesting business.")
                .endParam()
                .param()
                    .name("isMember")
                    .type(RestParamType.query)
                    .required(false)
                    .description("A boolean field to indicate whether the invite is to create a partnership or a membership.")
                .endParam()
                .param()
                    .name("inviteStatus")
                    .type(RestParamType.query)
                    .required(false)
                    .description("A list of invite statuses to filter invites by. Only invites whose status is in the provided statuses will be returned.")
                .endParam()
                .param()
                    .name("inviteType")
                    .type(RestParamType.query)
                    .required(false)
                    .description("Invite type to filter invites by. Only invites of the specified type will be returned.")
                .endParam()
                .param()
                    .name("bookmark")
                    .type(RestParamType.query)
                    .required(false)
                    .description("Cursor used to fetch the next page of items")
                .endParam()
                .param()
                    .name("pageSize")
                    .type(RestParamType.query)
                    .required(false)
                    .description("Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.")
                .endParam()
                .to("direct:getInvites");
        

        /**
        PATCH /businesses/invites : Accept or decline an invite/request
        **/
        rest()
            .securityDefinitions()
                .oauth2("pinterest_oauth2")
                    .flow("accessCode")
                    .tokenUrl("https://api.pinterest.com/v5/oauth/token")
                    .authorizationUrl("https://www.pinterest.com/oauth/")
                        .withScope("biz_access:read","See business access data")
                        .withScope("biz_access:write","Create, update, or delete business access data")
                
            .endSecurityDefinition()
            .patch("/businesses/invites")
                .description("Accept or decline an invite/request")
                .id("respondBusinessAccessInvitesApi")
                .produces("application/json")
                .outType(RespondToInvitesResponseArray.class)
                .consumes("application/json")
                .type(AuthRespondInvitesBody.class)
                
                .param()
                    .name("authRespondInvitesBody")
                    .type(RestParamType.body)
                    .required(true)
                .endParam()
                .to("direct:respondBusinessAccessInvites");
        
    }
}
