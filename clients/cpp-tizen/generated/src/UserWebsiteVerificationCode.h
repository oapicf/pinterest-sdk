/*
 * UserWebsiteVerificationCode.h
 *
 * 
 */

#ifndef _UserWebsiteVerificationCode_H_
#define _UserWebsiteVerificationCode_H_


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

class UserWebsiteVerificationCode : public Object {
public:
	/*! \brief Constructor.
	 */
	UserWebsiteVerificationCode();
	UserWebsiteVerificationCode(char* str);

	/*! \brief Destructor.
	 */
	virtual ~UserWebsiteVerificationCode();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Code to check against the user claiming the website
	 */
	std::string getVerificationCode();

	/*! \brief Set Code to check against the user claiming the website
	 */
	void setVerificationCode(std::string  verification_code);
	/*! \brief Get DNS TXT record to check against for the website to be claimed
	 */
	std::string getDnsTxtRecord();

	/*! \brief Set DNS TXT record to check against for the website to be claimed
	 */
	void setDnsTxtRecord(std::string  dns_txt_record);
	/*! \brief Get Metatag the verification process searchs for the website to be claimed
	 */
	std::string getMetatag();

	/*! \brief Set Metatag the verification process searchs for the website to be claimed
	 */
	void setMetatag(std::string  metatag);
	/*! \brief Get File expected to find on the website being claimed
	 */
	std::string getFilename();

	/*! \brief Set File expected to find on the website being claimed
	 */
	void setFilename(std::string  filename);
	/*! \brief Get A full html file to upload to the website in order for it to be claimed
	 */
	std::string getFileContent();

	/*! \brief Set A full html file to upload to the website in order for it to be claimed
	 */
	void setFileContent(std::string  file_content);

private:
	std::string verification_code;
	std::string dns_txt_record;
	std::string metatag;
	std::string filename;
	std::string file_content;
	void __init();
	void __cleanup();

};
}
}

#endif /* _UserWebsiteVerificationCode_H_ */
