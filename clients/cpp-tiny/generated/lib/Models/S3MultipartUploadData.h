
/*
 * S3MultipartUploadData.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_S3MultipartUploadData_H_
#define TINY_CPP_CLIENT_S3MultipartUploadData_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "S3FilePart.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class S3MultipartUploadData{
public:

    /*! \brief Constructor.
	 */
    S3MultipartUploadData();
    S3MultipartUploadData(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~S3MultipartUploadData();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Array of file parts with pre-signed URLs.
	 */
	std::list<S3FilePart> getFileParts();

	/*! \brief Set Array of file parts with pre-signed URLs.
	 */
	void setFileParts(std::list <S3FilePart> file_parts);


    private:
    std::list<S3FilePart> file_parts;
};
}

#endif /* TINY_CPP_CLIENT_S3MultipartUploadData_H_ */
