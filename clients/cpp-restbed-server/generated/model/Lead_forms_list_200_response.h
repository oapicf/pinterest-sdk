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
 * Lead_forms_list_200_response.h
 *
 * 
 */

#ifndef Lead_forms_list_200_response_H_
#define Lead_forms_list_200_response_H_



#include <string>
#include "LeadFormResponse.h"
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
class  Lead_forms_list_200_response : public Paginated
{
public:
    Lead_forms_list_200_response() = default;
    explicit Lead_forms_list_200_response(boost::property_tree::ptree const& pt);
    virtual ~Lead_forms_list_200_response() = default;

    Lead_forms_list_200_response(const Lead_forms_list_200_response& other) = default; // copy constructor
    Lead_forms_list_200_response(Lead_forms_list_200_response&& other) noexcept = default; // move constructor

    Lead_forms_list_200_response& operator=(const Lead_forms_list_200_response& other) = default; // copy assignment
    Lead_forms_list_200_response& operator=(Lead_forms_list_200_response&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// Lead_forms_list_200_response members

    /// <summary>
    /// 
    /// </summary>
    std::vector<LeadFormResponse> getItems() const;
    void setItems(std::vector<LeadFormResponse> value);

    /// <summary>
    /// 
    /// </summary>
    std::string getBookmark() const;
    void setBookmark(std::string value);

protected:
    std::vector<LeadFormResponse> m_Items;
    std::string m_Bookmark = "";
};

std::vector<Lead_forms_list_200_response> createLead_forms_list_200_responseVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<Lead_forms_list_200_response>(const Lead_forms_list_200_response& val) {
    return val.toPropertyTree();
}

template<>
inline Lead_forms_list_200_response fromPt<Lead_forms_list_200_response>(const boost::property_tree::ptree& pt) {
    Lead_forms_list_200_response ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* Lead_forms_list_200_response_H_ */
