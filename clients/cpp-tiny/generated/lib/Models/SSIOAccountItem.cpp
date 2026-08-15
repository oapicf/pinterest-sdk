

#include "SSIOAccountItem.h"

using namespace Tiny;

SSIOAccountItem::SSIOAccountItem()
{
	addresses = std::list<SSIOAccountAddress>();
	id = std::string();
	io_terms = std::string();
	io_terms_id = std::string();
	io_type = std::string();
	row_terms = std::string();
	row_terms_id = std::string();
	us_terms = std::string();
	us_terms_id = std::string();
}

SSIOAccountItem::SSIOAccountItem(std::string jsonString)
{
	this->fromJson(jsonString);
}

SSIOAccountItem::~SSIOAccountItem()
{

}

void
SSIOAccountItem::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *addressesKey = "addresses";

    if(object.has_key(addressesKey))
    {
        bourne::json value = object[addressesKey];


        std::list<SSIOAccountAddress> addresses_list;
        SSIOAccountAddress element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            addresses_list.push_back(element);
        }
        addresses = addresses_list;


    }

    const char *idKey = "id";

    if(object.has_key(idKey))
    {
        bourne::json value = object[idKey];



        jsonToValue(&id, value, "std::string");


    }

    const char *io_termsKey = "io_terms";

    if(object.has_key(io_termsKey))
    {
        bourne::json value = object[io_termsKey];



        jsonToValue(&io_terms, value, "std::string");


    }

    const char *io_terms_idKey = "io_terms_id";

    if(object.has_key(io_terms_idKey))
    {
        bourne::json value = object[io_terms_idKey];



        jsonToValue(&io_terms_id, value, "std::string");


    }

    const char *io_typeKey = "io_type";

    if(object.has_key(io_typeKey))
    {
        bourne::json value = object[io_typeKey];



        jsonToValue(&io_type, value, "std::string");


    }

    const char *row_termsKey = "row_terms";

    if(object.has_key(row_termsKey))
    {
        bourne::json value = object[row_termsKey];



        jsonToValue(&row_terms, value, "std::string");


    }

    const char *row_terms_idKey = "row_terms_id";

    if(object.has_key(row_terms_idKey))
    {
        bourne::json value = object[row_terms_idKey];



        jsonToValue(&row_terms_id, value, "std::string");


    }

    const char *us_termsKey = "us_terms";

    if(object.has_key(us_termsKey))
    {
        bourne::json value = object[us_termsKey];



        jsonToValue(&us_terms, value, "std::string");


    }

    const char *us_terms_idKey = "us_terms_id";

    if(object.has_key(us_terms_idKey))
    {
        bourne::json value = object[us_terms_idKey];



        jsonToValue(&us_terms_id, value, "std::string");


    }


}

bourne::json
SSIOAccountItem::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<SSIOAccountAddress> addresses_list = getAddresses();
    bourne::json addresses_arr = bourne::json::array();

    for(auto& var : addresses_list)
    {
        SSIOAccountAddress obj = var;
        addresses_arr.append(obj.toJson());
    }
    object["addresses"] = addresses_arr;







    object["id"] = getId();






    object["io_terms"] = getIoTerms();






    object["io_terms_id"] = getIoTermsId();






    object["io_type"] = getIoType();






    object["row_terms"] = getRowTerms();






    object["row_terms_id"] = getRowTermsId();






    object["us_terms"] = getUsTerms();






    object["us_terms_id"] = getUsTermsId();



    return object;

}

std::list<SSIOAccountAddress>
SSIOAccountItem::getAddresses()
{
	return addresses;
}

void
SSIOAccountItem::setAddresses(std::list <SSIOAccountAddress> addresses)
{
	this->addresses = addresses;
}

std::string
SSIOAccountItem::getId()
{
	return id;
}

void
SSIOAccountItem::setId(std::string  id)
{
	this->id = id;
}

std::string
SSIOAccountItem::getIoTerms()
{
	return io_terms;
}

void
SSIOAccountItem::setIoTerms(std::string  io_terms)
{
	this->io_terms = io_terms;
}

std::string
SSIOAccountItem::getIoTermsId()
{
	return io_terms_id;
}

void
SSIOAccountItem::setIoTermsId(std::string  io_terms_id)
{
	this->io_terms_id = io_terms_id;
}

std::string
SSIOAccountItem::getIoType()
{
	return io_type;
}

void
SSIOAccountItem::setIoType(std::string  io_type)
{
	this->io_type = io_type;
}

std::string
SSIOAccountItem::getRowTerms()
{
	return row_terms;
}

void
SSIOAccountItem::setRowTerms(std::string  row_terms)
{
	this->row_terms = row_terms;
}

std::string
SSIOAccountItem::getRowTermsId()
{
	return row_terms_id;
}

void
SSIOAccountItem::setRowTermsId(std::string  row_terms_id)
{
	this->row_terms_id = row_terms_id;
}

std::string
SSIOAccountItem::getUsTerms()
{
	return us_terms;
}

void
SSIOAccountItem::setUsTerms(std::string  us_terms)
{
	this->us_terms = us_terms;
}

std::string
SSIOAccountItem::getUsTermsId()
{
	return us_terms_id;
}

void
SSIOAccountItem::setUsTermsId(std::string  us_terms_id)
{
	this->us_terms_id = us_terms_id;
}



