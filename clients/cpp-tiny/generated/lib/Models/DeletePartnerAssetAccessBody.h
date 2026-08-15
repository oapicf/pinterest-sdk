
/*
 * DeletePartnerAssetAccessBody.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_DeletePartnerAssetAccessBody_H_
#define TINY_CPP_CLIENT_DeletePartnerAssetAccessBody_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "DeletePartnerAssetAccessBody_accesses_inner.h"
#include <list>

namespace Tiny {


/*! \brief 
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

	/*! \brief Get 
	 */
	std::list<DeletePartnerAssetAccessBody_accesses_inner> getAccesses();

	/*! \brief Set 
	 */
	void setAccesses(std::list <DeletePartnerAssetAccessBody_accesses_inner> accesses);


    private:
    std::list<DeletePartnerAssetAccessBody_accesses_inner> accesses;
};
}

#endif /* TINY_CPP_CLIENT_DeletePartnerAssetAccessBody_H_ */
