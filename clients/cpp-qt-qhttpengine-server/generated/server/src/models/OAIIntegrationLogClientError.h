/**
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.12.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/*
 * OAIIntegrationLogClientError.h
 *
 * System error details included in the log sent by the client.
 */

#ifndef OAIIntegrationLogClientError_H
#define OAIIntegrationLogClientError_H

#include <QJsonObject>

#include <QString>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAIIntegrationLogClientError : public OAIObject {
public:
    OAIIntegrationLogClientError();
    OAIIntegrationLogClientError(QString json);
    ~OAIIntegrationLogClientError() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    QString getCause() const;
    void setCause(const QString &cause);
    bool is_cause_Set() const;
    bool is_cause_Valid() const;

    qint32 getColumnNumber() const;
    void setColumnNumber(const qint32 &column_number);
    bool is_column_number_Set() const;
    bool is_column_number_Valid() const;

    QString getFileName() const;
    void setFileName(const QString &file_name);
    bool is_file_name_Set() const;
    bool is_file_name_Valid() const;

    qint32 getLineNumber() const;
    void setLineNumber(const qint32 &line_number);
    bool is_line_number_Set() const;
    bool is_line_number_Valid() const;

    QString getMessage() const;
    void setMessage(const QString &message);
    bool is_message_Set() const;
    bool is_message_Valid() const;

    QString getMessageDetail() const;
    void setMessageDetail(const QString &message_detail);
    bool is_message_detail_Set() const;
    bool is_message_detail_Valid() const;

    QString getName() const;
    void setName(const QString &name);
    bool is_name_Set() const;
    bool is_name_Valid() const;

    qint32 getNumber() const;
    void setNumber(const qint32 &number);
    bool is_number_Set() const;
    bool is_number_Valid() const;

    QString getStackTrace() const;
    void setStackTrace(const QString &stack_trace);
    bool is_stack_trace_Set() const;
    bool is_stack_trace_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    QString cause;
    bool m_cause_isSet;
    bool m_cause_isValid;

    qint32 column_number;
    bool m_column_number_isSet;
    bool m_column_number_isValid;

    QString file_name;
    bool m_file_name_isSet;
    bool m_file_name_isValid;

    qint32 line_number;
    bool m_line_number_isSet;
    bool m_line_number_isValid;

    QString message;
    bool m_message_isSet;
    bool m_message_isValid;

    QString message_detail;
    bool m_message_detail_isSet;
    bool m_message_detail_isValid;

    QString name;
    bool m_name_isSet;
    bool m_name_isValid;

    qint32 number;
    bool m_number_isSet;
    bool m_number_isValid;

    QString stack_trace;
    bool m_stack_trace_isSet;
    bool m_stack_trace_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIIntegrationLogClientError)

#endif // OAIIntegrationLogClientError_H