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
 * OAICatalogsStatus.h
 *
 * Status for catalogs entities. Present in catalogs_feed values. When a feed is deleted, the response will inform DELETED as status.
 */

#ifndef OAICatalogsStatus_H
#define OAICatalogsStatus_H

#include <QJsonObject>


#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAICatalogsStatus : public OAIEnum {
public:
    OAICatalogsStatus();
    OAICatalogsStatus(QString json);
    ~OAICatalogsStatus() override;

    QString asJson() const override;
    QJsonValue asJsonValue() const override;
    void fromJsonValue(QJsonValue json) override;
    void fromJson(QString jsonString) override;

    enum class eOAICatalogsStatus {
        INVALID_VALUE_OPENAPI_GENERATED = 0,
        ACTIVE, 
        INACTIVE
    };
    OAICatalogsStatus::eOAICatalogsStatus getValue() const;
    void setValue(const OAICatalogsStatus::eOAICatalogsStatus& value);
    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    eOAICatalogsStatus m_value;
    bool m_value_isSet;
    bool m_value_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAICatalogsStatus)

#endif // OAICatalogsStatus_H
