#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CatalogsHotelProductGroupFilterKeys.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CatalogsHotelProductGroupFilterKeys::CatalogsHotelProductGroupFilterKeys()
{
	//__init();
}

CatalogsHotelProductGroupFilterKeys::~CatalogsHotelProductGroupFilterKeys()
{
	//__cleanup();
}

void
CatalogsHotelProductGroupFilterKeys::__init()
{
	//pRICE = new Catalogs_product_group_pricing_currency_criteria();
	//hOTEL_ID = new CatalogsProductGroupMultipleStringCriteria();
	//bRAND = new CatalogsProductGroupMultipleStringCriteria();
	//cUSTOM_LABEL_0 = new CatalogsProductGroupMultipleStringCriteria();
	//cUSTOM_LABEL_1 = new CatalogsProductGroupMultipleStringCriteria();
	//cUSTOM_LABEL_2 = new CatalogsProductGroupMultipleStringCriteria();
	//cUSTOM_LABEL_3 = new CatalogsProductGroupMultipleStringCriteria();
	//cUSTOM_LABEL_4 = new CatalogsProductGroupMultipleStringCriteria();
	//cOUNTRY = new CatalogsProductGroupMultipleCountriesCriteria();
}

void
CatalogsHotelProductGroupFilterKeys::__cleanup()
{
	//if(pRICE != NULL) {
	//
	//delete pRICE;
	//pRICE = NULL;
	//}
	//if(hOTEL_ID != NULL) {
	//
	//delete hOTEL_ID;
	//hOTEL_ID = NULL;
	//}
	//if(bRAND != NULL) {
	//
	//delete bRAND;
	//bRAND = NULL;
	//}
	//if(cUSTOM_LABEL_0 != NULL) {
	//
	//delete cUSTOM_LABEL_0;
	//cUSTOM_LABEL_0 = NULL;
	//}
	//if(cUSTOM_LABEL_1 != NULL) {
	//
	//delete cUSTOM_LABEL_1;
	//cUSTOM_LABEL_1 = NULL;
	//}
	//if(cUSTOM_LABEL_2 != NULL) {
	//
	//delete cUSTOM_LABEL_2;
	//cUSTOM_LABEL_2 = NULL;
	//}
	//if(cUSTOM_LABEL_3 != NULL) {
	//
	//delete cUSTOM_LABEL_3;
	//cUSTOM_LABEL_3 = NULL;
	//}
	//if(cUSTOM_LABEL_4 != NULL) {
	//
	//delete cUSTOM_LABEL_4;
	//cUSTOM_LABEL_4 = NULL;
	//}
	//if(cOUNTRY != NULL) {
	//
	//delete cOUNTRY;
	//cOUNTRY = NULL;
	//}
	//
}

