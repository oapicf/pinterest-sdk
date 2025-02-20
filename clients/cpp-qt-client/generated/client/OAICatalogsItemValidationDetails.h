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
 * OAICatalogsItemValidationDetails.h
 *
 * 
 */

#ifndef OAICatalogsItemValidationDetails_H
#define OAICatalogsItemValidationDetails_H

#include <QJsonObject>

#include "OAINullableCatalogsItemFieldType.h"
#include <QString>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAICatalogsItemValidationDetails : public OAIObject {
public:
    OAICatalogsItemValidationDetails();
    OAICatalogsItemValidationDetails(QString json);
    ~OAICatalogsItemValidationDetails() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    OAINullableCatalogsItemFieldType getAttributeName() const;
    void setAttributeName(const OAINullableCatalogsItemFieldType &attribute_name);
    bool is_attribute_name_Set() const;
    bool is_attribute_name_Valid() const;

    QString getProvidedValue() const;
    void setProvidedValue(const QString &provided_value);
    bool is_provided_value_Set() const;
    bool is_provided_value_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    OAINullableCatalogsItemFieldType m_attribute_name;
    bool m_attribute_name_isSet;
    bool m_attribute_name_isValid;

    QString m_provided_value;
    bool m_provided_value_isSet;
    bool m_provided_value_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAICatalogsItemValidationDetails)

#endif // OAICatalogsItemValidationDetails_H
