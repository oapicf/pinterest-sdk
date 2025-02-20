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
 * OAICatalogsFormat.h
 *
 * The file format of a feed.
 */

#ifndef OAICatalogsFormat_H
#define OAICatalogsFormat_H

#include <QJsonObject>


#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAICatalogsFormat : public OAIEnum {
public:
    OAICatalogsFormat();
    OAICatalogsFormat(QString json);
    ~OAICatalogsFormat() override;

    QString asJson() const override;
    QJsonValue asJsonValue() const override;
    void fromJsonValue(QJsonValue json) override;
    void fromJson(QString jsonString) override;

    enum class eOAICatalogsFormat {
        INVALID_VALUE_OPENAPI_GENERATED = 0,
        TSV, 
        CSV, 
        XML
    };
    OAICatalogsFormat::eOAICatalogsFormat getValue() const;
    void setValue(const OAICatalogsFormat::eOAICatalogsFormat& value);
    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    eOAICatalogsFormat m_value;
    bool m_value_isSet;
    bool m_value_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAICatalogsFormat)

#endif // OAICatalogsFormat_H
