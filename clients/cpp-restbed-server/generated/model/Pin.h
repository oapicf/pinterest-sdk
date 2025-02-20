/**
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 7.9.0.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/*
 * Pin.h
 *
 * Pin
 */

#ifndef Pin_H_
#define Pin_H_



#include "CreativeType.h"
#include "PinMedia.h"
#include <string>
#include "BoardOwner.h"
#include "PinMediaSource.h"
#include <memory>
#include <vector>
#include <array>
#include <boost/property_tree/ptree.hpp>
#include "helpers.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// Pin
/// </summary>
class  Pin 
{
public:
    Pin() = default;
    explicit Pin(boost::property_tree::ptree const& pt);
    virtual ~Pin() = default;

    Pin(const Pin& other) = default; // copy constructor
    Pin(Pin&& other) noexcept = default; // move constructor

    Pin& operator=(const Pin& other) = default; // copy assignment
    Pin& operator=(Pin&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// Pin members

    /// <summary>
    /// 
    /// </summary>
    std::string getId() const;
    void setId(std::string value);

    /// <summary>
    /// 
    /// </summary>
    std::string getCreatedAt() const;
    void setCreatedAt(std::string value);

    /// <summary>
    /// 
    /// </summary>
    std::string getLink() const;
    void setLink(std::string value);

    /// <summary>
    /// 
    /// </summary>
    std::string getTitle() const;
    void setTitle(std::string value);

    /// <summary>
    /// 
    /// </summary>
    std::string getDescription() const;
    void setDescription(std::string value);

    /// <summary>
    /// Dominant pin color. Hex number, e.g. \\\&quot;#6E7874\\\&quot;.
    /// </summary>
    std::string getDominantColor() const;
    void setDominantColor(std::string value);

    /// <summary>
    /// 
    /// </summary>
    std::string getAltText() const;
    void setAltText(std::string value);

    /// <summary>
    /// 
    /// </summary>
    CreativeType getCreativeType() const;
    void setCreativeType(CreativeType value);

    /// <summary>
    /// The board to which this Pin belongs.
    /// </summary>
    std::string getBoardId() const;
    void setBoardId(std::string value);

    /// <summary>
    /// The board section to which this Pin belongs.
    /// </summary>
    std::string getBoardSectionId() const;
    void setBoardSectionId(std::string value);

    /// <summary>
    /// 
    /// </summary>
    BoardOwner getBoardOwner() const;
    void setBoardOwner(BoardOwner value);

    /// <summary>
    /// Whether the \&quot;operation user_account\&quot; is the Pin owner.
    /// </summary>
    bool isIsOwner() const;
    void setIsOwner(bool value);

    /// <summary>
    /// 
    /// </summary>
    PinMedia getMedia() const;
    void setMedia(PinMedia value);

    /// <summary>
    /// 
    /// </summary>
    PinMediaSource getMediaSource() const;
    void setMediaSource(PinMediaSource value);

    /// <summary>
    /// The source pin id if this pin was saved from another pin. &lt;a href&#x3D;\&quot;https://help.pinterest.com/article/save-pins-on-pinterest\&quot;&gt;Learn more&lt;/a&gt;.
    /// </summary>
    std::string getParentPinId() const;
    void setParentPinId(std::string value);

    /// <summary>
    /// Whether the Pin is standard or not. See documentation on &lt;a href&#x3D;\&quot;/docs/api-features/content-overview/\&quot;&gt;Changes to Pin creation&lt;/a&gt; for more information.
    /// </summary>
    bool isIsStandard() const;
    void setIsStandard(bool value);

    /// <summary>
    /// Whether the Pin has been promoted or not.
    /// </summary>
    bool isHasBeenPromoted() const;
    void setHasBeenPromoted(bool value);

    /// <summary>
    /// Private note for this Pin. &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/article/add-notes-to-your-pins\&quot;&gt;Learn more&lt;/a&gt;.
    /// </summary>
    std::string getNote() const;
    void setNote(std::string value);

    /// <summary>
    /// Pin metrics with associated time intervals if any.
    /// </summary>
    std::string getPinMetrics() const;
    void setPinMetrics(std::string value);

protected:
    std::string m_Id = "";
    std::string m_Created_at = "";
    std::string m_Link = "";
    std::string m_Title = "";
    std::string m_Description = "";
    std::string m_Dominant_color = "";
    std::string m_Alt_text = "";
    CreativeType m_Creative_type = "";
    std::string m_Board_id = "";
    std::string m_Board_section_id = "";
    BoardOwner m_Board_owner;
    bool m_Is_owner = false;
    PinMedia m_Media;
    PinMediaSource m_Media_source;
    std::string m_Parent_pin_id = "";
    bool m_Is_standard = false;
    bool m_Has_been_promoted = false;
    std::string m_Note = "";
    std::string m_Pin_metrics = std::string{};
};

std::vector<Pin> createPinVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<Pin>(const Pin& val) {
    return val.toPropertyTree();
}

template<>
inline Pin fromPt<Pin>(const boost::property_tree::ptree& pt) {
    Pin ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* Pin_H_ */
