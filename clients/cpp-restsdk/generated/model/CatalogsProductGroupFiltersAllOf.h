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
 * CatalogsProductGroupFiltersAllOf.h
 *
 * 
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_CatalogsProductGroupFiltersAllOf_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_CatalogsProductGroupFiltersAllOf_H_


#include "ModelBase.h"

#include "model/CatalogsProductGroupFilterKeys.h"
#include <vector>

namespace org {
namespace openapitools {
namespace client {
namespace model {


/// <summary>
/// 
/// </summary>
class  CatalogsProductGroupFiltersAllOf
    : public ModelBase
{
public:
    CatalogsProductGroupFiltersAllOf();
    virtual ~CatalogsProductGroupFiltersAllOf();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// CatalogsProductGroupFiltersAllOf members

    /// <summary>
    /// 
    /// </summary>
    std::vector<std::shared_ptr<CatalogsProductGroupFilterKeys>>& getAllOf();
    bool allOfIsSet() const;
    void unsetAll_of();

    void setAllOf(const std::vector<std::shared_ptr<CatalogsProductGroupFilterKeys>>& value);


protected:
    std::vector<std::shared_ptr<CatalogsProductGroupFilterKeys>> m_All_of;
    bool m_All_ofIsSet;
};


}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_CatalogsProductGroupFiltersAllOf_H_ */