/**
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.12.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/*
 * OAICatalogsRetailItemsFilter.h
 *
 * 
 */

#ifndef OAICatalogsRetailItemsFilter_H
#define OAICatalogsRetailItemsFilter_H

#include <QJsonObject>

#include <QList>
#include <QString>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAICatalogsRetailItemsFilter : public OAIObject {
public:
    OAICatalogsRetailItemsFilter();
    OAICatalogsRetailItemsFilter(QString json);
    ~OAICatalogsRetailItemsFilter() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    QString getCatalogType() const;
    void setCatalogType(const QString &catalog_type);
    bool is_catalog_type_Set() const;
    bool is_catalog_type_Valid() const;

    QList<QString> getItemIds() const;
    void setItemIds(const QList<QString> &item_ids);
    bool is_item_ids_Set() const;
    bool is_item_ids_Valid() const;

    QString getCatalogId() const;
    void setCatalogId(const QString &catalog_id);
    bool is_catalog_id_Set() const;
    bool is_catalog_id_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    QString m_catalog_type;
    bool m_catalog_type_isSet;
    bool m_catalog_type_isValid;

    QList<QString> m_item_ids;
    bool m_item_ids_isSet;
    bool m_item_ids_isValid;

    QString m_catalog_id;
    bool m_catalog_id_isSet;
    bool m_catalog_id_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAICatalogsRetailItemsFilter)

#endif // OAICatalogsRetailItemsFilter_H