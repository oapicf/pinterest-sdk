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
 * KeywordUpdate.h
 *
 * 
 */

#ifndef KeywordUpdate_H_
#define KeywordUpdate_H_



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
class  KeywordUpdate 
{
public:
    KeywordUpdate() = default;
    explicit KeywordUpdate(boost::property_tree::ptree const& pt);
    virtual ~KeywordUpdate() = default;

    KeywordUpdate(const KeywordUpdate& other) = default; // copy constructor
    KeywordUpdate(KeywordUpdate&& other) noexcept = default; // move constructor

    KeywordUpdate& operator=(const KeywordUpdate& other) = default; // copy assignment
    KeywordUpdate& operator=(KeywordUpdate&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// KeywordUpdate members

    /// <summary>
    /// Keyword ID.
    /// </summary>
    std::string getId() const;
    void setId(std::string value);

    /// <summary>
    /// Is keyword archived?
    /// </summary>
    bool isArchived() const;
    void setArchived(bool value);

    /// <summary>
    /// &lt;/p&gt;&lt;strong&gt;Note:&lt;/strong&gt; bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group.
    /// </summary>
    int32_t getBid() const;
    void setBid(int32_t value);

protected:
    std::string m_Id = "";
    bool m_Archived = false;
    int32_t m_Bid = 0;
};

std::vector<KeywordUpdate> createKeywordUpdateVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<KeywordUpdate>(const KeywordUpdate& val) {
    return val.toPropertyTree();
}

template<>
inline KeywordUpdate fromPt<KeywordUpdate>(const boost::property_tree::ptree& pt) {
    KeywordUpdate ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* KeywordUpdate_H_ */
