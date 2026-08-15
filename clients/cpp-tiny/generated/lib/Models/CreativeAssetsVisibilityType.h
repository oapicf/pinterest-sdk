
/*
 * CreativeAssetsVisibilityType.h
 *
 * Creative assets visibility.
 */

#ifndef TINY_CPP_CLIENT_CreativeAssetsVisibilityType_H_
#define TINY_CPP_CLIENT_CreativeAssetsVisibilityType_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Creative assets visibility.
 *
 *  \ingroup Models
 *
 */

class CreativeAssetsVisibilityType{
public:

    /*! \brief Constructor.
	 */
    CreativeAssetsVisibilityType();
    CreativeAssetsVisibilityType(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CreativeAssetsVisibilityType();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_CreativeAssetsVisibilityType_H_ */
