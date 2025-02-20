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
 * CatalogsProductGroupFilters.h
 *
 * Object holding a group of filters for a catalog product group
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_CatalogsProductGroupFilters_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_CatalogsProductGroupFilters_H_


#include "CppRestOpenAPIClient/ModelBase.h"

#include "CppRestOpenAPIClient/model/CatalogsProductGroupFilterKeys.h"
#include <vector>
#include "CppRestOpenAPIClient/model/CatalogsProductGroupFiltersAllOf.h"
#include "CppRestOpenAPIClient/model/CatalogsProductGroupFiltersAnyOf.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {

class CatalogsProductGroupFilterKeys;


/// <summary>
/// Object holding a group of filters for a catalog product group
/// </summary>
class  CatalogsProductGroupFilters
    : public ModelBase
{
public:
    CatalogsProductGroupFilters();
    virtual ~CatalogsProductGroupFilters();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// CatalogsProductGroupFilters members

    /// <summary>
    /// 
    /// </summary>
    std::vector<std::shared_ptr<CatalogsProductGroupFilterKeys>>& getAnyOf();
    bool anyOfIsSet() const;
    void unsetAny_of();

    void setAnyOf(const std::vector<std::shared_ptr<CatalogsProductGroupFilterKeys>>& value);

    /// <summary>
    /// 
    /// </summary>
    std::vector<std::shared_ptr<CatalogsProductGroupFilterKeys>>& getAllOf();
    bool allOfIsSet() const;
    void unsetAll_of();

    void setAllOf(const std::vector<std::shared_ptr<CatalogsProductGroupFilterKeys>>& value);


protected:
    std::vector<std::shared_ptr<CatalogsProductGroupFilterKeys>> m_Any_of;
    bool m_Any_ofIsSet;
    std::vector<std::shared_ptr<CatalogsProductGroupFilterKeys>> m_All_of;
    bool m_All_ofIsSet;
};


}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_CatalogsProductGroupFilters_H_ */
