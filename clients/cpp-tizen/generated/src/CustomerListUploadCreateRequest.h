/*
 * CustomerListUploadCreateRequest.h
 *
 * 
 */

#ifndef _CustomerListUploadCreateRequest_H_
#define _CustomerListUploadCreateRequest_H_


#include <string>
#include "UserListOperationType.h"
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

class CustomerListUploadCreateRequest : public Object {
public:
	/*! \brief Constructor.
	 */
	CustomerListUploadCreateRequest();
	CustomerListUploadCreateRequest(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CustomerListUploadCreateRequest();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	UserListOperationType getOperation();

	/*! \brief Set 
	 */
	void setOperation(UserListOperationType  operation);
	/*! \brief Get Number of parts to upload the file in.
	 */
	int getTotalParts();

	/*! \brief Set Number of parts to upload the file in.
	 */
	void setTotalParts(int  total_parts);

private:
	UserListOperationType operation;
	int total_parts;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CustomerListUploadCreateRequest_H_ */
