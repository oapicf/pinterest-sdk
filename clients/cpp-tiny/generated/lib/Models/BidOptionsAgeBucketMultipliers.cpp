

#include "BidOptionsAgeBucketMultipliers.h"

using namespace Tiny;

BidOptionsAgeBucketMultipliers::BidOptionsAgeBucketMultipliers()
{
	1824 = float(0);
	2534 = float(0);
	3544 = float(0);
	4549 = float(0);
	5054 = float(0);
	5564 = float(0);
	65 = float(0);
}

BidOptionsAgeBucketMultipliers::BidOptionsAgeBucketMultipliers(std::string jsonString)
{
	this->fromJson(jsonString);
}

BidOptionsAgeBucketMultipliers::~BidOptionsAgeBucketMultipliers()
{

}

void
BidOptionsAgeBucketMultipliers::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *1824Key = "18-24";

    if(object.has_key(1824Key))
    {
        bourne::json value = object[1824Key];



        jsonToValue(&1824, value, "long");


    }

    const char *2534Key = "25-34";

    if(object.has_key(2534Key))
    {
        bourne::json value = object[2534Key];



        jsonToValue(&2534, value, "long");


    }

    const char *3544Key = "35-44";

    if(object.has_key(3544Key))
    {
        bourne::json value = object[3544Key];



        jsonToValue(&3544, value, "long");


    }

    const char *4549Key = "45-49";

    if(object.has_key(4549Key))
    {
        bourne::json value = object[4549Key];



        jsonToValue(&4549, value, "long");


    }

    const char *5054Key = "50-54";

    if(object.has_key(5054Key))
    {
        bourne::json value = object[5054Key];



        jsonToValue(&5054, value, "long");


    }

    const char *5564Key = "55-64";

    if(object.has_key(5564Key))
    {
        bourne::json value = object[5564Key];



        jsonToValue(&5564, value, "long");


    }

    const char *65Key = "65+";

    if(object.has_key(65Key))
    {
        bourne::json value = object[65Key];



        jsonToValue(&65, value, "long");


    }


}

bourne::json
BidOptionsAgeBucketMultipliers::toJson()
{
    bourne::json object = bourne::json::object();





    object["1824"] = get1824();






    object["2534"] = get2534();






    object["3544"] = get3544();






    object["4549"] = get4549();






    object["5054"] = get5054();






    object["5564"] = get5564();






    object["65"] = get65();



    return object;

}

long
BidOptionsAgeBucketMultipliers::get1824()
{
	return 1824;
}

void
BidOptionsAgeBucketMultipliers::set1824(long 1824)
{
	this->1824 = 1824;
}

long
BidOptionsAgeBucketMultipliers::get2534()
{
	return 2534;
}

void
BidOptionsAgeBucketMultipliers::set2534(long 2534)
{
	this->2534 = 2534;
}

long
BidOptionsAgeBucketMultipliers::get3544()
{
	return 3544;
}

void
BidOptionsAgeBucketMultipliers::set3544(long 3544)
{
	this->3544 = 3544;
}

long
BidOptionsAgeBucketMultipliers::get4549()
{
	return 4549;
}

void
BidOptionsAgeBucketMultipliers::set4549(long 4549)
{
	this->4549 = 4549;
}

long
BidOptionsAgeBucketMultipliers::get5054()
{
	return 5054;
}

void
BidOptionsAgeBucketMultipliers::set5054(long 5054)
{
	this->5054 = 5054;
}

long
BidOptionsAgeBucketMultipliers::get5564()
{
	return 5564;
}

void
BidOptionsAgeBucketMultipliers::set5564(long 5564)
{
	this->5564 = 5564;
}

long
BidOptionsAgeBucketMultipliers::get65()
{
	return 65;
}

void
BidOptionsAgeBucketMultipliers::set65(long 65)
{
	this->65 = 65;
}



