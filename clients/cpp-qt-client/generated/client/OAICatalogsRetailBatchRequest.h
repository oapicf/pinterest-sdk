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
 * OAICatalogsRetailBatchRequest.h
 *
 * A request object that can have multiple operations on a single retail batch
 */

#ifndef OAICatalogsRetailBatchRequest_H
#define OAICatalogsRetailBatchRequest_H

#include <QJsonObject>

#include "OAICatalogsRetailBatchRequest_items_inner.h"
#include "OAICatalogsType.h"
#include "OAICountry.h"
#include "OAILanguage.h"
#include <QList>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {
class OAICatalogsRetailBatchRequest_items_inner;

class OAICatalogsRetailBatchRequest : public OAIObject {
public:
    OAICatalogsRetailBatchRequest();
    OAICatalogsRetailBatchRequest(QString json);
    ~OAICatalogsRetailBatchRequest() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    OAICatalogsType getCatalogType() const;
    void setCatalogType(const OAICatalogsType &catalog_type);
    bool is_catalog_type_Set() const;
    bool is_catalog_type_Valid() const;

    OAICountry getCountry() const;
    void setCountry(const OAICountry &country);
    bool is_country_Set() const;
    bool is_country_Valid() const;

    OAILanguage getLanguage() const;
    void setLanguage(const OAILanguage &language);
    bool is_language_Set() const;
    bool is_language_Valid() const;

    QList<OAICatalogsRetailBatchRequest_items_inner> getItems() const;
    void setItems(const QList<OAICatalogsRetailBatchRequest_items_inner> &items);
    bool is_items_Set() const;
    bool is_items_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    OAICatalogsType m_catalog_type;
    bool m_catalog_type_isSet;
    bool m_catalog_type_isValid;

    OAICountry m_country;
    bool m_country_isSet;
    bool m_country_isValid;

    OAILanguage m_language;
    bool m_language_isSet;
    bool m_language_isValid;

    QList<OAICatalogsRetailBatchRequest_items_inner> m_items;
    bool m_items_isSet;
    bool m_items_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAICatalogsRetailBatchRequest)

#endif // OAICatalogsRetailBatchRequest_H