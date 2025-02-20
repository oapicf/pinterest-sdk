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
 * MediaUploadRequest.h
 *
 * Media upload request
 */

#ifndef MediaUploadRequest_H_
#define MediaUploadRequest_H_



#include "MediaUploadType.h"
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
/// Media upload request
/// </summary>
class  MediaUploadRequest 
{
public:
    MediaUploadRequest() = default;
    explicit MediaUploadRequest(boost::property_tree::ptree const& pt);
    virtual ~MediaUploadRequest() = default;

    MediaUploadRequest(const MediaUploadRequest& other) = default; // copy constructor
    MediaUploadRequest(MediaUploadRequest&& other) noexcept = default; // move constructor

    MediaUploadRequest& operator=(const MediaUploadRequest& other) = default; // copy assignment
    MediaUploadRequest& operator=(MediaUploadRequest&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// MediaUploadRequest members

    /// <summary>
    /// 
    /// </summary>
    MediaUploadType getMediaType() const;
    void setMediaType(MediaUploadType value);

protected:
    MediaUploadType m_Media_type = "";
};

std::vector<MediaUploadRequest> createMediaUploadRequestVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<MediaUploadRequest>(const MediaUploadRequest& val) {
    return val.toPropertyTree();
}

template<>
inline MediaUploadRequest fromPt<MediaUploadRequest>(const boost::property_tree::ptree& pt) {
    MediaUploadRequest ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* MediaUploadRequest_H_ */
