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
 * OAICatalogsCreateCreativeAssetsItem.h
 *
 * A creative assets item to be created.
 */

#ifndef OAICatalogsCreateCreativeAssetsItem_H
#define OAICatalogsCreateCreativeAssetsItem_H

#include <QJsonObject>

#include "OAICatalogsCreativeAssetsAttributes.h"
#include <QString>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {
class OAICatalogsCreativeAssetsAttributes;

class OAICatalogsCreateCreativeAssetsItem : public OAIObject {
public:
    OAICatalogsCreateCreativeAssetsItem();
    OAICatalogsCreateCreativeAssetsItem(QString json);
    ~OAICatalogsCreateCreativeAssetsItem() override;

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

    OAICatalogsCreativeAssetsAttributes getAttributes() const;
    void setAttributes(const OAICatalogsCreativeAssetsAttributes &attributes);
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

    OAICatalogsCreativeAssetsAttributes m_attributes;
    bool m_attributes_isSet;
    bool m_attributes_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAICatalogsCreateCreativeAssetsItem)

#endif // OAICatalogsCreateCreativeAssetsItem_H
