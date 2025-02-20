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
 * ProductType2Filter.h
 *
 * 
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_ProductType2Filter_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_ProductType2Filter_H_


#include "CppRestOpenAPIClient/ModelBase.h"

#include "CppRestOpenAPIClient/model/CatalogsProductGroupMultipleStringListCriteria.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



/// <summary>
/// 
/// </summary>
class  ProductType2Filter
    : public ModelBase
{
public:
    ProductType2Filter();
    virtual ~ProductType2Filter();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// ProductType2Filter members

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<CatalogsProductGroupMultipleStringListCriteria> getPRODUCTTYPE2() const;
    bool pRODUCTTYPE2IsSet() const;
    void unsetPRODUCT_TYPE_2();

    void setPRODUCTTYPE2(const std::shared_ptr<CatalogsProductGroupMultipleStringListCriteria>& value);


protected:
    std::shared_ptr<CatalogsProductGroupMultipleStringListCriteria> m_PRODUCT_TYPE_2;
    bool m_PRODUCT_TYPE_2IsSet;
};


}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_ProductType2Filter_H_ */
