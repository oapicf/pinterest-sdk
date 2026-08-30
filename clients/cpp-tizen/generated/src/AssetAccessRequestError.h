/*
 * AssetAccessRequestError.h
 *
 * 
 */

#ifndef _AssetAccessRequestError_H_
#define _AssetAccessRequestError_H_


#include <string>
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

class AssetAccessRequestError : public Object {
public:
	/*! \brief Constructor.
	 */
	AssetAccessRequestError();
	AssetAccessRequestError(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AssetAccessRequestError();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Error code associated with the error in requesting asset access.
	 */
	int getCode();

	/*! \brief Set Error code associated with the error in requesting asset access.
	 */
	void setCode(int  code);
	/*! \brief Get 
	 */
	std::list<std::string> getMessages();

	/*! \brief Set 
	 */
	void setMessages(std::list <std::string> messages);

private:
	int code;
	std::list <std::string>messages;
	void __init();
	void __cleanup();

};
}
}

#endif /* _AssetAccessRequestError_H_ */
