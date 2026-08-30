
/*
 * AdAccountsCountry.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_AdAccountsCountry_H_
#define TINY_CPP_CLIENT_AdAccountsCountry_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "Country.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class AdAccountsCountry{
public:

    /*! \brief Constructor.
	 */
    AdAccountsCountry();
    AdAccountsCountry(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AdAccountsCountry();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	Country getCode();

	/*! \brief Set 
	 */
	void setCode(Country code);
	/*! \brief Get Country currency.
	 */
	std::string getCurrency();

	/*! \brief Set Country currency.
	 */
	void setCurrency(std::string currency);
	/*! \brief Get Country index
	 */
	long getIndex();

	/*! \brief Set Country index
	 */
	void setIndex(long index);
	/*! \brief Get Country name
	 */
	std::string getName();

	/*! \brief Set Country name
	 */
	void setName(std::string name);


    private:
    Country code;
    std::string currency{};
    long index{};
    std::string name{};
};
}

#endif /* TINY_CPP_CLIENT_AdAccountsCountry_H_ */
