

#include "CreateAssetAccessRequestBody.h"

using namespace Tiny;

CreateAssetAccessRequestBody::CreateAssetAccessRequestBody()
{
	asset_requests = std::list<CreateAssetAccessRequestBody_asset_requests_inner>();
}

CreateAssetAccessRequestBody::CreateAssetAccessRequestBody(std::string jsonString)
{
	this->fromJson(jsonString);
}

CreateAssetAccessRequestBody::~CreateAssetAccessRequestBody()
{

}

void
CreateAssetAccessRequestBody::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *asset_requestsKey = "asset_requests";

    if(object.has_key(asset_requestsKey))
    {
        bourne::json value = object[asset_requestsKey];


        std::list<CreateAssetAccessRequestBody_asset_requests_inner> asset_requests_list;
        CreateAssetAccessRequestBody_asset_requests_inner element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            asset_requests_list.push_back(element);
        }
        asset_requests = asset_requests_list;


    }


}

bourne::json
CreateAssetAccessRequestBody::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<CreateAssetAccessRequestBody_asset_requests_inner> asset_requests_list = getAssetRequests();
    bourne::json asset_requests_arr = bourne::json::array();

    for(auto& var : asset_requests_list)
    {
        CreateAssetAccessRequestBody_asset_requests_inner obj = var;
        asset_requests_arr.append(obj.toJson());
    }
    object["asset_requests"] = asset_requests_arr;




    return object;

}

std::list<CreateAssetAccessRequestBody_asset_requests_inner>
CreateAssetAccessRequestBody::getAssetRequests()
{
	return asset_requests;
}

void
CreateAssetAccessRequestBody::setAssetRequests(std::list <CreateAssetAccessRequestBody_asset_requests_inner> asset_requests)
{
	this->asset_requests = asset_requests;
}



