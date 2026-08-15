

#include "ProductCategoryDetailLookbackWindow.h"

using namespace Tiny;

ProductCategoryDetailLookbackWindow::ProductCategoryDetailLookbackWindow()
{
}

ProductCategoryDetailLookbackWindow::ProductCategoryDetailLookbackWindow(std::string jsonString)
{
	this->fromJson(jsonString);
}

ProductCategoryDetailLookbackWindow::~ProductCategoryDetailLookbackWindow()
{

}

void
ProductCategoryDetailLookbackWindow::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
ProductCategoryDetailLookbackWindow::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



