

#include "EntityDataChangeHistory.h"

using namespace Tiny;

EntityDataChangeHistory::EntityDataChangeHistory()
{
	changed_field_id = std::string();
	changed_field_name = std::string();
	data_type = null;
	new_data_value = std::string();
	old_data_value = std::string();
}

EntityDataChangeHistory::EntityDataChangeHistory(std::string jsonString)
{
	this->fromJson(jsonString);
}

EntityDataChangeHistory::~EntityDataChangeHistory()
{

}

void
EntityDataChangeHistory::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *changed_field_idKey = "changed_field_id";

    if(object.has_key(changed_field_idKey))
    {
        bourne::json value = object[changed_field_idKey];



        jsonToValue(&changed_field_id, value, "std::string");


    }

    const char *changed_field_nameKey = "changed_field_name";

    if(object.has_key(changed_field_nameKey))
    {
        bourne::json value = object[changed_field_nameKey];



        jsonToValue(&changed_field_name, value, "std::string");


    }

    const char *data_typeKey = "data_type";

    if(object.has_key(data_typeKey))
    {
        bourne::json value = object[data_typeKey];




        ChangeHistoryDataType* obj = &data_type;
		obj->fromJson(value.dump());

    }

    const char *new_data_valueKey = "new_data_value";

    if(object.has_key(new_data_valueKey))
    {
        bourne::json value = object[new_data_valueKey];



        jsonToValue(&new_data_value, value, "std::string");


    }

    const char *old_data_valueKey = "old_data_value";

    if(object.has_key(old_data_valueKey))
    {
        bourne::json value = object[old_data_valueKey];



        jsonToValue(&old_data_value, value, "std::string");


    }


}

bourne::json
EntityDataChangeHistory::toJson()
{
    bourne::json object = bourne::json::object();





    object["changed_field_id"] = getChangedFieldId();






    object["changed_field_name"] = getChangedFieldName();







	object["data_type"] = getDataType().toJson();





    object["new_data_value"] = getNewDataValue();






    object["old_data_value"] = getOldDataValue();



    return object;

}

std::string
EntityDataChangeHistory::getChangedFieldId()
{
	return changed_field_id;
}

void
EntityDataChangeHistory::setChangedFieldId(std::string changed_field_id)
{
	this->changed_field_id = changed_field_id;
}

std::string
EntityDataChangeHistory::getChangedFieldName()
{
	return changed_field_name;
}

void
EntityDataChangeHistory::setChangedFieldName(std::string changed_field_name)
{
	this->changed_field_name = changed_field_name;
}

ChangeHistoryDataType
EntityDataChangeHistory::getDataType()
{
	return data_type;
}

void
EntityDataChangeHistory::setDataType(ChangeHistoryDataType data_type)
{
	this->data_type = data_type;
}

std::string
EntityDataChangeHistory::getNewDataValue()
{
	return new_data_value;
}

void
EntityDataChangeHistory::setNewDataValue(std::string new_data_value)
{
	this->new_data_value = new_data_value;
}

std::string
EntityDataChangeHistory::getOldDataValue()
{
	return old_data_value;
}

void
EntityDataChangeHistory::setOldDataValue(std::string old_data_value)
{
	this->old_data_value = old_data_value;
}



