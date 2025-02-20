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
 * OAICatalogsProductGroupProductCountsVertical.h
 *
 * Product counts for a CatalogsProductGroup
 */

#ifndef OAICatalogsProductGroupProductCountsVertical_H
#define OAICatalogsProductGroupProductCountsVertical_H

#include <QJsonObject>

#include "OAICatalogsCreativeAssetsProductGroupProductCounts.h"
#include "OAICatalogsHotelProductGroupProductCounts.h"
#include "OAICatalogsRetailProductGroupProductCounts.h"
#include "OAICatalogsType.h"

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAICatalogsProductGroupProductCountsVertical : public OAIObject {
public:
    OAICatalogsProductGroupProductCountsVertical();
    OAICatalogsProductGroupProductCountsVertical(QString json);
    ~OAICatalogsProductGroupProductCountsVertical() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    OAICatalogsType getCatalogType() const;
    void setCatalogType(const OAICatalogsType &catalog_type);
    bool is_catalog_type_Set() const;
    bool is_catalog_type_Valid() const;

    double getInStock() const;
    void setInStock(const double &in_stock);
    bool is_in_stock_Set() const;
    bool is_in_stock_Valid() const;

    double getOutOfStock() const;
    void setOutOfStock(const double &out_of_stock);
    bool is_out_of_stock_Set() const;
    bool is_out_of_stock_Valid() const;

    double getPreorder() const;
    void setPreorder(const double &preorder);
    bool is_preorder_Set() const;
    bool is_preorder_Valid() const;

    double getTotal() const;
    void setTotal(const double &total);
    bool is_total_Set() const;
    bool is_total_Valid() const;

    double getVideos() const;
    void setVideos(const double &videos);
    bool is_videos_Set() const;
    bool is_videos_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    OAICatalogsType catalog_type;
    bool m_catalog_type_isSet;
    bool m_catalog_type_isValid;

    double in_stock;
    bool m_in_stock_isSet;
    bool m_in_stock_isValid;

    double out_of_stock;
    bool m_out_of_stock_isSet;
    bool m_out_of_stock_isValid;

    double preorder;
    bool m_preorder_isSet;
    bool m_preorder_isValid;

    double total;
    bool m_total_isSet;
    bool m_total_isValid;

    double videos;
    bool m_videos_isSet;
    bool m_videos_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAICatalogsProductGroupProductCountsVertical)

#endif // OAICatalogsProductGroupProductCountsVertical_H
