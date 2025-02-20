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
 * OAIBrandFilter.h
 *
 * 
 */

#ifndef OAIBrandFilter_H
#define OAIBrandFilter_H

#include <QJsonObject>

#include "OAICatalogsProductGroupMultipleStringCriteria.h"

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAIBrandFilter : public OAIObject {
public:
    OAIBrandFilter();
    OAIBrandFilter(QString json);
    ~OAIBrandFilter() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    OAICatalogsProductGroupMultipleStringCriteria getBrand() const;
    void setBrand(const OAICatalogsProductGroupMultipleStringCriteria &brand);
    bool is_brand_Set() const;
    bool is_brand_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    OAICatalogsProductGroupMultipleStringCriteria brand;
    bool m_brand_isSet;
    bool m_brand_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIBrandFilter)

#endif // OAIBrandFilter_H
