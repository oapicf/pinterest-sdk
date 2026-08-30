

#include "FreqBidMultiplierTimeWindow.h"

using namespace Tiny;

FreqBidMultiplierTimeWindow::FreqBidMultiplierTimeWindow()
{
}

FreqBidMultiplierTimeWindow::FreqBidMultiplierTimeWindow(std::string jsonString)
{
	this->fromJson(jsonString);
}

FreqBidMultiplierTimeWindow::~FreqBidMultiplierTimeWindow()
{

}

void
FreqBidMultiplierTimeWindow::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
FreqBidMultiplierTimeWindow::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



