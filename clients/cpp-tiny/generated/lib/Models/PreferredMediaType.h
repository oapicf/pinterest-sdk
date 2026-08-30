
/*
 * PreferredMediaType.h
 *
 * Select whether to promote the image or video pin by default for items in the promoted product group. If selecting IMAGE, image will be promoted for all ads in the product group, and when selecting VIDEO, video will be promoted when present, otherwise fall back to image. This is applicable for standard shopping ads only.
 */

#ifndef TINY_CPP_CLIENT_PreferredMediaType_H_
#define TINY_CPP_CLIENT_PreferredMediaType_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Select whether to promote the image or video pin by default for items in the promoted product group. If selecting IMAGE, image will be promoted for all ads in the product group, and when selecting VIDEO, video will be promoted when present, otherwise fall back to image. This is applicable for standard shopping ads only.
 *
 *  \ingroup Models
 *
 */

class PreferredMediaType{
public:

    /*! \brief Constructor.
	 */
    PreferredMediaType();
    PreferredMediaType(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~PreferredMediaType();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_PreferredMediaType_H_ */
