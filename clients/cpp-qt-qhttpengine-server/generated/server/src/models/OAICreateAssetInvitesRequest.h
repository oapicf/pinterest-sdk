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

/*
 * OAICreateAssetInvitesRequest.h
 *
 * Request body for updating asset roles for existing invites.
 */

#ifndef OAICreateAssetInvitesRequest_H
#define OAICreateAssetInvitesRequest_H

#include <QJsonObject>

#include "OAICreateAssetInvitesRequestItem.h"
#include <QList>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAICreateAssetInvitesRequest : public OAIObject {
public:
    OAICreateAssetInvitesRequest();
    OAICreateAssetInvitesRequest(QString json);
    ~OAICreateAssetInvitesRequest() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    QList<OAICreateAssetInvitesRequestItem> getInvites() const;
    void setInvites(const QList<OAICreateAssetInvitesRequestItem> &invites);
    bool is_invites_Set() const;
    bool is_invites_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    QList<OAICreateAssetInvitesRequestItem> invites;
    bool m_invites_isSet;
    bool m_invites_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAICreateAssetInvitesRequest)

#endif // OAICreateAssetInvitesRequest_H
