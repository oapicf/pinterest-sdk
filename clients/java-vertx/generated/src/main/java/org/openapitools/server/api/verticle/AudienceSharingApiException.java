package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.AdAccountsAudiencesSharedAccountsList200Response;
import org.openapitools.server.api.model.AudienceAccountType;
import org.openapitools.server.api.model.AudiencesList200Response;
import org.openapitools.server.api.model.BusinessSharedAudience;
import org.openapitools.server.api.model.BusinessSharedAudienceResponse;
import org.openapitools.server.api.model.Error;
import org.openapitools.server.api.MainApiException;
import org.openapitools.server.api.model.SharedAudience;
import org.openapitools.server.api.model.SharedAudienceResponse;

public final class AudienceSharingApiException extends MainApiException {
    public AudienceSharingApiException(int statusCode, String statusMessage) {
        super(statusCode, statusMessage);
    }

    public static final AudienceSharingApiException AudienceSharing_adAccountsAudiencesSharedAccountsList_200_Exception = new AudienceSharingApiException(200, "Success");
    public static final AudienceSharingApiException AudienceSharing_adAccountsAudiencesSharedAccountsList_400_Exception = new AudienceSharingApiException(400, "Invalid ad account audiences shared accounts parameters.");
    public static final AudienceSharingApiException AudienceSharing_adAccountsAudiencesSharedAccountsList_404_Exception = new AudienceSharingApiException(404, "Shared accounts not found.");
    public static final AudienceSharingApiException AudienceSharing_businessAccountAudiencesSharedAccountsList_200_Exception = new AudienceSharingApiException(200, "Success");
    public static final AudienceSharingApiException AudienceSharing_businessAccountAudiencesSharedAccountsList_400_Exception = new AudienceSharingApiException(400, "Invalid business audiences shared accounts parameters.");
    public static final AudienceSharingApiException AudienceSharing_businessAccountAudiencesSharedAccountsList_404_Exception = new AudienceSharingApiException(404, "Shared accounts not found.");
    public static final AudienceSharingApiException AudienceSharing_sharedAudiencesForBusinessList_200_Exception = new AudienceSharingApiException(200, "Success");
    public static final AudienceSharingApiException AudienceSharing_sharedAudiencesForBusinessList_400_Exception = new AudienceSharingApiException(400, "Invalid parameters.");
    public static final AudienceSharingApiException AudienceSharing_updateAdAccountToAdAccountSharedAudience_200_Exception = new AudienceSharingApiException(200, "Success");
    public static final AudienceSharingApiException AudienceSharing_updateAdAccountToAdAccountSharedAudience_400_Exception = new AudienceSharingApiException(400, "Invalid ad account id.");
    public static final AudienceSharingApiException AudienceSharing_updateAdAccountToBusinessSharedAudience_200_Exception = new AudienceSharingApiException(200, "Success");
    public static final AudienceSharingApiException AudienceSharing_updateAdAccountToBusinessSharedAudience_400_Exception = new AudienceSharingApiException(400, "Invalid ad account id.");
    public static final AudienceSharingApiException AudienceSharing_updateBusinessToAdAccountSharedAudience_200_Exception = new AudienceSharingApiException(200, "Success");
    public static final AudienceSharingApiException AudienceSharing_updateBusinessToAdAccountSharedAudience_400_Exception = new AudienceSharingApiException(400, "Invalid parameters.");
    public static final AudienceSharingApiException AudienceSharing_updateBusinessToBusinessSharedAudience_200_Exception = new AudienceSharingApiException(200, "Success");
    public static final AudienceSharingApiException AudienceSharing_updateBusinessToBusinessSharedAudience_400_Exception = new AudienceSharingApiException(400, "Invalid parameters.");
    

}