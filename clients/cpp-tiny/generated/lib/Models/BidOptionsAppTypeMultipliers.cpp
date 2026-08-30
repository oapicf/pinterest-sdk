

#include "BidOptionsAppTypeMultipliers.h"

using namespace Tiny;

BidOptionsAppTypeMultipliers::BidOptionsAppTypeMultipliers()
{
	android_mobile = float(0);
	android_tablet = float(0);
	ipad = float(0);
	iphone = float(0);
	web = float(0);
	web_mobile = float(0);
}

BidOptionsAppTypeMultipliers::BidOptionsAppTypeMultipliers(std::string jsonString)
{
	this->fromJson(jsonString);
}

BidOptionsAppTypeMultipliers::~BidOptionsAppTypeMultipliers()
{

}

void
BidOptionsAppTypeMultipliers::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *android_mobileKey = "android_mobile";

    if(object.has_key(android_mobileKey))
    {
        bourne::json value = object[android_mobileKey];



        jsonToValue(&android_mobile, value, "long");


    }

    const char *android_tabletKey = "android_tablet";

    if(object.has_key(android_tabletKey))
    {
        bourne::json value = object[android_tabletKey];



        jsonToValue(&android_tablet, value, "long");


    }

    const char *ipadKey = "ipad";

    if(object.has_key(ipadKey))
    {
        bourne::json value = object[ipadKey];



        jsonToValue(&ipad, value, "long");


    }

    const char *iphoneKey = "iphone";

    if(object.has_key(iphoneKey))
    {
        bourne::json value = object[iphoneKey];



        jsonToValue(&iphone, value, "long");


    }

    const char *webKey = "web";

    if(object.has_key(webKey))
    {
        bourne::json value = object[webKey];



        jsonToValue(&web, value, "long");


    }

    const char *web_mobileKey = "web_mobile";

    if(object.has_key(web_mobileKey))
    {
        bourne::json value = object[web_mobileKey];



        jsonToValue(&web_mobile, value, "long");


    }


}

bourne::json
BidOptionsAppTypeMultipliers::toJson()
{
    bourne::json object = bourne::json::object();





    object["android_mobile"] = getAndroidMobile();






    object["android_tablet"] = getAndroidTablet();






    object["ipad"] = getIpad();






    object["iphone"] = getIphone();






    object["web"] = getWeb();






    object["web_mobile"] = getWebMobile();



    return object;

}

long
BidOptionsAppTypeMultipliers::getAndroidMobile()
{
	return android_mobile;
}

void
BidOptionsAppTypeMultipliers::setAndroidMobile(long android_mobile)
{
	this->android_mobile = android_mobile;
}

long
BidOptionsAppTypeMultipliers::getAndroidTablet()
{
	return android_tablet;
}

void
BidOptionsAppTypeMultipliers::setAndroidTablet(long android_tablet)
{
	this->android_tablet = android_tablet;
}

long
BidOptionsAppTypeMultipliers::getIpad()
{
	return ipad;
}

void
BidOptionsAppTypeMultipliers::setIpad(long ipad)
{
	this->ipad = ipad;
}

long
BidOptionsAppTypeMultipliers::getIphone()
{
	return iphone;
}

void
BidOptionsAppTypeMultipliers::setIphone(long iphone)
{
	this->iphone = iphone;
}

long
BidOptionsAppTypeMultipliers::getWeb()
{
	return web;
}

void
BidOptionsAppTypeMultipliers::setWeb(long web)
{
	this->web = web;
}

long
BidOptionsAppTypeMultipliers::getWebMobile()
{
	return web_mobile;
}

void
BidOptionsAppTypeMultipliers::setWebMobile(long web_mobile)
{
	this->web_mobile = web_mobile;
}



