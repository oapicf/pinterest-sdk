/**
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.6.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 7.4.0.
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
    m_Item_price = utility::conversions::to_string_t("");
    m_Item_priceIsSet = false;
    m_Quantity = 0L;
    m_QuantityIsSet = false;
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
    
    if(m_Item_priceIsSet)
    {
        val[utility::conversions::to_string_t(U("item_price"))] = ModelBase::toJson(m_Item_price);
    }
    if(m_QuantityIsSet)
    {
        val[utility::conversions::to_string_t(U("quantity"))] = ModelBase::toJson(m_Quantity);
    }

    return val;
}

bool ConversionEvents_data_inner_custom_data_contents_inner::fromJson(const web::json::value& val)
{
    bool ok = true;
    
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
    return ok;
}

void ConversionEvents_data_inner_custom_data_contents_inner::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }
    if(m_Item_priceIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("item_price")), m_Item_price));
    }
    if(m_QuantityIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("quantity")), m_Quantity));
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
    return ok;
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
}
}
}
}

