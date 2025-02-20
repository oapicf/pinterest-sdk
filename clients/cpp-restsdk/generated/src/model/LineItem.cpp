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



#include "CppRestOpenAPIClient/model/LineItem.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



LineItem::LineItem()
{
    m_Product_brand = utility::conversions::to_string_t("");
    m_Product_brandIsSet = false;
    m_Product_category = utility::conversions::to_string_t("");
    m_Product_categoryIsSet = false;
    m_Product_id = 0;
    m_Product_idIsSet = false;
    m_Product_name = utility::conversions::to_string_t("");
    m_Product_nameIsSet = false;
    m_Product_price = utility::conversions::to_string_t("");
    m_Product_priceIsSet = false;
    m_Product_quantity = 0;
    m_Product_quantityIsSet = false;
    m_Product_variant = utility::conversions::to_string_t("");
    m_Product_variantIsSet = false;
    m_Product_variant_id = utility::conversions::to_string_t("");
    m_Product_variant_idIsSet = false;
}

LineItem::~LineItem()
{
}

void LineItem::validate()
{
    // TODO: implement validation
}

web::json::value LineItem::toJson() const
{

    web::json::value val = web::json::value::object();
    
    if(m_Product_brandIsSet)
    {
        val[utility::conversions::to_string_t(U("product_brand"))] = ModelBase::toJson(m_Product_brand);
    }
    if(m_Product_categoryIsSet)
    {
        val[utility::conversions::to_string_t(U("product_category"))] = ModelBase::toJson(m_Product_category);
    }
    if(m_Product_idIsSet)
    {
        val[utility::conversions::to_string_t(U("product_id"))] = ModelBase::toJson(m_Product_id);
    }
    if(m_Product_nameIsSet)
    {
        val[utility::conversions::to_string_t(U("product_name"))] = ModelBase::toJson(m_Product_name);
    }
    if(m_Product_priceIsSet)
    {
        val[utility::conversions::to_string_t(U("product_price"))] = ModelBase::toJson(m_Product_price);
    }
    if(m_Product_quantityIsSet)
    {
        val[utility::conversions::to_string_t(U("product_quantity"))] = ModelBase::toJson(m_Product_quantity);
    }
    if(m_Product_variantIsSet)
    {
        val[utility::conversions::to_string_t(U("product_variant"))] = ModelBase::toJson(m_Product_variant);
    }
    if(m_Product_variant_idIsSet)
    {
        val[utility::conversions::to_string_t(U("product_variant_id"))] = ModelBase::toJson(m_Product_variant_id);
    }

    return val;
}

bool LineItem::fromJson(const web::json::value& val)
{
    bool ok = true;
    
    if(val.has_field(utility::conversions::to_string_t(U("product_brand"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("product_brand")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setProductBrand;
            ok &= ModelBase::fromJson(fieldValue, refVal_setProductBrand);
            setProductBrand(refVal_setProductBrand);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("product_category"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("product_category")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setProductCategory;
            ok &= ModelBase::fromJson(fieldValue, refVal_setProductCategory);
            setProductCategory(refVal_setProductCategory);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("product_id"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("product_id")));
        if(!fieldValue.is_null())
        {
            int32_t refVal_setProductId;
            ok &= ModelBase::fromJson(fieldValue, refVal_setProductId);
            setProductId(refVal_setProductId);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("product_name"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("product_name")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setProductName;
            ok &= ModelBase::fromJson(fieldValue, refVal_setProductName);
            setProductName(refVal_setProductName);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("product_price"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("product_price")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setProductPrice;
            ok &= ModelBase::fromJson(fieldValue, refVal_setProductPrice);
            setProductPrice(refVal_setProductPrice);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("product_quantity"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("product_quantity")));
        if(!fieldValue.is_null())
        {
            int32_t refVal_setProductQuantity;
            ok &= ModelBase::fromJson(fieldValue, refVal_setProductQuantity);
            setProductQuantity(refVal_setProductQuantity);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("product_variant"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("product_variant")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setProductVariant;
            ok &= ModelBase::fromJson(fieldValue, refVal_setProductVariant);
            setProductVariant(refVal_setProductVariant);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("product_variant_id"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("product_variant_id")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setProductVariantId;
            ok &= ModelBase::fromJson(fieldValue, refVal_setProductVariantId);
            setProductVariantId(refVal_setProductVariantId);
        }
    }
    return ok;
}

void LineItem::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }
    if(m_Product_brandIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("product_brand")), m_Product_brand));
    }
    if(m_Product_categoryIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("product_category")), m_Product_category));
    }
    if(m_Product_idIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("product_id")), m_Product_id));
    }
    if(m_Product_nameIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("product_name")), m_Product_name));
    }
    if(m_Product_priceIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("product_price")), m_Product_price));
    }
    if(m_Product_quantityIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("product_quantity")), m_Product_quantity));
    }
    if(m_Product_variantIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("product_variant")), m_Product_variant));
    }
    if(m_Product_variant_idIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("product_variant_id")), m_Product_variant_id));
    }
}

