

#include "CatalogsRetailProductGroup.h"

using namespace Tiny;

CatalogsRetailProductGroup::CatalogsRetailProductGroup()
{
	catalog_id = std::string();
	catalog_type = std::string();
	country = std::string();
	created_at = int(0);
	description = std::string();
	feed_id = std::string();
	filters = CatalogsProductGroupFilters();
	id = std::string();
	is_featured = bool(false);
	locale = std::string();
	name = std::string();
	status = CatalogsProductGroupStatus();
	type = CatalogsProductGroupType();
	updated_at = int(0);
}

CatalogsRetailProductGroup::CatalogsRetailProductGroup(std::string jsonString)
{
	this->fromJson(jsonString);
}

CatalogsRetailProductGroup::~CatalogsRetailProductGroup()
{

}

void
CatalogsRetailProductGroup::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *catalog_idKey = "catalog_id";

    if(object.has_key(catalog_idKey))
    {
        bourne::json value = object[catalog_idKey];



        jsonToValue(&catalog_id, value, "std::string");


    }

    const char *catalog_typeKey = "catalog_type";

    if(object.has_key(catalog_typeKey))
    {
        bourne::json value = object[catalog_typeKey];



        jsonToValue(&catalog_type, value, "std::string");


    }

    const char *countryKey = "country";

    if(object.has_key(countryKey))
    {
        bourne::json value = object[countryKey];



        jsonToValue(&country, value, "std::string");


    }

    const char *created_atKey = "created_at";

    if(object.has_key(created_atKey))
    {
        bourne::json value = object[created_atKey];



        jsonToValue(&created_at, value, "int");


    }

    const char *descriptionKey = "description";

    if(object.has_key(descriptionKey))
    {
        bourne::json value = object[descriptionKey];



        jsonToValue(&description, value, "std::string");


    }

    const char *feed_idKey = "feed_id";

    if(object.has_key(feed_idKey))
    {
        bourne::json value = object[feed_idKey];



        jsonToValue(&feed_id, value, "std::string");


    }

    const char *filtersKey = "filters";

    if(object.has_key(filtersKey))
    {
        bourne::json value = object[filtersKey];




        CatalogsProductGroupFilters* obj = &filters;
		obj->fromJson(value.dump());

    }

    const char *idKey = "id";

    if(object.has_key(idKey))
    {
        bourne::json value = object[idKey];



        jsonToValue(&id, value, "std::string");


    }

    const char *is_featuredKey = "is_featured";

    if(object.has_key(is_featuredKey))
    {
        bourne::json value = object[is_featuredKey];



        jsonToValue(&is_featured, value, "bool");


    }

    const char *localeKey = "locale";

    if(object.has_key(localeKey))
    {
        bourne::json value = object[localeKey];



        jsonToValue(&locale, value, "std::string");


    }

    const char *nameKey = "name";

    if(object.has_key(nameKey))
    {
        bourne::json value = object[nameKey];



        jsonToValue(&name, value, "std::string");


    }

    const char *statusKey = "status";

    if(object.has_key(statusKey))
    {
        bourne::json value = object[statusKey];




        CatalogsProductGroupStatus* obj = &status;
		obj->fromJson(value.dump());

    }

    const char *typeKey = "type";

    if(object.has_key(typeKey))
    {
        bourne::json value = object[typeKey];




        CatalogsProductGroupType* obj = &type;
		obj->fromJson(value.dump());

    }

    const char *updated_atKey = "updated_at";

    if(object.has_key(updated_atKey))
    {
        bourne::json value = object[updated_atKey];



        jsonToValue(&updated_at, value, "int");


    }


}

bourne::json
CatalogsRetailProductGroup::toJson()
{
    bourne::json object = bourne::json::object();





    object["catalog_id"] = getCatalogId();






    object["catalog_type"] = getCatalogType();






    object["country"] = getCountry();






    object["created_at"] = getCreatedAt();






    object["description"] = getDescription();






    object["feed_id"] = getFeedId();







	object["filters"] = getFilters().toJson();





    object["id"] = getId();






    object["is_featured"] = isIsFeatured();






    object["locale"] = getLocale();






    object["name"] = getName();







	object["status"] = getStatus().toJson();






	object["type"] = getType().toJson();





    object["updated_at"] = getUpdatedAt();



    return object;

}

std::string
CatalogsRetailProductGroup::getCatalogId()
{
	return catalog_id;
}

void
CatalogsRetailProductGroup::setCatalogId(std::string  catalog_id)
{
	this->catalog_id = catalog_id;
}

std::string
CatalogsRetailProductGroup::getCatalogType()
{
	return catalog_type;
}

void
CatalogsRetailProductGroup::setCatalogType(std::string  catalog_type)
{
	this->catalog_type = catalog_type;
}

std::string
CatalogsRetailProductGroup::getCountry()
{
	return country;
}

void
CatalogsRetailProductGroup::setCountry(std::string  country)
{
	this->country = country;
}

int
CatalogsRetailProductGroup::getCreatedAt()
{
	return created_at;
}

void
CatalogsRetailProductGroup::setCreatedAt(int  created_at)
{
	this->created_at = created_at;
}

std::string
CatalogsRetailProductGroup::getDescription()
{
	return description;
}

void
CatalogsRetailProductGroup::setDescription(std::string  description)
{
	this->description = description;
}

std::string
CatalogsRetailProductGroup::getFeedId()
{
	return feed_id;
}

void
CatalogsRetailProductGroup::setFeedId(std::string  feed_id)
{
	this->feed_id = feed_id;
}

CatalogsProductGroupFilters
CatalogsRetailProductGroup::getFilters()
{
	return filters;
}

void
CatalogsRetailProductGroup::setFilters(CatalogsProductGroupFilters  filters)
{
	this->filters = filters;
}

std::string
CatalogsRetailProductGroup::getId()
{
	return id;
}

void
CatalogsRetailProductGroup::setId(std::string  id)
{
	this->id = id;
}

bool
CatalogsRetailProductGroup::isIsFeatured()
{
	return is_featured;
}

void
CatalogsRetailProductGroup::setIsFeatured(bool  is_featured)
{
	this->is_featured = is_featured;
}

std::string
CatalogsRetailProductGroup::getLocale()
{
	return locale;
}

void
CatalogsRetailProductGroup::setLocale(std::string  locale)
{
	this->locale = locale;
}

std::string
CatalogsRetailProductGroup::getName()
{
	return name;
}

void
CatalogsRetailProductGroup::setName(std::string  name)
{
	this->name = name;
}

CatalogsProductGroupStatus
CatalogsRetailProductGroup::getStatus()
{
	return status;
}

void
CatalogsRetailProductGroup::setStatus(CatalogsProductGroupStatus  status)
{
	this->status = status;
}

CatalogsProductGroupType
CatalogsRetailProductGroup::getType()
{
	return type;
}

void
CatalogsRetailProductGroup::setType(CatalogsProductGroupType  type)
{
	this->type = type;
}

int
CatalogsRetailProductGroup::getUpdatedAt()
{
	return updated_at;
}

void
CatalogsRetailProductGroup::setUpdatedAt(int  updated_at)
{
	this->updated_at = updated_at;
}



