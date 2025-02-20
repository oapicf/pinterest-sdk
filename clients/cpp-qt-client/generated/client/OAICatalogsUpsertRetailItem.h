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
 * OAICatalogsUpsertRetailItem.h
 *
 * An item to be upserted
 */

#ifndef OAICatalogsUpsertRetailItem_H
#define OAICatalogsUpsertRetailItem_H

#include <QJsonObject>

#include "OAIItemAttributesRequest.h"
#include <QString>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {
class OAIItemAttributesRequest;

class OAICatalogsUpsertRetailItem : public OAIObject {
public:
    OAICatalogsUpsertRetailItem();
    OAICatalogsUpsertRetailItem(QString json);
    ~OAICatalogsUpsertRetailItem() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    QString getItemId() const;
    void setItemId(const QString &item_id);
    bool is_item_id_Set() const;
    bool is_item_id_Valid() const;

    QString getOperation() const;
    void setOperation(const QString &operation);
    bool is_operation_Set() const;
    bool is_operation_Valid() const;

    OAIItemAttributesRequest getAttributes() const;
    void setAttributes(const OAIItemAttributesRequest &attributes);
    bool is_attributes_Set() const;
    bool is_attributes_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    QString m_item_id;
    bool m_item_id_isSet;
    bool m_item_id_isValid;

    QString m_operation;
    bool m_operation_isSet;
    bool m_operation_isValid;

    OAIItemAttributesRequest m_attributes;
    bool m_attributes_isSet;
    bool m_attributes_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAICatalogsUpsertRetailItem)

#endif // OAICatalogsUpsertRetailItem_H
