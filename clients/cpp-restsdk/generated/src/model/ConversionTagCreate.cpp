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



#include "CppRestOpenAPIClient/model/ConversionTagCreate.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



ConversionTagCreate::ConversionTagCreate()
{
    m_Name = utility::conversions::to_string_t("");
    m_NameIsSet = false;
    m_Aem_enabled = false;
    m_Aem_enabledIsSet = false;
    m_Md_frequency = 0.0;
    m_Md_frequencyIsSet = false;
    m_Aem_fnln_enabled = false;
    m_Aem_fnln_enabledIsSet = false;
    m_Aem_ph_enabled = false;
    m_Aem_ph_enabledIsSet = false;
    m_Aem_ge_enabled = false;
    m_Aem_ge_enabledIsSet = false;
    m_Aem_db_enabled = false;
    m_Aem_db_enabledIsSet = false;
    m_Aem_loc_enabled = false;
    m_Aem_loc_enabledIsSet = false;
}

ConversionTagCreate::~ConversionTagCreate()
{
}

void ConversionTagCreate::validate()
{
    // TODO: implement validation
}

web::json::value ConversionTagCreate::toJson() const
{

    web::json::value val = web::json::value::object();
    
    if(m_NameIsSet)
    {
        val[utility::conversions::to_string_t(U("name"))] = ModelBase::toJson(m_Name);
    }
    if(m_Aem_enabledIsSet)
    {
        val[utility::conversions::to_string_t(U("aem_enabled"))] = ModelBase::toJson(m_Aem_enabled);
    }
    if(m_Md_frequencyIsSet)
    {
        val[utility::conversions::to_string_t(U("md_frequency"))] = ModelBase::toJson(m_Md_frequency);
    }
    if(m_Aem_fnln_enabledIsSet)
    {
        val[utility::conversions::to_string_t(U("aem_fnln_enabled"))] = ModelBase::toJson(m_Aem_fnln_enabled);
    }
    if(m_Aem_ph_enabledIsSet)
    {
        val[utility::conversions::to_string_t(U("aem_ph_enabled"))] = ModelBase::toJson(m_Aem_ph_enabled);
    }
    if(m_Aem_ge_enabledIsSet)
    {
        val[utility::conversions::to_string_t(U("aem_ge_enabled"))] = ModelBase::toJson(m_Aem_ge_enabled);
    }
    if(m_Aem_db_enabledIsSet)
    {
        val[utility::conversions::to_string_t(U("aem_db_enabled"))] = ModelBase::toJson(m_Aem_db_enabled);
    }
    if(m_Aem_loc_enabledIsSet)
    {
        val[utility::conversions::to_string_t(U("aem_loc_enabled"))] = ModelBase::toJson(m_Aem_loc_enabled);
    }

    return val;
}

