

#include "LocalInventoryItemsBatchCreate.h"

using namespace Tiny;

LocalInventoryItemsBatchCreate::LocalInventoryItemsBatchCreate()
{
	operations = std::list<LocalInventoryOperation>();
}

LocalInventoryItemsBatchCreate::LocalInventoryItemsBatchCreate(std::string jsonString)
{
	this->fromJson(jsonString);
}

LocalInventoryItemsBatchCreate::~LocalInventoryItemsBatchCreate()
{

}

void
LocalInventoryItemsBatchCreate::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *operationsKey = "operations";

    if(object.has_key(operationsKey))
    {
        bourne::json value = object[operationsKey];


        std::list<LocalInventoryOperation> operations_list;
        LocalInventoryOperation element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            operations_list.push_back(element);
        }
        operations = operations_list;


    }


}

bourne::json
LocalInventoryItemsBatchCreate::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<LocalInventoryOperation> operations_list = getOperations();
    bourne::json operations_arr = bourne::json::array();

    for(auto& var : operations_list)
    {
        LocalInventoryOperation obj = var;
        operations_arr.append(obj.toJson());
    }
    object["operations"] = operations_arr;




    return object;

}

std::list<LocalInventoryOperation>
LocalInventoryItemsBatchCreate::getOperations()
{
	return operations;
}

void
LocalInventoryItemsBatchCreate::setOperations(std::list<LocalInventoryOperation> operations)
{
	this->operations = operations;
}



