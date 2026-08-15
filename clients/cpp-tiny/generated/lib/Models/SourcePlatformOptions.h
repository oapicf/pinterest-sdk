
/*
 * SourcePlatformOptions.h
 *
 * List of source platforms for a conversion event.
 */

#ifndef TINY_CPP_CLIENT_SourcePlatformOptions_H_
#define TINY_CPP_CLIENT_SourcePlatformOptions_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief List of source platforms for a conversion event.
 *
 *  \ingroup Models
 *
 */

class SourcePlatformOptions{
public:

    /*! \brief Constructor.
	 */
    SourcePlatformOptions();
    SourcePlatformOptions(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~SourcePlatformOptions();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_SourcePlatformOptions_H_ */
