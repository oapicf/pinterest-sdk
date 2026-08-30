

#include "CatalogsVerticalProductGroup.h"

using namespace Tiny;

CatalogsVerticalProductGroup::CatalogsVerticalProductGroup()
{
	catalog_id = null;
	catalog_type = std::string();
	country = std::string();
	created_at = int(0);
	description = std::string();
	feed_id = std::string();
	filters = CatalogsCreativeAssetsProductGroupFilters();
	id = null;
	is_featured = bool(false);
	locale = std::string();
	name = std::string();
	status = CatalogsProductGroupStatus();
	type = CatalogsHotelProductGroupType();
	updated_at = int(0);
}

CatalogsVerticalProductGroup::CatalogsVerticalProductGroup(std::string jsonString)
{
	this->fromJson(jsonString);
}

CatalogsVerticalProductGroup::~CatalogsVerticalProductGroup()
{

}

void
CatalogsVerticalProductGroup::fromJson(std::string jsonObj)
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




        CatalogsCreativeAssetsProductGroupFilters* obj = &filters;
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




        CatalogsHotelProductGroupType* obj = &type;
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
CatalogsVerticalProductGroup::toJson()
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
CatalogsVerticalProductGroup::getCatalogId()
{
	return catalog_id;
}

void
CatalogsVerticalProductGroup::setCatalogId(std::string catalog_id)
{
	this->catalog_id = catalog_id;
}

std::string
CatalogsVerticalProductGroup::getCatalogType()
{
	return catalog_type;
}

void
CatalogsVerticalProductGroup::setCatalogType(std::string catalog_type)
{
	this->catalog_type = catalog_type;
}

std::string
CatalogsVerticalProductGroup::getCountry()
{
	return country;
}

void
CatalogsVerticalProductGroup::setCountry(std::string country)
{
	this->country = country;
}

int
CatalogsVerticalProductGroup::getCreatedAt()
{
	return created_at;
}

void
CatalogsVerticalProductGroup::setCreatedAt(int created_at)
{
	this->created_at = created_at;
}

std::string
CatalogsVerticalProductGroup::getDescription()
{
	return description;
}

void
CatalogsVerticalProductGroup::setDescription(std::string description)
{
	this->description = description;
}

std::string
CatalogsVerticalProductGroup::getFeedId()
{
	return feed_id;
}

void
CatalogsVerticalProductGroup::setFeedId(std::string feed_id)
{
	this->feed_id = feed_id;
}

CatalogsCreativeAssetsProductGroupFilters
CatalogsVerticalProductGroup::getFilters()
{
	return filters;
}

void
CatalogsVerticalProductGroup::setFilters(CatalogsCreativeAssetsProductGroupFilters filters)
{
	this->filters = filters;
}

std::string
CatalogsVerticalProductGroup::getId()
{
	return id;
}

void
CatalogsVerticalProductGroup::setId(std::string id)
{
	this->id = id;
}

bool
CatalogsVerticalProductGroup::isIsFeatured()
{
	return is_featured;
}

void
CatalogsVerticalProductGroup::setIsFeatured(bool is_featured)
{
	this->is_featured = is_featured;
}

std::string
CatalogsVerticalProductGroup::getLocale()
{
	return locale;
}

void
CatalogsVerticalProductGroup::setLocale(std::string locale)
{
	this->locale = locale;
}

std::string
CatalogsVerticalProductGroup::getName()
{
	return name;
}

void
CatalogsVerticalProductGroup::setName(std::string name)
{
	this->name = name;
}

CatalogsProductGroupStatus
CatalogsVerticalProductGroup::getStatus()
{
	return status;
}

void
CatalogsVerticalProductGroup::setStatus(CatalogsProductGroupStatus status)
{
	this->status = status;
}

CatalogsHotelProductGroupType
CatalogsVerticalProductGroup::getType()
{
	return type;
}

void
CatalogsVerticalProductGroup::setType(CatalogsHotelProductGroupType type)
{
	this->type = type;
}

int
CatalogsVerticalProductGroup::getUpdatedAt()
{
	return updated_at;
}

void
CatalogsVerticalProductGroup::setUpdatedAt(int updated_at)
{
	this->updated_at = updated_at;
}



