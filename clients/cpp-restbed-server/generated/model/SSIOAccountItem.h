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
 * SSIOAccountItem.h
 *
 * 
 */

#ifndef SSIOAccountItem_H_
#define SSIOAccountItem_H_



#include <string>
#include "SSIOAccountAddress.h"
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
class  SSIOAccountItem 
{
public:
    SSIOAccountItem() = default;
    explicit SSIOAccountItem(boost::property_tree::ptree const& pt);
    virtual ~SSIOAccountItem() = default;

    SSIOAccountItem(const SSIOAccountItem& other) = default; // copy constructor
    SSIOAccountItem(SSIOAccountItem&& other) noexcept = default; // move constructor

    SSIOAccountItem& operator=(const SSIOAccountItem& other) = default; // copy assignment
    SSIOAccountItem& operator=(SSIOAccountItem&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// SSIOAccountItem members

    /// <summary>
    /// Salesforce id for billto_info
    /// </summary>
    std::string getId() const;
    void setId(std::string value);

    /// <summary>
    /// Salesforce id for IO Terms and Conditions
    /// </summary>
    std::string getIoTermsId() const;
    void setIoTermsId(std::string value);

    /// <summary>
    /// Salesforce text for IO Terms and Conditions
    /// </summary>
    std::string getIoTerms() const;
    void setIoTerms(std::string value);

    /// <summary>
    /// Salesforce id for US Terms and Conditions
    /// </summary>
    std::string getUsTermsId() const;
    void setUsTermsId(std::string value);

    /// <summary>
    /// Salesforce text for US Terms and Conditions
    /// </summary>
    std::string getUsTerms() const;
    void setUsTerms(std::string value);

    /// <summary>
    /// Salesforce id for Rest of the World Terms and Conditions
    /// </summary>
    std::string getRowTermsId() const;
    void setRowTermsId(std::string value);

    /// <summary>
    /// Salesforce text for Rest of the World Terms and Conditions
    /// </summary>
    std::string getRowTerms() const;
    void setRowTerms(std::string value);

    /// <summary>
    /// Insertion Order Type - Pinterest Paper or Agency Paper
    /// </summary>
    std::string getIoType() const;
    void setIoType(std::string value);

    /// <summary>
    /// Address information that is associated with this account.
    /// </summary>
    std::vector<SSIOAccountAddress> getAddresses() const;
    void setAddresses(std::vector<SSIOAccountAddress> value);

protected:
    std::string m_Id = "";
    std::string m_Io_terms_id = "";
    std::string m_Io_terms = "";
    std::string m_Us_terms_id = "";
    std::string m_Us_terms = "";
    std::string m_Row_terms_id = "";
    std::string m_Row_terms = "";
    std::string m_Io_type = "";
    std::vector<SSIOAccountAddress> m_Addresses;
};

std::vector<SSIOAccountItem> createSSIOAccountItemVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<SSIOAccountItem>(const SSIOAccountItem& val) {
    return val.toPropertyTree();
}

template<>
inline SSIOAccountItem fromPt<SSIOAccountItem>(const boost::property_tree::ptree& pt) {
    SSIOAccountItem ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* SSIOAccountItem_H_ */
