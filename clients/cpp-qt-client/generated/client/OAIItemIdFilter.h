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
 * OAIItemIdFilter.h
 *
 * 
 */

#ifndef OAIItemIdFilter_H
#define OAIItemIdFilter_H

#include <QJsonObject>

#include "OAICatalogsProductGroupMultipleStringCriteria.h"

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAIItemIdFilter : public OAIObject {
public:
    OAIItemIdFilter();
    OAIItemIdFilter(QString json);
    ~OAIItemIdFilter() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    OAICatalogsProductGroupMultipleStringCriteria getItemId() const;
    void setItemId(const OAICatalogsProductGroupMultipleStringCriteria &item_id);
    bool is_item_id_Set() const;
    bool is_item_id_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    OAICatalogsProductGroupMultipleStringCriteria m_item_id;
    bool m_item_id_isSet;
    bool m_item_id_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIItemIdFilter)

#endif // OAIItemIdFilter_H
