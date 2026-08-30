
/*
 * ConversionHealthSelectionItem.h
 *
 * User selection of conversion health criteria for a single feature
 */

#ifndef TINY_CPP_CLIENT_ConversionHealthSelectionItem_H_
#define TINY_CPP_CLIENT_ConversionHealthSelectionItem_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "AnyType.h"
#include "Object.h"

namespace Tiny {


/*! \brief User selection of conversion health criteria for a single feature
 *
 *  \ingroup Models
 *
 */

class ConversionHealthSelectionItem{
public:

    /*! \brief Constructor.
	 */
    ConversionHealthSelectionItem();
    ConversionHealthSelectionItem(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ConversionHealthSelectionItem();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Status for conversion types
	 */
	Object getConversionType();

	/*! \brief Set Status for conversion types
	 */
	void setConversionType(Object conversionType);
	/*! \brief Get Status for criteria
	 */
	Object getCriteria();

	/*! \brief Set Status for criteria
	 */
	void setCriteria(Object criteria);
	/*! \brief Get Status for ingestion sources
	 */
	Object getIngestionSource();

	/*! \brief Set Status for ingestion sources
	 */
	void setIngestionSource(Object ingestionSource);
	/*! \brief Get Overall status for this selection item
	 */
	AnyType getStatus();

	/*! \brief Set Overall status for this selection item
	 */
	void setStatus(AnyType status);


    private:
    Object conversionType;
    Object criteria;
    Object ingestionSource;
    AnyType status;
};
}

#endif /* TINY_CPP_CLIENT_ConversionHealthSelectionItem_H_ */
