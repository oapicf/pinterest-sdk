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



#include "CppRestOpenAPIClient/model/ImageDetails.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



ImageDetails::ImageDetails()
{
    m_Width = 0;
    m_WidthIsSet = false;
    m_Height = 0;
    m_HeightIsSet = false;
    m_Url = utility::conversions::to_string_t("");
    m_UrlIsSet = false;
}

ImageDetails::~ImageDetails()
{
}

void ImageDetails::validate()
{
    // TODO: implement validation
}

web::json::value ImageDetails::toJson() const
{

    web::json::value val = web::json::value::object();
    
    if(m_WidthIsSet)
    {
        val[utility::conversions::to_string_t(U("width"))] = ModelBase::toJson(m_Width);
    }
    if(m_HeightIsSet)
    {
        val[utility::conversions::to_string_t(U("height"))] = ModelBase::toJson(m_Height);
    }
    if(m_UrlIsSet)
    {
        val[utility::conversions::to_string_t(U("url"))] = ModelBase::toJson(m_Url);
    }

    return val;
}

bool ImageDetails::fromJson(const web::json::value& val)
{
    bool ok = true;
    
    if(val.has_field(utility::conversions::to_string_t(U("width"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("width")));
        if(!fieldValue.is_null())
        {
            int32_t refVal_setWidth;
            ok &= ModelBase::fromJson(fieldValue, refVal_setWidth);
            setWidth(refVal_setWidth);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("height"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("height")));
        if(!fieldValue.is_null())
        {
            int32_t refVal_setHeight;
            ok &= ModelBase::fromJson(fieldValue, refVal_setHeight);
            setHeight(refVal_setHeight);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("url"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("url")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setUrl;
            ok &= ModelBase::fromJson(fieldValue, refVal_setUrl);
            setUrl(refVal_setUrl);
        }
    }
    return ok;
}

void ImageDetails::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }
    if(m_WidthIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("width")), m_Width));
    }
    if(m_HeightIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("height")), m_Height));
    }
    if(m_UrlIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("url")), m_Url));
    }
}

bool ImageDetails::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    bool ok = true;
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }

    if(multipart->hasContent(utility::conversions::to_string_t(U("width"))))
    {
        int32_t refVal_setWidth;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("width"))), refVal_setWidth );
        setWidth(refVal_setWidth);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("height"))))
    {
        int32_t refVal_setHeight;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("height"))), refVal_setHeight );
        setHeight(refVal_setHeight);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("url"))))
    {
        utility::string_t refVal_setUrl;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("url"))), refVal_setUrl );
        setUrl(refVal_setUrl);
    }
    return ok;
}

int32_t ImageDetails::getWidth() const
{
    return m_Width;
}

void ImageDetails::setWidth(int32_t value)
{
    m_Width = value;
    m_WidthIsSet = true;
}

bool ImageDetails::widthIsSet() const
{
    return m_WidthIsSet;
}

void ImageDetails::unsetWidth()
{
    m_WidthIsSet = false;
}
int32_t ImageDetails::getHeight() const
{
    return m_Height;
}

void ImageDetails::setHeight(int32_t value)
{
    m_Height = value;
    m_HeightIsSet = true;
}

bool ImageDetails::heightIsSet() const
{
    return m_HeightIsSet;
}

void ImageDetails::unsetHeight()
{
    m_HeightIsSet = false;
}
utility::string_t ImageDetails::getUrl() const
{
    return m_Url;
}

void ImageDetails::setUrl(const utility::string_t& value)
{
    m_Url = value;
    m_UrlIsSet = true;
}

bool ImageDetails::urlIsSet() const
{
    return m_UrlIsSet;
}

void ImageDetails::unsetUrl()
{
    m_UrlIsSet = false;
}
}
}
}
}

