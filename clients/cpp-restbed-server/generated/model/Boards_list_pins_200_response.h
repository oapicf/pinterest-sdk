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
 * Boards_list_pins_200_response.h
 *
 * 
 */

#ifndef Boards_list_pins_200_response_H_
#define Boards_list_pins_200_response_H_



#include <string>
#include "Pin.h"
#include <vector>
#include <memory>
#include <vector>
#include <boost/property_tree/ptree.hpp>
#include "Paginated.h"
#include "helpers.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// 
/// </summary>
class  Boards_list_pins_200_response : public Paginated
{
public:
    Boards_list_pins_200_response() = default;
    explicit Boards_list_pins_200_response(boost::property_tree::ptree const& pt);
    virtual ~Boards_list_pins_200_response() = default;

    Boards_list_pins_200_response(const Boards_list_pins_200_response& other) = default; // copy constructor
    Boards_list_pins_200_response(Boards_list_pins_200_response&& other) noexcept = default; // move constructor

    Boards_list_pins_200_response& operator=(const Boards_list_pins_200_response& other) = default; // copy assignment
    Boards_list_pins_200_response& operator=(Boards_list_pins_200_response&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// Boards_list_pins_200_response members

    /// <summary>
    /// Pins
    /// </summary>
    std::vector<Pin> getItems() const;
    void setItems(std::vector<Pin> value);

    /// <summary>
    /// 
    /// </summary>
    std::string getBookmark() const;
    void setBookmark(std::string value);

protected:
    std::vector<Pin> m_Items;
    std::string m_Bookmark = "";
};

std::vector<Boards_list_pins_200_response> createBoards_list_pins_200_responseVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<Boards_list_pins_200_response>(const Boards_list_pins_200_response& val) {
    return val.toPropertyTree();
}

template<>
inline Boards_list_pins_200_response fromPt<Boards_list_pins_200_response>(const boost::property_tree::ptree& pt) {
    Boards_list_pins_200_response ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* Boards_list_pins_200_response_H_ */
