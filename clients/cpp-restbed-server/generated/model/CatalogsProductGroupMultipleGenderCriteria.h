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
 * CatalogsProductGroupMultipleGenderCriteria.h
 *
 * 
 */

#ifndef CatalogsProductGroupMultipleGenderCriteria_H_
#define CatalogsProductGroupMultipleGenderCriteria_H_



#include "Gender.h"
#include <vector>
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
class  CatalogsProductGroupMultipleGenderCriteria 
{
public:
    CatalogsProductGroupMultipleGenderCriteria() = default;
    explicit CatalogsProductGroupMultipleGenderCriteria(boost::property_tree::ptree const& pt);
    virtual ~CatalogsProductGroupMultipleGenderCriteria() = default;

    CatalogsProductGroupMultipleGenderCriteria(const CatalogsProductGroupMultipleGenderCriteria& other) = default; // copy constructor
    CatalogsProductGroupMultipleGenderCriteria(CatalogsProductGroupMultipleGenderCriteria&& other) noexcept = default; // move constructor

    CatalogsProductGroupMultipleGenderCriteria& operator=(const CatalogsProductGroupMultipleGenderCriteria& other) = default; // copy assignment
    CatalogsProductGroupMultipleGenderCriteria& operator=(CatalogsProductGroupMultipleGenderCriteria&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// CatalogsProductGroupMultipleGenderCriteria members

    /// <summary>
    /// 
    /// </summary>
    std::vector<Gender> getValues() const;
    void setValues(std::vector<Gender> value);

    /// <summary>
    /// 
    /// </summary>
    bool isNegated() const;
    void setNegated(bool value);

protected:
    std::vector<Gender> m_Values;
    bool m_Negated = false;
};

std::vector<CatalogsProductGroupMultipleGenderCriteria> createCatalogsProductGroupMultipleGenderCriteriaVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<CatalogsProductGroupMultipleGenderCriteria>(const CatalogsProductGroupMultipleGenderCriteria& val) {
    return val.toPropertyTree();
}

template<>
inline CatalogsProductGroupMultipleGenderCriteria fromPt<CatalogsProductGroupMultipleGenderCriteria>(const boost::property_tree::ptree& pt) {
    CatalogsProductGroupMultipleGenderCriteria ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* CatalogsProductGroupMultipleGenderCriteria_H_ */
