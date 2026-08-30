

#include "BusinessMembersAssetAccessDeleteBody.h"

using namespace Tiny;

BusinessMembersAssetAccessDeleteBody::BusinessMembersAssetAccessDeleteBody()
{
	accesses = std::list<DeleteMemberAssetAccessItem>();
}

BusinessMembersAssetAccessDeleteBody::BusinessMembersAssetAccessDeleteBody(std::string jsonString)
{
	this->fromJson(jsonString);
}

BusinessMembersAssetAccessDeleteBody::~BusinessMembersAssetAccessDeleteBody()
{

}

void
BusinessMembersAssetAccessDeleteBody::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *accessesKey = "accesses";

    if(object.has_key(accessesKey))
    {
        bourne::json value = object[accessesKey];


        std::list<DeleteMemberAssetAccessItem> accesses_list;
        DeleteMemberAssetAccessItem element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            accesses_list.push_back(element);
        }
        accesses = accesses_list;


    }


}

bourne::json
BusinessMembersAssetAccessDeleteBody::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<DeleteMemberAssetAccessItem> accesses_list = getAccesses();
    bourne::json accesses_arr = bourne::json::array();

    for(auto& var : accesses_list)
    {
        DeleteMemberAssetAccessItem obj = var;
        accesses_arr.append(obj.toJson());
    }
    object["accesses"] = accesses_arr;




    return object;

}

std::list<DeleteMemberAssetAccessItem>
BusinessMembersAssetAccessDeleteBody::getAccesses()
{
	return accesses;
}

void
BusinessMembersAssetAccessDeleteBody::setAccesses(std::list<DeleteMemberAssetAccessItem> accesses)
{
	this->accesses = accesses;
}



