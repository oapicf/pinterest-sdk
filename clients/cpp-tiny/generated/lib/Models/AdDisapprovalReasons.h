
/*
 * AdDisapprovalReasons.h
 *
 * ad disapproval reasons
 */

#ifndef TINY_CPP_CLIENT_AdDisapprovalReasons_H_
#define TINY_CPP_CLIENT_AdDisapprovalReasons_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief ad disapproval reasons
 *
 *  \ingroup Models
 *
 */

class AdDisapprovalReasons{
public:

    /*! \brief Constructor.
	 */
    AdDisapprovalReasons();
    AdDisapprovalReasons(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AdDisapprovalReasons();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_AdDisapprovalReasons_H_ */
