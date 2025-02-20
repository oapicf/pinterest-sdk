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
 * OAIAdGroupAudienceSizingRequest_keywords_inner.h
 *
 * 
 */

#ifndef OAIAdGroupAudienceSizingRequest_keywords_inner_H
#define OAIAdGroupAudienceSizingRequest_keywords_inner_H

#include <QJsonObject>

#include "OAIMatchTypeResponse.h"
#include <QString>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAIAdGroupAudienceSizingRequest_keywords_inner : public OAIObject {
public:
    OAIAdGroupAudienceSizingRequest_keywords_inner();
    OAIAdGroupAudienceSizingRequest_keywords_inner(QString json);
    ~OAIAdGroupAudienceSizingRequest_keywords_inner() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    OAIMatchTypeResponse getMatchType() const;
    void setMatchType(const OAIMatchTypeResponse &match_type);
    bool is_match_type_Set() const;
    bool is_match_type_Valid() const;

    QString getValue() const;
    void setValue(const QString &value);
    bool is_value_Set() const;
    bool is_value_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    OAIMatchTypeResponse m_match_type;
    bool m_match_type_isSet;
    bool m_match_type_isValid;

    QString m_value;
    bool m_value_isSet;
    bool m_value_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIAdGroupAudienceSizingRequest_keywords_inner)

#endif // OAIAdGroupAudienceSizingRequest_keywords_inner_H
