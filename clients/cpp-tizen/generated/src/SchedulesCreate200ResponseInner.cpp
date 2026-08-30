#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "Schedules_create_200_response_inner.h"

using namespace std;
using namespace Tizen::ArtikCloud;

Schedules_create_200_response_inner::Schedules_create_200_response_inner()
{
	//__init();
}

Schedules_create_200_response_inner::~Schedules_create_200_response_inner()
{
	//__cleanup();
}

void
Schedules_create_200_response_inner::__init()
{
	//data = new Schedules_create_200_response_inner_data();
}

void
Schedules_create_200_response_inner::__cleanup()
{
	//if(data != NULL) {
	//
	//delete data;
	//data = NULL;
	//}
	//
}

void
Schedules_create_200_response_inner::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *dataKey = "data";
	node = json_object_get_member(pJsonObject, dataKey);
	if (node !=NULL) {
	

		if (isprimitive("Schedules_create_200_response_inner_data")) {
			jsonToValue(&data, node, "Schedules_create_200_response_inner_data", "Schedules_create_200_response_inner_data");
		} else {
			
			Schedules_create_200_response_inner_data* obj = static_cast<Schedules_create_200_response_inner_data*> (&data);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

Schedules_create_200_response_inner::Schedules_create_200_response_inner(char* json)
{
	this->fromJson(json);
}

char*
Schedules_create_200_response_inner::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("Schedules_create_200_response_inner_data")) {
		Schedules_create_200_response_inner_data obj = getData();
		node = converttoJson(&obj, "Schedules_create_200_response_inner_data", "");
	}
	else {
		
		Schedules_create_200_response_inner_data obj = static_cast<Schedules_create_200_response_inner_data> (getData());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *dataKey = "data";
	json_object_set_member(pJsonObject, dataKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

Schedules_create_200_response_inner_data
Schedules_create_200_response_inner::getData()
{
	return data;
}

void
Schedules_create_200_response_inner::setData(Schedules_create_200_response_inner_data  data)
{
	this->data = data;
}


