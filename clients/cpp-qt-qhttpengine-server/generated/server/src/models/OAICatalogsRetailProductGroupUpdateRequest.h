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
 * OAICatalogsRetailProductGroupUpdateRequest.h
 *
 * Request object for updating a retail product group.
 */

#ifndef OAICatalogsRetailProductGroupUpdateRequest_H
#define OAICatalogsRetailProductGroupUpdateRequest_H

#include <QJsonObject>

#include "OAICatalogsLocale.h"
#include "OAICatalogsProductGroupFiltersRequest.h"
#include "OAICountry.h"
#include <QString>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAICatalogsRetailProductGroupUpdateRequest : public OAIObject {
public:
    OAICatalogsRetailProductGroupUpdateRequest();
    OAICatalogsRetailProductGroupUpdateRequest(QString json);
    ~OAICatalogsRetailProductGroupUpdateRequest() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    QString getCatalogType() const;
    void setCatalogType(const QString &catalog_type);
    bool is_catalog_type_Set() const;
    bool is_catalog_type_Valid() const;

    QString getName() const;
    void setName(const QString &name);
    bool is_name_Set() const;
    bool is_name_Valid() const;

    QString getDescription() const;
    void setDescription(const QString &description);
    bool is_description_Set() const;
    bool is_description_Valid() const;

    OAICatalogsProductGroupFiltersRequest getFilters() const;
    void setFilters(const OAICatalogsProductGroupFiltersRequest &filters);
    bool is_filters_Set() const;
    bool is_filters_Valid() const;

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

    QString catalog_type;
    bool m_catalog_type_isSet;
    bool m_catalog_type_isValid;

    QString name;
    bool m_name_isSet;
    bool m_name_isValid;

    QString description;
    bool m_description_isSet;
    bool m_description_isValid;

    OAICatalogsProductGroupFiltersRequest filters;
    bool m_filters_isSet;
    bool m_filters_isValid;

    OAICountry country;
    bool m_country_isSet;
    bool m_country_isValid;

    OAICatalogsLocale locale;
    bool m_locale_isSet;
    bool m_locale_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAICatalogsRetailProductGroupUpdateRequest)

#endif // OAICatalogsRetailProductGroupUpdateRequest_H
