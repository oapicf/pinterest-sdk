
/*
 * AdeColumnType.h
 *
 * Metrics for custom defined conversion event.
 */

#ifndef TINY_CPP_CLIENT_AdeColumnType_H_
#define TINY_CPP_CLIENT_AdeColumnType_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Metrics for custom defined conversion event.
 *
 *  \ingroup Models
 *
 */

class AdeColumnType{
public:

    /*! \brief Constructor.
	 */
    AdeColumnType();
    AdeColumnType(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AdeColumnType();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_AdeColumnType_H_ */
