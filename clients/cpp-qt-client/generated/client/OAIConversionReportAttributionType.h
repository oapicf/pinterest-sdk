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
 * OAIConversionReportAttributionType.h
 *
 * Attribution type. Refers to the Pinterest Tag endpoints
 */

#ifndef OAIConversionReportAttributionType_H
#define OAIConversionReportAttributionType_H

#include <QJsonObject>


#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAIConversionReportAttributionType : public OAIEnum {
public:
    OAIConversionReportAttributionType();
    OAIConversionReportAttributionType(QString json);
    ~OAIConversionReportAttributionType() override;

    QString asJson() const override;
    QJsonValue asJsonValue() const override;
    void fromJsonValue(QJsonValue json) override;
    void fromJson(QString jsonString) override;

    enum class eOAIConversionReportAttributionType {
        INVALID_VALUE_OPENAPI_GENERATED = 0,
        INDIVIDUAL, 
        HOUSEHOLD
    };
    OAIConversionReportAttributionType::eOAIConversionReportAttributionType getValue() const;
    void setValue(const OAIConversionReportAttributionType::eOAIConversionReportAttributionType& value);
    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    eOAIConversionReportAttributionType m_value;
    bool m_value_isSet;
    bool m_value_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIConversionReportAttributionType)

#endif // OAIConversionReportAttributionType_H
