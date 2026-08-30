
/*
 * DeleteBusinessPartnersDelete.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_DeleteBusinessPartnersDelete_H_
#define TINY_CPP_CLIENT_DeleteBusinessPartnersDelete_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "NullablePartnerType.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class DeleteBusinessPartnersDelete{
public:

    /*! \brief Constructor.
	 */
    DeleteBusinessPartnersDelete();
    DeleteBusinessPartnersDelete(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~DeleteBusinessPartnersDelete();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get A list of partner ids to be deleted
	 */
	std::list<std::string> getPartnerIds();

	/*! \brief Set A list of partner ids to be deleted
	 */
	void setPartnerIds(std::list<std::string> partner_ids);
	/*! \brief Get 
	 */
	NullablePartnerType getPartnerType();

	/*! \brief Set 
	 */
	void setPartnerType(NullablePartnerType partner_type);


    private:
    std::list<std::string> partner_ids;
    NullablePartnerType partner_type;
};
}

#endif /* TINY_CPP_CLIENT_DeleteBusinessPartnersDelete_H_ */
