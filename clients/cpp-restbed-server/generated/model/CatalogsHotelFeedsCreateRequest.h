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
 * CatalogsHotelFeedsCreateRequest.h
 *
 * Request object for creating a feed. Please, be aware that \&quot;default_country\&quot; and \&quot;default_locale\&quot; are not required in the spec for forward compatibility but for now the API will not accept requests without those fields.
 */

#ifndef CatalogsHotelFeedsCreateRequest_H_
#define CatalogsHotelFeedsCreateRequest_H_



#include "CatalogsFeedProcessingSchedule.h"
#include "CatalogsFeedCredentials.h"
#include <string>
#include "CatalogsStatus.h"
#include "CatalogsFeedsCreateRequest_default_locale.h"
#include "CatalogsFormat.h"
#include "CatalogsType.h"
#include "NullableCurrency.h"
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
/// Request object for creating a feed. Please, be aware that \&quot;default_country\&quot; and \&quot;default_locale\&quot; are not required in the spec for forward compatibility but for now the API will not accept requests without those fields.
/// </summary>
class  CatalogsHotelFeedsCreateRequest 
{
public:
    CatalogsHotelFeedsCreateRequest() = default;
    explicit CatalogsHotelFeedsCreateRequest(boost::property_tree::ptree const& pt);
    virtual ~CatalogsHotelFeedsCreateRequest() = default;

    CatalogsHotelFeedsCreateRequest(const CatalogsHotelFeedsCreateRequest& other) = default; // copy constructor
    CatalogsHotelFeedsCreateRequest(CatalogsHotelFeedsCreateRequest&& other) noexcept = default; // move constructor

    CatalogsHotelFeedsCreateRequest& operator=(const CatalogsHotelFeedsCreateRequest& other) = default; // copy assignment
    CatalogsHotelFeedsCreateRequest& operator=(CatalogsHotelFeedsCreateRequest&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// CatalogsHotelFeedsCreateRequest members

    /// <summary>
    /// 
    /// </summary>
    NullableCurrency getDefaultCurrency() const;
    void setDefaultCurrency(NullableCurrency value);

    /// <summary>
    /// A human-friendly name associated to a given feed.
    /// </summary>
    std::string getName() const;
    void setName(std::string value);

    /// <summary>
    /// 
    /// </summary>
    CatalogsFormat getFormat() const;
    void setFormat(CatalogsFormat value);

    /// <summary>
    /// 
    /// </summary>
    CatalogsFeedsCreateRequest_default_locale getDefaultLocale() const;
    void setDefaultLocale(CatalogsFeedsCreateRequest_default_locale value);

    /// <summary>
    /// 
    /// </summary>
    CatalogsFeedCredentials getCredentials() const;
    void setCredentials(CatalogsFeedCredentials value);

    /// <summary>
    /// The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.
    /// </summary>
    std::string getLocation() const;
    void setLocation(std::string value);

    /// <summary>
    /// 
    /// </summary>
    CatalogsFeedProcessingSchedule getPreferredProcessingSchedule() const;
    void setPreferredProcessingSchedule(CatalogsFeedProcessingSchedule value);

    /// <summary>
    /// 
    /// </summary>
    CatalogsType getCatalogType() const;
    void setCatalogType(CatalogsType value);

    /// <summary>
    /// Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type. At the moment a catalog can not have multiple hotel feeds but this will change in the future.
    /// </summary>
    std::string getCatalogId() const;
    void setCatalogId(std::string value);

    /// <summary>
    /// 
    /// </summary>
    CatalogsStatus getStatus() const;
    void setStatus(CatalogsStatus value);

protected:
    NullableCurrency m_Default_currency = NullableCurrency{};
    std::string m_Name = "";
    CatalogsFormat m_Format = CatalogsFormat{};
    CatalogsFeedsCreateRequest_default_locale m_Default_locale;
    CatalogsFeedCredentials m_Credentials;
    std::string m_Location = "";
    CatalogsFeedProcessingSchedule m_Preferred_processing_schedule;
    CatalogsType m_Catalog_type = CatalogsType{};
    std::string m_Catalog_id = "";
    CatalogsStatus m_Status;
};

std::vector<CatalogsHotelFeedsCreateRequest> createCatalogsHotelFeedsCreateRequestVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<CatalogsHotelFeedsCreateRequest>(const CatalogsHotelFeedsCreateRequest& val) {
    return val.toPropertyTree();
}

template<>
inline CatalogsHotelFeedsCreateRequest fromPt<CatalogsHotelFeedsCreateRequest>(const boost::property_tree::ptree& pt) {
    CatalogsHotelFeedsCreateRequest ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* CatalogsHotelFeedsCreateRequest_H_ */
