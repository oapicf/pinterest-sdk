
/*
 * DeletePartnerAssetAccessBody.h
 *
 * An object with a list of partner asset accesses to delete.
 */

#ifndef TINY_CPP_CLIENT_DeletePartnerAssetAccessBody_H_
#define TINY_CPP_CLIENT_DeletePartnerAssetAccessBody_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "DeletePartnerAssetAccessItem.h"
#include <list>

namespace Tiny {


/*! \brief An object with a list of partner asset accesses to delete.
 *
 *  \ingroup Models
 *
 */

class DeletePartnerAssetAccessBody{
public:

    /*! \brief Constructor.
	 */
    DeletePartnerAssetAccessBody();
    DeletePartnerAssetAccessBody(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~DeletePartnerAssetAccessBody();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get List of partner asset accesses to delete.
	 */
	std::list<DeletePartnerAssetAccessItem> getAccesses();

	/*! \brief Set List of partner asset accesses to delete.
	 */
	void setAccesses(std::list<DeletePartnerAssetAccessItem> accesses);


    private:
    std::list<DeletePartnerAssetAccessItem> accesses;
};
}

#endif /* TINY_CPP_CLIENT_DeletePartnerAssetAccessBody_H_ */
