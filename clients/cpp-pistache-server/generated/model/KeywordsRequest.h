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
 * KeywordsRequest.h
 *
 * 
 */

#ifndef KeywordsRequest_H_
#define KeywordsRequest_H_


#include <string>
#include <vector>
#include "KeywordsCommon.h"
#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
/// 
/// </summary>
class  KeywordsRequest
{
public:
    KeywordsRequest();
    virtual ~KeywordsRequest() = default;


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

    bool operator==(const KeywordsRequest& rhs) const;
    bool operator!=(const KeywordsRequest& rhs) const;

    /////////////////////////////////////////////
    /// KeywordsRequest members

    /// <summary>
    /// Keyword JSON array. Each array element has 3 fields
    /// </summary>
    std::vector<org::openapitools::server::model::KeywordsCommon> getKeywords() const;
    void setKeywords(std::vector<org::openapitools::server::model::KeywordsCommon> const& value);
    /// <summary>
    /// Keyword parent entity ID (advertiser, campaign, ad group).
    /// </summary>
    std::string getParentId() const;
    void setParentId(std::string const& value);

    friend  void to_json(nlohmann::json& j, const KeywordsRequest& o);
    friend  void from_json(const nlohmann::json& j, KeywordsRequest& o);
protected:
    std::vector<org::openapitools::server::model::KeywordsCommon> m_Keywords;

    std::string m_Parent_id;

    
};

} // namespace org::openapitools::server::model

#endif /* KeywordsRequest_H_ */
