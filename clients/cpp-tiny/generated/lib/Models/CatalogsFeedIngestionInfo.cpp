

#include "CatalogsFeedIngestionInfo.h"

using namespace Tiny;

CatalogsFeedIngestionInfo::CatalogsFeedIngestionInfo()
{
	iN_STOCK = int(0);
	oUT_OF_STOCK = int(0);
	pREORDER = int(0);
}

CatalogsFeedIngestionInfo::CatalogsFeedIngestionInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

CatalogsFeedIngestionInfo::~CatalogsFeedIngestionInfo()
{

}

void
CatalogsFeedIngestionInfo::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *iN_STOCKKey = "IN_STOCK";

    if(object.has_key(iN_STOCKKey))
    {
        bourne::json value = object[iN_STOCKKey];



        jsonToValue(&iN_STOCK, value, "int");


    }

    const char *oUT_OF_STOCKKey = "OUT_OF_STOCK";

    if(object.has_key(oUT_OF_STOCKKey))
    {
        bourne::json value = object[oUT_OF_STOCKKey];



        jsonToValue(&oUT_OF_STOCK, value, "int");


    }

    const char *pREORDERKey = "PREORDER";

    if(object.has_key(pREORDERKey))
    {
        bourne::json value = object[pREORDERKey];



        jsonToValue(&pREORDER, value, "int");


    }


}

bourne::json
CatalogsFeedIngestionInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["iN_STOCK"] = getINSTOCK();






    object["oUT_OF_STOCK"] = getOUTOFSTOCK();






    object["pREORDER"] = getPREORDER();



    return object;

}

int
CatalogsFeedIngestionInfo::getINSTOCK()
{
	return iN_STOCK;
}

void
CatalogsFeedIngestionInfo::setINSTOCK(int  iN_STOCK)
{
	this->iN_STOCK = iN_STOCK;
}

int
CatalogsFeedIngestionInfo::getOUTOFSTOCK()
{
	return oUT_OF_STOCK;
}

void
CatalogsFeedIngestionInfo::setOUTOFSTOCK(int  oUT_OF_STOCK)
{
	this->oUT_OF_STOCK = oUT_OF_STOCK;
}

int
CatalogsFeedIngestionInfo::getPREORDER()
{
	return pREORDER;
}

void
CatalogsFeedIngestionInfo::setPREORDER(int  pREORDER)
{
	this->pREORDER = pREORDER;
}



