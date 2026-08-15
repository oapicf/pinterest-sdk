
/*
 * BoardPrivacyFilter.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_BoardPrivacyFilter_H_
#define TINY_CPP_CLIENT_BoardPrivacyFilter_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class BoardPrivacyFilter{
public:

    /*! \brief Constructor.
	 */
    BoardPrivacyFilter();
    BoardPrivacyFilter(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~BoardPrivacyFilter();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_BoardPrivacyFilter_H_ */