bool ConversionTagCreate::fromJson(const web::json::value& val)
{
    bool ok = true;
    
    if(val.has_field(utility::conversions::to_string_t(U("name"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("name")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setName;
            ok &= ModelBase::fromJson(fieldValue, refVal_setName);
            setName(refVal_setName);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("aem_enabled"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("aem_enabled")));
        if(!fieldValue.is_null())
        {
            bool refVal_setAemEnabled;
            ok &= ModelBase::fromJson(fieldValue, refVal_setAemEnabled);
            setAemEnabled(refVal_setAemEnabled);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("md_frequency"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("md_frequency")));
        if(!fieldValue.is_null())
        {
            double refVal_setMdFrequency;
            ok &= ModelBase::fromJson(fieldValue, refVal_setMdFrequency);
            setMdFrequency(refVal_setMdFrequency);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("aem_fnln_enabled"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("aem_fnln_enabled")));
        if(!fieldValue.is_null())
        {
            bool refVal_setAemFnlnEnabled;
            ok &= ModelBase::fromJson(fieldValue, refVal_setAemFnlnEnabled);
            setAemFnlnEnabled(refVal_setAemFnlnEnabled);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("aem_ph_enabled"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("aem_ph_enabled")));
        if(!fieldValue.is_null())
        {
            bool refVal_setAemPhEnabled;
            ok &= ModelBase::fromJson(fieldValue, refVal_setAemPhEnabled);
            setAemPhEnabled(refVal_setAemPhEnabled);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("aem_ge_enabled"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("aem_ge_enabled")));
        if(!fieldValue.is_null())
        {
            bool refVal_setAemGeEnabled;
            ok &= ModelBase::fromJson(fieldValue, refVal_setAemGeEnabled);
            setAemGeEnabled(refVal_setAemGeEnabled);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("aem_db_enabled"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("aem_db_enabled")));
        if(!fieldValue.is_null())
        {
            bool refVal_setAemDbEnabled;
            ok &= ModelBase::fromJson(fieldValue, refVal_setAemDbEnabled);
            setAemDbEnabled(refVal_setAemDbEnabled);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("aem_loc_enabled"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("aem_loc_enabled")));
        if(!fieldValue.is_null())
        {
            bool refVal_setAemLocEnabled;
            ok &= ModelBase::fromJson(fieldValue, refVal_setAemLocEnabled);
            setAemLocEnabled(refVal_setAemLocEnabled);
        }
    }
    return ok;
}

void ConversionTagCreate::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }
    if(m_NameIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("name")), m_Name));
    }
    if(m_Aem_enabledIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("aem_enabled")), m_Aem_enabled));
    }
    if(m_Md_frequencyIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("md_frequency")), m_Md_frequency));
    }
    if(m_Aem_fnln_enabledIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("aem_fnln_enabled")), m_Aem_fnln_enabled));
    }
    if(m_Aem_ph_enabledIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("aem_ph_enabled")), m_Aem_ph_enabled));
    }
    if(m_Aem_ge_enabledIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("aem_ge_enabled")), m_Aem_ge_enabled));
    }
    if(m_Aem_db_enabledIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("aem_db_enabled")), m_Aem_db_enabled));
    }
    if(m_Aem_loc_enabledIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("aem_loc_enabled")), m_Aem_loc_enabled));
    }
}

bool ConversionTagCreate::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    bool ok = true;
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }

    if(multipart->hasContent(utility::conversions::to_string_t(U("name"))))
    {
        utility::string_t refVal_setName;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("name"))), refVal_setName );
        setName(refVal_setName);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("aem_enabled"))))
    {
        bool refVal_setAemEnabled;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("aem_enabled"))), refVal_setAemEnabled );
        setAemEnabled(refVal_setAemEnabled);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("md_frequency"))))
    {
        double refVal_setMdFrequency;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("md_frequency"))), refVal_setMdFrequency );
        setMdFrequency(refVal_setMdFrequency);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("aem_fnln_enabled"))))
    {
        bool refVal_setAemFnlnEnabled;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("aem_fnln_enabled"))), refVal_setAemFnlnEnabled );
        setAemFnlnEnabled(refVal_setAemFnlnEnabled);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("aem_ph_enabled"))))
    {
        bool refVal_setAemPhEnabled;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("aem_ph_enabled"))), refVal_setAemPhEnabled );
        setAemPhEnabled(refVal_setAemPhEnabled);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("aem_ge_enabled"))))
    {
        bool refVal_setAemGeEnabled;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("aem_ge_enabled"))), refVal_setAemGeEnabled );
        setAemGeEnabled(refVal_setAemGeEnabled);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("aem_db_enabled"))))
    {
        bool refVal_setAemDbEnabled;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("aem_db_enabled"))), refVal_setAemDbEnabled );
        setAemDbEnabled(refVal_setAemDbEnabled);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("aem_loc_enabled"))))
    {
        bool refVal_setAemLocEnabled;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("aem_loc_enabled"))), refVal_setAemLocEnabled );
        setAemLocEnabled(refVal_setAemLocEnabled);
    }
    return ok;
}

utility::string_t ConversionTagCreate::getName() const
{
    return m_Name;
}

