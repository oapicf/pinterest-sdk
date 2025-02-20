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
 * OAIDeleteInvitesResultsResponseArray_items_inner.h
 *
 * 
 */

#ifndef OAIDeleteInvitesResultsResponseArray_items_inner_H
#define OAIDeleteInvitesResultsResponseArray_items_inner_H

#include <QJsonObject>

#include "OAIBaseInviteDataResponse.h"
#include "OAIDeleteInvitesResultsResponseArray_items_inner_exception.h"

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAIDeleteInvitesResultsResponseArray_items_inner : public OAIObject {
public:
    OAIDeleteInvitesResultsResponseArray_items_inner();
    OAIDeleteInvitesResultsResponseArray_items_inner(QString json);
    ~OAIDeleteInvitesResultsResponseArray_items_inner() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    OAIDeleteInvitesResultsResponseArray_items_inner_exception getException() const;
    void setException(const OAIDeleteInvitesResultsResponseArray_items_inner_exception &exception);
    bool is_exception_Set() const;
    bool is_exception_Valid() const;

    OAIBaseInviteDataResponse getInvite() const;
    void setInvite(const OAIBaseInviteDataResponse &invite);
    bool is_invite_Set() const;
    bool is_invite_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    OAIDeleteInvitesResultsResponseArray_items_inner_exception exception;
    bool m_exception_isSet;
    bool m_exception_isValid;

    OAIBaseInviteDataResponse invite;
    bool m_invite_isSet;
    bool m_invite_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIDeleteInvitesResultsResponseArray_items_inner)

#endif // OAIDeleteInvitesResultsResponseArray_items_inner_H
