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
 * OAICurrency.h
 *
 * Currency Codes from ISO 4217
 */

#ifndef OAICurrency_H
#define OAICurrency_H

#include <QJsonObject>


#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAICurrency : public OAIEnum {
public:
    OAICurrency();
    OAICurrency(QString json);
    ~OAICurrency() override;

    QString asJson() const override;
    QJsonValue asJsonValue() const override;
    void fromJsonValue(QJsonValue json) override;
    void fromJson(QString jsonString) override;

    enum class eOAICurrency {
        INVALID_VALUE_OPENAPI_GENERATED = 0,
        UNK, 
        USD, 
        GBP, 
        CAD, 
        EUR, 
        AUD, 
        NZD, 
        SEK, 
        ILS, 
        CHF, 
        HKD, 
        JPY, 
        SGD, 
        KRW, 
        NOK, 
        DKK, 
        PLN, 
        RON, 
        HUF, 
        CZK, 
        BRL, 
        MXN, 
        ARS, 
        CLP, 
        COP, 
        INR, 
        TRY
    };
    OAICurrency::eOAICurrency getValue() const;
    void setValue(const OAICurrency::eOAICurrency& value);
    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    eOAICurrency m_value;
    bool m_value_isSet;
    bool m_value_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAICurrency)

#endif // OAICurrency_H
