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
 * CatalogsProductGroupFiltersAnyOf.h
 *
 * 
 */

#ifndef CatalogsProductGroupFiltersAnyOf_H_
#define CatalogsProductGroupFiltersAnyOf_H_


#include "CatalogsProductGroupFilterKeys.h"
#include <vector>
#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
/// 
/// </summary>
class  CatalogsProductGroupFiltersAnyOf
{
public:
    CatalogsProductGroupFiltersAnyOf();
    virtual ~CatalogsProductGroupFiltersAnyOf() = default;


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

    bool operator==(const CatalogsProductGroupFiltersAnyOf& rhs) const;
    bool operator!=(const CatalogsProductGroupFiltersAnyOf& rhs) const;

    /////////////////////////////////////////////
    /// CatalogsProductGroupFiltersAnyOf members

    /// <summary>
    /// 
    /// </summary>
    std::vector<org::openapitools::server::model::CatalogsProductGroupFilterKeys> getAnyOf() const;
    void setAnyOf(std::vector<org::openapitools::server::model::CatalogsProductGroupFilterKeys> const& value);

    friend  void to_json(nlohmann::json& j, const CatalogsProductGroupFiltersAnyOf& o);
    friend  void from_json(const nlohmann::json& j, CatalogsProductGroupFiltersAnyOf& o);
protected:
    std::vector<org::openapitools::server::model::CatalogsProductGroupFilterKeys> m_Any_of;

    
};

} // namespace org::openapitools::server::model

#endif /* CatalogsProductGroupFiltersAnyOf_H_ */
