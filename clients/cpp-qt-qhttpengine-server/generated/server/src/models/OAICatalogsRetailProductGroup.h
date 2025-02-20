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
 * OAICatalogsRetailProductGroup.h
 *
 * 
 */

#ifndef OAICatalogsRetailProductGroup_H
#define OAICatalogsRetailProductGroup_H

#include <QJsonObject>

#include "OAICatalogsProductGroupFilters.h"
#include "OAICatalogsProductGroupStatus.h"
#include "OAICatalogsProductGroupType.h"
#include <QString>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAICatalogsRetailProductGroup : public OAIObject {
public:
    OAICatalogsRetailProductGroup();
    OAICatalogsRetailProductGroup(QString json);
    ~OAICatalogsRetailProductGroup() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    QString getCatalogType() const;
    void setCatalogType(const QString &catalog_type);
    bool is_catalog_type_Set() const;
    bool is_catalog_type_Valid() const;

    QString getId() const;
    void setId(const QString &id);
    bool is_id_Set() const;
    bool is_id_Valid() const;

    QString getName() const;
    void setName(const QString &name);
    bool is_name_Set() const;
    bool is_name_Valid() const;

    QString getDescription() const;
    void setDescription(const QString &description);
    bool is_description_Set() const;
    bool is_description_Valid() const;

    OAICatalogsProductGroupFilters getFilters() const;
    void setFilters(const OAICatalogsProductGroupFilters &filters);
    bool is_filters_Set() const;
    bool is_filters_Valid() const;

    bool isIsFeatured() const;
    void setIsFeatured(const bool &is_featured);
    bool is_is_featured_Set() const;
    bool is_is_featured_Valid() const;

    OAICatalogsProductGroupType getType() const;
    void setType(const OAICatalogsProductGroupType &type);
    bool is_type_Set() const;
    bool is_type_Valid() const;

    OAICatalogsProductGroupStatus getStatus() const;
    void setStatus(const OAICatalogsProductGroupStatus &status);
    bool is_status_Set() const;
    bool is_status_Valid() const;

    qint32 getCreatedAt() const;
    void setCreatedAt(const qint32 &created_at);
    bool is_created_at_Set() const;
    bool is_created_at_Valid() const;

    qint32 getUpdatedAt() const;
    void setUpdatedAt(const qint32 &updated_at);
    bool is_updated_at_Set() const;
    bool is_updated_at_Valid() const;

    QString getCatalogId() const;
    void setCatalogId(const QString &catalog_id);
    bool is_catalog_id_Set() const;
    bool is_catalog_id_Valid() const;

    QString getFeedId() const;
    void setFeedId(const QString &feed_id);
    bool is_feed_id_Set() const;
    bool is_feed_id_Valid() const;

    QString getCountry() const;
    void setCountry(const QString &country);
    bool is_country_Set() const;
    bool is_country_Valid() const;

    QString getLocale() const;
    void setLocale(const QString &locale);
    bool is_locale_Set() const;
    bool is_locale_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    QString catalog_type;
    bool m_catalog_type_isSet;
    bool m_catalog_type_isValid;

    QString id;
    bool m_id_isSet;
    bool m_id_isValid;

    QString name;
    bool m_name_isSet;
    bool m_name_isValid;

    QString description;
    bool m_description_isSet;
    bool m_description_isValid;

    OAICatalogsProductGroupFilters filters;
    bool m_filters_isSet;
    bool m_filters_isValid;

    bool is_featured;
    bool m_is_featured_isSet;
    bool m_is_featured_isValid;

    OAICatalogsProductGroupType type;
    bool m_type_isSet;
    bool m_type_isValid;

    OAICatalogsProductGroupStatus status;
    bool m_status_isSet;
    bool m_status_isValid;

    qint32 created_at;
    bool m_created_at_isSet;
    bool m_created_at_isValid;

    qint32 updated_at;
    bool m_updated_at_isSet;
    bool m_updated_at_isValid;

    QString catalog_id;
    bool m_catalog_id_isSet;
    bool m_catalog_id_isValid;

    QString feed_id;
    bool m_feed_id_isSet;
    bool m_feed_id_isValid;

    QString country;
    bool m_country_isSet;
    bool m_country_isValid;

    QString locale;
    bool m_locale_isSet;
    bool m_locale_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAICatalogsRetailProductGroup)

#endif // OAICatalogsRetailProductGroup_H
