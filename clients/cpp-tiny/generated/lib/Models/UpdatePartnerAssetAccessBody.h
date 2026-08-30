
/*
 * UpdatePartnerAssetAccessBody.h
 *
 * An object with a list of partner asset accesses to assign or update.
 */

#ifndef TINY_CPP_CLIENT_UpdatePartnerAssetAccessBody_H_
#define TINY_CPP_CLIENT_UpdatePartnerAssetAccessBody_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "UpdatePartnerAssetAccessItem.h"
#include <list>

namespace Tiny {


/*! \brief An object with a list of partner asset accesses to assign or update.
 *
 *  \ingroup Models
 *
 */

class UpdatePartnerAssetAccessBody{
public:

    /*! \brief Constructor.
	 */
    UpdatePartnerAssetAccessBody();
    UpdatePartnerAssetAccessBody(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~UpdatePartnerAssetAccessBody();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get List of partner asset accesses to assign or update.
	 */
	std::list<UpdatePartnerAssetAccessItem> getAccesses();

	/*! \brief Set List of partner asset accesses to assign or update.
	 */
	void setAccesses(std::list<UpdatePartnerAssetAccessItem> accesses);


    private:
    std::list<UpdatePartnerAssetAccessItem> accesses;
};
}

#endif /* TINY_CPP_CLIENT_UpdatePartnerAssetAccessBody_H_ */
