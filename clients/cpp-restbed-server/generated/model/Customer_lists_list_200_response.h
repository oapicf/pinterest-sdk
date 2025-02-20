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
 * Customer_lists_list_200_response.h
 *
 * 
 */

#ifndef Customer_lists_list_200_response_H_
#define Customer_lists_list_200_response_H_



#include "CustomerList.h"
#include <string>
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
class  Customer_lists_list_200_response : public Paginated
{
public:
    Customer_lists_list_200_response() = default;
    explicit Customer_lists_list_200_response(boost::property_tree::ptree const& pt);
    virtual ~Customer_lists_list_200_response() = default;

    Customer_lists_list_200_response(const Customer_lists_list_200_response& other) = default; // copy constructor
    Customer_lists_list_200_response(Customer_lists_list_200_response&& other) noexcept = default; // move constructor

    Customer_lists_list_200_response& operator=(const Customer_lists_list_200_response& other) = default; // copy assignment
    Customer_lists_list_200_response& operator=(Customer_lists_list_200_response&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// Customer_lists_list_200_response members

    /// <summary>
    /// 
    /// </summary>
    std::vector<CustomerList> getItems() const;
    void setItems(std::vector<CustomerList> value);

    /// <summary>
    /// 
    /// </summary>
    std::string getBookmark() const;
    void setBookmark(std::string value);

protected:
    std::vector<CustomerList> m_Items;
    std::string m_Bookmark = "";
};

std::vector<Customer_lists_list_200_response> createCustomer_lists_list_200_responseVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<Customer_lists_list_200_response>(const Customer_lists_list_200_response& val) {
    return val.toPropertyTree();
}

template<>
inline Customer_lists_list_200_response fromPt<Customer_lists_list_200_response>(const boost::property_tree::ptree& pt) {
    Customer_lists_list_200_response ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* Customer_lists_list_200_response_H_ */
