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
 * OAIProductAvailabilityType.h
 *
 * Default availability for products in a feed.
 */

#ifndef OAIProductAvailabilityType_H
#define OAIProductAvailabilityType_H

#include <QJsonObject>


#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAIProductAvailabilityType : public OAIEnum {
public:
    OAIProductAvailabilityType();
    OAIProductAvailabilityType(QString json);
    ~OAIProductAvailabilityType() override;

    QString asJson() const override;
    QJsonValue asJsonValue() const override;
    void fromJsonValue(QJsonValue json) override;
    void fromJson(QString jsonString) override;

    enum class eOAIProductAvailabilityType {
        INVALID_VALUE_OPENAPI_GENERATED = 0,
        IN_STOCK, 
        OUT_OF_STOCK, 
        PREORDER
    };
    OAIProductAvailabilityType::eOAIProductAvailabilityType getValue() const;
    void setValue(const OAIProductAvailabilityType::eOAIProductAvailabilityType& value);
    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    eOAIProductAvailabilityType m_value;
    bool m_value_isSet;
    bool m_value_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIProductAvailabilityType)

#endif // OAIProductAvailabilityType_H
