/*
 * Brand_accounts_create_200_response.h
 *
 * 
 */

#ifndef _Brand_accounts_create_200_response_H_
#define _Brand_accounts_create_200_response_H_


#include <string>
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

class Brand_accounts_create_200_response : public Object {
public:
	/*! \brief Constructor.
	 */
	Brand_accounts_create_200_response();
	Brand_accounts_create_200_response(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Brand_accounts_create_200_response();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get id of the newly created brand account
	 */
	std::string getBrandAccountId();

	/*! \brief Set id of the newly created brand account
	 */
	void setBrandAccountId(std::string  brand_account_id);

private:
	std::string brand_account_id;
	void __init();
	void __cleanup();

};
}
}

#endif /* _Brand_accounts_create_200_response_H_ */
