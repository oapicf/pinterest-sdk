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
 * OAIAdsCreditRedeemResponse.h
 *
 * 
 */

#ifndef OAIAdsCreditRedeemResponse_H
#define OAIAdsCreditRedeemResponse_H

#include <QJsonObject>

#include <QString>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAIAdsCreditRedeemResponse : public OAIObject {
public:
    OAIAdsCreditRedeemResponse();
    OAIAdsCreditRedeemResponse(QString json);
    ~OAIAdsCreditRedeemResponse() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    bool isSuccess() const;
    void setSuccess(const bool &success);
    bool is_success_Set() const;
    bool is_success_Valid() const;

    qint32 getErrorCode() const;
    void setErrorCode(const qint32 &error_code);
    bool is_error_code_Set() const;
    bool is_error_code_Valid() const;

    QString getErrorMessage() const;
    void setErrorMessage(const QString &error_message);
    bool is_error_message_Set() const;
    bool is_error_message_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    bool m_success;
    bool m_success_isSet;
    bool m_success_isValid;

    qint32 m_error_code;
    bool m_error_code_isSet;
    bool m_error_code_isValid;

    QString m_error_message;
    bool m_error_message_isSet;
    bool m_error_message_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIAdsCreditRedeemResponse)

#endif // OAIAdsCreditRedeemResponse_H