bool LineItem::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    bool ok = true;
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }

    if(multipart->hasContent(utility::conversions::to_string_t(U("product_brand"))))
    {
        utility::string_t refVal_setProductBrand;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("product_brand"))), refVal_setProductBrand );
        setProductBrand(refVal_setProductBrand);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("product_category"))))
    {
        utility::string_t refVal_setProductCategory;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("product_category"))), refVal_setProductCategory );
        setProductCategory(refVal_setProductCategory);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("product_id"))))
    {
        int32_t refVal_setProductId;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("product_id"))), refVal_setProductId );
        setProductId(refVal_setProductId);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("product_name"))))
    {
        utility::string_t refVal_setProductName;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("product_name"))), refVal_setProductName );
        setProductName(refVal_setProductName);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("product_price"))))
    {
        utility::string_t refVal_setProductPrice;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("product_price"))), refVal_setProductPrice );
        setProductPrice(refVal_setProductPrice);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("product_quantity"))))
    {
        int32_t refVal_setProductQuantity;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("product_quantity"))), refVal_setProductQuantity );
        setProductQuantity(refVal_setProductQuantity);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("product_variant"))))
    {
        utility::string_t refVal_setProductVariant;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("product_variant"))), refVal_setProductVariant );
        setProductVariant(refVal_setProductVariant);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("product_variant_id"))))
    {
        utility::string_t refVal_setProductVariantId;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("product_variant_id"))), refVal_setProductVariantId );
        setProductVariantId(refVal_setProductVariantId);
    }
    return ok;
}

utility::string_t LineItem::getProductBrand() const
{
    return m_Product_brand;
}

void LineItem::setProductBrand(const utility::string_t& value)
{
    m_Product_brand = value;
    m_Product_brandIsSet = true;
}

bool LineItem::productBrandIsSet() const
{
    return m_Product_brandIsSet;
}

void LineItem::unsetProduct_brand()
{
    m_Product_brandIsSet = false;
}
utility::string_t LineItem::getProductCategory() const
{
    return m_Product_category;
}

void LineItem::setProductCategory(const utility::string_t& value)
{
    m_Product_category = value;
    m_Product_categoryIsSet = true;
}

bool LineItem::productCategoryIsSet() const
{
    return m_Product_categoryIsSet;
}

void LineItem::unsetProduct_category()
{
    m_Product_categoryIsSet = false;
}
int32_t LineItem::getProductId() const
{
    return m_Product_id;
}

void LineItem::setProductId(int32_t value)
{
    m_Product_id = value;
    m_Product_idIsSet = true;
}

bool LineItem::productIdIsSet() const
{
    return m_Product_idIsSet;
}

void LineItem::unsetProduct_id()
{
    m_Product_idIsSet = false;
}
utility::string_t LineItem::getProductName() const
{
    return m_Product_name;
}

void LineItem::setProductName(const utility::string_t& value)
{
    m_Product_name = value;
    m_Product_nameIsSet = true;
}

bool LineItem::productNameIsSet() const
{
    return m_Product_nameIsSet;
}

void LineItem::unsetProduct_name()
{
    m_Product_nameIsSet = false;
}
utility::string_t LineItem::getProductPrice() const
{
    return m_Product_price;
}

void LineItem::setProductPrice(const utility::string_t& value)
{
    m_Product_price = value;
    m_Product_priceIsSet = true;
}

bool LineItem::productPriceIsSet() const
{
    return m_Product_priceIsSet;
}

void LineItem::unsetProduct_price()
{
    m_Product_priceIsSet = false;
}
int32_t LineItem::getProductQuantity() const
{
    return m_Product_quantity;
}

void LineItem::setProductQuantity(int32_t value)
{
    m_Product_quantity = value;
    m_Product_quantityIsSet = true;
}

bool LineItem::productQuantityIsSet() const
{
    return m_Product_quantityIsSet;
}

void LineItem::unsetProduct_quantity()
{
    m_Product_quantityIsSet = false;
}
utility::string_t LineItem::getProductVariant() const
{
    return m_Product_variant;
}

void LineItem::setProductVariant(const utility::string_t& value)
{
    m_Product_variant = value;
    m_Product_variantIsSet = true;
}

bool LineItem::productVariantIsSet() const
{
    return m_Product_variantIsSet;
}

void LineItem::unsetProduct_variant()
{
    m_Product_variantIsSet = false;
}
utility::string_t LineItem::getProductVariantId() const
{
    return m_Product_variant_id;
}

void LineItem::setProductVariantId(const utility::string_t& value)
{
    m_Product_variant_id = value;
    m_Product_variant_idIsSet = true;
}

bool LineItem::productVariantIdIsSet() const
{
    return m_Product_variant_idIsSet;
}

void LineItem::unsetProduct_variant_id()
{
    m_Product_variant_idIsSet = false;
}
}
}
}
}


