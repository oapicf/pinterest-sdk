

#include "CatalogsHotelMainImage.h"

using namespace Tiny;

CatalogsHotelMainImage::CatalogsHotelMainImage()
{
	link = std::string();
	tag = std::list<std::string>();
}

CatalogsHotelMainImage::CatalogsHotelMainImage(std::string jsonString)
{
	this->fromJson(jsonString);
}

CatalogsHotelMainImage::~CatalogsHotelMainImage()
{

}

void
CatalogsHotelMainImage::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *linkKey = "link";

    if(object.has_key(linkKey))
    {
        bourne::json value = object[linkKey];



        jsonToValue(&link, value, "std::string");


    }

    const char *tagKey = "tag";

    if(object.has_key(tagKey))
    {
        bourne::json value = object[tagKey];


        std::list<std::string> tag_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            tag_list.push_back(element);
        }
        tag = tag_list;


    }


}

bourne::json
CatalogsHotelMainImage::toJson()
{
    bourne::json object = bourne::json::object();





    object["link"] = getLink();





    std::list<std::string> tag_list = getTag();
    bourne::json tag_arr = bourne::json::array();

    for(auto& var : tag_list)
    {
        tag_arr.append(var);
    }
    object["tag"] = tag_arr;






    return object;

}

std::string
CatalogsHotelMainImage::getLink()
{
	return link;
}

void
CatalogsHotelMainImage::setLink(std::string link)
{
	this->link = link;
}

std::list<std::string>
CatalogsHotelMainImage::getTag()
{
	return tag;
}

void
CatalogsHotelMainImage::setTag(std::list<std::string> tag)
{
	this->tag = tag;
}



