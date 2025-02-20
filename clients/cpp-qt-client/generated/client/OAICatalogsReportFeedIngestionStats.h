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
 * OAICatalogsReportFeedIngestionStats.h
 *
 * 
 */

#ifndef OAICatalogsReportFeedIngestionStats_H
#define OAICatalogsReportFeedIngestionStats_H

#include <QJsonObject>

#include <QString>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAICatalogsReportFeedIngestionStats : public OAIObject {
public:
    OAICatalogsReportFeedIngestionStats();
    OAICatalogsReportFeedIngestionStats(QString json);
    ~OAICatalogsReportFeedIngestionStats() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    QString getReportType() const;
    void setReportType(const QString &report_type);
    bool is_report_type_Set() const;
    bool is_report_type_Valid() const;

    QString getCatalogId() const;
    void setCatalogId(const QString &catalog_id);
    bool is_catalog_id_Set() const;
    bool is_catalog_id_Valid() const;

    qint32 getCode() const;
    void setCode(const qint32 &code);
    bool is_code_Set() const;
    bool is_code_Valid() const;

    QString getCodeLabel() const;
    void setCodeLabel(const QString &code_label);
    bool is_code_label_Set() const;
    bool is_code_label_Valid() const;

    QString getMessage() const;
    void setMessage(const QString &message);
    bool is_message_Set() const;
    bool is_message_Valid() const;

    qint32 getOccurrences() const;
    void setOccurrences(const qint32 &occurrences);
    bool is_occurrences_Set() const;
    bool is_occurrences_Valid() const;

    QString getSeverity() const;
    void setSeverity(const QString &severity);
    bool is_severity_Set() const;
    bool is_severity_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    QString m_report_type;
    bool m_report_type_isSet;
    bool m_report_type_isValid;

    QString m_catalog_id;
    bool m_catalog_id_isSet;
    bool m_catalog_id_isValid;

    qint32 m_code;
    bool m_code_isSet;
    bool m_code_isValid;

    QString m_code_label;
    bool m_code_label_isSet;
    bool m_code_label_isValid;

    QString m_message;
    bool m_message_isSet;
    bool m_message_isValid;

    qint32 m_occurrences;
    bool m_occurrences_isSet;
    bool m_occurrences_isValid;

    QString m_severity;
    bool m_severity_isSet;
    bool m_severity_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAICatalogsReportFeedIngestionStats)

#endif // OAICatalogsReportFeedIngestionStats_H
