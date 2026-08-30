

#include "ConversionDeletionRequestCreate.h"

using namespace Tiny;

ConversionDeletionRequestCreate::ConversionDeletionRequestCreate()
{
	deletion_targets = null;
}

ConversionDeletionRequestCreate::ConversionDeletionRequestCreate(std::string jsonString)
{
	this->fromJson(jsonString);
}

ConversionDeletionRequestCreate::~ConversionDeletionRequestCreate()
{

}

void
ConversionDeletionRequestCreate::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *deletion_targetsKey = "deletion_targets";

    if(object.has_key(deletion_targetsKey))
    {
        bourne::json value = object[deletion_targetsKey];




        ConversionDeletionRequestTargets* obj = &deletion_targets;
		obj->fromJson(value.dump());

    }


}

bourne::json
ConversionDeletionRequestCreate::toJson()
{
    bourne::json object = bourne::json::object();






	object["deletion_targets"] = getDeletionTargets().toJson();


    return object;

}

ConversionDeletionRequestTargets
ConversionDeletionRequestCreate::getDeletionTargets()
{
	return deletion_targets;
}

void
ConversionDeletionRequestCreate::setDeletionTargets(ConversionDeletionRequestTargets deletion_targets)
{
	this->deletion_targets = deletion_targets;
}



