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
 * Pins_save_request.h
 *
 * 
 */

#ifndef Pins_save_request_H_
#define Pins_save_request_H_



#include <string>
#include <memory>
#include <vector>
#include <boost/property_tree/ptree.hpp>
#include "helpers.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// 
/// </summary>
class  Pins_save_request 
{
public:
    Pins_save_request() = default;
    explicit Pins_save_request(boost::property_tree::ptree const& pt);
    virtual ~Pins_save_request() = default;

    Pins_save_request(const Pins_save_request& other) = default; // copy constructor
    Pins_save_request(Pins_save_request&& other) noexcept = default; // move constructor

    Pins_save_request& operator=(const Pins_save_request& other) = default; // copy assignment
    Pins_save_request& operator=(Pins_save_request&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// Pins_save_request members

    /// <summary>
    /// Unique identifier of the board to which the pin will be saved.
    /// </summary>
    std::string getBoardId() const;
    void setBoardId(std::string value);

    /// <summary>
    /// Unique identifier of the board section to which the pin will be saved.
    /// </summary>
    std::string getBoardSectionId() const;
    void setBoardSectionId(std::string value);

protected:
    std::string m_Board_id = "";
    std::string m_Board_section_id = "";
};

std::vector<Pins_save_request> createPins_save_requestVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<Pins_save_request>(const Pins_save_request& val) {
    return val.toPropertyTree();
}

template<>
inline Pins_save_request fromPt<Pins_save_request>(const boost::property_tree::ptree& pt) {
    Pins_save_request ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* Pins_save_request_H_ */
