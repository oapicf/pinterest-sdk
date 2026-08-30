

#include "UpdateMemberAssetAccessBody.h"

using namespace Tiny;

UpdateMemberAssetAccessBody::UpdateMemberAssetAccessBody()
{
	accesses = std::list<UpdateMemberAssetAccessItem>();
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


        std::list<UpdateMemberAssetAccessItem> accesses_list;
        UpdateMemberAssetAccessItem element;
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




    std::list<UpdateMemberAssetAccessItem> accesses_list = getAccesses();
    bourne::json accesses_arr = bourne::json::array();

    for(auto& var : accesses_list)
    {
        UpdateMemberAssetAccessItem obj = var;
        accesses_arr.append(obj.toJson());
    }
    object["accesses"] = accesses_arr;




    return object;

}

std::list<UpdateMemberAssetAccessItem>
UpdateMemberAssetAccessBody::getAccesses()
{
	return accesses;
}

void
UpdateMemberAssetAccessBody::setAccesses(std::list<UpdateMemberAssetAccessItem> accesses)
{
	this->accesses = accesses;
}



