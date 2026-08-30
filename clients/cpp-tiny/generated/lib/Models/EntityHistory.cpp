

#include "EntityHistory.h"

using namespace Tiny;

EntityHistory::EntityHistory()
{
	change_timestamp = int(0);
	data_changes = std::list<EntityDataChangeHistory>();
	entity_id = std::string();
	entity_name = std::string();
	ldap = std::string();
	operation = null;
	user_id = std::string();
}

EntityHistory::EntityHistory(std::string jsonString)
{
	this->fromJson(jsonString);
}

EntityHistory::~EntityHistory()
{

}

void
EntityHistory::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *change_timestampKey = "change_timestamp";

    if(object.has_key(change_timestampKey))
    {
        bourne::json value = object[change_timestampKey];



        jsonToValue(&change_timestamp, value, "int");


    }

    const char *data_changesKey = "data_changes";

    if(object.has_key(data_changesKey))
    {
        bourne::json value = object[data_changesKey];


        std::list<EntityDataChangeHistory> data_changes_list;
        EntityDataChangeHistory element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            data_changes_list.push_back(element);
        }
        data_changes = data_changes_list;


    }

    const char *entity_idKey = "entity_id";

    if(object.has_key(entity_idKey))
    {
        bourne::json value = object[entity_idKey];



        jsonToValue(&entity_id, value, "std::string");


    }

    const char *entity_nameKey = "entity_name";

    if(object.has_key(entity_nameKey))
    {
        bourne::json value = object[entity_nameKey];



        jsonToValue(&entity_name, value, "std::string");


    }

    const char *ldapKey = "ldap";

    if(object.has_key(ldapKey))
    {
        bourne::json value = object[ldapKey];



        jsonToValue(&ldap, value, "std::string");


    }

    const char *operationKey = "operation";

    if(object.has_key(operationKey))
    {
        bourne::json value = object[operationKey];




        ChangeHistoryOperationType* obj = &operation;
		obj->fromJson(value.dump());

    }

    const char *user_idKey = "user_id";

    if(object.has_key(user_idKey))
    {
        bourne::json value = object[user_idKey];



        jsonToValue(&user_id, value, "std::string");


    }


}

bourne::json
EntityHistory::toJson()
{
    bourne::json object = bourne::json::object();





    object["change_timestamp"] = getChangeTimestamp();





    std::list<EntityDataChangeHistory> data_changes_list = getDataChanges();
    bourne::json data_changes_arr = bourne::json::array();

    for(auto& var : data_changes_list)
    {
        EntityDataChangeHistory obj = var;
        data_changes_arr.append(obj.toJson());
    }
    object["data_changes"] = data_changes_arr;







    object["entity_id"] = getEntityId();






    object["entity_name"] = getEntityName();






    object["ldap"] = getLdap();







	object["operation"] = getOperation().toJson();





    object["user_id"] = getUserId();



    return object;

}

int
EntityHistory::getChangeTimestamp()
{
	return change_timestamp;
}

void
EntityHistory::setChangeTimestamp(int change_timestamp)
{
	this->change_timestamp = change_timestamp;
}

std::list<EntityDataChangeHistory>
EntityHistory::getDataChanges()
{
	return data_changes;
}

void
EntityHistory::setDataChanges(std::list<EntityDataChangeHistory> data_changes)
{
	this->data_changes = data_changes;
}

std::string
EntityHistory::getEntityId()
{
	return entity_id;
}

void
EntityHistory::setEntityId(std::string entity_id)
{
	this->entity_id = entity_id;
}

std::string
EntityHistory::getEntityName()
{
	return entity_name;
}

void
EntityHistory::setEntityName(std::string entity_name)
{
	this->entity_name = entity_name;
}

std::string
EntityHistory::getLdap()
{
	return ldap;
}

void
EntityHistory::setLdap(std::string ldap)
{
	this->ldap = ldap;
}

ChangeHistoryOperationType
EntityHistory::getOperation()
{
	return operation;
}

void
EntityHistory::setOperation(ChangeHistoryOperationType operation)
{
	this->operation = operation;
}

std::string
EntityHistory::getUserId()
{
	return user_id;
}

void
EntityHistory::setUserId(std::string user_id)
{
	this->user_id = user_id;
}



