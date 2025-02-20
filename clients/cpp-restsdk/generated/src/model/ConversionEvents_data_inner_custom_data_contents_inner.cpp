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



#include "CppRestOpenAPIClient/model/ConversionEvents_data_inner_custom_data_contents_inner.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



ConversionEvents_data_inner_custom_data_contents_inner::ConversionEvents_data_inner_custom_data_contents_inner()
{
    m_Id = utility::conversions::to_string_t("");
    m_IdIsSet = false;
    m_Item_price = utility::conversions::to_string_t("");
    m_Item_priceIsSet = false;
    m_Quantity = 0L;
    m_QuantityIsSet = false;
    m_Item_name = utility::conversions::to_string_t("");
    m_Item_nameIsSet = false;
    m_Item_category = utility::conversions::to_string_t("");
    m_Item_categoryIsSet = false;
    m_Item_brand = utility::conversions::to_string_t("");
    m_Item_brandIsSet = false;
}

ConversionEvents_data_inner_custom_data_contents_inner::~ConversionEvents_data_inner_custom_data_contents_inner()
{
}

void ConversionEvents_data_inner_custom_data_contents_inner::validate()
{
    // TODO: implement validation
}

web::json::value ConversionEvents_data_inner_custom_data_contents_inner::toJson() const
{

    web::json::value val = web::json::value::object();
    
    if(m_IdIsSet)
    {
        val[utility::conversions::to_string_t(U("id"))] = ModelBase::toJson(m_Id);
    }
    if(m_Item_priceIsSet)
    {
        val[utility::conversions::to_string_t(U("item_price"))] = ModelBase::toJson(m_Item_price);
    }
    if(m_QuantityIsSet)
    {
        val[utility::conversions::to_string_t(U("quantity"))] = ModelBase::toJson(m_Quantity);
    }
    if(m_Item_nameIsSet)
    {
        val[utility::conversions::to_string_t(U("item_name"))] = ModelBase::toJson(m_Item_name);
    }
    if(m_Item_categoryIsSet)
    {
        val[utility::conversions::to_string_t(U("item_category"))] = ModelBase::toJson(m_Item_category);
    }
    if(m_Item_brandIsSet)
    {
        val[utility::conversions::to_string_t(U("item_brand"))] = ModelBase::toJson(m_Item_brand);
    }

    return val;
}

bool ConversionEvents_data_inner_custom_data_contents_inner::fromJson(const web::json::value& val)
{
    bool ok = true;
    
    if(val.has_field(utility::conversions::to_string_t(U("id"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("id")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setId;
            ok &= ModelBase::fromJson(fieldValue, refVal_setId);
            setId(refVal_setId);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("item_price"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("item_price")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setItemPrice;
            ok &= ModelBase::fromJson(fieldValue, refVal_setItemPrice);
            setItemPrice(refVal_setItemPrice);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("quantity"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("quantity")));
        if(!fieldValue.is_null())
        {
            int64_t refVal_setQuantity;
            ok &= ModelBase::fromJson(fieldValue, refVal_setQuantity);
            setQuantity(refVal_setQuantity);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("item_name"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("item_name")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setItemName;
            ok &= ModelBase::fromJson(fieldValue, refVal_setItemName);
            setItemName(refVal_setItemName);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("item_category"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("item_category")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setItemCategory;
            ok &= ModelBase::fromJson(fieldValue, refVal_setItemCategory);
            setItemCategory(refVal_setItemCategory);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("item_brand"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("item_brand")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setItemBrand;
            ok &= ModelBase::fromJson(fieldValue, refVal_setItemBrand);
            setItemBrand(refVal_setItemBrand);
        }
    }
    return ok;
}

void ConversionEvents_data_inner_custom_data_contents_inner::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }
    if(m_IdIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("id")), m_Id));
    }
    if(m_Item_priceIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("item_price")), m_Item_price));
    }
    if(m_QuantityIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("quantity")), m_Quantity));
    }
    if(m_Item_nameIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("item_name")), m_Item_name));
    }
    if(m_Item_categoryIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("item_category")), m_Item_category));
    }
    if(m_Item_brandIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("item_brand")), m_Item_brand));
    }
}

