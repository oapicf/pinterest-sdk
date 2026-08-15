

#include "SharedAudienceCommon.h"

using namespace Tiny;

SharedAudienceCommon::SharedAudienceCommon()
{
	audience_id = std::string();
	operation_type = OperationType();
}

SharedAudienceCommon::SharedAudienceCommon(std::string jsonString)
{
	this->fromJson(jsonString);
}

SharedAudienceCommon::~SharedAudienceCommon()
{

}

void
SharedAudienceCommon::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *audience_idKey = "audience_id";

    if(object.has_key(audience_idKey))
    {
        bourne::json value = object[audience_idKey];



        jsonToValue(&audience_id, value, "std::string");


    }

    const char *operation_typeKey = "operation_type";

    if(object.has_key(operation_typeKey))
    {
        bourne::json value = object[operation_typeKey];




        OperationType* obj = &operation_type;
		obj->fromJson(value.dump());

    }


}

bourne::json
SharedAudienceCommon::toJson()
{
    bourne::json object = bourne::json::object();





    object["audience_id"] = getAudienceId();







	object["operation_type"] = getOperationType().toJson();


    return object;

}

std::string
SharedAudienceCommon::getAudienceId()
{
	return audience_id;
}

void
SharedAudienceCommon::setAudienceId(std::string  audience_id)
{
	this->audience_id = audience_id;
}

OperationType
SharedAudienceCommon::getOperationType()
{
	return operation_type;
}

void
SharedAudienceCommon::setOperationType(OperationType  operation_type)
{
	this->operation_type = operation_type;
}



