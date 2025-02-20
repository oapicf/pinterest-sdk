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
 * OAICatalogsUpdateCreativeAssetsItem.h
 *
 * A creative assets item to be updated.
 */

#ifndef OAICatalogsUpdateCreativeAssetsItem_H
#define OAICatalogsUpdateCreativeAssetsItem_H

#include <QJsonObject>

#include "OAICatalogsUpdatableCreativeAssetsAttributes.h"
#include <QString>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {
class OAICatalogsUpdatableCreativeAssetsAttributes;

class OAICatalogsUpdateCreativeAssetsItem : public OAIObject {
public:
    OAICatalogsUpdateCreativeAssetsItem();
    OAICatalogsUpdateCreativeAssetsItem(QString json);
    ~OAICatalogsUpdateCreativeAssetsItem() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    QString getCreativeAssetsId() const;
    void setCreativeAssetsId(const QString &creative_assets_id);
    bool is_creative_assets_id_Set() const;
    bool is_creative_assets_id_Valid() const;

    QString getOperation() const;
    void setOperation(const QString &operation);
    bool is_operation_Set() const;
    bool is_operation_Valid() const;

    OAICatalogsUpdatableCreativeAssetsAttributes getAttributes() const;
    void setAttributes(const OAICatalogsUpdatableCreativeAssetsAttributes &attributes);
    bool is_attributes_Set() const;
    bool is_attributes_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    QString m_creative_assets_id;
    bool m_creative_assets_id_isSet;
    bool m_creative_assets_id_isValid;

    QString m_operation;
    bool m_operation_isSet;
    bool m_operation_isValid;

    OAICatalogsUpdatableCreativeAssetsAttributes m_attributes;
    bool m_attributes_isSet;
    bool m_attributes_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAICatalogsUpdateCreativeAssetsItem)

#endif // OAICatalogsUpdateCreativeAssetsItem_H
