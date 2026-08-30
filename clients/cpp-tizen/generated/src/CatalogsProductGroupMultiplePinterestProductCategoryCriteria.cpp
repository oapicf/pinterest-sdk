#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CatalogsProductGroupMultiplePinterestProductCategoryCriteria.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CatalogsProductGroupMultiplePinterestProductCategoryCriteria::CatalogsProductGroupMultiplePinterestProductCategoryCriteria()
{
	//__init();
}

CatalogsProductGroupMultiplePinterestProductCategoryCriteria::~CatalogsProductGroupMultiplePinterestProductCategoryCriteria()
{
	//__cleanup();
}

void
CatalogsProductGroupMultiplePinterestProductCategoryCriteria::__init()
{
	//negated = bool(false);
	//new std::list()std::list> values;
}

void
CatalogsProductGroupMultiplePinterestProductCategoryCriteria::__cleanup()
{
	//if(negated != NULL) {
	//
	//delete negated;
	//negated = NULL;
	//}
	//if(values != NULL) {
	//values.RemoveAll(true);
	//delete values;
	//values = NULL;
	//}
	//
}

void
CatalogsProductGroupMultiplePinterestProductCategoryCriteria::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *negatedKey = "negated";
	node = json_object_get_member(pJsonObject, negatedKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&negated, node, "bool", "");
		} else {
			
		}
	}
	const gchar *valuesKey = "values";
	node = json_object_get_member(pJsonObject, valuesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<ProductCategoryEnum> new_list;
			ProductCategoryEnum inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("ProductCategoryEnum")) {
					jsonToValue(&inst, temp_json, "ProductCategoryEnum", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			values = new_list;
		}
		
	}
}

CatalogsProductGroupMultiplePinterestProductCategoryCriteria::CatalogsProductGroupMultiplePinterestProductCategoryCriteria(char* json)
{
	this->fromJson(json);
}

char*
CatalogsProductGroupMultiplePinterestProductCategoryCriteria::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("bool")) {
		bool obj = getNegated();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *negatedKey = "negated";
	json_object_set_member(pJsonObject, negatedKey, node);
	if (isprimitive("ProductCategoryEnum")) {
		list<ProductCategoryEnum> new_list = static_cast<list <ProductCategoryEnum> > (getValues());
		node = converttoJson(&new_list, "ProductCategoryEnum", "array");
	} else {
		node = json_node_alloc();
		list<ProductCategoryEnum> new_list = static_cast<list <ProductCategoryEnum> > (getValues());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<ProductCategoryEnum>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			ProductCategoryEnum obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *valuesKey = "values";
	json_object_set_member(pJsonObject, valuesKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

bool
CatalogsProductGroupMultiplePinterestProductCategoryCriteria::getNegated()
{
	return negated;
}

void
CatalogsProductGroupMultiplePinterestProductCategoryCriteria::setNegated(bool  negated)
{
	this->negated = negated;
}

std::list<ProductCategoryEnum>
CatalogsProductGroupMultiplePinterestProductCategoryCriteria::getValues()
{
	return values;
}

void
CatalogsProductGroupMultiplePinterestProductCategoryCriteria::setValues(std::list <ProductCategoryEnum> values)
{
	this->values = values;
}


