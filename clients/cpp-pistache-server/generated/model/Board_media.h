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
 * Board_media.h
 *
 * Board media.
 */

#ifndef Board_media_H_
#define Board_media_H_


#include <string>
#include <vector>
#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
/// Board media.
/// </summary>
class  Board_media
{
public:
    Board_media();
    virtual ~Board_media() = default;


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

    bool operator==(const Board_media& rhs) const;
    bool operator!=(const Board_media& rhs) const;

    /////////////////////////////////////////////
    /// Board_media members

    /// <summary>
    /// Board cover image.
    /// </summary>
    std::string getImageCoverUrl() const;
    void setImageCoverUrl(std::string const& value);
    bool imageCoverUrlIsSet() const;
    void unsetImage_cover_url();
    /// <summary>
    /// Board pin thumbnail urls.
    /// </summary>
    std::vector<std::string> getPinThumbnailUrls() const;
    void setPinThumbnailUrls(std::vector<std::string> const& value);
    bool pinThumbnailUrlsIsSet() const;
    void unsetPin_thumbnail_urls();

    friend  void to_json(nlohmann::json& j, const Board_media& o);
    friend  void from_json(const nlohmann::json& j, Board_media& o);
protected:
    std::string m_Image_cover_url;
    bool m_Image_cover_urlIsSet;
    std::vector<std::string> m_Pin_thumbnail_urls;
    bool m_Pin_thumbnail_urlsIsSet;
    
};

} // namespace org::openapitools::server::model

#endif /* Board_media_H_ */