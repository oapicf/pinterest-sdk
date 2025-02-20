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
 * CatalogsFeedProcessingSchedule.h
 *
 * Daily processing schedule. This field is **OPTIONAL**. Use this to configure the preferred time for processing a feed (otherwise random).
 */

#ifndef CatalogsFeedProcessingSchedule_H_
#define CatalogsFeedProcessingSchedule_H_


#include <string>
#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
/// Daily processing schedule. This field is **OPTIONAL**. Use this to configure the preferred time for processing a feed (otherwise random).
/// </summary>
class  CatalogsFeedProcessingSchedule
{
public:
    CatalogsFeedProcessingSchedule();
    virtual ~CatalogsFeedProcessingSchedule() = default;


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

    bool operator==(const CatalogsFeedProcessingSchedule& rhs) const;
    bool operator!=(const CatalogsFeedProcessingSchedule& rhs) const;

    /////////////////////////////////////////////
    /// CatalogsFeedProcessingSchedule members

    /// <summary>
    /// A time in format HH:MM with leading 0 (zero)
    /// </summary>
    std::string getTime() const;
    void setTime(std::string const& value);
    /// <summary>
    /// The timezone considered for the processing schedule time.
    /// </summary>
    std::string getTimezone() const;
    void setTimezone(std::string const& value);

    friend  void to_json(nlohmann::json& j, const CatalogsFeedProcessingSchedule& o);
    friend  void from_json(const nlohmann::json& j, CatalogsFeedProcessingSchedule& o);
protected:
    std::string m_Time;

    std::string m_Timezone;

    
};

} // namespace org::openapitools::server::model

#endif /* CatalogsFeedProcessingSchedule_H_ */
