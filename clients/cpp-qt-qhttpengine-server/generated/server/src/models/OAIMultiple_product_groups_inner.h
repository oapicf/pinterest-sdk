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
 * OAIMultiple_product_groups_inner.h
 *
 * 
 */

#ifndef OAIMultiple_product_groups_inner_H
#define OAIMultiple_product_groups_inner_H

#include <QJsonObject>

#include "OAICatalogsCreativeAssetsProductGroupFilters.h"
#include "OAICatalogsLocale.h"
#include "OAICatalogsProductGroupCreateRequest.h"
#include "OAICatalogsVerticalProductGroupCreateRequest.h"
#include "OAICountry.h"
#include <QString>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAIMultiple_product_groups_inner : public OAIObject {
public:
    OAIMultiple_product_groups_inner();
    OAIMultiple_product_groups_inner(QString json);
    ~OAIMultiple_product_groups_inner() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    QString getName() const;
    void setName(const QString &name);
    bool is_name_Set() const;
    bool is_name_Valid() const;

    QString getDescription() const;
    void setDescription(const QString &description);
    bool is_description_Set() const;
    bool is_description_Valid() const;

    bool isIsFeatured() const;
    void setIsFeatured(const bool &is_featured);
    bool is_is_featured_Set() const;
    bool is_is_featured_Valid() const;

    OAICatalogsCreativeAssetsProductGroupFilters getFilters() const;
    void setFilters(const OAICatalogsCreativeAssetsProductGroupFilters &filters);
    bool is_filters_Set() const;
    bool is_filters_Valid() const;

    QString getFeedId() const;
    void setFeedId(const QString &feed_id);
    bool is_feed_id_Set() const;
    bool is_feed_id_Valid() const;

    QString getCatalogType() const;
    void setCatalogType(const QString &catalog_type);
    bool is_catalog_type_Set() const;
    bool is_catalog_type_Valid() const;

    QString getCatalogId() const;
    void setCatalogId(const QString &catalog_id);
    bool is_catalog_id_Set() const;
    bool is_catalog_id_Valid() const;

    OAICountry getCountry() const;
    void setCountry(const OAICountry &country);
    bool is_country_Set() const;
    bool is_country_Valid() const;

    OAICatalogsLocale getLocale() const;
    void setLocale(const OAICatalogsLocale &locale);
    bool is_locale_Set() const;
    bool is_locale_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    QString name;
    bool m_name_isSet;
    bool m_name_isValid;

    QString description;
    bool m_description_isSet;
    bool m_description_isValid;

    bool is_featured;
    bool m_is_featured_isSet;
    bool m_is_featured_isValid;

    OAICatalogsCreativeAssetsProductGroupFilters filters;
    bool m_filters_isSet;
    bool m_filters_isValid;

    QString feed_id;
    bool m_feed_id_isSet;
    bool m_feed_id_isValid;

    QString catalog_type;
    bool m_catalog_type_isSet;
    bool m_catalog_type_isValid;

    QString catalog_id;
    bool m_catalog_id_isSet;
    bool m_catalog_id_isValid;

    OAICountry country;
    bool m_country_isSet;
    bool m_country_isValid;

    OAICatalogsLocale locale;
    bool m_locale_isSet;
    bool m_locale_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIMultiple_product_groups_inner)

#endif // OAIMultiple_product_groups_inner_H
