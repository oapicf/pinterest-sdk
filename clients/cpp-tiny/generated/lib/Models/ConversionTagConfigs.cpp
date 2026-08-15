

#include "ConversionTagConfigs.h"

using namespace Tiny;

ConversionTagConfigs::ConversionTagConfigs()
{
	aem_db_enabled = bool(false);
	aem_enabled = bool(false);
	aem_external_id_enabled = bool(false);
	aem_fnln_enabled = bool(false);
	aem_ge_enabled = bool(false);
	aem_loc_enabled = bool(false);
	aem_ph_enabled = bool(false);
	md_frequency = float(0);
	no_code_capi_domains = std::list<std::string>();
}

ConversionTagConfigs::ConversionTagConfigs(std::string jsonString)
{
	this->fromJson(jsonString);
}

ConversionTagConfigs::~ConversionTagConfigs()
{

}

void
ConversionTagConfigs::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *aem_db_enabledKey = "aem_db_enabled";

    if(object.has_key(aem_db_enabledKey))
    {
        bourne::json value = object[aem_db_enabledKey];



        jsonToValue(&aem_db_enabled, value, "bool");


    }

    const char *aem_enabledKey = "aem_enabled";

    if(object.has_key(aem_enabledKey))
    {
        bourne::json value = object[aem_enabledKey];



        jsonToValue(&aem_enabled, value, "bool");


    }

    const char *aem_external_id_enabledKey = "aem_external_id_enabled";

    if(object.has_key(aem_external_id_enabledKey))
    {
        bourne::json value = object[aem_external_id_enabledKey];



        jsonToValue(&aem_external_id_enabled, value, "bool");


    }

    const char *aem_fnln_enabledKey = "aem_fnln_enabled";

    if(object.has_key(aem_fnln_enabledKey))
    {
        bourne::json value = object[aem_fnln_enabledKey];



        jsonToValue(&aem_fnln_enabled, value, "bool");


    }

    const char *aem_ge_enabledKey = "aem_ge_enabled";

    if(object.has_key(aem_ge_enabledKey))
    {
        bourne::json value = object[aem_ge_enabledKey];



        jsonToValue(&aem_ge_enabled, value, "bool");


    }

    const char *aem_loc_enabledKey = "aem_loc_enabled";

    if(object.has_key(aem_loc_enabledKey))
    {
        bourne::json value = object[aem_loc_enabledKey];



        jsonToValue(&aem_loc_enabled, value, "bool");


    }

    const char *aem_ph_enabledKey = "aem_ph_enabled";

    if(object.has_key(aem_ph_enabledKey))
    {
        bourne::json value = object[aem_ph_enabledKey];



        jsonToValue(&aem_ph_enabled, value, "bool");


    }

    const char *md_frequencyKey = "md_frequency";

    if(object.has_key(md_frequencyKey))
    {
        bourne::json value = object[md_frequencyKey];



        jsonToValue(&md_frequency, value, "long");


    }

    const char *no_code_capi_domainsKey = "no_code_capi_domains";

    if(object.has_key(no_code_capi_domainsKey))
    {
        bourne::json value = object[no_code_capi_domainsKey];


        std::list<std::string> no_code_capi_domains_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            no_code_capi_domains_list.push_back(element);
        }
        no_code_capi_domains = no_code_capi_domains_list;


    }


}

bourne::json
ConversionTagConfigs::toJson()
{
    bourne::json object = bourne::json::object();





    object["aem_db_enabled"] = isAemDbEnabled();






    object["aem_enabled"] = isAemEnabled();






    object["aem_external_id_enabled"] = isAemExternalIdEnabled();






    object["aem_fnln_enabled"] = isAemFnlnEnabled();






    object["aem_ge_enabled"] = isAemGeEnabled();






    object["aem_loc_enabled"] = isAemLocEnabled();






    object["aem_ph_enabled"] = isAemPhEnabled();






    object["md_frequency"] = getMdFrequency();





    std::list<std::string> no_code_capi_domains_list = getNoCodeCapiDomains();
    bourne::json no_code_capi_domains_arr = bourne::json::array();

    for(auto& var : no_code_capi_domains_list)
    {
        no_code_capi_domains_arr.append(var);
    }
    object["no_code_capi_domains"] = no_code_capi_domains_arr;






    return object;

}

bool
ConversionTagConfigs::isAemDbEnabled()
{
	return aem_db_enabled;
}

void
ConversionTagConfigs::setAemDbEnabled(bool  aem_db_enabled)
{
	this->aem_db_enabled = aem_db_enabled;
}

bool
ConversionTagConfigs::isAemEnabled()
{
	return aem_enabled;
}

void
ConversionTagConfigs::setAemEnabled(bool  aem_enabled)
{
	this->aem_enabled = aem_enabled;
}

bool
ConversionTagConfigs::isAemExternalIdEnabled()
{
	return aem_external_id_enabled;
}

void
ConversionTagConfigs::setAemExternalIdEnabled(bool  aem_external_id_enabled)
{
	this->aem_external_id_enabled = aem_external_id_enabled;
}

bool
ConversionTagConfigs::isAemFnlnEnabled()
{
	return aem_fnln_enabled;
}

void
ConversionTagConfigs::setAemFnlnEnabled(bool  aem_fnln_enabled)
{
	this->aem_fnln_enabled = aem_fnln_enabled;
}

bool
ConversionTagConfigs::isAemGeEnabled()
{
	return aem_ge_enabled;
}

void
ConversionTagConfigs::setAemGeEnabled(bool  aem_ge_enabled)
{
	this->aem_ge_enabled = aem_ge_enabled;
}

bool
ConversionTagConfigs::isAemLocEnabled()
{
	return aem_loc_enabled;
}

void
ConversionTagConfigs::setAemLocEnabled(bool  aem_loc_enabled)
{
	this->aem_loc_enabled = aem_loc_enabled;
}

bool
ConversionTagConfigs::isAemPhEnabled()
{
	return aem_ph_enabled;
}

void
ConversionTagConfigs::setAemPhEnabled(bool  aem_ph_enabled)
{
	this->aem_ph_enabled = aem_ph_enabled;
}

long
ConversionTagConfigs::getMdFrequency()
{
	return md_frequency;
}

void
ConversionTagConfigs::setMdFrequency(long  md_frequency)
{
	this->md_frequency = md_frequency;
}

std::list<std::string>
ConversionTagConfigs::getNoCodeCapiDomains()
{
	return no_code_capi_domains;
}

void
ConversionTagConfigs::setNoCodeCapiDomains(std::list <std::string> no_code_capi_domains)
{
	this->no_code_capi_domains = no_code_capi_domains;
}



