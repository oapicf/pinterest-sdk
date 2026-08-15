
/*
 * BoardOwner.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_BoardOwner_H_
#define TINY_CPP_CLIENT_BoardOwner_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class BoardOwner{
public:

    /*! \brief Constructor.
	 */
    BoardOwner();
    BoardOwner(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~BoardOwner();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::string getUsername();

	/*! \brief Set 
	 */
	void setUsername(std::string  username);


    private:
    std::string username{};
};
}

#endif /* TINY_CPP_CLIENT_BoardOwner_H_ */
