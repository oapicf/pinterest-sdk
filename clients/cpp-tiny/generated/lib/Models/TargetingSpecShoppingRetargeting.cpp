

#include "TargetingSpecShoppingRetargeting.h"

using namespace Tiny;

TargetingSpecShoppingRetargeting::TargetingSpecShoppingRetargeting()
{
	exclusion_window = int(0);
	lookback_window = int(0);
	tag_types = std::list<int>();
}

TargetingSpecShoppingRetargeting::TargetingSpecShoppingRetargeting(std::string jsonString)
{
	this->fromJson(jsonString);
}

TargetingSpecShoppingRetargeting::~TargetingSpecShoppingRetargeting()
{

}

void
TargetingSpecShoppingRetargeting::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *exclusion_windowKey = "exclusion_window";

    if(object.has_key(exclusion_windowKey))
    {
        bourne::json value = object[exclusion_windowKey];



        jsonToValue(&exclusion_window, value, "int");


    }

    const char *lookback_windowKey = "lookback_window";

    if(object.has_key(lookback_windowKey))
    {
        bourne::json value = object[lookback_windowKey];



        jsonToValue(&lookback_window, value, "int");


    }

    const char *tag_typesKey = "tag_types";

    if(object.has_key(tag_typesKey))
    {
        bourne::json value = object[tag_typesKey];


        std::list<int> tag_types_list;
        int element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "int");


            tag_types_list.push_back(element);
        }
        tag_types = tag_types_list;


    }


}

bourne::json
TargetingSpecShoppingRetargeting::toJson()
{
    bourne::json object = bourne::json::object();





    object["exclusion_window"] = getExclusionWindow();






    object["lookback_window"] = getLookbackWindow();





    std::list<int> tag_types_list = getTagTypes();
    bourne::json tag_types_arr = bourne::json::array();

    for(auto& var : tag_types_list)
    {
        tag_types_arr.append(var);
    }
    object["tag_types"] = tag_types_arr;






    return object;

}

int
TargetingSpecShoppingRetargeting::getExclusionWindow()
{
	return exclusion_window;
}

void
TargetingSpecShoppingRetargeting::setExclusionWindow(int  exclusion_window)
{
	this->exclusion_window = exclusion_window;
}

int
TargetingSpecShoppingRetargeting::getLookbackWindow()
{
	return lookback_window;
}

void
TargetingSpecShoppingRetargeting::setLookbackWindow(int  lookback_window)
{
	this->lookback_window = lookback_window;
}

std::list<int>
TargetingSpecShoppingRetargeting::getTagTypes()
{
	return tag_types;
}

void
TargetingSpecShoppingRetargeting::setTagTypes(std::list <int> tag_types)
{
	this->tag_types = tag_types;
}



