

#include "SSIOAccount.h"

using namespace Tiny;

SSIOAccount::SSIOAccount()
{
	billto_infos = std::list<SSIOAccountItem>();
	can_edit = bool(false);
	currency = std::string();
	eligible = bool(false);
	error = std::string();
	pmp_names = std::list<SSIOAccountPMPName>();
}

SSIOAccount::SSIOAccount(std::string jsonString)
{
	this->fromJson(jsonString);
}

SSIOAccount::~SSIOAccount()
{

}

void
SSIOAccount::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *billto_infosKey = "billto_infos";

    if(object.has_key(billto_infosKey))
    {
        bourne::json value = object[billto_infosKey];


        std::list<SSIOAccountItem> billto_infos_list;
        SSIOAccountItem element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            billto_infos_list.push_back(element);
        }
        billto_infos = billto_infos_list;


    }

    const char *can_editKey = "can_edit";

    if(object.has_key(can_editKey))
    {
        bourne::json value = object[can_editKey];



        jsonToValue(&can_edit, value, "bool");


    }

    const char *currencyKey = "currency";

    if(object.has_key(currencyKey))
    {
        bourne::json value = object[currencyKey];



        jsonToValue(&currency, value, "std::string");


    }

    const char *eligibleKey = "eligible";

    if(object.has_key(eligibleKey))
    {
        bourne::json value = object[eligibleKey];



        jsonToValue(&eligible, value, "bool");


    }

    const char *errorKey = "error";

    if(object.has_key(errorKey))
    {
        bourne::json value = object[errorKey];



        jsonToValue(&error, value, "std::string");


    }

    const char *pmp_namesKey = "pmp_names";

    if(object.has_key(pmp_namesKey))
    {
        bourne::json value = object[pmp_namesKey];


        std::list<SSIOAccountPMPName> pmp_names_list;
        SSIOAccountPMPName element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            pmp_names_list.push_back(element);
        }
        pmp_names = pmp_names_list;


    }


}

bourne::json
SSIOAccount::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<SSIOAccountItem> billto_infos_list = getBilltoInfos();
    bourne::json billto_infos_arr = bourne::json::array();

    for(auto& var : billto_infos_list)
    {
        SSIOAccountItem obj = var;
        billto_infos_arr.append(obj.toJson());
    }
    object["billto_infos"] = billto_infos_arr;







    object["can_edit"] = isCanEdit();






    object["currency"] = getCurrency();






    object["eligible"] = isEligible();






    object["error"] = getError();





    std::list<SSIOAccountPMPName> pmp_names_list = getPmpNames();
    bourne::json pmp_names_arr = bourne::json::array();

    for(auto& var : pmp_names_list)
    {
        SSIOAccountPMPName obj = var;
        pmp_names_arr.append(obj.toJson());
    }
    object["pmp_names"] = pmp_names_arr;




    return object;

}

std::list<SSIOAccountItem>
SSIOAccount::getBilltoInfos()
{
	return billto_infos;
}

void
SSIOAccount::setBilltoInfos(std::list<SSIOAccountItem> billto_infos)
{
	this->billto_infos = billto_infos;
}

bool
SSIOAccount::isCanEdit()
{
	return can_edit;
}

void
SSIOAccount::setCanEdit(bool can_edit)
{
	this->can_edit = can_edit;
}

std::string
SSIOAccount::getCurrency()
{
	return currency;
}

void
SSIOAccount::setCurrency(std::string currency)
{
	this->currency = currency;
}

bool
SSIOAccount::isEligible()
{
	return eligible;
}

void
SSIOAccount::setEligible(bool eligible)
{
	this->eligible = eligible;
}

std::string
SSIOAccount::getError()
{
	return error;
}

void
SSIOAccount::setError(std::string error)
{
	this->error = error;
}

std::list<SSIOAccountPMPName>
SSIOAccount::getPmpNames()
{
	return pmp_names;
}

void
SSIOAccount::setPmpNames(std::list<SSIOAccountPMPName> pmp_names)
{
	this->pmp_names = pmp_names;
}