void ConversionTagCreate::setName(const utility::string_t& value)
{
    m_Name = value;
    m_NameIsSet = true;
}

bool ConversionTagCreate::nameIsSet() const
{
    return m_NameIsSet;
}

void ConversionTagCreate::unsetName()
{
    m_NameIsSet = false;
}
bool ConversionTagCreate::isAemEnabled() const
{
    return m_Aem_enabled;
}

void ConversionTagCreate::setAemEnabled(bool value)
{
    m_Aem_enabled = value;
    m_Aem_enabledIsSet = true;
}

bool ConversionTagCreate::aemEnabledIsSet() const
{
    return m_Aem_enabledIsSet;
}

void ConversionTagCreate::unsetAem_enabled()
{
    m_Aem_enabledIsSet = false;
}
double ConversionTagCreate::getMdFrequency() const
{
    return m_Md_frequency;
}

void ConversionTagCreate::setMdFrequency(double value)
{
    m_Md_frequency = value;
    m_Md_frequencyIsSet = true;
}

bool ConversionTagCreate::mdFrequencyIsSet() const
{
    return m_Md_frequencyIsSet;
}

void ConversionTagCreate::unsetMd_frequency()
{
    m_Md_frequencyIsSet = false;
}
bool ConversionTagCreate::isAemFnlnEnabled() const
{
    return m_Aem_fnln_enabled;
}

void ConversionTagCreate::setAemFnlnEnabled(bool value)
{
    m_Aem_fnln_enabled = value;
    m_Aem_fnln_enabledIsSet = true;
}

bool ConversionTagCreate::aemFnlnEnabledIsSet() const
{
    return m_Aem_fnln_enabledIsSet;
}

void ConversionTagCreate::unsetAem_fnln_enabled()
{
    m_Aem_fnln_enabledIsSet = false;
}
bool ConversionTagCreate::isAemPhEnabled() const
{
    return m_Aem_ph_enabled;
}

void ConversionTagCreate::setAemPhEnabled(bool value)
{
    m_Aem_ph_enabled = value;
    m_Aem_ph_enabledIsSet = true;
}

bool ConversionTagCreate::aemPhEnabledIsSet() const
{
    return m_Aem_ph_enabledIsSet;
}

void ConversionTagCreate::unsetAem_ph_enabled()
{
    m_Aem_ph_enabledIsSet = false;
}
bool ConversionTagCreate::isAemGeEnabled() const
{
    return m_Aem_ge_enabled;
}

void ConversionTagCreate::setAemGeEnabled(bool value)
{
    m_Aem_ge_enabled = value;
    m_Aem_ge_enabledIsSet = true;
}

bool ConversionTagCreate::aemGeEnabledIsSet() const
{
    return m_Aem_ge_enabledIsSet;
}

void ConversionTagCreate::unsetAem_ge_enabled()
{
    m_Aem_ge_enabledIsSet = false;
}
bool ConversionTagCreate::isAemDbEnabled() const
{
    return m_Aem_db_enabled;
}

void ConversionTagCreate::setAemDbEnabled(bool value)
{
    m_Aem_db_enabled = value;
    m_Aem_db_enabledIsSet = true;
}

bool ConversionTagCreate::aemDbEnabledIsSet() const
{
    return m_Aem_db_enabledIsSet;
}

void ConversionTagCreate::unsetAem_db_enabled()
{
    m_Aem_db_enabledIsSet = false;
}
bool ConversionTagCreate::isAemLocEnabled() const
{
    return m_Aem_loc_enabled;
}

void ConversionTagCreate::setAemLocEnabled(bool value)
{
    m_Aem_loc_enabled = value;
    m_Aem_loc_enabledIsSet = true;
}

bool ConversionTagCreate::aemLocEnabledIsSet() const
{
    return m_Aem_loc_enabledIsSet;
}

void ConversionTagCreate::unsetAem_loc_enabled()
{
    m_Aem_loc_enabledIsSet = false;
}
}
}
}
}

