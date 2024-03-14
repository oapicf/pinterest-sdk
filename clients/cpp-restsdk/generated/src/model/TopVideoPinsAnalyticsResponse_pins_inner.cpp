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



#include "CppRestOpenAPIClient/model/TopVideoPinsAnalyticsResponse_pins_inner.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



TopVideoPinsAnalyticsResponse_pins_inner::TopVideoPinsAnalyticsResponse_pins_inner()
{
    m_MetricsIsSet = false;
    m_Data_statusIsSet = false;
    m_Pin_id = utility::conversions::to_string_t("");
    m_Pin_idIsSet = false;
}

TopVideoPinsAnalyticsResponse_pins_inner::~TopVideoPinsAnalyticsResponse_pins_inner()
{
}

void TopVideoPinsAnalyticsResponse_pins_inner::validate()
{
    // TODO: implement validation
}

web::json::value TopVideoPinsAnalyticsResponse_pins_inner::toJson() const
{

    web::json::value val = web::json::value::object();
    
    if(m_MetricsIsSet)
    {
        val[utility::conversions::to_string_t(U("metrics"))] = ModelBase::toJson(m_Metrics);
    }
    if(m_Data_statusIsSet)
    {
        val[utility::conversions::to_string_t(U("data_status"))] = ModelBase::toJson(m_Data_status);
    }
    if(m_Pin_idIsSet)
    {
        val[utility::conversions::to_string_t(U("pin_id"))] = ModelBase::toJson(m_Pin_id);
    }

    return val;
}

bool TopVideoPinsAnalyticsResponse_pins_inner::fromJson(const web::json::value& val)
{
    bool ok = true;
    
    if(val.has_field(utility::conversions::to_string_t(U("metrics"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("metrics")));
        if(!fieldValue.is_null())
        {
            std::map<utility::string_t, double> refVal_setMetrics;
            ok &= ModelBase::fromJson(fieldValue, refVal_setMetrics);
            setMetrics(refVal_setMetrics);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("data_status"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("data_status")));
        if(!fieldValue.is_null())
        {
            std::map<utility::string_t, std::shared_ptr<DataStatus>> refVal_setDataStatus;
            ok &= ModelBase::fromJson(fieldValue, refVal_setDataStatus);
            setDataStatus(refVal_setDataStatus);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("pin_id"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("pin_id")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setPinId;
            ok &= ModelBase::fromJson(fieldValue, refVal_setPinId);
            setPinId(refVal_setPinId);
        }
    }
    return ok;
}

void TopVideoPinsAnalyticsResponse_pins_inner::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }
    if(m_MetricsIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("metrics")), m_Metrics));
    }
    if(m_Data_statusIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("data_status")), m_Data_status));
    }
    if(m_Pin_idIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("pin_id")), m_Pin_id));
    }
}

bool TopVideoPinsAnalyticsResponse_pins_inner::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    bool ok = true;
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }

    if(multipart->hasContent(utility::conversions::to_string_t(U("metrics"))))
    {
        std::map<utility::string_t, double> refVal_setMetrics;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("metrics"))), refVal_setMetrics );
        setMetrics(refVal_setMetrics);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("data_status"))))
    {
        std::map<utility::string_t, std::shared_ptr<DataStatus>> refVal_setDataStatus;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("data_status"))), refVal_setDataStatus );
        setDataStatus(refVal_setDataStatus);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("pin_id"))))
    {
        utility::string_t refVal_setPinId;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("pin_id"))), refVal_setPinId );
        setPinId(refVal_setPinId);
    }
    return ok;
}

std::map<utility::string_t, double>& TopVideoPinsAnalyticsResponse_pins_inner::getMetrics()
{
    return m_Metrics;
}

void TopVideoPinsAnalyticsResponse_pins_inner::setMetrics(std::map<utility::string_t, double> value)
{
    m_Metrics = value;
    m_MetricsIsSet = true;
}

bool TopVideoPinsAnalyticsResponse_pins_inner::metricsIsSet() const
{
    return m_MetricsIsSet;
}

void TopVideoPinsAnalyticsResponse_pins_inner::unsetMetrics()
{
    m_MetricsIsSet = false;
}
std::map<utility::string_t, std::shared_ptr<DataStatus>>& TopVideoPinsAnalyticsResponse_pins_inner::getDataStatus()
{
    return m_Data_status;
}

void TopVideoPinsAnalyticsResponse_pins_inner::setDataStatus(const std::map<utility::string_t, std::shared_ptr<DataStatus>>& value)
{
    m_Data_status = value;
    m_Data_statusIsSet = true;
}

bool TopVideoPinsAnalyticsResponse_pins_inner::dataStatusIsSet() const
{
    return m_Data_statusIsSet;
}

void TopVideoPinsAnalyticsResponse_pins_inner::unsetData_status()
{
    m_Data_statusIsSet = false;
}
utility::string_t TopVideoPinsAnalyticsResponse_pins_inner::getPinId() const
{
    return m_Pin_id;
}

void TopVideoPinsAnalyticsResponse_pins_inner::setPinId(const utility::string_t& value)
{
    m_Pin_id = value;
    m_Pin_idIsSet = true;
}

bool TopVideoPinsAnalyticsResponse_pins_inner::pinIdIsSet() const
{
    return m_Pin_idIsSet;
}

void TopVideoPinsAnalyticsResponse_pins_inner::unsetPin_id()
{
    m_Pin_idIsSet = false;
}
}
}
}
}

