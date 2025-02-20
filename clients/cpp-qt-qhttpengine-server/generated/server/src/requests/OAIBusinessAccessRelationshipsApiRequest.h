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

#ifndef OAI_OAIBusinessAccessRelationshipsApiRequest_H
#define OAI_OAIBusinessAccessRelationshipsApiRequest_H

#include <QObject>
#include <QStringList>
#include <QMultiMap>
#include <QNetworkReply>
#include <QSharedPointer>

#include <qhttpengine/socket.h>
#include "OAIDeletePartnersRequest.h"
#include "OAIDeletePartnersResponse.h"
#include "OAIDeletedMembersResponse.h"
#include "OAIError.h"
#include "OAIGet_business_employers_200_response.h"
#include "OAIGet_business_members_200_response.h"
#include "OAIGet_business_partners_200_response.h"
#include "OAIMemberBusinessRole.h"
#include "OAIMembersToDeleteBody.h"
#include "OAIPartnerType.h"
#include "OAIUpdateMemberBusinessRoleBody.h"
#include "OAIUpdateMemberResultsResponseArray.h"
#include <QList>
#include <QString>
#include "OAIBusinessAccessRelationshipsApiHandler.h"

namespace OpenAPI {

class OAIBusinessAccessRelationshipsApiRequest : public QObject
{
    Q_OBJECT

public:
    OAIBusinessAccessRelationshipsApiRequest(QHttpEngine::Socket *s, QSharedPointer<OAIBusinessAccessRelationshipsApiHandler> handler);
    virtual ~OAIBusinessAccessRelationshipsApiRequest();

    void deleteBusinessMembershipRequest(const QString& business_id);
    void deleteBusinessPartnersRequest(const QString& business_id);
    void get_businessEmployersRequest();
    void get_businessMembersRequest(const QString& business_id);
    void get_businessPartnersRequest(const QString& business_id);
    void update_businessMembershipsRequest(const QString& business_id);
    

    void deleteBusinessMembershipResponse(const OAIDeletedMembersResponse& res);
    void deleteBusinessPartnersResponse(const OAIDeletePartnersResponse& res);
    void get_businessEmployersResponse(const OAIGet_business_employers_200_response& res);
    void get_businessMembersResponse(const OAIGet_business_members_200_response& res);
    void get_businessPartnersResponse(const OAIGet_business_partners_200_response& res);
    void update_businessMembershipsResponse(const OAIUpdateMemberResultsResponseArray& res);
    

    void deleteBusinessMembershipError(const OAIDeletedMembersResponse& res, QNetworkReply::NetworkError error_type, QString& error_str);
    void deleteBusinessPartnersError(const OAIDeletePartnersResponse& res, QNetworkReply::NetworkError error_type, QString& error_str);
    void get_businessEmployersError(const OAIGet_business_employers_200_response& res, QNetworkReply::NetworkError error_type, QString& error_str);
    void get_businessMembersError(const OAIGet_business_members_200_response& res, QNetworkReply::NetworkError error_type, QString& error_str);
    void get_businessPartnersError(const OAIGet_business_partners_200_response& res, QNetworkReply::NetworkError error_type, QString& error_str);
    void update_businessMembershipsError(const OAIUpdateMemberResultsResponseArray& res, QNetworkReply::NetworkError error_type, QString& error_str);
    

    void sendCustomResponse(QByteArray & res, QNetworkReply::NetworkError error_type);

    void sendCustomResponse(QIODevice *res, QNetworkReply::NetworkError error_type);

    QMap<QString, QString> getRequestHeaders() const;

    QHttpEngine::Socket* getRawSocket();

    void setResponseHeaders(const QMultiMap<QString,QString>& headers);

Q_SIGNALS:
    void deleteBusinessMembership(QString business_id, OAIMembersToDeleteBody oai_members_to_delete_body);
    void deleteBusinessPartners(QString business_id, OAIDeletePartnersRequest oai_delete_partners_request);
    void get_businessEmployers(qint32 page_size, QString bookmark);
    void get_businessMembers(QString business_id, bool assets_summary, QList<OAIMemberBusinessRole> business_roles, QString member_ids, qint32 start_index, QString bookmark, qint32 page_size);
    void get_businessPartners(QString business_id, bool assets_summary, OAIPartnerType partner_type, QString partner_ids, qint32 start_index, qint32 page_size, QString bookmark);
    void update_businessMemberships(QString business_id, QList<OAIUpdateMemberBusinessRoleBody> oai_update_member_business_role_body);
    

private:
    QMap<QString, QString> requestHeaders;
    QMap<QString, QString> responseHeaders;
    QHttpEngine::Socket  *socket;
    QSharedPointer<OAIBusinessAccessRelationshipsApiHandler> handler;

    inline void setSocketResponseHeaders(){
        QHttpEngine::Socket::HeaderMap resHeaders;
        for(auto itr = responseHeaders.begin(); itr != responseHeaders.end(); ++itr) {
            resHeaders.insert(itr.key().toUtf8(), itr.value().toUtf8());
        }
        socket->setHeaders(resHeaders);
    }
};

}

#endif // OAI_OAIBusinessAccessRelationshipsApiRequest_H
