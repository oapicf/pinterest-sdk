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
 * ProductGroupPromotionResponseItem.h
 *
 * 
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_ProductGroupPromotionResponseItem_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_ProductGroupPromotionResponseItem_H_


#include "CppRestOpenAPIClient/ModelBase.h"

#include "CppRestOpenAPIClient/model/ProductGroupPromotionResponseElement.h"
#include "CppRestOpenAPIClient/model/Exception.h"
#include <vector>

namespace org {
namespace openapitools {
namespace client {
namespace model {

class ProductGroupPromotionResponseElement;
class Exception;


/// <summary>
/// 
/// </summary>
class  ProductGroupPromotionResponseItem
    : public ModelBase
{
public:
    ProductGroupPromotionResponseItem();
    virtual ~ProductGroupPromotionResponseItem();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// ProductGroupPromotionResponseItem members

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ProductGroupPromotionResponseElement> getData() const;
    bool dataIsSet() const;
    void unsetData();

    void setData(const std::shared_ptr<ProductGroupPromotionResponseElement>& value);

    /// <summary>
    /// 
    /// </summary>
    std::vector<std::shared_ptr<Exception>>& getExceptions();
    bool exceptionsIsSet() const;
    void unsetExceptions();

    void setExceptions(const std::vector<std::shared_ptr<Exception>>& value);


protected:
    std::shared_ptr<ProductGroupPromotionResponseElement> m_Data;
    bool m_DataIsSet;
    std::vector<std::shared_ptr<Exception>> m_Exceptions;
    bool m_ExceptionsIsSet;
};


}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_ProductGroupPromotionResponseItem_H_ */
