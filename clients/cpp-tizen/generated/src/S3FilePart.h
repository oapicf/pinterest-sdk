/*
 * S3FilePart.h
 *
 * 
 */

#ifndef _S3FilePart_H_
#define _S3FilePart_H_


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

class S3FilePart : public Object {
public:
	/*! \brief Constructor.
	 */
	S3FilePart();
	S3FilePart(char* str);

	/*! \brief Destructor.
	 */
	virtual ~S3FilePart();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Part number for upload.
	 */
	int getPartNumber();

	/*! \brief Set Part number for upload.
	 */
	void setPartNumber(int  part_number);
	/*! \brief Get Pre-signed URL.
	 */
	std::string getPresignedUrl();

	/*! \brief Set Pre-signed URL.
	 */
	void setPresignedUrl(std::string  presigned_url);

private:
	int part_number;
	std::string presigned_url;
	void __init();
	void __cleanup();

};
}
}

#endif /* _S3FilePart_H_ */
