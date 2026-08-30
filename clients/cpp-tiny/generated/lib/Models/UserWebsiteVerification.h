
/*
 * UserWebsiteVerification.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_UserWebsiteVerification_H_
#define TINY_CPP_CLIENT_UserWebsiteVerification_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class UserWebsiteVerification{
public:

    /*! \brief Constructor.
	 */
    UserWebsiteVerification();
    UserWebsiteVerification(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~UserWebsiteVerification();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get DNS TXT record to check against for the website to be claimed
	 */
	std::string getDnsTxtRecord();

	/*! \brief Set DNS TXT record to check against for the website to be claimed
	 */
	void setDnsTxtRecord(std::string dns_txt_record);
	/*! \brief Get A full html file to upload to the website in order for it to be claimed
	 */
	std::string getFileContent();

	/*! \brief Set A full html file to upload to the website in order for it to be claimed
	 */
	void setFileContent(std::string file_content);
	/*! \brief Get File expected to find on the website being claimed
	 */
	std::string getFilename();

	/*! \brief Set File expected to find on the website being claimed
	 */
	void setFilename(std::string filename);
	/*! \brief Get Metatag the verification process searchs for the website to be claimed
	 */
	std::string getMetatag();

	/*! \brief Set Metatag the verification process searchs for the website to be claimed
	 */
	void setMetatag(std::string metatag);
	/*! \brief Get Code to check against the user claiming the website
	 */
	std::string getVerificationCode();

	/*! \brief Set Code to check against the user claiming the website
	 */
	void setVerificationCode(std::string verification_code);


    private:
    std::string dns_txt_record{};
    std::string file_content{};
    std::string filename{};
    std::string metatag{};
    std::string verification_code{};
};
}

#endif /* TINY_CPP_CLIENT_UserWebsiteVerification_H_ */
