/*
 * BrandAccount.h
 *
 * 
 */

#ifndef _BrandAccount_H_
#define _BrandAccount_H_


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

class BrandAccount : public Object {
public:
	/*! \brief Constructor.
	 */
	BrandAccount();
	BrandAccount(char* str);

	/*! \brief Destructor.
	 */
	virtual ~BrandAccount();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::string getBrandAccountId();

	/*! \brief Set 
	 */
	void setBrandAccountId(std::string  brand_account_id);

private:
	std::string brand_account_id;
	void __init();
	void __cleanup();

};
}
}

#endif /* _BrandAccount_H_ */
