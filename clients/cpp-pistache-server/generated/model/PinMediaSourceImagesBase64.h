/**
* Pinterest REST API
* Pinterest's REST API
*
* The version of the OpenAPI document: 5.12.0
* Contact: blah+oapicf@cliffano.com
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
/*
 * PinMediaSourceImagesBase64.h
 *
 * Multiple Base64-encoded images media source
 */

#ifndef PinMediaSourceImagesBase64_H_
#define PinMediaSourceImagesBase64_H_


#include "PinMediaSourceImagesBase64_items_inner.h"
#include <string>
#include <vector>
#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
/// Multiple Base64-encoded images media source
/// </summary>
class  PinMediaSourceImagesBase64
{
public:
    PinMediaSourceImagesBase64();
    virtual ~PinMediaSourceImagesBase64() = default;


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

    bool operator==(const PinMediaSourceImagesBase64& rhs) const;
    bool operator!=(const PinMediaSourceImagesBase64& rhs) const;

    /////////////////////////////////////////////
    /// PinMediaSourceImagesBase64 members

    /// <summary>
    /// 
    /// </summary>
    std::string getSourceType() const;
    void setSourceType(std::string const& value);
    bool sourceTypeIsSet() const;
    void unsetSource_type();
    /// <summary>
    /// Array with image objects.
    /// </summary>
    std::vector<org::openapitools::server::model::PinMediaSourceImagesBase64_items_inner> getItems() const;
    void setItems(std::vector<org::openapitools::server::model::PinMediaSourceImagesBase64_items_inner> const& value);
    /// <summary>
    /// 
    /// </summary>
    int32_t getIndex() const;
    void setIndex(int32_t const value);
    bool indexIsSet() const;
    void unsetIndex();

    friend  void to_json(nlohmann::json& j, const PinMediaSourceImagesBase64& o);
    friend  void from_json(const nlohmann::json& j, PinMediaSourceImagesBase64& o);
protected:
    std::string m_Source_type;
    bool m_Source_typeIsSet;
    std::vector<org::openapitools::server::model::PinMediaSourceImagesBase64_items_inner> m_Items;

    int32_t m_Index;
    bool m_IndexIsSet;
    
};

} // namespace org::openapitools::server::model

#endif /* PinMediaSourceImagesBase64_H_ */