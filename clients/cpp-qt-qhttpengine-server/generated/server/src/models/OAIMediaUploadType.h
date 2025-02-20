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
 * OAIMediaUploadType.h
 *
 * 
 */

#ifndef OAIMediaUploadType_H
#define OAIMediaUploadType_H

#include <QJsonObject>


#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAIMediaUploadType : public OAIEnum {
public:
    OAIMediaUploadType();
    OAIMediaUploadType(QString json);
    ~OAIMediaUploadType() override;

    QString asJson() const override;
    QJsonValue asJsonValue() const override;
    void fromJsonValue(QJsonValue json) override;
    void fromJson(QString jsonString) override;

    enum class eOAIMediaUploadType {
        INVALID_VALUE_OPENAPI_GENERATED = 0,
        VIDEO
    };
    OAIMediaUploadType::eOAIMediaUploadType getValue() const;
    void setValue(const OAIMediaUploadType::eOAIMediaUploadType& value);
    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    eOAIMediaUploadType m_value;
    bool m_value_isSet;
    bool m_value_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIMediaUploadType)

#endif // OAIMediaUploadType_H