bool ConversionEvents_data_inner_custom_data_contents_inner::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    bool ok = true;
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }

    if(multipart->hasContent(utility::conversions::to_string_t(U("id"))))
    {
        utility::string_t refVal_setId;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("id"))), refVal_setId );
        setId(refVal_setId);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("item_price"))))
    {
        utility::string_t refVal_setItemPrice;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("item_price"))), refVal_setItemPrice );
        setItemPrice(refVal_setItemPrice);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("quantity"))))
    {
        int64_t refVal_setQuantity;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("quantity"))), refVal_setQuantity );
        setQuantity(refVal_setQuantity);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("item_name"))))
    {
        utility::string_t refVal_setItemName;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("item_name"))), refVal_setItemName );
        setItemName(refVal_setItemName);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("item_category"))))
    {
        utility::string_t refVal_setItemCategory;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("item_category"))), refVal_setItemCategory );
        setItemCategory(refVal_setItemCategory);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("item_brand"))))
    {
        utility::string_t refVal_setItemBrand;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("item_brand"))), refVal_setItemBrand );
        setItemBrand(refVal_setItemBrand);
    }
    return ok;
}

utility::string_t ConversionEvents_data_inner_custom_data_contents_inner::getId() const
{
    return m_Id;
}

void ConversionEvents_data_inner_custom_data_contents_inner::setId(const utility::string_t& value)
{
    m_Id = value;
    m_IdIsSet = true;
}

bool ConversionEvents_data_inner_custom_data_contents_inner::idIsSet() const
{
    return m_IdIsSet;
}

void ConversionEvents_data_inner_custom_data_contents_inner::unsetId()
{
    m_IdIsSet = false;
}
utility::string_t ConversionEvents_data_inner_custom_data_contents_inner::getItemPrice() const
{
    return m_Item_price;
}

void ConversionEvents_data_inner_custom_data_contents_inner::setItemPrice(const utility::string_t& value)
{
    m_Item_price = value;
    m_Item_priceIsSet = true;
}

bool ConversionEvents_data_inner_custom_data_contents_inner::itemPriceIsSet() const
{
    return m_Item_priceIsSet;
}

void ConversionEvents_data_inner_custom_data_contents_inner::unsetItem_price()
{
    m_Item_priceIsSet = false;
}
int64_t ConversionEvents_data_inner_custom_data_contents_inner::getQuantity() const
{
    return m_Quantity;
}

void ConversionEvents_data_inner_custom_data_contents_inner::setQuantity(int64_t value)
{
    m_Quantity = value;
    m_QuantityIsSet = true;
}

bool ConversionEvents_data_inner_custom_data_contents_inner::quantityIsSet() const
{
    return m_QuantityIsSet;
}

void ConversionEvents_data_inner_custom_data_contents_inner::unsetQuantity()
{
    m_QuantityIsSet = false;
}
utility::string_t ConversionEvents_data_inner_custom_data_contents_inner::getItemName() const
{
    return m_Item_name;
}

void ConversionEvents_data_inner_custom_data_contents_inner::setItemName(const utility::string_t& value)
{
    m_Item_name = value;
    m_Item_nameIsSet = true;
}

bool ConversionEvents_data_inner_custom_data_contents_inner::itemNameIsSet() const
{
    return m_Item_nameIsSet;
}

void ConversionEvents_data_inner_custom_data_contents_inner::unsetItem_name()
{
    m_Item_nameIsSet = false;
}
utility::string_t ConversionEvents_data_inner_custom_data_contents_inner::getItemCategory() const
{
    return m_Item_category;
}

void ConversionEvents_data_inner_custom_data_contents_inner::setItemCategory(const utility::string_t& value)
{
    m_Item_category = value;
    m_Item_categoryIsSet = true;
}

bool ConversionEvents_data_inner_custom_data_contents_inner::itemCategoryIsSet() const
{
    return m_Item_categoryIsSet;
}

void ConversionEvents_data_inner_custom_data_contents_inner::unsetItem_category()
{
    m_Item_categoryIsSet = false;
}
utility::string_t ConversionEvents_data_inner_custom_data_contents_inner::getItemBrand() const
{
    return m_Item_brand;
}

void ConversionEvents_data_inner_custom_data_contents_inner::setItemBrand(const utility::string_t& value)
{
    m_Item_brand = value;
    m_Item_brandIsSet = true;
}

bool ConversionEvents_data_inner_custom_data_contents_inner::itemBrandIsSet() const
{
    return m_Item_brandIsSet;
}

void ConversionEvents_data_inner_custom_data_contents_inner::unsetItem_brand()
{
    m_Item_brandIsSet = false;
}
}
}
}
}


