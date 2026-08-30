
/*
 * DeleteBusinessPartners.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_DeleteBusinessPartners_H_
#define TINY_CPP_CLIENT_DeleteBusinessPartners_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class DeleteBusinessPartners{
public:

    /*! \brief Constructor.
	 */
    DeleteBusinessPartners();
    DeleteBusinessPartners(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~DeleteBusinessPartners();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::list<std::string> getDeletedPartners();

	/*! \brief Set 
	 */
	void setDeletedPartners(std::list<std::string> deleted_partners);


    private:
    std::list<std::string> deleted_partners;
};
}

#endif /* TINY_CPP_CLIENT_DeleteBusinessPartners_H_ */
