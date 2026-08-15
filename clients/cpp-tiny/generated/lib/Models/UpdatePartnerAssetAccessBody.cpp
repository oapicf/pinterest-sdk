

#include "UpdatePartnerAssetAccessBody.h"

using namespace Tiny;

UpdatePartnerAssetAccessBody::UpdatePartnerAssetAccessBody()
{
	accesses = std::list<UpdatePartnerAssetAccessBody_accesses_inner>();
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


        std::list<UpdatePartnerAssetAccessBody_accesses_inner> accesses_list;
        UpdatePartnerAssetAccessBody_accesses_inner element;
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




    std::list<UpdatePartnerAssetAccessBody_accesses_inner> accesses_list = getAccesses();
    bourne::json accesses_arr = bourne::json::array();

    for(auto& var : accesses_list)
    {
        UpdatePartnerAssetAccessBody_accesses_inner obj = var;
        accesses_arr.append(obj.toJson());
    }
    object["accesses"] = accesses_arr;




    return object;

}

std::list<UpdatePartnerAssetAccessBody_accesses_inner>
UpdatePartnerAssetAccessBody::getAccesses()
{
	return accesses;
}

void
UpdatePartnerAssetAccessBody::setAccesses(std::list <UpdatePartnerAssetAccessBody_accesses_inner> accesses)
{
	this->accesses = accesses;
}



