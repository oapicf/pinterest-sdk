package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.DeletePartnersRequest;
import org.openapitools.server.api.model.DeletePartnersResponse;
import org.openapitools.server.api.model.DeletedMembersResponse;
import org.openapitools.server.api.model.Error;
import org.openapitools.server.api.model.GetBusinessEmployers200Response;
import org.openapitools.server.api.model.GetBusinessMembers200Response;
import org.openapitools.server.api.model.GetBusinessPartners200Response;
import org.openapitools.server.api.MainApiException;
import org.openapitools.server.api.model.MemberBusinessRole;
import org.openapitools.server.api.model.MembersToDeleteBody;
import org.openapitools.server.api.model.PartnerType;
import org.openapitools.server.api.model.UpdateMemberBusinessRoleBody;
import org.openapitools.server.api.model.UpdateMemberResultsResponseArray;

public final class BusinessAccessRelationshipsApiException extends MainApiException {
    public BusinessAccessRelationshipsApiException(int statusCode, String statusMessage) {
        super(statusCode, statusMessage);
    }

    public static final BusinessAccessRelationshipsApiException BusinessAccessRelationships_deleteBusinessMembership_200_Exception = new BusinessAccessRelationshipsApiException(200, "Success");
    public static final BusinessAccessRelationshipsApiException BusinessAccessRelationships_deleteBusinessPartners_200_Exception = new BusinessAccessRelationshipsApiException(200, "Success");
    public static final BusinessAccessRelationshipsApiException BusinessAccessRelationships_deleteBusinessPartners_404_Exception = new BusinessAccessRelationshipsApiException(404, "A supplied partner id doesn't exist");
    public static final BusinessAccessRelationshipsApiException BusinessAccessRelationships_getBusinessEmployers_200_Exception = new BusinessAccessRelationshipsApiException(200, "Success");
    public static final BusinessAccessRelationshipsApiException BusinessAccessRelationships_getBusinessMembers_200_Exception = new BusinessAccessRelationshipsApiException(200, "Success");
    public static final BusinessAccessRelationshipsApiException BusinessAccessRelationships_getBusinessPartners_200_Exception = new BusinessAccessRelationshipsApiException(200, "Success");
    public static final BusinessAccessRelationshipsApiException BusinessAccessRelationships_updateBusinessMemberships_200_Exception = new BusinessAccessRelationshipsApiException(200, "response");
    

}