/**
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.6.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/*
 * OAIConversionEvents_data_inner_custom_data_contents_inner.h
 *
 * 
 */

#ifndef OAIConversionEvents_data_inner_custom_data_contents_inner_H
#define OAIConversionEvents_data_inner_custom_data_contents_inner_H

#include <QJsonObject>

#include <QString>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAIConversionEvents_data_inner_custom_data_contents_inner : public OAIObject {
public:
    OAIConversionEvents_data_inner_custom_data_contents_inner();
    OAIConversionEvents_data_inner_custom_data_contents_inner(QString json);
    ~OAIConversionEvents_data_inner_custom_data_contents_inner() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    QString getItemPrice() const;
    void setItemPrice(const QString &item_price);
    bool is_item_price_Set() const;
    bool is_item_price_Valid() const;

    qint64 getQuantity() const;
    void setQuantity(const qint64 &quantity);
    bool is_quantity_Set() const;
    bool is_quantity_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    QString item_price;
    bool m_item_price_isSet;
    bool m_item_price_isValid;

    qint64 quantity;
    bool m_quantity_isSet;
    bool m_quantity_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIConversionEvents_data_inner_custom_data_contents_inner)

#endif // OAIConversionEvents_data_inner_custom_data_contents_inner_H