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
 * OAIUpdatePartnerAssetAccessBody.h
 *
 * 
 */

#ifndef OAIUpdatePartnerAssetAccessBody_H
#define OAIUpdatePartnerAssetAccessBody_H

#include <QJsonObject>

#include "OAIUpdatePartnerAssetAccessBody_accesses_inner.h"
#include <QList>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAIUpdatePartnerAssetAccessBody : public OAIObject {
public:
    OAIUpdatePartnerAssetAccessBody();
    OAIUpdatePartnerAssetAccessBody(QString json);
    ~OAIUpdatePartnerAssetAccessBody() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    QList<OAIUpdatePartnerAssetAccessBody_accesses_inner> getAccesses() const;
    void setAccesses(const QList<OAIUpdatePartnerAssetAccessBody_accesses_inner> &accesses);
    bool is_accesses_Set() const;
    bool is_accesses_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    QList<OAIUpdatePartnerAssetAccessBody_accesses_inner> accesses;
    bool m_accesses_isSet;
    bool m_accesses_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIUpdatePartnerAssetAccessBody)

#endif // OAIUpdatePartnerAssetAccessBody_H
