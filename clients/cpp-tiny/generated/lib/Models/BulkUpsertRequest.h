
/*
 * BulkUpsertRequest.h
 *
 * Two set of objects to be managed asyncronusly by bulk. One for creations, one for modifications.
 */

#ifndef TINY_CPP_CLIENT_BulkUpsertRequest_H_
#define TINY_CPP_CLIENT_BulkUpsertRequest_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "BulkUpsertRequestCreate.h"
#include "BulkUpsertRequestUpdate.h"

namespace Tiny {


/*! \brief Two set of objects to be managed asyncronusly by bulk. One for creations, one for modifications.
 *
 *  \ingroup Models
 *
 */

class BulkUpsertRequest{
public:

    /*! \brief Constructor.
	 */
    BulkUpsertRequest();
    BulkUpsertRequest(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~BulkUpsertRequest();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	BulkUpsertRequestCreate getCreate();

	/*! \brief Set 
	 */
	void setCreate(BulkUpsertRequestCreate create);
	/*! \brief Get 
	 */
	BulkUpsertRequestUpdate getUpdate();

	/*! \brief Set 
	 */
	void setUpdate(BulkUpsertRequestUpdate update);


    private:
    BulkUpsertRequestCreate create;
    BulkUpsertRequestUpdate update;
};
}

#endif /* TINY_CPP_CLIENT_BulkUpsertRequest_H_ */
