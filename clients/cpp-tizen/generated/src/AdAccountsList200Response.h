/*
 * Ad_accounts_list_200_response.h
 *
 * 
 */

#ifndef _Ad_accounts_list_200_response_H_
#define _Ad_accounts_list_200_response_H_


#include <string>
#include "AdAccount.h"
#include "Ad_accounts_list_200_response_allOf.h"
#include "Paginated.h"
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

class Ad_accounts_list_200_response : public Object {
public:
	/*! \brief Constructor.
	 */
	Ad_accounts_list_200_response();
	Ad_accounts_list_200_response(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Ad_accounts_list_200_response();

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
	/*! \brief Get 
	 */
	std::string getBookmark();

	/*! \brief Set 
	 */
	void setBookmark(std::string  bookmark);

private:
	std::list <AdAccount>items;
	std::string bookmark;
	void __init();
	void __cleanup();

};
}
}

#endif /* _Ad_accounts_list_200_response_H_ */
