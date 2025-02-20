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
 * OAIProductType0Filter.h
 *
 * 
 */

#ifndef OAIProductType0Filter_H
#define OAIProductType0Filter_H

#include <QJsonObject>

#include "OAICatalogsProductGroupMultipleStringListCriteria.h"

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAIProductType0Filter : public OAIObject {
public:
    OAIProductType0Filter();
    OAIProductType0Filter(QString json);
    ~OAIProductType0Filter() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    OAICatalogsProductGroupMultipleStringListCriteria getProductType0() const;
    void setProductType0(const OAICatalogsProductGroupMultipleStringListCriteria &product_type_0);
    bool is_product_type_0_Set() const;
    bool is_product_type_0_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    OAICatalogsProductGroupMultipleStringListCriteria product_type_0;
    bool m_product_type_0_isSet;
    bool m_product_type_0_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIProductType0Filter)

#endif // OAIProductType0Filter_H
