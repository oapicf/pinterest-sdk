#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "Catalogs_local_stores_create_200_response_inner_data_oneOf.h"

using namespace std;
using namespace Tizen::ArtikCloud;

Catalogs_local_stores_create_200_response_inner_data_oneOf::Catalogs_local_stores_create_200_response_inner_data_oneOf()
{
	//__init();
}

Catalogs_local_stores_create_200_response_inner_data_oneOf::~Catalogs_local_stores_create_200_response_inner_data_oneOf()
{
	//__cleanup();
}

void
Catalogs_local_stores_create_200_response_inner_data_oneOf::__init()
{
	//id = std::string();
	//exceptions = new Pinterest.Lib.Error();
}

void
Catalogs_local_stores_create_200_response_inner_data_oneOf::__cleanup()
{
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
	//if(exceptions != NULL) {
	//
	//delete exceptions;
	//exceptions = NULL;
	//}
	//
}

void
Catalogs_local_stores_create_200_response_inner_data_oneOf::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *idKey = "id";
	node = json_object_get_member(pJsonObject, idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *exceptionsKey = "exceptions";
	node = json_object_get_member(pJsonObject, exceptionsKey);
	if (node !=NULL) {
	

		if (isprimitive("Pinterest.Lib.Error")) {
			jsonToValue(&exceptions, node, "Pinterest.Lib.Error", "Pinterest.Lib.Error");
		} else {
			
			Pinterest.Lib.Error* obj = static_cast<Pinterest.Lib.Error*> (&exceptions);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

Catalogs_local_stores_create_200_response_inner_data_oneOf::Catalogs_local_stores_create_200_response_inner_data_oneOf(char* json)
{
	this->fromJson(json);
}

char*
Catalogs_local_stores_create_200_response_inner_data_oneOf::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *idKey = "id";
	json_object_set_member(pJsonObject, idKey, node);
	if (isprimitive("Pinterest.Lib.Error")) {
		Pinterest.Lib.Error obj = getExceptions();
		node = converttoJson(&obj, "Pinterest.Lib.Error", "");
	}
	else {
		
		Pinterest.Lib.Error obj = static_cast<Pinterest.Lib.Error> (getExceptions());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *exceptionsKey = "exceptions";
	json_object_set_member(pJsonObject, exceptionsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
Catalogs_local_stores_create_200_response_inner_data_oneOf::getId()
{
	return id;
}

void
Catalogs_local_stores_create_200_response_inner_data_oneOf::setId(std::string  id)
{
	this->id = id;
}

Pinterest.Lib.Error
Catalogs_local_stores_create_200_response_inner_data_oneOf::getExceptions()
{
	return exceptions;
}

void
Catalogs_local_stores_create_200_response_inner_data_oneOf::setExceptions(Pinterest.Lib.Error  exceptions)
{
	this->exceptions = exceptions;
}


