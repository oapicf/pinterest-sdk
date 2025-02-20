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
 * ProductGroupReferenceFilter.h
 *
 * 
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_ProductGroupReferenceFilter_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_ProductGroupReferenceFilter_H_


#include "CppRestOpenAPIClient/ModelBase.h"

#include "CppRestOpenAPIClient/model/CatalogsProductGroupMultipleStringCriteria.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



/// <summary>
/// 
/// </summary>
class  ProductGroupReferenceFilter
    : public ModelBase
{
public:
    ProductGroupReferenceFilter();
    virtual ~ProductGroupReferenceFilter();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// ProductGroupReferenceFilter members

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<CatalogsProductGroupMultipleStringCriteria> getPRODUCTGROUP() const;
    bool pRODUCTGROUPIsSet() const;
    void unsetPRODUCT_GROUP();

    void setPRODUCTGROUP(const std::shared_ptr<CatalogsProductGroupMultipleStringCriteria>& value);


protected:
    std::shared_ptr<CatalogsProductGroupMultipleStringCriteria> m_PRODUCT_GROUP;
    bool m_PRODUCT_GROUPIsSet;
};


}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_ProductGroupReferenceFilter_H_ */
