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
 * OAIItemResponse_anyOf.h
 *
 * 
 */

#ifndef OAIItemResponse_anyOf_H
#define OAIItemResponse_anyOf_H

#include <QJsonObject>

#include "OAICatalogsCreativeAssetsAttributes.h"
#include "OAICatalogsCreativeAssetsItemResponse.h"
#include "OAICatalogsHotelItemResponse.h"
#include "OAICatalogsRetailItemResponse.h"
#include "OAICatalogsType.h"
#include "OAIPin.h"
#include <QList>
#include <QString>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {
class OAIPin;
class OAICatalogsCreativeAssetsAttributes;

class OAIItemResponse_anyOf : public OAIObject {
public:
    OAIItemResponse_anyOf();
    OAIItemResponse_anyOf(QString json);
    ~OAIItemResponse_anyOf() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    OAICatalogsType getCatalogType() const;
    void setCatalogType(const OAICatalogsType &catalog_type);
    bool is_catalog_type_Set() const;
    bool is_catalog_type_Valid() const;

    QString getItemId() const;
    void setItemId(const QString &item_id);
    bool is_item_id_Set() const;
    bool is_item_id_Valid() const;

    QList<OAIPin> getPins() const;
    void setPins(const QList<OAIPin> &pins);
    bool is_pins_Set() const;
    bool is_pins_Valid() const;

    OAICatalogsCreativeAssetsAttributes getAttributes() const;
    void setAttributes(const OAICatalogsCreativeAssetsAttributes &attributes);
    bool is_attributes_Set() const;
    bool is_attributes_Valid() const;

    QString getHotelId() const;
    void setHotelId(const QString &hotel_id);
    bool is_hotel_id_Set() const;
    bool is_hotel_id_Valid() const;

    QString getCreativeAssetsId() const;
    void setCreativeAssetsId(const QString &creative_assets_id);
    bool is_creative_assets_id_Set() const;
    bool is_creative_assets_id_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    OAICatalogsType m_catalog_type;
    bool m_catalog_type_isSet;
    bool m_catalog_type_isValid;

    QString m_item_id;
    bool m_item_id_isSet;
    bool m_item_id_isValid;

    QList<OAIPin> m_pins;
    bool m_pins_isSet;
    bool m_pins_isValid;

    OAICatalogsCreativeAssetsAttributes m_attributes;
    bool m_attributes_isSet;
    bool m_attributes_isValid;

    QString m_hotel_id;
    bool m_hotel_id_isSet;
    bool m_hotel_id_isValid;

    QString m_creative_assets_id;
    bool m_creative_assets_id_isSet;
    bool m_creative_assets_id_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIItemResponse_anyOf)

#endif // OAIItemResponse_anyOf_H
