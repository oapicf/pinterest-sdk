#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CatalogsProductGroupProductCounts.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CatalogsProductGroupProductCounts::CatalogsProductGroupProductCounts()
{
	//__init();
}

CatalogsProductGroupProductCounts::~CatalogsProductGroupProductCounts()
{
	//__cleanup();
}

void
CatalogsProductGroupProductCounts::__init()
{
	//in_stock = double(0);
	//out_of_stock = double(0);
	//preorder = double(0);
	//total = double(0);
}

void
CatalogsProductGroupProductCounts::__cleanup()
{
	//if(in_stock != NULL) {
	//
	//delete in_stock;
	//in_stock = NULL;
	//}
	//if(out_of_stock != NULL) {
	//
	//delete out_of_stock;
	//out_of_stock = NULL;
	//}
	//if(preorder != NULL) {
	//
	//delete preorder;
	//preorder = NULL;
	//}
	//if(total != NULL) {
	//
	//delete total;
	//total = NULL;
	//}
	//
}

void
CatalogsProductGroupProductCounts::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *in_stockKey = "in_stock";
	node = json_object_get_member(pJsonObject, in_stockKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&in_stock, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&in_stock);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *out_of_stockKey = "out_of_stock";
	node = json_object_get_member(pJsonObject, out_of_stockKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&out_of_stock, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&out_of_stock);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *preorderKey = "preorder";
	node = json_object_get_member(pJsonObject, preorderKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&preorder, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&preorder);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *totalKey = "total";
	node = json_object_get_member(pJsonObject, totalKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&total, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&total);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

CatalogsProductGroupProductCounts::CatalogsProductGroupProductCounts(char* json)
{
	this->fromJson(json);
}

char*
CatalogsProductGroupProductCounts::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("long long")) {
		long long obj = getInStock();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (getInStock());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *in_stockKey = "in_stock";
	json_object_set_member(pJsonObject, in_stockKey, node);
	if (isprimitive("long long")) {
		long long obj = getOutOfStock();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (getOutOfStock());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *out_of_stockKey = "out_of_stock";
	json_object_set_member(pJsonObject, out_of_stockKey, node);
	if (isprimitive("long long")) {
		long long obj = getPreorder();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (getPreorder());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *preorderKey = "preorder";
	json_object_set_member(pJsonObject, preorderKey, node);
	if (isprimitive("long long")) {
		long long obj = getTotal();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (getTotal());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *totalKey = "total";
	json_object_set_member(pJsonObject, totalKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

long long
CatalogsProductGroupProductCounts::getInStock()
{
	return in_stock;
}

void
CatalogsProductGroupProductCounts::setInStock(long long  in_stock)
{
	this->in_stock = in_stock;
}

long long
CatalogsProductGroupProductCounts::getOutOfStock()
{
	return out_of_stock;
}

void
CatalogsProductGroupProductCounts::setOutOfStock(long long  out_of_stock)
{
	this->out_of_stock = out_of_stock;
}

long long
CatalogsProductGroupProductCounts::getPreorder()
{
	return preorder;
}

void
CatalogsProductGroupProductCounts::setPreorder(long long  preorder)
{
	this->preorder = preorder;
}

long long
CatalogsProductGroupProductCounts::getTotal()
{
	return total;
}

void
CatalogsProductGroupProductCounts::setTotal(long long  total)
{
	this->total = total;
}


