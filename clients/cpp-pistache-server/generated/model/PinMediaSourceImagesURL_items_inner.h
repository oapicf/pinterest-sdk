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
 * PinMediaSourceImagesURL_items_inner.h
 *
 * 
 */

#ifndef PinMediaSourceImagesURL_items_inner_H_
#define PinMediaSourceImagesURL_items_inner_H_


#include <string>
#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
/// 
/// </summary>
class  PinMediaSourceImagesURL_items_inner
{
public:
    PinMediaSourceImagesURL_items_inner();
    virtual ~PinMediaSourceImagesURL_items_inner() = default;


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

    bool operator==(const PinMediaSourceImagesURL_items_inner& rhs) const;
    bool operator!=(const PinMediaSourceImagesURL_items_inner& rhs) const;

    /////////////////////////////////////////////
    /// PinMediaSourceImagesURL_items_inner members

    /// <summary>
    /// 
    /// </summary>
    std::string getTitle() const;
    void setTitle(std::string const& value);
    bool titleIsSet() const;
    void unsetTitle();
    /// <summary>
    /// 
    /// </summary>
    std::string getDescription() const;
    void setDescription(std::string const& value);
    bool descriptionIsSet() const;
    void unsetDescription();
    /// <summary>
    /// Destination link for the image.
    /// </summary>
    std::string getLink() const;
    void setLink(std::string const& value);
    bool linkIsSet() const;
    void unsetLink();
    /// <summary>
    /// URL of image to upload.
    /// </summary>
    std::string getUrl() const;
    void setUrl(std::string const& value);

    friend  void to_json(nlohmann::json& j, const PinMediaSourceImagesURL_items_inner& o);
    friend  void from_json(const nlohmann::json& j, PinMediaSourceImagesURL_items_inner& o);
protected:
    std::string m_Title;
    bool m_TitleIsSet;
    std::string m_Description;
    bool m_DescriptionIsSet;
    std::string m_Link;
    bool m_LinkIsSet;
    std::string m_Url;

    
};

} // namespace org::openapitools::server::model

#endif /* PinMediaSourceImagesURL_items_inner_H_ */
