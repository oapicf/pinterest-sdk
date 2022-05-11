/**
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.3.0
 * Contact: pinterest-api@pinterest.com
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 5.4.0.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/*
 * Paginated.h
 *
 * 
 */

#ifndef Paginated_H_
#define Paginated_H_



#include <string>
#include "Object.h"
#include <vector>
#include <memory>
#include <vector>
#include <boost/property_tree/ptree.hpp>

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// 
/// </summary>
class  Paginated 
{
public:
    Paginated() = default;
    explicit Paginated(boost::property_tree::ptree const& pt);
    virtual ~Paginated() = default;

    std::string toJsonString(bool prettyJson = false);
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree();
    void fromPropertyTree(boost::property_tree::ptree const& pt);

    /////////////////////////////////////////////
    /// Paginated members

    /// <summary>
    /// 
    /// </summary>
    std::vector<std::shared_ptr<Object>> getItems() const;
    void setItems(std::vector<std::shared_ptr<Object>> value);

    /// <summary>
    /// 
    /// </summary>
    std::string getBookmark() const;
    void setBookmark(std::string value);

protected:
    //////////////////////////////////////
    // Override these for customization //
    //////////////////////////////////////

    virtual std::string toJsonString_internal(bool prettyJson = false);
    virtual void fromJsonString_internal(std::string const& jsonString);
    virtual boost::property_tree::ptree toPropertyTree_internal();
    virtual void fromPropertyTree_internal(boost::property_tree::ptree const& pt);


protected:
    std::vector<std::shared_ptr<Object>> m_Items;
    std::string m_Bookmark = "";
};

std::vector<Paginated> createPaginatedVectorFromJsonString(const std::string& json);

}
}
}
}

#endif /* Paginated_H_ */