

#include "ConversionTagCreate.h"

using namespace Tiny;

ConversionTagCreate::ConversionTagCreate()
{
	aem_db_enabled = bool(false);
	aem_enabled = bool(false);
	aem_external_id_enabled = bool(false);
	aem_fnln_enabled = bool(false);
	aem_ge_enabled = bool(false);
	aem_loc_enabled = bool(false);
	aem_ph_enabled = bool(false);
	md_frequency = float(0);
	name = std::string();
}

ConversionTagCreate::ConversionTagCreate(std::string jsonString)
{
	this->fromJson(jsonString);
}

ConversionTagCreate::~ConversionTagCreate()
{

}

void
ConversionTagCreate::fromJson(std::string jsonObj)
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

    const char *nameKey = "name";

    if(object.has_key(nameKey))
    {
        bourne::json value = object[nameKey];



        jsonToValue(&name, value, "std::string");


    }


}

bourne::json
ConversionTagCreate::toJson()
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






    object["name"] = getName();



    return object;

}

bool
ConversionTagCreate::isAemDbEnabled()
{
	return aem_db_enabled;
}

void
ConversionTagCreate::setAemDbEnabled(bool  aem_db_enabled)
{
	this->aem_db_enabled = aem_db_enabled;
}

bool
ConversionTagCreate::isAemEnabled()
{
	return aem_enabled;
}

void
ConversionTagCreate::setAemEnabled(bool  aem_enabled)
{
	this->aem_enabled = aem_enabled;
}

bool
ConversionTagCreate::isAemExternalIdEnabled()
{
	return aem_external_id_enabled;
}

void
ConversionTagCreate::setAemExternalIdEnabled(bool  aem_external_id_enabled)
{
	this->aem_external_id_enabled = aem_external_id_enabled;
}

bool
ConversionTagCreate::isAemFnlnEnabled()
{
	return aem_fnln_enabled;
}

void
ConversionTagCreate::setAemFnlnEnabled(bool  aem_fnln_enabled)
{
	this->aem_fnln_enabled = aem_fnln_enabled;
}

bool
ConversionTagCreate::isAemGeEnabled()
{
	return aem_ge_enabled;
}

void
ConversionTagCreate::setAemGeEnabled(bool  aem_ge_enabled)
{
	this->aem_ge_enabled = aem_ge_enabled;
}

bool
ConversionTagCreate::isAemLocEnabled()
{
	return aem_loc_enabled;
}

void
ConversionTagCreate::setAemLocEnabled(bool  aem_loc_enabled)
{
	this->aem_loc_enabled = aem_loc_enabled;
}

bool
ConversionTagCreate::isAemPhEnabled()
{
	return aem_ph_enabled;
}

void
ConversionTagCreate::setAemPhEnabled(bool  aem_ph_enabled)
{
	this->aem_ph_enabled = aem_ph_enabled;
}

long
ConversionTagCreate::getMdFrequency()
{
	return md_frequency;
}

void
ConversionTagCreate::setMdFrequency(long  md_frequency)
{
	this->md_frequency = md_frequency;
}

std::string
ConversionTagCreate::getName()
{
	return name;
}

void
ConversionTagCreate::setName(std::string  name)
{
	this->name = name;
}



