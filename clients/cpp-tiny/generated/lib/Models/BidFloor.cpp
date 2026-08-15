

#include "BidFloor.h"

using namespace Tiny;

BidFloor::BidFloor()
{
	bid_floors = std::list<int>();
	type = std::string();
}

BidFloor::BidFloor(std::string jsonString)
{
	this->fromJson(jsonString);
}

BidFloor::~BidFloor()
{

}

void
BidFloor::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *bid_floorsKey = "bid_floors";

    if(object.has_key(bid_floorsKey))
    {
        bourne::json value = object[bid_floorsKey];


        std::list<int> bid_floors_list;
        int element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "int");


            bid_floors_list.push_back(element);
        }
        bid_floors = bid_floors_list;


    }

    const char *typeKey = "type";

    if(object.has_key(typeKey))
    {
        bourne::json value = object[typeKey];



        jsonToValue(&type, value, "std::string");


    }


}

bourne::json
BidFloor::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<int> bid_floors_list = getBidFloors();
    bourne::json bid_floors_arr = bourne::json::array();

    for(auto& var : bid_floors_list)
    {
        bid_floors_arr.append(var);
    }
    object["bid_floors"] = bid_floors_arr;









    object["type"] = getType();



    return object;

}

std::list<int>
BidFloor::getBidFloors()
{
	return bid_floors;
}

void
BidFloor::setBidFloors(std::list <int> bid_floors)
{
	this->bid_floors = bid_floors;
}

std::string
BidFloor::getType()
{
	return type;
}

void
BidFloor::setType(std::string  type)
{
	this->type = type;
}



