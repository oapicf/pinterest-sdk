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
 * OAIAdsAnalyticsFilterOperator.h
 *
 * Filter operator for sync reporting
 */

#ifndef OAIAdsAnalyticsFilterOperator_H
#define OAIAdsAnalyticsFilterOperator_H

#include <QJsonObject>


#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAIAdsAnalyticsFilterOperator : public OAIEnum {
public:
    OAIAdsAnalyticsFilterOperator();
    OAIAdsAnalyticsFilterOperator(QString json);
    ~OAIAdsAnalyticsFilterOperator() override;

    QString asJson() const override;
    QJsonValue asJsonValue() const override;
    void fromJsonValue(QJsonValue json) override;
    void fromJson(QString jsonString) override;

    enum class eOAIAdsAnalyticsFilterOperator {
        INVALID_VALUE_OPENAPI_GENERATED = 0,
        LESS_THAN, 
        GREATER_THAN
    };
    OAIAdsAnalyticsFilterOperator::eOAIAdsAnalyticsFilterOperator getValue() const;
    void setValue(const OAIAdsAnalyticsFilterOperator::eOAIAdsAnalyticsFilterOperator& value);
    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    eOAIAdsAnalyticsFilterOperator m_value;
    bool m_value_isSet;
    bool m_value_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIAdsAnalyticsFilterOperator)

#endif // OAIAdsAnalyticsFilterOperator_H
