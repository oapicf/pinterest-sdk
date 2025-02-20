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
 * BookClosedResponse.h
 *
 * Creation fields
 */

#ifndef BookClosedResponse_H_
#define BookClosedResponse_H_


#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
/// Creation fields
/// </summary>
class  BookClosedResponse
{
public:
    BookClosedResponse();
    virtual ~BookClosedResponse() = default;


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

    bool operator==(const BookClosedResponse& rhs) const;
    bool operator!=(const BookClosedResponse& rhs) const;

    /////////////////////////////////////////////
    /// BookClosedResponse members

    /// <summary>
    /// Are conversion metrics ready?
    /// </summary>
    bool isConversionMetricsReady() const;
    void setConversionMetricsReady(bool const value);
    bool conversionMetricsReadyIsSet() const;
    void unsetConversion_metrics_ready();
    /// <summary>
    /// Are non-conversion metrics ready?
    /// </summary>
    bool isNonConversionMetricsReady() const;
    void setNonConversionMetricsReady(bool const value);
    bool nonConversionMetricsReadyIsSet() const;
    void unsetNon_conversion_metrics_ready();

    friend  void to_json(nlohmann::json& j, const BookClosedResponse& o);
    friend  void from_json(const nlohmann::json& j, BookClosedResponse& o);
protected:
    bool m_Conversion_metrics_ready;
    bool m_Conversion_metrics_readyIsSet;
    bool m_Non_conversion_metrics_ready;
    bool m_Non_conversion_metrics_readyIsSet;
    
};

} // namespace org::openapitools::server::model

#endif /* BookClosedResponse_H_ */
