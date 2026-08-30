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
	//pRICE = new PriceFilterPrice();
	//hOTEL_ID = new CatalogsProductGroupMultipleStringCriteria();
	//bRAND = new CatalogsProductGroupMultipleStringCriteria();
	//cUSTOM_LABEL_0 = new CatalogsProductGroupFilterOperatorTypeCriteria();
	//cUSTOM_LABEL_1 = new CatalogsProductGroupFilterOperatorTypeCriteria();
	//cUSTOM_LABEL_2 = new CatalogsProductGroupFilterOperatorTypeCriteria();
	//cUSTOM_LABEL_3 = new CatalogsProductGroupFilterOperatorTypeCriteria();
	//cUSTOM_LABEL_4 = new CatalogsProductGroupFilterOperatorTypeCriteria();
	//cOUNTRY = new CatalogsProductGroupMultipleCountriesCriteria();
	//tITLE_KEYWORDS = new CatalogsProductGroupMultipleStringCriteria();
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
	//if(tITLE_KEYWORDS != NULL) {
	//
	//delete tITLE_KEYWORDS;
	//tITLE_KEYWORDS = NULL;
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
	

		if (isprimitive("PriceFilterPrice")) {
			jsonToValue(&pRICE, node, "PriceFilterPrice", "PriceFilterPrice");
		} else {
			
			PriceFilterPrice* obj = static_cast<PriceFilterPrice*> (&pRICE);
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
	

		if (isprimitive("CatalogsProductGroupFilterOperatorTypeCriteria")) {
			jsonToValue(&cUSTOM_LABEL_0, node, "CatalogsProductGroupFilterOperatorTypeCriteria", "CatalogsProductGroupFilterOperatorTypeCriteria");
		} else {
			
			CatalogsProductGroupFilterOperatorTypeCriteria* obj = static_cast<CatalogsProductGroupFilterOperatorTypeCriteria*> (&cUSTOM_LABEL_0);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *cUSTOM_LABEL_1Key = "CUSTOM_LABEL_1";
	node = json_object_get_member(pJsonObject, cUSTOM_LABEL_1Key);
	if (node !=NULL) {
	

		if (isprimitive("CatalogsProductGroupFilterOperatorTypeCriteria")) {
			jsonToValue(&cUSTOM_LABEL_1, node, "CatalogsProductGroupFilterOperatorTypeCriteria", "CatalogsProductGroupFilterOperatorTypeCriteria");
		} else {
			
			CatalogsProductGroupFilterOperatorTypeCriteria* obj = static_cast<CatalogsProductGroupFilterOperatorTypeCriteria*> (&cUSTOM_LABEL_1);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *cUSTOM_LABEL_2Key = "CUSTOM_LABEL_2";
	node = json_object_get_member(pJsonObject, cUSTOM_LABEL_2Key);
	if (node !=NULL) {
	

		if (isprimitive("CatalogsProductGroupFilterOperatorTypeCriteria")) {
			jsonToValue(&cUSTOM_LABEL_2, node, "CatalogsProductGroupFilterOperatorTypeCriteria", "CatalogsProductGroupFilterOperatorTypeCriteria");
		} else {
			
			CatalogsProductGroupFilterOperatorTypeCriteria* obj = static_cast<CatalogsProductGroupFilterOperatorTypeCriteria*> (&cUSTOM_LABEL_2);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *cUSTOM_LABEL_3Key = "CUSTOM_LABEL_3";
	node = json_object_get_member(pJsonObject, cUSTOM_LABEL_3Key);
	if (node !=NULL) {
	

		if (isprimitive("CatalogsProductGroupFilterOperatorTypeCriteria")) {
			jsonToValue(&cUSTOM_LABEL_3, node, "CatalogsProductGroupFilterOperatorTypeCriteria", "CatalogsProductGroupFilterOperatorTypeCriteria");
		} else {
			
			CatalogsProductGroupFilterOperatorTypeCriteria* obj = static_cast<CatalogsProductGroupFilterOperatorTypeCriteria*> (&cUSTOM_LABEL_3);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *cUSTOM_LABEL_4Key = "CUSTOM_LABEL_4";
	node = json_object_get_member(pJsonObject, cUSTOM_LABEL_4Key);
	if (node !=NULL) {
	

		if (isprimitive("CatalogsProductGroupFilterOperatorTypeCriteria")) {
			jsonToValue(&cUSTOM_LABEL_4, node, "CatalogsProductGroupFilterOperatorTypeCriteria", "CatalogsProductGroupFilterOperatorTypeCriteria");
		} else {
			
			CatalogsProductGroupFilterOperatorTypeCriteria* obj = static_cast<CatalogsProductGroupFilterOperatorTypeCriteria*> (&cUSTOM_LABEL_4);
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
	const gchar *tITLE_KEYWORDSKey = "TITLE_KEYWORDS";
	node = json_object_get_member(pJsonObject, tITLE_KEYWORDSKey);
	if (node !=NULL) {
	

		if (isprimitive("CatalogsProductGroupMultipleStringCriteria")) {
			jsonToValue(&tITLE_KEYWORDS, node, "CatalogsProductGroupMultipleStringCriteria", "CatalogsProductGroupMultipleStringCriteria");
		} else {
			
			CatalogsProductGroupMultipleStringCriteria* obj = static_cast<CatalogsProductGroupMultipleStringCriteria*> (&tITLE_KEYWORDS);
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
	if (isprimitive("PriceFilterPrice")) {
		PriceFilterPrice obj = getPRICE();
		node = converttoJson(&obj, "PriceFilterPrice", "");
	}
	else {
		
		PriceFilterPrice obj = static_cast<PriceFilterPrice> (getPRICE());
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
	if (isprimitive("CatalogsProductGroupFilterOperatorTypeCriteria")) {
		CatalogsProductGroupFilterOperatorTypeCriteria obj = getCUSTOMLABEL0();
		node = converttoJson(&obj, "CatalogsProductGroupFilterOperatorTypeCriteria", "");
	}
	else {
		
		CatalogsProductGroupFilterOperatorTypeCriteria obj = static_cast<CatalogsProductGroupFilterOperatorTypeCriteria> (getCUSTOMLABEL0());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cUSTOM_LABEL_0Key = "CUSTOM_LABEL_0";
	json_object_set_member(pJsonObject, cUSTOM_LABEL_0Key, node);
	if (isprimitive("CatalogsProductGroupFilterOperatorTypeCriteria")) {
		CatalogsProductGroupFilterOperatorTypeCriteria obj = getCUSTOMLABEL1();
		node = converttoJson(&obj, "CatalogsProductGroupFilterOperatorTypeCriteria", "");
	}
	else {
		
		CatalogsProductGroupFilterOperatorTypeCriteria obj = static_cast<CatalogsProductGroupFilterOperatorTypeCriteria> (getCUSTOMLABEL1());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cUSTOM_LABEL_1Key = "CUSTOM_LABEL_1";
	json_object_set_member(pJsonObject, cUSTOM_LABEL_1Key, node);
	if (isprimitive("CatalogsProductGroupFilterOperatorTypeCriteria")) {
		CatalogsProductGroupFilterOperatorTypeCriteria obj = getCUSTOMLABEL2();
		node = converttoJson(&obj, "CatalogsProductGroupFilterOperatorTypeCriteria", "");
	}
	else {
		
		CatalogsProductGroupFilterOperatorTypeCriteria obj = static_cast<CatalogsProductGroupFilterOperatorTypeCriteria> (getCUSTOMLABEL2());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cUSTOM_LABEL_2Key = "CUSTOM_LABEL_2";
	json_object_set_member(pJsonObject, cUSTOM_LABEL_2Key, node);
	if (isprimitive("CatalogsProductGroupFilterOperatorTypeCriteria")) {
		CatalogsProductGroupFilterOperatorTypeCriteria obj = getCUSTOMLABEL3();
		node = converttoJson(&obj, "CatalogsProductGroupFilterOperatorTypeCriteria", "");
	}
	else {
		
		CatalogsProductGroupFilterOperatorTypeCriteria obj = static_cast<CatalogsProductGroupFilterOperatorTypeCriteria> (getCUSTOMLABEL3());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cUSTOM_LABEL_3Key = "CUSTOM_LABEL_3";
	json_object_set_member(pJsonObject, cUSTOM_LABEL_3Key, node);
	if (isprimitive("CatalogsProductGroupFilterOperatorTypeCriteria")) {
		CatalogsProductGroupFilterOperatorTypeCriteria obj = getCUSTOMLABEL4();
		node = converttoJson(&obj, "CatalogsProductGroupFilterOperatorTypeCriteria", "");
	}
	else {
		
		CatalogsProductGroupFilterOperatorTypeCriteria obj = static_cast<CatalogsProductGroupFilterOperatorTypeCriteria> (getCUSTOMLABEL4());
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
	if (isprimitive("CatalogsProductGroupMultipleStringCriteria")) {
		CatalogsProductGroupMultipleStringCriteria obj = getTITLEKEYWORDS();
		node = converttoJson(&obj, "CatalogsProductGroupMultipleStringCriteria", "");
	}
	else {
		
		CatalogsProductGroupMultipleStringCriteria obj = static_cast<CatalogsProductGroupMultipleStringCriteria> (getTITLEKEYWORDS());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *tITLE_KEYWORDSKey = "TITLE_KEYWORDS";
	json_object_set_member(pJsonObject, tITLE_KEYWORDSKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

PriceFilterPrice
CatalogsHotelProductGroupFilterKeys::getPRICE()
{
	return pRICE;
}

void
CatalogsHotelProductGroupFilterKeys::setPRICE(PriceFilterPrice  pRICE)
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

CatalogsProductGroupFilterOperatorTypeCriteria
CatalogsHotelProductGroupFilterKeys::getCUSTOMLABEL0()
{
	return cUSTOM_LABEL_0;
}

void
CatalogsHotelProductGroupFilterKeys::setCUSTOMLABEL0(CatalogsProductGroupFilterOperatorTypeCriteria  cUSTOM_LABEL_0)
{
	this->cUSTOM_LABEL_0 = cUSTOM_LABEL_0;
}

CatalogsProductGroupFilterOperatorTypeCriteria
CatalogsHotelProductGroupFilterKeys::getCUSTOMLABEL1()
{
	return cUSTOM_LABEL_1;
}

void
CatalogsHotelProductGroupFilterKeys::setCUSTOMLABEL1(CatalogsProductGroupFilterOperatorTypeCriteria  cUSTOM_LABEL_1)
{
	this->cUSTOM_LABEL_1 = cUSTOM_LABEL_1;
}

CatalogsProductGroupFilterOperatorTypeCriteria
CatalogsHotelProductGroupFilterKeys::getCUSTOMLABEL2()
{
	return cUSTOM_LABEL_2;
}

void
CatalogsHotelProductGroupFilterKeys::setCUSTOMLABEL2(CatalogsProductGroupFilterOperatorTypeCriteria  cUSTOM_LABEL_2)
{
	this->cUSTOM_LABEL_2 = cUSTOM_LABEL_2;
}

CatalogsProductGroupFilterOperatorTypeCriteria
CatalogsHotelProductGroupFilterKeys::getCUSTOMLABEL3()
{
	return cUSTOM_LABEL_3;
}

void
CatalogsHotelProductGroupFilterKeys::setCUSTOMLABEL3(CatalogsProductGroupFilterOperatorTypeCriteria  cUSTOM_LABEL_3)
{
	this->cUSTOM_LABEL_3 = cUSTOM_LABEL_3;
}

CatalogsProductGroupFilterOperatorTypeCriteria
CatalogsHotelProductGroupFilterKeys::getCUSTOMLABEL4()
{
	return cUSTOM_LABEL_4;
}

void
CatalogsHotelProductGroupFilterKeys::setCUSTOMLABEL4(CatalogsProductGroupFilterOperatorTypeCriteria  cUSTOM_LABEL_4)
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

CatalogsProductGroupMultipleStringCriteria
CatalogsHotelProductGroupFilterKeys::getTITLEKEYWORDS()
{
	return tITLE_KEYWORDS;
}

void
CatalogsHotelProductGroupFilterKeys::setTITLEKEYWORDS(CatalogsProductGroupMultipleStringCriteria  tITLE_KEYWORDS)
{
	this->tITLE_KEYWORDS = tITLE_KEYWORDS;
}


