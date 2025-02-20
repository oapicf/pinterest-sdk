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
 * OAIAudienceAccountType.h
 *
 * 
 */

#ifndef OAIAudienceAccountType_H
#define OAIAudienceAccountType_H

#include <QJsonObject>


#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAIAudienceAccountType : public OAIEnum {
public:
    OAIAudienceAccountType();
    OAIAudienceAccountType(QString json);
    ~OAIAudienceAccountType() override;

    QString asJson() const override;
    QJsonValue asJsonValue() const override;
    void fromJsonValue(QJsonValue json) override;
    void fromJson(QString jsonString) override;

    enum class eOAIAudienceAccountType {
        INVALID_VALUE_OPENAPI_GENERATED = 0,
        AD_ACCOUNT, 
        BUSINESS_ACCOUNT
    };
    OAIAudienceAccountType::eOAIAudienceAccountType getValue() const;
    void setValue(const OAIAudienceAccountType::eOAIAudienceAccountType& value);
    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    eOAIAudienceAccountType m_value;
    bool m_value_isSet;
    bool m_value_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIAudienceAccountType)

#endif // OAIAudienceAccountType_H
