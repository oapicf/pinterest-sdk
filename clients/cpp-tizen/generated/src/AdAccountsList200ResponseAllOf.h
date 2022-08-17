/*
 * Ad_accounts_list_200_response_allOf.h
 *
 * 
 */

#ifndef _Ad_accounts_list_200_response_allOf_H_
#define _Ad_accounts_list_200_response_allOf_H_


#include <string>
#include "AdAccount.h"
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

class Ad_accounts_list_200_response_allOf : public Object {
public:
	/*! \brief Constructor.
	 */
	Ad_accounts_list_200_response_allOf();
	Ad_accounts_list_200_response_allOf(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Ad_accounts_list_200_response_allOf();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Ad accounts
	 */
	std::list<AdAccount> getItems();

	/*! \brief Set Ad accounts
	 */
	void setItems(std::list <AdAccount> items);

private:
	std::list <AdAccount>items;
	void __init();
	void __cleanup();

};
}
}

#endif /* _Ad_accounts_list_200_response_allOf_H_ */
