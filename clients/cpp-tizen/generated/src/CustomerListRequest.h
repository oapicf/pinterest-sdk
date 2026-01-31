/*
 * CustomerListRequest.h
 *
 * 
 */

#ifndef _CustomerListRequest_H_
#define _CustomerListRequest_H_


#include <string>
#include "UserListType.h"
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

class CustomerListRequest : public Object {
public:
	/*! \brief Constructor.
	 */
	CustomerListRequest();
	CustomerListRequest(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CustomerListRequest();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	UserListType getListType();

	/*! \brief Set 
	 */
	void setListType(UserListType  list_type);
	/*! \brief Get Customer list name.
	 */
	std::string getName();

	/*! \brief Set Customer list name.
	 */
	void setName(std::string  name);
	/*! \brief Get Records list. Can be any combination of emails, MAIDs, or IDFAs. Emails must be lowercase and can be plain text or hashed using SHA1, SHA256, or MD5. MAIDs and IDFAs must be hashed with SHA1, SHA256, or MD5.
	 */
	std::string getRecords();

	/*! \brief Set Records list. Can be any combination of emails, MAIDs, or IDFAs. Emails must be lowercase and can be plain text or hashed using SHA1, SHA256, or MD5. MAIDs and IDFAs must be hashed with SHA1, SHA256, or MD5.
	 */
	void setRecords(std::string  records);

private:
	UserListType list_type;
	std::string name;
	std::string records;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CustomerListRequest_H_ */
