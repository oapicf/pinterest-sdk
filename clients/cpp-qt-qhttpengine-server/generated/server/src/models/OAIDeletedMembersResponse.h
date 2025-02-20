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
 * OAIDeletedMembersResponse.h
 *
 * An object with a list of members that were deleted.
 */

#ifndef OAIDeletedMembersResponse_H
#define OAIDeletedMembersResponse_H

#include <QJsonObject>

#include <QList>
#include <QString>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAIDeletedMembersResponse : public OAIObject {
public:
    OAIDeletedMembersResponse();
    OAIDeletedMembersResponse(QString json);
    ~OAIDeletedMembersResponse() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    QList<QString> getDeletedMembers() const;
    void setDeletedMembers(const QList<QString> &deleted_members);
    bool is_deleted_members_Set() const;
    bool is_deleted_members_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    QList<QString> deleted_members;
    bool m_deleted_members_isSet;
    bool m_deleted_members_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIDeletedMembersResponse)

#endif // OAIDeletedMembersResponse_H
