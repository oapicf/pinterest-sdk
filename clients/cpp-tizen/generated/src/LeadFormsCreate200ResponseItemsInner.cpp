#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "Lead_forms_create_200_response_items_inner.h"

using namespace std;
using namespace Tizen::ArtikCloud;

Lead_forms_create_200_response_items_inner::Lead_forms_create_200_response_items_inner()
{
	//__init();
}

Lead_forms_create_200_response_items_inner::~Lead_forms_create_200_response_items_inner()
{
	//__cleanup();
}

void
Lead_forms_create_200_response_items_inner::__init()
{
	//data = new LeadForm();
	//new std::list()std::list> exceptions;
}

void
Lead_forms_create_200_response_items_inner::__cleanup()
{
	//if(data != NULL) {
	//
	//delete data;
	//data = NULL;
	//}
	//if(exceptions != NULL) {
	//exceptions.RemoveAll(true);
	//delete exceptions;
	//exceptions = NULL;
	//}
	//
}

void
Lead_forms_create_200_response_items_inner::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *dataKey = "data";
	node = json_object_get_member(pJsonObject, dataKey);
	if (node !=NULL) {
	

		if (isprimitive("LeadForm")) {
			jsonToValue(&data, node, "LeadForm", "LeadForm");
		} else {
			
			LeadForm* obj = static_cast<LeadForm*> (&data);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *exceptionsKey = "exceptions";
	node = json_object_get_member(pJsonObject, exceptionsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<Pinterest.Lib.BatchItemException> new_list;
			Pinterest.Lib.BatchItemException inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("Pinterest.Lib.BatchItemException")) {
					jsonToValue(&inst, temp_json, "Pinterest.Lib.BatchItemException", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			exceptions = new_list;
		}
		
	}
}

Lead_forms_create_200_response_items_inner::Lead_forms_create_200_response_items_inner(char* json)
{
	this->fromJson(json);
}

char*
Lead_forms_create_200_response_items_inner::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("LeadForm")) {
		LeadForm obj = getData();
		node = converttoJson(&obj, "LeadForm", "");
	}
	else {
		
		LeadForm obj = static_cast<LeadForm> (getData());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *dataKey = "data";
	json_object_set_member(pJsonObject, dataKey, node);
	if (isprimitive("Pinterest.Lib.BatchItemException")) {
		list<Pinterest.Lib.BatchItemException> new_list = static_cast<list <Pinterest.Lib.BatchItemException> > (getExceptions());
		node = converttoJson(&new_list, "Pinterest.Lib.BatchItemException", "array");
	} else {
		node = json_node_alloc();
		list<Pinterest.Lib.BatchItemException> new_list = static_cast<list <Pinterest.Lib.BatchItemException> > (getExceptions());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<Pinterest.Lib.BatchItemException>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			Pinterest.Lib.BatchItemException obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
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

LeadForm
Lead_forms_create_200_response_items_inner::getData()
{
	return data;
}

void
Lead_forms_create_200_response_items_inner::setData(LeadForm  data)
{
	this->data = data;
}

std::list<Pinterest.Lib.BatchItemException>
Lead_forms_create_200_response_items_inner::getExceptions()
{
	return exceptions;
}

void
Lead_forms_create_200_response_items_inner::setExceptions(std::list <Pinterest.Lib.BatchItemException> exceptions)
{
	this->exceptions = exceptions;
}