void
CatalogsHotelProductGroupFilterKeys::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *pRICEKey = "PRICE";
	node = json_object_get_member(pJsonObject, pRICEKey);
	if (node !=NULL) {
	

		if (isprimitive("Catalogs_product_group_pricing_currency_criteria")) {
			jsonToValue(&pRICE, node, "Catalogs_product_group_pricing_currency_criteria", "Catalogs_product_group_pricing_currency_criteria");
		} else {
			
			Catalogs_product_group_pricing_currency_criteria* obj = static_cast<Catalogs_product_group_pricing_currency_criteria*> (&pRICE);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *hOTEL_IDKey = "HOTEL_ID";
	node = json_object_get_member(pJsonObject, hOTEL_IDKey);
	if (node !=NULL) {
	

		if (isprimitive("CatalogsProductGroupMultipleStringCriteria")) {
			jsonToValue(&hOTEL_ID, node, "CatalogsProductGroupMultipleStringCriteria", "CatalogsProductGroupMultipleStringCriteria");
		} else {
			
			CatalogsProductGroupMultipleStringCriteria* obj = static_cast<CatalogsProductGroupMultipleStringCriteria*> (&hOTEL_ID);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *bRANDKey = "BRAND";
	node = json_object_get_member(pJsonObject, bRANDKey);
	if (node !=NULL) {
	

		if (isprimitive("CatalogsProductGroupMultipleStringCriteria")) {
			jsonToValue(&bRAND, node, "CatalogsProductGroupMultipleStringCriteria", "CatalogsProductGroupMultipleStringCriteria");
		} else {
			
			CatalogsProductGroupMultipleStringCriteria* obj = static_cast<CatalogsProductGroupMultipleStringCriteria*> (&bRAND);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *cUSTOM_LABEL_0Key = "CUSTOM_LABEL_0";
	node = json_object_get_member(pJsonObject, cUSTOM_LABEL_0Key);
	if (node !=NULL) {
	

		if (isprimitive("CatalogsProductGroupMultipleStringCriteria")) {
			jsonToValue(&cUSTOM_LABEL_0, node, "CatalogsProductGroupMultipleStringCriteria", "CatalogsProductGroupMultipleStringCriteria");
		} else {
			
			CatalogsProductGroupMultipleStringCriteria* obj = static_cast<CatalogsProductGroupMultipleStringCriteria*> (&cUSTOM_LABEL_0);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *cUSTOM_LABEL_1Key = "CUSTOM_LABEL_1";
	node = json_object_get_member(pJsonObject, cUSTOM_LABEL_1Key);
	if (node !=NULL) {
	

		if (isprimitive("CatalogsProductGroupMultipleStringCriteria")) {
			jsonToValue(&cUSTOM_LABEL_1, node, "CatalogsProductGroupMultipleStringCriteria", "CatalogsProductGroupMultipleStringCriteria");
		} else {
			
			CatalogsProductGroupMultipleStringCriteria* obj = static_cast<CatalogsProductGroupMultipleStringCriteria*> (&cUSTOM_LABEL_1);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *cUSTOM_LABEL_2Key = "CUSTOM_LABEL_2";
	node = json_object_get_member(pJsonObject, cUSTOM_LABEL_2Key);
	if (node !=NULL) {
	

		if (isprimitive("CatalogsProductGroupMultipleStringCriteria")) {
			jsonToValue(&cUSTOM_LABEL_2, node, "CatalogsProductGroupMultipleStringCriteria", "CatalogsProductGroupMultipleStringCriteria");
		} else {
			
			CatalogsProductGroupMultipleStringCriteria* obj = static_cast<CatalogsProductGroupMultipleStringCriteria*> (&cUSTOM_LABEL_2);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *cUSTOM_LABEL_3Key = "CUSTOM_LABEL_3";
	node = json_object_get_member(pJsonObject, cUSTOM_LABEL_3Key);
	if (node !=NULL) {
	

		if (isprimitive("CatalogsProductGroupMultipleStringCriteria")) {
			jsonToValue(&cUSTOM_LABEL_3, node, "CatalogsProductGroupMultipleStringCriteria", "CatalogsProductGroupMultipleStringCriteria");
		} else {
			
			CatalogsProductGroupMultipleStringCriteria* obj = static_cast<CatalogsProductGroupMultipleStringCriteria*> (&cUSTOM_LABEL_3);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *cUSTOM_LABEL_4Key = "CUSTOM_LABEL_4";
	node = json_object_get_member(pJsonObject, cUSTOM_LABEL_4Key);
	if (node !=NULL) {
	

		if (isprimitive("CatalogsProductGroupMultipleStringCriteria")) {
			jsonToValue(&cUSTOM_LABEL_4, node, "CatalogsProductGroupMultipleStringCriteria", "CatalogsProductGroupMultipleStringCriteria");
		} else {
			
			CatalogsProductGroupMultipleStringCriteria* obj = static_cast<CatalogsProductGroupMultipleStringCriteria*> (&cUSTOM_LABEL_4);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *cOUNTRYKey = "COUNTRY";
	node = json_object_get_member(pJsonObject, cOUNTRYKey);
	if (node !=NULL) {
	

		if (isprimitive("CatalogsProductGroupMultipleCountriesCriteria")) {
			jsonToValue(&cOUNTRY, node, "CatalogsProductGroupMultipleCountriesCriteria", "CatalogsProductGroupMultipleCountriesCriteria");
		} else {
			
			CatalogsProductGroupMultipleCountriesCriteria* obj = static_cast<CatalogsProductGroupMultipleCountriesCriteria*> (&cOUNTRY);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

CatalogsHotelProductGroupFilterKeys::CatalogsHotelProductGroupFilterKeys(char* json)
{
	this->fromJson(json);
}

char*
CatalogsHotelProductGroupFilterKeys::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("Catalogs_product_group_pricing_currency_criteria")) {
		Catalogs_product_group_pricing_currency_criteria obj = getPRICE();
		node = converttoJson(&obj, "Catalogs_product_group_pricing_currency_criteria", "");
	}
	else {
		
		Catalogs_product_group_pricing_currency_criteria obj = static_cast<Catalogs_product_group_pricing_currency_criteria> (getPRICE());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *pRICEKey = "PRICE";
	json_object_set_member(pJsonObject, pRICEKey, node);
	if (isprimitive("CatalogsProductGroupMultipleStringCriteria")) {
		CatalogsProductGroupMultipleStringCriteria obj = getHOTELID();
		node = converttoJson(&obj, "CatalogsProductGroupMultipleStringCriteria", "");
	}
	else {
		
		CatalogsProductGroupMultipleStringCriteria obj = static_cast<CatalogsProductGroupMultipleStringCriteria> (getHOTELID());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *hOTEL_IDKey = "HOTEL_ID";
	json_object_set_member(pJsonObject, hOTEL_IDKey, node);
	if (isprimitive("CatalogsProductGroupMultipleStringCriteria")) {
		CatalogsProductGroupMultipleStringCriteria obj = getBRAND();
		node = converttoJson(&obj, "CatalogsProductGroupMultipleStringCriteria", "");
	}
	else {
		
		CatalogsProductGroupMultipleStringCriteria obj = static_cast<CatalogsProductGroupMultipleStringCriteria> (getBRAND());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *bRANDKey = "BRAND";
	json_object_set_member(pJsonObject, bRANDKey, node);
	if (isprimitive("CatalogsProductGroupMultipleStringCriteria")) {
		CatalogsProductGroupMultipleStringCriteria obj = getCUSTOMLABEL0();
		node = converttoJson(&obj, "CatalogsProductGroupMultipleStringCriteria", "");
	}
	else {
		
		CatalogsProductGroupMultipleStringCriteria obj = static_cast<CatalogsProductGroupMultipleStringCriteria> (getCUSTOMLABEL0());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cUSTOM_LABEL_0Key = "CUSTOM_LABEL_0";
	json_object_set_member(pJsonObject, cUSTOM_LABEL_0Key, node);
	if (isprimitive("CatalogsProductGroupMultipleStringCriteria")) {
		CatalogsProductGroupMultipleStringCriteria obj = getCUSTOMLABEL1();
		node = converttoJson(&obj, "CatalogsProductGroupMultipleStringCriteria", "");
	}
	else {
		
		CatalogsProductGroupMultipleStringCriteria obj = static_cast<CatalogsProductGroupMultipleStringCriteria> (getCUSTOMLABEL1());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cUSTOM_LABEL_1Key = "CUSTOM_LABEL_1";
	json_object_set_member(pJsonObject, cUSTOM_LABEL_1Key, node);
	if (isprimitive("CatalogsProductGroupMultipleStringCriteria")) {
		CatalogsProductGroupMultipleStringCriteria obj = getCUSTOMLABEL2();
		node = converttoJson(&obj, "CatalogsProductGroupMultipleStringCriteria", "");
	}
	else {
		
		CatalogsProductGroupMultipleStringCriteria obj = static_cast<CatalogsProductGroupMultipleStringCriteria> (getCUSTOMLABEL2());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cUSTOM_LABEL_2Key = "CUSTOM_LABEL_2";
	json_object_set_member(pJsonObject, cUSTOM_LABEL_2Key, node);
	if (isprimitive("CatalogsProductGroupMultipleStringCriteria")) {
		CatalogsProductGroupMultipleStringCriteria obj = getCUSTOMLABEL3();
		node = converttoJson(&obj, "CatalogsProductGroupMultipleStringCriteria", "");
	}
	else {
		
		CatalogsProductGroupMultipleStringCriteria obj = static_cast<CatalogsProductGroupMultipleStringCriteria> (getCUSTOMLABEL3());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cUSTOM_LABEL_3Key = "CUSTOM_LABEL_3";
	json_object_set_member(pJsonObject, cUSTOM_LABEL_3Key, node);
	if (isprimitive("CatalogsProductGroupMultipleStringCriteria")) {
		CatalogsProductGroupMultipleStringCriteria obj = getCUSTOMLABEL4();
		node = converttoJson(&obj, "CatalogsProductGroupMultipleStringCriteria", "");
	}
	else {
		
		CatalogsProductGroupMultipleStringCriteria obj = static_cast<CatalogsProductGroupMultipleStringCriteria> (getCUSTOMLABEL4());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cUSTOM_LABEL_4Key = "CUSTOM_LABEL_4";
	json_object_set_member(pJsonObject, cUSTOM_LABEL_4Key, node);
	if (isprimitive("CatalogsProductGroupMultipleCountriesCriteria")) {
		CatalogsProductGroupMultipleCountriesCriteria obj = getCOUNTRY();
		node = converttoJson(&obj, "CatalogsProductGroupMultipleCountriesCriteria", "");
	}
	else {
		
		CatalogsProductGroupMultipleCountriesCriteria obj = static_cast<CatalogsProductGroupMultipleCountriesCriteria> (getCOUNTRY());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cOUNTRYKey = "COUNTRY";
	json_object_set_member(pJsonObject, cOUNTRYKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

Catalogs_product_group_pricing_currency_criteria
CatalogsHotelProductGroupFilterKeys::getPRICE()
{
	return pRICE;
}

void
CatalogsHotelProductGroupFilterKeys::setPRICE(Catalogs_product_group_pricing_currency_criteria  pRICE)
{
	this->pRICE = pRICE;
}

CatalogsProductGroupMultipleStringCriteria
CatalogsHotelProductGroupFilterKeys::getHOTELID()
{
	return hOTEL_ID;
}

void
CatalogsHotelProductGroupFilterKeys::setHOTELID(CatalogsProductGroupMultipleStringCriteria  hOTEL_ID)
{
	this->hOTEL_ID = hOTEL_ID;
}

CatalogsProductGroupMultipleStringCriteria
CatalogsHotelProductGroupFilterKeys::getBRAND()
{
	return bRAND;
}

void
CatalogsHotelProductGroupFilterKeys::setBRAND(CatalogsProductGroupMultipleStringCriteria  bRAND)
{
	this->bRAND = bRAND;
}

CatalogsProductGroupMultipleStringCriteria
CatalogsHotelProductGroupFilterKeys::getCUSTOMLABEL0()
{
	return cUSTOM_LABEL_0;
}

void
CatalogsHotelProductGroupFilterKeys::setCUSTOMLABEL0(CatalogsProductGroupMultipleStringCriteria  cUSTOM_LABEL_0)
{
	this->cUSTOM_LABEL_0 = cUSTOM_LABEL_0;
}

CatalogsProductGroupMultipleStringCriteria
CatalogsHotelProductGroupFilterKeys::getCUSTOMLABEL1()
{
	return cUSTOM_LABEL_1;
}

void
CatalogsHotelProductGroupFilterKeys::setCUSTOMLABEL1(CatalogsProductGroupMultipleStringCriteria  cUSTOM_LABEL_1)
{
	this->cUSTOM_LABEL_1 = cUSTOM_LABEL_1;
}

CatalogsProductGroupMultipleStringCriteria
CatalogsHotelProductGroupFilterKeys::getCUSTOMLABEL2()
{
	return cUSTOM_LABEL_2;
}

void
CatalogsHotelProductGroupFilterKeys::setCUSTOMLABEL2(CatalogsProductGroupMultipleStringCriteria  cUSTOM_LABEL_2)
{
	this->cUSTOM_LABEL_2 = cUSTOM_LABEL_2;
}

CatalogsProductGroupMultipleStringCriteria
CatalogsHotelProductGroupFilterKeys::getCUSTOMLABEL3()
{
	return cUSTOM_LABEL_3;
}

void
CatalogsHotelProductGroupFilterKeys::setCUSTOMLABEL3(CatalogsProductGroupMultipleStringCriteria  cUSTOM_LABEL_3)
{
	this->cUSTOM_LABEL_3 = cUSTOM_LABEL_3;
}

CatalogsProductGroupMultipleStringCriteria
CatalogsHotelProductGroupFilterKeys::getCUSTOMLABEL4()
{
	return cUSTOM_LABEL_4;
}

void
CatalogsHotelProductGroupFilterKeys::setCUSTOMLABEL4(CatalogsProductGroupMultipleStringCriteria  cUSTOM_LABEL_4)
{
	this->cUSTOM_LABEL_4 = cUSTOM_LABEL_4;
}

CatalogsProductGroupMultipleCountriesCriteria
CatalogsHotelProductGroupFilterKeys::getCOUNTRY()
{
	return cOUNTRY;
}

void
CatalogsHotelProductGroupFilterKeys::setCOUNTRY(CatalogsProductGroupMultipleCountriesCriteria  cOUNTRY)
{
	this->cOUNTRY = cOUNTRY;
}


