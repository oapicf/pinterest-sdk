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
 * CatalogsVerticalFeedsCreateRequest.h
 *
 * Request object for creating a feed.
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_CatalogsVerticalFeedsCreateRequest_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_CatalogsVerticalFeedsCreateRequest_H_

#include <variant>

#include "CppRestOpenAPIClient/ModelBase.h"

#include "CppRestOpenAPIClient/model/CatalogsRetailFeedsCreateRequest.h"
#include "CppRestOpenAPIClient/model/NullableCurrency.h"
#include "CppRestOpenAPIClient/model/CatalogsFeedsCreateRequest_default_locale.h"
#include "CppRestOpenAPIClient/model/Country.h"
#include "CppRestOpenAPIClient/model/CatalogsStatus.h"
#include "CppRestOpenAPIClient/model/CatalogsFeedCredentials.h"
#include "CppRestOpenAPIClient/model/ProductAvailabilityType.h"
#include "CppRestOpenAPIClient/model/CatalogsCreativeAssetsFeedsCreateRequest.h"
#include "CppRestOpenAPIClient/model/CatalogsFormat.h"
#include "CppRestOpenAPIClient/model/CatalogsFeedProcessingSchedule.h"
#include <cpprest/details/basic_types.h>
#include "CppRestOpenAPIClient/model/CatalogsHotelFeedsCreateRequest.h"
#include "CppRestOpenAPIClient/model/CatalogsType.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {

class CatalogsFeedCredentials;
class CatalogsFeedProcessingSchedule;


class  CatalogsVerticalFeedsCreateRequest
{
public:
    CatalogsVerticalFeedsCreateRequest() = default;
    ~CatalogsVerticalFeedsCreateRequest() = default;

    /////////////////////////////////////////////

    void validate();

    web::json::value toJson() const;

    template<typename Target>
    bool fromJson(const web::json::value& json) {
        // convert json to Target type
        Target target;
        if (!target.fromJson(json)) {
            return false;
        }

        m_variantValue = target;
        return true;
    }

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const;

    template<typename Target>
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) {
        // convert multipart to Target type
        Target target;
        if (!target.fromMultiPart(multipart, namePrefix)) {
            return false;
        }

        m_variantValue = target;
        return true;
    }

    /////////////////////////////////////////////
    /// CatalogsVerticalFeedsCreateRequest members

    using VariantType = std::variant<CatalogsCreativeAssetsFeedsCreateRequest, CatalogsHotelFeedsCreateRequest, CatalogsRetailFeedsCreateRequest>;

    const VariantType& getVariant() const;
    void setVariant(VariantType value);

protected:
    VariantType m_variantValue;
};



}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_CatalogsVerticalFeedsCreateRequest_H_ */
