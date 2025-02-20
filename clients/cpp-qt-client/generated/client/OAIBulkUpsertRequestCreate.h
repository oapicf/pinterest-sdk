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
 * OAIBulkUpsertRequestCreate.h
 *
 * Request for creation of entities in bulk.
 */

#ifndef OAIBulkUpsertRequestCreate_H
#define OAIBulkUpsertRequestCreate_H

#include <QJsonObject>

#include "OAIAdCreateRequest.h"
#include "OAIAdGroupCreateRequest.h"
#include "OAICampaignCreateRequest.h"
#include "OAIKeywordsRequest.h"
#include "OAIProductGroupPromotionCreateRequest.h"
#include <QList>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {
class OAICampaignCreateRequest;
class OAIAdGroupCreateRequest;
class OAIAdCreateRequest;
class OAIProductGroupPromotionCreateRequest;
class OAIKeywordsRequest;

class OAIBulkUpsertRequestCreate : public OAIObject {
public:
    OAIBulkUpsertRequestCreate();
    OAIBulkUpsertRequestCreate(QString json);
    ~OAIBulkUpsertRequestCreate() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    QList<OAICampaignCreateRequest> getCampaigns() const;
    void setCampaigns(const QList<OAICampaignCreateRequest> &campaigns);
    bool is_campaigns_Set() const;
    bool is_campaigns_Valid() const;

    QList<OAIAdGroupCreateRequest> getAdGroups() const;
    void setAdGroups(const QList<OAIAdGroupCreateRequest> &ad_groups);
    bool is_ad_groups_Set() const;
    bool is_ad_groups_Valid() const;

    QList<OAIAdCreateRequest> getAds() const;
    void setAds(const QList<OAIAdCreateRequest> &ads);
    bool is_ads_Set() const;
    bool is_ads_Valid() const;

    QList<OAIProductGroupPromotionCreateRequest> getProductGroups() const;
    void setProductGroups(const QList<OAIProductGroupPromotionCreateRequest> &product_groups);
    bool is_product_groups_Set() const;
    bool is_product_groups_Valid() const;

    QList<OAIKeywordsRequest> getKeywords() const;
    void setKeywords(const QList<OAIKeywordsRequest> &keywords);
    bool is_keywords_Set() const;
    bool is_keywords_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    QList<OAICampaignCreateRequest> m_campaigns;
    bool m_campaigns_isSet;
    bool m_campaigns_isValid;

    QList<OAIAdGroupCreateRequest> m_ad_groups;
    bool m_ad_groups_isSet;
    bool m_ad_groups_isValid;

    QList<OAIAdCreateRequest> m_ads;
    bool m_ads_isSet;
    bool m_ads_isValid;

    QList<OAIProductGroupPromotionCreateRequest> m_product_groups;
    bool m_product_groups_isSet;
    bool m_product_groups_isValid;

    QList<OAIKeywordsRequest> m_keywords;
    bool m_keywords_isSet;
    bool m_keywords_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIBulkUpsertRequestCreate)

#endif // OAIBulkUpsertRequestCreate_H
