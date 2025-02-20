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
 * CatalogsHotelReportParameters_report.h
 *
 * 
 */

#ifndef CatalogsHotelReportParameters_report_H_
#define CatalogsHotelReportParameters_report_H_


#include <string>
#include "CatalogsReportDistributionIssueFilter.h"
#include "CatalogsReportFeedIngestionFilter.h"
#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
/// 
/// </summary>
class  CatalogsHotelReportParameters_report
{
public:
    CatalogsHotelReportParameters_report();
    virtual ~CatalogsHotelReportParameters_report() = default;


    /// <summary>
    /// Validate the current data in the model. Throws a ValidationException on failure.
    /// </summary>
    void validate() const;

    /// <summary>
    /// Validate the current data in the model. Returns false on error and writes an error
    /// message into the given stringstream.
    /// </summary>
    bool validate(std::stringstream& msg) const;

    /// <summary>
    /// Helper overload for validate. Used when one model stores another model and calls it's validate.
    /// Not meant to be called outside that case.
    /// </summary>
    bool validate(std::stringstream& msg, const std::string& pathPrefix) const;

    bool operator==(const CatalogsHotelReportParameters_report& rhs) const;
    bool operator!=(const CatalogsHotelReportParameters_report& rhs) const;

    /////////////////////////////////////////////
    /// CatalogsHotelReportParameters_report members

    /// <summary>
    /// 
    /// </summary>
    std::string getReportType() const;
    void setReportType(std::string const& value);
    bool reportTypeIsSet() const;
    void unsetReport_type();
    /// <summary>
    /// ID of the feed entity.
    /// </summary>
    std::string getFeedId() const;
    void setFeedId(std::string const& value);
    /// <summary>
    /// Unique identifier of a feed processing result. It can be acquired from the \&quot;id\&quot; field of the \&quot;items\&quot; array within the response of the [List processing results for a given feed](/docs/api/v5/#operation/feed_processing_results/list). If not provided, default to most recent completed processing result.
    /// </summary>
    std::string getProcessingResultId() const;
    void setProcessingResultId(std::string const& value);
    bool processingResultIdIsSet() const;
    void unsetProcessing_result_id();
    /// <summary>
    /// Unique identifier of a catalog. If not given, oldest catalog will be used
    /// </summary>
    std::string getCatalogId() const;
    void setCatalogId(std::string const& value);
    bool catalogIdIsSet() const;
    void unsetCatalog_id();

    friend  void to_json(nlohmann::json& j, const CatalogsHotelReportParameters_report& o);
    friend  void from_json(const nlohmann::json& j, CatalogsHotelReportParameters_report& o);
protected:
    std::string m_Report_type;
    bool m_Report_typeIsSet;
    std::string m_Feed_id;

    std::string m_Processing_result_id;
    bool m_Processing_result_idIsSet;
    std::string m_Catalog_id;
    bool m_Catalog_idIsSet;
    
};

} // namespace org::openapitools::server::model

#endif /* CatalogsHotelReportParameters_report_H_ */
