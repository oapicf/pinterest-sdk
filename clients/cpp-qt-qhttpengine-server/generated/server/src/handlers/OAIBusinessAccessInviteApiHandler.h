/**
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

#ifndef OAI_OAIBusinessAccessInviteApiHandler_H
#define OAI_OAIBusinessAccessInviteApiHandler_H

#include <QObject>

#include "OAIAuthRespondInvitesBody.h"
#include "OAICancelInvitesBody.h"
#include "OAICreateAssetAccessRequestBody.h"
#include "OAICreateAssetAccessRequestResponse.h"
#include "OAICreateAssetInvitesRequest.h"
#include "OAICreateInvitesResultsResponseArray.h"
#include "OAICreateMembershipOrPartnershipInvitesBody.h"
#include "OAIDeleteInvitesResultsResponseArray.h"
#include "OAIError.h"
#include "OAIGet_invites_200_response.h"
#include "OAIInviteType.h"
#include "OAIRespondToInvitesResponseArray.h"
#include "OAIUpdateInvitesResultsResponseArray.h"
#include <QList>
#include <QString>

namespace OpenAPI {

class OAIBusinessAccessInviteApiHandler : public QObject
{
    Q_OBJECT

public:
    OAIBusinessAccessInviteApiHandler();
    virtual ~OAIBusinessAccessInviteApiHandler();


public Q_SLOTS:
    virtual void assetAccessRequests_create(QString business_id, OAICreateAssetAccessRequestBody oai_create_asset_access_request_body);
    virtual void cancelInvitesOrRequests(QString business_id, OAICancelInvitesBody oai_cancel_invites_body);
    virtual void createAssetInvites(QString business_id, OAICreateAssetInvitesRequest oai_create_asset_invites_request);
    virtual void createMembershipOrPartnershipInvites(QString business_id, OAICreateMembershipOrPartnershipInvitesBody oai_create_membership_or_partnership_invites_body);
    virtual void get_invites(QString business_id, bool is_member, QList<QString> invite_status, OAIInviteType invite_type, QString bookmark, qint32 page_size);
    virtual void respondBusinessAccessInvites(OAIAuthRespondInvitesBody oai_auth_respond_invites_body);
    

};

}

#endif // OAI_OAIBusinessAccessInviteApiHandler_H
