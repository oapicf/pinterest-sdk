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
 * AudienceCategory.h
 *
 * 
 */

#ifndef AudienceCategory_H_
#define AudienceCategory_H_


#include "AudienceSubcategory.h"
#include <string>
#include <vector>
#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
/// 
/// </summary>
class  AudienceCategory
{
public:
    AudienceCategory();
    virtual ~AudienceCategory() = default;


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

    bool operator==(const AudienceCategory& rhs) const;
    bool operator!=(const AudienceCategory& rhs) const;

    /////////////////////////////////////////////
    /// AudienceCategory members

    /// <summary>
    /// Interest unique key (same as ID).
    /// </summary>
    std::string getKey() const;
    void setKey(std::string const& value);
    bool keyIsSet() const;
    void unsetKey();
    /// <summary>
    /// Interest name.
    /// </summary>
    std::string getName() const;
    void setName(std::string const& value);
    bool nameIsSet() const;
    void unsetName();
    /// <summary>
    /// Interest&#39;s percent of category&#39;s total audience.
    /// </summary>
    double getRatio() const;
    void setRatio(double const value);
    bool ratioIsSet() const;
    void unsetRatio();
    /// <summary>
    /// Interest affinity index.
    /// </summary>
    double getIndex() const;
    void setIndex(double const value);
    bool indexIsSet() const;
    void unsetIndex();
    /// <summary>
    /// Interest ID.
    /// </summary>
    std::string getId() const;
    void setId(std::string const& value);
    bool idIsSet() const;
    void unsetId();
    /// <summary>
    /// Subcategory interest distribution
    /// </summary>
    std::vector<org::openapitools::server::model::AudienceSubcategory> getSubcategories() const;
    void setSubcategories(std::vector<org::openapitools::server::model::AudienceSubcategory> const& value);
    bool subcategoriesIsSet() const;
    void unsetSubcategories();

    friend  void to_json(nlohmann::json& j, const AudienceCategory& o);
    friend  void from_json(const nlohmann::json& j, AudienceCategory& o);
protected:
    std::string m_Key;
    bool m_KeyIsSet;
    std::string m_Name;
    bool m_NameIsSet;
    double m_Ratio;
    bool m_RatioIsSet;
    double m_Index;
    bool m_IndexIsSet;
    std::string m_Id;
    bool m_IdIsSet;
    std::vector<org::openapitools::server::model::AudienceSubcategory> m_Subcategories;
    bool m_SubcategoriesIsSet;
    
};

} // namespace org::openapitools::server::model

#endif /* AudienceCategory_H_ */
