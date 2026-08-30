

#include "CustomerSegmentUpdateRequestUpdateWithRequiredBody.h"

using namespace Tiny;

CustomerSegmentUpdateRequestUpdateWithRequiredBody::CustomerSegmentUpdateRequestUpdateWithRequiredBody()
{
	audience_ids = std::list<std::string>();
	id = std::string();
	operation_type = AudienceUpdateOperationType();
}

CustomerSegmentUpdateRequestUpdateWithRequiredBody::CustomerSegmentUpdateRequestUpdateWithRequiredBody(std::string jsonString)
{
	this->fromJson(jsonString);
}

CustomerSegmentUpdateRequestUpdateWithRequiredBody::~CustomerSegmentUpdateRequestUpdateWithRequiredBody()
{

}

void
CustomerSegmentUpdateRequestUpdateWithRequiredBody::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *audience_idsKey = "audience_ids";

    if(object.has_key(audience_idsKey))
    {
        bourne::json value = object[audience_idsKey];


        std::list<std::string> audience_ids_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            audience_ids_list.push_back(element);
        }
        audience_ids = audience_ids_list;


    }

    const char *idKey = "id";

    if(object.has_key(idKey))
    {
        bourne::json value = object[idKey];



        jsonToValue(&id, value, "std::string");


    }

    const char *operation_typeKey = "operation_type";

    if(object.has_key(operation_typeKey))
    {
        bourne::json value = object[operation_typeKey];




        AudienceUpdateOperationType* obj = &operation_type;
		obj->fromJson(value.dump());

    }


}

bourne::json
CustomerSegmentUpdateRequestUpdateWithRequiredBody::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<std::string> audience_ids_list = getAudienceIds();
    bourne::json audience_ids_arr = bourne::json::array();

    for(auto& var : audience_ids_list)
    {
        audience_ids_arr.append(var);
    }
    object["audience_ids"] = audience_ids_arr;









    object["id"] = getId();







	object["operation_type"] = getOperationType().toJson();


    return object;

}

std::list<std::string>
CustomerSegmentUpdateRequestUpdateWithRequiredBody::getAudienceIds()
{
	return audience_ids;
}

void
CustomerSegmentUpdateRequestUpdateWithRequiredBody::setAudienceIds(std::list<std::string> audience_ids)
{
	this->audience_ids = audience_ids;
}

std::string
CustomerSegmentUpdateRequestUpdateWithRequiredBody::getId()
{
	return id;
}

void
CustomerSegmentUpdateRequestUpdateWithRequiredBody::setId(std::string id)
{
	this->id = id;
}

AudienceUpdateOperationType
CustomerSegmentUpdateRequestUpdateWithRequiredBody::getOperationType()
{
	return operation_type;
}

void
CustomerSegmentUpdateRequestUpdateWithRequiredBody::setOperationType(AudienceUpdateOperationType operation_type)
{
	this->operation_type = operation_type;
}



