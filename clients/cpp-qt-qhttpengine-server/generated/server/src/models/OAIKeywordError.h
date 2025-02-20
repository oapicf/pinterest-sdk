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
 * OAIKeywordError.h
 *
 * 
 */

#ifndef OAIKeywordError_H
#define OAIKeywordError_H

#include <QJsonObject>

#include "OAIKeyword.h"
#include <QList>
#include <QString>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAIKeywordError : public OAIObject {
public:
    OAIKeywordError();
    OAIKeywordError(QString json);
    ~OAIKeywordError() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    OAIKeyword getData() const;
    void setData(const OAIKeyword &data);
    bool is_data_Set() const;
    bool is_data_Valid() const;

    QList<QString> getErrorMessages() const;
    void setErrorMessages(const QList<QString> &error_messages);
    bool is_error_messages_Set() const;
    bool is_error_messages_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    OAIKeyword data;
    bool m_data_isSet;
    bool m_data_isValid;

    QList<QString> error_messages;
    bool m_error_messages_isSet;
    bool m_error_messages_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIKeywordError)

#endif // OAIKeywordError_H
