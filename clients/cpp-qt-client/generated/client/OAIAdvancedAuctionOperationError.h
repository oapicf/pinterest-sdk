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
 * OAIAdvancedAuctionOperationError.h
 *
 * Error which occurred when applying a bid options operation to a specific item.
 */

#ifndef OAIAdvancedAuctionOperationError_H
#define OAIAdvancedAuctionOperationError_H

#include <QJsonObject>

#include <QString>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAIAdvancedAuctionOperationError : public OAIObject {
public:
    OAIAdvancedAuctionOperationError();
    OAIAdvancedAuctionOperationError(QString json);
    ~OAIAdvancedAuctionOperationError() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    qint32 getCode() const;
    void setCode(const qint32 &code);
    bool is_code_Set() const;
    bool is_code_Valid() const;

    QString getMessage() const;
    void setMessage(const QString &message);
    bool is_message_Set() const;
    bool is_message_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    qint32 m_code;
    bool m_code_isSet;
    bool m_code_isValid;

    QString m_message;
    bool m_message_isSet;
    bool m_message_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIAdvancedAuctionOperationError)

#endif // OAIAdvancedAuctionOperationError_H
