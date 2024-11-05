/*
 * AdvancedAuctionOperationError.h
 *
 * Error which occurred when applying a bid options operation to a specific item.
 */

#ifndef _AdvancedAuctionOperationError_H_
#define _AdvancedAuctionOperationError_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Error which occurred when applying a bid options operation to a specific item.
 *
 *  \ingroup Models
 *
 */

class AdvancedAuctionOperationError : public Object {
public:
	/*! \brief Constructor.
	 */
	AdvancedAuctionOperationError();
	AdvancedAuctionOperationError(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AdvancedAuctionOperationError();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The error code for the item bid option operation validation error
	 */
	int getCode();

	/*! \brief Set The error code for the item bid option operation validation error
	 */
	void setCode(int  code);
	/*! \brief Get Message describing the item bid option operation validation error
	 */
	std::string getMessage();

	/*! \brief Set Message describing the item bid option operation validation error
	 */
	void setMessage(std::string  message);

private:
	int code;
	std::string message;
	void __init();
	void __cleanup();

};
}
}

#endif /* _AdvancedAuctionOperationError_H_ */
