
/*
 * ConversionDeletionRequestCreate.h
 *
 * Resource create operation model.
 */

#ifndef TINY_CPP_CLIENT_ConversionDeletionRequestCreate_H_
#define TINY_CPP_CLIENT_ConversionDeletionRequestCreate_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConversionDeletionRequestTargets.h"

namespace Tiny {


/*! \brief Resource create operation model.
 *
 *  \ingroup Models
 *
 */

class ConversionDeletionRequestCreate{
public:

    /*! \brief Constructor.
	 */
    ConversionDeletionRequestCreate();
    ConversionDeletionRequestCreate(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ConversionDeletionRequestCreate();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Object containing the targets of the conversion deletion request. Users can be identified with user_emails, epiks, or both within the same request.
	 */
	ConversionDeletionRequestTargets getDeletionTargets();

	/*! \brief Set Object containing the targets of the conversion deletion request. Users can be identified with user_emails, epiks, or both within the same request.
	 */
	void setDeletionTargets(ConversionDeletionRequestTargets deletion_targets);


    private:
    ConversionDeletionRequestTargets deletion_targets;
};
}

#endif /* TINY_CPP_CLIENT_ConversionDeletionRequestCreate_H_ */
