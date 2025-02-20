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
 * OAIBidFloor.h
 *
 * 
 */

#ifndef OAIBidFloor_H
#define OAIBidFloor_H

#include <QJsonObject>

#include <QList>
#include <QString>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAIBidFloor : public OAIObject {
public:
    OAIBidFloor();
    OAIBidFloor(QString json);
    ~OAIBidFloor() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    QList<qint32> getBidFloors() const;
    void setBidFloors(const QList<qint32> &bid_floors);
    bool is_bid_floors_Set() const;
    bool is_bid_floors_Valid() const;

    QString getType() const;
    void setType(const QString &type);
    bool is_type_Set() const;
    bool is_type_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    QList<qint32> m_bid_floors;
    bool m_bid_floors_isSet;
    bool m_bid_floors_isValid;

    QString m_type;
    bool m_type_isSet;
    bool m_type_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIBidFloor)

#endif // OAIBidFloor_H
