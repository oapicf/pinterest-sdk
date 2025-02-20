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
 * OAICatalogsRetailReportParameters.h
 *
 * Parameters for retail report
 */

#ifndef OAICatalogsRetailReportParameters_H
#define OAICatalogsRetailReportParameters_H

#include <QJsonObject>

#include "OAICatalogsHotelReportParameters_report.h"
#include <QString>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAICatalogsRetailReportParameters : public OAIObject {
public:
    OAICatalogsRetailReportParameters();
    OAICatalogsRetailReportParameters(QString json);
    ~OAICatalogsRetailReportParameters() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    QString getCatalogType() const;
    void setCatalogType(const QString &catalog_type);
    bool is_catalog_type_Set() const;
    bool is_catalog_type_Valid() const;

    OAICatalogsHotelReportParameters_report getReport() const;
    void setReport(const OAICatalogsHotelReportParameters_report &report);
    bool is_report_Set() const;
    bool is_report_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    QString catalog_type;
    bool m_catalog_type_isSet;
    bool m_catalog_type_isValid;

    OAICatalogsHotelReportParameters_report report;
    bool m_report_isSet;
    bool m_report_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAICatalogsRetailReportParameters)

#endif // OAICatalogsRetailReportParameters_H
