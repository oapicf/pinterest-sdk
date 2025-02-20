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
 * Country.h
 *
 * Country ID from ISO 3166-1 alpha-2.
 */

#ifndef Country_H_
#define Country_H_



#include <memory>
#include <vector>
#include <boost/property_tree/ptree.hpp>
#include "helpers.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// Country ID from ISO 3166-1 alpha-2.
/// </summary>
class  Country 
{
public:
    Country() = default;
    explicit Country(boost::property_tree::ptree const& pt);
    virtual ~Country() = default;

    Country(const Country& other) = default; // copy constructor
    Country(Country&& other) noexcept = default; // move constructor

    Country& operator=(const Country& other) = default; // copy assignment
    Country& operator=(Country&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);

    std::string toString() const;
    void fromString(const std::string& str);

    /////////////////////////////////////////////
    /// Country members
    std::string getEnumValue() const;
    void setEnumValue(const std::string& val);

protected:
    std::string m_CountryEnumValue;
};

std::vector<Country> createCountryVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<Country>(const Country& val) {
    return val.toPropertyTree();
}

template<>
inline Country fromPt<Country>(const boost::property_tree::ptree& pt) {
    Country ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* Country_H_ */
