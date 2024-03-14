/*
 * AdAccountsCountryResponseData.h
 *
 * 
 */

#ifndef _AdAccountsCountryResponseData_H_
#define _AdAccountsCountryResponseData_H_


#include <string>
#include "Country.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class AdAccountsCountryResponseData : public Object {
public:
	/*! \brief Constructor.
	 */
	AdAccountsCountryResponseData();
	AdAccountsCountryResponseData(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AdAccountsCountryResponseData();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	Country getCode();

	/*! \brief Set 
	 */
	void setCode(Country  code);
	/*! \brief Get Country currency.
	 */
	std::string getCurrency();

	/*! \brief Set Country currency.
	 */
	void setCurrency(std::string  currency);
	/*! \brief Get Country index
	 */
	long long getIndex();

	/*! \brief Set Country index
	 */
	void setIndex(long long  index);
	/*! \brief Get Country name
	 */
	std::string getName();

	/*! \brief Set Country name
	 */
	void setName(std::string  name);

private:
	Country code;
	std::string currency;
	long long index;
	std::string name;
	void __init();
	void __cleanup();

};
}
}

#endif /* _AdAccountsCountryResponseData_H_ */
