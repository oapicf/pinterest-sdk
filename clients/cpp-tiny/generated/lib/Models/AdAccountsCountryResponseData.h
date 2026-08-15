
/*
 * AdAccountsCountryResponseData.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_AdAccountsCountryResponseData_H_
#define TINY_CPP_CLIENT_AdAccountsCountryResponseData_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "AdCountry.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class AdAccountsCountryResponseData{
public:

    /*! \brief Constructor.
	 */
    AdAccountsCountryResponseData();
    AdAccountsCountryResponseData(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AdAccountsCountryResponseData();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	AdCountry getCode();

	/*! \brief Set 
	 */
	void setCode(AdCountry  code);
	/*! \brief Get Country currency.
	 */
	std::string getCurrency();

	/*! \brief Set Country currency.
	 */
	void setCurrency(std::string  currency);
	/*! \brief Get Country index
	 */
	long getIndex();

	/*! \brief Set Country index
	 */
	void setIndex(long  index);
	/*! \brief Get Country name
	 */
	std::string getName();

	/*! \brief Set Country name
	 */
	void setName(std::string  name);


    private:
    AdCountry code;
    std::string currency{};
    long index{};
    std::string name{};
};
}

#endif /* TINY_CPP_CLIENT_AdAccountsCountryResponseData_H_ */
