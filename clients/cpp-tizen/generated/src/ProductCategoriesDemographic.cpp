#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ProductCategoriesDemographic.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ProductCategoriesDemographic::ProductCategoriesDemographic()
{
	//__init();
}

ProductCategoriesDemographic::~ProductCategoriesDemographic()
{
	//__cleanup();
}

void
ProductCategoriesDemographic::__init()
{
	//new std::map()std::map> age;
	//gender = new GenderDemographics();
}

void
ProductCategoriesDemographic::__cleanup()
{
	//if(age != NULL) {
	//age.RemoveAll(true);
	//delete age;
	//age = NULL;
	//}
	//if(gender != NULL) {
	//
	//delete gender;
	//gender = NULL;
	//}
	//
}

void
ProductCategoriesDemographic::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *ageKey = "age";
	node = json_object_get_member(pJsonObject, ageKey);
	if (node !=NULL) {
	
		{
			JsonObject* json_obj = json_node_get_object(node);
			map<string,string> new_map;
			json_object_foreach_member(json_obj,helper_func,&new_map);
			age = new_map;
		}
		
	}
	const gchar *genderKey = "gender";
	node = json_object_get_member(pJsonObject, genderKey);
	if (node !=NULL) {
	

		if (isprimitive("GenderDemographics")) {
			jsonToValue(&gender, node, "GenderDemographics", "GenderDemographics");
		} else {
			
			GenderDemographics* obj = static_cast<GenderDemographics*> (&gender);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ProductCategoriesDemographic::ProductCategoriesDemographic(char* json)
{
	this->fromJson(json);
}

char*
ProductCategoriesDemographic::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;


	{
		JsonObject* json_obj;
		map<string, string> new_list = static_cast<map <string, string> > (getAge());
		json_obj = json_object_new();
		for (map<string, string>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			string obj = (*it).first;
			string obj2 = (*it).second;
			JsonNode* tempnode = json_from_string(obj2.c_str(),NULL);
			json_object_set_member(json_obj, obj.c_str(), tempnode);
		}
	node = json_node_alloc();
	json_node_init_object(node, json_obj);
	json_object_unref(json_obj);
	}

	const gchar *ageKey = "age";
	json_object_set_member(pJsonObject, ageKey, node);
	if (isprimitive("GenderDemographics")) {
		GenderDemographics obj = getGender();
		node = converttoJson(&obj, "GenderDemographics", "");
	}
	else {
		
		GenderDemographics obj = static_cast<GenderDemographics> (getGender());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *genderKey = "gender";
	json_object_set_member(pJsonObject, genderKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::map<string, string>
ProductCategoriesDemographic::getAge()
{
	return age;
}

void
ProductCategoriesDemographic::setAge(std::map <string, string> age)
{
	this->age = age;
}

GenderDemographics
ProductCategoriesDemographic::getGender()
{
	return gender;
}

void
ProductCategoriesDemographic::setGender(GenderDemographics  gender)
{
	this->gender = gender;
}


