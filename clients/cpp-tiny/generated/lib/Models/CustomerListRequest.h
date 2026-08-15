
/*
 * CustomerListRequest.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_CustomerListRequest_H_
#define TINY_CPP_CLIENT_CustomerListRequest_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "UserListType.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class CustomerListRequest{
public:

    /*! \brief Constructor.
	 */
    CustomerListRequest();
    CustomerListRequest(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CustomerListRequest();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

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
    std::string name{};
    std::string records{};
};
}

#endif /* TINY_CPP_CLIENT_CustomerListRequest_H_ */
