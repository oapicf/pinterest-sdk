/*
 * CustomerListUpdateRequest.h
 *
 * 
 */

#ifndef _CustomerListUpdateRequest_H_
#define _CustomerListUpdateRequest_H_


#include <string>
#include "Exception.h"
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

class CustomerListUpdateRequest : public Object {
public:
	/*! \brief Constructor.
	 */
	CustomerListUpdateRequest();
	CustomerListUpdateRequest(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CustomerListUpdateRequest();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Records list. Can be any combination of emails, MAIDs, or IDFAs. Emails must be lowercase and can be plain text or hashed using SHA1, SHA256, or MD5. MAIDs and IDFAs must be hashed with SHA1, SHA256, or MD5.
	 */
	std::string getRecords();

	/*! \brief Set Records list. Can be any combination of emails, MAIDs, or IDFAs. Emails must be lowercase and can be plain text or hashed using SHA1, SHA256, or MD5. MAIDs and IDFAs must be hashed with SHA1, SHA256, or MD5.
	 */
	void setRecords(std::string  records);
	/*! \brief Get 
	 */
	UserListOperationType getOperationType();

	/*! \brief Set 
	 */
	void setOperationType(UserListOperationType  operation_type);
	/*! \brief Get 
	 */
	Exception getExceptions();

	/*! \brief Set 
	 */
	void setExceptions(Exception  exceptions);

private:
	std::string records;
	UserListOperationType operation_type;
	Exception exceptions;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CustomerListUpdateRequest_H_ */
