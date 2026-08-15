

#include "UpdateMemberAssetAccessBody.h"

using namespace Tiny;

UpdateMemberAssetAccessBody::UpdateMemberAssetAccessBody()
{
	accesses = std::list<UpdateMemberAssetAccessBody_accesses_inner>();
}

UpdateMemberAssetAccessBody::UpdateMemberAssetAccessBody(std::string jsonString)
{
	this->fromJson(jsonString);
}

UpdateMemberAssetAccessBody::~UpdateMemberAssetAccessBody()
{

}

void
UpdateMemberAssetAccessBody::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *accessesKey = "accesses";

    if(object.has_key(accessesKey))
    {
        bourne::json value = object[accessesKey];


        std::list<UpdateMemberAssetAccessBody_accesses_inner> accesses_list;
        UpdateMemberAssetAccessBody_accesses_inner element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            accesses_list.push_back(element);
        }
        accesses = accesses_list;


    }


}

bourne::json
UpdateMemberAssetAccessBody::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<UpdateMemberAssetAccessBody_accesses_inner> accesses_list = getAccesses();
    bourne::json accesses_arr = bourne::json::array();

    for(auto& var : accesses_list)
    {
        UpdateMemberAssetAccessBody_accesses_inner obj = var;
        accesses_arr.append(obj.toJson());
    }
    object["accesses"] = accesses_arr;




    return object;

}

std::list<UpdateMemberAssetAccessBody_accesses_inner>
UpdateMemberAssetAccessBody::getAccesses()
{
	return accesses;
}

void
UpdateMemberAssetAccessBody::setAccesses(std::list <UpdateMemberAssetAccessBody_accesses_inner> accesses)
{
	this->accesses = accesses;
}



