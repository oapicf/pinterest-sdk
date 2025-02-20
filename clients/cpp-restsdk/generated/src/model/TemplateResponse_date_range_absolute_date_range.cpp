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



#include "CppRestOpenAPIClient/model/TemplateResponse_date_range_absolute_date_range.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



TemplateResponse_date_range_absolute_date_range::TemplateResponse_date_range_absolute_date_range()
{
    m_Type = utility::conversions::to_string_t("");
    m_TypeIsSet = false;
    m_Start_date = 0.0;
    m_Start_dateIsSet = false;
    m_End_date = 0.0;
    m_End_dateIsSet = false;
}

TemplateResponse_date_range_absolute_date_range::~TemplateResponse_date_range_absolute_date_range()
{
}

void TemplateResponse_date_range_absolute_date_range::validate()
{
    // TODO: implement validation
}

web::json::value TemplateResponse_date_range_absolute_date_range::toJson() const
{

    web::json::value val = web::json::value::object();
    
    if(m_TypeIsSet)
    {
        val[utility::conversions::to_string_t(U("type"))] = ModelBase::toJson(m_Type);
    }
    if(m_Start_dateIsSet)
    {
        val[utility::conversions::to_string_t(U("start_date"))] = ModelBase::toJson(m_Start_date);
    }
    if(m_End_dateIsSet)
    {
        val[utility::conversions::to_string_t(U("end_date"))] = ModelBase::toJson(m_End_date);
    }

    return val;
}

bool TemplateResponse_date_range_absolute_date_range::fromJson(const web::json::value& val)
{
    bool ok = true;
    
    if(val.has_field(utility::conversions::to_string_t(U("type"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("type")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setType;
            ok &= ModelBase::fromJson(fieldValue, refVal_setType);
            setType(refVal_setType);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("start_date"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("start_date")));
        if(!fieldValue.is_null())
        {
            double refVal_setStartDate;
            ok &= ModelBase::fromJson(fieldValue, refVal_setStartDate);
            setStartDate(refVal_setStartDate);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("end_date"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("end_date")));
        if(!fieldValue.is_null())
        {
            double refVal_setEndDate;
            ok &= ModelBase::fromJson(fieldValue, refVal_setEndDate);
            setEndDate(refVal_setEndDate);
        }
    }
    return ok;
}

void TemplateResponse_date_range_absolute_date_range::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }
    if(m_TypeIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("type")), m_Type));
    }
    if(m_Start_dateIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("start_date")), m_Start_date));
    }
    if(m_End_dateIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("end_date")), m_End_date));
    }
}

bool TemplateResponse_date_range_absolute_date_range::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    bool ok = true;
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }

    if(multipart->hasContent(utility::conversions::to_string_t(U("type"))))
    {
        utility::string_t refVal_setType;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("type"))), refVal_setType );
        setType(refVal_setType);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("start_date"))))
    {
        double refVal_setStartDate;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("start_date"))), refVal_setStartDate );
        setStartDate(refVal_setStartDate);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("end_date"))))
    {
        double refVal_setEndDate;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("end_date"))), refVal_setEndDate );
        setEndDate(refVal_setEndDate);
    }
    return ok;
}

utility::string_t TemplateResponse_date_range_absolute_date_range::getType() const
{
    return m_Type;
}

void TemplateResponse_date_range_absolute_date_range::setType(const utility::string_t& value)
{
    m_Type = value;
    m_TypeIsSet = true;
}

bool TemplateResponse_date_range_absolute_date_range::typeIsSet() const
{
    return m_TypeIsSet;
}

void TemplateResponse_date_range_absolute_date_range::unsetType()
{
    m_TypeIsSet = false;
}
double TemplateResponse_date_range_absolute_date_range::getStartDate() const
{
    return m_Start_date;
}

void TemplateResponse_date_range_absolute_date_range::setStartDate(double value)
{
    m_Start_date = value;
    m_Start_dateIsSet = true;
}

bool TemplateResponse_date_range_absolute_date_range::startDateIsSet() const
{
    return m_Start_dateIsSet;
}

void TemplateResponse_date_range_absolute_date_range::unsetStart_date()
{
    m_Start_dateIsSet = false;
}
double TemplateResponse_date_range_absolute_date_range::getEndDate() const
{
    return m_End_date;
}

void TemplateResponse_date_range_absolute_date_range::setEndDate(double value)
{
    m_End_date = value;
    m_End_dateIsSet = true;
}

bool TemplateResponse_date_range_absolute_date_range::endDateIsSet() const
{
    return m_End_dateIsSet;
}

void TemplateResponse_date_range_absolute_date_range::unsetEnd_date()
{
    m_End_dateIsSet = false;
}
}
}
}
}


