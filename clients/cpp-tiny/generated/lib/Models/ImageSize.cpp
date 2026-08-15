

#include "ImageSize.h"

using namespace Tiny;

ImageSize::ImageSize()
{
	1200x = ImageDetails();
	150x150 = ImageDetails();
	400x300 = ImageDetails();
	600x = ImageDetails();
}

ImageSize::ImageSize(std::string jsonString)
{
	this->fromJson(jsonString);
}

ImageSize::~ImageSize()
{

}

void
ImageSize::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *1200xKey = "1200x";

    if(object.has_key(1200xKey))
    {
        bourne::json value = object[1200xKey];




        ImageDetails* obj = &1200x;
		obj->fromJson(value.dump());

    }

    const char *150x150Key = "150x150";

    if(object.has_key(150x150Key))
    {
        bourne::json value = object[150x150Key];




        ImageDetails* obj = &150x150;
		obj->fromJson(value.dump());

    }

    const char *400x300Key = "400x300";

    if(object.has_key(400x300Key))
    {
        bourne::json value = object[400x300Key];




        ImageDetails* obj = &400x300;
		obj->fromJson(value.dump());

    }

    const char *600xKey = "600x";

    if(object.has_key(600xKey))
    {
        bourne::json value = object[600xKey];




        ImageDetails* obj = &600x;
		obj->fromJson(value.dump());

    }


}

bourne::json
ImageSize::toJson()
{
    bourne::json object = bourne::json::object();






	object["1200x"] = get1200x().toJson();






	object["150x150"] = get150x150().toJson();






	object["400x300"] = get400x300().toJson();






	object["600x"] = get600x().toJson();


    return object;

}

ImageDetails
ImageSize::get1200x()
{
	return 1200x;
}

void
ImageSize::set1200x(ImageDetails  1200x)
{
	this->1200x = 1200x;
}

ImageDetails
ImageSize::get150x150()
{
	return 150x150;
}

void
ImageSize::set150x150(ImageDetails  150x150)
{
	this->150x150 = 150x150;
}

ImageDetails
ImageSize::get400x300()
{
	return 400x300;
}

void
ImageSize::set400x300(ImageDetails  400x300)
{
	this->400x300 = 400x300;
}

ImageDetails
ImageSize::get600x()
{
	return 600x;
}

void
ImageSize::set600x(ImageDetails  600x)
{
	this->600x = 600x;
}



