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
 * AdvancedAuctionOperationError.h
 *
 * Error which occurred when applying a bid options operation to a specific item.
 */

#ifndef AdvancedAuctionOperationError_H_
#define AdvancedAuctionOperationError_H_



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
/// Error which occurred when applying a bid options operation to a specific item.
/// </summary>
class  AdvancedAuctionOperationError 
{
public:
    AdvancedAuctionOperationError() = default;
    explicit AdvancedAuctionOperationError(boost::property_tree::ptree const& pt);
    virtual ~AdvancedAuctionOperationError() = default;

    AdvancedAuctionOperationError(const AdvancedAuctionOperationError& other) = default; // copy constructor
    AdvancedAuctionOperationError(AdvancedAuctionOperationError&& other) noexcept = default; // move constructor

    AdvancedAuctionOperationError& operator=(const AdvancedAuctionOperationError& other) = default; // copy assignment
    AdvancedAuctionOperationError& operator=(AdvancedAuctionOperationError&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// AdvancedAuctionOperationError members

    /// <summary>
    /// The error code for the item bid option operation validation error
    /// </summary>
    int32_t getCode() const;
    void setCode(int32_t value);

    /// <summary>
    /// Message describing the item bid option operation validation error
    /// </summary>
    std::string getMessage() const;
    void setMessage(std::string value);

protected:
    int32_t m_Code = 0;
    std::string m_Message = "";
};

std::vector<AdvancedAuctionOperationError> createAdvancedAuctionOperationErrorVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<AdvancedAuctionOperationError>(const AdvancedAuctionOperationError& val) {
    return val.toPropertyTree();
}

template<>
inline AdvancedAuctionOperationError fromPt<AdvancedAuctionOperationError>(const boost::property_tree::ptree& pt) {
    AdvancedAuctionOperationError ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* AdvancedAuctionOperationError_H_ */
