
/*
 * MediaUploadType.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_MediaUploadType_H_
#define TINY_CPP_CLIENT_MediaUploadType_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class MediaUploadType{
public:

    /*! \brief Constructor.
	 */
    MediaUploadType();
    MediaUploadType(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~MediaUploadType();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_MediaUploadType_H_ */
