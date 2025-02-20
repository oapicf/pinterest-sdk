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
 * PinUpdate.h
 *
 * Pin fields for updates
 */

#ifndef PinUpdate_H_
#define PinUpdate_H_


#include <string>
#include <vector>
#include "PinUpdate_carousel_slots_inner.h"
#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
/// Pin fields for updates
/// </summary>
class  PinUpdate
{
public:
    PinUpdate();
    virtual ~PinUpdate() = default;


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

    bool operator==(const PinUpdate& rhs) const;
    bool operator!=(const PinUpdate& rhs) const;

    /////////////////////////////////////////////
    /// PinUpdate members

    /// <summary>
    /// Pin&#39;s alternative text.
    /// </summary>
    std::string getAltText() const;
    void setAltText(std::string const& value);
    bool altTextIsSet() const;
    void unsetAlt_text();
    /// <summary>
    /// The id of the board to move the Pin onto.
    /// </summary>
    std::string getBoardId() const;
    void setBoardId(std::string const& value);
    bool boardIdIsSet() const;
    void unsetBoard_id();
    /// <summary>
    /// &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/article/create-a-board-section\&quot;&gt;Board section&lt;/a&gt; ID.
    /// </summary>
    std::string getBoardSectionId() const;
    void setBoardSectionId(std::string const& value);
    bool boardSectionIdIsSet() const;
    void unsetBoard_section_id();
    /// <summary>
    /// Pin description - 800 characters maximum.
    /// </summary>
    std::string getDescription() const;
    void setDescription(std::string const& value);
    bool descriptionIsSet() const;
    void unsetDescription();
    /// <summary>
    /// URL viewer is taken to when they click pin.
    /// </summary>
    std::string getLink() const;
    void setLink(std::string const& value);
    bool linkIsSet() const;
    void unsetLink();
    /// <summary>
    /// The native pin title that creators explicitly prefer to display.
    /// </summary>
    std::string getTitle() const;
    void setTitle(std::string const& value);
    bool titleIsSet() const;
    void unsetTitle();
    /// <summary>
    /// Carousel Pin slots data.
    /// </summary>
    std::vector<org::openapitools::server::model::PinUpdate_carousel_slots_inner> getCarouselSlots() const;
    void setCarouselSlots(std::vector<org::openapitools::server::model::PinUpdate_carousel_slots_inner> const& value);
    bool carouselSlotsIsSet() const;
    void unsetCarousel_slots();
    /// <summary>
    /// Private note for this Pin. &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/article/add-notes-to-your-pins\&quot;&gt;Learn more&lt;/a&gt;.
    /// </summary>
    std::string getNote() const;
    void setNote(std::string const& value);
    bool noteIsSet() const;
    void unsetNote();

    friend  void to_json(nlohmann::json& j, const PinUpdate& o);
    friend  void from_json(const nlohmann::json& j, PinUpdate& o);
protected:
    std::string m_Alt_text;
    bool m_Alt_textIsSet;
    std::string m_Board_id;
    bool m_Board_idIsSet;
    std::string m_Board_section_id;
    bool m_Board_section_idIsSet;
    std::string m_Description;
    bool m_DescriptionIsSet;
    std::string m_Link;
    bool m_LinkIsSet;
    std::string m_Title;
    bool m_TitleIsSet;
    std::vector<org::openapitools::server::model::PinUpdate_carousel_slots_inner> m_Carousel_slots;
    bool m_Carousel_slotsIsSet;
    std::string m_Note;
    bool m_NoteIsSet;
    
};

} // namespace org::openapitools::server::model

#endif /* PinUpdate_H_ */
