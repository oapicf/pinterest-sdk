
/*
 * CatalogsFeedIngestionDetails.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_CatalogsFeedIngestionDetails_H_
#define TINY_CPP_CLIENT_CatalogsFeedIngestionDetails_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "CatalogsFeedIngestionErrors.h"
#include "CatalogsFeedIngestionInfo.h"
#include "CatalogsFeedIngestionWarnings.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class CatalogsFeedIngestionDetails{
public:

    /*! \brief Constructor.
	 */
    CatalogsFeedIngestionDetails();
    CatalogsFeedIngestionDetails(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CatalogsFeedIngestionDetails();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	CatalogsFeedIngestionErrors getErrors();

	/*! \brief Set 
	 */
	void setErrors(CatalogsFeedIngestionErrors errors);
	/*! \brief Get 
	 */
	CatalogsFeedIngestionInfo getInfo();

	/*! \brief Set 
	 */
	void setInfo(CatalogsFeedIngestionInfo info);
	/*! \brief Get 
	 */
	CatalogsFeedIngestionWarnings getWarnings();

	/*! \brief Set 
	 */
	void setWarnings(CatalogsFeedIngestionWarnings warnings);


    private:
    CatalogsFeedIngestionErrors errors;
    CatalogsFeedIngestionInfo info;
    CatalogsFeedIngestionWarnings warnings;
};
}

#endif /* TINY_CPP_CLIENT_CatalogsFeedIngestionDetails_H_ */
