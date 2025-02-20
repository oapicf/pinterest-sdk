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
 * OAIDeliveryMetricsResponse.h
 *
 * 
 */

#ifndef OAIDeliveryMetricsResponse_H
#define OAIDeliveryMetricsResponse_H

#include <QJsonObject>

#include "OAIDeliveryMetricsResponse_items_inner.h"
#include <QList>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {
class OAIDeliveryMetricsResponse_items_inner;

class OAIDeliveryMetricsResponse : public OAIObject {
public:
    OAIDeliveryMetricsResponse();
    OAIDeliveryMetricsResponse(QString json);
    ~OAIDeliveryMetricsResponse() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    QList<OAIDeliveryMetricsResponse_items_inner> getItems() const;
    void setItems(const QList<OAIDeliveryMetricsResponse_items_inner> &items);
    bool is_items_Set() const;
    bool is_items_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    QList<OAIDeliveryMetricsResponse_items_inner> m_items;
    bool m_items_isSet;
    bool m_items_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIDeliveryMetricsResponse)

#endif // OAIDeliveryMetricsResponse_H
