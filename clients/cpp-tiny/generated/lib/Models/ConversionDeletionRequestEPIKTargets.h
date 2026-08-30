
/*
 * ConversionDeletionRequestEPIKTargets.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ConversionDeletionRequestEPIKTargets_H_
#define TINY_CPP_CLIENT_ConversionDeletionRequestEPIKTargets_H_


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

class ConversionDeletionRequestEPIKTargets{
public:

    /*! \brief Constructor.
	 */
    ConversionDeletionRequestEPIKTargets();
    ConversionDeletionRequestEPIKTargets(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ConversionDeletionRequestEPIKTargets();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Array of EPIKs (Encrypted Pinterest ID Keys). An EPIK is a user match type that utilizes 3P browser localStorage (similar to a third-party cookie).
	 */
	std::list<std::string> getEpiks();

	/*! \brief Set Array of EPIKs (Encrypted Pinterest ID Keys). An EPIK is a user match type that utilizes 3P browser localStorage (similar to a third-party cookie).
	 */
	void setEpiks(std::list<std::string> epiks);


    private:
    std::list<std::string> epiks;
};
}

#endif /* TINY_CPP_CLIENT_ConversionDeletionRequestEPIKTargets_H_ */
