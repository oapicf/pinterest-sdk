
/*
 * BoardPrivacy.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_BoardPrivacy_H_
#define TINY_CPP_CLIENT_BoardPrivacy_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class BoardPrivacy{
public:

    /*! \brief Constructor.
	 */
    BoardPrivacy();
    BoardPrivacy(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~BoardPrivacy();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_BoardPrivacy_H_ */
