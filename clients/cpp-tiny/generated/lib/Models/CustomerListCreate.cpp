

#include "CustomerListCreate.h"

using namespace Tiny;

CustomerListCreate::CustomerListCreate()
{
	is_nca = bool(false);
	list_type = null;
	name = std::string();
	records = std::string();
	records_v2 = std::list<CustomerListRecordRow>();
}

CustomerListCreate::CustomerListCreate(std::string jsonString)
{
	this->fromJson(jsonString);
}

CustomerListCreate::~CustomerListCreate()
{

}

void
CustomerListCreate::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *is_ncaKey = "is_nca";

    if(object.has_key(is_ncaKey))
    {
        bourne::json value = object[is_ncaKey];



        jsonToValue(&is_nca, value, "bool");


    }

    const char *list_typeKey = "list_type";

    if(object.has_key(list_typeKey))
    {
        bourne::json value = object[list_typeKey];




        UserListType* obj = &list_type;
		obj->fromJson(value.dump());

    }

    const char *nameKey = "name";

    if(object.has_key(nameKey))
    {
        bourne::json value = object[nameKey];



        jsonToValue(&name, value, "std::string");


    }

    const char *recordsKey = "records";

    if(object.has_key(recordsKey))
    {
        bourne::json value = object[recordsKey];



        jsonToValue(&records, value, "std::string");


    }

    const char *records_v2Key = "records_v2";

    if(object.has_key(records_v2Key))
    {
        bourne::json value = object[records_v2Key];


        std::list<CustomerListRecordRow> records_v2_list;
        CustomerListRecordRow element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            records_v2_list.push_back(element);
        }
        records_v2 = records_v2_list;


    }


}

bourne::json
CustomerListCreate::toJson()
{
    bourne::json object = bourne::json::object();





    object["is_nca"] = isIsNca();







	object["list_type"] = getListType().toJson();





    object["name"] = getName();






    object["records"] = getRecords();





    std::list<CustomerListRecordRow> records_v2_list = getRecordsV2();
    bourne::json records_v2_arr = bourne::json::array();

    for(auto& var : records_v2_list)
    {
        CustomerListRecordRow obj = var;
        records_v2_arr.append(obj.toJson());
    }
    object["records_v2"] = records_v2_arr;




    return object;

}

bool
CustomerListCreate::isIsNca()
{
	return is_nca;
}

void
CustomerListCreate::setIsNca(bool is_nca)
{
	this->is_nca = is_nca;
}

UserListType
CustomerListCreate::getListType()
{
	return list_type;
}

void
CustomerListCreate::setListType(UserListType list_type)
{
	this->list_type = list_type;
}

std::string
CustomerListCreate::getName()
{
	return name;
}

void
CustomerListCreate::setName(std::string name)
{
	this->name = name;
}

std::string
CustomerListCreate::getRecords()
{
	return records;
}

void
CustomerListCreate::setRecords(std::string records)
{
	this->records = records;
}

std::list<CustomerListRecordRow>
CustomerListCreate::getRecordsV2()
{
	return records_v2;
}

void
CustomerListCreate::setRecordsV2(std::list<CustomerListRecordRow> records_v2)
{
	this->records_v2 = records_v2;
}



