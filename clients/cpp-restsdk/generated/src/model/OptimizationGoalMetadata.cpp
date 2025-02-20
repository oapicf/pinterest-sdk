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



#include "CppRestOpenAPIClient/model/OptimizationGoalMetadata.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



OptimizationGoalMetadata::OptimizationGoalMetadata()
{
    m_Conversion_tag_v3_goal_metadataIsSet = false;
    m_Frequency_goal_metadataIsSet = false;
    m_Scrollup_goal_metadataIsSet = false;
}

OptimizationGoalMetadata::~OptimizationGoalMetadata()
{
}

void OptimizationGoalMetadata::validate()
{
    // TODO: implement validation
}

web::json::value OptimizationGoalMetadata::toJson() const
{

    web::json::value val = web::json::value::object();
    
    if(m_Conversion_tag_v3_goal_metadataIsSet)
    {
        val[utility::conversions::to_string_t(U("conversion_tag_v3_goal_metadata"))] = ModelBase::toJson(m_Conversion_tag_v3_goal_metadata);
    }
    if(m_Frequency_goal_metadataIsSet)
    {
        val[utility::conversions::to_string_t(U("frequency_goal_metadata"))] = ModelBase::toJson(m_Frequency_goal_metadata);
    }
    if(m_Scrollup_goal_metadataIsSet)
    {
        val[utility::conversions::to_string_t(U("scrollup_goal_metadata"))] = ModelBase::toJson(m_Scrollup_goal_metadata);
    }

    return val;
}

bool OptimizationGoalMetadata::fromJson(const web::json::value& val)
{
    bool ok = true;
    
    if(val.has_field(utility::conversions::to_string_t(U("conversion_tag_v3_goal_metadata"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("conversion_tag_v3_goal_metadata")));
        if(!fieldValue.is_null())
        {
            std::shared_ptr<OptimizationGoalMetadata_conversion_tag_v3_goal_metadata> refVal_setConversionTagV3GoalMetadata;
            ok &= ModelBase::fromJson(fieldValue, refVal_setConversionTagV3GoalMetadata);
            setConversionTagV3GoalMetadata(refVal_setConversionTagV3GoalMetadata);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("frequency_goal_metadata"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("frequency_goal_metadata")));
        if(!fieldValue.is_null())
        {
            std::shared_ptr<OptimizationGoalMetadata_frequency_goal_metadata> refVal_setFrequencyGoalMetadata;
            ok &= ModelBase::fromJson(fieldValue, refVal_setFrequencyGoalMetadata);
            setFrequencyGoalMetadata(refVal_setFrequencyGoalMetadata);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("scrollup_goal_metadata"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("scrollup_goal_metadata")));
        if(!fieldValue.is_null())
        {
            std::shared_ptr<OptimizationGoalMetadata_scrollup_goal_metadata> refVal_setScrollupGoalMetadata;
            ok &= ModelBase::fromJson(fieldValue, refVal_setScrollupGoalMetadata);
            setScrollupGoalMetadata(refVal_setScrollupGoalMetadata);
        }
    }
    return ok;
}

void OptimizationGoalMetadata::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }
    if(m_Conversion_tag_v3_goal_metadataIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("conversion_tag_v3_goal_metadata")), m_Conversion_tag_v3_goal_metadata));
    }
    if(m_Frequency_goal_metadataIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("frequency_goal_metadata")), m_Frequency_goal_metadata));
    }
    if(m_Scrollup_goal_metadataIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("scrollup_goal_metadata")), m_Scrollup_goal_metadata));
    }
}

bool OptimizationGoalMetadata::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    bool ok = true;
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }

    if(multipart->hasContent(utility::conversions::to_string_t(U("conversion_tag_v3_goal_metadata"))))
    {
        std::shared_ptr<OptimizationGoalMetadata_conversion_tag_v3_goal_metadata> refVal_setConversionTagV3GoalMetadata;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("conversion_tag_v3_goal_metadata"))), refVal_setConversionTagV3GoalMetadata );
        setConversionTagV3GoalMetadata(refVal_setConversionTagV3GoalMetadata);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("frequency_goal_metadata"))))
    {
        std::shared_ptr<OptimizationGoalMetadata_frequency_goal_metadata> refVal_setFrequencyGoalMetadata;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("frequency_goal_metadata"))), refVal_setFrequencyGoalMetadata );
        setFrequencyGoalMetadata(refVal_setFrequencyGoalMetadata);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("scrollup_goal_metadata"))))
    {
        std::shared_ptr<OptimizationGoalMetadata_scrollup_goal_metadata> refVal_setScrollupGoalMetadata;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("scrollup_goal_metadata"))), refVal_setScrollupGoalMetadata );
        setScrollupGoalMetadata(refVal_setScrollupGoalMetadata);
    }
    return ok;
}

std::shared_ptr<OptimizationGoalMetadata_conversion_tag_v3_goal_metadata> OptimizationGoalMetadata::getConversionTagV3GoalMetadata() const
{
    return m_Conversion_tag_v3_goal_metadata;
}

void OptimizationGoalMetadata::setConversionTagV3GoalMetadata(const std::shared_ptr<OptimizationGoalMetadata_conversion_tag_v3_goal_metadata>& value)
{
    m_Conversion_tag_v3_goal_metadata = value;
    m_Conversion_tag_v3_goal_metadataIsSet = true;
}

bool OptimizationGoalMetadata::conversionTagV3GoalMetadataIsSet() const
{
    return m_Conversion_tag_v3_goal_metadataIsSet;
}

void OptimizationGoalMetadata::unsetConversion_tag_v3_goal_metadata()
{
    m_Conversion_tag_v3_goal_metadataIsSet = false;
}
std::shared_ptr<OptimizationGoalMetadata_frequency_goal_metadata> OptimizationGoalMetadata::getFrequencyGoalMetadata() const
{
    return m_Frequency_goal_metadata;
}

void OptimizationGoalMetadata::setFrequencyGoalMetadata(const std::shared_ptr<OptimizationGoalMetadata_frequency_goal_metadata>& value)
{
    m_Frequency_goal_metadata = value;
    m_Frequency_goal_metadataIsSet = true;
}

bool OptimizationGoalMetadata::frequencyGoalMetadataIsSet() const
{
    return m_Frequency_goal_metadataIsSet;
}

void OptimizationGoalMetadata::unsetFrequency_goal_metadata()
{
    m_Frequency_goal_metadataIsSet = false;
}
std::shared_ptr<OptimizationGoalMetadata_scrollup_goal_metadata> OptimizationGoalMetadata::getScrollupGoalMetadata() const
{
    return m_Scrollup_goal_metadata;
}

void OptimizationGoalMetadata::setScrollupGoalMetadata(const std::shared_ptr<OptimizationGoalMetadata_scrollup_goal_metadata>& value)
{
    m_Scrollup_goal_metadata = value;
    m_Scrollup_goal_metadataIsSet = true;
}

bool OptimizationGoalMetadata::scrollupGoalMetadataIsSet() const
{
    return m_Scrollup_goal_metadataIsSet;
}

void OptimizationGoalMetadata::unsetScrollup_goal_metadata()
{
    m_Scrollup_goal_metadataIsSet = false;
}
}
}
}
}


