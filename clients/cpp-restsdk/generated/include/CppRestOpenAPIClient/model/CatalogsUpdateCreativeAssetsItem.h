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
 * CatalogsUpdateCreativeAssetsItem.h
 *
 * A creative assets item to be updated.
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_CatalogsUpdateCreativeAssetsItem_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_CatalogsUpdateCreativeAssetsItem_H_


#include "CppRestOpenAPIClient/ModelBase.h"

#include <cpprest/details/basic_types.h>
#include "CppRestOpenAPIClient/model/CatalogsUpdatableCreativeAssetsAttributes.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {

class CatalogsUpdatableCreativeAssetsAttributes;


/// <summary>
/// A creative assets item to be updated.
/// </summary>
class  CatalogsUpdateCreativeAssetsItem
    : public ModelBase
{
public:
    CatalogsUpdateCreativeAssetsItem();
    virtual ~CatalogsUpdateCreativeAssetsItem();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// CatalogsUpdateCreativeAssetsItem members

    /// <summary>
    /// The catalog creative assets item id in the merchant namespace
    /// </summary>
    utility::string_t getCreativeAssetsId() const;
    bool creativeAssetsIdIsSet() const;
    void unsetCreative_assets_id();

    void setCreativeAssetsId(const utility::string_t& value);

    /// <summary>
    /// 
    /// </summary>
    utility::string_t getOperation() const;
    bool operationIsSet() const;
    void unsetOperation();

    void setOperation(const utility::string_t& value);

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<CatalogsUpdatableCreativeAssetsAttributes> getAttributes() const;
    bool attributesIsSet() const;
    void unsetAttributes();

    void setAttributes(const std::shared_ptr<CatalogsUpdatableCreativeAssetsAttributes>& value);


protected:
    utility::string_t m_Creative_assets_id;
    bool m_Creative_assets_idIsSet;
    utility::string_t m_Operation;
    bool m_OperationIsSet;
    std::shared_ptr<CatalogsUpdatableCreativeAssetsAttributes> m_Attributes;
    bool m_AttributesIsSet;
};


}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_CatalogsUpdateCreativeAssetsItem_H_ */
