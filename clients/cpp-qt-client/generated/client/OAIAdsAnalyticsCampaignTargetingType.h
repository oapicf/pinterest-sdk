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
 * OAIAdsAnalyticsCampaignTargetingType.h
 *
 * Reporting targeting type for campaigns
 */

#ifndef OAIAdsAnalyticsCampaignTargetingType_H
#define OAIAdsAnalyticsCampaignTargetingType_H

#include <QJsonObject>


#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAIAdsAnalyticsCampaignTargetingType : public OAIEnum {
public:
    OAIAdsAnalyticsCampaignTargetingType();
    OAIAdsAnalyticsCampaignTargetingType(QString json);
    ~OAIAdsAnalyticsCampaignTargetingType() override;

    QString asJson() const override;
    QJsonValue asJsonValue() const override;
    void fromJsonValue(QJsonValue json) override;
    void fromJson(QString jsonString) override;

    enum class eOAIAdsAnalyticsCampaignTargetingType {
        INVALID_VALUE_OPENAPI_GENERATED = 0,
        KEYWORD, 
        APPTYPE, 
        GENDER, 
        LOCATION, 
        PLACEMENT, 
        COUNTRY, 
        TARGETED_INTEREST, 
        PINNER_INTEREST, 
        AUDIENCE_INCLUDE, 
        GEO, 
        AGE_BUCKET, 
        REGION, 
        CREATIVE_TYPE, 
        AGE_BUCKET_AND_GENDER
    };
    OAIAdsAnalyticsCampaignTargetingType::eOAIAdsAnalyticsCampaignTargetingType getValue() const;
    void setValue(const OAIAdsAnalyticsCampaignTargetingType::eOAIAdsAnalyticsCampaignTargetingType& value);
    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    eOAIAdsAnalyticsCampaignTargetingType m_value;
    bool m_value_isSet;
    bool m_value_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIAdsAnalyticsCampaignTargetingType)

#endif // OAIAdsAnalyticsCampaignTargetingType_H
