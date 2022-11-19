/*
 * AdAccountsCountryResponse.h
 *
 * 
 */

#ifndef _AdAccountsCountryResponse_H_
#define _AdAccountsCountryResponse_H_


#include <string>
#include "AdAccountsCountryResponseData.h"
#include <list>
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

class AdAccountsCountryResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	AdAccountsCountryResponse();
	AdAccountsCountryResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AdAccountsCountryResponse();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::list<AdAccountsCountryResponseData> getItems();

	/*! \brief Set 
	 */
	void setItems(std::list <AdAccountsCountryResponseData> items);

private:
	std::list <AdAccountsCountryResponseData>items;
	void __init();
	void __cleanup();

};
}
}

#endif /* _AdAccountsCountryResponse_H_ */
