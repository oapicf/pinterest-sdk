/*
 * CreateAssetAccessRequestResponse.h
 *
 * 
 */

#ifndef _CreateAssetAccessRequestResponse_H_
#define _CreateAssetAccessRequestResponse_H_


#include <string>
#include "CreateAssetAccessRequestErrorMessage_inner.h"
#include <list>
#include <map>
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

class CreateAssetAccessRequestResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	CreateAssetAccessRequestResponse();
	CreateAssetAccessRequestResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CreateAssetAccessRequestResponse();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get A list of errors associated with the asset access requests. Will be returned if there is an error.
	 */
	std::list<CreateAssetAccessRequestErrorMessage_inner> getExceptions();

	/*! \brief Set A list of errors associated with the asset access requests. Will be returned if there is an error.
	 */
	void setExceptions(std::list <CreateAssetAccessRequestErrorMessage_inner> exceptions);
	/*! \brief Get 
	 */
	std::map<std::string, std::string> getInvites();

	/*! \brief Set 
	 */
	void setInvites(std::map <std::string, std::string> invites);

private:
	std::list <CreateAssetAccessRequestErrorMessage_inner>exceptions;
	std::map <std::string, std::string>invites;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CreateAssetAccessRequestResponse_H_ */
