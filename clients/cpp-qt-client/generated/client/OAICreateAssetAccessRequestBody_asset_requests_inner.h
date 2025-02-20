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
 * OAICreateAssetAccessRequestBody_asset_requests_inner.h
 *
 * 
 */

#ifndef OAICreateAssetAccessRequestBody_asset_requests_inner_H
#define OAICreateAssetAccessRequestBody_asset_requests_inner_H

#include <QJsonObject>

#include "OAIPermissions.h"
#include <QList>
#include <QMap>
#include <QString>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAICreateAssetAccessRequestBody_asset_requests_inner : public OAIObject {
public:
    OAICreateAssetAccessRequestBody_asset_requests_inner();
    OAICreateAssetAccessRequestBody_asset_requests_inner(QString json);
    ~OAICreateAssetAccessRequestBody_asset_requests_inner() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    QString getPartnerId() const;
    void setPartnerId(const QString &partner_id);
    bool is_partner_id_Set() const;
    bool is_partner_id_Valid() const;

    QMap<QString, QList<OAIPermissions>> getAssetIdToPermissions() const;
    void setAssetIdToPermissions(const QMap<QString, QList<OAIPermissions>> &asset_id_to_permissions);
    bool is_asset_id_to_permissions_Set() const;
    bool is_asset_id_to_permissions_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    QString m_partner_id;
    bool m_partner_id_isSet;
    bool m_partner_id_isValid;

    QMap<QString, QList<OAIPermissions>> m_asset_id_to_permissions;
    bool m_asset_id_to_permissions_isSet;
    bool m_asset_id_to_permissions_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAICreateAssetAccessRequestBody_asset_requests_inner)

#endif // OAICreateAssetAccessRequestBody_asset_requests_inner_H
