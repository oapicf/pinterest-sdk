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
 * OAIInviteType.h
 *
 * The type of invite. &lt;br&gt;&#39;MEMBER_INVITE&#39; is to invite a member to access your business assets. &lt;br&gt;&#39;PARTNER INVITE&#39; is to invite a partner to access your business assets. &lt;br&gt;&#39;PARTNER_REQUEST&#39; is to request access a partner&#39;s business assets.
 */

#ifndef OAIInviteType_H
#define OAIInviteType_H

#include <QJsonObject>


#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAIInviteType : public OAIEnum {
public:
    OAIInviteType();
    OAIInviteType(QString json);
    ~OAIInviteType() override;

    QString asJson() const override;
    QJsonValue asJsonValue() const override;
    void fromJsonValue(QJsonValue json) override;
    void fromJson(QString jsonString) override;

    enum class eOAIInviteType {
        INVALID_VALUE_OPENAPI_GENERATED = 0,
        MEMBER_INVITE, 
        PARTNER_INVITE, 
        PARTNER_REQUEST
    };
    OAIInviteType::eOAIInviteType getValue() const;
    void setValue(const OAIInviteType::eOAIInviteType& value);
    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    eOAIInviteType m_value;
    bool m_value_isSet;
    bool m_value_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIInviteType)

#endif // OAIInviteType_H
