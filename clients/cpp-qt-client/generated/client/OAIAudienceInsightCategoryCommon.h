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
 * OAIAudienceInsightCategoryCommon.h
 *
 * 
 */

#ifndef OAIAudienceInsightCategoryCommon_H
#define OAIAudienceInsightCategoryCommon_H

#include <QJsonObject>

#include <QString>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAIAudienceInsightCategoryCommon : public OAIObject {
public:
    OAIAudienceInsightCategoryCommon();
    OAIAudienceInsightCategoryCommon(QString json);
    ~OAIAudienceInsightCategoryCommon() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    QString getKey() const;
    void setKey(const QString &key);
    bool is_key_Set() const;
    bool is_key_Valid() const;

    QString getName() const;
    void setName(const QString &name);
    bool is_name_Set() const;
    bool is_name_Valid() const;

    double getRatio() const;
    void setRatio(const double &ratio);
    bool is_ratio_Set() const;
    bool is_ratio_Valid() const;

    double getIndex() const;
    void setIndex(const double &index);
    bool is_index_Set() const;
    bool is_index_Valid() const;

    QString getId() const;
    void setId(const QString &id);
    bool is_id_Set() const;
    bool is_id_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    QString m_key;
    bool m_key_isSet;
    bool m_key_isValid;

    QString m_name;
    bool m_name_isSet;
    bool m_name_isValid;

    double m_ratio;
    bool m_ratio_isSet;
    bool m_ratio_isValid;

    double m_index;
    bool m_index_isSet;
    bool m_index_isValid;

    QString m_id;
    bool m_id_isSet;
    bool m_id_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIAudienceInsightCategoryCommon)

#endif // OAIAudienceInsightCategoryCommon_H
