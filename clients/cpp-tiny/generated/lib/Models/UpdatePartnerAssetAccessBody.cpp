

#include "UpdatePartnerAssetAccessBody.h"

using namespace Tiny;

UpdatePartnerAssetAccessBody::UpdatePartnerAssetAccessBody()
{
	accesses = std::list<UpdatePartnerAssetAccessItem>();
}

UpdatePartnerAssetAccessBody::UpdatePartnerAssetAccessBody(std::string jsonString)
{
	this->fromJson(jsonString);
}

UpdatePartnerAssetAccessBody::~UpdatePartnerAssetAccessBody()
{

}

void
UpdatePartnerAssetAccessBody::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *accessesKey = "accesses";

    if(object.has_key(accessesKey))
    {
        bourne::json value = object[accessesKey];


        std::list<UpdatePartnerAssetAccessItem> accesses_list;
        UpdatePartnerAssetAccessItem element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            accesses_list.push_back(element);
        }
        accesses = accesses_list;


    }


}

bourne::json
UpdatePartnerAssetAccessBody::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<UpdatePartnerAssetAccessItem> accesses_list = getAccesses();
    bourne::json accesses_arr = bourne::json::array();

    for(auto& var : accesses_list)
    {
        UpdatePartnerAssetAccessItem obj = var;
        accesses_arr.append(obj.toJson());
    }
    object["accesses"] = accesses_arr;




    return object;

}

std::list<UpdatePartnerAssetAccessItem>
UpdatePartnerAssetAccessBody::getAccesses()
{
	return accesses;
}

void
UpdatePartnerAssetAccessBody::setAccesses(std::list<UpdatePartnerAssetAccessItem> accesses)
{
	this->accesses = accesses;
}



