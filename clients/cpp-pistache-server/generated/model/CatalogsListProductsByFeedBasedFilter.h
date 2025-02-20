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
 * CatalogsListProductsByFeedBasedFilter.h
 *
 * Request object to list products for a given feed_id and product group filter.
 */

#ifndef CatalogsListProductsByFeedBasedFilter_H_
#define CatalogsListProductsByFeedBasedFilter_H_


#include <string>
#include "CatalogsProductGroupFilters.h"
#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
/// Request object to list products for a given feed_id and product group filter.
/// </summary>
class  CatalogsListProductsByFeedBasedFilter
{
public:
    CatalogsListProductsByFeedBasedFilter();
    virtual ~CatalogsListProductsByFeedBasedFilter() = default;


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

    bool operator==(const CatalogsListProductsByFeedBasedFilter& rhs) const;
    bool operator!=(const CatalogsListProductsByFeedBasedFilter& rhs) const;

    /////////////////////////////////////////////
    /// CatalogsListProductsByFeedBasedFilter members

    /// <summary>
    /// Catalog Feed id pertaining to the catalog product group filter.
    /// </summary>
    std::string getFeedId() const;
    void setFeedId(std::string const& value);
    /// <summary>
    /// 
    /// </summary>
    org::openapitools::server::model::CatalogsProductGroupFilters getFilters() const;
    void setFilters(org::openapitools::server::model::CatalogsProductGroupFilters const& value);

    friend  void to_json(nlohmann::json& j, const CatalogsListProductsByFeedBasedFilter& o);
    friend  void from_json(const nlohmann::json& j, CatalogsListProductsByFeedBasedFilter& o);
protected:
    std::string m_Feed_id;

    org::openapitools::server::model::CatalogsProductGroupFilters m_Filters;

    
};

} // namespace org::openapitools::server::model

#endif /* CatalogsListProductsByFeedBasedFilter_H_ */
