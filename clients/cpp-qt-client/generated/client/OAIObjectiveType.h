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
 * OAIObjectiveType.h
 *
 * Campaign objective type. If set as one of [\&quot;AWARENESS\&quot;, \&quot;CONSIDERATION\&quot;, \&quot;WEB_CONVERSION\&quot;, \&quot;CATALOG_SALES\&quot;, \&quot;VIDEO_COMPLETION\&quot;] the campaign is considered as a Campaign Budget Optimization (CBO) campaign, meaning budget needs to be set at the campaign level rather than at the ad group level. [\&quot;WEB_SESSIONS\&quot;] is DEPRECATED. For update, only draft campaigns may update objective type.
 */

#ifndef OAIObjectiveType_H
#define OAIObjectiveType_H

#include <QJsonObject>


#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAIObjectiveType : public OAIEnum {
public:
    OAIObjectiveType();
    OAIObjectiveType(QString json);
    ~OAIObjectiveType() override;

    QString asJson() const override;
    QJsonValue asJsonValue() const override;
    void fromJsonValue(QJsonValue json) override;
    void fromJson(QString jsonString) override;

    enum class eOAIObjectiveType {
        INVALID_VALUE_OPENAPI_GENERATED = 0,
        AWARENESS, 
        CONSIDERATION, 
        VIDEO_VIEW, 
        WEB_CONVERSION, 
        CATALOG_SALES, 
        WEB_SESSIONS, 
        VIDEO_COMPLETION
    };
    OAIObjectiveType::eOAIObjectiveType getValue() const;
    void setValue(const OAIObjectiveType::eOAIObjectiveType& value);
    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    eOAIObjectiveType m_value;
    bool m_value_isSet;
    bool m_value_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIObjectiveType)

#endif // OAIObjectiveType_H
