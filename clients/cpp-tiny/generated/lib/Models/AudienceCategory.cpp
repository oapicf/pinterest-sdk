

#include "AudienceCategory.h"

using namespace Tiny;

AudienceCategory::AudienceCategory()
{
	id = std::string();
	index = float(0);
	key = std::string();
	name = std::string();
	ratio = float(0);
	subcategories = std::list<AudienceSubcategory>();
}

AudienceCategory::AudienceCategory(std::string jsonString)
{
	this->fromJson(jsonString);
}

AudienceCategory::~AudienceCategory()
{

}

void
AudienceCategory::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *idKey = "id";

    if(object.has_key(idKey))
    {
        bourne::json value = object[idKey];



        jsonToValue(&id, value, "std::string");


    }

    const char *indexKey = "index";

    if(object.has_key(indexKey))
    {
        bourne::json value = object[indexKey];



        jsonToValue(&index, value, "long");


    }

    const char *keyKey = "key";

    if(object.has_key(keyKey))
    {
        bourne::json value = object[keyKey];



        jsonToValue(&key, value, "std::string");


    }

    const char *nameKey = "name";

    if(object.has_key(nameKey))
    {
        bourne::json value = object[nameKey];



        jsonToValue(&name, value, "std::string");


    }

    const char *ratioKey = "ratio";

    if(object.has_key(ratioKey))
    {
        bourne::json value = object[ratioKey];



        jsonToValue(&ratio, value, "long");


    }

    const char *subcategoriesKey = "subcategories";

    if(object.has_key(subcategoriesKey))
    {
        bourne::json value = object[subcategoriesKey];


        std::list<AudienceSubcategory> subcategories_list;
        AudienceSubcategory element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            subcategories_list.push_back(element);
        }
        subcategories = subcategories_list;


    }


}

bourne::json
AudienceCategory::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();






    object["index"] = getIndex();






    object["key"] = getKey();






    object["name"] = getName();






    object["ratio"] = getRatio();





    std::list<AudienceSubcategory> subcategories_list = getSubcategories();
    bourne::json subcategories_arr = bourne::json::array();

    for(auto& var : subcategories_list)
    {
        AudienceSubcategory obj = var;
        subcategories_arr.append(obj.toJson());
    }
    object["subcategories"] = subcategories_arr;




    return object;

}

std::string
AudienceCategory::getId()
{
	return id;
}

void
AudienceCategory::setId(std::string  id)
{
	this->id = id;
}

long
AudienceCategory::getIndex()
{
	return index;
}

void
AudienceCategory::setIndex(long  index)
{
	this->index = index;
}

std::string
AudienceCategory::getKey()
{
	return key;
}

void
AudienceCategory::setKey(std::string  key)
{
	this->key = key;
}

std::string
AudienceCategory::getName()
{
	return name;
}

void
AudienceCategory::setName(std::string  name)
{
	this->name = name;
}

long
AudienceCategory::getRatio()
{
	return ratio;
}

void
AudienceCategory::setRatio(long  ratio)
{
	this->ratio = ratio;
}

std::list<AudienceSubcategory>
AudienceCategory::getSubcategories()
{
	return subcategories;
}

void
AudienceCategory::setSubcategories(std::list <AudienceSubcategory> subcategories)
{
	this->subcategories = subcategories;
}



