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
 * OAIAudienceCreateRequest_1_audience_type.h
 *
 * 
 */

#ifndef OAIAudienceCreateRequest_1_audience_type_H
#define OAIAudienceCreateRequest_1_audience_type_H

#include <QJsonObject>


#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAIAudienceCreateRequest_1_audience_type : public OAIObject {
public:
    OAIAudienceCreateRequest_1_audience_type();
    OAIAudienceCreateRequest_1_audience_type(QString json);
    ~OAIAudienceCreateRequest_1_audience_type() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIAudienceCreateRequest_1_audience_type)

#endif // OAIAudienceCreateRequest_1_audience_type_H
