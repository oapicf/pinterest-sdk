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
 * OAIAdsAnalyticsFilterColumn.h
 *
 * Reporting columns for sync reporting data filter
 */

#ifndef OAIAdsAnalyticsFilterColumn_H
#define OAIAdsAnalyticsFilterColumn_H

#include <QJsonObject>


#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAIAdsAnalyticsFilterColumn : public OAIEnum {
public:
    OAIAdsAnalyticsFilterColumn();
    OAIAdsAnalyticsFilterColumn(QString json);
    ~OAIAdsAnalyticsFilterColumn() override;

    QString asJson() const override;
    QJsonValue asJsonValue() const override;
    void fromJsonValue(QJsonValue json) override;
    void fromJson(QString jsonString) override;

    enum class eOAIAdsAnalyticsFilterColumn {
        INVALID_VALUE_OPENAPI_GENERATED = 0,
        SPEND_IN_DOLLAR, 
        TOTAL_IMPRESSION
    };
    OAIAdsAnalyticsFilterColumn::eOAIAdsAnalyticsFilterColumn getValue() const;
    void setValue(const OAIAdsAnalyticsFilterColumn::eOAIAdsAnalyticsFilterColumn& value);
    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    eOAIAdsAnalyticsFilterColumn m_value;
    bool m_value_isSet;
    bool m_value_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIAdsAnalyticsFilterColumn)

#endif // OAIAdsAnalyticsFilterColumn_H
