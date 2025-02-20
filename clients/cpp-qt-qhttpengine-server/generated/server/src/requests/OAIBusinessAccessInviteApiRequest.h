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

#ifndef OAI_OAIBusinessAccessInviteApiRequest_H
#define OAI_OAIBusinessAccessInviteApiRequest_H

#include <QObject>
#include <QStringList>
#include <QMultiMap>
#include <QNetworkReply>
#include <QSharedPointer>

#include <qhttpengine/socket.h>
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
#include "OAIBusinessAccessInviteApiHandler.h"

namespace OpenAPI {

class OAIBusinessAccessInviteApiRequest : public QObject
{
    Q_OBJECT

public:
    OAIBusinessAccessInviteApiRequest(QHttpEngine::Socket *s, QSharedPointer<OAIBusinessAccessInviteApiHandler> handler);
    virtual ~OAIBusinessAccessInviteApiRequest();

    void assetAccessRequests_createRequest(const QString& business_id);
    void cancelInvitesOrRequestsRequest(const QString& business_id);
    void createAssetInvitesRequest(const QString& business_id);
    void createMembershipOrPartnershipInvitesRequest(const QString& business_id);
    void get_invitesRequest(const QString& business_id);
    void respondBusinessAccessInvitesRequest();
    

    void assetAccessRequests_createResponse(const OAICreateAssetAccessRequestResponse& res);
    void cancelInvitesOrRequestsResponse(const OAIDeleteInvitesResultsResponseArray& res);
    void createAssetInvitesResponse(const OAIUpdateInvitesResultsResponseArray& res);
    void createMembershipOrPartnershipInvitesResponse(const OAICreateInvitesResultsResponseArray& res);
    void get_invitesResponse(const OAIGet_invites_200_response& res);
    void respondBusinessAccessInvitesResponse(const OAIRespondToInvitesResponseArray& res);
    

    void assetAccessRequests_createError(const OAICreateAssetAccessRequestResponse& res, QNetworkReply::NetworkError error_type, QString& error_str);
    void cancelInvitesOrRequestsError(const OAIDeleteInvitesResultsResponseArray& res, QNetworkReply::NetworkError error_type, QString& error_str);
    void createAssetInvitesError(const OAIUpdateInvitesResultsResponseArray& res, QNetworkReply::NetworkError error_type, QString& error_str);
    void createMembershipOrPartnershipInvitesError(const OAICreateInvitesResultsResponseArray& res, QNetworkReply::NetworkError error_type, QString& error_str);
    void get_invitesError(const OAIGet_invites_200_response& res, QNetworkReply::NetworkError error_type, QString& error_str);
    void respondBusinessAccessInvitesError(const OAIRespondToInvitesResponseArray& res, QNetworkReply::NetworkError error_type, QString& error_str);
    

    void sendCustomResponse(QByteArray & res, QNetworkReply::NetworkError error_type);

    void sendCustomResponse(QIODevice *res, QNetworkReply::NetworkError error_type);

    QMap<QString, QString> getRequestHeaders() const;

    QHttpEngine::Socket* getRawSocket();

    void setResponseHeaders(const QMultiMap<QString,QString>& headers);

Q_SIGNALS:
    void assetAccessRequests_create(QString business_id, OAICreateAssetAccessRequestBody oai_create_asset_access_request_body);
    void cancelInvitesOrRequests(QString business_id, OAICancelInvitesBody oai_cancel_invites_body);
    void createAssetInvites(QString business_id, OAICreateAssetInvitesRequest oai_create_asset_invites_request);
    void createMembershipOrPartnershipInvites(QString business_id, OAICreateMembershipOrPartnershipInvitesBody oai_create_membership_or_partnership_invites_body);
    void get_invites(QString business_id, bool is_member, QList<QString> invite_status, OAIInviteType invite_type, QString bookmark, qint32 page_size);
    void respondBusinessAccessInvites(OAIAuthRespondInvitesBody oai_auth_respond_invites_body);
    

private:
    QMap<QString, QString> requestHeaders;
    QMap<QString, QString> responseHeaders;
    QHttpEngine::Socket  *socket;
    QSharedPointer<OAIBusinessAccessInviteApiHandler> handler;

    inline void setSocketResponseHeaders(){
        QHttpEngine::Socket::HeaderMap resHeaders;
        for(auto itr = responseHeaders.begin(); itr != responseHeaders.end(); ++itr) {
            resHeaders.insert(itr.key().toUtf8(), itr.value().toUtf8());
        }
        socket->setHeaders(resHeaders);
    }
};

}

#endif // OAI_OAIBusinessAccessInviteApiRequest_H
