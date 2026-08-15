
/*
 * AdAccountsCountryResponse.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_AdAccountsCountryResponse_H_
#define TINY_CPP_CLIENT_AdAccountsCountryResponse_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "AdAccountsCountryResponseData.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class AdAccountsCountryResponse{
public:

    /*! \brief Constructor.
	 */
    AdAccountsCountryResponse();
    AdAccountsCountryResponse(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AdAccountsCountryResponse();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::list<AdAccountsCountryResponseData> getItems();

	/*! \brief Set 
	 */
	void setItems(std::list <AdAccountsCountryResponseData> items);


    private:
    std::list<AdAccountsCountryResponseData> items;
};
}

#endif /* TINY_CPP_CLIENT_AdAccountsCountryResponse_H_ */
