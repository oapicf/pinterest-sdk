

#include "BidFloorCreate.h"

using namespace Tiny;

BidFloorCreate::BidFloorCreate()
{
	bid_floor_specs = std::list<BidFloorSpec>();
	targeting_spec = null;
}

BidFloorCreate::BidFloorCreate(std::string jsonString)
{
	this->fromJson(jsonString);
}

BidFloorCreate::~BidFloorCreate()
{

}

void
BidFloorCreate::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *bid_floor_specsKey = "bid_floor_specs";

    if(object.has_key(bid_floor_specsKey))
    {
        bourne::json value = object[bid_floor_specsKey];


        std::list<BidFloorSpec> bid_floor_specs_list;
        BidFloorSpec element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            bid_floor_specs_list.push_back(element);
        }
        bid_floor_specs = bid_floor_specs_list;


    }

    const char *targeting_specKey = "targeting_spec";

    if(object.has_key(targeting_specKey))
    {
        bourne::json value = object[targeting_specKey];




        TargetingSpecOptimal* obj = &targeting_spec;
		obj->fromJson(value.dump());

    }


}

bourne::json
BidFloorCreate::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<BidFloorSpec> bid_floor_specs_list = getBidFloorSpecs();
    bourne::json bid_floor_specs_arr = bourne::json::array();

    for(auto& var : bid_floor_specs_list)
    {
        BidFloorSpec obj = var;
        bid_floor_specs_arr.append(obj.toJson());
    }
    object["bid_floor_specs"] = bid_floor_specs_arr;








	object["targeting_spec"] = getTargetingSpec().toJson();


    return object;

}

std::list<BidFloorSpec>
BidFloorCreate::getBidFloorSpecs()
{
	return bid_floor_specs;
}

void
BidFloorCreate::setBidFloorSpecs(std::list<BidFloorSpec> bid_floor_specs)
{
	this->bid_floor_specs = bid_floor_specs;
}

TargetingSpecOptimal
BidFloorCreate::getTargetingSpec()
{
	return targeting_spec;
}

void
BidFloorCreate::setTargetingSpec(TargetingSpecOptimal targeting_spec)
{
	this->targeting_spec = targeting_spec;
}



