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
 * CustomerList.h
 *
 * 
 */

#ifndef CustomerList_H_
#define CustomerList_H_



#include <string>
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
/// 
/// </summary>
class  CustomerList 
{
public:
    CustomerList() = default;
    explicit CustomerList(boost::property_tree::ptree const& pt);
    virtual ~CustomerList() = default;

    CustomerList(const CustomerList& other) = default; // copy constructor
    CustomerList(CustomerList&& other) noexcept = default; // move constructor

    CustomerList& operator=(const CustomerList& other) = default; // copy assignment
    CustomerList& operator=(CustomerList&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// CustomerList members

    /// <summary>
    /// Associated ad account ID.
    /// </summary>
    std::string getAdAccountId() const;
    void setAdAccountId(std::string value);

    /// <summary>
    /// Creation time. Unix timestamp in seconds.
    /// </summary>
    double getCreatedTime() const;
    void setCreatedTime(double value);

    /// <summary>
    /// Customer list ID.
    /// </summary>
    std::string getId() const;
    void setId(std::string value);

    /// <summary>
    /// Customer list name.
    /// </summary>
    std::string getName() const;
    void setName(std::string value);

    /// <summary>
    /// Total number of list updates.  List creation counts as one batch. Each &lt;a href&#x3D;\&quot;/docs/redoc/#operation/ads_v3_customer_list_add_handler_PUT\&quot;&gt;Append&lt;/a&gt; or &lt;a href&#x3D;\&quot;/docs/redoc/#operation/ads_v3_customer_list_remove_handler_PUT\&quot;&gt;Remove API&lt;/a&gt; call counts as another. List creation via the Ads Manager UI could result in more than one batch since the UI breaks up large lists.
    /// </summary>
    double getNumBatches() const;
    void setNumBatches(double value);

    /// <summary>
    /// Number of removed user records. In a &lt;a href&#x3D;\&quot;/docs/redoc/#operation/ads_v3_customer_list_remove_handler_PUT\&quot;&gt;Remove API&lt;/a&gt; call, this counter increases even if the user is not found in the list.
    /// </summary>
    double getNumRemovedUserRecords() const;
    void setNumRemovedUserRecords(double value);

    /// <summary>
    /// Number of uploaded user records. In an &lt;a href&#x3D;\&quot;/docs/redoc/#operation/ads_v3_customer_list_add_handler_PUT\&quot;&gt;Append API&lt;/a&gt; call, this counter increases even if the uploaded user is already in the list.
    /// </summary>
    double getNumUploadedUserRecords() const;
    void setNumUploadedUserRecords(double value);

    /// <summary>
    /// Customer list status. TOO_SMALL - the list has less than 100 Pinterest users.
    /// </summary>
    std::string getStatus() const;
    void setStatus(std::string value);

    /// <summary>
    /// Always \&quot;customerlist\&quot;.
    /// </summary>
    std::string getType() const;
    void setType(std::string value);

    /// <summary>
    /// Last update time. Unix timestamp in seconds.
    /// </summary>
    double getUpdatedTime() const;
    void setUpdatedTime(double value);

    /// <summary>
    /// Customer list errors
    /// </summary>
    std::string getExceptions() const;
    void setExceptions(std::string value);

protected:
    std::string m_Ad_account_id = "";
    double m_Created_time = 0.0;
    std::string m_Id = "";
    std::string m_Name = "";
    double m_Num_batches = 0.0;
    double m_Num_removed_user_records = 0.0;
    double m_Num_uploaded_user_records = 0.0;
    std::string m_Status = "";
    std::string m_Type = "";
    double m_Updated_time = 0.0;
    std::string m_Exceptions = std::string{};
};

std::vector<CustomerList> createCustomerListVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<CustomerList>(const CustomerList& val) {
    return val.toPropertyTree();
}

template<>
inline CustomerList fromPt<CustomerList>(const boost::property_tree::ptree& pt) {
    CustomerList ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* CustomerList_H_ */
