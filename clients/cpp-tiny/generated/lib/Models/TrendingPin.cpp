

#include "TrendingPin.h"

using namespace Tiny;

TrendingPin::TrendingPin()
{
	color = std::string();
	height = int(0);
	id = std::string();
	src = std::string();
	vertical_offset = float(0);
	width = int(0);
}

TrendingPin::TrendingPin(std::string jsonString)
{
	this->fromJson(jsonString);
}

TrendingPin::~TrendingPin()
{

}

void
TrendingPin::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *colorKey = "color";

    if(object.has_key(colorKey))
    {
        bourne::json value = object[colorKey];



        jsonToValue(&color, value, "std::string");


    }

    const char *heightKey = "height";

    if(object.has_key(heightKey))
    {
        bourne::json value = object[heightKey];



        jsonToValue(&height, value, "int");


    }

    const char *idKey = "id";

    if(object.has_key(idKey))
    {
        bourne::json value = object[idKey];



        jsonToValue(&id, value, "std::string");


    }

    const char *srcKey = "src";

    if(object.has_key(srcKey))
    {
        bourne::json value = object[srcKey];



        jsonToValue(&src, value, "std::string");


    }

    const char *vertical_offsetKey = "vertical_offset";

    if(object.has_key(vertical_offsetKey))
    {
        bourne::json value = object[vertical_offsetKey];



        jsonToValue(&vertical_offset, value, "double");


    }

    const char *widthKey = "width";

    if(object.has_key(widthKey))
    {
        bourne::json value = object[widthKey];



        jsonToValue(&width, value, "int");


    }


}

bourne::json
TrendingPin::toJson()
{
    bourne::json object = bourne::json::object();





    object["color"] = getColor();






    object["height"] = getHeight();






    object["id"] = getId();






    object["src"] = getSrc();






    object["vertical_offset"] = getVerticalOffset();






    object["width"] = getWidth();



    return object;

}

std::string
TrendingPin::getColor()
{
	return color;
}

void
TrendingPin::setColor(std::string color)
{
	this->color = color;
}

int
TrendingPin::getHeight()
{
	return height;
}

void
TrendingPin::setHeight(int height)
{
	this->height = height;
}

std::string
TrendingPin::getId()
{
	return id;
}

void
TrendingPin::setId(std::string id)
{
	this->id = id;
}

std::string
TrendingPin::getSrc()
{
	return src;
}

void
TrendingPin::setSrc(std::string src)
{
	this->src = src;
}

double
TrendingPin::getVerticalOffset()
{
	return vertical_offset;
}

void
TrendingPin::setVerticalOffset(double vertical_offset)
{
	this->vertical_offset = vertical_offset;
}

int
TrendingPin::getWidth()
{
	return width;
}

void
TrendingPin::setWidth(int width)
{
	this->width = width;
}



