

#include "DeletePartnerAssetAccessBody.h"

using namespace Tiny;

DeletePartnerAssetAccessBody::DeletePartnerAssetAccessBody()
{
	accesses = std::list<DeletePartnerAssetAccessBody_accesses_inner>();
}

DeletePartnerAssetAccessBody::DeletePartnerAssetAccessBody(std::string jsonString)
{
	this->fromJson(jsonString);
}

DeletePartnerAssetAccessBody::~DeletePartnerAssetAccessBody()
{

}

void
DeletePartnerAssetAccessBody::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *accessesKey = "accesses";

    if(object.has_key(accessesKey))
    {
        bourne::json value = object[accessesKey];


        std::list<DeletePartnerAssetAccessBody_accesses_inner> accesses_list;
        DeletePartnerAssetAccessBody_accesses_inner element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            accesses_list.push_back(element);
        }
        accesses = accesses_list;


    }


}

bourne::json
DeletePartnerAssetAccessBody::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<DeletePartnerAssetAccessBody_accesses_inner> accesses_list = getAccesses();
    bourne::json accesses_arr = bourne::json::array();

    for(auto& var : accesses_list)
    {
        DeletePartnerAssetAccessBody_accesses_inner obj = var;
        accesses_arr.append(obj.toJson());
    }
    object["accesses"] = accesses_arr;




    return object;

}

std::list<DeletePartnerAssetAccessBody_accesses_inner>
DeletePartnerAssetAccessBody::getAccesses()
{
	return accesses;
}

void
DeletePartnerAssetAccessBody::setAccesses(std::list <DeletePartnerAssetAccessBody_accesses_inner> accesses)
{
	this->accesses = accesses;
}



