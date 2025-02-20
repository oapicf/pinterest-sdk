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



#include "CppRestOpenAPIClient/model/ImageMetadata_images.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



ImageMetadata_images::ImageMetadata_images()
{
    m_r_150x150IsSet = false;
    m_r_400x300IsSet = false;
    m_r_600xIsSet = false;
    m_r_1200xIsSet = false;
}

ImageMetadata_images::~ImageMetadata_images()
{
}

void ImageMetadata_images::validate()
{
    // TODO: implement validation
}

web::json::value ImageMetadata_images::toJson() const
{

    web::json::value val = web::json::value::object();
    
    if(m_r_150x150IsSet)
    {
        val[utility::conversions::to_string_t(U("150x150"))] = ModelBase::toJson(m_r_150x150);
    }
    if(m_r_400x300IsSet)
    {
        val[utility::conversions::to_string_t(U("400x300"))] = ModelBase::toJson(m_r_400x300);
    }
    if(m_r_600xIsSet)
    {
        val[utility::conversions::to_string_t(U("600x"))] = ModelBase::toJson(m_r_600x);
    }
    if(m_r_1200xIsSet)
    {
        val[utility::conversions::to_string_t(U("1200x"))] = ModelBase::toJson(m_r_1200x);
    }

    return val;
}

bool ImageMetadata_images::fromJson(const web::json::value& val)
{
    bool ok = true;
    
    if(val.has_field(utility::conversions::to_string_t(U("150x150"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("150x150")));
        if(!fieldValue.is_null())
        {
            std::shared_ptr<ImageDetails> refVal_setR150x150;
            ok &= ModelBase::fromJson(fieldValue, refVal_setR150x150);
            setR150x150(refVal_setR150x150);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("400x300"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("400x300")));
        if(!fieldValue.is_null())
        {
            std::shared_ptr<ImageDetails> refVal_setR400x300;
            ok &= ModelBase::fromJson(fieldValue, refVal_setR400x300);
            setR400x300(refVal_setR400x300);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("600x"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("600x")));
        if(!fieldValue.is_null())
        {
            std::shared_ptr<ImageDetails> refVal_setR600x;
            ok &= ModelBase::fromJson(fieldValue, refVal_setR600x);
            setR600x(refVal_setR600x);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("1200x"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("1200x")));
        if(!fieldValue.is_null())
        {
            std::shared_ptr<ImageDetails> refVal_setR1200x;
            ok &= ModelBase::fromJson(fieldValue, refVal_setR1200x);
            setR1200x(refVal_setR1200x);
        }
    }
    return ok;
}

void ImageMetadata_images::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }
    if(m_r_150x150IsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("150x150")), m_r_150x150));
    }
    if(m_r_400x300IsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("400x300")), m_r_400x300));
    }
    if(m_r_600xIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("600x")), m_r_600x));
    }
    if(m_r_1200xIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("1200x")), m_r_1200x));
    }
}

bool ImageMetadata_images::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    bool ok = true;
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }

    if(multipart->hasContent(utility::conversions::to_string_t(U("150x150"))))
    {
        std::shared_ptr<ImageDetails> refVal_setR150x150;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("150x150"))), refVal_setR150x150 );
        setR150x150(refVal_setR150x150);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("400x300"))))
    {
        std::shared_ptr<ImageDetails> refVal_setR400x300;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("400x300"))), refVal_setR400x300 );
        setR400x300(refVal_setR400x300);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("600x"))))
    {
        std::shared_ptr<ImageDetails> refVal_setR600x;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("600x"))), refVal_setR600x );
        setR600x(refVal_setR600x);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("1200x"))))
    {
        std::shared_ptr<ImageDetails> refVal_setR1200x;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("1200x"))), refVal_setR1200x );
        setR1200x(refVal_setR1200x);
    }
    return ok;
}

std::shared_ptr<ImageDetails> ImageMetadata_images::getR150x150() const
{
    return m_r_150x150;
}

void ImageMetadata_images::setR150x150(const std::shared_ptr<ImageDetails>& value)
{
    m_r_150x150 = value;
    m_r_150x150IsSet = true;
}

bool ImageMetadata_images::r150x150IsSet() const
{
    return m_r_150x150IsSet;
}

void ImageMetadata_images::unsetr_150x150()
{
    m_r_150x150IsSet = false;
}
std::shared_ptr<ImageDetails> ImageMetadata_images::getR400x300() const
{
    return m_r_400x300;
}

void ImageMetadata_images::setR400x300(const std::shared_ptr<ImageDetails>& value)
{
    m_r_400x300 = value;
    m_r_400x300IsSet = true;
}

bool ImageMetadata_images::r400x300IsSet() const
{
    return m_r_400x300IsSet;
}

void ImageMetadata_images::unsetr_400x300()
{
    m_r_400x300IsSet = false;
}
std::shared_ptr<ImageDetails> ImageMetadata_images::getR600x() const
{
    return m_r_600x;
}

void ImageMetadata_images::setR600x(const std::shared_ptr<ImageDetails>& value)
{
    m_r_600x = value;
    m_r_600xIsSet = true;
}

bool ImageMetadata_images::r600xIsSet() const
{
    return m_r_600xIsSet;
}

void ImageMetadata_images::unsetr_600x()
{
    m_r_600xIsSet = false;
}
std::shared_ptr<ImageDetails> ImageMetadata_images::getR1200x() const
{
    return m_r_1200x;
}

void ImageMetadata_images::setR1200x(const std::shared_ptr<ImageDetails>& value)
{
    m_r_1200x = value;
    m_r_1200xIsSet = true;
}

bool ImageMetadata_images::r1200xIsSet() const
{
    return m_r_1200xIsSet;
}

void ImageMetadata_images::unsetr_1200x()
{
    m_r_1200xIsSet = false;
}
}
}
}
}


