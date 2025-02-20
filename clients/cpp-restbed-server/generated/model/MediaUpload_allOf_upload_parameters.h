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
 * MediaUpload_allOf_upload_parameters.h
 *
 * The list of parameter key/value pairs you will need to send with your POST request to upload your media file.
 */

#ifndef MediaUpload_allOf_upload_parameters_H_
#define MediaUpload_allOf_upload_parameters_H_



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
/// The list of parameter key/value pairs you will need to send with your POST request to upload your media file.
/// </summary>
class  MediaUpload_allOf_upload_parameters 
{
public:
    MediaUpload_allOf_upload_parameters() = default;
    explicit MediaUpload_allOf_upload_parameters(boost::property_tree::ptree const& pt);
    virtual ~MediaUpload_allOf_upload_parameters() = default;

    MediaUpload_allOf_upload_parameters(const MediaUpload_allOf_upload_parameters& other) = default; // copy constructor
    MediaUpload_allOf_upload_parameters(MediaUpload_allOf_upload_parameters&& other) noexcept = default; // move constructor

    MediaUpload_allOf_upload_parameters& operator=(const MediaUpload_allOf_upload_parameters& other) = default; // copy assignment
    MediaUpload_allOf_upload_parameters& operator=(MediaUpload_allOf_upload_parameters&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// MediaUpload_allOf_upload_parameters members

    /// <summary>
    /// 
    /// </summary>
    std::string getXAmzDate() const;
    void setXAmzDate(std::string value);

    /// <summary>
    /// 
    /// </summary>
    std::string getXAmzSignature() const;
    void setXAmzSignature(std::string value);

    /// <summary>
    /// 
    /// </summary>
    std::string getXAmzSecurityToken() const;
    void setXAmzSecurityToken(std::string value);

    /// <summary>
    /// 
    /// </summary>
    std::string getXAmzAlgorithm() const;
    void setXAmzAlgorithm(std::string value);

    /// <summary>
    /// 
    /// </summary>
    std::string getKey() const;
    void setKey(std::string value);

    /// <summary>
    /// 
    /// </summary>
    std::string getPolicy() const;
    void setPolicy(std::string value);

    /// <summary>
    /// 
    /// </summary>
    std::string getXAmzCredential() const;
    void setXAmzCredential(std::string value);

    /// <summary>
    /// 
    /// </summary>
    std::string getContentType() const;
    void setContentType(std::string value);

protected:
    std::string m_X_amz_date = "";
    std::string m_X_amz_signature = "";
    std::string m_X_amz_security_token = "";
    std::string m_X_amz_algorithm = "";
    std::string m_Key = "";
    std::string m_Policy = "";
    std::string m_X_amz_credential = "";
    std::string m_Content_Type = "";
};

std::vector<MediaUpload_allOf_upload_parameters> createMediaUpload_allOf_upload_parametersVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<MediaUpload_allOf_upload_parameters>(const MediaUpload_allOf_upload_parameters& val) {
    return val.toPropertyTree();
}

template<>
inline MediaUpload_allOf_upload_parameters fromPt<MediaUpload_allOf_upload_parameters>(const boost::property_tree::ptree& pt) {
    MediaUpload_allOf_upload_parameters ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* MediaUpload_allOf_upload_parameters_H_ */
