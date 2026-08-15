
/*
 * CustomerListUpdateRequest.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_CustomerListUpdateRequest_H_
#define TINY_CPP_CLIENT_CustomerListUpdateRequest_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "UserListOperationType.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class CustomerListUpdateRequest{
public:

    /*! \brief Constructor.
	 */
    CustomerListUpdateRequest();
    CustomerListUpdateRequest(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CustomerListUpdateRequest();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	UserListOperationType getOperationType();

	/*! \brief Set 
	 */
	void setOperationType(UserListOperationType  operation_type);
	/*! \brief Get Records list. Can be any combination of emails, MAIDs, or IDFAs. Emails must be lowercase and can be plain text or hashed using SHA1, SHA256, or MD5. MAIDs and IDFAs must be hashed with SHA1, SHA256, or MD5.
	 */
	std::string getRecords();

	/*! \brief Set Records list. Can be any combination of emails, MAIDs, or IDFAs. Emails must be lowercase and can be plain text or hashed using SHA1, SHA256, or MD5. MAIDs and IDFAs must be hashed with SHA1, SHA256, or MD5.
	 */
	void setRecords(std::string  records);


    private:
    UserListOperationType operation_type;
    std::string records{};
};
}

#endif /* TINY_CPP_CLIENT_CustomerListUpdateRequest_H_ */
