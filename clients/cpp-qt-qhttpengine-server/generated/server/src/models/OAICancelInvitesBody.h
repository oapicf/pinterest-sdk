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
 * OAICancelInvitesBody.h
 *
 * Request body used to cancel invites
 */

#ifndef OAICancelInvitesBody_H
#define OAICancelInvitesBody_H

#include <QJsonObject>

#include <QList>
#include <QString>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAICancelInvitesBody : public OAIObject {
public:
    OAICancelInvitesBody();
    OAICancelInvitesBody(QString json);
    ~OAICancelInvitesBody() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    QList<QString> getInviteIds() const;
    void setInviteIds(const QList<QString> &invite_ids);
    bool is_invite_ids_Set() const;
    bool is_invite_ids_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    QList<QString> invite_ids;
    bool m_invite_ids_isSet;
    bool m_invite_ids_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAICancelInvitesBody)

#endif // OAICancelInvitesBody_H
