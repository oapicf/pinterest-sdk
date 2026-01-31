/*
 * S3MultipartUploadData.h
 *
 * 
 */

#ifndef _S3MultipartUploadData_H_
#define _S3MultipartUploadData_H_


#include <string>
#include "S3FilePart.h"
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

class S3MultipartUploadData : public Object {
public:
	/*! \brief Constructor.
	 */
	S3MultipartUploadData();
	S3MultipartUploadData(char* str);

	/*! \brief Destructor.
	 */
	virtual ~S3MultipartUploadData();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Array of file parts with pre-signed URLs.
	 */
	std::list<S3FilePart> getFileParts();

	/*! \brief Set Array of file parts with pre-signed URLs.
	 */
	void setFileParts(std::list <S3FilePart> file_parts);

private:
	std::list <S3FilePart>file_parts;
	void __init();
	void __cleanup();

};
}
}

#endif /* _S3MultipartUploadData_H_ */
