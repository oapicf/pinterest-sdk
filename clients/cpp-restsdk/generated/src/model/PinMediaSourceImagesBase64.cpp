/**
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.12.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 7.4.0.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */



#include "CppRestOpenAPIClient/model/PinMediaSourceImagesBase64.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



PinMediaSourceImagesBase64::PinMediaSourceImagesBase64()
{
    m_Source_type = utility::conversions::to_string_t("");
    m_Source_typeIsSet = false;
    m_ItemsIsSet = false;
    m_Index = 0;
    m_IndexIsSet = false;
}

PinMediaSourceImagesBase64::~PinMediaSourceImagesBase64()
{
}

void PinMediaSourceImagesBase64::validate()
{
    // TODO: implement validation
}

web::json::value PinMediaSourceImagesBase64::toJson() const
{

    web::json::value val = web::json::value::object();
    
    if(m_Source_typeIsSet)
    {
        val[utility::conversions::to_string_t(U("source_type"))] = ModelBase::toJson(m_Source_type);
    }
    if(m_ItemsIsSet)
    {
        val[utility::conversions::to_string_t(U("items"))] = ModelBase::toJson(m_Items);
    }
    if(m_IndexIsSet)
    {
        val[utility::conversions::to_string_t(U("index"))] = ModelBase::toJson(m_Index);
    }

    return val;
}

bool PinMediaSourceImagesBase64::fromJson(const web::json::value& val)
{
    bool ok = true;
    
    if(val.has_field(utility::conversions::to_string_t(U("source_type"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("source_type")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setSourceType;
            ok &= ModelBase::fromJson(fieldValue, refVal_setSourceType);
            setSourceType(refVal_setSourceType);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("items"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("items")));
        if(!fieldValue.is_null())
        {
            std::vector<std::shared_ptr<PinMediaSourceImagesBase64_items_inner>> refVal_setItems;
            ok &= ModelBase::fromJson(fieldValue, refVal_setItems);
            setItems(refVal_setItems);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("index"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("index")));
        if(!fieldValue.is_null())
        {
            int32_t refVal_setIndex;
            ok &= ModelBase::fromJson(fieldValue, refVal_setIndex);
            setIndex(refVal_setIndex);
        }
    }
    return ok;
}

void PinMediaSourceImagesBase64::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }
    if(m_Source_typeIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("source_type")), m_Source_type));
    }
    if(m_ItemsIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("items")), m_Items));
    }
    if(m_IndexIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("index")), m_Index));
    }
}

bool PinMediaSourceImagesBase64::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    bool ok = true;
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }

    if(multipart->hasContent(utility::conversions::to_string_t(U("source_type"))))
    {
        utility::string_t refVal_setSourceType;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("source_type"))), refVal_setSourceType );
        setSourceType(refVal_setSourceType);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("items"))))
    {
        std::vector<std::shared_ptr<PinMediaSourceImagesBase64_items_inner>> refVal_setItems;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("items"))), refVal_setItems );
        setItems(refVal_setItems);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("index"))))
    {
        int32_t refVal_setIndex;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("index"))), refVal_setIndex );
        setIndex(refVal_setIndex);
    }
    return ok;
}

utility::string_t PinMediaSourceImagesBase64::getSourceType() const
{
    return m_Source_type;
}

void PinMediaSourceImagesBase64::setSourceType(const utility::string_t& value)
{
    m_Source_type = value;
    m_Source_typeIsSet = true;
}

bool PinMediaSourceImagesBase64::sourceTypeIsSet() const
{
    return m_Source_typeIsSet;
}

void PinMediaSourceImagesBase64::unsetSource_type()
{
    m_Source_typeIsSet = false;
}
std::vector<std::shared_ptr<PinMediaSourceImagesBase64_items_inner>>& PinMediaSourceImagesBase64::getItems()
{
    return m_Items;
}

void PinMediaSourceImagesBase64::setItems(const std::vector<std::shared_ptr<PinMediaSourceImagesBase64_items_inner>>& value)
{
    m_Items = value;
    m_ItemsIsSet = true;
}

bool PinMediaSourceImagesBase64::itemsIsSet() const
{
    return m_ItemsIsSet;
}

void PinMediaSourceImagesBase64::unsetItems()
{
    m_ItemsIsSet = false;
}
int32_t PinMediaSourceImagesBase64::getIndex() const
{
    return m_Index;
}

void PinMediaSourceImagesBase64::setIndex(int32_t value)
{
    m_Index = value;
    m_IndexIsSet = true;
}

bool PinMediaSourceImagesBase64::indexIsSet() const
{
    return m_IndexIsSet;
}

void PinMediaSourceImagesBase64::unsetIndex()
{
    m_IndexIsSet = false;
}
}
}
}
}

